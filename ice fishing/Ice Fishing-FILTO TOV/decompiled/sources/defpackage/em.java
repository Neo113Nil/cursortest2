package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class em extends IOException {
    public final String OOA6hdeuvCS;

    public em(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.OOA6hdeuvCS = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.OOA6hdeuvCS;
    }
}
