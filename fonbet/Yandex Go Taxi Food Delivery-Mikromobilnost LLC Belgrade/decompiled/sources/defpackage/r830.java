package defpackage;

import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public final class r830 extends yme {
    public final Moshi a;

    public r830(Moshi moshi) {
        this.a = moshi;
    }

    public static r830 d(Moshi moshi) {
        if (moshi != null) {
            return new r830(moshi);
        }
        ny61.t("moshi == null");
        return null;
    }

    public static Set e(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // defpackage.yme
    public final zme a(Type type, Annotation[] annotationArr) {
        return new v830(this.a.adapter(type, e(annotationArr)));
    }

    @Override // defpackage.yme
    public final zme b(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        return new w830(this.a.adapter(type, e(annotationArr)));
    }
}
