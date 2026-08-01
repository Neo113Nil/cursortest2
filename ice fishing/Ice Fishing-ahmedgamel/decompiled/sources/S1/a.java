package S1;

import android.util.Property;

/* loaded from: classes.dex */
public abstract class a extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i) {
        super(Float.class, str);
        this.f2842a = i;
        switch (i) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public abstract void a(int i, Object obj);

    public abstract void b(Object obj, float f3);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2842a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                break;
            default:
                a(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
