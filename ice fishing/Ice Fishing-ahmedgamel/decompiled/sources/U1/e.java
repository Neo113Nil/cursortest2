package U1;

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
    public final W1.e f3285a;

    /* renamed from: b, reason: collision with root package name */
    public Interpolator f3286b;

    /* renamed from: c, reason: collision with root package name */
    public long f3287c = com.anythink.basead.exoplayer.i.a.f8669f;

    /* renamed from: d, reason: collision with root package name */
    public int f3288d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3289e = new HashMap();

    public e(W1.e eVar) {
        this.f3285a = eVar;
    }

    public final ObjectAnimator a() {
        HashMap hashMap = this.f3289e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[hashMap.size()];
        Iterator it = hashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            float[] fArr = cVar.f3282a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i4 = this.f3288d;
            float f2 = fArr[i4];
            while (true) {
                int i6 = this.f3288d;
                Object[] objArr = cVar.f3284c;
                if (i4 < objArr.length + i6) {
                    int i9 = i4 - i6;
                    int length = i4 % objArr.length;
                    float f9 = fArr[length] - f2;
                    if (f9 < 0.0f) {
                        f9 += fArr[fArr.length - 1];
                    }
                    if (cVar instanceof d) {
                        keyframeArr[i9] = Keyframe.ofInt(f9, ((Integer) objArr[length]).intValue());
                    } else if (cVar instanceof b) {
                        keyframeArr[i9] = Keyframe.ofFloat(f9, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i9] = Keyframe.ofObject(f9, objArr[length]);
                    }
                    i4++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(cVar.f3283b, keyframeArr);
            i++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f3285a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f3287c);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setInterpolator(this.f3286b);
        return ofPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        V1.a aVar = new V1.a(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        aVar.f3392b = fArr;
        this.f3286b = aVar;
    }

    public final void c(float[] fArr, a aVar, Float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.f3289e.put(aVar.getName(), new b(fArr, aVar, fArr2));
    }

    public final void d(float[] fArr, a aVar, Integer[] numArr) {
        int length = fArr.length;
        int length2 = numArr.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        this.f3289e.put(aVar.getName(), new d(fArr, aVar, numArr));
    }
}
