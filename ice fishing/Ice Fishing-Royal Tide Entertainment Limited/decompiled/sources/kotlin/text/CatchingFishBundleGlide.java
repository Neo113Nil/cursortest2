package kotlin.text;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class CatchingFishBundleGlide implements CatchingFishMockkDaggerHilt, CatchingFishSpannableGson, CatchingFishLayoutViewPager, OnGooglePlayInstallReferrerReadListener {
    public static CatchingFishReduxPayPalKtor CatchingFishLayout;
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public Object CatchingFishWorkManager;
    public static final int[] CatchingFishViewModelScope = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final Object CatchingFishViewModelFAB = new Object();

    public /* synthetic */ CatchingFishBundleGlide(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    public static int CatchingFishDaggerHiltFAB(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static CatchingFishBundleGlide CatchingFishReduxKtor(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new CatchingFishBundleGlide(15, fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    public static CatchingFishWorkManagerMVP CatchingFishWorkManager(Context context, Intent intent, boolean z) {
        CatchingFishReduxPayPalKtor catchingFishReduxPayPalKtor;
        synchronized (CatchingFishViewModelFAB) {
            try {
                if (CatchingFishLayout == null) {
                    CatchingFishLayout = new CatchingFishReduxPayPalKtor(context);
                }
                catchingFishReduxPayPalKtor = CatchingFishLayout;
            } finally {
            }
        }
        if (!z) {
            return catchingFishReduxPayPalKtor.CatchingFishSnackbar(intent).CatchingFishCoroutine(new CatchingFishExoPlayerRealm(), new CatchingFishLayoutLayout(19));
        }
        if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(context)) {
            synchronized (CatchingFishJUnitJUnitKtor.CatchingFishSnackbar) {
                try {
                    CatchingFishJUnitJUnitKtor.CatchingFishParcelableFAB(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        CatchingFishJUnitJUnitKtor.CatchingFishCoroutine.CatchingFishParcelableFAB(CatchingFishJUnitJUnitKtor.CatchingFishParcelableFAB);
                    }
                    CatchingFishWorkManagerMVP CatchingFishSnackbar = catchingFishReduxPayPalKtor.CatchingFishSnackbar(intent);
                    CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = new CatchingFishLayoutCoroutine(10, intent);
                    CatchingFishSnackbar.getClass();
                    CatchingFishSnackbar.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(CatchingFishReduxMockk.CatchingFishParcelableFAB, catchingFishLayoutCoroutine));
                    CatchingFishSnackbar.CatchingFishUnitTesting();
                } finally {
                }
            }
        } else {
            catchingFishReduxPayPalKtor.CatchingFishSnackbar(intent);
        }
        return CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(-1);
    }

    public void CatchingFish(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFish(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishAnimationMockk(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishAnimationMockk(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishCardViewRealm(CatchingFishGradleSpannable catchingFishGradleSpannable) {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = (CatchingFishFluxFluxBundle) this.CatchingFishDaggerWebsocket;
        ((ActionMode.Callback) catchingFishFluxFluxBundle.CatchingFishReduxKtor).onDestroyActionMode(catchingFishFluxFluxBundle.CatchingFishOkHttp(catchingFishGradleSpannable));
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) this.CatchingFishWorkManager;
        if (catchingFishMockkWidgetKtor.CatchingFishCardViewRealm != null) {
            catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.getDecorView().removeCallbacks(catchingFishMockkWidgetKtor.CatchingFishPayPal);
        }
        if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat != null) {
            CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = catchingFishMockkWidgetKtor.CatchingFishCardViewView;
            if (catchingFishIntentMVPDagger != null) {
                catchingFishIntentMVPDagger.CatchingFishSnackbar();
            }
            CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat);
            CatchingFishParcelableFAB.CatchingFishParcelableFAB(0.0f);
            catchingFishMockkWidgetKtor.CatchingFishCardViewView = CatchingFishParcelableFAB;
            CatchingFishParcelableFAB.CatchingFishReduxKtor(new CatchingFishPicassoFlux(2, this));
        }
        catchingFishMockkWidgetKtor.CatchingFishParcelableFlux = null;
        ViewGroup viewGroup = catchingFishMockkWidgetKtor.CatchingFishFragmentFactory;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        viewGroup.requestApplyInsets();
        catchingFishMockkWidgetKtor.CatchingFishJobScheduler();
    }

    public void CatchingFishCardViewView(CatchingFishLayoutBiometric catchingFishLayoutBiometric) {
        CatchingFishLayoutOkHttp catchingFishLayoutOkHttp = (CatchingFishLayoutOkHttp) this.CatchingFishWorkManager;
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = (CatchingFishEspressoPayPal) this.CatchingFishDaggerWebsocket;
        int i = catchingFishLayoutBiometric.CatchingFishSnackbar;
        if (i != 0) {
            catchingFishLayoutOkHttp.execute(new CatchingFishServiceEspresso(i, 0, catchingFishEspressoPayPal));
        } else {
            catchingFishLayoutOkHttp.execute(new CatchingFishService(20, catchingFishEspressoPayPal, catchingFishLayoutBiometric.CatchingFishParcelableFAB, false));
        }
    }

    public void CatchingFishCloudMessaging(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishCloudMessaging(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishLayoutViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishCoroutine(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishViewMVI catchingFishViewMVI;
        int i;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk;
        Throwable th;
        CatchingFishAdMobHilt catchingFishAdMobHilt;
        CatchingFishBundleGlide catchingFishBundleGlide;
        CatchingFishIntentManifest catchingFishIntentManifest2;
        CatchingFishLayoutViewPager catchingFishLayoutViewPager;
        CatchingFishReduxMVP catchingFishReduxMVP;
        int i2;
        CatchingFishOkHttpGlide catchingFishOkHttpGlide;
        switch (this.CatchingFishReduxKtor) {
            case 21:
                if (catchingFishWebsocketGradle instanceof CatchingFishViewMVI) {
                    catchingFishViewMVI = (CatchingFishViewMVI) catchingFishWebsocketGradle;
                    int i3 = catchingFishViewMVI.CatchingFishViewModelFAB;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        catchingFishViewMVI.CatchingFishViewModelFAB = i3 - Integer.MIN_VALUE;
                        Object obj = catchingFishViewMVI.CatchingFishViewModelScope;
                        i = catchingFishViewMVI.CatchingFishViewModelFAB;
                        catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (i != 0) {
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                            CatchingFishManifestMockk catchingFishManifestMockk = catchingFishViewMVI.CatchingFishDaggerWebsocket;
                            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishManifestMockk);
                            CatchingFishAdMobHilt catchingFishAdMobHilt2 = new CatchingFishAdMobHilt(catchingFishIntentManifest, catchingFishManifestMockk);
                            try {
                                CatchingFishGraphQLLiveData catchingFishGraphQLLiveData = (CatchingFishGraphQLLiveData) this.CatchingFishDaggerWebsocket;
                                catchingFishViewMVI.CatchingFishFragmentHandler = this;
                                catchingFishViewMVI.CatchingFishCloudMessaging = catchingFishIntentManifest;
                                catchingFishViewMVI.CatchingFishEspressoTesting = catchingFishAdMobHilt2;
                                catchingFishViewMVI.CatchingFishViewModelFAB = 1;
                                if (catchingFishGraphQLLiveData.CatchingFishDaggerWebsocket(catchingFishAdMobHilt2, catchingFishViewMVI) == catchingFishXMLLayoutMockk) {
                                    return catchingFishXMLLayoutMockk;
                                }
                                catchingFishBundleGlide = this;
                                catchingFishIntentManifest2 = catchingFishIntentManifest;
                                catchingFishAdMobHilt = catchingFishAdMobHilt2;
                            } catch (Throwable th2) {
                                th = th2;
                                catchingFishAdMobHilt = catchingFishAdMobHilt2;
                                catchingFishAdMobHilt.CatchingFishUnitTesting();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                                return CatchingFishRealmContext.CatchingFishParcelableFAB;
                            }
                            catchingFishAdMobHilt = catchingFishViewMVI.CatchingFishEspressoTesting;
                            catchingFishIntentManifest2 = catchingFishViewMVI.CatchingFishCloudMessaging;
                            catchingFishBundleGlide = catchingFishViewMVI.CatchingFishFragmentHandler;
                            try {
                                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                catchingFishAdMobHilt.CatchingFishUnitTesting();
                                throw th;
                            }
                        }
                        catchingFishAdMobHilt.CatchingFishUnitTesting();
                        catchingFishLayoutViewPager = (CatchingFishLayoutViewPager) catchingFishBundleGlide.CatchingFishWorkManager;
                        catchingFishViewMVI.CatchingFishFragmentHandler = null;
                        catchingFishViewMVI.CatchingFishCloudMessaging = null;
                        catchingFishViewMVI.CatchingFishEspressoTesting = null;
                        catchingFishViewMVI.CatchingFishViewModelFAB = 2;
                        if (catchingFishLayoutViewPager.CatchingFishCoroutine(catchingFishIntentManifest2, catchingFishViewMVI) == catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                }
                catchingFishViewMVI = new CatchingFishViewMVI(this, catchingFishWebsocketGradle);
                Object obj2 = catchingFishViewMVI.CatchingFishViewModelScope;
                i = catchingFishViewMVI.CatchingFishViewModelFAB;
                catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i != 0) {
                }
                catchingFishAdMobHilt.CatchingFishUnitTesting();
                catchingFishLayoutViewPager = (CatchingFishLayoutViewPager) catchingFishBundleGlide.CatchingFishWorkManager;
                catchingFishViewMVI.CatchingFishFragmentHandler = null;
                catchingFishViewMVI.CatchingFishCloudMessaging = null;
                catchingFishViewMVI.CatchingFishEspressoTesting = null;
                catchingFishViewMVI.CatchingFishViewModelFAB = 2;
                if (catchingFishLayoutViewPager.CatchingFishCoroutine(catchingFishIntentManifest2, catchingFishViewMVI) == catchingFishXMLLayoutMockk) {
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 22:
                Object CatchingFishCoroutine = ((CatchingFishLayoutViewPager) this.CatchingFishDaggerWebsocket).CatchingFishCoroutine(new CatchingFishMVIDagger(new CatchingFishFragmentWidget(), catchingFishIntentManifest, (CatchingFishMVIBundle) this.CatchingFishWorkManager), catchingFishWebsocketGradle);
                return CatchingFishCoroutine == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishCoroutine : CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                if (catchingFishWebsocketGradle instanceof CatchingFishReduxMVP) {
                    catchingFishReduxMVP = (CatchingFishReduxMVP) catchingFishWebsocketGradle;
                    int i4 = catchingFishReduxMVP.CatchingFishViewModelFAB;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        catchingFishReduxMVP.CatchingFishViewModelFAB = i4 - Integer.MIN_VALUE;
                        Object obj3 = catchingFishReduxMVP.CatchingFishViewModelScope;
                        i2 = catchingFishReduxMVP.CatchingFishViewModelFAB;
                        if (i2 != 0) {
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj3);
                            CatchingFishBundleGlide catchingFishBundleGlide2 = (CatchingFishBundleGlide) this.CatchingFishDaggerWebsocket;
                            CatchingFishOkHttpGlide catchingFishOkHttpGlide2 = new CatchingFishOkHttpGlide((CatchingFishMoshiExoPlayer) this.CatchingFishWorkManager, catchingFishIntentManifest);
                            try {
                                catchingFishReduxMVP.CatchingFishFragmentHandler = catchingFishOkHttpGlide2;
                                catchingFishReduxMVP.CatchingFishViewModelFAB = 1;
                                Object CatchingFishCoroutine2 = catchingFishBundleGlide2.CatchingFishCoroutine(catchingFishOkHttpGlide2, catchingFishReduxMVP);
                                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                                if (CatchingFishCoroutine2 == catchingFishXMLLayoutMockk2) {
                                    return catchingFishXMLLayoutMockk2;
                                }
                            } catch (CatchingFishUnitTestingGson e) {
                                e = e;
                                catchingFishOkHttpGlide = catchingFishOkHttpGlide2;
                                if (e.CatchingFishReduxKtor != catchingFishOkHttpGlide) {
                                }
                                return CatchingFishRealmContext.CatchingFishParcelableFAB;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            catchingFishOkHttpGlide = catchingFishReduxMVP.CatchingFishFragmentHandler;
                            try {
                                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj3);
                            } catch (CatchingFishUnitTestingGson e2) {
                                e = e2;
                                if (e.CatchingFishReduxKtor != catchingFishOkHttpGlide) {
                                    throw e;
                                }
                                return CatchingFishRealmContext.CatchingFishParcelableFAB;
                            }
                        }
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                }
                catchingFishReduxMVP = new CatchingFishReduxMVP(this, catchingFishWebsocketGradle);
                Object obj32 = catchingFishReduxMVP.CatchingFishViewModelScope;
                i2 = catchingFishReduxMVP.CatchingFishViewModelFAB;
                if (i2 != 0) {
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    public KeyListener CatchingFishCoroutineFlow(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((CatchingFishBundleGlide) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).getClass();
        if (keyListener instanceof CatchingFishMVIRealm) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new CatchingFishMVIRealm(keyListener);
    }

    public CatchingFishWorkManagerMVP CatchingFishCustomView(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.CatchingFishDaggerWebsocket;
        CatchingFishExoPlayerRealm catchingFishExoPlayerRealm = (CatchingFishExoPlayerRealm) this.CatchingFishWorkManager;
        boolean z = CatchingFishHiltMVPToast.CatchingFishSpannableWidget() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? CatchingFishViewMVIMVVM.CatchingFishReduxKtor(catchingFishExoPlayerRealm, new Callable() { // from class: kotlin.text.CatchingFishWidgetHandler
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                CatchingFishFluxFluxBundle CatchingFishRoomDatabase = CatchingFishFluxFluxBundle.CatchingFishRoomDatabase();
                ((ArrayDeque) CatchingFishRoomDatabase.CatchingFishViewModelScope).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (CatchingFishRoomDatabase) {
                    try {
                        str = (String) CatchingFishRoomDatabase.CatchingFishReduxKtor;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        CatchingFishRoomDatabase.CatchingFishReduxKtor = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        CatchingFishRoomDatabase.CatchingFishReduxKtor = serviceInfo.name;
                                    }
                                    str = (String) CatchingFishRoomDatabase.CatchingFishReduxKtor;
                                }
                                str = null;
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i = (CatchingFishRoomDatabase.CatchingFishJetpackCompose(context2) ? CatchingFishJUnitJUnitKtor.CatchingFishCoroutine(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).CatchingFishReduxKtor(catchingFishExoPlayerRealm, new CatchingFishJUnitBiometric() { // from class: kotlin.text.CatchingFishCameraXDagger
            @Override // kotlin.text.CatchingFishJUnitBiometric
            public final Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
                return (CatchingFishHiltMVPToast.CatchingFishSpannableWidget() && ((Integer) catchingFishWorkManagerMVP.CatchingFishWorkManager()).intValue() == 402) ? CatchingFishBundleGlide.CatchingFishWorkManager(context, intent, z2).CatchingFishCoroutine(new CatchingFishExoPlayerRealm(), new CatchingFishLayoutLayout(18)) : catchingFishWorkManagerMVP;
            }
        }) : CatchingFishWorkManager(context, intent, z2);
    }

    public void CatchingFishEspressoTesting(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishEspressoTesting(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishFragmentFactory() {
        try {
            ((FileLock) this.CatchingFishWorkManager).release();
            ((FileChannel) this.CatchingFishDaggerWebsocket).close();
        } catch (IOException unused) {
        }
    }

    public void CatchingFishFragmentHandler(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishFragmentHandler(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public CatchingFishJUnitViewModel CatchingFishGsonAppCompat(InputConnection inputConnection, EditorInfo editorInfo) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
        if (inputConnection == null) {
            catchingFishViewPagerMockk.getClass();
            inputConnection = null;
        } else {
            CatchingFishBundleGlide catchingFishBundleGlide = (CatchingFishBundleGlide) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
            catchingFishBundleGlide.getClass();
            if (!(inputConnection instanceof CatchingFishJUnitViewModel)) {
                inputConnection = new CatchingFishJUnitViewModel((EditText) catchingFishBundleGlide.CatchingFishDaggerWebsocket, inputConnection, editorInfo);
            }
        }
        return (CatchingFishJUnitViewModel) inputConnection;
    }

    public void CatchingFishJetpackCompose(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishJetpackCompose(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public Drawable CatchingFishJobScheduler(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.CatchingFishWorkManager) == null) {
                this.CatchingFishWorkManager = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = CatchingFishJobScheduler(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void CatchingFishLayout(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishLayout(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x021d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ee A[Catch: IOException | XmlPullParserException -> 0x0223, IOException | XmlPullParserException -> 0x0223, TryCatch #0 {IOException | XmlPullParserException -> 0x0223, blocks: (B:17:0x0056, B:25:0x021d, B:25:0x021d, B:26:0x0068, B:27:0x0076, B:36:0x00ad, B:42:0x007a, B:45:0x0084, B:48:0x008e, B:51:0x0098, B:54:0x00bb, B:55:0x00c3, B:61:0x0138, B:61:0x0138, B:64:0x013f, B:64:0x013f, B:65:0x0157, B:65:0x0157, B:67:0x015a, B:67:0x015a, B:70:0x0165, B:70:0x0165, B:71:0x017d, B:71:0x017d, B:73:0x0180, B:73:0x0180, B:76:0x018b, B:76:0x018b, B:77:0x01a3, B:77:0x01a3, B:79:0x01a6, B:79:0x01a6, B:82:0x01b0, B:82:0x01b0, B:83:0x01c8, B:83:0x01c8, B:85:0x01cb, B:85:0x01cb, B:88:0x01d5, B:88:0x01d5, B:89:0x01ed, B:89:0x01ed, B:90:0x01ee, B:90:0x01ee, B:92:0x01fb, B:92:0x01fb, B:94:0x0208, B:94:0x0208, B:96:0x0211, B:96:0x0211, B:99:0x00c8, B:102:0x00d3, B:105:0x00de, B:108:0x00e7, B:111:0x00f2, B:114:0x00fc, B:117:0x0106, B:120:0x0110, B:123:0x011a, B:126:0x0124, B:129:0x021a, B:129:0x021a), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fb A[Catch: IOException | XmlPullParserException -> 0x0223, IOException | XmlPullParserException -> 0x0223, TryCatch #0 {IOException | XmlPullParserException -> 0x0223, blocks: (B:17:0x0056, B:25:0x021d, B:25:0x021d, B:26:0x0068, B:27:0x0076, B:36:0x00ad, B:42:0x007a, B:45:0x0084, B:48:0x008e, B:51:0x0098, B:54:0x00bb, B:55:0x00c3, B:61:0x0138, B:61:0x0138, B:64:0x013f, B:64:0x013f, B:65:0x0157, B:65:0x0157, B:67:0x015a, B:67:0x015a, B:70:0x0165, B:70:0x0165, B:71:0x017d, B:71:0x017d, B:73:0x0180, B:73:0x0180, B:76:0x018b, B:76:0x018b, B:77:0x01a3, B:77:0x01a3, B:79:0x01a6, B:79:0x01a6, B:82:0x01b0, B:82:0x01b0, B:83:0x01c8, B:83:0x01c8, B:85:0x01cb, B:85:0x01cb, B:88:0x01d5, B:88:0x01d5, B:89:0x01ed, B:89:0x01ed, B:90:0x01ee, B:90:0x01ee, B:92:0x01fb, B:92:0x01fb, B:94:0x0208, B:94:0x0208, B:96:0x0211, B:96:0x0211, B:99:0x00c8, B:102:0x00d3, B:105:0x00de, B:108:0x00e7, B:111:0x00f2, B:114:0x00fc, B:117:0x0106, B:120:0x0110, B:123:0x011a, B:126:0x0124, B:129:0x021a, B:129:0x021a), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208 A[Catch: IOException | XmlPullParserException -> 0x0223, IOException | XmlPullParserException -> 0x0223, TryCatch #0 {IOException | XmlPullParserException -> 0x0223, blocks: (B:17:0x0056, B:25:0x021d, B:25:0x021d, B:26:0x0068, B:27:0x0076, B:36:0x00ad, B:42:0x007a, B:45:0x0084, B:48:0x008e, B:51:0x0098, B:54:0x00bb, B:55:0x00c3, B:61:0x0138, B:61:0x0138, B:64:0x013f, B:64:0x013f, B:65:0x0157, B:65:0x0157, B:67:0x015a, B:67:0x015a, B:70:0x0165, B:70:0x0165, B:71:0x017d, B:71:0x017d, B:73:0x0180, B:73:0x0180, B:76:0x018b, B:76:0x018b, B:77:0x01a3, B:77:0x01a3, B:79:0x01a6, B:79:0x01a6, B:82:0x01b0, B:82:0x01b0, B:83:0x01c8, B:83:0x01c8, B:85:0x01cb, B:85:0x01cb, B:88:0x01d5, B:88:0x01d5, B:89:0x01ed, B:89:0x01ed, B:90:0x01ee, B:90:0x01ee, B:92:0x01fb, B:92:0x01fb, B:94:0x0208, B:94:0x0208, B:96:0x0211, B:96:0x0211, B:99:0x00c8, B:102:0x00d3, B:105:0x00de, B:108:0x00e7, B:111:0x00f2, B:114:0x00fc, B:117:0x0106, B:120:0x0110, B:123:0x011a, B:126:0x0124, B:129:0x021a, B:129:0x021a), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211 A[Catch: IOException | XmlPullParserException -> 0x0223, IOException | XmlPullParserException -> 0x0223, TryCatch #0 {IOException | XmlPullParserException -> 0x0223, blocks: (B:17:0x0056, B:25:0x021d, B:25:0x021d, B:26:0x0068, B:27:0x0076, B:36:0x00ad, B:42:0x007a, B:45:0x0084, B:48:0x008e, B:51:0x0098, B:54:0x00bb, B:55:0x00c3, B:61:0x0138, B:61:0x0138, B:64:0x013f, B:64:0x013f, B:65:0x0157, B:65:0x0157, B:67:0x015a, B:67:0x015a, B:70:0x0165, B:70:0x0165, B:71:0x017d, B:71:0x017d, B:73:0x0180, B:73:0x0180, B:76:0x018b, B:76:0x018b, B:77:0x01a3, B:77:0x01a3, B:79:0x01a6, B:79:0x01a6, B:82:0x01b0, B:82:0x01b0, B:83:0x01c8, B:83:0x01c8, B:85:0x01cb, B:85:0x01cb, B:88:0x01d5, B:88:0x01d5, B:89:0x01ed, B:89:0x01ed, B:90:0x01ee, B:90:0x01ee, B:92:0x01fb, B:92:0x01fb, B:94:0x0208, B:94:0x0208, B:96:0x0211, B:96:0x0211, B:99:0x00c8, B:102:0x00d3, B:105:0x00de, B:108:0x00e7, B:111:0x00f2, B:114:0x00fc, B:117:0x0106, B:120:0x0110, B:123:0x011a, B:126:0x0124, B:129:0x021a, B:129:0x021a), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishMVPRobolectric(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        CatchingFishMoshiPicasso catchingFishMoshiPicasso;
        char c;
        CatchingFishAnimationBundle catchingFishAnimationBundle = new CatchingFishAnimationBundle();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    catchingFishMoshiPicasso = null;
                } catch (IOException | XmlPullParserException unused) {
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c2 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c2 = 6;
                                        switch (c2) {
                                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                catchingFishMoshiPicasso = CatchingFishAnimationBundle.CatchingFishReduxKtor(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                break;
                                            case 1:
                                                catchingFishMoshiPicasso = CatchingFishAnimationBundle.CatchingFishReduxKtor(context, Xml.asAttributeSet(xmlResourceParser), true);
                                                break;
                                            case 2:
                                                catchingFishMoshiPicasso = CatchingFishAnimationBundle.CatchingFishReduxKtor(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                catchingFishMoshiPicasso.CatchingFishReduxKtor.CatchingFishParcelableFAB = true;
                                                break;
                                            case 3:
                                                catchingFishMoshiPicasso = CatchingFishAnimationBundle.CatchingFishReduxKtor(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                catchingFishMoshiPicasso.CatchingFishReduxKtor.CatchingFishReduxMoshi = 1;
                                                break;
                                            case 4:
                                                if (catchingFishMoshiPicasso == null) {
                                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                                }
                                                catchingFishMoshiPicasso.CatchingFishSnackbar.CatchingFishParcelableFAB(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                                if (catchingFishMoshiPicasso == null) {
                                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                                }
                                                catchingFishMoshiPicasso.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                                if (catchingFishMoshiPicasso == null) {
                                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                                }
                                                catchingFishMoshiPicasso.CatchingFishReduxKtor.CatchingFishParcelableFAB(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                                if (catchingFishMoshiPicasso == null) {
                                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                                }
                                                catchingFishMoshiPicasso.CatchingFishCoroutine.CatchingFishParcelableFAB(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                            case '\t':
                                                if (catchingFishMoshiPicasso == null) {
                                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                                }
                                                CatchingFishViewModelBundle.CatchingFishParcelableFAB(context, xmlResourceParser, catchingFishMoshiPicasso.CatchingFishWorkManager);
                                                break;
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c2 = 7;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c2 = 1;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c2 = 4;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c2 = 5;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c2 = 2;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c2 = '\t';
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c2 = '\b';
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c2 = 0;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                default:
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                ((SparseArray) this.CatchingFishWorkManager).put(identifier, catchingFishAnimationBundle);
                                return;
                            } else if (c == 1 || c == 2 || c == 3) {
                                catchingFishAnimationBundle.CatchingFishCoroutine.put(Integer.valueOf(catchingFishMoshiPicasso.CatchingFishParcelableFAB), catchingFishMoshiPicasso);
                                catchingFishMoshiPicasso = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.CatchingFishWorkManager).put(identifier, catchingFishAnimationBundle);
                return;
            }
        }
    }

    public void CatchingFishMutableLiveData(boolean z) {
        CatchingFishFABRecyclerView catchingFishFABRecyclerView = (CatchingFishFABRecyclerView) ((CatchingFishBundleGlide) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).CatchingFishWorkManager;
        if (catchingFishFABRecyclerView.CatchingFishWorkManager != z) {
            if (catchingFishFABRecyclerView.CatchingFishDaggerWebsocket != null) {
                CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
                CatchingFishCardViewJUnit catchingFishCardViewJUnit = catchingFishFABRecyclerView.CatchingFishDaggerWebsocket;
                CatchingFishParcelableFAB.getClass();
                CatchingFishHiltMVPToast.CatchingFishWorkManager(catchingFishCardViewJUnit, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = CatchingFishParcelableFAB.CatchingFishParcelableFAB;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    CatchingFishParcelableFAB.CatchingFishSnackbar.remove(catchingFishCardViewJUnit);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            catchingFishFABRecyclerView.CatchingFishWorkManager = z;
            if (z) {
                CatchingFishFABRecyclerView.CatchingFishParcelableFAB(catchingFishFABRecyclerView.CatchingFishReduxKtor, CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishSnackbar());
            }
        }
    }

    public void CatchingFishNavigation(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishNavigation(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishOkHttp(boolean z) {
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = (CatchingFishToastSharedFlow) this.CatchingFishWorkManager;
        FragmentActivity fragmentActivity = catchingFishToastSharedFlow.CatchingFishJetpackCompose.CatchingFishCoroutineFlow;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishToastSharedFlow.CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishOkHttp(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // kotlin.text.CatchingFishSpannableGson
    public Object CatchingFishParcelableFAB() {
        return (CatchingFishGlideViewPager) this.CatchingFishDaggerWebsocket;
    }

    public void CatchingFishParcelableFlux(AttributeSet attributeSet, int i) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.CatchingFishDaggerWebsocket;
                CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(absSeekBar.getContext(), attributeSet, CatchingFishViewModelScope, i);
                Drawable CatchingFishJobScheduler = CatchingFishRecyclerView.CatchingFishJobScheduler(0);
                if (CatchingFishJobScheduler != null) {
                    if (CatchingFishJobScheduler instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) CatchingFishJobScheduler;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable CatchingFishJobScheduler2 = CatchingFishJobScheduler(animationDrawable.getFrame(i2), true);
                            CatchingFishJobScheduler2.setLevel(10000);
                            animationDrawable2.addFrame(CatchingFishJobScheduler2, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        CatchingFishJobScheduler = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(CatchingFishJobScheduler);
                }
                Drawable CatchingFishJobScheduler3 = CatchingFishRecyclerView.CatchingFishJobScheduler(1);
                if (CatchingFishJobScheduler3 != null) {
                    absSeekBar.setProgressDrawable(CatchingFishJobScheduler(CatchingFishJobScheduler3, false));
                }
                CatchingFishRecyclerView.CatchingFishAnimation();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.CatchingFishDaggerWebsocket).getContext().obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishLayout, i, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    CatchingFishMutableLiveData(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public boolean CatchingFishPayPal(CatchingFishGradleSpannable catchingFishGradleSpannable, Menu menu) {
        ViewGroup viewGroup = ((CatchingFishMockkWidgetKtor) this.CatchingFishWorkManager).CatchingFishFragmentFactory;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        viewGroup.requestApplyInsets();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = (CatchingFishFluxFluxBundle) this.CatchingFishDaggerWebsocket;
        ActionMode.Callback callback = (ActionMode.Callback) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        CatchingFishKtorMVIMoshi CatchingFishOkHttp = catchingFishFluxFluxBundle.CatchingFishOkHttp(catchingFishGradleSpannable);
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        Menu menu2 = (Menu) catchingFishGraphQLRealmFAB.get(menu);
        if (menu2 == null) {
            menu2 = new CatchingFishOkHttpHiltFAB((Context) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket, (CatchingFishSharedFlowAdMob) menu);
            catchingFishGraphQLRealmFAB.put(menu, menu2);
        }
        return callback.onPrepareActionMode(CatchingFishOkHttp, menu2);
    }

    public void CatchingFishRoomDatabase(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishRoomDatabase(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // kotlin.text.CatchingFishSpannableGson
    public boolean CatchingFishSnackbar(CharSequence charSequence, int i, int i2, CatchingFishFirebaseFABGson catchingFishFirebaseFABGson) {
        if ((catchingFishFirebaseFABGson.CatchingFishCoroutine & 4) > 0) {
            return true;
        }
        if (((CatchingFishGlideViewPager) this.CatchingFishDaggerWebsocket) == null) {
            this.CatchingFishDaggerWebsocket = new CatchingFishGlideViewPager(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((CatchingFishGradleMVVM) this.CatchingFishWorkManager).getClass();
        ((CatchingFishGlideViewPager) this.CatchingFishDaggerWebsocket).setSpan(new CatchingFishDaggerRealm(catchingFishFirebaseFABGson), i, i2, 33);
        return true;
    }

    public void CatchingFishSpannableWidget() {
        ((SparseIntArray) this.CatchingFishDaggerWebsocket).clear();
    }

    public void CatchingFishStateLiveData(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishStateLiveData(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishUnitTesting(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishUnitTesting(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishViewModelFAB(boolean z) {
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = (CatchingFishToastSharedFlow) this.CatchingFishWorkManager;
        FragmentActivity fragmentActivity = catchingFishToastSharedFlow.CatchingFishJetpackCompose.CatchingFishCoroutineFlow;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishToastSharedFlow.CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishViewModelFAB(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void CatchingFishViewModelScope(boolean z) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = ((CatchingFishToastSharedFlow) this.CatchingFishWorkManager).CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishEspressoTesting.CatchingFishViewModelScope(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.CatchingFishDaggerWebsocket).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // kotlin.text.CatchingFishMockkDaggerHilt
    public void onCancel() {
        ((Animator) this.CatchingFishDaggerWebsocket).end();
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            Objects.toString((CatchingFishMVPDatabinding) this.CatchingFishWorkManager);
        }
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onFail(String str) {
        ((CatchingFishUnitTesting) this.CatchingFishWorkManager).CatchingFishParcelableFAB();
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onInstallReferrerRead(GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails) {
        CatchingFishAdMob catchingFishAdMob = (CatchingFishAdMob) this.CatchingFishDaggerWebsocket;
        String str = googlePlayInstallReferrerDetails != null ? googlePlayInstallReferrerDetails.installReferrer : null;
        if (str == null) {
            str = "";
        }
        catchingFishAdMob.CatchingFishFragmentHandler(str);
    }

    public /* synthetic */ CatchingFishBundleGlide(int i, boolean z) {
        this.CatchingFishReduxKtor = i;
    }

    public CatchingFishBundleGlide(String str, CatchingFishGsonCardView catchingFishGsonCardView, CatchingFishMVPExoPlayer catchingFishMVPExoPlayer) {
        this.CatchingFishReduxKtor = 6;
        this.CatchingFishWorkManager = str;
        this.CatchingFishDaggerWebsocket = catchingFishGsonCardView;
    }

    public CatchingFishBundleGlide(MainActivity mainActivity, String str, CatchingFishWidgetContext catchingFishWidgetContext) {
        this.CatchingFishReduxKtor = 3;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "zeroAdvertisingId");
        this.CatchingFishDaggerWebsocket = mainActivity;
        this.CatchingFishWorkManager = str;
    }

    public CatchingFishBundleGlide(AbsSeekBar absSeekBar) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = absSeekBar;
    }

    public CatchingFishBundleGlide(EditText editText, int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 18:
                this.CatchingFishDaggerWebsocket = editText;
                CatchingFishFABRecyclerView catchingFishFABRecyclerView = new CatchingFishFABRecyclerView(editText);
                this.CatchingFishWorkManager = catchingFishFABRecyclerView;
                editText.addTextChangedListener(catchingFishFABRecyclerView);
                if (CatchingFishMVIIntent.CatchingFishSnackbar == null) {
                    synchronized (CatchingFishMVIIntent.CatchingFishParcelableFAB) {
                        try {
                            if (CatchingFishMVIIntent.CatchingFishSnackbar == null) {
                                CatchingFishMVIIntent catchingFishMVIIntent = new CatchingFishMVIIntent();
                                try {
                                    CatchingFishMVIIntent.CatchingFishCoroutine = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, CatchingFishMVIIntent.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                CatchingFishMVIIntent.CatchingFishSnackbar = catchingFishMVIIntent;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(CatchingFishMVIIntent.CatchingFishSnackbar);
                return;
            default:
                this.CatchingFishDaggerWebsocket = editText;
                this.CatchingFishWorkManager = new CatchingFishViewPagerMockk(editText);
                return;
        }
    }

    public CatchingFishBundleGlide(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        this.CatchingFishReduxKtor = 25;
        this.CatchingFishDaggerWebsocket = new CopyOnWriteArrayList();
        this.CatchingFishWorkManager = catchingFishToastSharedFlow;
    }

    public CatchingFishBundleGlide(Context context, int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 12:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(CatchingFishOkHttpFAB.CatchingFishLayoutInflater(com.catchingfish.fishcatcherpro.R.attr.materialCalendarStyle, context, CatchingFishRetrofitRealm.class.getCanonicalName()).data, CatchingFishSnackbarPicasso.CatchingFishOkHttp);
                CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(4, 0));
                CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(2, 0));
                CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(3, 0));
                CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList CatchingFishNavigation = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 7);
                this.CatchingFishDaggerWebsocket = CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(9, 0));
                CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(8, 0));
                this.CatchingFishWorkManager = CatchingFishMVPExoPlayer.CatchingFishUnitTesting(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(CatchingFishNavigation.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
            default:
                this.CatchingFishDaggerWebsocket = context;
                this.CatchingFishWorkManager = new CatchingFishExoPlayerRealm();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishBundleGlide(CatchingFishLayoutViewPager catchingFishLayoutViewPager, CatchingFishMockkView catchingFishMockkView) {
        this.CatchingFishReduxKtor = 22;
        this.CatchingFishDaggerWebsocket = catchingFishLayoutViewPager;
        this.CatchingFishWorkManager = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    public CatchingFishBundleGlide(Animation animation) {
        this.CatchingFishReduxKtor = 24;
        this.CatchingFishDaggerWebsocket = animation;
        this.CatchingFishWorkManager = null;
    }

    public CatchingFishBundleGlide(Animator animator) {
        this.CatchingFishReduxKtor = 24;
        this.CatchingFishDaggerWebsocket = null;
        this.CatchingFishWorkManager = animator;
    }

    public CatchingFishBundleGlide(int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 26:
                this.CatchingFishDaggerWebsocket = new SparseIntArray();
                this.CatchingFishWorkManager = new SparseIntArray();
                break;
            case 27:
            default:
                this.CatchingFishDaggerWebsocket = Choreographer.getInstance();
                this.CatchingFishWorkManager = Looper.myLooper();
                break;
            case 28:
                this.CatchingFishDaggerWebsocket = new CatchingFishViewWidgetFAB(100);
                this.CatchingFishWorkManager = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(Boolean.FALSE);
                break;
        }
    }

    public CatchingFishBundleGlide(CatchingFishReduxDataStore catchingFishReduxDataStore) {
        this.CatchingFishReduxKtor = 4;
        this.CatchingFishWorkManager = catchingFishReduxDataStore;
    }

    public CatchingFishBundleGlide(Matcher matcher, String str) {
        this.CatchingFishReduxKtor = 29;
        this.CatchingFishDaggerWebsocket = matcher;
    }

    public CatchingFishBundleGlide(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        this.CatchingFishReduxKtor = 7;
        this.CatchingFishWorkManager = catchingFishMockkWidgetKtor;
        this.CatchingFishDaggerWebsocket = catchingFishFluxFluxBundle;
    }
}
