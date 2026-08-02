package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class g82 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public List k;
    public int l;
    public final /* synthetic */ h82 m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g82(h82 h82Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = h82Var;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g82(this.m, this.n, continuation, 0);
            default:
                return new g82(this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g82) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        if (r0 == r13) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r0 == r13) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016f, code lost:
    
        if (r0 == r15) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        if (r0 == r15) goto L32;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jyr jyrVar;
        int i;
        Object b;
        List list;
        Object b2;
        nm6 nm6Var;
        Object b3;
        List list2;
        Object b4;
        int i2 = this.j;
        h82 h82Var = this.m;
        String str = this.n;
        Continuation continuation = null;
        int i3 = 2;
        switch (i2) {
            case 0:
                jyr jyrVar2 = h82Var.f;
                jyr jyrVar3 = h82Var.d;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                int i5 = 0;
                if (i4 == 0) {
                    qgg.h0(obj);
                    e12 e12Var = (e12) jyrVar3.getValue();
                    String string = ((dd0) jyrVar2.getValue()).a.getString(R.string.android_auto_audiobooks_title);
                    string.getClass();
                    b72 b72Var = b72.b;
                    y02 y02Var = y02.b;
                    c82 c82Var = new c82(h82Var, continuation, i5);
                    d82 d82Var = new d82(h82Var, continuation, i5);
                    this.l = 1;
                    jyrVar = jyrVar2;
                    i = 0;
                    b = e12Var.b(string, "DOWNLOADED_ALL_AUDIOBOOKS_MEDIA_ID", null, y02Var, y02Var, 9, c82Var, d82Var, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list3 = this.k;
                        qgg.h0(obj);
                        list = list3;
                        b2 = obj;
                        return CollectionsKt.g0(list, (List) b2);
                    }
                    qgg.h0(obj);
                    b = obj;
                    jyrVar = jyrVar2;
                    i = 0;
                }
                list = (List) b;
                e12 e12Var2 = (e12) jyrVar3.getValue();
                String string2 = ((dd0) jyrVar.getValue()).a.getString(R.string.android_auto_chapters_title);
                string2.getClass();
                b72 b72Var2 = b72.b;
                y02 y02Var2 = y02.a;
                y02 y02Var3 = y02.b;
                e82 e82Var = new e82(h82Var, str, continuation, i);
                f82 f82Var = new f82(h82Var, str, continuation, i);
                this.k = list;
                this.l = 2;
                b2 = e12Var2.b(string2, "DOWNLOADED_CHAPTERS_MEDIA_ID", y02Var2, y02Var3, y02Var2, 9, e82Var, f82Var, this);
                break;
            default:
                jyr jyrVar4 = h82Var.f;
                jyr jyrVar5 = h82Var.d;
                nm6 nm6Var3 = nm6.a;
                int i6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    e12 e12Var3 = (e12) jyrVar5.getValue();
                    String string3 = ((dd0) jyrVar4.getValue()).a.getString(R.string.android_auto_podcasts_title);
                    string3.getClass();
                    b72 b72Var3 = b72.b;
                    y02 y02Var4 = y02.b;
                    c82 c82Var2 = new c82(h82Var, continuation, 3);
                    d82 d82Var2 = new d82(h82Var, continuation, i3);
                    this.l = 1;
                    nm6Var = nm6Var3;
                    b3 = e12Var3.b(string3, "DOWNLOADED_ALL_PODCASTS_MEDIA_ID", null, y02Var4, y02Var4, 9, c82Var2, d82Var2, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = this.k;
                        qgg.h0(obj);
                        list2 = list4;
                        b4 = obj;
                        return CollectionsKt.g0(list2, (List) b4);
                    }
                    qgg.h0(obj);
                    nm6Var = nm6Var3;
                    b3 = obj;
                }
                list2 = (List) b3;
                e12 e12Var4 = (e12) jyrVar5.getValue();
                String string4 = ((dd0) jyrVar4.getValue()).a.getString(R.string.android_auto_episodes_title);
                string4.getClass();
                b72 b72Var4 = b72.b;
                y02 y02Var5 = y02.a;
                y02 y02Var6 = y02.b;
                e82 e82Var2 = new e82(h82Var, str, continuation, 5);
                f82 f82Var2 = new f82(h82Var, str, continuation, 2);
                this.k = list2;
                this.l = 2;
                b4 = e12Var4.b(string4, "DOWNLOADED_EPISODES_MEDIA_ID", y02Var5, y02Var6, y02Var5, 9, e82Var2, f82Var2, this);
                break;
        }
    }
}
