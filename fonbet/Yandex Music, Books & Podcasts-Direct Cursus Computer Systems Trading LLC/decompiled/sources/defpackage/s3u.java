package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s3u extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ Collection l;
    public final /* synthetic */ b4u m;
    public final /* synthetic */ String n;
    public u2u o;
    public s9u p;
    public Iterator q;
    public x1u r;
    public int s;
    public int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3u(ueo ueoVar, b4u b4uVar, String str, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = collection;
        this.m = b4uVar;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new s3u(this.k, this.m, this.n, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s3u) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0275, code lost:
    
        if (r5 != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02c3, code lost:
    
        if (r7 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0195, code lost:
    
        if (r4.b(r27.n, r6, r27) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023b A[LOOP:1: B:21:0x0235->B:23:0x023b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178 A[LOOP:3: B:54:0x0172->B:56:0x0178, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x031b -> B:7:0x0320). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u2u U;
        Collection collection;
        s9u s9uVar;
        int i;
        Iterator it;
        Iterator it2;
        int i2;
        int i3;
        int i4;
        int i5;
        x1u x1uVar;
        Iterator it3;
        s9u s9uVar2;
        u2u u2uVar;
        int i6;
        Iterator it4;
        Object G;
        Object obj2 = nm6.a;
        int i7 = this.j;
        Collection collection2 = this.l;
        switch (i7) {
            case 0:
                qgg.h0(obj);
                MainDatabase mainDatabase = (MainDatabase) this.k;
                n3u V = mainDatabase.V();
                U = mainDatabase.U();
                s9u W = mainDatabase.W();
                Collection<x1u> collection3 = collection2;
                ArrayList arrayList = new ArrayList(v75.o(collection3, 10));
                for (x1u x1uVar2 : collection3) {
                    String str = x1uVar2.a;
                    String str2 = x1uVar2.b;
                    String R = q7g.R(str2);
                    R.getClass();
                    String str3 = x1uVar2.c;
                    String I = men.I(x1uVar2.d);
                    n3u n3uVar = V;
                    long j = x1uVar2.f;
                    String str4 = x1uVar2.e;
                    List list = x1uVar2.k;
                    Collection collection4 = collection2;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(((hs5) it5.next()).d());
                    }
                    String W2 = CollectionsKt.W(arrayList2, StringUtils.COMMA, "", "", null);
                    j1g j1gVar = x1uVar2.l;
                    Integer valueOf = j1gVar != null ? Integer.valueOf(b4u.j(j1gVar)) : null;
                    Date date = x1uVar2.m;
                    arrayList.add(new c4u(str, str2, R, str3, I, str4, j, W2, valueOf, date != null ? wc7.a(date) : null));
                    V = n3uVar;
                    collection2 = collection4;
                }
                collection = collection2;
                n3u n3uVar2 = V;
                this.o = U;
                this.p = W;
                this.s = 0;
                this.j = 1;
                Object G2 = up6.G(n3uVar2.a, false, true, new wes(14, n3uVar2, arrayList), this);
                if (G2 != nm6.a) {
                    G2 = Unit.a;
                }
                if (G2 != obj2) {
                    s9uVar = W;
                    i = 0;
                    p51 p51Var = this.m.b;
                    HashSet hashSet = new HashSet();
                    it = collection.iterator();
                    while (it.hasNext()) {
                        z75.t(hashSet, ((x1u) it.next()).h);
                    }
                    this.o = U;
                    this.p = s9uVar;
                    this.s = i;
                    this.j = 2;
                    break;
                }
                return obj2;
            case 1:
                i = this.s;
                s9uVar = this.p;
                U = this.o;
                qgg.h0(obj);
                collection = collection2;
                p51 p51Var2 = this.m.b;
                HashSet hashSet2 = new HashSet();
                it = collection.iterator();
                while (it.hasNext()) {
                }
                this.o = U;
                this.p = s9uVar;
                this.s = i;
                this.j = 2;
                break;
            case 2:
                i = this.s;
                s9uVar = this.p;
                U = this.o;
                qgg.h0(obj);
                collection = collection2;
                it2 = collection.iterator();
                i2 = 0;
                if (!it2.hasNext()) {
                    return Unit.a;
                }
                x1u x1uVar3 = (x1u) it2.next();
                String str5 = x1uVar3.a;
                List list2 = x1uVar3.h;
                ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((c01) it6.next()).a);
                }
                this.o = U;
                this.p = s9uVar;
                this.q = it2;
                this.r = x1uVar3;
                this.s = i;
                this.t = i2;
                this.u = 0;
                this.j = 3;
                U.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM video_clip_artist WHERE video_clip_id = ? AND artist_id NOT IN (");
                swf.x(arrayList3.size(), sb);
                sb.append(")");
                Object G3 = up6.G(U.a, false, true, new t2u(0, sb.toString(), str5, arrayList3), this);
                if (G3 != nm6.a) {
                    G3 = Unit.a;
                }
                if (G3 != obj2) {
                    it3 = it2;
                    i4 = i2;
                    s9uVar2 = s9uVar;
                    u2uVar = U;
                    i5 = i;
                    x1uVar = x1uVar3;
                    i3 = 0;
                    List list3 = x1uVar.h;
                    ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new v2u(x1uVar.a, ((c01) it4.next()).a));
                    }
                    this.o = u2uVar;
                    this.p = s9uVar2;
                    this.q = it3;
                    this.r = x1uVar;
                    this.s = i5;
                    this.t = i4;
                    this.u = i3;
                    this.j = 4;
                    G = up6.G(u2uVar.a, false, true, new wes(11, u2uVar, arrayList4), this);
                    if (G != nm6.a) {
                        G = Unit.a;
                        break;
                    }
                }
                return obj2;
            case 3:
                i3 = this.u;
                i4 = this.t;
                i5 = this.s;
                x1uVar = this.r;
                it3 = this.q;
                s9uVar2 = this.p;
                u2uVar = this.o;
                qgg.h0(obj);
                List list32 = x1uVar.h;
                ArrayList arrayList42 = new ArrayList(v75.o(list32, 10));
                it4 = list32.iterator();
                while (it4.hasNext()) {
                }
                this.o = u2uVar;
                this.p = s9uVar2;
                this.q = it3;
                this.r = x1uVar;
                this.s = i5;
                this.t = i4;
                this.u = i3;
                this.j = 4;
                G = up6.G(u2uVar.a, false, true, new wes(11, u2uVar, arrayList42), this);
                if (G != nm6.a) {
                }
                break;
            case 4:
                i3 = this.u;
                i4 = this.t;
                i5 = this.s;
                x1uVar = this.r;
                it3 = this.q;
                s9uVar2 = this.p;
                u2uVar = this.o;
                qgg.h0(obj);
                String str6 = x1uVar.a;
                List list4 = x1uVar.g;
                this.o = u2uVar;
                this.p = s9uVar2;
                this.q = it3;
                this.r = x1uVar;
                this.s = i5;
                this.t = i4;
                this.u = i3;
                this.j = 5;
                s9uVar2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DELETE FROM video_clip_track WHERE video_clip_id = ? AND track_id NOT IN (");
                swf.x(list4.size(), sb2);
                sb2.append(")");
                Object G4 = up6.G(s9uVar2.a, false, true, new zzq(13, sb2.toString(), str6, list4), this);
                if (G4 != nm6.a) {
                    G4 = Unit.a;
                    break;
                }
                break;
            case 5:
                i3 = this.u;
                i4 = this.t;
                i5 = this.s;
                x1uVar = this.r;
                it3 = this.q;
                s9uVar2 = this.p;
                u2uVar = this.o;
                qgg.h0(obj);
                int i8 = i4;
                int i9 = i3;
                x1u x1uVar4 = x1uVar;
                s9u s9uVar3 = s9uVar2;
                List list5 = x1uVar4.g;
                ArrayList arrayList5 = new ArrayList(v75.o(list5, 10));
                Iterator it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(new t9u(x1uVar4.a, (String) it7.next()));
                }
                this.o = u2uVar;
                this.p = s9uVar3;
                this.q = it3;
                this.r = null;
                this.s = i5;
                this.t = i8;
                this.u = i9;
                this.j = 6;
                Object G5 = up6.G(s9uVar3.a, false, true, new wes(17, s9uVar3, arrayList5), this);
                if (G5 != nm6.a) {
                    G5 = Unit.a;
                }
                if (G5 != obj2) {
                    i6 = i8;
                    i = i5;
                    s9uVar = s9uVar3;
                    it2 = it3;
                    U = u2uVar;
                    i2 = i6;
                    if (!it2.hasNext()) {
                    }
                }
                return obj2;
            case 6:
                int i10 = this.t;
                int i11 = this.s;
                Iterator it8 = this.q;
                s9u s9uVar4 = this.p;
                u2u u2uVar2 = this.o;
                qgg.h0(obj);
                i6 = i10;
                i = i11;
                it2 = it8;
                s9uVar = s9uVar4;
                U = u2uVar2;
                i2 = i6;
                if (!it2.hasNext()) {
                }
                break;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
