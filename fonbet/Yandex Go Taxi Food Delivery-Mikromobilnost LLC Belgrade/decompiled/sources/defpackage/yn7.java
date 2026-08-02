package defpackage;

import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class yn7 {
    public static xn7 a(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        ArrayList arrayList = new ArrayList();
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            Iterator it = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it.hasNext()) {
                arrayList.add(a((Camera2OutputConfigImpl) it.next()));
            }
        }
        try {
            try {
                try {
                    SurfaceOutputConfigImpl surfaceOutputConfigImpl = (SurfaceOutputConfigImpl) camera2OutputConfigImpl;
                    return new r84(surfaceOutputConfigImpl.getId(), surfaceOutputConfigImpl.getSurfaceGroupId(), surfaceOutputConfigImpl.getPhysicalCameraId(), arrayList, surfaceOutputConfigImpl.getSurface());
                } catch (ClassCastException unused) {
                    vg10.g(camera2OutputConfigImpl.getClass(), "Not supported Camera2OutputConfigImpl: ");
                    return null;
                }
            } catch (ClassCastException unused2) {
                ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                return new x64(imageReaderOutputConfigImpl.getId(), imageReaderOutputConfigImpl.getSurfaceGroupId(), imageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
            }
        } catch (ClassCastException unused3) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            return new l74(multiResolutionImageReaderOutputConfigImpl.getId(), multiResolutionImageReaderOutputConfigImpl.getSurfaceGroupId(), multiResolutionImageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        }
    }
}
