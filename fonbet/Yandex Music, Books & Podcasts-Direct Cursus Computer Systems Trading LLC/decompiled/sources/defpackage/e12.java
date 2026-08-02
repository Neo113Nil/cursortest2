package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class e12 {
    public final md0 a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public e12(md0 md0Var) {
        this.a = md0Var;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: c12
            public final /* synthetic */ e12 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (dc0) this.b.a.o.getValue();
                    case 1:
                        return this.b.a.a();
                    default:
                        ((jd0) this.b.a.t.getValue()).getClass();
                        return Integer.valueOf(wct.s());
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: c12
            public final /* synthetic */ e12 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (dc0) this.b.a.o.getValue();
                    case 1:
                        return this.b.a.a();
                    default:
                        ((jd0) this.b.a.t.getValue()).getClass();
                        return Integer.valueOf(wct.s());
                }
            }
        });
        final int i3 = 2;
        this.d = btf.b(new Function0(this) { // from class: c12
            public final /* synthetic */ e12 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (dc0) this.b.a.o.getValue();
                    case 1:
                        return this.b.a.a();
                    default:
                        ((jd0) this.b.a.t.getValue()).getClass();
                        return Integer.valueOf(wct.s());
                }
            }
        });
    }

    public static MediaBrowserCompat$MediaItem a(e12 e12Var, String str, String str2, y02 y02Var, y02 y02Var2, d62 d62Var, y02 y02Var3, int i) {
        Uri uri = null;
        if ((i & 128) != 0) {
            d62Var = null;
        }
        y02 y02Var4 = (i & 256) != 0 ? null : y02Var3;
        e12Var.getClass();
        str.getClass();
        str2.getClass();
        y02Var.getClass();
        y02Var2.getClass();
        if (d62Var != null) {
            if (!(d62Var instanceof d62)) {
                b6e.s();
                return null;
            }
            uri = d62Var.a;
        }
        Uri uri2 = uri;
        Bundle J = cxb.J();
        if (y02Var4 != null) {
            J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var4.a());
        }
        J.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", y02Var.a());
        J.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", y02Var2.a());
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, str2, null, null, null, uri2, J, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x01bc -> B:12:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012f -> B:25:0x0136). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, y02 y02Var, y02 y02Var2, y02 y02Var3, int i, Function2 function2, pyc pycVar, cg6 cg6Var) {
        d12 d12Var;
        e12 e12Var;
        int i2;
        String str3;
        y02 y02Var4;
        y02 y02Var5;
        y02 y02Var6;
        String str4;
        pyc pycVar2;
        Uri uri;
        List list;
        int i3;
        int i4;
        Iterator it;
        Collection collection;
        String str5;
        int i5;
        pyc pycVar3;
        int i6;
        y02 y02Var7;
        y02 y02Var8;
        Iterator it2;
        y02 y02Var9;
        Uri uri2;
        Collection collection2;
        int i7;
        String str6;
        pyc pycVar4;
        int i8;
        int i9 = i;
        if (cg6Var instanceof d12) {
            d12Var = (d12) cg6Var;
            int i10 = d12Var.y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d12Var.y = i10 - Integer.MIN_VALUE;
                e12Var = this;
                Object obj = d12Var.w;
                Object obj2 = nm6.a;
                i2 = d12Var.y;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Object num = new Integer(i9 + 1);
                    d12Var.j = str;
                    str3 = str2;
                    d12Var.k = str3;
                    d12Var.l = null;
                    y02Var4 = y02Var;
                    d12Var.m = y02Var4;
                    y02Var5 = y02Var2;
                    d12Var.n = y02Var5;
                    y02Var6 = y02Var3;
                    d12Var.o = y02Var6;
                    d12Var.p = pycVar;
                    d12Var.t = i9;
                    d12Var.y = 1;
                    Object invoke = function2.invoke(num, d12Var);
                    if (invoke != obj2) {
                        str4 = str;
                        obj = invoke;
                        pycVar2 = pycVar;
                        uri = null;
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    i9 = d12Var.t;
                    pycVar2 = d12Var.p;
                    y02 y02Var10 = d12Var.o;
                    y02 y02Var11 = d12Var.n;
                    y02 y02Var12 = d12Var.m;
                    Uri uri3 = d12Var.l;
                    String str7 = d12Var.k;
                    str4 = d12Var.j;
                    qgg.h0(obj);
                    y02Var6 = y02Var10;
                    str3 = str7;
                    y02Var5 = y02Var11;
                    y02Var4 = y02Var12;
                    uri = uri3;
                } else if (i2 == 2) {
                    int i11 = d12Var.v;
                    i8 = d12Var.u;
                    i7 = d12Var.t;
                    collection2 = d12Var.s;
                    it2 = d12Var.r;
                    Collection collection3 = d12Var.q;
                    pycVar4 = d12Var.p;
                    y02Var8 = d12Var.o;
                    y02Var7 = d12Var.n;
                    y02 y02Var13 = d12Var.m;
                    uri2 = d12Var.l;
                    str3 = d12Var.k;
                    str6 = d12Var.j;
                    qgg.h0(obj);
                    int i12 = i11;
                    collection2.add((MediaBrowserCompat$MediaItem) obj);
                    collection2 = collection3;
                    y02Var9 = y02Var13;
                    i3 = i12;
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        d12Var.j = str6;
                        d12Var.k = str3;
                        d12Var.l = uri2;
                        d12Var.m = y02Var9;
                        d12Var.n = y02Var7;
                        d12Var.o = y02Var8;
                        d12Var.p = pycVar4;
                        String str8 = str6;
                        Collection collection4 = collection2;
                        d12Var.q = collection4;
                        d12Var.r = it2;
                        d12Var.s = collection4;
                        d12Var.t = i7;
                        d12Var.u = i8;
                        d12Var.v = i3;
                        d12Var.y = 2;
                        Object invoke2 = pycVar4.invoke(next, null, d12Var);
                        if (invoke2 != obj2) {
                            str6 = str8;
                            i12 = i3;
                            y02Var13 = y02Var9;
                            obj = invoke2;
                            collection3 = collection2;
                            collection2.add((MediaBrowserCompat$MediaItem) obj);
                            collection2 = collection3;
                            y02Var9 = y02Var13;
                            i3 = i12;
                            if (it2.hasNext()) {
                                String str9 = str6;
                                List list2 = (List) collection2;
                                n8g b = t75.b();
                                b.add(a(e12Var, str3, str9, y02Var7, y02Var8, uri2 != null ? new d62(uri2) : null, y02Var9, 96));
                                b.addAll(list2);
                                return t75.a(b);
                            }
                        }
                        return obj2;
                    }
                } else {
                    if (i2 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = d12Var.v;
                    i6 = d12Var.u;
                    i4 = d12Var.t;
                    collection = d12Var.s;
                    it = d12Var.r;
                    Collection collection5 = d12Var.q;
                    pycVar3 = d12Var.p;
                    str5 = d12Var.j;
                    qgg.h0(obj);
                    collection.add((MediaBrowserCompat$MediaItem) obj);
                    collection = collection5;
                    if (it.hasNext()) {
                        Object next2 = it.next();
                        d12Var.j = str5;
                        d12Var.k = null;
                        d12Var.l = null;
                        d12Var.m = null;
                        d12Var.n = null;
                        d12Var.o = null;
                        d12Var.p = pycVar3;
                        Collection collection6 = collection;
                        d12Var.q = collection6;
                        d12Var.r = it;
                        d12Var.s = collection6;
                        d12Var.t = i4;
                        d12Var.u = i6;
                        d12Var.v = i5;
                        d12Var.y = 3;
                        obj = pycVar3.invoke(next2, str5, d12Var);
                        if (obj != obj2) {
                            collection5 = collection;
                            collection.add((MediaBrowserCompat$MediaItem) obj);
                            collection = collection5;
                            if (it.hasNext()) {
                                return (List) collection;
                            }
                        }
                        return obj2;
                    }
                }
                list = (List) obj;
                i3 = 0;
                if (list.size() <= i9) {
                    List q0 = CollectionsKt.q0(list, i9);
                    ArrayList arrayList = new ArrayList(v75.o(q0, 10));
                    y02Var7 = y02Var5;
                    y02Var8 = y02Var6;
                    it2 = q0.iterator();
                    y02Var9 = y02Var4;
                    uri2 = uri;
                    collection2 = arrayList;
                    i7 = i9;
                    str6 = str4;
                    pycVar4 = pycVar2;
                    i8 = 0;
                    if (it2.hasNext()) {
                    }
                } else {
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    i4 = i9;
                    it = list3.iterator();
                    collection = arrayList2;
                    str5 = str4;
                    i5 = 0;
                    pycVar3 = pycVar2;
                    i6 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        e12Var = this;
        d12Var = new d12(e12Var, cg6Var);
        Object obj3 = d12Var.w;
        Object obj22 = nm6.a;
        i2 = d12Var.y;
        if (i2 != 0) {
        }
        list = (List) obj3;
        i3 = 0;
        if (list.size() <= i9) {
        }
    }
}
