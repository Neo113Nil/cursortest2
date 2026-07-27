package S1;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final U1.e f2846a;

    /* renamed from: b, reason: collision with root package name */
    public Interpolator f2847b;

    /* renamed from: c, reason: collision with root package name */
    public long f2848c = com.anythink.basead.exoplayer.i.a.f7883f;

    /* renamed from: d, reason: collision with root package name */
    public int f2849d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2850e = new HashMap();

    public e(U1.e eVar) {
        this.f2846a = eVar;
    }

    public final ObjectAnimator a() {
        HashMap hashMap = this.f2850e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[hashMap.size()];
        Iterator it = hashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            float[] fArr = cVar.f2843a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i6 = this.f2849d;
            float f3 = fArr[i6];
            while (true) {
                int i9 = this.f2849d;
                Object[] objArr = cVar.f2845c;
                if (i6 < objArr.length + i9) {
                    int i10 = i6 - i9;
                    int length = i6 % objArr.length;
                    float f9 = fArr[length] - f3;
                    if (f9 < 0.0f) {
                        f9 += fArr[fArr.length - 1];
                    }
                    if (cVar instanceof d) {
                        keyframeArr[i10] = Keyframe.ofInt(f9, ((Integer) objArr[length]).intValue());
                    } else if (cVar instanceof b) {
                        keyframeArr[i10] = Keyframe.ofFloat(f9, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i10] = Keyframe.ofObject(f9, objArr[length]);
                    }
                    i6++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(cVar.f2844b, keyframeArr);
            i++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f2846a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f2848c);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setInterpolator(this.f2847b);
        return ofPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        T1.a aVar = new T1.a(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        aVar.f3076b = fArr;
        this.f2847b = aVar;
    }

    public final void c(float[] fArr, a aVar, Float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.f2850e.put(aVar.getName(), new b(fArr, aVar, fArr2));
    }

    public final void d(float[] fArr, a aVar, Integer[] numArr) {
        int length = fArr.length;
        int length2 = numArr.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.f2850e.put(aVar.getName(), new d(fArr, aVar, numArr));
    }
}
