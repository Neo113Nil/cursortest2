package defpackage;

import android.content.Context;
import com.yandex.runtime.image.ImageProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.a;

/* loaded from: classes6.dex */
public final class uz8 {
    public final Context a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i3y c;

    public uz8(Context context) {
        this.a = context;
        final int i = 0;
        new sls(this) { // from class: tz8
            public final /* synthetic */ uz8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                uz8 uz8Var = this.b;
                switch (i2) {
                    case 0:
                        return new f9v(uz8Var.a, f1h0.ic_top_round);
                    default:
                        return ImageProvider.fromResource(uz8Var.a, f1h0.map_car_econom);
                }
            }
        };
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: tz8
            public final /* synthetic */ uz8 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                uz8 uz8Var = this.b;
                switch (i22) {
                    case 0:
                        return new f9v(uz8Var.a, f1h0.ic_top_round);
                    default:
                        return ImageProvider.fromResource(uz8Var.a, f1h0.map_car_econom);
                }
            }
        });
    }

    public final void a(String str, ImageProvider imageProvider) {
        this.b.put(str, imageProvider);
    }
}
