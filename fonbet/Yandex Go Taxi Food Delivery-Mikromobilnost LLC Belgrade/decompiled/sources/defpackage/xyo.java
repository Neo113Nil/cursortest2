package defpackage;

import androidx.datastore.preferences.protobuf.j;

/* loaded from: classes.dex */
public abstract class xyo {
    public static final j a = new j();
    public static final tyo b;

    static {
        fvf0 fvf0Var = fvf0.c;
        tyo tyoVar = null;
        try {
            tyoVar = (tyo) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = tyoVar;
    }
}
