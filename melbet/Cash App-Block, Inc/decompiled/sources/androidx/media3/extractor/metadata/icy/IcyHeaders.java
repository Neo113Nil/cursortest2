package androidx.media3.extractor.metadata.icy;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.tracing.Trace;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class IcyHeaders implements Metadata.Entry {
    public final int bitrate;
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final String name;
    public final String url;

    public IcyHeaders(int i, int i2, String str, String str2, String str3, boolean z) {
        Trace.checkArgument(i2 == -1 || i2 > 0);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IcyHeaders parse(Map map) {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        List list6 = (List) map.get("icy-br");
        boolean z3 = true;
        int i3 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i2 = Integer.parseInt(str4) * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                        i = i2;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i4 = i3;
                        if (z) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z2 = ((String) list4.get(0)).equals("1");
            z = true;
        } else {
            z2 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i3 = parseInt;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid metadata interval: " + str5);
                        z3 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = parseInt;
                        Fragment$5$$ExternalSyntheticOutline0.m("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i42 = i3;
                        if (z) {
                        }
                    }
                }
                z = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i422 = i3;
        if (z) {
            return new IcyHeaders(i, i422, str, str2, str3, z2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.bitrate == icyHeaders.bitrate && Objects.equals(this.genre, icyHeaders.genre) && Objects.equals(this.name, icyHeaders.name) && Objects.equals(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.bitrate) * 31;
        String str = this.genre;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.name;
        if (str != null) {
            builder.station = str;
        }
        String str2 = this.genre;
        if (str2 != null) {
            builder.genre = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }
}
