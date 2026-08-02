package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.widget.Magnifier;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class og3 implements ng3, mof, utk, puk {
    public static final og3 b = new og3(0);
    public static final og3 c = new og3(1);
    public static final og3 d = new og3(2);
    public static final og3 e = new og3(3);
    public final /* synthetic */ int a;

    public /* synthetic */ og3(int i) {
        this.a = i;
    }

    public static final sgr e(PackageManager packageManager, int i, List list) {
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            return sgr.k.i("Rejected by (SHA-256 hash signature check) security policy");
        }
        for (String str : packagesForUid) {
            str.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
                if (signingInfo != null) {
                    Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                    apkContentsSigners.getClass();
                    for (Signature signature : apkContentsSigners) {
                        signature.getClass();
                        if (!g(signature, list)) {
                        }
                    }
                }
            } else {
                Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                if (signatureArr != null && signatureArr.length == 1) {
                    Signature signature2 = signatureArr[0];
                    signature2.getClass();
                    if (g(signature2, list)) {
                    }
                }
            }
            sgr sgrVar = sgr.e;
            sgrVar.getClass();
            return sgrVar;
        }
        return sgr.j.i("Rejected by (SHA-256 hash signature check) security policy");
    }

    public static Typeface f(String str, tqc tqcVar, int i) {
        if (i == 0 && Intrinsics.d(tqcVar, tqc.m) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), tqcVar.a, i == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(Signature signature, List list) {
        kzh kzhVar;
        int digestLength;
        int i;
        tsd tsdVar;
        List list2;
        Iterator it;
        int i2 = etd.a;
        mzh mzhVar = dtd.a;
        byte[] byteArray = signature.toByteArray();
        mzhVar.getClass();
        int length = byteArray.length;
        o2g.Q(0, length, byteArray.length);
        o2g.G(length, "expectedInputSize must be >= 0 but was %s", length >= 0);
        int i3 = mzhVar.i;
        MessageDigest messageDigest = mzhVar.h;
        try {
            if (mzhVar.j) {
                try {
                    kzhVar = new kzh((MessageDigest) messageDigest.clone(), i3, 0);
                } catch (CloneNotSupportedException unused) {
                }
                o2g.Q(0, length, byteArray.length);
                o2g.U("Cannot re-use a Hasher after calling hash() on it", !kzhVar.c);
                MessageDigest messageDigest2 = kzhVar.a;
                messageDigest2.update(byteArray, 0, length);
                o2g.U("Cannot re-use a Hasher after calling hash() on it", !kzhVar.c);
                kzhVar.c = true;
                digestLength = messageDigest2.getDigestLength();
                i = kzhVar.b;
                if (i != digestLength) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = usd.a;
                    tsdVar = new tsd(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i);
                    char[] cArr2 = usd.a;
                    tsdVar = new tsd(copyOf);
                }
                byte[] bArr = (byte[]) tsdVar.b.clone();
                list2 = list;
                if (!(list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                it = list2.iterator();
                while (it.hasNext()) {
                    if (Arrays.equals((byte[]) it.next(), bArr)) {
                        return true;
                    }
                }
                return false;
            }
            kzhVar = new kzh(MessageDigest.getInstance(messageDigest.getAlgorithm()), i3, 0);
            o2g.Q(0, length, byteArray.length);
            o2g.U("Cannot re-use a Hasher after calling hash() on it", !kzhVar.c);
            MessageDigest messageDigest22 = kzhVar.a;
            messageDigest22.update(byteArray, 0, length);
            o2g.U("Cannot re-use a Hasher after calling hash() on it", !kzhVar.c);
            kzhVar.c = true;
            digestLength = messageDigest22.getDigestLength();
            i = kzhVar.b;
            if (i != digestLength) {
            }
            byte[] bArr2 = (byte[]) tsdVar.b.clone();
            list2 = list;
            if (!(list2 instanceof Collection)) {
            }
            it = list2.iterator();
            while (it.hasNext()) {
            }
            return false;
        } catch (NoSuchAlgorithmException e2) {
            xq0.w(e2);
            return false;
        }
    }

    @Override // defpackage.mof
    public Object N(xod xodVar, Continuation continuation) {
        return Bitmap.createBitmap(new pof(xodVar));
    }

    @Override // defpackage.utk
    public ttk a(View view, jx7 jx7Var) {
        switch (this.a) {
            case 2:
                return new vtk(new Magnifier(view));
            default:
                return new wtk(new Magnifier(view));
        }
    }

    @Override // defpackage.puk
    public Typeface b(tqc tqcVar, int i) {
        return f(null, tqcVar, i);
    }

    @Override // defpackage.utk
    public boolean c() {
        switch (this.a) {
            case 2:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.puk
    public Typeface d(l5d l5dVar, tqc tqcVar, int i) {
        return f(l5dVar.f, tqcVar, i);
    }

    @Override // defpackage.ng3
    public Rect p(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException ? true : e3 instanceof NoSuchMethodException ? true : e3 instanceof NoSuchFieldException ? true : e3 instanceof IllegalAccessException ? true : e3 instanceof InvocationTargetException ? true : e3 instanceof InstantiationException)) {
                    throw e3;
                }
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
