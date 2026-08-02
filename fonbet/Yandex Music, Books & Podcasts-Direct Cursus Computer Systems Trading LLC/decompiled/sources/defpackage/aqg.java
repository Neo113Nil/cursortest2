package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class aqg implements rld {
    @Override // defpackage.rld
    @NotNull
    public String getId() {
        return "LocaleKeyProvider";
    }

    @Override // defpackage.rld
    public Object key() {
        String locale = swf.I().toString();
        locale.getClass();
        return locale;
    }
}
