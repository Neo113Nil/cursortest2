package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.u75;
import defpackage.we7;
import defpackage.xdr;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.H3;

/* loaded from: classes5.dex */
public final class Cb implements pjc {
    public final /* synthetic */ Eb a;
    public final /* synthetic */ Gb b;

    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;
        public final /* synthetic */ Gb b;

        @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager$search$$inlined$map$1$2", f = "TvSearchManager.kt", l = {68, 50}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.Cb$a$a, reason: collision with other inner class name */
        public static final class C0022a extends cg6 {
            public /* synthetic */ Object a;
            public int b;
            public a c;
            public rjc e;
            public List f;
            public Set g;
            public Collection h;
            public Iterator i;

            public C0022a(Continuation continuation) {
                super(continuation);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(rjc rjcVar, Gb gb) {
            this.a = rjcVar;
            this.b = gb;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r13 == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
        
            if (r7.emit(r12, r0) == r1) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:18:0x0098). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0092 -> B:17:0x0096). Please report as a decompilation issue!!! */
        @Override // defpackage.rjc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0022a c0022a;
            int i;
            Set linkedHashSet;
            Iterator it;
            List list;
            Collection collection;
            a<T> aVar;
            rjc rjcVar;
            if (continuation instanceof C0022a) {
                c0022a = (C0022a) continuation;
                int i2 = c0022a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0022a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0022a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0022a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar2 = this.a;
                        List list2 = (List) ((xdr) this.b.g).getValue();
                        linkedHashSet = new LinkedHashSet();
                        ArrayList g0 = CollectionsKt.g0(list2, (List) obj);
                        ArrayList arrayList = new ArrayList();
                        it = g0.iterator();
                        list = list2;
                        collection = arrayList;
                        aVar = this;
                        rjcVar = rjcVar2;
                        if (it.hasNext()) {
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = c0022a.i;
                    collection = c0022a.h;
                    linkedHashSet = c0022a.g;
                    list = c0022a.f;
                    rjcVar = c0022a.e;
                    aVar = c0022a.c;
                    qgg.h0(obj2);
                    H3 h3 = (H3) obj2;
                    if (h3 != null) {
                        collection.add(h3);
                    }
                    if (it.hasNext()) {
                        h3 = (H3) it.next();
                        if (h3 instanceof H3.a) {
                            Gb gb = aVar.b;
                            c0022a.c = aVar;
                            c0022a.e = rjcVar;
                            c0022a.f = list;
                            c0022a.g = linkedHashSet;
                            c0022a.h = collection;
                            c0022a.i = it;
                            c0022a.b = 1;
                            obj2 = Gb.a(gb, gb, (H3.a) h3, linkedHashSet, c0022a);
                        }
                        if (h3 != null) {
                        }
                        if (it.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : (List) collection) {
                                H3 h32 = (H3) t;
                                if (h32 instanceof H3.a) {
                                    H3.a aVar2 = (H3.a) h32;
                                    if (aVar2.a == null && CollectionsKt.I(linkedHashSet, aVar2.b)) {
                                    }
                                }
                                arrayList2.add(t);
                            }
                            List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList2));
                            int i3 = 0;
                            for (T t2 : w0) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                aVar.b.e.trackTvFound((H3) t2, list.size() + i3);
                                i3 = i4;
                            }
                            xdr xdrVar = (xdr) aVar.b.g;
                            xdrVar.getClass();
                            xdrVar.m(null, w0);
                            c0022a.c = null;
                            c0022a.e = null;
                            c0022a.f = null;
                            c0022a.g = null;
                            c0022a.h = null;
                            c0022a.i = null;
                            c0022a.b = 2;
                        }
                    }
                    return nm6Var;
                }
            }
            c0022a = new C0022a(continuation);
            Object obj22 = c0022a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0022a.b;
            if (i != 0) {
            }
        }
    }

    public Cb(Eb eb, Gb gb) {
        this.a = eb;
        this.b = gb;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
