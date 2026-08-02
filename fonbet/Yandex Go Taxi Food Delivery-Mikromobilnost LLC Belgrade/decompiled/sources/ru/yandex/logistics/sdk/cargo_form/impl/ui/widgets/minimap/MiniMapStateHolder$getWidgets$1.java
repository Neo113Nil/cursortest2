package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap;

import defpackage.a0t;
import defpackage.afz0;
import defpackage.aoe;
import defpackage.b0k0;
import defpackage.bfz0;
import defpackage.boe;
import defpackage.c0k0;
import defpackage.ci20;
import defpackage.cuj0;
import defpackage.dms;
import defpackage.doe;
import defpackage.e100;
import defpackage.ig00;
import defpackage.is00;
import defpackage.j6s;
import defpackage.jg00;
import defpackage.jtb0;
import defpackage.l7x0;
import defpackage.ldc;
import defpackage.ltb0;
import defpackage.lvi0;
import defpackage.mtb0;
import defpackage.mum;
import defpackage.mvg;
import defpackage.ntb0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.oo0;
import defpackage.ozg0;
import defpackage.qv0;
import defpackage.ra90;
import defpackage.ryh;
import defpackage.sbv;
import defpackage.sj51;
import defpackage.t6u0;
import defpackage.tj51;
import defpackage.tl91;
import defpackage.tq00;
import defpackage.trb1;
import defpackage.vu0;
import defpackage.w511;
import defpackage.x2s;
import defpackage.yfa;
import defpackage.yh20;
import defpackage.yzj0;
import defpackage.zez0;
import defpackage.zh20;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.MapConfig$MapStyle$MapTheme;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;
import ru.yandex.taxi.logistics.sdk.ui_models.minimap.MapPinType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lzh20;", "coreWidget", "", "isDark", "Ljg00;", "mapConfig", "Lj6s;", ClidProvider.STATE, "Lyh20;", "<anonymous>", "(Lzh20;ZLjg00;Lj6s;)Lyh20;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.MiniMapStateHolder$getWidgets$1", f = "MiniMapStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MiniMapStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniMapStateHolder$getWidgets$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MiniMapStateHolder$getWidgets$1 miniMapStateHolder$getWidgets$1 = new MiniMapStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        miniMapStateHolder$getWidgets$1.L$0 = (zh20) obj;
        miniMapStateHolder$getWidgets$1.Z$0 = booleanValue;
        miniMapStateHolder$getWidgets$1.L$1 = (jg00) obj3;
        miniMapStateHolder$getWidgets$1.L$2 = (j6s) obj4;
        return miniMapStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        doe doeVar;
        doe doeVar2;
        oo0 oo0Var;
        a0t a0tVar;
        MapPinType mapPinType;
        bfz0 afz0Var;
        ra90 cuj0Var;
        String str;
        tl91 ltb0Var;
        ldc f;
        Object obj2;
        String str2;
        c0k0 c0k0Var;
        vu0 vu0Var;
        String str3;
        String str4;
        ldc f2;
        zh20 zh20Var = (zh20) this.L$0;
        boolean z = this.Z$0;
        jg00 jg00Var = (jg00) this.L$1;
        j6s j6sVar = (j6s) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zh20Var == null || !this.this$0.f.C(zh20Var)) {
            e100 e100Var = this.this$0.c;
            e100Var.getClass();
            if (zh20Var == null || (valueOf = zh20Var.b) == null) {
                valueOf = jg00Var != null ? Integer.valueOf(jg00Var.c) : null;
            }
            ArrayList arrayList = jg00Var != null ? jg00Var.b : null;
            if (valueOf != null && arrayList != null && zh20Var != null) {
                trb1 trb1Var = zh20Var.c;
                if (trb1Var != null) {
                    if (trb1Var instanceof aoe) {
                        ryh ryhVar = (ryh) e100Var.w;
                        c0k0 c0k0Var2 = ((aoe) trb1Var).a;
                        ryhVar.getClass();
                        if (c0k0Var2 instanceof yzj0) {
                            qv0 q = ryh.q((yzj0) c0k0Var2, j6sVar);
                            if (q != null && (oo0Var = q.a) != null && (a0tVar = oo0Var.f) != null) {
                                doeVar = new doe(a0tVar.a, a0tVar.b);
                                doeVar2 = doeVar;
                            }
                        } else {
                            if (!(c0k0Var2 instanceof b0k0)) {
                                w511.b();
                                return null;
                            }
                            FormStateRoutePointDto h = ((mum) ryhVar.b).h(j6sVar, ((b0k0) c0k0Var2).a());
                            if (h != null) {
                                doeVar = new doe(Double.parseDouble(h.getCoordinates().get(1)), Double.parseDouble(h.getCoordinates().get(0)));
                                doeVar2 = doeVar;
                            }
                        }
                    } else {
                        if (!(trb1Var instanceof boe)) {
                            w511.b();
                            return null;
                        }
                        doe doeVar3 = ((boe) trb1Var).a;
                        if (doeVar3 != null) {
                            doeVar = new doe(doeVar3.a, doeVar3.b);
                            doeVar2 = doeVar;
                        }
                    }
                    if (doeVar2 != null) {
                        tq00 tq00Var = zh20Var.d;
                        l7x0 l7x0Var = (l7x0) e100Var.c;
                        yfa yfaVar = (yfa) e100Var.b;
                        boolean z2 = trb1Var instanceof boe;
                        if (z2) {
                            mapPinType = MapPinType.CUSTOM;
                        } else if (trb1Var instanceof aoe) {
                            c0k0 c0k0Var3 = ((aoe) trb1Var).a;
                            yzj0 yzj0Var = c0k0Var3 instanceof yzj0 ? (yzj0) c0k0Var3 : null;
                            Integer valueOf2 = yzj0Var != null ? Integer.valueOf(yzj0Var.a) : null;
                            mapPinType = (valueOf2 != null && valueOf2.intValue() == 0) ? MapPinType.SOURCE : valueOf2 == null ? MapPinType.UNKNOWN : MapPinType.DESTINATION;
                        } else {
                            if (trb1Var != null) {
                                w511.b();
                                return null;
                            }
                            mapPinType = MapPinType.UNKNOWN;
                        }
                        int[] iArr = ci20.a;
                        int i = iArr[mapPinType.ordinal()];
                        if (i == 1) {
                            afz0Var = new afz0(tj51.b);
                        } else {
                            if (i != 2 && i != 3 && i != 4) {
                                w511.b();
                                return null;
                            }
                            afz0Var = new afz0(sj51.b);
                        }
                        bfz0 bfz0Var = afz0Var;
                        sbv sbvVar = tq00Var != null ? tq00Var.a.a : null;
                        if (sbvVar != null) {
                            String str5 = sbvVar.c;
                            bfz0 zez0Var = (str5 == null || (f2 = yfaVar.f(str5)) == null) ? bfz0Var : new zez0(f2.a);
                            String str6 = sbvVar.a;
                            if (str6 == null || (str4 = l7x0Var.a(str6)) == null) {
                                str4 = sbvVar.b;
                            }
                            cuj0Var = new lvi0(str4, null, null, null, zez0Var, 46);
                        } else {
                            int i2 = iArr[mapPinType.ordinal()];
                            if (i2 == 1) {
                                cuj0Var = new cuj0(ozg0.ic_finish, null, null, bfz0Var, 22);
                            } else {
                                if (i2 != 2 && i2 != 3 && i2 != 4) {
                                    w511.b();
                                    return null;
                                }
                                cuj0Var = new cuj0(ozg0.ic_boxfill, null, null, bfz0Var, 22);
                            }
                        }
                        jtb0 jtb0Var = new jtb0(cuj0Var, (tq00Var == null || (str3 = tq00Var.a.b) == null) ? null : yfaVar.f(str3));
                        sbv sbvVar2 = tq00Var != null ? tq00Var.c : null;
                        if (sbvVar2 == null) {
                            ltb0Var = mtb0.a;
                        } else {
                            String str7 = sbvVar2.c;
                            zez0 zez0Var2 = (str7 == null || (f = yfaVar.f(str7)) == null) ? null : new zez0(f.a);
                            String str8 = sbvVar2.a;
                            if (str8 == null || (str = l7x0Var.a(str8)) == null) {
                                str = sbvVar2.b;
                            }
                            ltb0Var = new ltb0(new lvi0(str, null, null, null, zez0Var2, 46));
                        }
                        ntb0 ntb0Var = new ntb0(mapPinType, jtb0Var, ltb0Var, tq00Var != null ? tq00Var.b : true);
                        String str9 = zh20Var.a;
                        int intValue = valueOf.intValue();
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((ig00) obj2).a == (z ? MapConfig$MapStyle$MapTheme.DARK : MapConfig$MapStyle$MapTheme.LIGHT)) {
                                break;
                            }
                        }
                        ig00 ig00Var = (ig00) obj2;
                        if (ig00Var == null || (str2 = ig00Var.b) == null) {
                            str2 = "";
                        }
                        t6u0 t6u0Var = new t6u0(intValue, new is00(z, str2));
                        o690 o690Var = zh20Var.e;
                        x2s x2sVar = new x2s(zh20Var.g, zh20Var.h);
                        boolean z3 = trb1Var instanceof aoe;
                        if (z3) {
                            c0k0Var = ((aoe) trb1Var).a;
                        } else {
                            if (!z2 && trb1Var != null) {
                                w511.b();
                                return null;
                            }
                            c0k0Var = null;
                        }
                        if (z3) {
                            vu0Var = ((aoe) trb1Var).b;
                        } else {
                            if (!z2 && trb1Var != null) {
                                w511.b();
                                return null;
                            }
                            vu0Var = null;
                        }
                        return new yh20(str9, doeVar2, t6u0Var, ntb0Var, o690Var, x2sVar, c0k0Var, vu0Var, zh20Var.f);
                    }
                }
                doeVar2 = null;
                if (doeVar2 != null) {
                }
            }
        }
        return null;
    }
}
