package com.gamericefishpro.space.pd;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum k {
    IN_APP_WEBVIEW("webview"),
    BROWSER("browser"),
    REPLACE_CONTENT("replacement");

    private final String text;
    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k fromString(String str) {
            for (k kVar : k.values()) {
                if (kotlin.text.d.g(kVar.text, str, true)) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    k(String str) {
        this.text = str;
    }

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
