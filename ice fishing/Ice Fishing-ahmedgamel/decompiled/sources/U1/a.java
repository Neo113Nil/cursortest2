package U1;

import android.util.Property;

/* loaded from: classes.dex */
public abstract class a extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i) {
        super(Float.class, str);
        this.f3281a = i;
        switch (i) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public abstract void a(int i, Object obj);

    public abstract void b(Object obj, float f2);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3281a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                break;
            default:
                a(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
