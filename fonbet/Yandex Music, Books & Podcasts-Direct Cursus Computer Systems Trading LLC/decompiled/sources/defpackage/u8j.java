package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class u8j extends cg6 {
    public Object j;
    public Album$AlbumType k;
    public ArrayList l;
    public String m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ tl0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8j(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.p = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(null, this);
    }
}
