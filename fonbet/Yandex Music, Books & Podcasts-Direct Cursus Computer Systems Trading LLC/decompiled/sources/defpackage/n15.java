package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class n15 implements u34 {
    public final jyr a = l18.b.b(hag.I(e15.class), true);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[LOOP:0: B:13:0x00ca->B:15:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[LOOP:1: B:18:0x00ed->B:20:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        l15 l15Var;
        Object obj;
        nm6 nm6Var;
        int i2;
        long elapsedRealtimeNanos;
        int i3;
        Object f;
        int i4;
        List list;
        Iterator it;
        Iterator it2;
        if (cg6Var instanceof l15) {
            l15Var = (l15) cg6Var;
            int i5 = l15Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                l15Var.q = i5 - Integer.MIN_VALUE;
                l15 l15Var2 = l15Var;
                obj = l15Var2.o;
                nm6Var = nm6.a;
                i2 = l15Var2.q;
                jyr jyrVar = this.a;
                if (i2 != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    e15 e15Var = (e15) jyrVar.getValue();
                    Integer num = new Integer(i);
                    l15Var2.j = i;
                    i3 = 0;
                    l15Var2.k = 0;
                    l15Var2.n = elapsedRealtimeNanos;
                    l15Var2.l = 0;
                    l15Var2.q = 1;
                    e15Var.getClass();
                    List list2 = dw.MyMusicBooks.a;
                    f = e15.f(e15Var, vz1.k(list2, list2), Boolean.FALSE, num, l15Var2, 40);
                    if (f != nm6Var) {
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = l15Var2.m;
                    qgg.h0(obj);
                    List list3 = (List) obj;
                    List list4 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(u34.b((mqs) it.next()));
                    }
                    List list5 = list3;
                    ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                    it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(u34.c((oq) it2.next()));
                    }
                    zgg zggVar = new zgg(CollectionsKt.g0(arrayList, arrayList2));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar;
                }
                int i6 = l15Var2.l;
                long j = l15Var2.n;
                i4 = l15Var2.k;
                int i7 = l15Var2.j;
                qgg.h0(obj);
                elapsedRealtimeNanos = j;
                f = obj;
                i3 = i6;
                i = i7;
                List list6 = (List) f;
                e15 e15Var2 = (e15) jyrVar.getValue();
                Integer num2 = new Integer(i);
                l15Var2.m = list6;
                l15Var2.j = i;
                l15Var2.k = i4;
                l15Var2.n = elapsedRealtimeNanos;
                l15Var2.l = i3;
                l15Var2.q = 2;
                e15Var2.getClass();
                List list7 = dw.MyMusicBooks.a;
                obj = e15.e(e15Var2, vz1.k(list7, list7), Boolean.FALSE, num2, l15Var2, 16);
                if (obj != nm6Var) {
                    list = list6;
                    List list32 = (List) obj;
                    List list42 = list;
                    ArrayList arrayList3 = new ArrayList(v75.o(list42, 10));
                    it = list42.iterator();
                    while (it.hasNext()) {
                    }
                    List list52 = list32;
                    ArrayList arrayList22 = new ArrayList(v75.o(list52, 10));
                    it2 = list52.iterator();
                    while (it2.hasNext()) {
                    }
                    zgg zggVar2 = new zgg(CollectionsKt.g0(arrayList3, arrayList22));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar2;
                }
                return nm6Var;
            }
        }
        l15Var = new l15(this, cg6Var);
        l15 l15Var22 = l15Var;
        obj = l15Var22.o;
        nm6Var = nm6.a;
        i2 = l15Var22.q;
        jyr jyrVar2 = this.a;
        if (i2 != 0) {
        }
        List list62 = (List) f;
        e15 e15Var22 = (e15) jyrVar2.getValue();
        Integer num22 = new Integer(i);
        l15Var22.m = list62;
        l15Var22.j = i;
        l15Var22.k = i4;
        l15Var22.n = elapsedRealtimeNanos;
        l15Var22.l = i3;
        l15Var22.q = 2;
        e15Var22.getClass();
        List list72 = dw.MyMusicBooks.a;
        obj = e15.e(e15Var22, vz1.k(list72, list72), Boolean.FALSE, num22, l15Var22, 16);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[LOOP:0: B:13:0x00ca->B:15:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[LOOP:1: B:18:0x00ed->B:20:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, cg6 cg6Var) {
        m15 m15Var;
        Object obj;
        nm6 nm6Var;
        int i2;
        long elapsedRealtimeNanos;
        int i3;
        Object f;
        int i4;
        List list;
        Iterator it;
        Iterator it2;
        if (cg6Var instanceof m15) {
            m15Var = (m15) cg6Var;
            int i5 = m15Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                m15Var.q = i5 - Integer.MIN_VALUE;
                m15 m15Var2 = m15Var;
                obj = m15Var2.o;
                nm6Var = nm6.a;
                i2 = m15Var2.q;
                jyr jyrVar = this.a;
                if (i2 != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    e15 e15Var = (e15) jyrVar.getValue();
                    Integer num = new Integer(i);
                    m15Var2.j = i;
                    i3 = 0;
                    m15Var2.k = 0;
                    m15Var2.n = elapsedRealtimeNanos;
                    m15Var2.l = 0;
                    m15Var2.q = 1;
                    e15Var.getClass();
                    List list2 = gys.MyMusicPodcastEpisodes.a;
                    f = e15.f(e15Var, vz1.k(list2, list2), Boolean.FALSE, num, m15Var2, 40);
                    if (f != nm6Var) {
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = m15Var2.m;
                    qgg.h0(obj);
                    List list3 = (List) obj;
                    List list4 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(u34.b((mqs) it.next()));
                    }
                    List list5 = list3;
                    ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                    it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(u34.c((oq) it2.next()));
                    }
                    zgg zggVar = new zgg(CollectionsKt.g0(arrayList, arrayList2));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar;
                }
                int i6 = m15Var2.l;
                long j = m15Var2.n;
                i4 = m15Var2.k;
                int i7 = m15Var2.j;
                qgg.h0(obj);
                elapsedRealtimeNanos = j;
                f = obj;
                i3 = i6;
                i = i7;
                List list6 = (List) f;
                e15 e15Var2 = (e15) jyrVar.getValue();
                Integer num2 = new Integer(i);
                m15Var2.m = list6;
                m15Var2.j = i;
                m15Var2.k = i4;
                m15Var2.n = elapsedRealtimeNanos;
                m15Var2.l = i3;
                m15Var2.q = 2;
                e15Var2.getClass();
                List list7 = dw.MyMusicPodcasts.a;
                obj = e15.e(e15Var2, vz1.k(list7, list7), Boolean.FALSE, num2, m15Var2, 16);
                if (obj != nm6Var) {
                    list = list6;
                    List list32 = (List) obj;
                    List list42 = list;
                    ArrayList arrayList3 = new ArrayList(v75.o(list42, 10));
                    it = list42.iterator();
                    while (it.hasNext()) {
                    }
                    List list52 = list32;
                    ArrayList arrayList22 = new ArrayList(v75.o(list52, 10));
                    it2 = list52.iterator();
                    while (it2.hasNext()) {
                    }
                    zgg zggVar2 = new zgg(CollectionsKt.g0(arrayList3, arrayList22));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar2;
                }
                return nm6Var;
            }
        }
        m15Var = new m15(this, cg6Var);
        m15 m15Var22 = m15Var;
        obj = m15Var22.o;
        nm6Var = nm6.a;
        i2 = m15Var22.q;
        jyr jyrVar2 = this.a;
        if (i2 != 0) {
        }
        List list62 = (List) f;
        e15 e15Var22 = (e15) jyrVar2.getValue();
        Integer num22 = new Integer(i);
        m15Var22.m = list62;
        m15Var22.j = i;
        m15Var22.k = i4;
        m15Var22.n = elapsedRealtimeNanos;
        m15Var22.l = i3;
        m15Var22.q = 2;
        e15Var22.getClass();
        List list72 = dw.MyMusicPodcasts.a;
        obj = e15.e(e15Var22, vz1.k(list72, list72), Boolean.FALSE, num22, m15Var22, 16);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }
}
