package defpackage;

import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class oka implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IOException b;

    public /* synthetic */ oka(int i, IOException iOException) {
        this.a = i;
        this.b = iOException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        RebalancedException rebalancedException = (RebalancedException) obj;
        switch (this.a) {
            case 0:
                rebalancedException.getClass();
                i = ((i6e) this.b).d;
                break;
            case 1:
                rebalancedException.getClass();
                i = ((i6e) this.b).d;
                break;
            default:
                rebalancedException.getClass();
                i = ((i6e) this.b).d;
                break;
        }
        return Integer.valueOf(i);
    }
}
