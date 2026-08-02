package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum icv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        return str.replace("%%", "m1000x1000");
    }
}
