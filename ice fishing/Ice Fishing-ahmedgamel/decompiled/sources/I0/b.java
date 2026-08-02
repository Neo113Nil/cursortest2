package I0;

import android.os.Build;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i) {
        super(str, str2);
        this.f1277d = i;
    }

    @Override // I0.c
    public final boolean a() {
        switch (this.f1277d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
