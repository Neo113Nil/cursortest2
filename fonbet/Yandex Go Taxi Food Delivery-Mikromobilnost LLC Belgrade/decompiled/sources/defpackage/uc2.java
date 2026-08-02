package defpackage;

import android.graphics.Shader;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.ProgressBarView;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.ByteString;

/* loaded from: classes10.dex */
public final /* synthetic */ class uc2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uc2(long j, rg7 rg7Var) {
        this.a = 1;
        this.b = j;
        this.c = rg7Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Shader brush_12SF9DM$lambda$0;
        zy11 updateAnimation$lambda$0$1;
        kk41 kk41Var;
        switch (this.a) {
            case 0:
                brush_12SF9DM$lambda$0 = AndroidTextPaint.setBrush_12SF9DM$lambda$0((ml6) this.c, this.b);
                return brush_12SF9DM$lambda$0;
            case 1:
                return this.b + " " + ((rg7) this.c).a;
            case 2:
                updateAnimation$lambda$0$1 = ProgressBarView.updateAnimation$lambda$0$1((ProgressBarView) this.c, this.b);
                return updateAnimation$lambda$0$1;
            default:
                ydi0 ydi0Var = (ydi0) this.c;
                long j = this.b;
                synchronized (ydi0Var) {
                    try {
                        if (!ydi0Var.v && (kk41Var = ydi0Var.l) != null) {
                            int i = ydi0Var.x ? ydi0Var.w : -1;
                            ydi0Var.w++;
                            ydi0Var.x = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(ydi0Var.d);
                                sb.append("ms (after ");
                                ydi0.e(ydi0Var, new SocketTimeoutException(oyr.m(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    kk41Var.a(9, ByteString.c);
                                } catch (IOException e) {
                                    ydi0.e(ydi0Var, e, null, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
        }
    }

    public /* synthetic */ uc2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
