package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum ccv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        return str.replace("%%", i <= 600 ? "576x384" : i <= 768 ? "686x458" : i <= 1000 ? "940x628" : "1146x765");
    }
}
