package m0;

import J1.t;
import a1.C0099o;
import a1.InterfaceC0095k;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.watchfacestudio.spraktum.R;
import f1.C0165P;
import io.appmetrica.analytics.impl.C0376e9;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0978b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public final class j implements N.d, InterfaceC0095k {

    /* renamed from: b, reason: collision with root package name */
    public static j f8179b;

    /* renamed from: c, reason: collision with root package name */
    public static j f8180c;

    /* renamed from: d, reason: collision with root package name */
    public static j f8181d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8182a;

    public /* synthetic */ j(int i2, Object obj) {
        this.f8182a = i2;
    }

    public static final String b(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f8324e;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > i6 && bArr[i8] != 10) {
                i8 += i6;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i3 = i9 + i10;
                if (bArr[i3] == 10) {
                    break;
                }
                i10++;
            }
            int i11 = i3 - i9;
            int i12 = i2;
            boolean z3 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i12][i13];
                    byte[] bArr4 = K1.b.f1051a;
                    int i15 = b2 & 255;
                    z2 = z3;
                    i4 = i15;
                }
                byte b3 = bArr[i9 + i14];
                byte[] bArr5 = K1.b.f1051a;
                i5 = i4 - (b3 & 255);
                if (i5 != 0) {
                    break;
                }
                i14++;
                i13++;
                if (i14 == i11) {
                    break;
                }
                if (bArr2[i12].length != i13) {
                    z3 = z2;
                } else {
                    if (i12 == bArr2.length - 1) {
                        break;
                    }
                    i12++;
                    z3 = true;
                    i13 = -1;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i16 = i11 - i14;
                    int length2 = bArr2[i12].length - i13;
                    int length3 = bArr2.length;
                    for (int i17 = i12 + 1; i17 < length3; i17++) {
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.i.d(UTF_8, "UTF_8");
                            return new String(bArr, i9, i11, UTF_8);
                        }
                    }
                }
                i7 = i3 + 1;
                i6 = -1;
            }
            length = i8;
            i6 = -1;
        }
        return null;
    }

    public static ArrayList c(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i1.k.E(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).f970a);
        }
        return arrayList2;
    }

    public static byte[] e(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        W1.g gVar = new W1.g();
        Iterator it = c(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            gVar.u(str.length());
            gVar.x(str);
        }
        return gVar.j(gVar.f1875b);
    }

    public static W1.j g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (X1.b.a(str.charAt(i3 + 1)) + (X1.b.a(str.charAt(i3)) << 4));
        }
        return new W1.j(bArr);
    }

    public static W1.j j(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(z1.a.f8620a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        W1.j jVar = new W1.j(bytes);
        jVar.f1879c = str;
        return jVar;
    }

    public static boolean k() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static final n o(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].equals(oVar)) {
                    return nVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z2;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z2 ? o(packageInfo2, p.f8190a) : o(packageInfo2, p.f8190a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z2 = true;
        if (packageInfo != null) {
            if ((!z2 ? o(packageInfo2, p.f8190a) : o(packageInfo2, p.f8190a[0])) == null) {
            }
        }
        return false;
    }

    @Override // N.d
    public void a(int i2, Serializable serializable) {
        String str;
        switch (this.f8182a) {
            case 8:
                break;
            default:
                switch (i2) {
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
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // N.d
    public void d() {
        switch (this.f8182a) {
            case 8:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public List f(String str) {
        switch (this.f8182a) {
            case 28:
                try {
                    Object readObject = new C0165P(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                    kotlin.jvm.internal.i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return (List) readObject;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                Object readObject2 = new C0165P(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                kotlin.jvm.internal.i.c(readObject2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject2) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String h(List list) {
        switch (this.f8182a) {
            case 28:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    kotlin.jvm.internal.i.d(encodeToString, "encodeToString(...)");
                    return encodeToString;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString2 = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                kotlin.jvm.internal.i.d(encodeToString2, "encodeToString(...)");
                return encodeToString2;
        }
    }

    @Override // a1.InterfaceC0095k
    public void i(x0.e eVar, Z0.j jVar) {
        switch (this.f8182a) {
            case C0376e9.f5885F /* 25 */:
                jVar.c(null);
                break;
            default:
                jVar.c(null);
                break;
        }
    }

    public CharSequence n(Preference preference) {
        switch (this.f8182a) {
            case 6:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f2507a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f2507a.getString(R.string.not_set);
                }
                return null;
        }
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f8182a = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(I0.b fragmentManager, int i2) {
        this(4);
        this.f8182a = i2;
        switch (i2) {
            case 4:
                break;
            default:
                kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
                new CopyOnWriteArrayList();
                break;
        }
    }

    public j(int i2) {
        this.f8182a = i2;
        switch (i2) {
            case 17:
                new C0978b();
                new l.e();
                break;
            default:
                new CopyOnWriteArrayList();
                break;
        }
    }

    public j(R0.b bVar) {
        this.f8182a = 26;
        new I0.b(bVar, "flutter/deferredcomponent", C0099o.f2035b, 9).M(new C.j(23, this));
        I0.b.F().getClass();
        new HashMap();
    }

    private final void l() {
    }

    private final void m(int i2, Serializable serializable) {
    }
}
