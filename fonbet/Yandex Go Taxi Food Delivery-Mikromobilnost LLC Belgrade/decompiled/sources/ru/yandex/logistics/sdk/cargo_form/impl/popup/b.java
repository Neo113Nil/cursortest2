package ru.yandex.logistics.sdk.cargo_form.impl.popup;

import androidx.compose.ui.platform.f;
import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.utils.storage.impl.c;
import defpackage.a2y;
import defpackage.aas0;
import defpackage.acu;
import defpackage.bvf0;
import defpackage.f151;
import defpackage.fae0;
import defpackage.fse;
import defpackage.gci0;
import defpackage.goe;
import defpackage.ike;
import defpackage.kae0;
import defpackage.l9e0;
import defpackage.ldc;
import defpackage.m8s0;
import defpackage.nae0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q8s;
import defpackage.st2;
import defpackage.tje;
import defpackage.u3s;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yfa;
import defpackage.zii0;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.data.PopupLayer;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public final class b {
    public final goe a;
    public final aas0 b;
    public final q8s c;
    public final yfa d;
    public final c e;
    public final ike f;
    public final gci0 g;

    public b(u3s u3sVar, a2y a2yVar, st2 st2Var, goe goeVar, aas0 aas0Var, q8s q8sVar, yfa yfaVar, c cVar) {
        this.a = goeVar;
        this.b = aas0Var;
        this.c = q8sVar;
        this.d = yfaVar;
        this.e = cVar;
        ike a = bvf0.a(st2Var.c);
        this.f = a;
        this.g = e.R(e.F(e.m(new acu(u3sVar.a(), 13), aas0Var.c, a2yVar.f, goeVar.c, new PopupProvider$popupsStateFlow$2(this, null)), (fse) f.E.getValue()), a, wsr0.a(xsr0.a, 2), EmptyList.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nae0 nae0Var, ContinuationImpl continuationImpl) {
        PopupProvider$createPopupModel$1 popupProvider$createPopupModel$1;
        int i;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection2;
        ldc ldcVar;
        if (continuationImpl instanceof PopupProvider$createPopupModel$1) {
            popupProvider$createPopupModel$1 = (PopupProvider$createPopupModel$1) continuationImpl;
            int i2 = popupProvider$createPopupModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                popupProvider$createPopupModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = popupProvider$createPopupModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = popupProvider$createPopupModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = fae0.b[nae0Var.c.ordinal()];
                    if (i3 == 1) {
                        popupModel$TextHintPopup$ArrowDirection = PopupModel$TextHintPopup$ArrowDirection.TOP;
                    } else if (i3 == 2) {
                        popupModel$TextHintPopup$ArrowDirection = PopupModel$TextHintPopup$ArrowDirection.BOTTOM;
                    } else if (i3 == 3) {
                        popupModel$TextHintPopup$ArrowDirection = PopupModel$TextHintPopup$ArrowDirection.LEFT;
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        popupModel$TextHintPopup$ArrowDirection = PopupModel$TextHintPopup$ArrowDirection.RIGHT;
                    }
                    ldc f = this.d.f(nae0Var.b);
                    FormattedText formattedText = nae0Var.a;
                    popupProvider$createPopupModel$1.L$0 = null;
                    popupProvider$createPopupModel$1.L$1 = popupModel$TextHintPopup$ArrowDirection;
                    popupProvider$createPopupModel$1.L$2 = f;
                    popupProvider$createPopupModel$1.label = 1;
                    Object a = this.c.a(formattedText, popupProvider$createPopupModel$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    popupModel$TextHintPopup$ArrowDirection2 = popupModel$TextHintPopup$ArrowDirection;
                    obj = a;
                    ldcVar = f;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ldcVar = (ldc) popupProvider$createPopupModel$1.L$2;
                    popupModel$TextHintPopup$ArrowDirection2 = (PopupModel$TextHintPopup$ArrowDirection) popupProvider$createPopupModel$1.L$1;
                    kotlin.b.b(obj);
                }
                return new l9e0((CharSequence) obj, ldcVar, popupModel$TextHintPopup$ArrowDirection2);
            }
        }
        popupProvider$createPopupModel$1 = new PopupProvider$createPopupModel$1(this, continuationImpl);
        Object obj2 = popupProvider$createPopupModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = popupProvider$createPopupModel$1.label;
        if (i != 0) {
        }
        return new l9e0((CharSequence) obj2, ldcVar, popupModel$TextHintPopup$ArrowDirection2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
    
        if (((java.lang.Boolean) r22).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, nae0 nae0Var, Set set, zii0 zii0Var, ContinuationImpl continuationImpl) {
        PopupProvider$getTextHintPopupModel$1 popupProvider$getTextHintPopupModel$1;
        int i;
        f151 f151Var;
        String str3;
        m8s0 m8s0Var;
        nae0 nae0Var2;
        zii0 zii0Var2;
        Object obj;
        m8s0 m8s0Var2;
        zii0 zii0Var3;
        f151 f151Var2;
        nae0 nae0Var3;
        String str4;
        int i2;
        PopupLayer popupLayer;
        zii0 zii0Var4 = zii0Var;
        if (continuationImpl instanceof PopupProvider$getTextHintPopupModel$1) {
            popupProvider$getTextHintPopupModel$1 = (PopupProvider$getTextHintPopupModel$1) continuationImpl;
            int i3 = popupProvider$getTextHintPopupModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                popupProvider$getTextHintPopupModel$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = popupProvider$getTextHintPopupModel$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = popupProvider$getTextHintPopupModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!nae0Var.x || !set.contains(str)) {
                        pz40 pz40Var = (pz40) this.a.a.get(str2);
                        f151Var = pz40Var != null ? (f151) ((r0) pz40Var).getValue() : null;
                        if (f151Var != null) {
                            zii0 zii0Var5 = f151Var.a;
                            if (zii0Var5.h(zii0Var4)) {
                                m8s0 m8s0Var3 = nae0Var.w;
                                if (!this.b.b.contains(str)) {
                                    popupProvider$getTextHintPopupModel$1.L$0 = str;
                                    popupProvider$getTextHintPopupModel$1.L$1 = null;
                                    popupProvider$getTextHintPopupModel$1.L$2 = nae0Var;
                                    popupProvider$getTextHintPopupModel$1.L$3 = null;
                                    popupProvider$getTextHintPopupModel$1.L$4 = zii0Var4;
                                    popupProvider$getTextHintPopupModel$1.L$5 = f151Var;
                                    popupProvider$getTextHintPopupModel$1.L$6 = zii0Var5;
                                    popupProvider$getTextHintPopupModel$1.L$7 = m8s0Var3;
                                    popupProvider$getTextHintPopupModel$1.label = 1;
                                    Object b = this.e.b(m8s0Var3, popupProvider$getTextHintPopupModel$1);
                                    if (b != obj3) {
                                        obj = b;
                                        str3 = str;
                                        m8s0Var = m8s0Var3;
                                        nae0Var2 = nae0Var;
                                        zii0Var2 = zii0Var5;
                                    }
                                    return obj3;
                                }
                                str3 = str;
                                m8s0Var = m8s0Var3;
                                nae0Var2 = nae0Var;
                                zii0Var2 = zii0Var5;
                                popupProvider$getTextHintPopupModel$1.L$0 = str3;
                                popupProvider$getTextHintPopupModel$1.L$1 = null;
                                popupProvider$getTextHintPopupModel$1.L$2 = nae0Var2;
                                popupProvider$getTextHintPopupModel$1.L$3 = null;
                                popupProvider$getTextHintPopupModel$1.L$4 = zii0Var4;
                                popupProvider$getTextHintPopupModel$1.L$5 = f151Var;
                                popupProvider$getTextHintPopupModel$1.L$6 = zii0Var2;
                                popupProvider$getTextHintPopupModel$1.L$7 = m8s0Var;
                                popupProvider$getTextHintPopupModel$1.label = 2;
                                Object a = a(nae0Var2, popupProvider$getTextHintPopupModel$1);
                                if (a != obj3) {
                                    m8s0Var2 = m8s0Var;
                                    zii0Var3 = zii0Var2;
                                    f151Var2 = f151Var;
                                    nae0Var3 = nae0Var2;
                                    str4 = str3;
                                    obj2 = a;
                                    zii0 zii0Var6 = zii0Var4;
                                    l9e0 l9e0Var = (l9e0) obj2;
                                    i2 = fae0.a[f151Var2.b.ordinal()];
                                    if (i2 != 1) {
                                    }
                                    popupLayer = PopupLayer.OVERLAY;
                                    return new kae0(str4, l9e0Var, zii0Var3, zii0Var6, nae0Var3.x, m8s0Var2, popupLayer, f151Var2.d);
                                }
                                return obj3;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m8s0 m8s0Var4 = (m8s0) popupProvider$getTextHintPopupModel$1.L$7;
                    zii0 zii0Var7 = (zii0) popupProvider$getTextHintPopupModel$1.L$6;
                    f151Var2 = (f151) popupProvider$getTextHintPopupModel$1.L$5;
                    zii0Var4 = (zii0) popupProvider$getTextHintPopupModel$1.L$4;
                    nae0Var3 = (nae0) popupProvider$getTextHintPopupModel$1.L$2;
                    String str5 = (String) popupProvider$getTextHintPopupModel$1.L$0;
                    kotlin.b.b(obj2);
                    m8s0Var2 = m8s0Var4;
                    zii0Var3 = zii0Var7;
                    str4 = str5;
                    zii0 zii0Var62 = zii0Var4;
                    l9e0 l9e0Var2 = (l9e0) obj2;
                    i2 = fae0.a[f151Var2.b.ordinal()];
                    if (i2 != 1 || i2 == 2) {
                        popupLayer = PopupLayer.OVERLAY;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        popupLayer = PopupLayer.CONTENT;
                    }
                    return new kae0(str4, l9e0Var2, zii0Var3, zii0Var62, nae0Var3.x, m8s0Var2, popupLayer, f151Var2.d);
                }
                m8s0Var = (m8s0) popupProvider$getTextHintPopupModel$1.L$7;
                zii0Var2 = (zii0) popupProvider$getTextHintPopupModel$1.L$6;
                f151 f151Var3 = (f151) popupProvider$getTextHintPopupModel$1.L$5;
                zii0 zii0Var8 = (zii0) popupProvider$getTextHintPopupModel$1.L$4;
                nae0Var2 = (nae0) popupProvider$getTextHintPopupModel$1.L$2;
                str3 = (String) popupProvider$getTextHintPopupModel$1.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                f151Var = f151Var3;
                zii0Var4 = zii0Var8;
            }
        }
        popupProvider$getTextHintPopupModel$1 = new PopupProvider$getTextHintPopupModel$1(this, continuationImpl);
        Object obj22 = popupProvider$getTextHintPopupModel$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = popupProvider$getTextHintPopupModel$1.label;
        if (i != 0) {
        }
    }

    public final void c(String str, m8s0 m8s0Var) {
        tje.N(this.f, null, null, new PopupProvider$onPopupShown$1(this, str, m8s0Var, null), 3);
    }
}
