package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.UserManager;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.go.analytics.AccountType;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsView;
import com.ybsdk.feature.passport.impl.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.settings.MainMenuButton;

/* loaded from: classes9.dex */
public abstract class wwg {
    public static a c;
    public static final Object a = new Object();
    public static final o2f b = new o2f(2);
    public static final Object d = new Object();

    public static Object A(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == JSONObject.NULL) {
            return null;
        }
        return opt;
    }

    public static int B(String str) {
        String str2;
        if (str.length() <= 0) {
            ny61.g("Expected color string, actual string is empty");
            return 0;
        }
        if (str.charAt(0) != '#') {
            w511.f("Unknown color ".concat(str));
            return 0;
        }
        int length = str.length();
        if (length == 4) {
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            char charAt3 = str.charAt(3);
            str2 = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
        } else if (length == 5) {
            char charAt4 = str.charAt(1);
            char charAt5 = str.charAt(2);
            char charAt6 = str.charAt(3);
            char charAt7 = str.charAt(4);
            str2 = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
        } else if (length == 7) {
            str2 = "ff".concat(str.substring(1));
        } else {
            if (length != 9) {
                ny61.g("Unknown color ".concat(str));
                return 0;
            }
            str2 = str.substring(1);
        }
        rza.a(16);
        return (int) Long.parseLong(str2, 16);
    }

    public static final Long C(oeu oeuVar) {
        Long m = m(oeuVar.a("X-Yataxi-Polling-Interval-Ms"));
        return (m == null && (m = m(oeuVar.a("X-Polling-Delay"))) == null) ? m(oeuVar.a("X-Yataxi-Polling-Interval")) : m;
    }

    public static final long D(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static Object E(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw fg90.h(str, jSONObject);
        }
        try {
            Object a2 = ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
            if (a2 != null) {
                return a2;
            }
            throw fg90.f(jSONObject, str, null);
        } catch (Exception e) {
            throw fg90.b(jSONObject, str, e);
        }
    }

    public static Object F(String str, JSONObject jSONObject) {
        Object A = A(str, jSONObject);
        if (A != null) {
            return A;
        }
        throw fg90.h(str, jSONObject);
    }

    public static Object G(JSONObject jSONObject, String str, tls tlsVar) {
        Object A = A(str, jSONObject);
        if (A == null) {
            throw fg90.h(str, jSONObject);
        }
        try {
            Object invoke = tlsVar.invoke(A);
            if (invoke != null) {
                return invoke;
            }
            throw fg90.f(jSONObject, str, A);
        } catch (ClassCastException unused) {
            throw fg90.m(jSONObject, str, A);
        } catch (Exception e) {
            throw fg90.g(jSONObject, str, A, e);
        }
    }

    public static Object H(JSONObject jSONObject, String str, tls tlsVar, r131 r131Var) {
        Object A = A(str, jSONObject);
        if (A == null) {
            throw fg90.h(str, jSONObject);
        }
        try {
            Object invoke = tlsVar.invoke(A);
            if (invoke == null) {
                throw fg90.f(jSONObject, str, A);
            }
            try {
                if (r131Var.l(invoke)) {
                    return invoke;
                }
                throw fg90.f(jSONObject, str, invoke);
            } catch (ClassCastException unused) {
                throw fg90.m(jSONObject, str, invoke);
            }
        } catch (ClassCastException unused2) {
            throw fg90.m(jSONObject, str, A);
        } catch (Exception e) {
            throw fg90.g(jSONObject, str, A, e);
        }
    }

    public static List I(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw fg90.h(str, jSONObject);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e) {
                    yf90Var.a().a(fg90.a(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    public static List J(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar, sty styVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw fg90.h(str, jSONObject);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!styVar.b(list)) {
                    yf90Var.a().a(fg90.f(jSONObject, str, list));
                }
                return list;
            } catch (ClassCastException unused) {
                yf90Var.a().a(fg90.m(jSONObject, str, list));
                return list;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e) {
                    yf90Var.a().a(fg90.a(optJSONArray, str, i, e));
                }
            }
        }
        try {
            if (styVar.b(arrayList)) {
                return arrayList;
            }
            throw fg90.f(jSONObject, str, arrayList);
        } catch (ClassCastException unused2) {
            throw fg90.m(jSONObject, str, arrayList);
        }
    }

    public static Object K(yf90 yf90Var, JSONObject jSONObject, tls tlsVar) {
        Object A = A("type", jSONObject);
        if (A != null) {
            try {
                Object invoke = tlsVar.invoke(A);
                if (invoke != null) {
                    return invoke;
                }
                yf90Var.a().a(fg90.f(jSONObject, "type", A));
                return null;
            } catch (ClassCastException unused) {
                yf90Var.a().a(fg90.m(jSONObject, "type", A));
            } catch (Exception e) {
                yf90Var.a().a(fg90.g(jSONObject, "type", A, e));
            }
        }
        return null;
    }

    public static Object L(yf90 yf90Var, JSONObject jSONObject, String str, tls tlsVar) {
        Object A = A(str, jSONObject);
        if (A == null) {
            return null;
        }
        try {
            Object invoke = tlsVar.invoke(A);
            if (invoke != null) {
                return invoke;
            }
            yf90Var.a().a(fg90.f(jSONObject, str, A));
            return null;
        } catch (ClassCastException unused) {
            yf90Var.a().a(fg90.m(jSONObject, str, A));
            return null;
        } catch (Exception e) {
            yf90Var.a().a(fg90.g(jSONObject, str, A, e));
            return null;
        }
    }

    public static Object M(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
        } catch (Exception e) {
            yf90Var.a().a(fg90.b(jSONObject, str, e));
            return null;
        }
    }

    public static Object N(yf90 yf90Var, JSONObject jSONObject, String str, r131 r131Var) {
        Object A = A(str, jSONObject);
        if (A == null) {
            return null;
        }
        try {
            if (r131Var.l(A)) {
                return A;
            }
            yf90Var.a().a(fg90.f(jSONObject, str, A));
            return null;
        } catch (ClassCastException unused) {
            yf90Var.a().a(fg90.m(jSONObject, str, A));
            return null;
        }
    }

    public static List O(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e) {
                    yf90Var.a().a(fg90.a(optJSONArray, str, i, e));
                }
            }
        }
        return arrayList;
    }

    public static List P(yf90 yf90Var, JSONObject jSONObject, String str, i3y i3yVar, sty styVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (styVar.b(list)) {
                        return list;
                    }
                    yf90Var.a().a(fg90.f(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    yf90Var.a().a(fg90.m(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                    optJSONObject = null;
                }
                if (optJSONObject != null) {
                    try {
                        Object a2 = ((nyi) i3yVar.getValue()).a(yf90Var, optJSONObject);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    } catch (Exception e) {
                        yf90Var.a().a(fg90.a(optJSONArray, str, i, e));
                    }
                }
            }
            try {
                if (styVar.b(arrayList)) {
                    return arrayList;
                }
                yf90Var.a().a(fg90.f(jSONObject, str, arrayList));
            } catch (ClassCastException unused2) {
                yf90Var.a().a(fg90.m(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static List Q(yf90 yf90Var, JSONObject jSONObject, String str, tls tlsVar, sty styVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (styVar.b(list)) {
                        return list;
                    }
                    yf90Var.a().a(fg90.f(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    yf90Var.a().a(fg90.m(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object opt = optJSONArray.opt(i);
                if (opt == JSONObject.NULL) {
                    opt = null;
                }
                if (opt != null) {
                    try {
                        Object invoke = tlsVar.invoke(opt);
                        if (invoke != null) {
                            arrayList.add(invoke);
                        }
                    } catch (ClassCastException unused2) {
                        yf90Var.a().a(fg90.l(optJSONArray, str, i, opt));
                    } catch (Exception e) {
                        yf90Var.a().a(fg90.e(optJSONArray, str, i, opt, e));
                    }
                }
            }
            try {
                if (styVar.b(arrayList)) {
                    return arrayList;
                }
                yf90Var.a().a(fg90.f(jSONObject, str, arrayList));
            } catch (ClassCastException unused3) {
                yf90Var.a().a(fg90.m(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static String R(JSONObject jSONObject) {
        Object A = A("type", jSONObject);
        if (A == null) {
            throw fg90.h("type", jSONObject);
        }
        try {
            return (String) A;
        } catch (ClassCastException unused) {
            throw fg90.m(jSONObject, "type", A);
        } catch (Exception e) {
            throw fg90.g(jSONObject, "type", A, e);
        }
    }

    public static final androidx.compose.runtime.internal.a S(int i, boolean z, Object obj, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new androidx.compose.runtime.internal.a(i, obj, z);
            btsVar.o0(Q);
        }
        androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) Q;
        aVar.m(obj);
        return aVar;
    }

    public static final void T(ows0 ows0Var, int i, Object obj) {
        int h = ows0Var.h(i);
        Object[] objArr = ows0Var.c;
        Object obj2 = objArr[h];
        objArr[h] = did.a;
        if (obj == obj2) {
            return;
        }
        lid.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void U(MainMenuButton mainMenuButton, bk10 bk10Var) {
        Drawable f = bk10Var.f();
        if (f == null) {
            mainMenuButton.setMenuIcon(bk10Var.getIcon());
        } else {
            mainMenuButton.setMenuIcon(f);
        }
        bk10Var.getBackground().getClass();
        bk10Var.getBackground().getClass();
        mainMenuButton.setIconBackground(-1, 0);
        mainMenuButton.setIconForeground(bk10Var.a());
    }

    public static final long V(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final Boolean W(int i) {
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final String X(Continuation continuation) {
        Object failure;
        if (continuation instanceof pyj) {
            return ((pyj) continuation).toString();
        }
        try {
            failure = continuation + '@' + s(continuation);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = continuation.getClass().getName() + '@' + s(continuation);
        }
        return (String) failure;
    }

    public static final void Y(vpl vplVar, View view) {
        if (view instanceof DivWrapLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    vplVar.a((DivWrapLayout) view);
                    return;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt);
                    i = i2;
                }
            }
        } else if (view instanceof DivFrameLayout) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int i3 = 0;
            while (true) {
                if (!(i3 < viewGroup2.getChildCount())) {
                    vplVar.a((DivFrameLayout) view);
                    return;
                }
                int i4 = i3 + 1;
                View childAt2 = viewGroup2.getChildAt(i3);
                if (childAt2 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt2);
                    i3 = i4;
                }
            }
        } else if (view instanceof DivGridLayout) {
            ViewGroup viewGroup3 = (ViewGroup) view;
            int i5 = 0;
            while (true) {
                if (!(i5 < viewGroup3.getChildCount())) {
                    vplVar.a((DivGridLayout) view);
                    return;
                }
                int i6 = i5 + 1;
                View childAt3 = viewGroup3.getChildAt(i5);
                if (childAt3 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt3);
                    i5 = i6;
                }
            }
        } else if (view instanceof DivLinearLayout) {
            ViewGroup viewGroup4 = (ViewGroup) view;
            int i7 = 0;
            while (true) {
                if (!(i7 < viewGroup4.getChildCount())) {
                    vplVar.a((DivLinearLayout) view);
                    return;
                }
                int i8 = i7 + 1;
                View childAt4 = viewGroup4.getChildAt(i7);
                if (childAt4 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt4);
                    i7 = i8;
                }
            }
        } else if (view instanceof DivPagerView) {
            ViewGroup viewGroup5 = (ViewGroup) view;
            int i9 = 0;
            while (true) {
                if (!(i9 < viewGroup5.getChildCount())) {
                    vplVar.e((DivPagerView) view);
                    return;
                }
                int i10 = i9 + 1;
                View childAt5 = viewGroup5.getChildAt(i9);
                if (childAt5 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt5);
                    i9 = i10;
                }
            }
        } else if (view instanceof DivRecyclerView) {
            ViewGroup viewGroup6 = (ViewGroup) view;
            int i11 = 0;
            while (true) {
                if (!(i11 < viewGroup6.getChildCount())) {
                    vplVar.f((DivRecyclerView) view);
                    return;
                }
                int i12 = i11 + 1;
                View childAt6 = viewGroup6.getChildAt(i11);
                if (childAt6 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt6);
                    i11 = i12;
                }
            }
        } else if (view instanceof DivStateLayout) {
            ViewGroup viewGroup7 = (ViewGroup) view;
            int i13 = 0;
            while (true) {
                if (!(i13 < viewGroup7.getChildCount())) {
                    vplVar.a((DivStateLayout) view);
                    return;
                }
                int i14 = i13 + 1;
                View childAt7 = viewGroup7.getChildAt(i13);
                if (childAt7 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt7);
                    i13 = i14;
                }
            }
        } else if (view instanceof DivTabsLayout) {
            ViewGroup viewGroup8 = (ViewGroup) view;
            int i15 = 0;
            while (true) {
                if (!(i15 < viewGroup8.getChildCount())) {
                    vplVar.a((DivTabsLayout) view);
                    return;
                }
                int i16 = i15 + 1;
                View childAt8 = viewGroup8.getChildAt(i15);
                if (childAt8 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt8);
                    i15 = i16;
                }
            }
        } else {
            if (!(view instanceof DivCustomWrapper)) {
                if (view instanceof DivSeparatorView) {
                    vplVar.a((DivSeparatorView) view);
                    return;
                }
                if (view instanceof DivGifImageView) {
                    vplVar.d((DivGifImageView) view);
                    return;
                }
                if (view instanceof DivImageView) {
                    vplVar.h((DivImageView) view);
                    return;
                }
                if (view instanceof DivLineHeightTextView) {
                    vplVar.a((DivLineHeightTextView) view);
                    return;
                }
                if (view instanceof DivPagerIndicatorView) {
                    vplVar.a((DivPagerIndicatorView) view);
                    return;
                }
                if (view instanceof DivSliderView) {
                    vplVar.a((DivSliderView) view);
                    return;
                }
                if (view instanceof DivSelectView) {
                    vplVar.a((DivSelectView) view);
                    return;
                }
                if (view instanceof DivVideoView) {
                    vplVar.g((DivVideoView) view);
                    return;
                }
                if (view instanceof DivSwitchView) {
                    vplVar.a((DivSwitchView) view);
                    return;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup9 = (ViewGroup) view;
                    int i17 = 0;
                    while (true) {
                        if (!(i17 < viewGroup9.getChildCount())) {
                            break;
                        }
                        int i18 = i17 + 1;
                        View childAt9 = viewGroup9.getChildAt(i17);
                        if (childAt9 == null) {
                            ny61.s();
                            return;
                        } else {
                            Y(vplVar, childAt9);
                            i17 = i18;
                        }
                    }
                }
                vplVar.b(view);
                return;
            }
            ViewGroup viewGroup10 = (ViewGroup) view;
            int i19 = 0;
            while (true) {
                if (!(i19 < viewGroup10.getChildCount())) {
                    vplVar.c((DivCustomWrapper) view);
                    return;
                }
                int i20 = i19 + 1;
                View childAt10 = viewGroup10.getChildAt(i19);
                if (childAt10 == null) {
                    ny61.s();
                    return;
                } else {
                    Y(vplVar, childAt10);
                    i19 = i20;
                }
            }
        }
    }

    public static void Z(yf90 yf90Var, JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
                yf90Var.a().a(e);
            }
        }
    }

    public static final zii0 a(long j, long j2) {
        return new zii0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public static void a0(yf90 yf90Var, JSONObject jSONObject, String str, Object obj, tls tlsVar) {
        if (obj != null) {
            try {
                jSONObject.put(str, tlsVar.invoke(obj));
            } catch (JSONException e) {
                yf90Var.a().a(e);
            }
        }
    }

    public static final zii0 b(long j, long j2) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return new zii0(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i2));
    }

    public static void b0(yf90 yf90Var, JSONObject jSONObject, String str, Object obj, i3y i3yVar) {
        if (obj != null) {
            try {
                jSONObject.put(str, ((zsq0) i3yVar.getValue()).b(yf90Var, obj));
            } catch (JSONException e) {
                yf90Var.a().a(e);
            }
        }
    }

    public static final void c(int i, int i2, List list) {
        int o = o(i, list);
        if (o < 0) {
            o = -(o + 1);
        }
        while (o < list.size() && ((zvw) list.get(o)).b < i2) {
        }
    }

    public static void c0(yf90 yf90Var, JSONObject jSONObject, String str, List list, i3y i3yVar) {
        if (list != null) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((zsq0) i3yVar.getValue()).b(yf90Var, list.get(i)));
            }
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException e) {
                yf90Var.a().a(e);
            }
        }
    }

    public static final AccountType d(kj kjVar) {
        if (kjVar != null) {
            AccountType accountType = (kjVar.n || kjVar.j) ? AccountType.Yandex : kjVar.p ? AccountType.Lite : kjVar.m ? AccountType.Phonish : kjVar.o ? AccountType.Social : AccountType.None;
            if (accountType != null) {
                return accountType;
            }
        }
        return AccountType.None;
    }

    public static void d0(yf90 yf90Var, JSONObject jSONObject, List list, tls tlsVar) {
        if (list != null) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(tlsVar.invoke(list.get(i)));
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e) {
                yf90Var.a().a(e);
            }
        }
    }

    public static final Object e(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        pt2 pt2Var = applicationContext instanceof pt2 ? (pt2) applicationContext : null;
        if (pt2Var != null) {
            return pt2Var.dependencyProvider().a();
        }
        ny61.r("Application does not extend AppDependencyHolder");
        return null;
    }

    public static void e0(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ny61.t(oyr.i(i2, "at index "));
                return;
            }
        }
    }

    public static final int f(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final Bundle g(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.getFirst();
            Object second = pair.getSecond();
            if (second == null) {
                bundle.putString(str, null);
            } else if (second instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) second).booleanValue());
            } else if (second instanceof Byte) {
                bundle.putByte(str, ((Number) second).byteValue());
            } else if (second instanceof Character) {
                bundle.putChar(str, ((Character) second).charValue());
            } else if (second instanceof Double) {
                bundle.putDouble(str, ((Number) second).doubleValue());
            } else if (second instanceof Float) {
                bundle.putFloat(str, ((Number) second).floatValue());
            } else if (second instanceof Integer) {
                bundle.putInt(str, ((Number) second).intValue());
            } else if (second instanceof Long) {
                bundle.putLong(str, ((Number) second).longValue());
            } else if (second instanceof Short) {
                bundle.putShort(str, ((Number) second).shortValue());
            } else if (second instanceof Bundle) {
                bundle.putBundle(str, (Bundle) second);
            } else if (second instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) second);
            } else if (second instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) second);
            } else if (second instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) second);
            } else if (second instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) second);
            } else if (second instanceof char[]) {
                bundle.putCharArray(str, (char[]) second);
            } else if (second instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) second);
            } else if (second instanceof float[]) {
                bundle.putFloatArray(str, (float[]) second);
            } else if (second instanceof int[]) {
                bundle.putIntArray(str, (int[]) second);
            } else if (second instanceof long[]) {
                bundle.putLongArray(str, (long[]) second);
            } else if (second instanceof short[]) {
                bundle.putShortArray(str, (short[]) second);
            } else if (second instanceof Object[]) {
                Class<?> componentType = second.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) second);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) second);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) second);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        xfo.e(34, componentType.getCanonicalName(), " for key \"", str, "Illegal value array type ");
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) second);
                }
            } else if (second instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) second);
            } else if (second instanceof IBinder) {
                bundle.putBinder(str, (IBinder) second);
            } else if (second instanceof Size) {
                bcb1.o(bundle, str, (Size) second);
            } else {
                if (!(second instanceof SizeF)) {
                    xfo.e(34, second.getClass().getCanonicalName(), " for key \"", str, "Illegal value type ");
                    return null;
                }
                bcb1.p(bundle, str, (SizeF) second);
            }
        }
        return bundle;
    }

    public static final void h(dus0 dus0Var, ArrayList arrayList, int i) {
        boolean l = dus0Var.l(i);
        int[] iArr = dus0Var.b;
        if (l) {
            arrayList.add(dus0Var.n(i));
            return;
        }
        int a2 = uus0.a(i, iArr) + i;
        for (int i2 = i + 1; i2 < a2; i2 += iArr[(i2 * 5) + 3]) {
            h(dus0Var, arrayList, i2);
        }
    }

    public static final androidx.compose.runtime.internal.a i(fid fidVar, int i, Lambda lambda) {
        androidx.compose.runtime.internal.a aVar;
        bts btsVar = (bts) fidVar;
        btsVar.c0(Integer.rotateLeft(i, 1), a);
        Object Q = btsVar.Q();
        if (Q == did.a) {
            aVar = new androidx.compose.runtime.internal.a(i, lambda, true);
            btsVar.o0(aVar);
        } else {
            aVar = (androidx.compose.runtime.internal.a) Q;
            aVar.m(lambda);
        }
        btsVar.t(false);
        return aVar;
    }

    public static final String j(lq20 lq20Var) {
        zm20 i = vng.i(lq20Var);
        String str = i.b;
        String str2 = i.a;
        return jl40.l(str2, "default") ? str : g8e.p(str2, "\u0000", str);
    }

    public static t1q0 k(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                Collection collection = (List) hashMap.get(str2);
                if (collection == null) {
                    collection = new ArrayList();
                }
                collection.add(str);
                hashMap.put(str2, collection);
            }
        }
        return new t1q0(hashMap);
    }

    public static final r1e0 l(fmt fmtVar) {
        return new r1e0(fmtVar.a, C(fmtVar.e));
    }

    public static final Long m(String str) {
        Long m;
        if (str == null || (m = bvu0.m(10, str)) == null || m.longValue() <= 0) {
            return null;
        }
        return m;
    }

    public static final r1e0 n(fmt fmtVar) {
        Long C = C(fmtVar.e);
        if (C != null) {
            return new r1e0(fmtVar.a, C);
        }
        return null;
    }

    public static final int o(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int q = jl40.q(((zvw) list.get(i3)).b, i);
            if (q < 0) {
                i2 = i3 + 1;
            } else {
                if (q <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final PaymentWidgetsView p(RecyclerView recyclerView) {
        PaymentWidgetsView paymentWidgetsView;
        h8 h8Var = new h8(3, recyclerView);
        do {
            paymentWidgetsView = null;
            if (!h8Var.hasNext()) {
                break;
            }
            View view = (View) h8Var.next();
            if (view instanceof PaymentWidgetsView) {
                paymentWidgetsView = (PaymentWidgetsView) view;
            }
        } while (paymentWidgetsView == null);
        return paymentWidgetsView;
    }

    public static final String q(long j) {
        return String.format(Locale.US, "%d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j / 1000), Long.valueOf(j % 1000)}, 2));
    }

    public static final rx60 r(View view) {
        while (view != null) {
            Object tag = view.getTag(hjh0.view_tree_on_back_pressed_dispatcher_owner);
            rx60 rx60Var = tag instanceof rx60 ? (rx60) tag : null;
            if (rx60Var != null) {
                return rx60Var;
            }
            Object p = qke.p(view);
            view = p instanceof View ? (View) p : null;
        }
        return null;
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Object t(Object obj, Object obj2, Object obj3) {
        s9x s9xVar = obj instanceof s9x ? (s9x) obj : null;
        if (s9xVar == null) {
            return null;
        }
        if (jl40.l(s9xVar.a(), obj2) && jl40.l(s9xVar.b(), obj3)) {
            return obj;
        }
        Object t = t(s9xVar.a(), obj2, obj3);
        return t == null ? t(s9xVar.b(), obj2, obj3) : t;
    }

    public static final boolean u(Location location, Location location2) {
        if (location == null) {
            return false;
        }
        if (location2 == null) {
            return true;
        }
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = location2.getElapsedRealtimeNanos();
        float accuracy = location.getAccuracy();
        float accuracy2 = location2.getAccuracy();
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        long j = (elapsedRealtimeNanos / 1000000) - (elapsedRealtimeNanos2 / 1000000);
        if (j >= -120000) {
            int i = (int) (accuracy - accuracy2);
            if (i >= 0) {
                boolean z = j > 0;
                if (!z || i != 0) {
                    if (i <= 200) {
                        if ((provider == null || provider2 == null) ? false : provider.equals(provider2)) {
                            return z;
                        }
                        if (j > 120000) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean v(mo21 mo21Var) {
        if (mo21Var == null) {
            return false;
        }
        return SystemClock.elapsedRealtime() - (mo21Var.e / 1000000) < 120000;
    }

    public static boolean w(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final Object x(nkf nkfVar) {
        if (nkfVar instanceof lkf) {
            return ((lkf) nkfVar).a;
        }
        if (nkfVar instanceof mkf) {
            return null;
        }
        w511.b();
        return null;
    }

    public static meu y(Map map) {
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String obj = evu0.k0(str).toString();
            String obj2 = evu0.k0(str2).toString();
            ooc.q(obj);
            ooc.r(obj2, obj);
            strArr[i] = obj;
            strArr[i + 1] = obj2;
            i += 2;
        }
        return new meu(strArr);
    }

    public static meu z(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            ny61.g("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                ny61.g("Headers cannot be null");
                return null;
            }
            strArr3[i2] = evu0.k0(strArr2[i2]).toString();
        }
        int v = jx81.v(0, strArr3.length - 1, 2);
        if (v >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                ooc.q(str);
                ooc.r(str2, str);
                if (i == v) {
                    break;
                }
                i += 2;
            }
        }
        return new meu(strArr3);
    }
}
