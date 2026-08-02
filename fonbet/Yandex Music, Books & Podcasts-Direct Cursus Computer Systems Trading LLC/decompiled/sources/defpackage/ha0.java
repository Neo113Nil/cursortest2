package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.Z0;

/* loaded from: classes.dex */
public final class ha0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ha0(Function0 function0, hr4 hr4Var) {
        super(0);
        this.r = 23;
        this.t = (uif) function0;
        this.s = hr4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Type inference failed for: r8v24, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        qfp qfpVar;
        mpf mpfVar;
        sr2 sr2Var;
        lpo lpoVar;
        int i = this.r;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.s;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                ia0 ia0Var = (ia0) obj2;
                ba0 ba0Var = (ba0) ia0Var.n;
                float c = ia0Var.g().c(obj);
                if (!Float.isNaN(c)) {
                    ia0 ia0Var2 = ba0Var.a;
                    ((t6k) ia0Var2.l).h(c);
                    ((t6k) ia0Var2.m).h(0.0f);
                    ia0Var.m(null);
                }
                ia0Var.l(obj);
                break;
            case 1:
                ka0 ka0Var = (ka0) obj2;
                da0 da0Var = ka0Var.n;
                float c2 = ka0Var.e().c(obj);
                if (!Float.isNaN(c2)) {
                    ka0 ka0Var2 = da0Var.a;
                    ka0Var2.j.h(c2);
                    ka0Var2.k.h(0.0f);
                    ka0Var.i(null);
                }
                ka0Var.h(obj);
                break;
            case 2:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                break;
            case 3:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj);
                break;
            case 4:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj2;
                oj0 oj0Var = (oj0) obj;
                androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(oj0Var);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(oj0Var));
                oj0Var.setImportantForAccessibility(0);
                break;
            case 5:
                ye0 ye0Var = (ye0) obj;
                qwo qwoVar = (qwo) obj2;
                cwo cwoVar = qwoVar.e;
                cwo cwoVar2 = qwoVar.f;
                Float f = qwoVar.c;
                Float f2 = qwoVar.d;
                float floatValue = (cwoVar == null || f == null) ? 0.0f : ((Number) cwoVar.a.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (cwoVar2 == null || f2 == null) ? 0.0f : ((Number) cwoVar2.a.invoke()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int z = ye0Var.z(qwoVar.a);
                    sfp sfpVar = (sfp) ye0Var.s().b(ye0Var.n);
                    if (sfpVar != null) {
                        try {
                            vb vbVar = ye0Var.p;
                            if (vbVar != null) {
                                vbVar.a.setBoundsInScreen(ye0Var.k(sfpVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    sfp sfpVar2 = (sfp) ye0Var.s().b(ye0Var.o);
                    if (sfpVar2 != null) {
                        try {
                            vb vbVar2 = ye0Var.q;
                            if (vbVar2 != null) {
                                vbVar2.a.setBoundsInScreen(ye0Var.k(sfpVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    ye0Var.d.invalidate();
                    sfp sfpVar3 = (sfp) ye0Var.s().b(z);
                    if (sfpVar3 != null && (qfpVar = sfpVar3.a) != null && (mpfVar = qfpVar.c) != null) {
                        if (cwoVar != null) {
                            ye0Var.s.h(z, cwoVar);
                        }
                        if (cwoVar2 != null) {
                            ye0Var.t.h(z, cwoVar2);
                        }
                        ye0Var.v(mpfVar);
                    }
                }
                if (cwoVar != null) {
                    qwoVar.c = (Float) cwoVar.a.invoke();
                }
                if (cwoVar2 != null) {
                    qwoVar.d = (Float) cwoVar2.a.invoke();
                }
                break;
            case 6:
                ((lc4) obj2).c(obj);
                break;
            case 7:
                vj2 vj2Var = (vj2) obj2;
                opf opfVar = (opf) obj;
                vj2Var.w = vj2Var.r.I(opfVar.a.e(), opfVar.getLayoutDirection(), opfVar);
                break;
            case 8:
                ((kpm) obj2).onSuccess((ArrayList) obj);
                break;
            case 9:
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                ((kpm) obj2).x(y7g.x((r7w) obj));
                break;
            case 10:
                x7o x7oVar = (x7o) obj2;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (hashSet.add(((hgj) obj3).c)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hgj hgjVar = (hgj) it.next();
                    String str = hgjVar.a;
                    String str2 = hgjVar.c;
                    Uri parse = Uri.parse(hgjVar.b);
                    parse.getClass();
                    String str3 = hgjVar.e;
                    arrayList2.add(new gl2(str, str2, parse, str3 == null ? "" : str3, qdq.B(hgjVar.f), hgjVar.h, qdq.C(hgjVar.g)));
                }
                x7oVar.onSuccess(arrayList2);
                break;
            case 11:
                xr2 xr2Var = (xr2) obj;
                vqn vqnVar = (vqn) obj2;
                while (vqnVar.a < ((ArrayList) xr2Var.f()).size()) {
                    if (((ArrayList) xr2Var.f()).get(vqnVar.a) instanceof sr2) {
                        Object S = CollectionsKt.S(xr2Var.f(), vqnVar.a);
                        sr2Var = !(S instanceof sr2) ? (sr2) S : null;
                        if (sr2Var == null) {
                            break;
                        }
                    } else {
                        vqnVar.a++;
                    }
                }
                Object S2 = CollectionsKt.S(xr2Var.f(), vqnVar.a);
                if (!(S2 instanceof sr2)) {
                }
                if (sr2Var == null) {
                }
                break;
            case 12:
                ybs ybsVar = (ybs) obj2;
                aqi aqiVar = (aqi) obj;
                if (!rds.a(ybsVar.b, ((ybs) aqiVar.getValue()).b) || !Intrinsics.d(ybsVar.c, ((ybs) aqiVar.getValue()).c)) {
                    aqiVar.setValue(ybsVar);
                }
                break;
            case 13:
                gds gdsVar = (gds) obj2;
                if (gdsVar != null) {
                    s2r s2rVar = gdsVar.c;
                    boolean isEmpty = s2rVar.isEmpty();
                    mn0 mn0Var = gdsVar.b;
                    if (!isEmpty) {
                        u9s u9sVar = new u9s(mn0Var);
                        int size = s2rVar.size();
                        while (i2 < size) {
                            ((Function1) s2rVar.get(i2)).invoke(u9sVar);
                            i2++;
                        }
                        mn0Var = u9sVar.b;
                    }
                    gdsVar.b = mn0Var;
                    if (mn0Var != null) {
                    }
                }
                break;
            case 14:
                ero eroVar = (ero) obj;
                ((x7o) obj2).onSuccess(new jg3(eroVar.a, eroVar.b));
                break;
            case 15:
                z0r z0rVar = (z0r) obj;
                z0rVar.getClass();
                ((x7o) obj2).onSuccess(new dro(z0rVar.a));
                break;
            case 16:
                x7o x7oVar2 = (x7o) obj2;
                p0u p0uVar = (p0u) obj;
                p0uVar.getClass();
                int ordinal = p0uVar.a.ordinal();
                if (ordinal == 0) {
                    lpoVar = lpo.Correct;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    lpoVar = lpo.Incorrect;
                }
                x7oVar2.onSuccess(new mpo(lpoVar, p0uVar.b));
                break;
            case 17:
                pt0 pt0Var = (pt0) ((jzi) obj2).a;
                String uri = ((ft7) obj).a.toString();
                uri.getClass();
                pt0Var.onSuccess(new rv3(uri, c5b.a));
                break;
            case 18:
                pt0 pt0Var2 = (pt0) ((xzi) obj2).a;
                t9i t9iVar = (t9i) obj;
                va4 va4Var = t9iVar instanceof va4 ? (va4) t9iVar : null;
                pt0Var2.onSuccess(va4Var != null ? new rv3(va4Var.b, va4Var.c) : new rv3("", c5b.a));
                break;
            case 19:
                ((iwe) obj2).onSuccess((Unit) obj);
                break;
            case 20:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (r1 = (ynn) function0.invoke()) != null) {
                    break;
                } else {
                    f8j f8jVar = (f8j) obj;
                    if (!f8jVar.b1().n) {
                        f8jVar = null;
                    }
                    if (f8jVar != null) {
                        break;
                    }
                }
                break;
            case 21:
                ((lp3) obj2).q.invoke((np3) obj);
                break;
            case 22:
                new Handler(Looper.getMainLooper()).post(new qf0(9, (CardNumberInput) obj2, (vw3) obj));
                break;
            case 23:
                ((hr4) obj).a.f(System.currentTimeMillis(), new cr4((String) ((uif) obj2).invoke(), i2));
                break;
            case 24:
                jyr jyrVar = hr4.e;
                break;
            case 25:
                mfi mfiVar = (mfi) obj;
                ((oq5) obj2).B(mfiVar.a, mfiVar.g, mfiVar.b, true);
                break;
            case 26:
                fb6.access$applyCommandsInternal((fb6) obj2, (Z0[]) obj);
                break;
            case 27:
                ts6 ts6Var = (ts6) obj2;
                ts6Var.f().execute(new qf0(23, ts6Var, (o7d) obj));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ts6 ts6Var2 = (ts6) obj2;
                ts6Var2.f().execute(new qf0(24, ts6Var2, (xqn) obj));
                break;
            default:
                ts6 ts6Var3 = (ts6) obj2;
                ts6Var3.f().execute(new ps6(ts6Var3, (m7d) obj, i3));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha0(int i, Object obj, Object obj2) {
        super(0);
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }
}
