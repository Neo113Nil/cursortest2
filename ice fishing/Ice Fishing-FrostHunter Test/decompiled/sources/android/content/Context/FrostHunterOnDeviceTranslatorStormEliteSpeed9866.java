package android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorStormEliteSpeed9866 extends IOException {
    public final String FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterOnDeviceTranslatorStormEliteSpeed9866(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.FrostHunterCameraXPixelTurboCosmos9814 = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }
}
