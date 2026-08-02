package androidx.camera.camera2.adapter;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.compose.ui.window.Api33Impl;
import androidx.core.view.DisplayCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class EncoderProfilesProviderAdapter implements EncoderProfilesProvider {
    public final int cameraId;
    public final String cameraIdString;
    public final Quirks cameraQuirks;
    public final boolean hasValidCameraId;
    public final LinkedHashMap mEncoderProfilesCache;

    public EncoderProfilesProviderAdapter(String str, Quirks quirks) {
        boolean z;
        int i;
        quirks.getClass();
        this.cameraIdString = str;
        this.cameraQuirks = quirks;
        this.mEncoderProfilesCache = new LinkedHashMap();
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            StringUtilsKt.w("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.cameraIdString + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.hasValidCameraId = z;
        this.cameraId = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:10|(6:12|(2:46|(1:48)(6:49|50|(1:52)(1:(1:54)(2:55|56))|(4:16|(2:41|(2:43|(3:20|(1:(2:23|(2:24|(2:26|(2:28|29)(1:30))(1:31))))(2:33|(1:(2:35|(2:38|39)(1:37))(1:40)))|32)))|18|(0))|44|45))|14|(0)|44|45)|60|61|(14:63|(1:65)|66|67|69|70|(2:72|(1:(1:75)(1:76)))(1:90)|77|78|80|81|(0)|44|45)|14|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0088, code lost:
    
        utils.StringUtilsKt.w("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + r22, r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0180  */
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EncoderProfilesProxy getAll(int i) {
        String str;
        int i2;
        String str2;
        AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
        boolean contains;
        EncoderProfilesProxy encoderProfilesProxy = null;
        if (this.hasValidCameraId) {
            int i3 = this.cameraId;
            if (CamcorderProfile.hasProfile(i3, i)) {
                Integer valueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.mEncoderProfilesCache;
                if (linkedHashMap.containsKey(valueOf)) {
                    return (EncoderProfilesProxy) linkedHashMap.get(Integer.valueOf(i));
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    EncoderProfiles all = DisplayCompat.getAll(i, this.cameraIdString);
                    if (all != null) {
                        if (DeviceQuirks.getAll().get(InvalidVideoProfilesQuirk.class) == null) {
                            try {
                                if (i4 >= 33) {
                                    autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = Api33Impl.from(all);
                                } else {
                                    if (i4 < 31) {
                                        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i4 + ". Version 31 or higher required.");
                                    }
                                    autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = DisplayCompat.from(all);
                                }
                            } catch (NullPointerException e) {
                                StringUtilsKt.w("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e);
                            }
                            if (autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy != 0) {
                                CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.cameraQuirks.get(CamcorderProfileResolutionQuirk.class);
                                if (camcorderProfileResolutionQuirk != null) {
                                    List list = autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.videoProfiles;
                                    list.getClass();
                                    if (!list.isEmpty()) {
                                        contains = CollectionsKt.toList((List) camcorderProfileResolutionQuirk.supportedResolution$delegate.getValue()).contains(((AutoValue_EncoderProfilesProxy_VideoProfileProxy) list.get(0)).getResolution());
                                        if (!contains) {
                                            List list2 = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
                                            if (i == 0) {
                                                list2.getClass();
                                                int size = list2.size() - 1;
                                                while (true) {
                                                    if (-1 < size) {
                                                        Object obj = list2.get(size);
                                                        obj.getClass();
                                                        EncoderProfilesProxy all2 = getAll(((Number) obj).intValue());
                                                        if (all2 != null) {
                                                            encoderProfilesProxy = all2;
                                                        } else {
                                                            size--;
                                                        }
                                                    }
                                                }
                                            } else if (i == 1) {
                                                Iterator it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        Integer num = (Integer) it.next();
                                                        num.getClass();
                                                        EncoderProfilesProxy all3 = getAll(num.intValue());
                                                        if (all3 != null) {
                                                            encoderProfilesProxy = all3;
                                                        }
                                                    }
                                                }
                                            }
                                            autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = encoderProfilesProxy;
                                        }
                                    }
                                }
                                contains = true;
                                if (!contains) {
                                }
                            }
                            linkedHashMap.put(Integer.valueOf(i), autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy);
                            return autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
                        }
                        StringUtilsKt.d("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                    }
                    autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = 0;
                    if (autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy != 0) {
                    }
                    linkedHashMap.put(Integer.valueOf(i), autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy);
                    return autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
                }
                CamcorderProfile camcorderProfile = CamcorderProfile.get(i3, i);
                if (camcorderProfile != null) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 31) {
                        StringUtilsKt.w("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i5 + "instead. CamcorderProfile is deprecated on API 31.");
                    }
                    int i6 = camcorderProfile.duration;
                    int i7 = camcorderProfile.fileFormat;
                    ArrayList arrayList = new ArrayList();
                    int i8 = camcorderProfile.audioCodec;
                    switch (i8) {
                        case 1:
                            str = "audio/3gpp";
                            break;
                        case 2:
                            str = "audio/amr-wb";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = "audio/mp4a-latm";
                            break;
                        case 6:
                            str = "audio/vorbis";
                            break;
                        case 7:
                            str = "audio/opus";
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    String str3 = str;
                    int i9 = camcorderProfile.audioBitRate;
                    int i10 = camcorderProfile.audioSampleRate;
                    int i11 = camcorderProfile.audioChannels;
                    if (i8 != 3) {
                        i2 = 5;
                        if (i8 != 4) {
                            i2 = i8 != 5 ? -1 : 39;
                        }
                    } else {
                        i2 = 2;
                    }
                    arrayList.add(new AutoValue_EncoderProfilesProxy_AudioProfileProxy(str3, i8, i9, i10, i11, i2));
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = camcorderProfile.videoCodec;
                    switch (i12) {
                        case 1:
                            str2 = "video/3gpp";
                            break;
                        case 2:
                            str2 = "video/avc";
                            break;
                        case 3:
                            str2 = "video/mp4v-es";
                            break;
                        case 4:
                            str2 = "video/x-vnd.on2.vp8";
                            break;
                        case 5:
                            str2 = "video/hevc";
                            break;
                        case 6:
                            str2 = "video/x-vnd.on2.vp9";
                            break;
                        case 7:
                            str2 = "video/dolby-vision";
                            break;
                        case 8:
                            str2 = "video/av01";
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList2.add(new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i12, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(i6, i7, arrayList, arrayList2);
                    if (autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy != 0) {
                    }
                    linkedHashMap.put(Integer.valueOf(i), autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy);
                    return autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
                }
                autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = 0;
                if (autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy != 0) {
                }
                linkedHashMap.put(Integer.valueOf(i), autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy);
                return autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        return this.hasValidCameraId && getAll(i) != null;
    }
}
