package app.cash.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface ReadTimeout {
    int duration();

    TimeUnit unit();
}
