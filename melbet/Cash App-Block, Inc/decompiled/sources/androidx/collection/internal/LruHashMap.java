package androidx.collection.internal;

import android.util.Log;
import androidx.room.migration.Migration;
import app.cash.zipline.loader.ManifestVerifier;
import app.cash.zipline.loader.SignatureAlgorithmId;
import app.cash.zipline.loader.internal.InternalJniKt;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LruHashMap {
    public final LinkedHashMap map;

    public LruHashMap(int i) {
        switch (i) {
            case 1:
                this.map = new LinkedHashMap();
                break;
            case 2:
                this.map = new LinkedHashMap();
                break;
            default:
                this.map = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public void addEcdsaP256(String str, ByteString byteString) {
        SignatureAlgorithmId[] signatureAlgorithmIdArr = SignatureAlgorithmId.$VALUES;
        this.map.put(str, new ManifestVerifier.Verifier(InternalJniKt.ecdsaP256, byteString));
    }

    public void addMigration(Migration migration) {
        migration.getClass();
        int i = migration.startVersion;
        int i2 = migration.endVersion;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.map;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + migration);
        }
        treeMap.put(Integer.valueOf(i2), migration);
    }
}
