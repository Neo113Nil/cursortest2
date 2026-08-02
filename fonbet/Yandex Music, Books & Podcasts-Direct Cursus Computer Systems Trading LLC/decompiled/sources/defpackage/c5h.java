package defpackage;

import android.database.Cursor;
import com.yandex.music.databases.main.MainDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c5h extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5h(g0l g0lVar, mqs mqsVar, String str, a6l a6lVar, e6v e6vVar, Continuation continuation) {
        super(1, continuation);
        this.j = 4;
        this.l = g0lVar;
        this.m = mqsVar;
        this.k = str;
        this.n = a6lVar;
        this.o = e6vVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c5h((ueo) this.l, continuation, (List) this.m, (d5h) this.n, (MainDatabase) this.o, this.k);
            case 1:
                return new c5h((xc5) this.l, this.k, (a6l) this.m, (kcr) this.n, (Boolean) this.o, continuation, 1);
            case 2:
                return new c5h((yc5) this.l, this.k, (a6l) this.m, (kcr) this.n, (Boolean) this.o, continuation, 2);
            case 3:
                return new c5h((bd5) this.l, this.k, (a6l) this.m, (kcr) this.n, (Boolean) this.o, continuation, 3);
            default:
                return new c5h((g0l) this.l, (mqs) this.m, this.k, (a6l) this.n, (e6v) this.o, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((c5h) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.j;
        Object obj2 = this.l;
        Object obj3 = this.o;
        Object obj4 = this.n;
        String str2 = this.k;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                d5h d5hVar = (d5h) obj4;
                List list = (List) obj5;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                rsr writableDatabase = ((MainDatabase) ((ueo) obj2)).j().getWritableDatabase();
                Cursor query = writableDatabase.query("SELECT track_id FROM tracks_cache_mirror WHERE is_permanent = 1");
                try {
                    Cursor cursor = query;
                    mnp mnpVar = new mnp();
                    while (cursor.moveToNext()) {
                        mnpVar.add(cursor.getString(0));
                    }
                    mnp a = uop.a(mnpVar);
                    yd5.q(query, null);
                    List<Object[]> list2 = list;
                    HashSet hashSet = new HashSet();
                    for (Object[] objArr : list2) {
                        Object obj6 = objArr[1];
                        obj6.getClass();
                        if (((Integer) obj6).intValue() == 1) {
                            Object obj7 = objArr[0];
                            obj7.getClass();
                            str = (String) obj7;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            hashSet.add(str);
                        }
                    }
                    if (!Intrinsics.d(a, hashSet)) {
                        writableDatabase.execSQL("DELETE FROM tracks_cache_mirror");
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            writableDatabase.execSQL("INSERT INTO tracks_cache_mirror VALUES (?,?)", (Object[]) it.next());
                        }
                        nc7 nc7Var = (nc7) d5hVar.b.getValue();
                        rsr writableDatabase2 = ((MainDatabase) obj3).j().getWritableDatabase();
                        nc7Var.getClass();
                        writableDatabase2.getClass();
                        str2.getClass();
                        p4h p4hVar = (p4h) d5hVar.c.getValue();
                        p4hVar.getClass();
                        p4hVar.a(str2).a("tracks_cache_mirror");
                    }
                    return Unit.a;
                } finally {
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                a6l a6lVar = (a6l) obj5;
                return new gzu((xc5) obj2, new v80(str2, a6lVar.a, a6lVar.b), new ezu((kcr) obj4, (Boolean) obj3));
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                a6l a6lVar2 = (a6l) obj5;
                return new hzu((yc5) obj2, new v80(str2, a6lVar2.a, a6lVar2.b), new ezu((kcr) obj4, (Boolean) obj3));
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                a6l a6lVar3 = (a6l) obj5;
                return new izu((bd5) obj2, new v80(str2, a6lVar3.a, a6lVar3.b), new ezu((kcr) obj4, (Boolean) obj3));
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                a6l a6lVar4 = (a6l) obj4;
                return new fzu(ybl.h((e6v) obj3, t75.c((mqs) obj5), new v80(str2, a6lVar4.a, a6lVar4.b), new ezu(hcr.a, Boolean.FALSE), false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5h(dd5 dd5Var, String str, a6l a6lVar, kcr kcrVar, Boolean bool, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = dd5Var;
        this.k = str;
        this.m = a6lVar;
        this.n = kcrVar;
        this.o = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5h(ueo ueoVar, Continuation continuation, List list, d5h d5hVar, MainDatabase mainDatabase, String str) {
        super(1, continuation);
        this.j = 0;
        this.l = ueoVar;
        this.m = list;
        this.n = d5hVar;
        this.o = mainDatabase;
        this.k = str;
    }
}
