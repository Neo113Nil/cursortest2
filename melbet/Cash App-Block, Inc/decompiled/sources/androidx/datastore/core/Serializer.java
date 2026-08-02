package androidx.datastore.core;

import java.io.FileInputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public interface Serializer {
    Object getDefaultValue();

    Object readFrom(FileInputStream fileInputStream);

    Unit writeTo(Object obj, UncloseableOutputStream uncloseableOutputStream);
}
