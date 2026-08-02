package N6;

import com.IceFishing.LiveIceFishing.StartActivity;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p4.AbstractC4838b;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2057a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2057a) {
            case 0:
                ((Map) obj).clear();
                break;
            case 1:
                ((List) obj).clear();
                break;
            default:
                int i = StartActivity.f6381z;
                ((AbstractC4838b) obj).getClass();
                break;
        }
    }
}
