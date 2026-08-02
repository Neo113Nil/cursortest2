package yads;

import defpackage.sls;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class wd extends Lambda implements sls {
    public static final wd w = new wd();

    public wd() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
