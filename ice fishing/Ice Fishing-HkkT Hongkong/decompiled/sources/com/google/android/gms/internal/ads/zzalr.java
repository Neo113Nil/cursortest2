package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzalr implements zzakr {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalp zzh = new zzalp(30.0f, 1, 1);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzc(String str, zzalp zzalpVar) throws zzakn {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzalpVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzalpVar.zzb) / zzalpVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzakn("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals("m")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c = 5;
            }
            c = 65535;
        }
        if (c == 0) {
            d = 3600.0d;
        } else {
            if (c != 1) {
                if (c == 3) {
                    d2 = 1000.0d;
                } else {
                    if (c != 4) {
                        if (c == 5) {
                            d2 = zzalpVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzalpVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c;
        String zza2 = zzfwk.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzalu zze(zzalu zzaluVar) {
        return zzaluVar == null ? new zzalu() : zzaluVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static zzalu zzf(XmlPullParser xmlPullParser, zzalu zzaluVar) {
        ?? r6;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzalu zzaluVar2 = zzaluVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            ?? r105 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzaluVar2 = zze(zzaluVar2);
                    try {
                        zzaluVar2.zzm(zzen.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzff.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaluVar2 = zze(zzaluVar2);
                    try {
                        zzaluVar2.zzo(zzen.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzff.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzaluVar2 = zze(zzaluVar2);
                        int i2 = zzfy.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzakn("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(split[1]);
                            zzff.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzakn("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode != 37) {
                            if (hashCode != 3240) {
                                if (hashCode == 3592 && group.equals("px")) {
                                    r10 = 0;
                                }
                            } else if (group.equals(UserDataStore.EMAIL)) {
                                r10 = 1;
                            }
                        } else if (group.equals("%")) {
                            r10 = 2;
                        }
                        if (r10 == 0) {
                            zzaluVar2.zzr(1);
                        } else if (r10 == 1) {
                            zzaluVar2.zzr(2);
                        } else {
                            if (r10 != 2) {
                                throw new zzakn("Invalid unit for fontSize: '" + group + "'.");
                            }
                            zzaluVar2.zzr(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        zzaluVar2.zzq(Float.parseFloat(group2));
                        break;
                    } catch (zzakn unused3) {
                        zzff.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzz(zzd(attributeValue));
                    break;
                case 8:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzv(zzd(attributeValue));
                    break;
                case 9:
                    String zza2 = zzfwk.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                            r105 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r105 = 1;
                    }
                    if (r105 == 0) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzA(z);
                        break;
                    } else if (r105 == 1) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzA(true);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String zza3 = zzfwk.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzx(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzaluVar2 = zze(zzaluVar2);
                                zzaluVar2.zzx(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzaluVar2 = zze(zzaluVar2);
                            zzaluVar2.zzx(3);
                            break;
                        }
                    } else {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzx(2);
                        break;
                    }
                case 11:
                    String zza4 = zzfwk.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r103 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzw(1);
                        break;
                    } else if (r103 == 1) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String zza5 = zzfwk.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzu(true);
                        break;
                    } else if (r102 == 1) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzu(z);
                        break;
                    } else if (r102 == 2) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzC(true);
                        break;
                    } else if (r102 == 3) {
                        zzaluVar2 = zze(zzaluVar2);
                        zzaluVar2.zzC(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzaluVar2 = zze(zzaluVar2);
                    zzaluVar2.zzB(zzaln.zza(attributeValue));
                    break;
                case 14:
                    zzalu zze2 = zze(zzaluVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            zzff.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        zzff.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zze2.zzy(f);
                    zzaluVar2 = zze2;
                    break;
            }
            i++;
            z = false;
        }
        return zzaluVar2;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = zzfy.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i, int i2, zzakq zzakqVar, zzep zzepVar) {
        zzakl.zza(zzb(bArr, i, i2), zzakqVar, zzepVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04ec A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0386 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0401 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044f A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04be A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x018b A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e8 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_ENTER, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027b A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, LOOP:1: B:75:0x027b->B:90:0x04fd, LOOP_START, PHI: r2 r5 r11
      0x027b: PHI (r2v25 java.lang.String) = (r2v10 java.lang.String), (r2v72 java.lang.String) binds: [B:74:0x0279, B:90:0x04fd] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r5v39 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v56 java.util.HashMap) binds: [B:74:0x0279, B:90:0x04fd] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r11v32 com.google.android.gms.internal.ads.zzalp) = (r11v5 com.google.android.gms.internal.ads.zzalp), (r11v49 com.google.android.gms.internal.ads.zzalp) binds: [B:74:0x0279, B:90:0x04fd] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0181, B:38:0x01da, B:41:0x01e8, B:43:0x01ee, B:45:0x01f6, B:47:0x01fe, B:49:0x0206, B:51:0x020e, B:53:0x0216, B:55:0x021c, B:57:0x0224, B:59:0x022c, B:61:0x0232, B:63:0x0238, B:65:0x0240, B:67:0x0248, B:70:0x0251, B:72:0x06b7, B:73:0x0275, B:75:0x027b, B:77:0x0284, B:79:0x0293, B:81:0x029d, B:83:0x02b1, B:85:0x02b7, B:87:0x04f1, B:96:0x02bb, B:99:0x02c5, B:101:0x02cb, B:103:0x02d6, B:105:0x02dc, B:106:0x02e3, B:110:0x02ef, B:115:0x04ec, B:116:0x02fc, B:118:0x0304, B:123:0x031d, B:125:0x0323, B:127:0x0330, B:128:0x037e, B:130:0x0386, B:134:0x0395, B:136:0x039b, B:138:0x03a8, B:139:0x03f9, B:141:0x0401, B:154:0x0447, B:156:0x044f, B:172:0x0498, B:190:0x03b4, B:194:0x03b6, B:195:0x03b7, B:196:0x03c2, B:199:0x03ca, B:202:0x03d6, B:204:0x03dc, B:206:0x03e7, B:210:0x04a5, B:213:0x04a7, B:214:0x04a8, B:215:0x04b3, B:216:0x04be, B:219:0x033a, B:222:0x033c, B:223:0x033d, B:224:0x0347, B:227:0x0351, B:230:0x035c, B:232:0x0362, B:234:0x036d, B:238:0x04c6, B:241:0x04c8, B:242:0x04c9, B:243:0x04d4, B:244:0x04df, B:247:0x0507, B:251:0x0524, B:270:0x05c6, B:280:0x0580, B:284:0x0589, B:276:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018b, B:369:0x0197, B:372:0x01a2, B:374:0x01a8, B:376:0x01b3, B:379:0x01be, B:382:0x01c0, B:383:0x01c1, B:384:0x010c, B:386:0x0118, B:389:0x0123, B:391:0x0129, B:393:0x0134, B:398:0x014a, B:401:0x0151, B:403:0x0177, B:411:0x016c, B:414:0x0172, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #1, #2, #4, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04fd A[LOOP:1: B:75:0x027b->B:90:0x04fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzakm zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        zzalv zzalvVar;
        int i3;
        ArrayDeque arrayDeque2;
        zzalv zzalvVar2;
        int i4;
        zzalq zzalqVar;
        int i5;
        HashMap hashMap2;
        int i6;
        zzakn zzaknVar;
        zzalo zzaloVar;
        long j;
        char c;
        zzalp zzalpVar;
        String str3;
        float f;
        float parseInt;
        String zza2;
        float parseInt2;
        float f2;
        String zza3;
        float f3;
        int i7;
        String zza4;
        int i8;
        zzals zzalsVar;
        char c2;
        char c3;
        String group;
        String group2;
        String zza5;
        float f4;
        int i9;
        zzalp zzalpVar2;
        String group3;
        boolean z;
        StringBuilder sb;
        String zza6;
        String group4;
        String str4 = "";
        String str5 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzals("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzalp zzalpVar3 = zzh;
            zzalv zzalvVar3 = null;
            zzalq zzalqVar2 = null;
            int i10 = 0;
            int i11 = 15;
            while (eventType != 1) {
                zzalo zzaloVar2 = (zzalo) arrayDeque3.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    str = str4;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str5, "frameRate");
                            int parseInt3 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str5, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i12 = zzfy.zza;
                                zzalvVar2 = zzalvVar3;
                                i4 = i10;
                                zzek.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f4 = Integer.parseInt(r11[0]) / Integer.parseInt(r11[1]);
                            } else {
                                zzalvVar2 = zzalvVar3;
                                i4 = i10;
                                f4 = 1.0f;
                            }
                            zzalp zzalpVar4 = zzh;
                            int i13 = zzalpVar4.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str5, "subFrameRate");
                            int parseInt4 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i13;
                            int i14 = zzalpVar4.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str5, "tickRate");
                            if (attributeValue4 != null) {
                                i9 = Integer.parseInt(attributeValue4);
                                arrayDeque2 = arrayDeque3;
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i9 = i14;
                            }
                            zzalp zzalpVar5 = new zzalp(parseInt3 * f4, parseInt4, i9);
                            String attributeValue5 = newPullParser.getAttributeValue(str5, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group3 = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str5;
                                    }
                                    if (group3 == null) {
                                        throw null;
                                    }
                                    int parseInt5 = Integer.parseInt(group3);
                                    String group5 = matcher.group(2);
                                    if (group5 == null) {
                                        throw null;
                                    }
                                    int parseInt6 = Integer.parseInt(group5);
                                    if (parseInt5 == 0) {
                                        str2 = str5;
                                        i5 = parseInt6;
                                        z = false;
                                    } else if (parseInt6 != 0) {
                                        str2 = str5;
                                        i5 = parseInt6;
                                        z = true;
                                    } else {
                                        str2 = str5;
                                        z = false;
                                        i5 = 0;
                                    }
                                    try {
                                        sb = new StringBuilder();
                                        zzalpVar2 = zzalpVar5;
                                    } catch (NumberFormatException unused2) {
                                        zzalpVar2 = zzalpVar5;
                                        zzff.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        zza6 = zzfz.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                        }
                                        zzalqVar = null;
                                        zzalpVar3 = zzalpVar2;
                                        String str6 = "metadata";
                                        if (!name.equals("tt")) {
                                            zzff.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                                            hashMap = hashMap3;
                                            zzalqVar2 = zzalqVar;
                                            i11 = i5;
                                            zzalvVar3 = zzalvVar2;
                                            arrayDeque = arrayDeque2;
                                            i10 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap3 = hashMap;
                                            str4 = str;
                                            str5 = str2;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzalqVar2 = zzalqVar;
                                        i11 = i5;
                                        zzalvVar3 = zzalvVar2;
                                        i10 = i4;
                                        hashMap = hashMap2;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    try {
                                        sb.append("Invalid cell resolution ");
                                        sb.append(parseInt5);
                                        sb.append(" ");
                                        sb.append(i5);
                                        zzek.zze(z, sb.toString());
                                    } catch (NumberFormatException unused3) {
                                        zzff.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        zza6 = zzfz.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                        }
                                        zzalqVar = null;
                                        zzalpVar3 = zzalpVar2;
                                        String str62 = "metadata";
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzalqVar2 = zzalqVar;
                                        i11 = i5;
                                        zzalvVar3 = zzalvVar2;
                                        i10 = i4;
                                        hashMap = hashMap2;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    zza6 = zzfz.zza(newPullParser, "extent");
                                    if (zza6 != null) {
                                        Matcher matcher2 = zzf.matcher(zza6);
                                        if (matcher2.matches()) {
                                            try {
                                                group4 = matcher2.group(1);
                                            } catch (NumberFormatException unused4) {
                                                zzff.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(zza6));
                                            }
                                            if (group4 == null) {
                                                throw null;
                                            }
                                            int parseInt7 = Integer.parseInt(group4);
                                            String group6 = matcher2.group(2);
                                            if (group6 == null) {
                                                throw null;
                                            }
                                            zzalqVar = new zzalq(parseInt7, Integer.parseInt(group6));
                                            zzalpVar3 = zzalpVar2;
                                        } else {
                                            zzff.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zza6));
                                        }
                                    }
                                    zzalqVar = null;
                                    zzalpVar3 = zzalpVar2;
                                } else {
                                    zzff.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str5;
                            zzalpVar2 = zzalpVar5;
                            i5 = 15;
                            zza6 = zzfz.zza(newPullParser, "extent");
                            if (zza6 != null) {
                            }
                            zzalqVar = null;
                            zzalpVar3 = zzalpVar2;
                        } else {
                            str2 = str5;
                            arrayDeque2 = arrayDeque3;
                            zzalvVar2 = zzalvVar3;
                            i4 = i10;
                            zzalqVar = zzalqVar2;
                            i5 = i11;
                        }
                        String str622 = "metadata";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals(SDKConstants.PARAM_A2U_BODY) && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            zzff.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            hashMap = hashMap3;
                            zzalqVar2 = zzalqVar;
                            i11 = i5;
                            zzalvVar3 = zzalvVar2;
                            arrayDeque = arrayDeque2;
                            i10 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            hashMap3 = hashMap;
                            str4 = str;
                            str5 = str2;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzfz.zzc(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                    String zza7 = zzfz.zza(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                                    zzalu zzf2 = zzf(newPullParser, new zzalu());
                                    if (zza7 != null) {
                                        String[] zzg2 = zzg(zza7);
                                        zzalpVar = zzalpVar3;
                                        int i15 = 0;
                                        for (int length = zzg2.length; i15 < length; length = length) {
                                            zzf2.zzl((zzalu) hashMap3.get(zzg2[i15]));
                                            i15++;
                                        }
                                    } else {
                                        zzalpVar = zzalpVar3;
                                    }
                                    String zzE = zzf2.zzE();
                                    if (zzE != null) {
                                        hashMap3.put(zzE, zzf2);
                                    }
                                } else {
                                    zzalpVar = zzalpVar3;
                                    if (zzfz.zzc(newPullParser, "region")) {
                                        String zza8 = zzfz.zza(newPullParser, "id");
                                        if (zza8 == null) {
                                            str3 = str622;
                                            hashMap2 = hashMap3;
                                        } else {
                                            String zza9 = zzfz.zza(newPullParser, "origin");
                                            if (zza9 != null) {
                                                Pattern pattern = zzb;
                                                Matcher matcher3 = pattern.matcher(zza9);
                                                Pattern pattern2 = zzf;
                                                str3 = str622;
                                                Matcher matcher4 = pattern2.matcher(zza9);
                                                if (matcher3.matches()) {
                                                    hashMap2 = hashMap3;
                                                    try {
                                                        group2 = matcher3.group(1);
                                                    } catch (NumberFormatException unused5) {
                                                        zzff.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                    }
                                                    if (group2 == null) {
                                                        throw null;
                                                    }
                                                    float parseFloat = Float.parseFloat(group2) / 100.0f;
                                                    String group7 = matcher3.group(2);
                                                    if (group7 == null) {
                                                        throw null;
                                                    }
                                                    parseInt = Float.parseFloat(group7) / 100.0f;
                                                    f = parseFloat;
                                                    zza2 = zzfz.zza(newPullParser, "extent");
                                                    if (zza2 == null) {
                                                        Matcher matcher5 = pattern.matcher(zza2);
                                                        Matcher matcher6 = pattern2.matcher(zza2);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                group = matcher5.group(1);
                                                            } catch (NumberFormatException unused6) {
                                                                zzff.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza9));
                                                            }
                                                            if (group == null) {
                                                                throw null;
                                                            }
                                                            float parseFloat2 = Float.parseFloat(group) / 100.0f;
                                                            String group8 = matcher5.group(2);
                                                            if (group8 == null) {
                                                                throw null;
                                                            }
                                                            parseInt2 = Float.parseFloat(group8) / 100.0f;
                                                            f2 = parseFloat2;
                                                            zza3 = zzfz.zza(newPullParser, "displayAlign");
                                                            if (zza3 != null) {
                                                                String zza10 = zzfwk.zza(zza3);
                                                                int hashCode = zza10.hashCode();
                                                                if (hashCode != -1364013995) {
                                                                    if (hashCode == 92734940 && zza10.equals("after")) {
                                                                        c3 = 1;
                                                                        if (c3 != 0) {
                                                                            f3 = parseInt + (parseInt2 / 2.0f);
                                                                            i7 = 1;
                                                                        } else if (c3 == 1) {
                                                                            f3 = parseInt + parseInt2;
                                                                            i7 = 2;
                                                                        }
                                                                        float f5 = 1.0f / i5;
                                                                        zza4 = zzfz.zza(newPullParser, "writingMode");
                                                                        if (zza4 != null) {
                                                                            String zza11 = zzfwk.zza(zza4);
                                                                            int hashCode2 = zza11.hashCode();
                                                                            if (hashCode2 == 3694) {
                                                                                if (zza11.equals("tb")) {
                                                                                    c2 = 0;
                                                                                    if (c2 != 0) {
                                                                                    }
                                                                                    i8 = 2;
                                                                                    zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i8 = 2;
                                                                                zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                            } else if (hashCode2 != 3553396) {
                                                                                if (hashCode2 == 3553576 && zza11.equals("tbrl")) {
                                                                                    c2 = 2;
                                                                                    if (c2 != 0 || c2 == 1) {
                                                                                        i8 = 2;
                                                                                    } else if (c2 == 2) {
                                                                                        i8 = 1;
                                                                                    }
                                                                                    zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i8 = 2;
                                                                                zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                            } else {
                                                                                if (zza11.equals("tblr")) {
                                                                                    c2 = 1;
                                                                                    if (c2 != 0) {
                                                                                    }
                                                                                    i8 = 2;
                                                                                    zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i8 = 2;
                                                                                zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                            }
                                                                        }
                                                                        i8 = Integer.MIN_VALUE;
                                                                        zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5, i8);
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 != 0) {
                                                                    }
                                                                    float f52 = 1.0f / i5;
                                                                    zza4 = zzfz.zza(newPullParser, "writingMode");
                                                                    if (zza4 != null) {
                                                                    }
                                                                    i8 = Integer.MIN_VALUE;
                                                                    zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f52, i8);
                                                                } else {
                                                                    if (zza10.equals("center")) {
                                                                        c3 = 0;
                                                                        if (c3 != 0) {
                                                                        }
                                                                        float f522 = 1.0f / i5;
                                                                        zza4 = zzfz.zza(newPullParser, "writingMode");
                                                                        if (zza4 != null) {
                                                                        }
                                                                        i8 = Integer.MIN_VALUE;
                                                                        zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f522, i8);
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 != 0) {
                                                                    }
                                                                    float f5222 = 1.0f / i5;
                                                                    zza4 = zzfz.zza(newPullParser, "writingMode");
                                                                    if (zza4 != null) {
                                                                    }
                                                                    i8 = Integer.MIN_VALUE;
                                                                    zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f5222, i8);
                                                                }
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap3 = hashMap;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                            f3 = parseInt;
                                                            i7 = 0;
                                                            float f52222 = 1.0f / i5;
                                                            zza4 = zzfz.zza(newPullParser, "writingMode");
                                                            if (zza4 != null) {
                                                            }
                                                            i8 = Integer.MIN_VALUE;
                                                            zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f52222, i8);
                                                        } else if (!matcher6.matches()) {
                                                            zzff.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(zza9));
                                                        } else if (zzalqVar == null) {
                                                            zzff.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza9));
                                                        } else {
                                                            try {
                                                                String group9 = matcher6.group(1);
                                                                if (group9 == null) {
                                                                    throw null;
                                                                }
                                                                int parseInt8 = Integer.parseInt(group9);
                                                                String group10 = matcher6.group(2);
                                                                if (group10 == null) {
                                                                    throw null;
                                                                }
                                                                float f6 = parseInt8 / zzalqVar.zza;
                                                                parseInt2 = Integer.parseInt(group10) / zzalqVar.zzb;
                                                                f2 = f6;
                                                                zza3 = zzfz.zza(newPullParser, "displayAlign");
                                                                if (zza3 != null) {
                                                                }
                                                                f3 = parseInt;
                                                                i7 = 0;
                                                                float f522222 = 1.0f / i5;
                                                                zza4 = zzfz.zza(newPullParser, "writingMode");
                                                                if (zza4 != null) {
                                                                }
                                                                i8 = Integer.MIN_VALUE;
                                                                zzalsVar = new zzals(zza8, f, f3, 0, i7, f2, parseInt2, 1, f522222, i8);
                                                            } catch (NumberFormatException unused7) {
                                                                zzff.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza9));
                                                            }
                                                        }
                                                    } else {
                                                        zzff.zzf("TtmlParser", "Ignoring region without an extent");
                                                    }
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    if (!matcher4.matches()) {
                                                        zzff.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(zza9));
                                                    } else if (zzalqVar == null) {
                                                        zzff.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza9));
                                                    } else {
                                                        try {
                                                            String group11 = matcher4.group(1);
                                                            if (group11 == null) {
                                                                throw null;
                                                            }
                                                            int parseInt9 = Integer.parseInt(group11);
                                                            String group12 = matcher4.group(2);
                                                            if (group12 == null) {
                                                                throw null;
                                                            }
                                                            f = parseInt9 / zzalqVar.zza;
                                                            parseInt = Integer.parseInt(group12) / zzalqVar.zzb;
                                                            zza2 = zzfz.zza(newPullParser, "extent");
                                                            if (zza2 == null) {
                                                            }
                                                        } catch (NumberFormatException unused8) {
                                                            zzff.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                        }
                                                    }
                                                }
                                                if (zzalsVar != null) {
                                                    hashMap4.put(zzalsVar.zza, zzalsVar);
                                                }
                                                zzalpVar3 = zzalpVar;
                                                if (zzfz.zzb(newPullParser, "head")) {
                                                    arrayDeque = arrayDeque2;
                                                } else {
                                                    str622 = str3;
                                                    hashMap3 = hashMap2;
                                                }
                                            } else {
                                                str3 = str622;
                                                hashMap2 = hashMap3;
                                                zzff.zzf("TtmlParser", "Ignoring region without an origin");
                                            }
                                        }
                                        zzalsVar = null;
                                        if (zzalsVar != null) {
                                        }
                                        zzalpVar3 = zzalpVar;
                                        if (zzfz.zzb(newPullParser, "head")) {
                                        }
                                    } else if (zzfz.zzc(newPullParser, str622)) {
                                        do {
                                            newPullParser.next();
                                            if (zzfz.zzc(newPullParser, "image") && (zza5 = zzfz.zza(newPullParser, "id")) != null) {
                                                hashMap5.put(zza5, newPullParser.nextText());
                                            }
                                        } while (!zzfz.zzb(newPullParser, str622));
                                    }
                                }
                                str3 = str622;
                                hashMap2 = hashMap3;
                                zzalpVar3 = zzalpVar;
                                if (zzfz.zzb(newPullParser, "head")) {
                                }
                            }
                        } else {
                            hashMap2 = hashMap3;
                            zzalp zzalpVar6 = zzalpVar3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzalu zzf3 = zzf(newPullParser, null);
                                String str7 = str;
                                long j2 = -9223372036854775807L;
                                long j3 = -9223372036854775807L;
                                long j4 = -9223372036854775807L;
                                int i16 = 0;
                                String[] strArr = null;
                                String str8 = null;
                                while (i16 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i16);
                                        String attributeValue6 = newPullParser.getAttributeValue(i16);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            zzalpVar3 = zzalpVar6;
                                            i6 = 1;
                                            j3 = zzc(attributeValue6, zzalpVar3);
                                        } else if (c == 1) {
                                            i6 = 1;
                                            zzalpVar3 = zzalpVar6;
                                            j2 = zzc(attributeValue6, zzalpVar3);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                i6 = 1;
                                                String[] zzg3 = zzg(attributeValue6);
                                                if (zzg3.length > 0) {
                                                    strArr = zzg3;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            i6 = 1;
                                                            try {
                                                                str8 = attributeValue6.substring(1);
                                                            } catch (zzakn e) {
                                                                e = e;
                                                                zzaknVar = e;
                                                                zzalpVar3 = zzalpVar6;
                                                                arrayDeque = arrayDeque2;
                                                                zzff.zzg("TtmlParser", "Suppressing parser error", zzaknVar);
                                                                zzalqVar2 = zzalqVar;
                                                                i11 = i5;
                                                                zzalvVar3 = zzalvVar2;
                                                                hashMap = hashMap2;
                                                                i10 = i6;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap3 = hashMap;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                        }
                                                    } catch (zzakn e2) {
                                                        e = e2;
                                                        i6 = 1;
                                                    }
                                                }
                                                i6 = 1;
                                            } else {
                                                i6 = 1;
                                                if (hashMap4.containsKey(attributeValue6)) {
                                                    str7 = attributeValue6;
                                                }
                                            }
                                            zzalpVar3 = zzalpVar6;
                                        } else {
                                            zzalpVar3 = zzalpVar6;
                                            i6 = 1;
                                            try {
                                                j4 = zzc(attributeValue6, zzalpVar3);
                                            } catch (zzakn e3) {
                                                e = e3;
                                                zzaknVar = e;
                                                arrayDeque = arrayDeque2;
                                                zzff.zzg("TtmlParser", "Suppressing parser error", zzaknVar);
                                                zzalqVar2 = zzalqVar;
                                                i11 = i5;
                                                zzalvVar3 = zzalvVar2;
                                                hashMap = hashMap2;
                                                i10 = i6;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap3 = hashMap;
                                                str4 = str;
                                                str5 = str2;
                                            }
                                        }
                                        i16++;
                                        zzalpVar6 = zzalpVar3;
                                    } catch (zzakn e4) {
                                        e = e4;
                                        zzalpVar3 = zzalpVar6;
                                        i6 = 1;
                                    }
                                }
                                zzalpVar3 = zzalpVar6;
                                i6 = 1;
                                if (zzaloVar2 != null) {
                                    long j5 = zzaloVar2.zzd;
                                    if (j5 != -9223372036854775807L) {
                                        j3 = j3 != -9223372036854775807L ? j3 + j5 : -9223372036854775807L;
                                        if (j2 != -9223372036854775807L) {
                                            j2 += j5;
                                        } else {
                                            zzaloVar = zzaloVar2;
                                            j2 = -9223372036854775807L;
                                        }
                                    }
                                    zzaloVar = zzaloVar2;
                                } else {
                                    zzaloVar = null;
                                }
                                if (j2 != -9223372036854775807L) {
                                    j = j2;
                                } else if (j4 != -9223372036854775807L) {
                                    j = j3 + j4;
                                } else {
                                    if (zzaloVar != null) {
                                        long j6 = zzaloVar.zze;
                                        if (j6 != -9223372036854775807L) {
                                            j = j6;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                }
                                try {
                                    zzalo zzb2 = zzalo.zzb(newPullParser.getName(), j3, j, zzf3, strArr, str7, str8, zzaloVar);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzb2);
                                        if (zzaloVar2 != null) {
                                            zzaloVar2.zzf(zzb2);
                                        }
                                    } catch (zzakn e5) {
                                        e = e5;
                                        zzaknVar = e;
                                        zzff.zzg("TtmlParser", "Suppressing parser error", zzaknVar);
                                        zzalqVar2 = zzalqVar;
                                        i11 = i5;
                                        zzalvVar3 = zzalvVar2;
                                        hashMap = hashMap2;
                                        i10 = i6;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                } catch (zzakn e6) {
                                    e = e6;
                                    arrayDeque = arrayDeque2;
                                }
                            } catch (zzakn e7) {
                                e = e7;
                                zzalpVar3 = zzalpVar6;
                                arrayDeque = arrayDeque2;
                                i6 = 1;
                            }
                        }
                        zzalqVar2 = zzalqVar;
                        i11 = i5;
                        zzalvVar3 = zzalvVar2;
                        i10 = i4;
                        hashMap = hashMap2;
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        arrayDeque3 = arrayDeque;
                        hashMap3 = hashMap;
                        str4 = str;
                        str5 = str2;
                    } else {
                        str2 = str5;
                        HashMap hashMap6 = hashMap3;
                        arrayDeque = arrayDeque3;
                        zzalvVar = zzalvVar3;
                        i3 = i10;
                        if (eventType == 4) {
                            if (zzaloVar2 == null) {
                                throw null;
                            }
                            zzaloVar2.zzf(zzalo.zzc(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzalo zzaloVar3 = (zzalo) arrayDeque.peek();
                                if (zzaloVar3 == null) {
                                    throw null;
                                }
                                hashMap = hashMap6;
                                zzalvVar3 = new zzalv(zzaloVar3, hashMap, hashMap4, hashMap5);
                            } else {
                                hashMap = hashMap6;
                                zzalvVar3 = zzalvVar;
                            }
                            arrayDeque.pop();
                        }
                        hashMap = hashMap6;
                        zzalvVar3 = zzalvVar;
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    hashMap = hashMap3;
                    arrayDeque = arrayDeque3;
                    zzalvVar = zzalvVar3;
                    i3 = i10;
                    if (eventType == 2) {
                        i10 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i10 = i3 - 1;
                        }
                        zzalvVar3 = zzalvVar;
                    }
                    zzalvVar3 = zzalvVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap3 = hashMap;
                    str4 = str;
                    str5 = str2;
                }
                i10 = i3;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap3 = hashMap;
                str4 = str;
                str5 = str2;
            }
            zzalv zzalvVar4 = zzalvVar3;
            if (zzalvVar4 != null) {
                return zzalvVar4;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzalr() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
