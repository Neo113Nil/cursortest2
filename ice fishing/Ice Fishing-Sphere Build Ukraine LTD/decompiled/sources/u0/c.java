package u0;

/* loaded from: classes.dex */
public abstract class c extends o.g {
    public static final void B(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        E0.i.e(objArr, "<this>");
        E0.i.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }
}
