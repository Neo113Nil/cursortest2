package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class u42 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public List k;
    public int l;
    public final /* synthetic */ w42 m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u42(w42 w42Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = w42Var;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new u42(this.m, this.n, continuation, 0);
            default:
                return new u42(this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((u42) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
        w42 w42Var = this.m;
        String str = this.n;
        Continuation continuation = null;
        int i3 = 2;
        switch (i2) {
            case 0:
                jyr jyrVar2 = w42Var.f;
                jyr jyrVar3 = w42Var.d;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                int i5 = 0;
                if (i4 == 0) {
                    qgg.h0(obj);
                    e12 e12Var = (e12) jyrVar3.getValue();
                    String string = ((dd0) jyrVar2.getValue()).a.getString(R.string.android_auto_audiobooks_title);
                    string.getClass();
                    o42[] o42VarArr = o42.a;
                    y02 y02Var = y02.b;
                    q42 q42Var = new q42(w42Var, continuation, i5);
                    r42 r42Var = new r42(w42Var, continuation, i5);
                    this.l = 1;
                    jyrVar = jyrVar2;
                    i = 0;
                    b = e12Var.b(string, "COLLECTION_ALL_AUDIOBOOKS_MEDIA_ID", null, y02Var, y02Var, 9, q42Var, r42Var, this);
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
                o42[] o42VarArr2 = o42.a;
                y02 y02Var2 = y02.a;
                y02 y02Var3 = y02.b;
                s42 s42Var = new s42(w42Var, str, continuation, i);
                t42 t42Var = new t42(w42Var, str, continuation, i);
                this.k = list;
                this.l = 2;
                b2 = e12Var2.b(string2, "COLLECTION_CHAPTERS_MEDIA_ID", y02Var2, y02Var3, y02Var2, 9, s42Var, t42Var, this);
                break;
            default:
                jyr jyrVar4 = w42Var.f;
                jyr jyrVar5 = w42Var.d;
                nm6 nm6Var3 = nm6.a;
                int i6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    e12 e12Var3 = (e12) jyrVar5.getValue();
                    String string3 = ((dd0) jyrVar4.getValue()).a.getString(R.string.android_auto_podcasts_title);
                    string3.getClass();
                    o42[] o42VarArr3 = o42.a;
                    y02 y02Var4 = y02.b;
                    q42 q42Var2 = new q42(w42Var, continuation, 3);
                    r42 r42Var2 = new r42(w42Var, continuation, i3);
                    this.l = 1;
                    nm6Var = nm6Var3;
                    b3 = e12Var3.b(string3, "COLLECTION_ALL_PODCASTS_MEDIA_ID", null, y02Var4, y02Var4, 9, q42Var2, r42Var2, this);
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
                o42[] o42VarArr4 = o42.a;
                y02 y02Var5 = y02.a;
                y02 y02Var6 = y02.b;
                s42 s42Var2 = new s42(w42Var, str, continuation, 5);
                t42 t42Var2 = new t42(w42Var, str, continuation, 2);
                this.k = list2;
                this.l = 2;
                b4 = e12Var4.b(string4, "COLLECTION_EPISODES_MEDIA_ID", y02Var5, y02Var6, y02Var5, 9, s42Var2, t42Var2, this);
                break;
        }
    }
}
