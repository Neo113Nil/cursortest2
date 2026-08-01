package E3;

import a1.InterfaceC0425b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC0480x;
import androidx.fragment.app.C0461d;
import b2.InterfaceC0515b;
import com.google.firebase.components.ComponentRegistrar;
import f2.C4507a;
import f2.C4508b;
import i2.InterfaceC4581a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k1.C4629a;
import r0.InterfaceC4945c;
import s1.InterfaceC4970e;
import v1.InterfaceC5104a;
import w1.InterfaceC5143a;

/* loaded from: classes2.dex */
public class e implements B1.o, L3.s, O1.a, InterfaceC0425b, com.bumptech.glide.manager.f, InterfaceC0515b, InterfaceC4581a, InterfaceC4945c, InterfaceC5104a, InterfaceC5143a {
    public static String[] B(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static void u(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static S0.e v(Context context, String[] strArr, String str, Z2.e eVar) {
        String[] B9 = B(context);
        int length = B9.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = B9[i];
            int i6 = 0;
            while (true) {
                int i9 = i6 + 1;
                if (i6 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i6 = i9;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c9 = File.separatorChar;
                            sb.append(c9);
                            sb.append(str3);
                            sb.append(c9);
                            sb.append(str);
                            String sb2 = sb.toString();
                            eVar.getClass();
                            Z2.e.A("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                S0.e eVar2 = new S0.e(4, false);
                                eVar2.f2781u = zipFile;
                                eVar2.f2782v = entry;
                                return eVar2;
                            }
                        }
                        i10 = i11;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static String[] x(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c9 = File.separatorChar;
        sb.append(c9);
        sb.append("([^\\");
        sb.append(c9);
        sb.append("]*)");
        sb.append(c9);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : B(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y(c0.b bVar, Editable editable, int i, int i6, boolean z3) {
        int min;
        if (editable != null && i >= 0 && i6 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z6) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z6 = true;
                                    }
                                } else if (!z6) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i6, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z9) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z9 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i6, editable.length());
                }
                androidx.emoji2.text.v[] vVarArr = (androidx.emoji2.text.v[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (androidx.emoji2.text.v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public List A(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (R3.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2714a;
            if (str != null) {
                C0461d c0461d = new C0461d(7, str, bVar);
                bVar = new R3.b(str, bVar.f2715b, bVar.f2716c, bVar.f2717d, bVar.f2718e, c0461d, bVar.f2720g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // r0.InterfaceC4945c
    public void a(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // v1.InterfaceC5104a
    public Bitmap c(int i, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i6, config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // L3.s
    public Object e(IBinder iBinder) {
        int i = K3.c.f1575u;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        return queryLocalInterface instanceof K3.d ? (K3.d) queryLocalInterface : new K3.b(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService", 3);
    }

    @Override // O1.a
    public Object f() {
        return new ArrayList();
    }

    @Override // i2.InterfaceC4581a
    public long g() {
        return System.currentTimeMillis();
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        e eVar = new e();
        HashMap hashMap = new HashMap();
        W1.d dVar = W1.d.f3407n;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar, new C4508b(30000L, 86400000L, set));
        W1.d dVar2 = W1.d.f3409v;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar2, new C4508b(1000L, 86400000L, set));
        W1.d dVar3 = W1.d.f3408u;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(f2.d.f37466u)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar3, new C4508b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < W1.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C4507a(eVar, hashMap);
    }

    @Override // a1.InterfaceC0425b
    public boolean h(float f3) {
        throw new IllegalStateException("not implemented");
    }

    @Override // a1.InterfaceC0425b
    public C4629a i() {
        throw new IllegalStateException("not implemented");
    }

    @Override // a1.InterfaceC0425b
    public boolean isEmpty() {
        return true;
    }

    @Override // r0.InterfaceC4945c
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a1.InterfaceC0425b
    public boolean k(float f3) {
        return false;
    }

    @Override // w1.InterfaceC5143a
    public File m(InterfaceC4970e interfaceC4970e) {
        return null;
    }

    @Override // v1.InterfaceC5104a
    public Bitmap n(int i, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i6, config);
    }

    @Override // a1.InterfaceC0425b
    public float q() {
        return 1.0f;
    }

    @Override // a1.InterfaceC0425b
    public float r() {
        return 0.0f;
    }

    public Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean z(CharSequence charSequence) {
        return charSequence instanceof M.f;
    }

    @Override // B1.o
    public void o() {
    }

    @Override // v1.InterfaceC5104a
    public void t() {
    }

    @Override // com.bumptech.glide.manager.f
    public void l(AbstractActivityC0480x abstractActivityC0480x) {
    }

    @Override // v1.InterfaceC5104a
    public void s(int i) {
    }

    @Override // w1.InterfaceC5143a
    public void b(InterfaceC4970e interfaceC4970e, j4.g gVar) {
    }

    @Override // B1.o
    public void p(Bitmap bitmap, InterfaceC5104a interfaceC5104a) {
    }
}
