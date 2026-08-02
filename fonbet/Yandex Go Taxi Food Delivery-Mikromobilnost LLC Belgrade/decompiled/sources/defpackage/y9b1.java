package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_face.n;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class y9b1 {
    public static j1b1 a;
    public static au2 b;

    public static void a(View view) {
        Object tag = view.getTag(xbh0.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.m(view, floatValue);
        }
        view.setTag(xbh0.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static final au2 b() {
        au2 au2Var = b;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(20.0f, 8.0f);
        e.e(0.0f, -1.86f, 0.0f, -2.8f, -0.3f, -3.53f);
        e.b(4.0f, 4.0f, false, false, -2.17f, -2.17f);
        e.d(16.8f, 2.0f, 15.86f, 2.0f, 14.0f, 2.0f);
        e.g(-4.0f);
        e.e(-1.86f, 0.0f, -2.8f, 0.0f, -3.53f, 0.3f);
        e.a(4.0f, 4.0f, false, false, 4.3f, 4.47f);
        e.d(4.0f, 5.21f, 4.0f, 6.14f, 4.0f, 8.0f);
        e.p(14.0f);
        e.g(1.5f);
        e.i(6.5f, -4.0f);
        e.i(6.5f, 4.0f);
        e.f(20.0f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        b = a2;
        return a2;
    }

    public static final String c(kvj0 kvj0Var) {
        String string;
        Object b2;
        kotlinx.serialization.json.b bVar;
        String str = null;
        try {
            rvj0 rvj0Var = kvj0Var.z;
            if (rvj0Var != null && (string = rvj0Var.string()) != null) {
                if (kotlinx.serialization.json.b.class.equals(zy11.class)) {
                    b2 = (kotlinx.serialization.json.b) zy11.a;
                } else {
                    zcx zcxVar = qr20.a;
                    zcxVar.getClass();
                    b2 = zcxVar.b(kotlinx.serialization.json.b.Companion.serializer(), string);
                }
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) b2;
                if (bVar2 != null && (bVar = (kotlinx.serialization.json.b) qcx.m(bVar2).get(Constants.KEY_MESSAGE)) != null) {
                    str = qcx.n(bVar).a();
                }
            }
        } catch (Throwable unused) {
        }
        return str == null ? "Empty message" : str;
    }

    public static void d(RecyclerView recyclerView, View view, float f, float f2, boolean z) {
        if (z && view.getTag(xbh0.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = b.a;
            Float valueOf = Float.valueOf(ViewCompat$Api21Impl.f(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = b.a;
                    float f4 = ViewCompat$Api21Impl.f(childAt);
                    if (f4 > f3) {
                        f3 = f4;
                    }
                }
            }
            ViewCompat$Api21Impl.m(view, f3 + 1.0f);
            view.setTag(xbh0.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public static synchronized n e(String str) {
        n nVar;
        synchronized (y9b1.class) {
            v5b1 v5b1Var = new v5b1();
            v5b1Var.a = str;
            int i = 1;
            v5b1Var.b = true;
            byte b2 = (byte) (v5b1Var.d | 1);
            v5b1Var.c = 1;
            v5b1Var.d = (byte) (b2 | 2);
            c6b1 a2 = v5b1Var.a();
            synchronized (y9b1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(i);
                    }
                    nVar = (n) a.b(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return nVar;
        }
        return nVar;
    }
}
