package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class xa2 extends aur implements Function2 {
    public za2 j;
    public Collection k;
    public Iterator l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ List r;
    public final /* synthetic */ za2 s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa2(String str, List list, za2 za2Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = str;
        this.r = list;
        this.s = za2Var;
        this.t = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new xa2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xa2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0156, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0158, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r11 == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0156 -> B:6:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:23:0x008a). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        Collection arrayList2;
        za2 za2Var;
        int i4;
        Iterator it2;
        int i5;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem;
        nm6 nm6Var = nm6.a;
        int i6 = this.p;
        za2 za2Var2 = this.s;
        if (i6 == 0) {
            qgg.h0(obj);
            bd0[] bd0VarArr = bd0.a;
            boolean d = Intrinsics.d(this.q, "OFFLINE_TAB");
            i = 0;
            List list = this.r;
            if (!d) {
                if (list != null) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                }
                return null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                za2Var = za2Var2;
                i4 = 0;
                it2 = list.iterator();
                i5 = 0;
                if (it2.hasNext()) {
                }
            }
            if (this.t) {
            }
            return t75.c(mediaBrowserCompat$MediaItem);
        }
        if (i6 == 1) {
            i4 = this.o;
            i = this.n;
            i5 = this.m;
            it2 = this.l;
            arrayList2 = this.k;
            za2Var = this.j;
            qgg.h0(obj);
            Object b = obj;
            List list2 = (List) b;
            if (list2 != null) {
                arrayList2.add(list2);
            }
            if (it2.hasNext()) {
                List list3 = (List) arrayList2;
                if (list3 != null) {
                    ArrayList p = v75.p(list3);
                    ArrayList arrayList3 = p.isEmpty() ? null : p;
                    if (arrayList3 != null) {
                        return arrayList3;
                    }
                }
                if (this.t) {
                    z72 d2 = za2Var2.d();
                    d2.getClass();
                    d72[] d72VarArr = d72.b;
                    String string = d2.e().a.getString(R.string.android_auto_empty_offline_block);
                    string.getClass();
                    String string2 = d2.e().a.getString(R.string.android_auto_empty_offline_block_description);
                    string2.getClass();
                    mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat("EMPTY_OFFLINE_BLOCK_STUB_MEDIA_ID", string, string2, null, null, null, null, null), 2);
                } else {
                    z72 d3 = za2Var2.d();
                    d3.getClass();
                    d72[] d72VarArr2 = d72.b;
                    String string3 = d3.e().a.getString(R.string.android_auto_no_connection_block);
                    string3.getClass();
                    String string4 = d3.e().a.getString(R.string.android_auto_no_connection_block_description);
                    string4.getClass();
                    mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat("EMPTY_NO_NETWORK_BLOCK_STUB_MEDIA_ID", string3, string4, null, null, null, null, null), 2);
                }
                return t75.c(mediaBrowserCompat$MediaItem);
            }
            drf drfVar = (drf) it2.next();
            this.j = za2Var;
            this.k = arrayList2;
            this.l = it2;
            this.m = i5;
            this.n = i;
            this.o = i4;
            this.p = 1;
            b = za2.b(za2Var, drfVar, this);
        } else {
            if (i6 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.o;
            i3 = this.n;
            int i7 = this.m;
            Iterator it3 = this.l;
            Collection collection = this.k;
            za2 za2Var3 = this.j;
            qgg.h0(obj);
            i = i7;
            za2Var2 = za2Var3;
            arrayList = collection;
            it = it3;
            Object a = obj;
            List list4 = (List) a;
            if (list4 != null) {
                arrayList.add(list4);
            }
            if (it.hasNext()) {
                ArrayList arrayList4 = arrayList;
                if (arrayList4 != null) {
                    return v75.p(arrayList4);
                }
                return null;
            }
            drf drfVar2 = (drf) it.next();
            this.j = za2Var2;
            this.k = arrayList;
            this.l = it;
            this.m = i;
            this.n = i3;
            this.o = i2;
            this.p = 2;
            a = za2.a(za2Var2, drfVar2, this);
        }
    }
}
