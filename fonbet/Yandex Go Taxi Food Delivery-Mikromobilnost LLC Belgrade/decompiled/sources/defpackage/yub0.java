package defpackage;

import android.text.TextUtils;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;

/* loaded from: classes15.dex */
public final class yub0 implements x08, ho3 {
    public final xo3 a;
    public final zub0 b;
    public final /* synthetic */ avb0 c;

    public yub0(avb0 avb0Var, long j, String[] strArr, zub0 zub0Var) {
        this.c = avb0Var;
        this.b = zub0Var;
        avb0Var.c.f("tech_update_pinned_chats_bucket", "version", Long.valueOf(j), "pinned_chats", TextUtils.join(",", strArr));
        to3 to3Var = avb0Var.a;
        to3Var.getClass();
        PinnedChatsBucket pinnedChatsBucket = new PinnedChatsBucket();
        pinnedChatsBucket.version = j;
        PinnedChatsBucket.Value value = new PinnedChatsBucket.Value();
        pinnedChatsBucket.value = value;
        value.pinnedChats = strArr;
        this.a = to3Var.a.a(new io3(21, to3Var, pinnedChatsBucket, this));
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        PinnedChatsBucket pinnedChatsBucket = (PinnedChatsBucket) ((BucketsData) obj).a(PinnedChatsBucket.class);
        if (pinnedChatsBucket != null) {
            l020 C = this.c.b.C();
            try {
                C.w0(pinnedChatsBucket);
                C.s();
                C.close();
            } catch (Throwable th) {
                if (C != null) {
                    try {
                        C.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        this.b.success();
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        this.b.c(i);
        return false;
    }

    @Override // defpackage.x08
    public final void cancel() {
        this.a.cancel();
    }
}
