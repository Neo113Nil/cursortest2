package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class zui extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jac l;
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zui(jac jacVar, String str, int i, Set set, Continuation continuation, int i2) {
        super(1, continuation);
        this.j = i2;
        this.l = jacVar;
        this.m = str;
        this.n = i;
        this.o = set;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zui(this.l, this.m, this.n, this.o, continuation, 0);
            case 1:
                return new zui(this.l, this.m, this.n, this.o, continuation, 1);
            default:
                return new zui(this.l, this.m, this.n, this.o, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((zui) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0245  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            Iterable<zv> iterable = (Iterable) obj;
                            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                            for (zv zvVar : iterable) {
                                Date b = wc7.a.b(zvVar.b);
                                arrayList.add(new xui(b != null ? new Long(b.getTime()) : null, new usi(h4a.X(zvVar), null)));
                            }
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    i5h i2 = this.l.i();
                    this.k = 1;
                    obj = i2.b(this.m, this);
                    if (obj == nm6Var) {
                    }
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                ysrVar.b(String.valueOf(this.n));
                um4 um4Var = new um4(pgp.a);
                um4 um4Var2 = new um4(pgp.b);
                um4Var2.c("liked", true);
                um4Var2.e("original_id", this.o);
                um4Var.a(um4Var2);
                um4Var.e("album_type", dw.MyMusicBooks.a);
                tt0.K(ysrVar, um4Var);
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                this.k = 2;
                obj = w.b(a, this);
                if (obj == nm6Var) {
                }
                Iterable<zv> iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                while (r8.hasNext()) {
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            Iterable<rxs> iterable3 = (Iterable) obj;
                            ArrayList arrayList3 = new ArrayList(v75.o(iterable3, 10));
                            for (rxs rxsVar : iterable3) {
                                Date b2 = wc7.a.b(rxsVar.i);
                                arrayList3.add(new xui(b2 != null ? new Long(b2.getTime()) : null, new vsi(ngg.M(rxsVar))));
                            }
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    i5h i4 = this.l.i();
                    this.k = 1;
                    obj = i4.b(this.m, this);
                    if (obj == nm6Var2) {
                    }
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar2 = new ysr("track_mview");
                ysrVar2.b(String.valueOf(this.n));
                um4 um4Var3 = new um4(pgp.a);
                um4Var3.e("track_type", gys.MyMusic.a);
                um4Var3.c("track_for_kids", false);
                um4 um4Var4 = new um4(pgp.b);
                um4Var4.c("liked", true);
                um4Var4.e("original_id", this.o);
                um4Var3.a(um4Var4);
                tt0.K(ysrVar2, um4Var3);
                ysrVar2.f = "liked_timestamp DESC, position ASC";
                atn a2 = ysrVar2.a();
                this.k = 2;
                obj = Q.b(a2, this);
                if (obj == nm6Var2) {
                }
                Iterable<rxs> iterable32 = (Iterable) obj;
                ArrayList arrayList32 = new ArrayList(v75.o(iterable32, 10));
                while (r8.hasNext()) {
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            qgg.h0(obj);
                            Iterable<zv> iterable4 = (Iterable) obj;
                            ArrayList arrayList4 = new ArrayList(v75.o(iterable4, 10));
                            for (zv zvVar2 : iterable4) {
                                Date b3 = wc7.a.b(zvVar2.b);
                                arrayList4.add(new xui(b3 != null ? new Long(b3.getTime()) : null, new usi(h4a.X(zvVar2), null)));
                            }
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    i5h i6 = this.l.i();
                    this.k = 1;
                    obj = i6.b(this.m, this);
                    if (obj == nm6Var3) {
                    }
                }
                cw w2 = ((MainDatabase) obj).w();
                ysr ysrVar3 = new ysr("album_mview");
                ysrVar3.b(String.valueOf(this.n));
                um4 um4Var5 = new um4(pgp.a);
                um4 um4Var6 = new um4(pgp.b);
                um4Var6.c("liked", true);
                um4Var6.e("original_id", this.o);
                um4Var5.a(um4Var6);
                um4Var5.e("album_type", dw.MyMusicPodcasts.a);
                um4Var5.c("album_for_kids", false);
                tt0.K(ysrVar3, um4Var5);
                ysrVar3.f = "timestamp DESC";
                atn a3 = ysrVar3.a();
                this.k = 2;
                obj = w2.b(a3, this);
                if (obj == nm6Var3) {
                }
                Iterable<zv> iterable42 = (Iterable) obj;
                ArrayList arrayList42 = new ArrayList(v75.o(iterable42, 10));
                while (r8.hasNext()) {
                }
                break;
        }
        return null;
    }
}
