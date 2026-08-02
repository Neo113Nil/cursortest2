package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes6.dex */
public final class wjm extends aur implements Function2 {
    public final /* synthetic */ int j;
    public qkm k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ikm n;
    public final /* synthetic */ xjm o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjm(ikm ikmVar, xjm xjmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = ikmVar;
        this.o = xjmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                wjm wjmVar = new wjm(this.n, this.o, continuation, 0);
                wjmVar.m = obj;
                return wjmVar;
            default:
                wjm wjmVar2 = new wjm(this.n, this.o, continuation, 1);
                wjmVar2.m = obj;
                return wjmVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wjm) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        qkm qkmVar;
        CoverPath none;
        String str;
        Date date;
        zjm zjmVar;
        CoverPath none2;
        xkm xkmVar;
        qkm qkmVar2;
        switch (this.j) {
            case 0:
                xjm xjmVar = this.o;
                ikm ikmVar = this.n;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                neg.A(dyr.b, ikmVar.b.a);
                                qxr.a();
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qkmVar = this.k;
                            qgg.h0(obj);
                            xkmVar = (xkm) xjmVar.c.getValue();
                            this.m = null;
                            this.k = null;
                            this.l = 3;
                            if (xkmVar.a(qkmVar, this) == nm6Var) {
                            }
                            neg.A(dyr.b, ikmVar.b.a);
                            qxr.a();
                        }
                    } else {
                        qkmVar = this.k;
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    u51 u51Var = (u51) CollectionsKt.firstOrNull(ikmVar.a);
                    qkm qkmVar3 = u51Var == null ? null : new qkm(ikmVar.b.a, u51Var.a, pkm.a);
                    if (qkmVar3 == null) {
                        dfi.r("Can't construct sub operation from " + ikmVar, "PreSaveCenter");
                        break;
                    } else {
                        x0q x0qVar = xjmVar.e;
                        Unit unit = Unit.a;
                        this.m = null;
                        this.k = qkmVar3;
                        this.l = 1;
                        if (x0qVar.emit(unit, this) != nm6Var) {
                            qkmVar = qkmVar3;
                        }
                    }
                }
                ykm b = xjmVar.b();
                lt ltVar = ikmVar.b;
                String str2 = ltVar.a;
                String str3 = ltVar.c;
                u9b u9bVar = ltVar.e;
                if (u9bVar != null) {
                    none = kg5.M(u9bVar, WebPath$Storage.AVATARS);
                } else {
                    none = CoverPath.none();
                    none.getClass();
                }
                CoverPath coverPath = none;
                ArrayList<u51> arrayList = ikmVar.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (u51 u51Var2 : arrayList) {
                    String str4 = u51Var2.a;
                    String str5 = u51Var2.b;
                    u9b u9bVar2 = u51Var2.c;
                    if (u9bVar2 != null) {
                        none2 = kg5.M(u9bVar2, WebPath$Storage.AVATARS);
                    } else {
                        none2 = CoverPath.none();
                        none2.getClass();
                    }
                    arrayList2.add(new ljm(str4, str5, none2));
                }
                Date date2 = ikmVar.c;
                long time = date2.getTime() - System.currentTimeMillis();
                long j = time >= 0 ? time : 0L;
                lt ltVar2 = ikmVar.b;
                String str6 = ltVar2.b.a;
                WarningContent warningContent = ltVar2.d;
                gd6 gd6Var = ltVar2.f;
                if (gd6Var != null) {
                    boolean z = gd6Var.c;
                    List list = gd6Var.a;
                    str = str6;
                    ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((hs5) it.next()).d());
                    }
                    zjmVar = new zjm(arrayList3, z);
                    date = date2;
                } else {
                    str = str6;
                    date = date2;
                    zjmVar = null;
                }
                kjm kjmVar = new kjm(arrayList2, str2, date, j, coverPath, str3, str, warningContent, null, true, zjmVar);
                this.m = null;
                this.k = qkmVar;
                this.l = 2;
                b.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str7 = ((frt) qdcVar.C(I)).c().a;
                str7.getClass();
                Object e = ((fkm) b.a.getValue()).e(str7, kjmVar, this);
                if (e != nm6.a) {
                    e = Unit.a;
                }
                if (e == nm6Var) {
                }
                xkmVar = (xkm) xjmVar.c.getValue();
                this.m = null;
                this.k = null;
                this.l = 3;
                if (xkmVar.a(qkmVar, this) == nm6Var) {
                }
                neg.A(dyr.b, ikmVar.b.a);
                qxr.a();
                break;
            default:
                xjm xjmVar2 = this.o;
                ikm ikmVar2 = this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            neg.A(dyr.c, ikmVar2.b.a);
                            qxr.a();
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qkmVar2 = this.k;
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    u51 u51Var3 = (u51) CollectionsKt.firstOrNull(ikmVar2.a);
                    qkmVar2 = u51Var3 == null ? null : new qkm(ikmVar2.b.a, u51Var3.a, pkm.b);
                    if (qkmVar2 == null) {
                        dfi.r("Can't construct unsub operation from " + ikmVar2, "PreSaveCenter");
                        break;
                    } else {
                        ykm b2 = xjmVar2.b();
                        String str8 = ikmVar2.b.a;
                        this.m = null;
                        this.k = qkmVar2;
                        this.l = 1;
                        b2.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(frt.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        String str9 = ((frt) qdcVar2.C(I2)).c().a;
                        str9.getClass();
                        Object b3 = ((fkm) b2.a.getValue()).b(str9, str8, this);
                        if (b3 != nm6Var2) {
                            b3 = Unit.a;
                        }
                        if (b3 == nm6Var2) {
                        }
                    }
                }
                xkm xkmVar2 = (xkm) xjmVar2.c.getValue();
                this.m = null;
                this.k = null;
                this.l = 2;
                if (xkmVar2.a(qkmVar2, this) == nm6Var2) {
                }
                neg.A(dyr.c, ikmVar2.b.a);
                qxr.a();
                break;
        }
        return Unit.a;
    }
}
