package com.giderosmobile.android.player;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Environment;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Selection;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.giderosmobile.android.GiderosSettings;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class GiderosApplication {
    private static final int PAUSE = 0;
    private static final int RESUME = 1;
    private static final int START = 3;
    private static final int STOP = 2;
    static int currentAngle = -1;
    private static GiderosApplication instance_ = null;
    private static SurfaceView mGLView_ = null;
    static boolean onDemandEnabled = false;
    static OrientationEventListener orientationEventListener = null;
    static String tisActionLabel = "";
    static String tisBuffer = "";
    static String tisContext = "";
    static Editable tisEditable = null;
    static String tisHint = "";
    static int tisInitCapsMode = 0;
    static String tisLabel = "";
    static int tisSelEnd = -1;
    static int tisSelStart = -1;
    static int tisToken = -1;
    static int tisType;
    private Accelerometer accelerometer_;
    String cacheDir_;
    String externalDir_;
    private Geolocation geolocation_;
    private Gyroscope gyroscope_;
    String internalDir_;
    public ZipResourceFile mainFile;
    private GGMediaPlayerManager mediaPlayerManager_;
    public ZipResourceFile patchFile;
    private ListView projectList;
    public Object lock = new Object();
    private boolean isAccelerometerStarted_ = false;
    private boolean isGyroscopeStarted_ = false;
    private boolean isLocationStarted_ = false;
    private boolean isHeadingStarted_ = false;
    private boolean isForeground_ = false;
    private boolean isSurfaceCreated_ = false;
    private ArrayList<Integer> eventQueue_ = new ArrayList<>();
    private ArrayList<Class<?>> sAvailableClasses = new ArrayList<>();
    private String allfiles_ = null;
    private boolean needRender = false;
    private Runnable onDemandRender = null;
    private long startTime = System.nanoTime();
    int fps_ = 60;

    private static native boolean isRunning();

    private static native void nativeCreate(boolean z, Activity activity);

    private static native void nativeDestroy();

    private static native void nativeDrawFrame(boolean z);

    private static native void nativeHandleOpenUrl(String str);

    private static native void nativeKeyChar(String str);

    private static native boolean nativeKeyDown(int i, int i2);

    private static native boolean nativeKeyUp(int i, int i2);

    private static native void nativeLowMemory();

    private static native void nativeMouseWheel(int i, int i2, int i3, float f);

    private static native void nativeOpenALSetup(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOpenProject(String str);

    private static native void nativeOrientationChanged(int i);

    private static native void nativePause();

    private static native void nativeRequestPermissionsResult(String[] strArr, int[] iArr);

    private static native void nativeResume();

    private static native void nativeSetDirectories(String str, String str2, String str3);

    private static native void nativeSetFileSystem(String str);

    private static native void nativeStart();

    private static native void nativeStop();

    private static native void nativeSurfaceChanged(int i, int i2, int i3, Surface surface);

    private static native void nativeSurfaceCreated(Surface surface);

    private static native void nativeSurfaceDestroyed();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeTextInput(String str, int i, int i2, String str2);

    private static native void nativeTick();

    private static native void nativeTouchesBegin(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr, int i2);

    private static native void nativeTouchesCancel(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr);

    private static native void nativeTouchesEnd(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr, int i2);

    private static native void nativeTouchesMove(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr);

    private static native void oculusPause();

    public static native void oculusPostCreate();

    private static native void oculusResume();

    public static native void oculusRunThread();

    private static native void oculusStart();

    private static native void oculusStop();

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public static GiderosApplication getInstance() {
        return instance_;
    }

    private static Class<?> findClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object executeMethod(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public GiderosApplication(String[] strArr) {
        int i;
        Class<?> findClass;
        for (String str : strArr) {
            if (str != null && (findClass = findClass(str)) != null) {
                this.sAvailableClasses.add(findClass);
            }
        }
        this.accelerometer_ = new Accelerometer();
        this.gyroscope_ = new Gyroscope();
        this.geolocation_ = new Geolocation();
        populateAllFiles();
        getDirectories();
        this.mediaPlayerManager_ = new GGMediaPlayerManager(this.mainFile, this.patchFile);
        Activity activity = WeakActivityHolder.get();
        try {
            i = Integer.parseInt(((AudioManager) activity.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (Exception unused) {
            i = 0;
        }
        nativeOpenALSetup(i == 0 ? 44100 : i);
        synchronized (this.lock) {
            nativeCreate(this.allfiles_ == null, activity);
            nativeSetDirectories(this.externalDir_, this.internalDir_, this.cacheDir_);
            String str2 = this.allfiles_;
            if (str2 != null) {
                nativeSetFileSystem(str2);
            }
        }
        loadLpkPlugins();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00cc A[Catch: Error -> 0x0184, IOException -> 0x0189, TRY_LEAVE, TryCatch #10 {IOException -> 0x0189, Error -> 0x0184, blocks: (B:3:0x0010, B:5:0x0028, B:50:0x0073, B:54:0x00a3, B:56:0x00a9, B:58:0x00ad, B:8:0x00c6, B:10:0x00cc, B:12:0x00e4, B:14:0x00fe, B:16:0x011f, B:19:0x0128, B:28:0x015a, B:31:0x0165, B:34:0x016c, B:24:0x0175, B:61:0x00bb), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLpkPlugins() {
        String str;
        String str2;
        Class<?>[] clsArr;
        String str3 = ".dex";
        String str4 = "dex";
        Activity activity = WeakActivityHolder.get();
        AssetManager assets = activity.getAssets();
        try {
            String[] list = assets.list("dex");
            String str5 = activity.getApplicationContext().getApplicationInfo().nativeLibraryDir;
            Log.v("LPK", "Looking for LPK plugins");
            int length = list.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String str6 = list[i2];
                String substring = str6.substring(i, str6.indexOf("."));
                Log.v("LPK", "Found " + str6 + " (" + substring + ")");
                File dir = activity.getDir(str4, i);
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append(str3);
                File file = new File(dir, sb.toString());
                if (file.exists()) {
                    str = str3;
                    str2 = str4;
                } else {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assets.open("dex/" + substring + str3));
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[8192];
                        str = str3;
                        str2 = str4;
                        while (true) {
                            try {
                                int read = bufferedInputStream.read(bArr, 0, 8192);
                                if (read <= 0) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                file.delete();
                                if (file.exists()) {
                                }
                                i2++;
                                str3 = str;
                                str4 = str2;
                                i = 0;
                            }
                        }
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        str = str3;
                        str2 = str4;
                    }
                }
                if (file.exists()) {
                    try {
                        Class loadClass = new DexClassLoader(file.getAbsolutePath(), activity.getDir("optdex", 0).getAbsolutePath(), str5, activity.getClassLoader()).loadClass("com.giderosmobile.android.plugins." + substring + ".Loader");
                        try {
                            loadClass.newInstance();
                            Log.v("LPK", "Loaded " + substring + " :" + loadClass.getName());
                            try {
                                clsArr = new Class[1];
                            } catch (NoSuchMethodException unused) {
                            } catch (Exception e3) {
                                e = e3;
                            }
                            try {
                                try {
                                    try {
                                        clsArr[0] = Activity.class;
                                        loadClass.getMethod("onLoad", clsArr).invoke(null, activity);
                                        Log.v("LPK", "Initialized " + substring + " :" + loadClass.getName());
                                    } catch (ClassNotFoundException e4) {
                                        e = e4;
                                        e.printStackTrace();
                                        i2++;
                                        str3 = str;
                                        str4 = str2;
                                        i = 0;
                                    }
                                } catch (NoSuchMethodException unused2) {
                                } catch (Exception e5) {
                                    e = e5;
                                    e.printStackTrace();
                                }
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                e.printStackTrace();
                                i2++;
                                str3 = str;
                                str4 = str2;
                                i = 0;
                            } catch (InstantiationException e7) {
                                e = e7;
                                e.printStackTrace();
                                i2++;
                                str3 = str;
                                str4 = str2;
                                i = 0;
                            }
                        } catch (IllegalAccessException e8) {
                            e = e8;
                        } catch (InstantiationException e9) {
                            e = e9;
                        }
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                    }
                    i2++;
                    str3 = str;
                    str4 = str2;
                    i = 0;
                }
                i2++;
                str3 = str;
                str4 = str2;
                i = 0;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (Error e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void populateAllFiles() {
        String str;
        String str2;
        int i;
        String str3;
        AssetFileDescriptor assetFileDescriptor;
        int i2;
        ZipResourceFile zipResourceFile;
        this.allfiles_ = null;
        AssetManager assets = WeakActivityHolder.get().getAssets();
        ArrayList arrayList = new ArrayList();
        try {
            InputStream open = assets.open("assets/allfiles.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else {
                    arrayList.add(readLine);
                }
            }
            open.close();
            StringBuilder sb = new StringBuilder();
            sb.append(WeakActivityHolder.get().getApplicationInfo().sourceDir);
            sb.append("|");
            arrayList.add("properties.bin*");
            arrayList.add("luafiles.txt*");
            this.mainFile = null;
            this.patchFile = null;
            if (Environment.getExternalStorageState().equals("mounted")) {
                Activity activity = WeakActivityHolder.get();
                String packageName = activity.getPackageName();
                String str4 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + packageName;
                int i3 = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionCode;
                str2 = str4 + "/main." + i3 + "." + packageName + ".obb";
                try {
                    if (new File(str2).isFile()) {
                        this.mainFile = new ZipResourceFile(str2);
                    }
                    str = str4 + "/patch." + i3 + "." + packageName + ".obb";
                    try {
                        if (new File(str).isFile()) {
                            this.patchFile = new ZipResourceFile(str);
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str = null;
                }
                if (this.mainFile != null) {
                    sb.append(str2);
                }
                sb.append("|");
                if (this.patchFile != null) {
                    sb.append(str);
                }
                sb.append("|");
                i = 0;
                while (true) {
                    int i4 = 1;
                    if (i >= arrayList.size()) {
                        String str5 = (String) arrayList.get(i);
                        if (!str5.endsWith("*")) {
                            str3 = "";
                        } else {
                            str5 = str5.substring(0, str5.length() - 1);
                            str3 = ".jet";
                        }
                        try {
                            ZipResourceFile zipResourceFile2 = this.patchFile;
                            if (zipResourceFile2 != null) {
                                assetFileDescriptor = zipResourceFile2.getAssetFileDescriptor(str5 + str3);
                                i2 = 2;
                            } else {
                                assetFileDescriptor = null;
                                i2 = 0;
                            }
                            if (assetFileDescriptor != null || (zipResourceFile = this.mainFile) == null) {
                                i4 = i2;
                            } else {
                                assetFileDescriptor = zipResourceFile.getAssetFileDescriptor(str5 + str3);
                            }
                            if (assetFileDescriptor == null) {
                                assetFileDescriptor = assets.openFd("assets/" + str5 + str3);
                                i4 = 0;
                            }
                            if (assetFileDescriptor != null) {
                                sb.append(str5);
                                sb.append("|");
                                sb.append(i4);
                                sb.append("|");
                                sb.append(assetFileDescriptor.getStartOffset());
                                sb.append("|");
                                sb.append(assetFileDescriptor.getLength());
                                sb.append("|");
                                assetFileDescriptor.close();
                            }
                        } catch (IOException e) {
                            Logger.log(e.toString());
                        }
                        i++;
                    } else {
                        sb.deleteCharAt(sb.length() - 1);
                        this.allfiles_ = sb.toString();
                        return;
                    }
                }
            }
            str = null;
            str2 = null;
            if (this.mainFile != null) {
            }
            sb.append("|");
            if (this.patchFile != null) {
            }
            sb.append("|");
            i = 0;
            while (true) {
                int i42 = 1;
                if (i >= arrayList.size()) {
                }
                i++;
            }
        } catch (IOException unused3) {
            loadProjects();
            Logger.log("player mode");
        }
    }

    private void getDirectories() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState)) {
            "mounted_ro".equals(externalStorageState);
        }
        File externalFilesDir = WeakActivityHolder.get().getExternalFilesDir(null);
        String absolutePath = WeakActivityHolder.get().getFilesDir().getAbsolutePath();
        this.internalDir_ = absolutePath;
        if (externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
        }
        this.externalDir_ = absolutePath;
        this.cacheDir_ = WeakActivityHolder.get().getCacheDir().getAbsolutePath();
        Logger.log("externalDir: " + this.externalDir_);
        Logger.log("internalDir: " + this.internalDir_);
        Logger.log("cacheDir: " + this.cacheDir_);
    }

    private void loadProjects() {
        this.projectList = new ListView(WeakActivityHolder.get());
        TextView textView = new TextView(WeakActivityHolder.get());
        textView.setText("Gideros Projects");
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setTextSize(25.0f);
        textView.setBackgroundColor(-1);
        this.projectList.addHeaderView(textView);
        this.projectList.setAdapter((ListAdapter) new ArrayAdapter<String>(WeakActivityHolder.get(), android.R.layout.simple_list_item_1, android.R.id.text1, traverse(new File(WeakActivityHolder.get().getExternalFilesDir(null), "gideros"))) { // from class: com.giderosmobile.android.player.GiderosApplication.1
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView2 = (TextView) view2.findViewById(android.R.id.text1);
                textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                textView2.setBackgroundColor(-1);
                return view2;
            }
        });
        this.projectList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.giderosmobile.android.player.GiderosApplication.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                if (textView2 != null) {
                    GiderosApplication.this.projectList.setVisibility(8);
                    GiderosApplication.nativeOpenProject((String) textView2.getText());
                }
            }
        });
        this.projectList.setVisibility(8);
        ((FrameLayout) WeakActivityHolder.get().getWindow().getDecorView()).addView(this.projectList);
    }

    public List<String> traverse(File file) {
        File[] listFiles;
        Logger.log("Checking: " + file.getAbsolutePath());
        ArrayList arrayList = new ArrayList();
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    Logger.log("Found: " + file2.getName());
                    arrayList.add(file2.getName());
                }
            }
        }
        return arrayList;
    }

    public void enableOnDemand(boolean z) {
        if (z && this.onDemandRender == null) {
            Runnable runnable = new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.3
                @Override // java.lang.Runnable
                public void run() {
                    GiderosApplication.this.onDrawFrame(true);
                    if (GiderosApplication.this.onDemandRender != null) {
                        if (GiderosApplication.this.needRender) {
                            ((GLSurfaceView) GiderosApplication.mGLView_).requestRender();
                            GiderosApplication.this.needRender = false;
                        } else {
                            ((GLSurfaceView) GiderosApplication.mGLView_).queueEvent(this);
                        }
                    }
                }
            };
            this.onDemandRender = runnable;
            ((GLSurfaceView) mGLView_).queueEvent(runnable);
            ((GLSurfaceView) mGLView_).setRenderMode(0);
            return;
        }
        if (z || this.onDemandRender == null) {
            return;
        }
        this.onDemandRender = null;
        ((GLSurfaceView) mGLView_).setRenderMode(1);
    }

    public void requestDraw() {
        this.needRender = true;
    }

    public static void onCreate(String[] strArr, SurfaceView surfaceView) {
        mGLView_ = surfaceView;
        instance_ = new GiderosApplication(strArr);
        setKeyboardVisibility(false);
        Iterator<Class<?>> it = instance_.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onCreate", new Class[]{Activity.class}, new Object[]{WeakActivityHolder.get()});
        }
        WeakActivityHolder.get();
    }

    public static int[] getSafeArea() {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int[] iArr = new int[4];
        if (GiderosSettings.notchReady && Build.VERSION.SDK_INT >= 28) {
            rootWindowInsets = mGLView_.getRootWindowInsets();
            displayCutout = rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                iArr[0] = safeInsetLeft;
                safeInsetRight = displayCutout.getSafeInsetRight();
                iArr[1] = safeInsetRight;
                safeInsetTop = displayCutout.getSafeInsetTop();
                iArr[2] = safeInsetTop;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                iArr[3] = safeInsetBottom;
            }
        }
        return iArr;
    }

    public static void onDestroy() {
        Iterator<Class<?>> it = instance_.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onDestroy", new Class[0], new Object[0]);
        }
        synchronized (instance_.lock) {
            nativeDestroy();
        }
        instance_ = null;
    }

    public void onStart() {
        oculusStart();
        if (this.isSurfaceCreated_) {
            synchronized (this.eventQueue_) {
                this.eventQueue_.add(3);
            }
        }
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onStart", new Class[0], new Object[0]);
        }
    }

    public void onRestart() {
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onRestart", new Class[0], new Object[0]);
        }
    }

    public void onStop() {
        oculusStop();
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onStop", new Class[0], new Object[0]);
        }
        if (this.isSurfaceCreated_) {
            synchronized (this.eventQueue_) {
                nativeStop();
                nativeTick();
            }
        }
    }

    public void onPause() {
        OrientationEventListener orientationEventListener2 = orientationEventListener;
        if (orientationEventListener2 != null) {
            orientationEventListener2.disable();
        }
        if (onDemandEnabled) {
            enableOnDemand(false);
        }
        oculusPause();
        this.isForeground_ = false;
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onPause", new Class[0], new Object[0]);
        }
        if (this.isSurfaceCreated_) {
            synchronized (this.eventQueue_) {
                nativePause();
                nativeTick();
            }
        }
        this.accelerometer_.disable();
        this.gyroscope_.disable();
        if (!GiderosSettings.backgroundLocation) {
            this.geolocation_.stopUpdatingLocation();
            this.geolocation_.stopUpdatingHeading();
        }
        this.mediaPlayerManager_.onPause();
    }

    public void onResume() {
        oculusResume();
        this.isForeground_ = true;
        if (this.isAccelerometerStarted_) {
            this.accelerometer_.enable();
        }
        if (this.isGyroscopeStarted_) {
            this.gyroscope_.enable();
        }
        if (!GiderosSettings.backgroundLocation) {
            if (this.isLocationStarted_) {
                this.geolocation_.startUpdatingLocation();
            }
            if (this.isHeadingStarted_) {
                this.geolocation_.startUpdatingHeading();
            }
        }
        this.mediaPlayerManager_.onResume();
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onResume", new Class[0], new Object[0]);
        }
        if (this.isSurfaceCreated_) {
            synchronized (this.eventQueue_) {
                nativeResume();
                nativeTick();
            }
        }
        if (onDemandEnabled) {
            enableOnDemand(true);
        }
        OrientationEventListener orientationEventListener2 = orientationEventListener;
        if (orientationEventListener2 != null) {
            orientationEventListener2.enable();
        }
    }

    public void onLowMemory() {
        synchronized (this.lock) {
            nativeLowMemory();
        }
    }

    public void onHandleOpenUrl(String str) {
        nativeHandleOpenUrl(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            Class<?> next = it.next();
            Class cls = Integer.TYPE;
            executeMethod(next, null, "onActivityResult", new Class[]{cls, cls, Intent.class}, new Object[]{new Integer(i), new Integer(i2), intent});
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Iterator<Class<?>> it = this.sAvailableClasses.iterator();
        while (it.hasNext()) {
            executeMethod(it.next(), null, "onRequestPermissionsResult", new Class[]{Integer.TYPE, String[].class, int[].class}, new Object[]{new Integer(i), strArr, iArr});
        }
        synchronized (this.lock) {
            nativeRequestPermissionsResult(strArr, iArr);
        }
    }

    public void onSurfaceCreated(Surface surface) {
        synchronized (this.lock) {
            nativeSurfaceCreated(surface);
            this.isSurfaceCreated_ = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r1 == 180) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x0058, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0035, B:12:0x0049, B:14:0x004d, B:15:0x0052, B:16:0x0056, B:20:0x0040), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSurfaceChanged(int i, int i2, Surface surface) {
        synchronized (this.lock) {
            Activity activity = WeakActivityHolder.get();
            Configuration configuration = activity.getResources().getConfiguration();
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int i3 = 0;
            int i4 = rotation == 1 ? 90 : rotation == 2 ? 180 : rotation == 3 ? 270 : 0;
            if (configuration.orientation == 2) {
                if (i4 != 0) {
                }
                i3 = 90;
                if (currentAngle < 0) {
                    nativeOrientationChanged(i4 + i3);
                }
                nativeSurfaceChanged(i, i2, i4 + i3, surface);
            }
            if (configuration.orientation != 2) {
                if (i4 != 90) {
                    if (i4 == 270) {
                    }
                }
                i3 = 90;
            }
            if (currentAngle < 0) {
            }
            nativeSurfaceChanged(i, i2, i4 + i3, surface);
        }
    }

    public void onSurfaceDestroyed() {
        synchronized (this.lock) {
            nativeSurfaceDestroyed();
        }
    }

    private static void sleep(long j) {
        try {
            Thread.sleep(j / 1000000, (int) (j % 1000000));
        } catch (InterruptedException unused) {
        }
    }

    public void onDrawFrame(boolean z) {
        long j = 1000000000 / this.fps_;
        if (this.onDemandRender == null || z) {
            long nanoTime = System.nanoTime();
            long j2 = nanoTime - this.startTime;
            this.startTime = nanoTime;
            if (j2 < 0) {
                j2 = 0;
            }
            if (j2 < j) {
                long j3 = j - j2;
                sleep(j3);
                this.startTime += j3;
            }
        }
        synchronized (this.lock) {
            synchronized (this.eventQueue_) {
                while (!this.eventQueue_.isEmpty()) {
                    int intValue = this.eventQueue_.remove(0).intValue();
                    if (intValue == 0) {
                        nativePause();
                    } else if (intValue == 1) {
                        nativeResume();
                    } else if (intValue == 2) {
                        nativeStop();
                    } else if (intValue == 3) {
                        nativeStart();
                    }
                }
                this.eventQueue_.notify();
            }
            nativeDrawFrame(z);
        }
        Runnable runnable = this.onDemandRender;
        if (runnable == null || z) {
            return;
        }
        ((GLSurfaceView) mGLView_).queueEvent(runnable);
    }

    public void onMouseWheel(int i, int i2, int i3, float f) {
        nativeMouseWheel(i, i2, i3, f);
    }

    public void onTouchesBegin(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr, int i2) {
        ListView listView;
        if (!isRunning() && (listView = this.projectList) != null && listView.getVisibility() == 8) {
            this.projectList.setVisibility(0);
        }
        nativeTouchesBegin(i, iArr, iArr2, iArr3, fArr, i2);
    }

    public void onTouchesMove(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr) {
        nativeTouchesMove(i, iArr, iArr2, iArr3, fArr);
    }

    public void onTouchesEnd(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr, int i2) {
        nativeTouchesEnd(i, iArr, iArr2, iArr3, fArr, i2);
    }

    public void onTouchesCancel(int i, int[] iArr, int[] iArr2, int[] iArr3, float[] fArr) {
        nativeTouchesCancel(i, iArr, iArr2, iArr3, fArr);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListView listView = this.projectList;
        if (listView != null && listView.getVisibility() == 0) {
            this.projectList.setVisibility(8);
            return true;
        }
        boolean nativeKeyDown = nativeKeyDown(i, keyEvent.getRepeatCount());
        if (keyEvent.getUnicodeChar() > 0) {
            nativeKeyChar(Character.toString((char) keyEvent.getUnicodeChar()));
        }
        if (i == 25 || i == 164 || i == 24 || i == 26) {
            return false;
        }
        return nativeKeyDown;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return nativeKeyUp(i, keyEvent.getRepeatCount());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = tisActionLabel;
        editorInfo.hintText = tisHint;
        editorInfo.initialCapsMode = tisInitCapsMode;
        editorInfo.initialSelEnd = tisSelEnd;
        editorInfo.initialSelStart = tisSelStart;
        editorInfo.label = tisLabel;
        editorInfo.imeOptions = 6;
        editorInfo.inputType = tisType;
        Log.v("EBE", "OCI:" + tisType + " SS:" + tisSelStart + " SE:" + tisSelEnd);
        BaseInputConnection baseInputConnection = new BaseInputConnection(mGLView_, tisType != 0) { // from class: com.giderosmobile.android.player.GiderosApplication.4
            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean endBatchEdit() {
                Editable editable = getEditable();
                if (GiderosApplication.tisEditable == editable) {
                    GiderosApplication.tisSelStart = Selection.getSelectionStart(editable);
                    GiderosApplication.tisSelEnd = Selection.getSelectionEnd(editable);
                    GiderosApplication.tisBuffer = editable.toString();
                    GiderosApplication.getInstance();
                    GiderosApplication.nativeTextInput(GiderosApplication.tisBuffer, GiderosApplication.tisSelStart, GiderosApplication.tisSelEnd, GiderosApplication.tisContext);
                    if (GiderosApplication.tisToken != -1) {
                        InputMethodManager inputMethodManager = (InputMethodManager) WeakActivityHolder.get().getSystemService("input_method");
                        ExtractedText extractedText = new ExtractedText();
                        extractedText.text = editable.toString();
                        extractedText.startOffset = 0;
                        extractedText.partialStartOffset = -1;
                        extractedText.partialEndOffset = -1;
                        extractedText.selectionStart = GiderosApplication.tisSelStart >= 0 ? GiderosApplication.tisSelStart - extractedText.startOffset : -1;
                        extractedText.selectionEnd = GiderosApplication.tisSelEnd >= 0 ? GiderosApplication.tisSelEnd - extractedText.startOffset : -1;
                        extractedText.flags = 0;
                        inputMethodManager.updateExtractedText(GiderosApplication.mGLView_, GiderosApplication.tisToken, extractedText);
                    }
                }
                return super.endBatchEdit();
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int i, int i2) {
                if (GiderosApplication.tisType == 0 && i == 1 && i2 == 0) {
                    return super.sendKeyEvent(new KeyEvent(0, 67)) && super.sendKeyEvent(new KeyEvent(1, 67));
                }
                return super.deleteSurroundingText(i, i2);
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(KeyEvent keyEvent) {
                if (GiderosApplication.tisType != 0) {
                    if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0) {
                        return super.deleteSurroundingText(1, 0);
                    }
                    if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() >= 7 && keyEvent.getKeyCode() <= 16) {
                        commitText(String.valueOf(keyEvent.getKeyCharacterMap().getNumber(keyEvent.getKeyCode())), 1);
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
                ExtractedText extractedText = new ExtractedText();
                extractedText.text = getEditable().toString();
                extractedText.startOffset = 0;
                extractedText.partialStartOffset = -1;
                extractedText.partialEndOffset = -1;
                extractedText.selectionStart = GiderosApplication.tisSelStart >= 0 ? GiderosApplication.tisSelStart - extractedText.startOffset : -1;
                extractedText.selectionEnd = GiderosApplication.tisSelEnd >= 0 ? GiderosApplication.tisSelEnd - extractedText.startOffset : -1;
                extractedText.flags = 0;
                GiderosApplication.tisToken = -1;
                if ((i & 1) != 0) {
                    GiderosApplication.tisToken = extractedTextRequest.token;
                }
                return extractedText;
            }
        };
        tisEditable = null;
        Editable editable = baseInputConnection.getEditable();
        editable.clear();
        String str = tisBuffer;
        baseInputConnection.commitText(str, str.length());
        try {
            baseInputConnection.setSelection(tisSelStart, tisSelEnd);
        } catch (Exception unused) {
        }
        tisEditable = editable;
        tisToken = -1;
        return baseInputConnection;
    }

    public static boolean setTextInput(final int i, final String str, final int i2, final int i3, final String str2, final String str3, final String str4, final String str5) {
        final Activity activity = WeakActivityHolder.get();
        activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.5
            @Override // java.lang.Runnable
            public void run() {
                GiderosApplication.tisType = i;
                GiderosApplication.tisBuffer = str;
                GiderosApplication.tisSelStart = i2;
                GiderosApplication.tisSelEnd = i3;
                GiderosApplication.tisLabel = str2;
                GiderosApplication.tisActionLabel = str3;
                GiderosApplication.tisHint = str4;
                int i4 = i;
                GiderosApplication.tisInitCapsMode = (i4 & 15) == 1 ? i4 & 28672 : 0;
                GiderosApplication.tisContext = str5;
                int length = GiderosApplication.tisBuffer.length();
                Log.v("EBE", "STI:" + GiderosApplication.tisType + " SS:" + GiderosApplication.tisSelStart + " SE:" + GiderosApplication.tisSelEnd + " BL:" + length + " BB:" + str + " TE:" + ((Object) GiderosApplication.tisEditable));
                if (GiderosApplication.tisSelStart > length) {
                    GiderosApplication.tisSelStart = length;
                }
                if (GiderosApplication.tisSelEnd > length) {
                    GiderosApplication.tisSelEnd = length;
                }
                if (GiderosApplication.tisEditable != null) {
                    GiderosApplication.tisEditable.replace(0, GiderosApplication.tisEditable.length(), GiderosApplication.tisBuffer);
                    if (GiderosApplication.tisSelStart >= 0 && GiderosApplication.tisSelEnd >= 0) {
                        Selection.setSelection(GiderosApplication.tisEditable, GiderosApplication.tisSelStart, GiderosApplication.tisSelEnd);
                    } else {
                        Selection.removeSelection(GiderosApplication.tisEditable);
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                    Log.v("EBE", "RSI");
                    GiderosApplication.tisToken = -1;
                    inputMethodManager.restartInput(GiderosApplication.mGLView_);
                }
            }
        });
        return true;
    }

    public static String getProperty(String str, String str2) {
        if (str.equals("batteryLevel")) {
            if (WeakActivityHolder.get().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                return "" + ((r3.getIntExtra("level", -1) * 100.0f) / r3.getIntExtra("scale", -1));
            }
        }
        return "";
    }

    public static void setWindowFlag(Activity activity, int i, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags = i | attributes.flags;
        } else {
            attributes.flags = (~i) & attributes.flags;
        }
        window.setAttributes(attributes);
    }

    public static void setProperty(String str, final String str2) {
        if (!str.equals("statusBar") || Build.VERSION.SDK_INT < 30) {
            return;
        }
        final Activity activity = WeakActivityHolder.get();
        activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.6
            @Override // java.lang.Runnable
            public void run() {
                WindowInsetsController windowInsetsController;
                int statusBars;
                int statusBars2;
                windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
                if (str2.length() > 0) {
                    statusBars2 = WindowInsets.Type.statusBars();
                    windowInsetsController.show(statusBars2);
                    windowInsetsController.setSystemBarsAppearance("dark".equals(str2) ? 8 : 0, 8);
                    activity.getWindow().clearFlags(67108864);
                    activity.getWindow().addFlags(512);
                    activity.getWindow().setStatusBarColor(0);
                    return;
                }
                statusBars = WindowInsets.Type.statusBars();
                windowInsetsController.hide(statusBars);
            }
        });
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (i == 0) {
            nativeKeyChar(keyEvent.getCharacters());
        } else if (keyEvent.getUnicodeChar() > 0) {
            String ch = Character.toString((char) keyEvent.getUnicodeChar());
            for (int i3 = 0; i3 < keyEvent.getRepeatCount(); i3++) {
                nativeKeyChar(ch);
            }
        }
        return false;
    }

    public boolean isAccelerometerAvailable() {
        return this.accelerometer_.isAvailable();
    }

    public void startAccelerometer() {
        this.isAccelerometerStarted_ = true;
        if (this.isForeground_) {
            this.accelerometer_.enable();
        }
    }

    public void stopAccelerometer() {
        this.isAccelerometerStarted_ = false;
        this.accelerometer_.disable();
    }

    public boolean isGyroscopeAvailable() {
        return this.gyroscope_.isAvailable();
    }

    public void startGyroscope() {
        this.isGyroscopeStarted_ = true;
        if (this.isForeground_) {
            this.gyroscope_.enable();
        }
    }

    public void stopGyroscope() {
        this.isGyroscopeStarted_ = false;
        this.gyroscope_.disable();
    }

    public boolean isGeolocationAvailable() {
        return this.geolocation_.isAvailable();
    }

    public boolean isHeadingAvailable() {
        return this.geolocation_.isHeadingAvailable();
    }

    public void setGeolocationAccuracy(double d) {
        this.geolocation_.setAccuracy(d);
    }

    public double getGeolocationAccuracy() {
        return this.geolocation_.getAccuracy();
    }

    public void setGeolocationThreshold(double d) {
        this.geolocation_.setThreshold(d);
    }

    public double getGeolocationThreshold() {
        return this.geolocation_.getThreshold();
    }

    public void startUpdatingLocation() {
        this.isLocationStarted_ = true;
        if (this.isForeground_) {
            this.geolocation_.startUpdatingLocation();
        }
    }

    public void stopUpdatingLocation() {
        this.isLocationStarted_ = false;
        this.geolocation_.stopUpdatingLocation();
    }

    public void startUpdatingHeading() {
        this.isHeadingStarted_ = true;
        if (this.isForeground_) {
            this.geolocation_.startUpdatingHeading();
        }
    }

    public void stopUpdatingHeading() {
        this.isHeadingStarted_ = false;
        this.geolocation_.stopUpdatingHeading();
    }

    public static boolean checkPermission(String str) {
        int checkSelfPermission;
        checkSelfPermission = WeakActivityHolder.get().checkSelfPermission(str);
        return checkSelfPermission == 0;
    }

    public static void requestPermissions(String[] strArr) {
        WeakActivityHolder.get().requestPermissions(strArr, 0);
    }

    public static boolean isAccelerometerAvailable_s() {
        return instance_.isAccelerometerAvailable();
    }

    public static void startAccelerometer_s() {
        instance_.startAccelerometer();
    }

    public static void stopAccelerometer_s() {
        instance_.stopAccelerometer();
    }

    public static boolean isGyroscopeAvailable_s() {
        return instance_.isGyroscopeAvailable();
    }

    public static void startGyroscope_s() {
        instance_.startGyroscope();
    }

    public static void stopGyroscope_s() {
        instance_.stopGyroscope();
    }

    public static boolean isGeolocationAvailable_s() {
        return instance_.isGeolocationAvailable();
    }

    public static boolean isHeadingAvailable_s() {
        return instance_.isHeadingAvailable();
    }

    public static void setGeolocationAccuracy_s(double d) {
        instance_.setGeolocationAccuracy(d);
    }

    public static double getGeolocationAccuracy_s() {
        return instance_.getGeolocationAccuracy();
    }

    public static void setGeolocationThreshold_s(double d) {
        instance_.setGeolocationThreshold(d);
    }

    public static double getGeolocationThreshold_s() {
        return instance_.getGeolocationThreshold();
    }

    public static void startUpdatingLocation_s() {
        instance_.startUpdatingLocation();
    }

    public static void stopUpdatingLocation_s() {
        instance_.stopUpdatingLocation();
    }

    public static void startUpdatingHeading_s() {
        instance_.startUpdatingHeading();
    }

    public static void stopUpdatingHeading_s() {
        instance_.stopUpdatingHeading();
    }

    public static long BackgroundMusicCreateFromFile(String str, int[] iArr) {
        return instance_.mediaPlayerManager_.BackgroundMusicCreateFromFile(str, iArr);
    }

    public static void BackgroundMusicDelete(long j) {
        instance_.mediaPlayerManager_.BackgroundMusicDelete(j);
    }

    public static int BackgroundMusicGetLength(long j) {
        return instance_.mediaPlayerManager_.BackgroundMusicGetLength(j);
    }

    public static long BackgroundMusicPlay(long j, boolean z, long j2) {
        return instance_.mediaPlayerManager_.BackgroundMusicPlay(j, z, j2);
    }

    public static void BackgroundChannelStop(long j) {
        instance_.mediaPlayerManager_.BackgroundChannelStop(j);
    }

    public static void BackgroundChannelSetPosition(long j, int i) {
        instance_.mediaPlayerManager_.BackgroundChannelSetPosition(j, i);
    }

    public static int BackgroundChannelGetPosition(long j) {
        return instance_.mediaPlayerManager_.BackgroundChannelGetPosition(j);
    }

    public static void BackgroundChannelSetPaused(long j, boolean z) {
        instance_.mediaPlayerManager_.BackgroundChannelSetPaused(j, z);
    }

    public static boolean BackgroundChannelIsPaused(long j) {
        return instance_.mediaPlayerManager_.BackgroundChannelIsPaused(j);
    }

    public static boolean BackgroundChannelIsPlaying(long j) {
        return instance_.mediaPlayerManager_.BackgroundChannelIsPlaying(j);
    }

    public static void BackgroundChannelSetVolume(long j, float f) {
        instance_.mediaPlayerManager_.BackgroundChannelSetVolume(j, f);
    }

    public static float BackgroundChannelGetVolume(long j) {
        return instance_.mediaPlayerManager_.BackgroundChannelGetVolume(j);
    }

    public static void BackgroundChannelSetLooping(long j, boolean z) {
        instance_.mediaPlayerManager_.BackgroundChannelSetLooping(j, z);
    }

    public static boolean BackgroundChannelIsLooping(long j) {
        return instance_.mediaPlayerManager_.BackgroundChannelIsLooping(j);
    }

    public static void setFps(int i) {
        instance_.fps_ = i;
    }

    public static void setKeepAwake(boolean z) {
        final Activity activity = WeakActivityHolder.get();
        if (z) {
            activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.7
                @Override // java.lang.Runnable
                public void run() {
                    activity.getWindow().addFlags(128);
                }
            });
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.8
                @Override // java.lang.Runnable
                public void run() {
                    activity.getWindow().clearFlags(128);
                }
            });
        }
    }

    public static boolean setKeyboardVisibility(final boolean z) {
        final Activity activity = WeakActivityHolder.get();
        activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.9
            @Override // java.lang.Runnable
            public void run() {
                activity.getWindow().setSoftInputMode(z ? 4 : 3);
                GiderosApplication.mGLView_.clearFocus();
                if (z) {
                    GiderosApplication.mGLView_.requestFocus();
                }
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                if (z) {
                    inputMethodManager.showSoftInput(GiderosApplication.mGLView_, 0);
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(GiderosApplication.mGLView_.getWindowToken(), 0);
                Activity activity2 = activity;
                activity2.onWindowFocusChanged(activity2.hasWindowFocus());
            }
        });
        return true;
    }

    public static void vibrate(int i) {
        try {
            ((Vibrator) WeakActivityHolder.get().getSystemService("vibrator")).vibrate(i);
        } catch (SecurityException unused) {
        }
    }

    public static void enableOnDemand_s(boolean z) {
        onDemandEnabled = z;
        instance_.enableOnDemand(z);
    }

    public static void requestDraw_s() {
        instance_.requestDraw();
    }

    public static String getLocale() {
        Locale locale = Locale.getDefault();
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getAppId() {
        return WeakActivityHolder.get().getPackageName();
    }

    public static String getVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getDeviceType() {
        if (WeakActivityHolder.get().getPackageManager().hasSystemFeature("android.software.leanback")) {
            return "TV";
        }
        UiModeManager uiModeManager = (UiModeManager) WeakActivityHolder.get().getSystemService("uimode");
        if (uiModeManager.getCurrentModeType() == 4) {
            return "TV";
        }
        if (uiModeManager.getCurrentModeType() == 5) {
            return "Appliance";
        }
        if (uiModeManager.getCurrentModeType() == 3) {
            return "Car";
        }
        if (uiModeManager.getCurrentModeType() == 2) {
            return "Desk";
        }
        if (uiModeManager.getCurrentModeType() == 6) {
            return "Watch";
        }
        return "Mobile";
    }

    public static boolean setClipboard(String str, String str2) {
        ClipboardManager clipboardManager = (ClipboardManager) WeakActivityHolder.get().getSystemService("clipboard");
        if (!str2.startsWith("text/")) {
            return false;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str));
        return true;
    }

    public static String[] getClipboard(String str) {
        Activity activity = WeakActivityHolder.get();
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip.getDescription().hasMimeType(str) && str.startsWith("text/")) {
            return new String[]{primaryClip.getItemAt(0).coerceToText(activity).toString(), str};
        }
        return null;
    }

    public static void openUrl(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        Intent intent = null;
        if (scheme != null) {
            if (scheme.equals("LAUNCH")) {
                Intent launchIntentForPackage = WeakActivityHolder.get().getPackageManager().getLaunchIntentForPackage(parse.getSchemeSpecificPart());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                    intent = launchIntentForPackage;
                }
            } else if (scheme.equals("INTENT")) {
                intent = new Intent(parse.getSchemeSpecificPart());
            }
        }
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW", parse);
        }
        try {
            WeakActivityHolder.get().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static boolean canOpenUrl(String str) {
        try {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(WeakActivityHolder.get().getPackageManager()) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void finishActivity() {
        final Activity activity = WeakActivityHolder.get();
        activity.runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.GiderosApplication.10
            @Override // java.lang.Runnable
            public void run() {
                activity.finish();
            }
        });
    }

    public static int getScreenDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WeakActivityHolder.get().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r4 != 3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void requestDeviceOrientation(int i, int i2) {
        Activity activity = WeakActivityHolder.get();
        int i3 = 1;
        if (i2 == 1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                    }
                }
                i3 = 6;
            }
            i3 = 7;
        } else if (i2 == 2) {
            i3 = 10;
        } else if (i2 == 3) {
            i3 = 5;
        } else if (i != 0) {
            if (i == 1) {
                i3 = 0;
            } else if (i == 2) {
                i3 = 9;
            } else if (i == 3) {
                i3 = 8;
            }
        }
        activity.setRequestedOrientation(i3);
    }

    public static String getLocalIPs() {
        StringBuilder sb = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        sb.append(nextElement.getHostAddress().toString());
                        sb.append("|");
                    }
                }
            }
        } catch (SocketException unused) {
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String getDeviceName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    static String toJFunctionName(String str) {
        return str.trim().replaceAll("\\s", "_").replaceAll("\\W", "");
    }

    static String toJFileName(String str) {
        return str.trim().replaceAll("\\s", "_").replaceAll("[^a-zA-Z0-9_\\-\\.]", "");
    }

    public static void throwLuaException(String str) throws Exception {
        if (str != null && str.contains("stack traceback:")) {
            String[] split = str.substring(str.indexOf("stack traceback:\n\t") + 18).split("\n\t");
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[split.length];
            for (int i = 0; i < split.length; i++) {
                String str2 = split[i];
                int indexOf = str2.indexOf(32, str2.startsWith("[") ? str2.indexOf(93) + 1 : 0);
                if (indexOf >= 0) {
                    String[] split2 = str2.substring(0, indexOf).split(":");
                    String substring = str2.substring(indexOf + 1);
                    int parseInt = split2.length > 1 ? Integer.parseInt(split2[1]) : 1234;
                    if (substring.startsWith("in function ")) {
                        substring = substring.substring(12);
                    } else if (substring.startsWith("in main chunk")) {
                        substring = "MAIN_CHUNK";
                    }
                    stackTraceElementArr[i] = new StackTraceElement("LUA", toJFunctionName(substring), toJFileName(split2[0]), parseInt);
                } else {
                    stackTraceElementArr[i] = new StackTraceElement("LUA", toJFunctionName(str2), "", 0);
                }
            }
            LuaException luaException = new LuaException(str);
            luaException.setStackTrace(stackTraceElementArr);
            throw luaException;
        }
        throw new LuaException(str);
    }
}
