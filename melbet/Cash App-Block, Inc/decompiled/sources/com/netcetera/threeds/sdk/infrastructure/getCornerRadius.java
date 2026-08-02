package com.netcetera.threeds.sdk.infrastructure;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public class getCornerRadius {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ConfigurationBuilder;
    private static int apiKey;
    private static int configureScheme;
    private static char[] restrictedParameters;
    private final setVerticalFadingEdgeEnabled ConfigParameters;
    private final Context ThreeDS2Service;
    private final TelecomManager ThreeDS2ServiceInitializationCallback;
    private final LocationManager ThreeDS2ServiceInstance;
    private final setHorizontalFadingEdgeEnabled addParam;
    private final WifiManager cleanup;
    private final TelephonyManager createTransaction;
    private final setOnItemClickListener get;
    private final setLayoutParams getParamValue;
    private final WindowManager getSDKInfo;
    private final BluetoothManager getSDKVersion;
    private final SimpleDateFormat getWarnings;
    private final PackageManager initialize;
    private final setEdgeEffectColor onCompleted;
    private final AudioManager onError;
    private final setHorizontalScrollBarEnabled removeParam;

    public interface get {
        ButtonCustomization getWarnings();
    }

    public interface initialize<T> {
        ButtonCustomization initialize(T t);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        apiKey = 0;
        configureScheme = 1;
        char[] cArr = new char[1252];
        ByteBuffer.wrap("\u0089Tß!%·\u008a;Ð\u00949\u001f\u008f\u0093ÔlØÝ\u008eµt Û¡\u0089[ß!%º\u008a4Ð\u00859\u0015\u008f\u0088Ôk:þ\u0083wéÐ>S\u0001ÙW·\u00ad*\u0002¥X\u0014»Æí¡\u00172¸µâ\t\u000b\u0093½\u001b\u0089Oß'%º\u008a>Ð\u008f9\u0001\u0089Zß\"%¡\u008a?Ð\u00949\u0019\u008f\u0093Ôv:à\u009fúÉ\u00983\u0013\u009c\u0090Æ,\u0089Aß7%\u00ad\u008a#Ð\u00ad9;\u008f\u0098Ôf:À\u0083VéÉ>G\u0084Ãêµ\u0089\t\u0089\bþÁ¨¦R<ý®§\u0001N±ø\u0016£ûM}ôö\u009eUIÜóO\u009d\u0001D¦î#\u0099®C\u0011ê\u0089\u0094\u0010ú\u001d¬}Váùy£ÄJEüõ§2I¬ð8\u009a\u00adM\u0011÷\u0089\u0099ô@\u007f §v×\u008cM#èyn\u0090ú&}}\u0083\u0093\f*\u009d@.\u0097\u0098-0CD\u009aÅ0Z\u0089Nß'%¶\u008a(Ð\u00819\u0002\u008f\u0099Ô]:ÿ\u0083véÁ>D\u0084ïê´3%\u0099¼î?4\u0087\u009d\u001aã\u009dÅr\u0093\u001bi\u008aÆ\u0014\u009c½u>Ã¥\u0098avÛÏL4hb\u0018\u0098\u00947\rm\u009a\u0084!2¶iS\u0087Ì>OTè\u0083`9ûq\u001b'pÝîrh(èÁ\u0010w\u0099,\nÂí{}\u0089Kß&%»\u008a-Ð¿9\u0006\u008f\u009dÔq:û\u0083iéË>X\u0084Ô\u0089Yß;% \u008a5Ð¿9\u0004\u008f\u0099Ôr:ä\u0083\u007féÇ>O\u0089Yß;% \u008a5Ð¿9\u0006\u008f\u0089Ôl:ë\u0083jéÑ>K\u0084Äê£\u0089Yß;% \u008a5Ð¿9\u0015\u008f\u009dÔr:û\u0007ÕQ¿«?\u0004ª^\u001a··\u0001\u0007Zú´p\rågY°À\n]d\u0007½·\u0017\"`§º\u0012\u0013\u0086m\u0001Æúçz±\u001cK\u0097ä\u000e¾´W)á\u0092º\\TßíI\u0087ÊPoêè\u0084\u009a]\u0018÷\u008c\u0080\u001cZ«¤\u0019ò\u007f\bô§mý×\u0014J¢ñù2\u0017¨®%Ä\u0091\u0013\u0010©\u0096Çú\u001e{´óÃy\u0019ã°KÎÇe6³¡¢\u0092ôô\u000e\u007f¡æû\\\u0012Á¤zÿ¹\u0011#¨®Â\u001a\u0015\u009b¯\u001dÁq\u0018ð²xÅò\u0089Uß;% \u008a?Ð¿9\u0005\u008f\u0088Ôp:í\u0083\u007féÉ>Y\u0084ïê§3*\u0099´î=4\u008d\u009d\u0000ã\u009fHd?ñi\u0085\u0093\u0014<\u009bf\u001b\u008f 91bÈ\u008cK5ß_r\u0088Ñ2g\\\u0016\u0085\u009a/\u0013X\u009d\u0082'+£U\u0001þÅ(TQÞûc$ïNnø\u0005!\u008axm.\u0012Ô\u0099{\u0013!´È(~\u009e%YËÐrF\u0018ýÏuuì\u001b\u0098Â\u001ah°\u001f\u0000Å½l(\u0012¥¹QoÎ\u0016En\u000b8tÂïm{7êÞPhÊ36Ý±d.æ&°[JËå~¿ùVxàó»\rU\u009cì\u000b\u0086\u0080Q3ë®\u0085Õ\\Vöß\u0081J[úò}\u0089\\ß:%¹\u008a<Ð¿9\u0002\u008f\u0093Ôl:í\u0089\\ß:%¹\u008a<Ð¿9\u0002\u008f\u0093Ôl:í\u0083AéÐ>S\u0084Àê£\u0004tR\u0007¨\u0088\u0007\u0017]\u0097´8\u0002»YX·Í\u000eWdøO\n\u0019rãñLo\u0016ÄÿIIÃ\u0012&ü°E\u0011/\u0090ø\u0013B\u0093,õõs_ô(mòÌ[E%È\u008e9Xª!%\u008b\u0086T\u0001>±\u0088àQs;í\u0084SnÓ7W\u0081Ü\"Lt4\u008e·!){\u0082\u0092\u000f$\u0085\u007f`\u0091ö(WBÖ\u0095U/ÕA³\u009852²E+\u009f\u008a6\u0003H\u008eã\u007f5ìLcæÀ9G\u0089Yß-%·\u008a?Ð\u008c9\u0013\u008f\u008eÔm:å\u0083{éÐ>O\u0084Âê\u00993>\u0099½î,4\u008f\u009d\u0000ã\u0093Ho\u009eøe\u00973ÿÉjfë<gÕÀcA8®Ö'o©\u0005\u000eÒ\u0099h\u001b\u0006Aßõu|\u0002áØ_qÀ\u000fC¤ºr\"\u000b¡¡%~\u009e\u0014\t¢h{û\u0011n®×DW\u001dË«T@¿\u001e#·¬M'\u001a\u0081°\nú[¬;V©ù:£«J\u0004ü\u0087§dIÃðn\u009aÕM\\÷Ñ\u0099µ@?ê£\u009d>\u0089Mß=%±\u008a\u0005Ð\u00879\u0019\u008f\u0093Ôe:ä\u0083{éû>G\u0084Ñê¯3 9ão\u0093\u0095\u0018:«`#\u0089¹?!dß\u008ay3ÃY~\u008eë4lZ\t\u0083\u0085)\u0019^©\u0084%-´S5øÌ.TW×ýh\u0089Lß<%µ\u008a4Ð\u00939\u001f\u008f\u0088Ôk:ç\u0083péû>K\u0084Þê¯3!\u0099³î,4\u0087\u009d\u001bã\u0094H_\u009eåç\u007fMÃ\u0092DøÛ\u0089Kß:%µ\u008a#Ð¿9\u0019\u008f\u0092Ô]:ÿ\u0083véÍ>F\u0084Õê\u00993<\u0099¾î-4\u0089\u009d\u0013ã\u009fHd\u009eÉçuMÌ\u0089Vß+% \u008a-Ð\u008f9\u0004\u008f\u0097Ô]:ø\u0083léÁ>L\u0084Õê´3)\u0099¼î;4\u008bh\u00ad>ÇÄ]k×1BØûns5\u0090Û\rb\u009a\u0089\\ß+%¢\u008a?Ð\u008c9\u0019\u008f\u008cÔo:í\u0083péÐ>u\u0084Ãê£38\u0099¦î14\u0080\u009d\u0013ã\u0089H_\u009eóçrMÃ\u0092JøÒN¡\u0097.\u0089Yß;% \u008a5Ð¿9\u0002\u008f\u0095Ôo:í\u0083AéÞ>E\u0084Þê£\u0089Yß;% \u008a5Ð¿9\u0002\u008f\u0095Ôo:í\u0089Yß %½\u008a7Ð\u00819\u0002\u008f\u0093Ôp:×\u0083zéÑ>X\u0084Ñê²3%\u0099½î64±\u009d\u0007ã\u0099Ha\u009eúçyÖv\u0080\rz\u008cÕ\u0014\u008f¶f*Ð\u008c\u008bKeÎÜ_¶âavÛ÷µ¶l\u0002Æ\u009e±\u0003k¨Â-¼¼\u0017[ÁÐ¸V\u0012þ|\u008b*õÐt\u007fø%^ÌÅz@!µÏ\u0005v¡\u001c\u0019Ë\u009cq\u0007\u001fKÆìla\u001bîÁUhÉ\u0016[\u0089Yß*%¶\u008a\u0005Ð\u00859\u0018\u008f\u009dÔ`:ä\u0083{éÀ\u0089Lß:%§\u008a\u0005Ð\u00859\u0018\u008f\u009dÔ`:ä\u0083{éÀ>u\u0084Àêª39\u0099µî14\u0080\u009d\u0007\u0089Lß:%§\u008a\u0005Ð\u00849\u0013\u008f\u009aÔc:ý\u0083réÐ>u\u0084Ãê¿3\"\u0099¦î0\u0089Lß:%§\u008a\u0005Ð\u00849\u0013\u008f\u009aÔc:ý\u0083réÐ>u\u0084Âê§38\u0099·\u0089Lß:%§\u008a\u0005Ð\u00849\u0013\u008f\u009aÔc:ý\u0083réÐ>u\u0084Àê¯38\u0099±î0\u0089Kß7%§\u008atÐ\u00939\u0013\u008f\u0088Ôv:á\u0083péÃ>Y\u0084ïê¡3 \u0099½î:4\u008f\u009d\u0018ã¥Hv\u009eóçnMÑ\u0092AøÑNª\u0089Kß%%½\u008a*Ð¿9\u0010\u008f\u0095Ôp:û\u0083jéû>_\u0084Ãê£3\u0013\u0099ºî14\u0080\u009d\u0000ã\u0089\u0089Tß!%·\u008a;Ð\u00949\u001f\u008f\u0093Ôl:×\u0083séË>N\u0084Õ\u0089Qß %¤\u008a/Ð\u00949)\u008f\u0091Ôg:ü\u0083véË>N\u0084ïêµ3)\u0099¾î=4\u008d\u009d\u0000ã\u0095Hr\u009eÉçjMË\u0092[ø×N¦\u0097#ý¼B\u000f¨\u0098ñ\u000b\u0089]ß %µ\u008a8Ð\u008c9\u0013\u008f\u0098Ô]:á\u0083péÔ>_\u0084Äê\u00993!\u0099·î,4\u0086\u009d\u001bã\u009eHsJs\u0089]ß %µ\u008a8Ð\u008c9\u0013\u008f\u0098Ô]:é\u0083}éÇ>O\u0084Ãêµ3%\u0099°î14\u0082\u009d\u001dã\u008eHy\u009eÉçoMÇ\u0092ZøÈN\u00ad\u0097)ýµB\u0015\u0089\\ß+%¢\u008a3Ð\u00839\u0013\u008f£Ôr:ú\u0083qéÒ>C\u0084Ãê¯3#\u0099¼î=4\u008a¯Ïù¸\u0003!¬¨ö\u0006\u001f\u0089©\u001bòÎ\u001cr¥ãÏG\u0018Ì¢WÌ\n\u0015²¿$È¿\u0012\u0015»\u0088Å\rà\u0016¶eLêãq¹õPNæÙ½)S¯ê=\u0080\u0080W\u0007\u0089Yß %°\u008a(Ð\u008f9\u001f\u008f\u0098Ô]:á\u0083zÉÚ\u009f¡e;Ê¶\u0090\u0014y\u0090Ï\u001b\u0094ÞzlÃø©H~ÅÄ\\ª&s®Ù%®²t\u0002Ý\u0099£&\bìÞg§ö\rFÒÂ¸S\u000e4\u0097bÁ\u0017;\u0098\u0094\u0012Î¢'\u0000\u0091¥ÊJ$Ò\u009dD÷ú l\u009aëô\u008bHÕ\u001e¡ä;K³\u0011\u001fø\u0089N\u0019\u0015ìûmBþ(AÿÒEE+\u0015ò¥X0/µõ\u0000\\\u0094\"\u0013\u0089è\u0089Yß-%·\u008a?Ð\u00939\u0005\u008f\u0095Ô`:á\u0083réÍ>^\u0084Éê\u00993(\u0099»î+4\u009e\u009d\u0018ã\u009bHy\u009eÉçuMÌ\u0092^øÛN¶\u00979ý¹B\t¨\u0082ñ-G\u009d¬`òõ[x¡ÌöS\\Ø\u0089Yß %°\u008a(Ð\u008f9\u001f\u008f\u0098Ô,:à\u0083\u007féÖ>N\u0084Çê§3>\u0099·îv4\u0099\u009d\u001dã\u009cHi\u009e¸çnMÖ\u0092\\\u0089vß\u000b%\u0080\u008a\rÐ¯9$\u008f·Ô]:Ü\u0083Géô>o\u0084ïº\bìo\u0016ç¹iãÉ\n@¼Ù\u0089\u001d0%\u0001¶\u0089\u0015\u0017\u0096AÏ»_\u0014ÇN`§ð\u0011w\u0089yß\u001e%\u009d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1252);
        restrictedParameters = cArr;
        ConfigurationBuilder = -1383226514266988722L;
    }

    public getCornerRadius(Context context, setOnItemClickListener setonitemclicklistener, SimpleDateFormat simpleDateFormat, PackageManager packageManager, LocationManager locationManager, WifiManager wifiManager, TelephonyManager telephonyManager, TelecomManager telecomManager, WindowManager windowManager, BluetoothManager bluetoothManager, AudioManager audioManager, setEdgeEffectColor setedgeeffectcolor, setVerticalFadingEdgeEnabled setverticalfadingedgeenabled, setLayoutParams setlayoutparams, setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled, setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        this.ThreeDS2Service = context;
        this.get = setonitemclicklistener;
        this.getWarnings = simpleDateFormat;
        this.initialize = packageManager;
        this.ThreeDS2ServiceInstance = locationManager;
        this.cleanup = wifiManager;
        this.createTransaction = telephonyManager;
        this.ThreeDS2ServiceInitializationCallback = telecomManager;
        this.getSDKInfo = windowManager;
        this.getSDKVersion = bluetoothManager;
        this.onError = audioManager;
        this.onCompleted = setedgeeffectcolor;
        this.ConfigParameters = setverticalfadingedgeenabled;
        this.getParamValue = setlayoutparams;
        this.addParam = sethorizontalfadingedgeenabled;
        this.removeParam = sethorizontalscrollbarenabled;
    }

    private static /* synthetic */ Object CertificateInfo(Object[] objArr) {
        Field[] fields;
        int length;
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            fields = Build.VERSION_CODES.class.getFields();
            length = fields.length;
        } else {
            fields = Build.VERSION_CODES.class.getFields();
            length = fields.length;
        }
        apiKey = (configureScheme + 103) % 128;
        for (int i2 = 0; i2 < length; i2++) {
            Field field = fields[i2];
            String name = field.getName();
            if (field.getInt(new Object()) == Build.VERSION.SDK_INT) {
                return name;
            }
        }
        return "";
    }

    private /* synthetic */ ButtonCustomization CertificateInfoCertificateType(initialize initializeVar) {
        Object obj;
        int i = apiKey + 21;
        configureScheme = i % 128;
        int i2 = i % 2;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a('e' >> AndroidCharacter.getMirror((char) 2), (ViewConfiguration.getJumpTapTimeout() / 48) + 15628, (char) (29453 - Color.blue(1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(AndroidCharacter.getMirror('0') - 28, (ViewConfiguration.getJumpTapTimeout() >> 16) + IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, (char) (9875 - Color.blue(0)), objArr2);
            obj = objArr2[0];
        }
        return initializeVar.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) obj).intern()));
    }

    public static /* synthetic */ ButtonCustomization ChallengeParameters(getCornerRadius getcornerradius) {
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setSoundEffectsEnabled();
        }
        getcornerradius.setSoundEffectsEnabled();
        throw null;
    }

    private static /* synthetic */ Object ConfigParameters(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 111) % 128;
        if (!getcornerradius.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        apiKey = (configureScheme + 21) % 128;
        return ButtonCustomization.ThreeDS2Service();
    }

    public static /* synthetic */ ButtonCustomization ConfigurationBuilder(getCornerRadius getcornerradius, initialize initializeVar) {
        ButtonCustomization buttonCustomization;
        int i = apiKey + 17;
        configureScheme = i % 128;
        int i2 = i % 2;
        Object[] objArr = {getcornerradius, initializeVar};
        int identityHashCode = System.identityHashCode(getcornerradius);
        if (i2 == 0) {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr, 141575954, -141575922, identityHashCode);
            int i3 = 55 / 0;
        } else {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr, 141575954, -141575922, identityHashCode);
        }
        configureScheme = (apiKey + 63) % 128;
        return buttonCustomization;
    }

    private /* synthetic */ ButtonCustomization InvalidInputException(initialize initializeVar) {
        int i = configureScheme + 89;
        apiKey = i % 128;
        if (i % 2 != 0 && Build.VERSION.SDK_INT < 104) {
            ButtonCustomization warnings = ButtonCustomization.getWarnings();
            apiKey = (configureScheme + 117) % 128;
            return warnings;
        }
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 412, (char) TextUtils.indexOf("", ""), objArr);
        return initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
    }

    private /* synthetic */ ButtonCustomization SDKAlreadyInitializedException(initialize initializeVar) {
        apiKey = (configureScheme + 29) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(16 - TextUtils.lastIndexOf("", '0'), 556 - View.resolveSizeAndState(0, 0, 0), (char) (29459 - MotionEvent.axisFromString("")), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 59;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.ThreeDS2ServiceInstance) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return r5.initialize(java.lang.Boolean.valueOf(r4.cleanup.is5GHzBandSupported()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme = (com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization SDKInfo(initialize initializeVar) {
        int i = configureScheme + 5;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 != 0) {
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[1];
            settranscriptmodeArr[1] = setTranscriptMode.ThreeDS2ServiceInstance;
        }
    }

    private /* synthetic */ ButtonCustomization SDKRuntimeException(initialize initializeVar) {
        configureScheme = (apiKey + 71) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 9, 403 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        apiKey = (configureScheme + 87) % 128;
        return initialize2;
    }

    private static /* synthetic */ Object SchemeConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        apiKey = (configureScheme + 119) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = getcornerradius.ConfigParameters;
        Object[] objArr2 = new Object[1];
        a(24 - View.combineMeasuredStates(0, 0), 764 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (24367 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr2);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr2[0]).intern()));
        int i = configureScheme + 81;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return initialize2;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization SchemeConfigurationBuilder(initialize initializeVar) {
        apiKey = (configureScheme + 15) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(12 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        apiKey = (configureScheme + 83) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization SchemeInfo(initialize initializeVar) {
        configureScheme = (apiKey + 51) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(21 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1133 - TextUtils.getOffsetBefore("", 0), (char) ((Process.myTid() >> 22) + 49548), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 63) % 128;
        return initialize2;
    }

    public static /* synthetic */ ButtonCustomization Severity(getCornerRadius getcornerradius) {
        int i = configureScheme + 113;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setTop();
            throw null;
        }
        ButtonCustomization top = getcornerradius.setTop();
        apiKey = (configureScheme + 67) % 128;
        return top;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        Object obj;
        Object obj2;
        String str;
        int i4 = (i2 * 965) + ((i * (-963)) - 964);
        int i5 = ~i;
        int i6 = ~i2;
        switch ((((~(i | i6)) | (~((~i3) | i6))) * (-964)) + ((i5 | (~(i6 | i3))) * (-964)) + i4) {
            case 1:
                return getWarnings(objArr);
            case 2:
                return initialize(objArr);
            case 3:
                return get(objArr);
            case 4:
                return ThreeDS2ServiceInstance(objArr);
            case 5:
                return getSDKInfo(objArr);
            case 6:
                return cleanup(objArr);
            case 7:
                getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
                int i7 = apiKey + 109;
                configureScheme = i7 % 128;
                int i8 = i7 % 2;
                setLayoutParams setlayoutparams = getcornerradius.getParamValue;
                if (i8 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(7 % TextUtils.getOffsetAfter("", 1), 17968 / (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)), (char) (46756 - View.MeasureSpec.getSize(0)), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(TextUtils.getOffsetAfter("", 0) + 28, 324 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (46756 - View.MeasureSpec.getSize(0)), objArr3);
                    obj = objArr3[0];
                }
                ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) obj).intern()));
                apiKey = (configureScheme + 19) % 128;
                return ThreeDS2ServiceInstance;
            case 8:
                getCornerRadius getcornerradius2 = (getCornerRadius) objArr[0];
                int i9 = configureScheme + 115;
                apiKey = i9 % 128;
                if (i9 % 2 != 0 && Build.VERSION.SDK_INT < 98) {
                    return ButtonCustomization.getWarnings();
                }
                ButtonCustomization initialize2 = ButtonCustomization.initialize(getcornerradius2.createTransaction.getSimCarrierIdName());
                apiKey = (configureScheme + 81) % 128;
                return initialize2;
            case 9:
                return ThreeDS2ServiceInitializationCallback(objArr);
            case 10:
                return getSDKVersion(objArr);
            case 11:
                return createTransaction(objArr);
            case 12:
                getCornerRadius getcornerradius3 = (getCornerRadius) objArr[0];
                initialize initializeVar = (initialize) objArr[1];
                apiKey = (configureScheme + 67) % 128;
                setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = getcornerradius3.ConfigParameters;
                Object[] objArr4 = new Object[1];
                a(28 - TextUtils.getOffsetAfter("", 0), 690 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr4);
                ButtonCustomization initialize3 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr4[0]).intern()));
                apiKey = (configureScheme + 37) % 128;
                return initialize3;
            case 13:
                return addParam(objArr);
            case 14:
                configureScheme = (apiKey + 49) % 128;
                ButtonCustomization scrollBarFadeDuration = setScrollBarFadeDuration();
                apiKey = (configureScheme + 125) % 128;
                return scrollBarFadeDuration;
            case 15:
                int i10 = apiKey + 113;
                configureScheme = i10 % 128;
                if (i10 % 2 != 0 || Build.VERSION.SDK_INT >= 30) {
                    return ButtonCustomization.getWarnings(Build.VERSION.SECURITY_PATCH);
                }
                ButtonCustomization warnings = ButtonCustomization.getWarnings();
                apiKey = (configureScheme + 25) % 128;
                return warnings;
            case 16:
                return getParamValue(objArr);
            case 17:
                return ConfigParameters(objArr);
            case 18:
                return onCompleted(objArr);
            case 19:
                getCornerRadius getcornerradius4 = (getCornerRadius) objArr[0];
                initialize initializeVar2 = (initialize) objArr[1];
                configureScheme = (apiKey + 113) % 128;
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = getcornerradius4.addParam;
                Object[] objArr5 = new Object[1];
                a((Process.myPid() >> 22) + 39, 1154 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                ButtonCustomization initialize4 = initializeVar2.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr5[0]).intern()));
                configureScheme = (apiKey + 5) % 128;
                return initialize4;
            case 20:
                getCornerRadius getcornerradius5 = (getCornerRadius) objArr[0];
                int i11 = configureScheme + 11;
                apiKey = i11 % 128;
                int i12 = i11 % 2;
                setVerticalFadingEdgeEnabled setverticalfadingedgeenabled2 = getcornerradius5.ConfigParameters;
                if (i12 != 0) {
                    Object[] objArr6 = new Object[1];
                    a((ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)) * 81, 9619 >>> Gravity.getAbsoluteGravity(1, 1), (char) (ViewConfiguration.getKeyRepeatTimeout() / 113), objArr6);
                    return ButtonCustomization.getWarnings(setverticalfadingedgeenabled2.ThreeDS2ServiceInstance(((String) objArr6[0]).intern()));
                }
                Object[] objArr7 = new Object[1];
                a(14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 573 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
                return ButtonCustomization.getWarnings(setverticalfadingedgeenabled2.ThreeDS2ServiceInstance(((String) objArr7[0]).intern()));
            case 21:
                getCornerRadius getcornerradius6 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 113) % 128;
                ButtonCustomization defaultFocusHighlightEnabled = getcornerradius6.setDefaultFocusHighlightEnabled();
                apiKey = (configureScheme + 113) % 128;
                return defaultFocusHighlightEnabled;
            case 22:
                getCornerRadius getcornerradius7 = (getCornerRadius) objArr[0];
                initialize initializeVar3 = (initialize) objArr[1];
                int i13 = configureScheme + 97;
                apiKey = i13 % 128;
                int i14 = i13 % 2;
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled2 = getcornerradius7.addParam;
                if (i14 != 0) {
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getDoubleTapTimeout() << 47) + 31, 4393 >> (TypedValue.complexToFraction(0, 1.0f, 2.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(0, 1.0f, 2.0f) == 1.0f ? 0 : -1)), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr8);
                    obj2 = objArr8[0];
                } else {
                    Object[] objArr9 = new Object[1];
                    a(20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 915 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr9);
                    obj2 = objArr9[0];
                }
                ButtonCustomization initialize5 = initializeVar3.initialize(sethorizontalfadingedgeenabled2.ThreeDS2Service(((String) obj2).intern()));
                apiKey = (configureScheme + 81) % 128;
                return initialize5;
            case 23:
                return onError(objArr);
            case 24:
                return restrictedParameters(objArr);
            case 25:
                configureScheme = (apiKey + 53) % 128;
                ButtonCustomization warnings2 = ButtonCustomization.getWarnings(Build.USER);
                apiKey = (configureScheme + 89) % 128;
                return warnings2;
            case 26:
                apiKey = (configureScheme + 3) % 128;
                ButtonCustomization ThreeDS2ServiceInstance2 = ButtonCustomization.ThreeDS2ServiceInstance(Build.TIME);
                apiKey = (configureScheme + 77) % 128;
                return ThreeDS2ServiceInstance2;
            case 27:
                return removeParam(objArr);
            case 28:
                return ConfigurationBuilder(objArr);
            case 29:
                return configureScheme(objArr);
            case 30:
                getCornerRadius getcornerradius8 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 1) % 128;
                if (Build.VERSION.SDK_INT >= 31) {
                    setLayoutParams setlayoutparams2 = getcornerradius8.getParamValue;
                    Object[] objArr10 = new Object[1];
                    a(TextUtils.indexOf("", "", 0, 0) + 10, 166 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (63575 - TextUtils.indexOf("", "")), objArr10);
                    return ButtonCustomization.getWarnings(setlayoutparams2.initialize(((String) objArr10[0]).intern()));
                }
                int i15 = configureScheme + 81;
                apiKey = i15 % 128;
                if (i15 % 2 != 0) {
                    setLayoutParams setlayoutparams3 = getcornerradius8.getParamValue;
                    Object[] objArr11 = new Object[1];
                    a(114 >>> (ViewConfiguration.getJumpTapTimeout() / 109), 4636 << TextUtils.getOffsetBefore("", 0), (char) (36136 - Color.alpha(0)), objArr11);
                    return ButtonCustomization.getWarnings(setlayoutparams3.initialize(((String) objArr11[0]).intern()));
                }
                setLayoutParams setlayoutparams4 = getcornerradius8.getParamValue;
                Object[] objArr12 = new Object[1];
                a((ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 426 - TextUtils.getOffsetBefore("", 0), (char) (36136 - Color.alpha(0)), objArr12);
                return ButtonCustomization.getWarnings(setlayoutparams4.initialize(((String) objArr12[0]).intern()));
            case 31:
                return apiKey(objArr);
            case 32:
                return SchemeConfiguration(objArr);
            case 33:
                return mastercardSchemeConfiguration(objArr);
            case 34:
                setWillNotDraw setwillnotdraw = new setWillNotDraw((getCornerRadius) objArr[0], (initialize) objArr[1]);
                apiKey = (configureScheme + 83) % 128;
                return setwillnotdraw;
            case 35:
                return build(objArr);
            case 36:
                int i16 = configureScheme + 35;
                apiKey = i16 % 128;
                if (i16 % 2 == 0 ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 35) {
                    return ButtonCustomization.getWarnings();
                }
                str = Build.SKU;
                ButtonCustomization warnings3 = ButtonCustomization.getWarnings(str);
                configureScheme = (apiKey + 79) % 128;
                return warnings3;
            case 37:
                getCornerRadius getcornerradius9 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 77) % 128;
                ButtonCustomization rotationX = getcornerradius9.setRotationX();
                apiKey = (configureScheme + 89) % 128;
                return rotationX;
            case 38:
                return visaSchemeConfiguration(objArr);
            case 39:
                getCornerRadius getcornerradius10 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 49) % 128;
                ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius10}, 295279553, -295279547, System.identityHashCode(getcornerradius10));
                apiKey = (configureScheme + 73) % 128;
                return buttonCustomization;
            case 40:
                return amexConfiguration(objArr);
            case 41:
                return cbConfiguration(objArr);
            case 42:
                return eftposConfiguration(objArr);
            case 43:
                return jcbConfiguration(objArr);
            case 44:
                return dinersSchemeConfiguration(objArr);
            case 45:
                getCornerRadius getcornerradius11 = (getCornerRadius) objArr[0];
                apiKey = (configureScheme + 27) % 128;
                return ButtonCustomization.ThreeDS2ServiceInstance(getcornerradius11.createTransaction.getSimCarrierId());
            case 46:
                return unionSchemeConfiguration(objArr);
            case 47:
                return getSchemeLogo(objArr);
            case 48:
                getCornerRadius getcornerradius12 = (getCornerRadius) objArr[0];
                if (!getcornerradius12.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
                    return ButtonCustomization.initialize(getcornerradius12.cleanup.isPreferredNetworkOffloadSupported());
                }
                apiKey = (configureScheme + 119) % 128;
                ButtonCustomization ThreeDS2Service = ButtonCustomization.ThreeDS2Service();
                apiKey = (configureScheme + 97) % 128;
                return ThreeDS2Service;
            case 49:
                return newSchemeConfiguration(objArr);
            case 50:
                return getSchemeId(objArr);
            case 51:
                return getSchemeLogoDark(objArr);
            case 52:
                return getSchemeName(objArr);
            case 53:
                return getSchemeEncryptionPublicKey(objArr);
            case 54:
                return getSchemeEncryptionPublicKeyId(objArr);
            case 55:
                return getSchemePublicRootKeys(objArr);
            case 56:
                return SchemeConfigurationBuilder(objArr);
            case 57:
                return ids(objArr);
            case 58:
                return encryptionPublicKeyFromAssetCertificate(objArr);
            case 59:
                getCornerRadius getcornerradius13 = (getCornerRadius) objArr[0];
                apiKey = (configureScheme + 97) % 128;
                ButtonCustomization ThreeDS2ServiceInstance3 = ButtonCustomization.ThreeDS2ServiceInstance(getcornerradius13.createTransaction.getSimState());
                configureScheme = (apiKey + 93) % 128;
                return ThreeDS2ServiceInstance3;
            case 60:
                return encryptionPublicKey(objArr);
            case 61:
                getCornerRadius getcornerradius14 = (getCornerRadius) objArr[0];
                apiKey = (configureScheme + 51) % 128;
                if (Build.VERSION.SDK_INT < 30) {
                    getcornerradius14.getSDKInfo.getDefaultDisplay().getMetrics(new DisplayMetrics());
                    return ButtonCustomization.initialize(r9.xdpi);
                }
                ButtonCustomization initialize6 = ButtonCustomization.initialize(getcornerradius14.ThreeDS2Service.getResources().getDisplayMetrics().xdpi);
                configureScheme = (apiKey + 7) % 128;
                return initialize6;
            case 62:
                getCornerRadius getcornerradius15 = (getCornerRadius) objArr[0];
                initialize initializeVar4 = (initialize) objArr[1];
                configureScheme = (apiKey + 3) % 128;
                ButtonCustomization valueOf = getcornerradius15.valueOf(initializeVar4);
                configureScheme = (apiKey + 11) % 128;
                return valueOf;
            case 63:
                return logoDark(objArr);
            case 64:
                return logo(objArr);
            case 65:
                apiKey = (configureScheme + 73) % 128;
                ButtonCustomization layerType = setLayerType();
                apiKey = (configureScheme + 105) % 128;
                return layerType;
            case 66:
                configureScheme = (apiKey + 25) % 128;
                ButtonCustomization warnings4 = ButtonCustomization.getWarnings(Build.BOOTLOADER);
                configureScheme = (apiKey + 29) % 128;
                return warnings4;
            case 67:
                getCornerRadius getcornerradius16 = (getCornerRadius) objArr[0];
                int i17 = configureScheme + 15;
                apiKey = i17 % 128;
                if (i17 % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 90) {
                    return ButtonCustomization.initialize(getcornerradius16.ThreeDS2Service.getResources().getDisplayMetrics().ydpi);
                }
                getcornerradius16.getSDKInfo.getDefaultDisplay().getMetrics(new DisplayMetrics());
                ButtonCustomization initialize7 = ButtonCustomization.initialize(r9.ydpi);
                configureScheme = (apiKey + 39) % 128;
                return initialize7;
            case 68:
                return rootPublicKey(objArr);
            case 69:
                getCornerRadius getcornerradius17 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 83) % 128;
                if (!getcornerradius17.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup, setTranscriptMode.createTransaction, setTranscriptMode.getSDKInfo)) {
                    return ButtonCustomization.getWarnings(getcornerradius17.createTransaction.getLine1Number());
                }
                apiKey = (configureScheme + 57) % 128;
                return ButtonCustomization.ThreeDS2Service();
            case 70:
                return SDKNotInitializedException(objArr);
            case 71:
                return rootPublicKeyFromAssetCertificate(objArr);
            case 72:
                return SDKAlreadyInitializedException(objArr);
            case 73:
                getCornerRadius getcornerradius18 = (getCornerRadius) objArr[0];
                configureScheme = (apiKey + 99) % 128;
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled3 = getcornerradius18.addParam;
                Object[] objArr13 = new Object[1];
                a(TextUtils.indexOf("", "", 0) + 10, TextUtils.getCapsMode("", 0, 0) + 1082, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr13);
                ButtonCustomization warnings5 = ButtonCustomization.getWarnings(sethorizontalfadingedgeenabled3.ThreeDS2Service(((String) objArr13[0]).intern()));
                apiKey = (configureScheme + 99) % 128;
                return warnings5;
            case 74:
                return InvalidInputException(objArr);
            case 75:
                return SDKRuntimeException(objArr);
            case 76:
                return CertificateInfo(objArr);
            default:
                return ThreeDS2Service(objArr);
        }
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2ServiceInitializationCallback(getCornerRadius getcornerradius) {
        int i = configureScheme + 113;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization saveFromParentEnabled = getcornerradius.setSaveFromParentEnabled();
        if (i2 != 0) {
            int i3 = 89 / 0;
        }
        int i4 = configureScheme + 25;
        apiKey = i4 % 128;
        if (i4 % 2 == 0) {
            return saveFromParentEnabled;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        if (Build.VERSION.SDK_INT < 30) {
            return ButtonCustomization.getWarnings();
        }
        int i = configureScheme + 47;
        apiKey = i % 128;
        if (i % 2 != 0) {
            ButtonCustomization.getWarnings(getcornerradius.createTransaction.getNetworkCountryIso());
            throw null;
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(getcornerradius.createTransaction.getNetworkCountryIso());
        int i2 = apiKey + 41;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization Transaction(getCornerRadius getcornerradius) {
        int i = configureScheme + 69;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization forceDarkAllowed = getcornerradius.setForceDarkAllowed();
        if (i2 != 0) {
            int i3 = 86 / 0;
        }
        return forceDarkAllowed;
    }

    public static /* synthetic */ ButtonCustomization TransactionBridgingMessageExtensionVersion(getCornerRadius getcornerradius) {
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.setAnimation();
            throw null;
        }
        ButtonCustomization animation = getcornerradius.setAnimation();
        int i2 = apiKey + 75;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return animation;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        CharSequence charSequence;
        Object method;
        CharSequence charSequence2;
        Class cls;
        Object method2;
        int i4 = i;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i4];
        int i5 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        while (true) {
            int i6 = threeDS2ServiceInitializationCallback.initialize;
            if (i6 >= i4) {
                break;
            }
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            Class cls2 = Long.TYPE;
            int i9 = i5;
            Class cls3 = Integer.TYPE;
            if (i8 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(restrictedParameters[i2 % i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        i3 = i6;
                        charSequence = "";
                        method = obj;
                    } else {
                        jArr = jArr2;
                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 3222 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b = (byte) $$b;
                        byte b2 = (byte) (b - 1);
                        i3 = i6;
                        charSequence = "";
                        Object[] objArr3 = new Object[1];
                        b(b, b2, (byte) (-b2), objArr3);
                        method = cls4.getMethod((String) objArr3[i9], cls3);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    long j = threeDS2ServiceInitializationCallback.initialize;
                    long j2 = ConfigurationBuilder;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c);
                    objArr4[2] = Long.valueOf(j2);
                    objArr4[1] = Long.valueOf(j);
                    objArr4[i9] = l;
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 69, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 50704), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7789)).getMethod("b", cls2, cls2, cls2, cls3);
                        map.put(1319531906, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = threeDS2ServiceInitializationCallback;
                    objArr5[i9] = threeDS2ServiceInitializationCallback;
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls5 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) (27780 - ((Process.getThreadPriority(i9) + 20) >> 6)), TextUtils.getTrimmedLength(charSequence) + 2441);
                        int i10 = $$b;
                        byte b3 = (byte) i10;
                        Object[] objArr6 = new Object[1];
                        b(b3, (byte) (b3 - 1), (byte) i10, objArr6);
                        obj3 = cls5.getMethod((String) objArr6[i9], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    i4 = i;
                    i5 = i9;
                    jArr2 = jArr;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                long[] jArr3 = jArr2;
                Object[] objArr7 = {Integer.valueOf(restrictedParameters[i2 + i6])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 != null) {
                    method2 = obj4;
                    charSequence2 = "";
                    cls = Object.class;
                } else {
                    charSequence2 = "";
                    Class cls6 = (Class) removeParam.initialize(48 - TextUtils.indexOf(charSequence2, charSequence2, i9, i9), (char) (TextUtils.lastIndexOf(charSequence2, '0') + 1), (TypedValue.complexToFloat(i9) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i9) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 3221);
                    byte b4 = (byte) $$b;
                    byte b5 = (byte) (b4 - 1);
                    cls = Object.class;
                    Object[] objArr8 = new Object[1];
                    b(b4, b5, (byte) (-b5), objArr8);
                    method2 = cls6.getMethod((String) objArr8[0], cls3);
                    map2.put(-54653524, method2);
                }
                Long l2 = (Long) ((Method) method2).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ConfigurationBuilder), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(Color.blue(0) + 69, (char) (50704 - TextUtils.getCapsMode(charSequence2, 0, 0)), 7789 - View.combineMeasuredStates(0, 0))).getMethod("b", cls2, cls2, cls2, cls3);
                    map2.put(1319531906, obj5);
                }
                jArr3[i6] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls7 = (Class) removeParam.initialize(48 - TextUtils.getOffsetBefore(charSequence2, 0), (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27780), View.resolveSizeAndState(0, 0, 0) + 2441);
                    int i11 = $$b;
                    byte b6 = (byte) i11;
                    Object[] objArr11 = new Object[1];
                    b(b6, (byte) (b6 - 1), (byte) i11, objArr11);
                    Class cls8 = cls;
                    obj6 = cls7.getMethod((String) objArr11[0], cls8, cls8);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
                i4 = i;
                jArr2 = jArr3;
                i5 = 0;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr4 = jArr2;
        char[] cArr = new char[i4];
        threeDS2ServiceInitializationCallback.initialize = 0;
        $11 = ($10 + 97) % 128;
        while (true) {
            int i12 = threeDS2ServiceInitializationCallback.initialize;
            if (i12 >= i4) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i12] = (char) jArr4[i12];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls9 = (Class) removeParam.initialize(48 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 27780), 2441 - TextUtils.indexOf("", ""));
                int i13 = $$b;
                byte b7 = (byte) i13;
                Object[] objArr13 = new Object[1];
                b(b7, (byte) (b7 - 1), (byte) i13, objArr13);
                obj7 = cls9.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    private static /* synthetic */ Object addParam(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        apiKey = (configureScheme + 1) % 128;
        ButtonCustomization focusableInTouchMode = getcornerradius.setFocusableInTouchMode();
        int i = configureScheme + 31;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
        }
        return focusableInTouchMode;
    }

    public static /* synthetic */ ButtonCustomization amexConfiguration(getCornerRadius getcornerradius) {
        int i = apiKey + 119;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.setAccessibilityHeading();
            throw null;
        }
        ButtonCustomization accessibilityHeading = getcornerradius.setAccessibilityHeading();
        apiKey = (configureScheme + 27) % 128;
        return accessibilityHeading;
    }

    private static /* synthetic */ Object apiKey(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        int i = configureScheme + 73;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.SchemeConfigurationBuilder(initializeVar);
        }
        getcornerradius.SchemeConfigurationBuilder(initializeVar);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (i * 3) + 97;
        int i4 = s * 2;
        int i5 = b + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i3 += -i6;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i3 += -i6;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    private static /* synthetic */ Object build(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 39) % 128;
        if (!getcornerradius.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            return ButtonCustomization.getWarnings(getcornerradius.createTransaction.getGroupIdLevel1());
        }
        int i = apiKey + 119;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.ThreeDS2Service();
        }
        ButtonCustomization.ThreeDS2Service();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization cancelled(getCornerRadius getcornerradius) {
        int i = configureScheme + 73;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setAllowedHandwritingDelegatorPackage();
            throw null;
        }
        ButtonCustomization allowedHandwritingDelegatorPackage = getcornerradius.setAllowedHandwritingDelegatorPackage();
        int i2 = configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return allowedHandwritingDelegatorPackage;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization cbConfiguration(getCornerRadius getcornerradius) {
        int i = configureScheme + 67;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setForegroundTintBlendMode();
            throw null;
        }
        ButtonCustomization foregroundTintBlendMode = getcornerradius.setForegroundTintBlendMode();
        int i2 = apiKey + 113;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return foregroundTintBlendMode;
        }
        throw null;
    }

    private static /* synthetic */ Object cleanup(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        apiKey = (configureScheme + 45) % 128;
        setLayoutParams setlayoutparams = getcornerradius.getParamValue;
        Object[] objArr2 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, 166 - (KeyEvent.getMaxKeyCode() >> 16), (char) (63575 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr2);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(setlayoutparams.initialize(((String) objArr2[0]).intern()));
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization configureScheme(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 53) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 1172930657, -1172930627, System.identityHashCode(getcornerradius));
        configureScheme = (apiKey + 65) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization createTransaction(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 31;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.SDKRuntimeException(initializeVar);
            throw null;
        }
        ButtonCustomization SDKRuntimeException = getcornerradius.SDKRuntimeException(initializeVar);
        configureScheme = (apiKey + 85) % 128;
        return SDKRuntimeException;
    }

    public static /* synthetic */ ButtonCustomization dinersSchemeConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 9;
        apiKey = i % 128;
        int i2 = i % 2;
        Object[] objArr = {getcornerradius, initializeVar};
        int identityHashCode = System.identityHashCode(getcornerradius);
        if (i2 != 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr, 222008431, -222008378, identityHashCode);
        configureScheme = (apiKey + 89) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization eftposConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 85;
        apiKey = i % 128;
        int i2 = i % 2;
        Object[] objArr = {getcornerradius, initializeVar};
        int identityHashCode = System.identityHashCode(getcornerradius);
        if (i2 == 0) {
            return (ButtonCustomization) ThreeDS2Service(objArr, 1529805503, -1529805491, identityHashCode);
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr, 1529805503, -1529805491, identityHashCode);
        int i3 = 47 / 0;
        return buttonCustomization;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.initialize(r7.getLatitude());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.initialize(r7.getLatitude());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        return (com.netcetera.threeds.sdk.infrastructure.ButtonCustomization) com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service(new java.lang.Object[0], -2002911815, 2002911816, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r7.onCompleted.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.getWarnings, com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.ThreeDS2Service) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r3 = new java.lang.Object[1];
        a(android.graphics.Color.blue(0) + 7, android.text.TextUtils.getCapsMode("", 0, 0) + 1231, (char) (13119 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), r3);
        r7 = r7.ThreeDS2ServiceInstance.getLastKnownLocation(((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0064, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme + 55;
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if ((r0 % 2) != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object encryptionPublicKey(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 53;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setEdgeEffectColor setedgeeffectcolor = getcornerradius.onCompleted;
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[2];
            settranscriptmodeArr[1] = setTranscriptMode.getWarnings;
            settranscriptmodeArr[1] = setTranscriptMode.ThreeDS2Service;
        }
    }

    private /* synthetic */ ButtonCustomization encryptionPublicKeyFromAssetCertificate(initialize initializeVar) {
        configureScheme = (apiKey + 79) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 22, TextUtils.lastIndexOf("", '0', 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36510), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 107) % 128;
        return initialize2;
    }

    public static /* synthetic */ String f_(WifiInfo wifiInfo) {
        configureScheme = (apiKey + 107) % 128;
        String str = (String) ThreeDS2Service(new Object[]{wifiInfo}, 1792564741, -1792564739, (int) System.currentTimeMillis());
        int i = apiKey + 81;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization get(Locale locale) {
        configureScheme = (apiKey + 29) % 128;
        String locale2 = ((Locale) og.ThreeDS2Service(locale, Locale.getDefault())).toString();
        Object[] objArr = new Object[1];
        a(-ExpandableListView.getPackedPositionChild(0L), 1239 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Drawable.resolveOpacity(0, 0) + 35025), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(1 - KeyEvent.getDeadChar(0, 0), 1241 - Color.alpha(0), (char) ((-1) - Process.getGidForName("")), objArr2);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(oj.ThreeDS2Service(locale2, intern, ((String) objArr2[0]).intern()));
        apiKey = (configureScheme + 23) % 128;
        return warnings;
    }

    public static /* synthetic */ ButtonCustomization get3DSServerTransactionID(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 101) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1278473915, 1278473922, System.identityHashCode(getcornerradius));
        configureScheme = (apiKey + 29) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization getAcsRefNumber(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 117) % 128;
        ButtonCustomization scrollX = getcornerradius.setScrollX();
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return scrollX;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getAcsSignedContent(getCornerRadius getcornerradius) {
        int i = apiKey + 13;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setPivotY();
        }
        getcornerradius.setPivotY();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getAuthenticationRequestParameters(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 55) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1033519779, 1033519852, System.identityHashCode(getcornerradius));
        int i = configureScheme + 67;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getCertPrefix(getCornerRadius getcornerradius) {
        int i = configureScheme + 19;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization y = getcornerradius.setY();
        if (i2 != 0) {
            int i3 = 42 / 0;
        }
        apiKey = (configureScheme + 73) % 128;
        return y;
    }

    public static /* synthetic */ ButtonCustomization getDeviceData(getCornerRadius getcornerradius) {
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -2014341258, 2014341275, System.identityHashCode(getcornerradius));
        configureScheme = (apiKey + 83) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization getEncryptionCertificate(getCornerRadius getcornerradius) {
        int i = apiKey + 67;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.setTag();
            throw null;
        }
        ButtonCustomization tag = getcornerradius.setTag();
        configureScheme = (apiKey + 35) % 128;
        return tag;
    }

    public static /* synthetic */ ButtonCustomization getEncryptionCertificateKid(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 11) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 176765609, -176765561, System.identityHashCode(getcornerradius));
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization getErrorCode(initialize initializeVar) {
        Object obj;
        int i = apiKey + 121;
        configureScheme = i % 128;
        int i2 = i % 2;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a(16 % (ViewConfiguration.getPressedStateDuration() * EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), 16452 - (Process.myPid() - 57), (char) (1 % (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1))), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(9 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myPid() >> 22) + 732, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) obj).intern()));
        configureScheme = (apiKey + 5) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization getExpiryDate(initialize initializeVar) {
        apiKey = (configureScheme + 45) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 809, (char) View.combineMeasuredStates(0, 0), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = configureScheme + 77;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return initialize2;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getId(getCornerRadius getcornerradius) {
        int i = configureScheme + 47;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setAlwaysDrawnWithCacheEnabled();
        }
        getcornerradius.setAlwaysDrawnWithCacheEnabled();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getMessage(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 87) % 128;
        ButtonCustomization accessibilityDataSensitive = getcornerradius.setAccessibilityDataSensitive();
        apiKey = (configureScheme + 11) % 128;
        return accessibilityDataSensitive;
    }

    private /* synthetic */ ButtonCustomization getName(initialize initializeVar) {
        apiKey = (configureScheme + 75) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 14, View.getDefaultSize(0, 0) + 718, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 83) % 128;
        return initialize2;
    }

    private static /* synthetic */ Object getParamValue(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        int i = configureScheme + 17;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.InvalidInputException(initializeVar);
            throw null;
        }
        ButtonCustomization InvalidInputException = getcornerradius.InvalidInputException(initializeVar);
        int i2 = apiKey + 99;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return InvalidInputException;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getProgressView(getCornerRadius getcornerradius) {
        int i = configureScheme + 9;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setVisibility();
            throw null;
        }
        ButtonCustomization visibility = getcornerradius.setVisibility();
        int i2 = apiKey + 121;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return visibility;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 37;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization textDirection = getcornerradius.setTextDirection();
        if (i2 != 0) {
            int i3 = 3 / 0;
        }
        int i4 = apiKey + 45;
        configureScheme = i4 % 128;
        if (i4 % 2 != 0) {
            return textDirection;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKVersion(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        int i = configureScheme + 87;
        apiKey = i % 128;
        int i2 = i % 2;
        Object[] objArr2 = {getcornerradius, initializeVar};
        int identityHashCode = System.identityHashCode(getcornerradius);
        if (i2 == 0) {
            return (ButtonCustomization) ThreeDS2Service(objArr2, 2099153659, -2099153640, identityHashCode);
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSchemeConfigurations(getCornerRadius getcornerradius) {
        int i = configureScheme + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setHandwritingDelegateFlags();
            throw null;
        }
        ButtonCustomization handwritingDelegateFlags = getcornerradius.setHandwritingDelegateFlags();
        int i2 = configureScheme + 111;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return handwritingDelegateFlags;
    }

    private /* synthetic */ ButtonCustomization getSchemeEncryptionPublicKey(initialize initializeVar) {
        configureScheme = (apiKey + 91) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 14, View.MeasureSpec.getMode(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 19) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization getSchemeEncryptionPublicKeyId(initialize initializeVar) {
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0 || Build.VERSION.SDK_INT >= 63) {
            apiKey = (configureScheme + 23) % 128;
            if (Build.VERSION.SDK_INT <= 33) {
                apiKey = (configureScheme + 61) % 128;
                setLayoutParams setlayoutparams = this.getParamValue;
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf("", "", 0) + 20, 123 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
                return initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
            }
        }
        return ButtonCustomization.getWarnings();
    }

    private static /* synthetic */ Object getSchemeId(Object[] objArr) {
        int i = apiKey + 77;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return (ButtonCustomization) ThreeDS2Service(new Object[0], -1788223350, 1788223365, (int) System.currentTimeMillis());
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeLogo(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        if (!getcornerradius.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
            ButtonCustomization initialize2 = ButtonCustomization.initialize(getcornerradius.cleanup.isEnhancedPowerReportingSupported());
            configureScheme = (apiKey + 85) % 128;
            return initialize2;
        }
        int i = apiKey + 41;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.ThreeDS2Service();
        }
        int i2 = 56 / 0;
        return ButtonCustomization.ThreeDS2Service();
    }

    private /* synthetic */ ButtonCustomization getSchemeLogoDark(initialize initializeVar) {
        configureScheme = (apiKey + 67) % 128;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            apiKey = (configureScheme + 15) % 128;
            if (i <= 34) {
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
                Object[] objArr = new Object[1];
                a(ExpandableListView.getPackedPositionGroup(0L) + 15, View.MeasureSpec.getSize(0) + 92, (char) (TextUtils.getOffsetBefore("", 0) + 29526), objArr);
                return initializeVar.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
            }
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings();
        apiKey = (configureScheme + 83) % 128;
        return warnings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a1, code lost:
    
        return r6.initialize(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme + 95;
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r2 = new java.lang.Object[1];
        a(1 >>> (android.view.ViewConfiguration.getTapTimeout() + 7), (android.view.ViewConfiguration.getWindowTouchSlop() * 15) + 62, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() % 80), r2);
        r5 = ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r2 = new java.lang.Object[1];
        a(1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 70 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), r2);
        r5 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r5.isRampingRingerEnabled() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r5.isRampingRingerEnabled() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007c, code lost:
    
        r2 = new java.lang.Object[1];
        a((android.os.Process.myTid() >> 22) + 1, 71 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.PointF.length(androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.graphics.PointF.length(androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), r2);
        r5 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        r5 = ((java.lang.String) r5).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization getSchemeName(initialize initializeVar) {
        if (Build.VERSION.SDK_INT < 33) {
            setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
            Object[] objArr = new Object[1];
            a(20 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 72, (char) (Color.alpha(0) + 30616), objArr);
            return initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        }
        int i = configureScheme + 57;
        apiKey = i % 128;
        int i2 = i % 2;
        AudioManager audioManager = this.onError;
        if (i2 != 0) {
            int i3 = 34 / 0;
        }
    }

    private /* synthetic */ ButtonCustomization getSchemePublicRootKeys(initialize initializeVar) {
        configureScheme = (apiKey + 59) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, 143 - Color.blue(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19516), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        apiKey = (configureScheme + 69) % 128;
        return initialize2;
    }

    public static /* synthetic */ ButtonCustomization getSeverity(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 105) % 128;
        ButtonCustomization focusedByDefault = getcornerradius.setFocusedByDefault();
        apiKey = (configureScheme + 31) % 128;
        return focusedByDefault;
    }

    private /* synthetic */ ButtonCustomization getSupportedProtocolVersions(initialize initializeVar) {
        int i = configureScheme + 5;
        apiKey = i % 128;
        if (i % 2 == 0 || Build.VERSION.SDK_INT > 96) {
            ButtonCustomization warnings = ButtonCustomization.getWarnings();
            configureScheme = (apiKey + 85) % 128;
            return warnings;
        }
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(14 - TextUtils.indexOf("", ""), 1119 - Color.red(0), (char) (ImageFormat.getBitsPerPixel(0) + 7722), objArr);
        return initializeVar.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
    }

    public static /* synthetic */ ButtonCustomization getThreeDSRequestorAppURL(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 97) % 128;
        ButtonCustomization right = getcornerradius.setRight();
        int i = configureScheme + 65;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return right;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization getType(initialize initializeVar) {
        configureScheme = (apiKey + 23) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(24 - ExpandableListView.getPackedPositionType(0L), 588 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45230), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 111;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getValue(getCornerRadius getcornerradius) {
        int i = configureScheme + 53;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1963774857, 1963774909, System.identityHashCode(getcornerradius));
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getWarnings(getCornerRadius getcornerradius) {
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -535112501, 535112502, System.identityHashCode(getcornerradius));
        int i2 = configureScheme + 3;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization ids(initialize initializeVar) {
        int i = configureScheme + 119;
        apiKey = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 39) {
            return ButtonCustomization.getWarnings();
        }
        ButtonCustomization initialize2 = initializeVar.initialize(Boolean.valueOf(this.cleanup.is6GHzBandSupported()));
        apiKey = (configureScheme + 75) % 128;
        return initialize2;
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PPM_TEXT_CODE, -88, -122, 15};
        $$b = 0;
    }

    public static getCornerRadius initialize(Context context, setOnItemClickListener setonitemclicklistener) {
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr = new Object[1];
        a(8 - TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        LocationManager locationManager = (LocationManager) context.getSystemService(((String) objArr[0]).intern());
        Context applicationContext = context.getApplicationContext();
        Object[] objArr2 = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, TextUtils.indexOf("", "", 0) + 8, (char) (MotionEvent.axisFromString("") + 20883), objArr2);
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(12 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 12, (char) KeyEvent.keyCodeFromString(""), objArr3);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 5, 24 - View.combineMeasuredStates(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 34962), objArr4);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 7, AndroidCharacter.getMirror('0') - 19, (char) (Color.alpha(0) + 12938), objArr5);
        TelecomManager telecomManager = (TelecomManager) context.getSystemService(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a(6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 36, (char) TextUtils.indexOf("", "", 0), objArr6);
        WindowManager windowManager = (WindowManager) context.getSystemService(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(8 - ImageFormat.getBitsPerPixel(0), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 5, 51 - (ViewConfiguration.getTapTimeout() >> 16), (char) (5795 - View.getDefaultSize(0, 0)), objArr8);
        AudioManager audioManager = (AudioManager) context.getSystemService(((String) objArr8[0]).intern());
        setEdgeEffectColor setedgeeffectcolor = new setEdgeEffectColor(context);
        ContentResolver contentResolver = context.getContentResolver();
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = new setVerticalFadingEdgeEnabled(contentResolver);
        setLayoutParams setlayoutparams = new setLayoutParams(contentResolver);
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = new setHorizontalFadingEdgeEnabled(contentResolver);
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = new setHorizontalScrollBarEnabled(wifiManager, connectivityManager);
        Object[] objArr9 = new Object[1];
        a(14 - TextUtils.getTrimmedLength(""), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 56, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr9);
        getCornerRadius getcornerradius = new getCornerRadius(context, setonitemclicklistener, new SimpleDateFormat(((String) objArr9[0]).intern(), Locale.US), packageManager, locationManager, wifiManager, telephonyManager, telecomManager, windowManager, bluetoothManager, audioManager, setedgeeffectcolor, setverticalfadingedgeenabled, setlayoutparams, sethorizontalfadingedgeenabled, sethorizontalscrollbarenabled);
        configureScheme = (apiKey + 71) % 128;
        return getcornerradius;
    }

    private static /* synthetic */ Object jcbConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        apiKey = (configureScheme + 71) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 1956368536, -1956368512, System.identityHashCode(getcornerradius));
        int i = configureScheme + 29;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
        return buttonCustomization;
    }

    private /* synthetic */ ButtonCustomization logo(initialize initializeVar) {
        Object obj;
        int i = configureScheme + 27;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a((globalActionKeyTimeout > 1L ? 1 : (globalActionKeyTimeout == 1L ? 0 : -1)) + 54, 4944 / (ViewConfiguration.getMaximumDrawingCacheSize() << 75), (char) (30193 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1))), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(23 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 263 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11602), objArr2);
            obj = objArr2[0];
        }
        return initializeVar.initialize(setlayoutparams.initialize(((String) obj).intern()));
    }

    private /* synthetic */ ButtonCustomization logoDark(initialize initializeVar) {
        Object obj;
        int i = configureScheme + 27;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(100 >> (ViewConfiguration.getMaximumDrawingCacheSize() + 120), 14758 % TextUtils.indexOf((CharSequence) "", 'K', 1, 1), (char) (ViewConfiguration.getJumpTapTimeout() >>> 64), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) obj).intern()));
        configureScheme = (apiKey + 69) % 128;
        return initialize2;
    }

    private static /* synthetic */ Object mastercardSchemeConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        apiKey = (configureScheme + 69) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = getcornerradius.ConfigParameters;
        Object[] objArr2 = new Object[1];
        a(26 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 612 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), objArr2);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr2[0]).intern()));
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private static /* synthetic */ Object newSchemeConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = apiKey + 11;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setLayoutAnimation();
        }
        getcornerradius.setLayoutAnimation();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization onCompleted(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 81) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1440403272, 1440403331, System.identityHashCode(getcornerradius));
        int i = apiKey + 109;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private static /* synthetic */ Object onError(Object[] objArr) {
        int i = apiKey + 105;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            ButtonCustomization.ThreeDS2ServiceInstance((List<String>) Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
            throw null;
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance((List<String>) Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
        int i2 = configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization removeParam(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 103) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -946192707, 946192718, System.identityHashCode(getcornerradius));
        configureScheme = (apiKey + 59) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization restrictedParameters(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 25;
        apiKey = i % 128;
        int i2 = i % 2;
        Object[] objArr = {getcornerradius, initializeVar};
        int identityHashCode = System.identityHashCode(getcornerradius);
        if (i2 != 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr, -1416202633, 1416202655, identityHashCode);
        apiKey = (configureScheme + 107) % 128;
        return buttonCustomization;
    }

    private /* synthetic */ ButtonCustomization rootPublicKey(initialize initializeVar) {
        apiKey = (configureScheme + 23) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, 201 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Process.myTid() >> 22), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 115) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization rootPublicKeyFromAssetCertificate(initialize initializeVar) {
        configureScheme = (apiKey + 117) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(22 - (ViewConfiguration.getTapTimeout() >> 16), 495 - ExpandableListView.getPackedPositionGroup(0L), (char) Gravity.getAbsoluteGravity(0, 0), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setlayoutparams.initialize(((String) objArr[0]).intern()));
        int i = apiKey + 15;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return initialize2;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization set3DSServerTransactionID(getCornerRadius getcornerradius) {
        int i = apiKey + 1;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.setAutoHandwritingEnabled();
            throw null;
        }
        ButtonCustomization autoHandwritingEnabled = getcornerradius.setAutoHandwritingEnabled();
        configureScheme = (apiKey + 101) % 128;
        return autoHandwritingEnabled;
    }

    private /* synthetic */ ButtonCustomization setAccessibilityDataSensitive() {
        Object obj;
        int i = configureScheme + 45;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(6 >> TextUtils.lastIndexOf("", '_'), 14377 >> (ViewConfiguration.getFadingEdgeLength() * 29), (char) ((ViewConfiguration.getMaximumFlingVelocity() >>> 111) + 59221), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(TextUtils.lastIndexOf("", '0') + 11, 374 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (59221 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) obj).intern()));
        apiKey = (configureScheme + 121) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization setAccessibilityDelegate() {
        configureScheme = (apiKey + 111) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], 731428567, -731428497, (int) System.currentTimeMillis());
        int i = configureScheme + 53;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setAccessibilityHeading() {
        Object obj;
        int i = configureScheme + 65;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(ImageFormat.getBitsPerPixel(0) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, TextUtils.getCapsMode("", 1, 1) * 819, (char) (ViewConfiguration.getTouchSlop() / 106), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(20 - ImageFormat.getBitsPerPixel(0), 302 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) obj).intern()));
        configureScheme = (apiKey + 33) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization setAccessibilityPaneTitle() {
        apiKey = (configureScheme + 13) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -51708272, 51708308, (int) System.currentTimeMillis());
        configureScheme = (apiKey + 1) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization setAccessibilityTraversalAfter() {
        configureScheme = (apiKey + 17) % 128;
        ButtonCustomization persistentDrawingCache = setPersistentDrawingCache();
        int i = apiKey + 63;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
        return persistentDrawingCache;
    }

    public static /* synthetic */ ButtonCustomization setAccessibilityTraversalBefore() {
        int i = apiKey + 115;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setRenderEffect();
        }
        setRenderEffect();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setAcsTransactionID(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 73) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1332509178, 1332509238, System.identityHashCode(getcornerradius));
        int i = apiKey + 69;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setActivated() {
        configureScheme = (apiKey + 27) % 128;
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.createTransaction.isSmsCapable());
        apiKey = (configureScheme + 51) % 128;
        return initialize2;
    }

    private static /* synthetic */ ButtonCustomization setAddStatesFromChildren() {
        String ThreeDS2Service;
        int i = configureScheme + 33;
        apiKey = i % 128;
        if (i % 2 != 0) {
            String[] strArr = new String[2];
            strArr[1] = Build.MANUFACTURER;
            strArr[1] = Build.MODEL;
            ThreeDS2Service = nm.ThreeDS2Service(strArr);
        } else {
            ThreeDS2Service = nm.ThreeDS2Service(Build.MANUFACTURER, Build.MODEL);
        }
        return ButtonCustomization.getWarnings(ThreeDS2Service);
    }

    private /* synthetic */ ButtonCustomization setAllowClickWhenDisabled() {
        if (this.initialize.getSystemSharedLibraryNames() == null) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        configureScheme = (apiKey + 37) % 128;
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(r3.length);
        configureScheme = (apiKey + 29) % 128;
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ ButtonCustomization setAllowedHandwritingDelegatorPackage() {
        int i = (configureScheme + 125) % 128;
        apiKey = i;
        int i2 = i + 55;
        configureScheme = i2 % 128;
        int i3 = i2 % 2;
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.removeParam;
        if (i3 != 0) {
            return sethorizontalscrollbarenabled.ThreeDS2Service(setOnHoverListener.ThreeDS2Service, this.onCompleted);
        }
        int i4 = 92 / 0;
        return sethorizontalscrollbarenabled.ThreeDS2Service(setOnHoverListener.ThreeDS2Service, this.onCompleted);
    }

    private /* synthetic */ ButtonCustomization setAlpha() {
        Object obj;
        int i = configureScheme + 109;
        apiKey = i % 128;
        int i2 = i % 2;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(65 / (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1)), 4980 << (ViewConfiguration.getTouchSlop() - 12), (char) ExpandableListView.getPackedPositionType(0L), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(17 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 855 - (ViewConfiguration.getTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionType(0L), objArr2);
            obj = objArr2[0];
        }
        return ButtonCustomization.ThreeDS2ServiceInstance(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ ButtonCustomization setAlwaysDrawnWithCacheEnabled() {
        configureScheme = (apiKey + 51) % 128;
        Object[] objArr = new Object[1];
        a(7 - (Process.myPid() >> 22), 1242 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 40688), objArr);
        String intern = ((String) objArr[0]).intern();
        String str = (String) ThreeDS2Service(new Object[]{this}, 1356482989, -1356482913, System.identityHashCode(this));
        Object[] objArr2 = new Object[1];
        a(3 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1249, (char) ExpandableListView.getPackedPositionType(0L), objArr2);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(nm.get(intern, str, Build.VERSION.RELEASE, ((String) objArr2[0]).intern(), Integer.valueOf(Build.VERSION.SDK_INT)));
        int i = configureScheme + 27;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setAnimation() {
        apiKey = (configureScheme + 27) % 128;
        if (this.createTransaction.getSimState() != 5) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getSimOperatorName());
        apiKey = (configureScheme + 115) % 128;
        return warnings;
    }

    private static /* synthetic */ ButtonCustomization setAnimationCacheEnabled() {
        int i = configureScheme + 51;
        apiKey = i % 128;
        return ButtonCustomization.ThreeDS2ServiceInstance(i % 2 != 0 ? TimeZone.getDefault().getRawOffset() + 60000 : TimeZone.getDefault().getRawOffset() / 60000);
    }

    private static /* synthetic */ ButtonCustomization setAnimationMatrix() {
        apiKey = (configureScheme + 85) % 128;
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(Build.VERSION.SDK_INT);
        int i = apiKey + 67;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setAutoHandwritingEnabled() {
        ButtonCustomization buttonCustomization;
        int i;
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            buttonCustomization = ButtonCustomization.ThreeDS2Service();
            i = configureScheme + 97;
        } else {
            buttonCustomization = (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
            i = configureScheme + 43;
        }
        apiKey = i % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization setAutofillId() {
        configureScheme = (apiKey + 79) % 128;
        ButtonCustomization animationCacheEnabled = setAnimationCacheEnabled();
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return animationCacheEnabled;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setBackground() {
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
            int i = apiKey + 31;
            configureScheme = i % 128;
            if (i % 2 != 0) {
                return ButtonCustomization.ThreeDS2Service();
            }
            ButtonCustomization.ThreeDS2Service();
            throw null;
        }
        int i2 = configureScheme + 71;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            ButtonCustomization.getWarnings();
            throw null;
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings();
        int i3 = apiKey + 65;
        configureScheme = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setBackgroundDrawable() {
        apiKey = (configureScheme + 91) % 128;
        if (!(!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance))) {
            return ButtonCustomization.ThreeDS2Service();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            PackageManager packageManager = this.ThreeDS2Service.getPackageManager();
            Object[] objArr = new Object[1];
            a(25 - TextUtils.indexOf("", ""), 1192 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), objArr);
            ButtonCustomization initialize2 = ButtonCustomization.initialize(packageManager.hasSystemFeature(((String) objArr[0]).intern()));
            apiKey = (configureScheme + 41) % 128;
            return initialize2;
        }
        configureScheme = (apiKey + 89) % 128;
        ButtonCustomization initialize3 = ButtonCustomization.initialize(this.cleanup.isDeviceToApRttSupported());
        int i = apiKey + 101;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return initialize3;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setBackgroundResource() {
        configureScheme = (apiKey + 111) % 128;
        if (!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
            return ButtonCustomization.initialize(this.cleanup.isTdlsSupported());
        }
        ButtonCustomization ThreeDS2Service = ButtonCustomization.ThreeDS2Service();
        int i = apiKey + 111;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setBackgroundTintBlendMode() {
        configureScheme = (apiKey + 31) % 128;
        ButtonCustomization ThreeDS2Service = this.removeParam.ThreeDS2Service(setImportantForAutofill.getWarnings, this.onCompleted);
        apiKey = (configureScheme + 71) % 128;
        return ThreeDS2Service;
    }

    private /* synthetic */ ButtonCustomization setBackgroundTintList() {
        apiKey = (configureScheme + 15) % 128;
        ButtonCustomization ThreeDS2Service = this.removeParam.ThreeDS2Service(setAccessibilityPaneTitle.initialize, this.onCompleted);
        int i = apiKey + 7;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
        return ThreeDS2Service;
    }

    private /* synthetic */ ButtonCustomization setBackgroundTintMode() {
        int i = configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 == 0 ? !setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance) : !setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.ThreeDS2ServiceInstance)) {
            return ButtonCustomization.initialize(this.cleanup.isP2pSupported());
        }
        apiKey = (configureScheme + 103) % 128;
        return ButtonCustomization.ThreeDS2Service();
    }

    private /* synthetic */ ButtonCustomization setBottom() {
        apiKey = (configureScheme + 11) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 17, View.MeasureSpec.getMode(0) + 871, (char) View.combineMeasuredStates(0, 0), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 41) % 128;
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ ButtonCustomization setCameraDistance() {
        configureScheme = (apiKey + 83) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 638 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 83) % 128;
        return ThreeDS2ServiceInstance;
    }

    private static /* synthetic */ ButtonCustomization setClickable() {
        configureScheme = (apiKey + 111) % 128;
        ButtonCustomization initialize2 = ButtonCustomization.initialize(Environment.isExternalStorageRemovable());
        configureScheme = (apiKey + 115) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization setClipBounds() {
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.initialize, setTranscriptMode.ThreeDS2ServiceInitializationCallback)) {
            int i = apiKey + 17;
            configureScheme = i % 128;
            if (i % 2 != 0) {
                return ButtonCustomization.ThreeDS2Service();
            }
            int i2 = 54 / 0;
            return ButtonCustomization.ThreeDS2Service();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothDevice> it = this.getSDKVersion.getAdapter().getBondedDevices().iterator();
        configureScheme = (apiKey + 121) % 128;
        while (it.hasNext()) {
            int i3 = apiKey + 63;
            configureScheme = i3 % 128;
            if (i3 % 2 == 0) {
                arrayList.add(it.next().getAddress());
                throw null;
            }
            arrayList.add(it.next().getAddress());
        }
        return ButtonCustomization.ThreeDS2ServiceInstance(arrayList);
    }

    private /* synthetic */ ButtonCustomization setClipChildren() {
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.getWarnings, setTranscriptMode.ThreeDS2Service)) {
            apiKey = (configureScheme + 3) % 128;
            return ButtonCustomization.ThreeDS2Service();
        }
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1231, (char) (13120 - View.MeasureSpec.getMode(0)), objArr);
        Location lastKnownLocation = this.ThreeDS2ServiceInstance.getLastKnownLocation(((String) objArr[0]).intern());
        if (lastKnownLocation == null) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        configureScheme = (apiKey + 61) % 128;
        return ButtonCustomization.initialize(lastKnownLocation.getLongitude());
    }

    private static /* synthetic */ ButtonCustomization setClipToOutline() {
        apiKey = (configureScheme + 25) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.TYPE);
        int i = configureScheme + 89;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setClipToPadding() {
        InetAddress inetAddress = null;
        for (InetAddress inetAddress2 : setPreferKeepClearRects()) {
            if (!inetAddress2.isLoopbackAddress()) {
                int length = inetAddress2.getAddress().length;
                if (length == 16) {
                    int i = apiKey + 65;
                    configureScheme = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    inetAddress = inetAddress2;
                } else if (length == 4) {
                    int i2 = configureScheme + 95;
                    apiKey = i2 % 128;
                    if (i2 % 2 == 0) {
                        return ButtonCustomization.getWarnings(inetAddress2.getHostAddress());
                    }
                    ButtonCustomization.getWarnings(inetAddress2.getHostAddress());
                    throw null;
                }
            }
        }
        if (inetAddress == null) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        configureScheme = (apiKey + 107) % 128;
        String hostAddress = inetAddress.getHostAddress();
        Object[] objArr = new Object[1];
        a(1 - View.combineMeasuredStates(0, 0), 1237 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr);
        return ButtonCustomization.getWarnings(hostAddress.substring(0, hostAddress.indexOf(((String) objArr[0]).intern())));
    }

    public static /* synthetic */ ButtonCustomization setContentCaptureSession() {
        ButtonCustomization translationZ;
        int i = configureScheme + 99;
        apiKey = i % 128;
        if (i % 2 != 0) {
            translationZ = setTranslationZ();
            int i2 = 12 / 0;
        } else {
            translationZ = setTranslationZ();
        }
        int i3 = configureScheme + 25;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return translationZ;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setContentDescription() {
        int i = apiKey + 33;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setStateListAnimator();
        }
        setStateListAnimator();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setContentSensitivity() {
        int i = apiKey + 1;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setLayoutMode();
            throw null;
        }
        ButtonCustomization layoutMode = setLayoutMode();
        apiKey = (configureScheme + 79) % 128;
        return layoutMode;
    }

    private /* synthetic */ ButtonCustomization setContextClickable() {
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 118) {
            ButtonCustomization initialize2 = ButtonCustomization.initialize(this.ThreeDS2Service.getResources().getDisplayMetrics().density);
            configureScheme = (apiKey + 49) % 128;
            return initialize2;
        }
        this.getSDKInfo.getDefaultDisplay().getMetrics(new DisplayMetrics());
        return ButtonCustomization.initialize(r0.density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (r0.getWarnings(java.lang.Double.valueOf(r1)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (r0.getWarnings(java.lang.Double.valueOf(r1)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
    
        r6 = com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.initialize(r1);
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey = (com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme + 85) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0084, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setDefaultFocusHighlightEnabled() {
        double parseDouble;
        Double valueOf = Double.valueOf(255.0d);
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(16 - TextUtils.lastIndexOf("", '0'), KeyEvent.keyCodeFromString("") + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (View.resolveSizeAndState(0, 0, 0) + 11225), objArr);
        String initialize2 = setlayoutparams.initialize(((String) objArr[0]).intern());
        if (om.getWarnings(initialize2)) {
            int i = configureScheme + 101;
            apiKey = i % 128;
            if (i % 2 != 0) {
                ok warnings = ok.getWarnings(Double.valueOf(1.0d), valueOf);
                parseDouble = Double.parseDouble(initialize2);
            } else {
                ok warnings2 = ok.getWarnings(Double.valueOf(0.0d), valueOf);
                parseDouble = Double.parseDouble(initialize2);
            }
        }
        return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
    }

    private /* synthetic */ ButtonCustomization setDescendantFocusability() {
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.getWarnings.format(new Date()));
        int i = configureScheme + 81;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setDrawingCacheBackgroundColor() {
        configureScheme = (apiKey + 9) % 128;
        if (!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.initialize, setTranscriptMode.ThreeDS2ServiceInitializationCallback)) {
            return ButtonCustomization.getWarnings(this.getSDKVersion.getAdapter().getAddress());
        }
        apiKey = (configureScheme + 51) % 128;
        return ButtonCustomization.ThreeDS2Service();
    }

    private /* synthetic */ ButtonCustomization setDrawingCacheEnabled() {
        if (!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.initialize, setTranscriptMode.ThreeDS2ServiceInitializationCallback)) {
            ButtonCustomization initialize2 = ButtonCustomization.initialize(this.getSDKVersion.getAdapter().isEnabled());
            configureScheme = (apiKey + 121) % 128;
            return initialize2;
        }
        int i = configureScheme + 87;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return ButtonCustomization.ThreeDS2Service();
        }
        ButtonCustomization.ThreeDS2Service();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setDrawingCacheQuality() {
        apiKey = (configureScheme + 61) % 128;
        ButtonCustomization systemGestureExclusionRects = setSystemGestureExclusionRects();
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return systemGestureExclusionRects;
    }

    private static /* synthetic */ ButtonCustomization setDuplicateParentStateEnabled() {
        apiKey = (configureScheme + 77) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.DEVICE);
        configureScheme = (apiKey + 37) % 128;
        return warnings;
    }

    private static /* synthetic */ ButtonCustomization setElevation() {
        apiKey = (configureScheme + 39) % 128;
        return ButtonCustomization.ThreeDS2ServiceInstance(Build.VERSION.PREVIEW_SDK_INT);
    }

    private /* synthetic */ ButtonCustomization setFilterTouchesWhenObscured() {
        configureScheme = (apiKey + 77) % 128;
        String packageName = this.ThreeDS2Service.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return ButtonCustomization.getWarnings(this.initialize.getInstallerPackageName(packageName));
        }
        configureScheme = (apiKey + 25) % 128;
        try {
            return ButtonCustomization.getWarnings(this.initialize.getInstallSourceInfo(packageName).getInstallingPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
    }

    private /* synthetic */ ButtonCustomization setFitsSystemWindows() {
        configureScheme = (apiKey + 41) % 128;
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            int i = apiKey + 13;
            configureScheme = i % 128;
            if (i % 2 != 0) {
                return ButtonCustomization.ThreeDS2Service();
            }
            ButtonCustomization.ThreeDS2Service();
            throw null;
        }
        int i2 = configureScheme + 105;
        apiKey = i2 % 128;
        int i3 = i2 % 2;
        TelephonyManager telephonyManager = this.createTransaction;
        if (i3 == 0) {
            return ButtonCustomization.ThreeDS2ServiceInstance(telephonyManager.isMultiSimSupported());
        }
        ButtonCustomization.ThreeDS2ServiceInstance(telephonyManager.isMultiSimSupported());
        throw null;
    }

    private /* synthetic */ ButtonCustomization setFocusable() {
        apiKey = (configureScheme + 19) % 128;
        return ButtonCustomization.initialize(this.createTransaction.getSimSpecificCarrierIdName());
    }

    private /* synthetic */ ButtonCustomization setFocusableInTouchMode() {
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getManufacturerCode());
        int i = apiKey + 103;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setFocusedByDefault() {
        Object obj;
        int i = configureScheme + 105;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(Drawable.resolveOpacity(0, 0) * 27, 24203 - TextUtils.getOffsetBefore("", 1), (char) (10309 >> (ViewConfiguration.getJumpTapTimeout() + 25)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(18 - Drawable.resolveOpacity(0, 0), 245 - TextUtils.getOffsetBefore("", 0), (char) (28209 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) obj).intern()));
        int i3 = configureScheme + 3;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setForceDarkAllowed() {
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.ThreeDS2ServiceInstance.isLocationEnabled());
        apiKey = (configureScheme + 57) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization setForegroundGravity() {
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup) ? ButtonCustomization.ThreeDS2Service() : ButtonCustomization.initialize(this.ThreeDS2ServiceInitializationCallback.isTtySupported());
    }

    private /* synthetic */ ButtonCustomization setForegroundTintBlendMode() {
        int i = configureScheme + 45;
        apiKey = i % 128;
        int i2 = i % 2;
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.removeParam;
        if (i2 != 0) {
            sethorizontalscrollbarenabled.ThreeDS2Service(setOnReceiveContentListener.get, this.onCompleted);
            throw null;
        }
        ButtonCustomization ThreeDS2Service = sethorizontalscrollbarenabled.ThreeDS2Service(setOnReceiveContentListener.get, this.onCompleted);
        int i3 = apiKey + 3;
        configureScheme = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setForegroundTintList() {
        int i = configureScheme + 39;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 == 0 ? setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.cleanup) : !(!setedgeeffectcolor.ThreeDS2ServiceInstance(setTranscriptMode.cleanup))) {
            return ButtonCustomization.ThreeDS2Service();
        }
        int i3 = configureScheme + 21;
        apiKey = i3 % 128;
        int i4 = i3 % 2;
        TelephonyManager telephonyManager = this.createTransaction;
        if (i4 == 0) {
            return ButtonCustomization.initialize(telephonyManager.isWorldPhone());
        }
        int i5 = 2 / 0;
        return ButtonCustomization.initialize(telephonyManager.isWorldPhone());
    }

    private /* synthetic */ ButtonCustomization setHandwritingDelegateFlags() {
        apiKey = (configureScheme + 11) % 128;
        return this.removeParam.ThreeDS2Service(setAutofillId.initialize, this.onCompleted);
    }

    private static /* synthetic */ ButtonCustomization setHandwritingDelegatorCallback() {
        String str;
        String str2;
        configureScheme = (apiKey + 113) % 128;
        if (Build.VERSION.SDK_INT < 31) {
            return ButtonCustomization.getWarnings();
        }
        int i = configureScheme + 51;
        apiKey = i % 128;
        if (i % 2 == 0) {
            str = Build.SOC_MODEL;
            return ButtonCustomization.getWarnings(str);
        }
        str2 = Build.SOC_MODEL;
        int i2 = 72 / 0;
        return ButtonCustomization.getWarnings(str2);
    }

    private /* synthetic */ ButtonCustomization setHapticFeedbackEnabled() {
        int i = configureScheme + 23;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(WebSettings.getDefaultUserAgent(this.ThreeDS2Service));
        if (i2 != 0) {
            int i3 = 4 / 0;
        }
        int i4 = apiKey + 65;
        configureScheme = i4 % 128;
        if (i4 % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setHorizontalScrollBarEnabled() {
        ButtonCustomization warnings;
        int i = configureScheme + 67;
        apiKey = i % 128;
        if (i % 2 != 0) {
            warnings = ButtonCustomization.getWarnings(Build.getRadioVersion());
            int i2 = 15 / 0;
        } else {
            warnings = ButtonCustomization.getWarnings(Build.getRadioVersion());
        }
        int i3 = configureScheme + 51;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setHorizontalScrollbarThumbDrawable() {
        int i = apiKey + 45;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setScrollBarStyle();
            throw null;
        }
        ButtonCustomization scrollBarStyle = setScrollBarStyle();
        configureScheme = (apiKey + 101) % 128;
        return scrollBarStyle;
    }

    private static /* synthetic */ ButtonCustomization setHovered() {
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.getWarnings(Settings.System.DEFAULT_NOTIFICATION_URI.getPath());
        }
        ButtonCustomization.getWarnings(Settings.System.DEFAULT_NOTIFICATION_URI.getPath());
        throw null;
    }

    private /* synthetic */ ButtonCustomization setId() {
        int i = apiKey + 73;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.createTransaction.isNetworkRoaming());
        if (i2 == 0) {
            int i3 = 77 / 0;
        }
        return initialize2;
    }

    public static /* synthetic */ ButtonCustomization setImportantForContentCapture() {
        configureScheme = (apiKey + 91) % 128;
        ButtonCustomization duplicateParentStateEnabled = setDuplicateParentStateEnabled();
        configureScheme = (apiKey + 55) % 128;
        return duplicateParentStateEnabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r3.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.cleanup) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ((!r3.ThreeDS2ServiceInstance(r0)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        return (com.netcetera.threeds.sdk.infrastructure.ButtonCustomization) com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service(new java.lang.Object[0], -2002911815, 2002911816, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setIsCredential() {
        int i = configureScheme + 17;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 != 0) {
            new setTranscriptMode[0][0] = setTranscriptMode.cleanup;
        }
    }

    private /* synthetic */ ButtonCustomization setIsHandwritingDelegate() {
        configureScheme = (apiKey + 105) % 128;
        if (Build.VERSION.SDK_INT < 30) {
            return ButtonCustomization.getWarnings();
        }
        apiKey = (configureScheme + 61) % 128;
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(this.createTransaction.getSubscriptionId());
        configureScheme = (apiKey + 5) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization setKeepScreenOn() {
        int i = apiKey + 9;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return (ButtonCustomization) ThreeDS2Service(new Object[0], 1037664783, -1037664760, (int) System.currentTimeMillis());
        }
        int i2 = 46 / 0;
        return (ButtonCustomization) ThreeDS2Service(new Object[0], 1037664783, -1037664760, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ ButtonCustomization setLabelFor() {
        int i = configureScheme + 121;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setHorizontalScrollBarEnabled();
            throw null;
        }
        ButtonCustomization horizontalScrollBarEnabled = setHorizontalScrollBarEnabled();
        configureScheme = (apiKey + 99) % 128;
        return horizontalScrollBarEnabled;
    }

    private static /* synthetic */ ButtonCustomization setLayerType() {
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.getWarnings(Build.BOARD);
        }
        int i2 = 73 / 0;
        return ButtonCustomization.getWarnings(Build.BOARD);
    }

    private /* synthetic */ ButtonCustomization setLayoutAnimation() {
        int i = configureScheme + 89;
        apiKey = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 118) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.getSDKInfo.getDefaultDisplay().getMetrics(displayMetrics);
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            Object[] objArr = new Object[1];
            a(1 - TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 1239, (char) (47461 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(displayMetrics.heightPixels);
            return ButtonCustomization.getWarnings(sb.toString());
        }
        Rect bounds = this.getSDKInfo.getCurrentWindowMetrics().getBounds();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bounds.width());
        Object[] objArr2 = new Object[1];
        a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, 1239 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (47461 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(bounds.height());
        ButtonCustomization warnings = ButtonCustomization.getWarnings(sb2.toString());
        int i2 = configureScheme + 39;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setLayoutMode() {
        configureScheme = (apiKey + 43) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(nm.get(Build.MANUFACTURER, Build.MODEL));
        int i = configureScheme + 13;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setLayoutParams() {
        configureScheme = (apiKey + 71) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.PRODUCT);
        apiKey = (configureScheme + 13) % 128;
        return warnings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.initialize, com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.ThreeDS2ServiceInitializationCallback) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.getWarnings(r4.getSDKVersion.getAdapter().getName());
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme = (com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey + 9) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setLayoutTransition() {
        int i = apiKey + 5;
        configureScheme = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 == 0) {
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[4];
            settranscriptmodeArr[0] = setTranscriptMode.initialize;
            settranscriptmodeArr[1] = setTranscriptMode.ThreeDS2ServiceInitializationCallback;
        }
    }

    private /* synthetic */ ButtonCustomization setLongClickable() {
        if (Build.VERSION.SDK_INT >= 30) {
            ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(this.ThreeDS2Service.getResources().getDisplayMetrics().densityDpi);
            configureScheme = (apiKey + 1) % 128;
            return ThreeDS2ServiceInstance;
        }
        this.getSDKInfo.getDefaultDisplay().getMetrics(new DisplayMetrics());
        ButtonCustomization ThreeDS2ServiceInstance2 = ButtonCustomization.ThreeDS2ServiceInstance(r0.densityDpi);
        apiKey = (configureScheme + 31) % 128;
        return ThreeDS2ServiceInstance2;
    }

    private /* synthetic */ ButtonCustomization setMinimumWidth() {
        apiKey = (configureScheme + 35) % 128;
        if (this.createTransaction.getSimState() != 5) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        int i = configureScheme + 9;
        apiKey = i % 128;
        int i2 = i % 2;
        TelephonyManager telephonyManager = this.createTransaction;
        if (i2 == 0) {
            return ButtonCustomization.getWarnings(telephonyManager.getSimOperator());
        }
        ButtonCustomization.getWarnings(telephonyManager.getSimOperator());
        throw null;
    }

    private /* synthetic */ ButtonCustomization setMotionEventSplittingEnabled() {
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.get.initialize());
        apiKey = (configureScheme + 71) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setNestedScrollingEnabled() {
        apiKey = (configureScheme + 3) % 128;
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(this.createTransaction.getPhoneType());
        int i = apiKey + 113;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setNextClusterForwardId() {
        int i = apiKey + 69;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setElevation();
            throw null;
        }
        ButtonCustomization elevation = setElevation();
        configureScheme = (apiKey + 109) % 128;
        return elevation;
    }

    public static /* synthetic */ ButtonCustomization setNextFocusLeftId() {
        int i = configureScheme + 73;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setHovered();
            throw null;
        }
        ButtonCustomization hovered = setHovered();
        configureScheme = (apiKey + 29) % 128;
        return hovered;
    }

    public static /* synthetic */ ButtonCustomization setNextFocusRightId() {
        ButtonCustomization animationMatrix;
        int i = apiKey + 99;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            animationMatrix = setAnimationMatrix();
            int i2 = 1 / 0;
        } else {
            animationMatrix = setAnimationMatrix();
        }
        configureScheme = (apiKey + 55) % 128;
        return animationMatrix;
    }

    public static /* synthetic */ ButtonCustomization setOnApplyWindowInsetsListener() {
        apiKey = (configureScheme + 47) % 128;
        ButtonCustomization scrollBarSize = setScrollBarSize();
        int i = apiKey + 73;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return scrollBarSize;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setOnCapturedPointerListener() {
        configureScheme = (apiKey + 95) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getNetworkCountryIso());
        apiKey = (configureScheme + 51) % 128;
        return warnings;
    }

    public static /* synthetic */ ButtonCustomization setOnClickListener() {
        configureScheme = (apiKey + 81) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], 235208200, -235208143, (int) System.currentTimeMillis());
        int i = apiKey + 97;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization setOnContextClickListener() {
        int i = configureScheme + 53;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setOutlineProvider();
        }
        int i2 = 46 / 0;
        return setOutlineProvider();
    }

    public static /* synthetic */ ButtonCustomization setOnCreateContextMenuListener() {
        configureScheme = (apiKey + 79) % 128;
        ButtonCustomization scrollbarFadingEnabled = setScrollbarFadingEnabled();
        configureScheme = (apiKey + 97) % 128;
        return scrollbarFadingEnabled;
    }

    public static /* synthetic */ ButtonCustomization setOnDragListener() {
        configureScheme = (apiKey + 97) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], 1919430071, -1919430046, (int) System.currentTimeMillis());
        int i = configureScheme + 109;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setOnFocusChangeListener() {
        ButtonCustomization buttonCustomization;
        int i = configureScheme + 67;
        apiKey = i % 128;
        if (i % 2 != 0) {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -875331566, 875331595, (int) System.currentTimeMillis());
            int i2 = 50 / 0;
        } else {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -875331566, 875331595, (int) System.currentTimeMillis());
        }
        int i3 = configureScheme + 111;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setOnGenericMotionListener() {
        apiKey = (configureScheme + 119) % 128;
        ButtonCustomization layoutParams = setLayoutParams();
        apiKey = (configureScheme + 27) % 128;
        return layoutParams;
    }

    public static /* synthetic */ ButtonCustomization setOnHoverListener() {
        int i = apiKey + 49;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return (ButtonCustomization) ThreeDS2Service(new Object[0], -543055870, 543055936, (int) System.currentTimeMillis());
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setOnKeyListener() {
        int i = configureScheme + 91;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setClickable();
            throw null;
        }
        ButtonCustomization clickable = setClickable();
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return clickable;
    }

    public static /* synthetic */ ButtonCustomization setOnLongClickListener() {
        apiKey = (configureScheme + 41) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -1870459167, 1870459193, (int) System.currentTimeMillis());
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization setOnReceiveContentListener() {
        ButtonCustomization scrollBarDefaultDelayBeforeFade;
        int i = configureScheme + 97;
        apiKey = i % 128;
        if (i % 2 != 0) {
            scrollBarDefaultDelayBeforeFade = setScrollBarDefaultDelayBeforeFade();
            int i2 = 41 / 0;
        } else {
            scrollBarDefaultDelayBeforeFade = setScrollBarDefaultDelayBeforeFade();
        }
        int i3 = apiKey + 81;
        configureScheme = i3 % 128;
        if (i3 % 2 != 0) {
            return scrollBarDefaultDelayBeforeFade;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setOutlineProvider() {
        configureScheme = (apiKey + 65) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.TAGS);
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setOverScrollMode() {
        if (Build.VERSION.SDK_INT < 30) {
            apiKey = (configureScheme + 87) % 128;
            return ButtonCustomization.ThreeDS2ServiceInstance(this.createTransaction.getPhoneCount());
        }
        int i = configureScheme + 33;
        apiKey = i % 128;
        int i2 = i % 2;
        TelephonyManager telephonyManager = this.createTransaction;
        if (i2 == 0) {
            return ButtonCustomization.ThreeDS2ServiceInstance(telephonyManager.getActiveModemCount());
        }
        ButtonCustomization.ThreeDS2ServiceInstance(telephonyManager.getActiveModemCount());
        throw null;
    }

    private /* synthetic */ ButtonCustomization setPadding() {
        configureScheme = (apiKey + 5) % 128;
        ButtonCustomization ThreeDS2Service = this.removeParam.ThreeDS2Service(setRevealOnFocusHint.ThreeDS2Service, this.onCompleted);
        int i = configureScheme + 53;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setPaddingRelative() {
        int i = apiKey + 29;
        configureScheme = i % 128;
        int i2 = i % 2;
        boolean hasIccCard = this.createTransaction.hasIccCard();
        if (i2 != 0) {
            return ButtonCustomization.initialize(hasIccCard);
        }
        ButtonCustomization.initialize(hasIccCard);
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setPersistentDrawingCache() {
        apiKey = (configureScheme + 107) % 128;
        Object[] objArr = new Object[1];
        a(6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.combineMeasuredStates(0, 0) + 1242, (char) (40687 - TextUtils.indexOf("", "", 0)), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(((String) objArr[0]).intern());
        int i = configureScheme + 43;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setPivotX() {
        Object obj;
        int i = apiKey + 81;
        configureScheme = i % 128;
        int i2 = i % 2;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a(68 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 1271 / View.MeasureSpec.getSize(1), (char) (62930 >>> KeyEvent.normalizeMetaState(1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 19, View.MeasureSpec.getSize(0) + 788, (char) (KeyEvent.normalizeMetaState(0) + 62930), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) obj).intern()));
        configureScheme = (apiKey + 45) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setPivotY() {
        configureScheme = (apiKey + 39) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(17 - MotionEvent.axisFromString(""), 662 - Color.argb(0, 0, 0, 0), (char) Drawable.resolveOpacity(0, 0), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 103;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setPointerIcon() {
        apiKey = (configureScheme + 13) % 128;
        if (this.createTransaction.getSimState() != 5) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getSimCountryIso());
        configureScheme = (apiKey + 45) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setPreferKeepClear() {
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.initialize, setTranscriptMode.ThreeDS2ServiceInitializationCallback)) {
            return ButtonCustomization.ThreeDS2Service();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ArrayList arrayList = new ArrayList();
            Iterator<BluetoothDevice> it = this.getSDKVersion.getAdapter().getBondedDevices().iterator();
            apiKey = (configureScheme + 77) % 128;
            while (it.hasNext()) {
                arrayList.add(it.next().getAlias());
            }
            return ButtonCustomization.ThreeDS2ServiceInstance(arrayList);
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings();
        int i = configureScheme + 113;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private List<InetAddress> setPreferKeepClearRects() {
        int i = apiKey + 13;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            NetworkInterface.getNetworkInterfaces();
            throw null;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces != null) {
            LinkedList linkedList = new LinkedList();
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                int i2 = configureScheme + 43;
                apiKey = i2 % 128;
                if (i2 % 2 != 0) {
                    ((NetworkInterface) it.next()).getInetAddresses();
                    throw null;
                }
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                if (inetAddresses != null) {
                    linkedList.addAll(Collections.list(inetAddresses));
                }
            }
            return linkedList;
        }
        return Collections.EMPTY_LIST;
    }

    private static /* synthetic */ ButtonCustomization setRenderEffect() {
        configureScheme = (apiKey + 77) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.BRAND);
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r1.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.cleanup) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.getWarnings(r4.createTransaction.getDeviceSoftwareVersion());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey + 53;
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setRequestedFrameRate() {
        int i = apiKey + 9;
        configureScheme = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 == 0) {
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[1];
            settranscriptmodeArr[1] = setTranscriptMode.cleanup;
        }
    }

    private /* synthetic */ ButtonCustomization setRight() {
        apiKey = (configureScheme + 57) % 128;
        if (this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.getSDKVersion)) {
            apiKey = (configureScheme + 97) % 128;
            return ButtonCustomization.ThreeDS2Service();
        }
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.initialize.canRequestPackageInstalls());
        apiKey = (configureScheme + 75) % 128;
        return initialize2;
    }

    private /* synthetic */ ButtonCustomization setRotation() {
        configureScheme = (apiKey + 69) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(33 - TextUtils.indexOf("", ""), 436 - Process.getGidForName(""), (char) (TextUtils.getOffsetBefore("", 0) + 50768), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) objArr[0]).intern()));
        int i = apiKey + 33;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setRotationX() {
        Object obj;
        int i = configureScheme + 33;
        apiKey = i % 128;
        int i2 = i % 2;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(117 >>> (elapsedRealtimeNanos > 1L ? 1 : (elapsedRealtimeNanos == 1L ? 0 : -1)), 25459 << View.MeasureSpec.makeMeasureSpec(0, 0), (char) (57852 % (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(11 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 680 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 57852), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) obj).intern()));
        apiKey = (configureScheme + 109) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setSaveEnabled() {
        configureScheme = (apiKey + 115) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777229, 153 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (48421 - View.resolveSizeAndState(0, 0, 0)), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(setlayoutparams.initialize(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 7) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setSaveFromParentEnabled() {
        apiKey = (configureScheme + 97) % 128;
        if (this.initialize.getSystemAvailableFeatures() == null) {
            ButtonCustomization buttonCustomization = (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
            apiKey = (configureScheme + 59) % 128;
            return buttonCustomization;
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(r3.length);
        int i = apiKey + 37;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ ButtonCustomization setScaleX() {
        apiKey = (configureScheme + 89) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 23, 742 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ ButtonCustomization setScaleY() {
        apiKey = (configureScheme + 39) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(19 - TextUtils.indexOf("", ""), 818 - Process.getGidForName(""), (char) KeyEvent.getDeadChar(0, 0), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 93) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setScreenReaderFocusable() {
        apiKey = (configureScheme + 67) % 128;
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.initialize.isSafeMode());
        apiKey = (configureScheme + 37) % 128;
        return initialize2;
    }

    private static /* synthetic */ ButtonCustomization setScrollBarDefaultDelayBeforeFade() {
        int i = apiKey + 45;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.getWarnings(Build.MANUFACTURER);
        }
        int i2 = 49 / 0;
        return ButtonCustomization.getWarnings(Build.MANUFACTURER);
    }

    private static /* synthetic */ ButtonCustomization setScrollBarFadeDuration() {
        configureScheme = (apiKey + 115) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.FINGERPRINT);
        configureScheme = (apiKey + 25) % 128;
        return warnings;
    }

    private static /* synthetic */ ButtonCustomization setScrollBarSize() {
        int i = configureScheme + 71;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return ButtonCustomization.getWarnings(Build.DISPLAY);
        }
        ButtonCustomization.getWarnings(Build.DISPLAY);
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setScrollBarStyle() {
        int i = configureScheme + 85;
        apiKey = i % 128;
        if (i % 2 != 0) {
            ButtonCustomization.getWarnings(Build.ID);
            throw null;
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.ID);
        apiKey = (configureScheme + 51) % 128;
        return warnings;
    }

    public static /* synthetic */ ButtonCustomization setScrollContainer() {
        int i = apiKey + 3;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[0], -1811316947, 1811317001, (int) System.currentTimeMillis());
        configureScheme = (apiKey + 39) % 128;
        return buttonCustomization;
    }

    private /* synthetic */ ButtonCustomization setScrollX() {
        configureScheme = (apiKey + 125) % 128;
        setLayoutParams setlayoutparams = this.getParamValue;
        Object[] objArr = new Object[1];
        a(25 - KeyEvent.normalizeMetaState(0), 471 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (43798 - View.combineMeasuredStates(0, 0)), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(setlayoutparams.initialize(((String) objArr[0]).intern()));
        apiKey = (configureScheme + 45) % 128;
        return ThreeDS2ServiceInstance;
    }

    private static /* synthetic */ ButtonCustomization setScrollbarFadingEnabled() {
        ButtonCustomization warnings;
        int i = configureScheme + 7;
        apiKey = i % 128;
        if (i % 2 != 0) {
            warnings = ButtonCustomization.getWarnings(Build.HARDWARE);
            int i2 = 58 / 0;
        } else {
            warnings = ButtonCustomization.getWarnings(Build.HARDWARE);
        }
        int i3 = apiKey + 47;
        configureScheme = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setSelected() {
        configureScheme = (apiKey + 71) % 128;
        if (!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            return ButtonCustomization.getWarnings(this.createTransaction.getVoiceMailNumber());
        }
        apiKey = (configureScheme + 37) % 128;
        ButtonCustomization ThreeDS2Service = ButtonCustomization.ThreeDS2Service();
        int i = configureScheme + 81;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
        return ThreeDS2Service;
    }

    private /* synthetic */ ButtonCustomization setSoundEffectsEnabled() {
        int i = configureScheme + 19;
        apiKey = i % 128;
        if (i % 2 != 0 || Build.VERSION.SDK_INT >= 30) {
            return ButtonCustomization.initialize(this.ThreeDS2Service.getResources().getDisplayMetrics().scaledDensity);
        }
        this.getSDKInfo.getDefaultDisplay().getMetrics(new DisplayMetrics());
        ButtonCustomization initialize2 = ButtonCustomization.initialize(r0.scaledDensity);
        apiKey = (configureScheme + 67) % 128;
        return initialize2;
    }

    public static /* synthetic */ ButtonCustomization setStateDescription() {
        int i = configureScheme + 77;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setHandwritingDelegatorCallback();
        }
        int i2 = 0 / 0;
        return setHandwritingDelegatorCallback();
    }

    private static /* synthetic */ ButtonCustomization setStateListAnimator() {
        apiKey = (configureScheme + 73) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.VERSION.CODENAME);
        apiKey = (configureScheme + 69) % 128;
        return warnings;
    }

    private static /* synthetic */ ButtonCustomization setSystemGestureExclusionRects() {
        String str;
        int i = configureScheme + 111;
        apiKey = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 83) {
            return ButtonCustomization.getWarnings();
        }
        str = Build.SOC_MANUFACTURER;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(str);
        int i2 = configureScheme + 13;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setTag() {
        configureScheme = (apiKey + 45) % 128;
        ButtonCustomization initialize2 = ButtonCustomization.initialize(this.createTransaction.isHearingAidCompatibilitySupported());
        int i = configureScheme + 49;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return initialize2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2ServiceInstance(r4.getDataNetworkType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r1.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.cleanup) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme + 111;
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey = r0 % 128;
        r0 = r0 % 2;
        r4 = r4.createTransaction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r0 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2ServiceInstance(r4.getDataNetworkType());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setTextAlignment() {
        int i = configureScheme + 63;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 != 0) {
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[1];
            settranscriptmodeArr[1] = setTranscriptMode.cleanup;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setTranscriptMode.cleanup) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1.ThreeDS2ServiceInstance(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r0 = new java.lang.StringBuilder();
        r2 = new java.lang.Object[1];
        a(13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.KeyEvent.keyCodeFromString("") + 1218, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), r2);
        r0.append(((java.lang.String) r2[0]).intern());
        r0.append(r6.createTransaction.getDataNetworkType());
        r6 = com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.getWarnings(r0.toString());
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme = (com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0073, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2Service();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setTextDirection() {
        int i = configureScheme + 27;
        apiKey = i % 128;
        int i2 = i % 2;
        setEdgeEffectColor setedgeeffectcolor = this.onCompleted;
        if (i2 != 0) {
            setTranscriptMode[] settranscriptmodeArr = new setTranscriptMode[0];
            settranscriptmodeArr[1] = setTranscriptMode.cleanup;
        }
    }

    public static /* synthetic */ ButtonCustomization setThreeDSRequestorAppURL(getCornerRadius getcornerradius) {
        int i = configureScheme + 47;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization backgroundResource = getcornerradius.setBackgroundResource();
        if (i2 != 0) {
            int i3 = 99 / 0;
        }
        int i4 = apiKey + 43;
        configureScheme = i4 % 128;
        if (i4 % 2 != 0) {
            return backgroundResource;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setTooltipText() {
        int i = configureScheme + 49;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getMmsUserAgent());
        if (i2 != 0) {
            int i3 = 87 / 0;
        }
        int i4 = configureScheme + 89;
        apiKey = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setTop() {
        apiKey = (configureScheme + 105) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 17, 838 - KeyEvent.normalizeMetaState(0), (char) TextUtils.getTrimmedLength(""), objArr);
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        configureScheme = (apiKey + 81) % 128;
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ ButtonCustomization setTouchDelegate() {
        Object obj;
        int i = configureScheme + 53;
        apiKey = i % 128;
        int i2 = i % 2;
        setLayoutParams setlayoutparams = this.getParamValue;
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 1) * 56, 25561 >> (ViewConfiguration.getWindowTouchSlop() / 78), (char) (31506 / View.MeasureSpec.getSize(0)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 19, (ViewConfiguration.getWindowTouchSlop() >> 8) + MLKEMEngine.KyberPolyBytes, (char) (View.MeasureSpec.getSize(0) + 28539), objArr2);
            obj = objArr2[0];
        }
        return ButtonCustomization.getWarnings(setlayoutparams.initialize(((String) obj).intern()));
    }

    private /* synthetic */ ButtonCustomization setTouchscreenBlocksFocus() {
        apiKey = (configureScheme + 105) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.ThreeDS2Service.getPackageName());
        apiKey = (configureScheme + 71) % 128;
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setTransitionAlpha() {
        return ButtonCustomization.getWarnings();
    }

    private /* synthetic */ ButtonCustomization setTransitionGroup() {
        int i = configureScheme + 67;
        apiKey = i % 128;
        int i2 = i % 2;
        String ThreeDS2Service = this.get.ThreeDS2Service();
        if (i2 == 0) {
            return ButtonCustomization.getWarnings(ThreeDS2Service);
        }
        ButtonCustomization.getWarnings(ThreeDS2Service);
        throw null;
    }

    private /* synthetic */ ButtonCustomization setTransitionName() {
        apiKey = (configureScheme + 55) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(this.createTransaction.getMmsUAProfUrl());
        int i = configureScheme + 87;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
        return warnings;
    }

    private /* synthetic */ ButtonCustomization setTranslationY() {
        apiKey = (configureScheme + 29) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(27 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 1092, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16515), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = apiKey + 53;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ ButtonCustomization setTranslationZ() {
        configureScheme = (apiKey + 109) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.VERSION.INCREMENTAL);
        apiKey = (configureScheme + 55) % 128;
        return warnings;
    }

    private static /* synthetic */ ButtonCustomization setVerticalFadingEdgeEnabled() {
        int i = apiKey + 3;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.ThreeDS2ServiceInstance((List<String>) Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
        }
        ButtonCustomization.ThreeDS2ServiceInstance((List<String>) Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
        throw null;
    }

    private /* synthetic */ ButtonCustomization setVerticalScrollBarEnabled() {
        if (!this.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
        }
        int i = apiKey + 77;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.ThreeDS2Service();
        }
        int i2 = 6 / 0;
        return ButtonCustomization.ThreeDS2Service();
    }

    private /* synthetic */ ButtonCustomization setVisibility() {
        int i = apiKey + 107;
        configureScheme = i % 128;
        if (i % 2 == 0 && Build.VERSION.SDK_INT < 42) {
            return ButtonCustomization.getWarnings();
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(this.createTransaction.getSimSpecificCarrierId());
        configureScheme = (apiKey + 103) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization setWindowInsetsAnimationCallback() {
        apiKey = (configureScheme + 29) % 128;
        ButtonCustomization addStatesFromChildren = setAddStatesFromChildren();
        apiKey = (configureScheme + 33) % 128;
        return addStatesFromChildren;
    }

    private /* synthetic */ ButtonCustomization setX() {
        ButtonCustomization ThreeDS2ServiceInstance;
        apiKey = (configureScheme + 57) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(20 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0) + 981, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        String ThreeDS2Service = sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern());
        if (oj.get(ThreeDS2Service)) {
            apiKey = (configureScheme + 9) % 128;
            ThreeDS2ServiceInstance = ButtonCustomization.getWarnings(ThreeDS2Service);
        } else {
            Object[] objArr2 = new Object[1];
            a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1002, (char) (TextUtils.getOffsetBefore("", 0) + 50033), objArr2);
            ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance((List<String>) Arrays.asList(ThreeDS2Service.split(((String) objArr2[0]).intern())));
        }
        int i = apiKey + 101;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization setY() {
        apiKey = (configureScheme + 51) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(32 - (Process.myPid() >> 22), 948 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        ButtonCustomization warnings = ButtonCustomization.getWarnings(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = configureScheme + 119;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return warnings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.get(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.get(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0075, code lost:
    
        r2 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetAfter("", 0) + 1, 1001 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50033), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a6, code lost:
    
        return com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.ThreeDS2ServiceInstance((java.util.List<java.lang.String>) java.util.Arrays.asList(r7.split(((java.lang.String) r2[0]).intern())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.ButtonCustomization.getWarnings(r7);
        com.netcetera.threeds.sdk.infrastructure.getCornerRadius.apiKey = (com.netcetera.threeds.sdk.infrastructure.getCornerRadius.configureScheme + 81) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ ButtonCustomization setZ() {
        String ThreeDS2Service;
        int i = apiKey + 105;
        configureScheme = i % 128;
        int i2 = i % 2;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a(80 << TextUtils.indexOf("", "", 0, 1), 28155 - (ViewConfiguration.getTapTimeout() >> 55), (char) View.getDefaultSize(0, 1), objArr);
            ThreeDS2Service = sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern());
        } else {
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) + 30, 1002 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.getDefaultSize(0, 0), objArr2);
            ThreeDS2Service = sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr2[0]).intern());
        }
    }

    public static /* synthetic */ ButtonCustomization timedout(getCornerRadius getcornerradius) {
        int i = configureScheme + 65;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setScreenReaderFocusable();
            throw null;
        }
        ButtonCustomization screenReaderFocusable = getcornerradius.setScreenReaderFocusable();
        int i2 = configureScheme + 57;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return screenReaderFocusable;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization toString(getCornerRadius getcornerradius) {
        int i = apiKey + 89;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization verticalScrollBarEnabled = getcornerradius.setVerticalScrollBarEnabled();
        if (i2 == 0) {
            int i3 = 21 / 0;
        }
        int i4 = configureScheme + 81;
        apiKey = i4 % 128;
        if (i4 % 2 == 0) {
            return verticalScrollBarEnabled;
        }
        throw null;
    }

    private static /* synthetic */ Object unionSchemeConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 89;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setForegroundGravity();
            throw null;
        }
        ButtonCustomization foregroundGravity = getcornerradius.setForegroundGravity();
        int i2 = apiKey + 59;
        configureScheme = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return foregroundGravity;
    }

    private /* synthetic */ ButtonCustomization valueOf(initialize initializeVar) {
        Object obj;
        int i = apiKey + 65;
        configureScheme = i % 128;
        int i2 = i % 2;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a(47 >>> TextUtils.indexOf("", ""), 23328 << View.MeasureSpec.getSize(1), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 96), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(18 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            obj = objArr2[0];
        }
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) obj).intern()));
        int i3 = configureScheme + 85;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return initialize2;
        }
        throw null;
    }

    private /* synthetic */ ButtonCustomization values(initialize initializeVar) {
        configureScheme = (apiKey + 33) % 128;
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = this.ConfigParameters;
        Object[] objArr = new Object[1];
        a(12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 1070, (char) (26954 - TextUtils.getCapsMode("", 0, 0)), objArr);
        ButtonCustomization initialize2 = initializeVar.initialize(setverticalfadingedgeenabled.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 25;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
        return initialize2;
    }

    private static /* synthetic */ Object visaSchemeConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        configureScheme = (apiKey + 29) % 128;
        if (Build.VERSION.SDK_INT < 33) {
            setLayoutParams setlayoutparams = getcornerradius.getParamValue;
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 23, 351 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 61757), objArr2);
            return initializeVar.initialize(setlayoutparams.initialize(((String) objArr2[0]).intern()));
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings();
        int i = apiKey + 25;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    public get AuthenticationRequestParameters() {
        configureScheme = (apiKey + 69) % 128;
        setScrollX setscrollx = setScrollX.getWarnings;
        int i = apiKey + 71;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setscrollx;
        }
        throw null;
    }

    public get ButtonCustomization() {
        get paramValue;
        int i = configureScheme + 95;
        apiKey = i % 128;
        if (i % 2 != 0) {
            paramValue = getParamValue(setTransitionAlpha.ThreeDS2Service);
            int i2 = 23 / 0;
        } else {
            paramValue = getParamValue(setTransitionAlpha.ThreeDS2Service);
        }
        apiKey = (configureScheme + 73) % 128;
        return paramValue;
    }

    public get ChallengeStatusReceiver() {
        setStateListAnimator setstatelistanimator = new setStateListAnimator(this);
        apiKey = (configureScheme + 69) % 128;
        return setstatelistanimator;
    }

    public get CompletionEvent() {
        int i = apiKey + 65;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            onCompleted(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get onCompleted = onCompleted(setTransitionAlpha.ThreeDS2Service);
        configureScheme = (apiKey + 7) % 128;
        return onCompleted;
    }

    public get Customization() {
        getBorderWidth getborderwidth = new getBorderWidth(this);
        apiKey = (configureScheme + 63) % 128;
        return getborderwidth;
    }

    public get DsRidValues() {
        addAttributes addattributes = new addAttributes(this);
        apiKey = (configureScheme + 61) % 128;
        return addattributes;
    }

    public get ErrorMessage() {
        int i = apiKey + 81;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return cleanup(setTransitionAlpha.ThreeDS2Service);
        }
        cleanup(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get LabelCustomization() {
        int i = configureScheme + 103;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return restrictedParameters(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 57 / 0;
        return restrictedParameters(setBottom.ThreeDS2ServiceInstance);
    }

    public get NcaBouncyCastleProvider() {
        onContextItemSelected oncontextitemselected = new onContextItemSelected(this);
        configureScheme = (apiKey + 5) % 128;
        return oncontextitemselected;
    }

    public get ProgressView() {
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return onCompleted(setBottom.ThreeDS2ServiceInstance);
        }
        onCompleted(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    public get ProtocolErrorEvent() {
        apiKey = (configureScheme + 29) % 128;
        get onError = onError(setBottom.ThreeDS2ServiceInstance);
        int i = apiKey + 89;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return onError;
        }
        throw null;
    }

    public get RuntimeErrorEvent() {
        int i = configureScheme + 23;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return addParam(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 41 / 0;
        return addParam(setBottom.ThreeDS2ServiceInstance);
    }

    public get SDKNotInitializedException() {
        configureScheme = (apiKey + 91) % 128;
        get getVar = (get) ThreeDS2Service(new Object[]{this, setHapticFeedbackEnabled.get}, 1222991564, -1222991530, System.identityHashCode(this));
        int i = configureScheme + 35;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
        return getVar;
    }

    public get TextBoxCustomization() {
        setTextBoxCustomization settextboxcustomization;
        int i = apiKey + 99;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            settextboxcustomization = setTextBoxCustomization.ThreeDS2ServiceInstance;
            int i2 = 68 / 0;
        } else {
            settextboxcustomization = setTextBoxCustomization.ThreeDS2ServiceInstance;
        }
        apiKey = (configureScheme + 39) % 128;
        return settextboxcustomization;
    }

    public get ToolbarCustomization() {
        int i = apiKey + 27;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return visaSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        }
        visaSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    public get UiCustomization() {
        int i = apiKey + 79;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return amexConfiguration(setTransitionAlpha.ThreeDS2Service);
        }
        amexConfiguration(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get UiCustomizationButtonType() {
        configureScheme = (apiKey + 87) % 128;
        NcaBouncyCastleProvider ncaBouncyCastleProvider = NcaBouncyCastleProvider.initialize;
        configureScheme = (apiKey + 45) % 128;
        return ncaBouncyCastleProvider;
    }

    public get UiCustomizationUiCustomizationType() {
        hasAlgorithm hasalgorithm = new hasAlgorithm(this);
        int i = apiKey + 1;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
        return hasalgorithm;
    }

    public get ViewCustomization() {
        setProgressViewBackgroundColor setprogressviewbackgroundcolor = new setProgressViewBackgroundColor(this);
        apiKey = (configureScheme + 53) % 128;
        return setprogressviewbackgroundcolor;
    }

    public get Warning() {
        apiKey = (configureScheme + 117) % 128;
        setRotationY setrotationy = setRotationY.ThreeDS2Service;
        int i = configureScheme + 65;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setrotationy;
        }
        throw null;
    }

    public get addAlgorithm() {
        registerForContextMenu registerforcontextmenu = new registerForContextMenu(this);
        int i = configureScheme + 1;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return registerforcontextmenu;
        }
        throw null;
    }

    public get addAttributes() {
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = new setVerticalScrollbarThumbDrawable(this);
        apiKey = (configureScheme + 97) % 128;
        return setverticalscrollbarthumbdrawable;
    }

    public get addKeyInfoConverter() {
        setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = new setVerticalScrollbarTrackDrawable(this);
        int i = apiKey + 31;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
        return setverticalscrollbartrackdrawable;
    }

    public get close() {
        int i = apiKey + 91;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return get(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 20 / 0;
        return get(setBottom.ThreeDS2ServiceInstance);
    }

    public get completed() {
        apiKey = (configureScheme + 27) % 128;
        get ThreeDS2ServiceInitializationCallback = ThreeDS2ServiceInitializationCallback(setBottom.ThreeDS2ServiceInstance);
        int i = configureScheme + 97;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
        return ThreeDS2ServiceInitializationCallback;
    }

    public get doChallenge() {
        int i = configureScheme + 15;
        apiKey = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get ThreeDS2Service = ThreeDS2Service(setTransitionAlpha.ThreeDS2Service);
        int i2 = apiKey + 81;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public get getAcsTransactionID() {
        apiKey = (configureScheme + 49) % 128;
        get sDKInfo = getSDKInfo(setBottom.ThreeDS2ServiceInstance);
        configureScheme = (apiKey + 99) % 128;
        return sDKInfo;
    }

    public get getBackgroundColor() {
        apiKey = (configureScheme + 107) % 128;
        get ConfigParameters = ConfigParameters(setTransitionAlpha.ThreeDS2Service);
        apiKey = (configureScheme + 9) % 128;
        return ConfigParameters;
    }

    public get getBorderColor() {
        configureScheme = (apiKey + 81) % 128;
        get mastercardSchemeConfiguration = mastercardSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        configureScheme = (apiKey + 87) % 128;
        return mastercardSchemeConfiguration;
    }

    public get getBorderWidth() {
        setButtonCustomization setbuttoncustomization = new setButtonCustomization(this);
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
        return setbuttoncustomization;
    }

    public get getButtonCustomization() {
        getProgressViewBackgroundColor getprogressviewbackgroundcolor = new getProgressViewBackgroundColor(this);
        configureScheme = (apiKey + 63) % 128;
        return getprogressviewbackgroundcolor;
    }

    public get getButtonText() {
        configureScheme = (apiKey + 71) % 128;
        get mastercardSchemeConfiguration = mastercardSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        configureScheme = (apiKey + 47) % 128;
        return mastercardSchemeConfiguration;
    }

    public get getChallengeViewBackgroundColor() {
        getPrivateKey getprivatekey = new getPrivateKey(this);
        apiKey = (configureScheme + 63) % 128;
        return getprivatekey;
    }

    public get getCornerRadius() {
        getHeadingTextFontName getheadingtextfontname = new getHeadingTextFontName(this);
        configureScheme = (apiKey + 93) % 128;
        return getheadingtextfontname;
    }

    public get getDarkBackgroundColor() {
        int i = apiKey + 63;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ConfigParameters(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 72 / 0;
        return ConfigParameters(setBottom.ThreeDS2ServiceInstance);
    }

    public get getDarkBorderColor() {
        apiKey = (configureScheme + 49) % 128;
        get build = build(setBottom.ThreeDS2ServiceInstance);
        int i = configureScheme + 23;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return build;
        }
        throw null;
    }

    public get getDarkModeSupported() {
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            addAlgorithm addalgorithm = addAlgorithm.getWarnings;
            throw null;
        }
        addAlgorithm addalgorithm2 = addAlgorithm.getWarnings;
        int i2 = configureScheme + 101;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return addalgorithm2;
        }
        throw null;
    }

    public get getDarkTextColor() {
        getBorderColor getbordercolor = new getBorderColor(this);
        int i = apiKey + 71;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getbordercolor;
        }
        throw null;
    }

    public get getErrorComponent() {
        getTextFontSize gettextfontsize = new getTextFontSize(this);
        configureScheme = (apiKey + 63) % 128;
        return gettextfontsize;
    }

    public get getErrorDescription() {
        getTextColor gettextcolor = new getTextColor(this);
        apiKey = (configureScheme + 9) % 128;
        return gettextcolor;
    }

    public get getErrorDetails() {
        setTextColor settextcolor = new setTextColor(this);
        int i = apiKey + 109;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
        return settextcolor;
    }

    public get getErrorMessage() {
        int i = configureScheme + 17;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return addParam(setTransitionAlpha.ThreeDS2Service);
        }
        addParam(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get getErrorMessageType() {
        getDarkTextColor getdarktextcolor = new getDarkTextColor(this);
        configureScheme = (apiKey + 95) % 128;
        return getdarktextcolor;
    }

    public get getHeaderText() {
        int i = configureScheme + 17;
        apiKey = i % 128;
        if (i % 2 != 0) {
            amexConfiguration(setBottom.ThreeDS2ServiceInstance);
            throw null;
        }
        get amexConfiguration = amexConfiguration(setBottom.ThreeDS2ServiceInstance);
        int i2 = apiKey + 73;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return amexConfiguration;
        }
        throw null;
    }

    public get getHeadingDarkTextColor() {
        getToolbarCustomization gettoolbarcustomization = new getToolbarCustomization(this);
        int i = configureScheme + 23;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return gettoolbarcustomization;
        }
        throw null;
    }

    public get getHeadingTextColor() {
        apiKey = (configureScheme + 71) % 128;
        get configureScheme2 = configureScheme(setBottom.ThreeDS2ServiceInstance);
        int i = apiKey + 105;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return configureScheme2;
        }
        throw null;
    }

    public get getHeadingTextFontName() {
        setToolbarCustomization settoolbarcustomization = new setToolbarCustomization(this);
        int i = apiKey + 117;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return settoolbarcustomization;
        }
        throw null;
    }

    public get getHeadingTextFontSize() {
        configureScheme = (apiKey + 121) % 128;
        get getVar = (get) ThreeDS2Service(new Object[]{this, setTransitionAlpha.ThreeDS2Service}, -111448831, 111448882, System.identityHashCode(this));
        configureScheme = (apiKey + 107) % 128;
        return getVar;
    }

    public get getIds() {
        int i = apiKey + 103;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = setDefaultFocusHighlightEnabled.get;
            throw null;
        }
        setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled2 = setDefaultFocusHighlightEnabled.get;
        apiKey = (configureScheme + 37) % 128;
        return setdefaultfocushighlightenabled2;
    }

    public get getKeyInfoConverter() {
        setVerticalScrollbarPosition setverticalscrollbarposition = new setVerticalScrollbarPosition(this);
        apiKey = (configureScheme + 105) % 128;
        return setverticalscrollbarposition;
    }

    public get getLabelCustomization() {
        getChallengeViewBackgroundColor getchallengeviewbackgroundcolor = new getChallengeViewBackgroundColor(this);
        apiKey = (configureScheme + 69) % 128;
        return getchallengeviewbackgroundcolor;
    }

    public get getLicenseExpiryDate() {
        configureScheme = (apiKey + 11) % 128;
        setFocusedByDefault setfocusedbydefault = setFocusedByDefault.get;
        int i = configureScheme + 97;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setfocusedbydefault;
        }
        throw null;
    }

    public get getMessageVersion() {
        apiKey = (configureScheme + 73) % 128;
        get ThreeDS2Service = ThreeDS2Service(setBottom.ThreeDS2ServiceInstance);
        configureScheme = (apiKey + 47) % 128;
        return ThreeDS2Service;
    }

    public get getMessageVersionNumber() {
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            createTransaction(setBottom.ThreeDS2ServiceInstance);
            throw null;
        }
        get createTransaction = createTransaction(setBottom.ThreeDS2ServiceInstance);
        apiKey = (configureScheme + 29) % 128;
        return createTransaction;
    }

    public get getPrivateKey() {
        setFadingEdgeLength setfadingedgelength = new setFadingEdgeLength(this);
        int i = configureScheme + 57;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setfadingedgelength;
        }
        throw null;
    }

    public get getProgressViewBackgroundColor() {
        addKeyInfoConverter addkeyinfoconverter = new addKeyInfoConverter(this);
        configureScheme = (apiKey + 107) % 128;
        return addkeyinfoconverter;
    }

    public get getPublicKey() {
        setPendingCredentialRequest setpendingcredentialrequest = new setPendingCredentialRequest(this);
        configureScheme = (apiKey + 81) % 128;
        return setpendingcredentialrequest;
    }

    public get getRootCertificates() {
        apiKey = (configureScheme + 101) % 128;
        setAccessibilityDataSensitive setaccessibilitydatasensitive = setAccessibilityDataSensitive.initialize;
        apiKey = (configureScheme + 119) % 128;
        return setaccessibilitydatasensitive;
    }

    public get getSDKAppID() {
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setAlpha setalpha = setAlpha.getWarnings;
            throw null;
        }
        setAlpha setalpha2 = setAlpha.getWarnings;
        apiKey = (configureScheme + 97) % 128;
        return setalpha2;
    }

    public get getSDKEphemeralPublicKey() {
        setScaleX setscalex;
        int i = configureScheme + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setscalex = setScaleX.initialize;
            int i2 = 32 / 0;
        } else {
            setscalex = setScaleX.initialize;
        }
        int i3 = apiKey + 95;
        configureScheme = i3 % 128;
        if (i3 % 2 != 0) {
            return setscalex;
        }
        throw null;
    }

    public get getSDKReferenceNumber() {
        configureScheme = (apiKey + 83) % 128;
        setPivotY setpivoty = setPivotY.getWarnings;
        int i = configureScheme + 43;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
        return setpivoty;
    }

    public get getSDKTransactionID() {
        apiKey = (configureScheme + 59) % 128;
        setScaleY setscaley = setScaleY.getWarnings;
        configureScheme = (apiKey + 43) % 128;
        return setscaley;
    }

    public get getService() {
        unregisterForContextMenu unregisterforcontextmenu = new unregisterForContextMenu(this);
        apiKey = (configureScheme + 15) % 128;
        return unregisterforcontextmenu;
    }

    public get getTextBoxCustomization() {
        int i = apiKey + 19;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            unionSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get unionSchemeConfiguration = unionSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        int i2 = apiKey + 81;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return unionSchemeConfiguration;
        }
        throw null;
    }

    public get getTextColor() {
        configureScheme = (apiKey + 73) % 128;
        get removeParam = removeParam(setBottom.ThreeDS2ServiceInstance);
        configureScheme = (apiKey + 3) % 128;
        return removeParam;
    }

    public get getTextFontName() {
        setBorderColor setbordercolor = new setBorderColor(this);
        apiKey = (configureScheme + 23) % 128;
        return setbordercolor;
    }

    public get getTextFontSize() {
        int i = apiKey + 71;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return apiKey(setTransitionAlpha.ThreeDS2Service);
        }
        apiKey(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get getToolbarCustomization() {
        int i = apiKey + 51;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return dinersSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 4 / 0;
        return dinersSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
    }

    public get getTransactionID() {
        setTextFontSize settextfontsize = new setTextFontSize(this);
        configureScheme = (apiKey + 3) % 128;
        return settextfontsize;
    }

    public get getTransactionStatus() {
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            createTransaction(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get createTransaction = createTransaction(setTransitionAlpha.ThreeDS2Service);
        int i2 = apiKey + 69;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return createTransaction;
        }
        throw null;
    }

    public get getViewCustomization() {
        apiKey = (configureScheme + 101) % 128;
        get unionSchemeConfiguration = unionSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        int i = apiKey + 39;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
        return unionSchemeConfiguration;
    }

    public get hasAlgorithm() {
        setContentView setcontentview = new setContentView(this);
        apiKey = (configureScheme + 51) % 128;
        return setcontentview;
    }

    public get hideProgress() {
        setHeadingTextColor setheadingtextcolor = new setHeadingTextColor(this);
        configureScheme = (apiKey + 55) % 128;
        return setheadingtextcolor;
    }

    public get isProgressShown() {
        setHeadingTextFontName setheadingtextfontname = new setHeadingTextFontName(this);
        int i = apiKey + 9;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setheadingtextfontname;
        }
        throw null;
    }

    public get onContextItemSelected() {
        int i = configureScheme + 101;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return eftposConfiguration(setTransitionAlpha.ThreeDS2Service);
        }
        eftposConfiguration(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get onOptionsItemSelected() {
        get cbConfiguration;
        int i = configureScheme + 79;
        apiKey = i % 128;
        if (i % 2 != 0) {
            cbConfiguration = cbConfiguration(setHasTransientState.ThreeDS2Service);
            int i2 = 17 / 0;
        } else {
            cbConfiguration = cbConfiguration(setHasTransientState.ThreeDS2Service);
        }
        int i3 = apiKey + 7;
        configureScheme = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return cbConfiguration;
    }

    public get openContextMenu() {
        configureScheme = (apiKey + 79) % 128;
        get cbConfiguration = cbConfiguration(setHapticFeedbackEnabled.get);
        int i = configureScheme + 37;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return cbConfiguration;
        }
        throw null;
    }

    public get protocolError() {
        getDarkBackgroundColor getdarkbackgroundcolor = new getDarkBackgroundColor(this);
        apiKey = (configureScheme + 73) % 128;
        return getdarkbackgroundcolor;
    }

    public get registerForContextMenu() {
        setScrollIndicators setscrollindicators = new setScrollIndicators(this);
        apiKey = (configureScheme + 21) % 128;
        return setscrollindicators;
    }

    public get runtimeError() {
        configureScheme = (apiKey + 121) % 128;
        get cleanup = cleanup(setBottom.ThreeDS2ServiceInstance);
        int i = apiKey + 3;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return cleanup;
        }
        throw null;
    }

    public get setAcsRefNumber() {
        int i = configureScheme + 119;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getSDKVersion(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get sDKVersion = getSDKVersion(setTransitionAlpha.ThreeDS2Service);
        apiKey = (configureScheme + 101) % 128;
        return sDKVersion;
    }

    public get setAcsSignedContent() {
        int i = apiKey + 63;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getSDKVersion(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 29 / 0;
        return getSDKVersion(setBottom.ThreeDS2ServiceInstance);
    }

    public get setBackgroundColor() {
        apiKey = (configureScheme + 35) % 128;
        get paramValue = getParamValue(setBottom.ThreeDS2ServiceInstance);
        int i = configureScheme + 79;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return paramValue;
        }
        throw null;
    }

    public get setBorderColor() {
        getButtonCustomization getbuttoncustomization = new getButtonCustomization(this);
        configureScheme = (apiKey + 83) % 128;
        return getbuttoncustomization;
    }

    public get setBorderWidth() {
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getTextBoxCustomization gettextboxcustomization = getTextBoxCustomization.getWarnings;
        int i = apiKey + 33;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return gettextboxcustomization;
        }
        throw null;
    }

    public get setButtonCustomization() {
        UiCustomizationUiCustomizationType uiCustomizationUiCustomizationType = new UiCustomizationUiCustomizationType(this);
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return uiCustomizationUiCustomizationType;
        }
        throw null;
    }

    public get setButtonText() {
        configureScheme = (apiKey + 67) % 128;
        get SchemeConfiguration = SchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        apiKey = (configureScheme + 21) % 128;
        return SchemeConfiguration;
    }

    public get setChallengeViewBackgroundColor() {
        getKeyInfoConverter getkeyinfoconverter = new getKeyInfoConverter(this);
        apiKey = (configureScheme + 31) % 128;
        return getkeyinfoconverter;
    }

    public get setContentView() {
        setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = new setHorizontalScrollbarThumbDrawable(this);
        int i = apiKey + 21;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return sethorizontalscrollbarthumbdrawable;
        }
        throw null;
    }

    public get setCornerRadius() {
        setHeadingTextFontSize setheadingtextfontsize = new setHeadingTextFontSize(this);
        int i = apiKey + 65;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
        return setheadingtextfontsize;
    }

    public get setDarkBackgroundColor() {
        int i = apiKey + 57;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return removeParam(setTransitionAlpha.ThreeDS2Service);
        }
        int i2 = 32 / 0;
        return removeParam(setTransitionAlpha.ThreeDS2Service);
    }

    public get setDarkBorderColor() {
        int i = configureScheme + 111;
        apiKey = i % 128;
        if (i % 2 != 0) {
            build(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get build = build(setTransitionAlpha.ThreeDS2Service);
        int i2 = apiKey + 3;
        configureScheme = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return build;
    }

    public get setDarkTextColor() {
        int i = configureScheme + 103;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return configureScheme(setTransitionAlpha.ThreeDS2Service);
        }
        int i2 = 52 / 0;
        return configureScheme(setTransitionAlpha.ThreeDS2Service);
    }

    public get setFadingEdgeLength() {
        int i = apiKey + 69;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getSchemeId(setBottom.ThreeDS2ServiceInstance);
        }
        getSchemeId(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    public get setHeaderText() {
        apiKey = (configureScheme + 77) % 128;
        get SchemeConfiguration = SchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        configureScheme = (apiKey + 111) % 128;
        return SchemeConfiguration;
    }

    public get setHeadingDarkTextColor() {
        int i = configureScheme + 61;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return visaSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        }
        int i2 = 42 / 0;
        return visaSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
    }

    public get setHeadingTextColor() {
        getHeaderText getheadertext = new getHeaderText(this);
        apiKey = (configureScheme + 113) % 128;
        return getheadertext;
    }

    public get setHeadingTextFontName() {
        setHeaderText setheadertext = new setHeaderText(this);
        configureScheme = (apiKey + 53) % 128;
        return setheadertext;
    }

    public get setHeadingTextFontSize() {
        int i = apiKey + 117;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return (get) ThreeDS2Service(new Object[]{this, setBottom.ThreeDS2ServiceInstance}, -111448831, 111448882, System.identityHashCode(this));
        }
        int i2 = 61 / 0;
        return (get) ThreeDS2Service(new Object[]{this, setBottom.ThreeDS2ServiceInstance}, -111448831, 111448882, System.identityHashCode(this));
    }

    public get setHorizontalScrollbarTrackDrawable() {
        configureScheme = (apiKey + 83) % 128;
        setOnKeyListener setonkeylistener = setOnKeyListener.ThreeDS2Service;
        apiKey = (configureScheme + 69) % 128;
        return setonkeylistener;
    }

    public get setLabelCustomization() {
        apiKey = (configureScheme + 7) % 128;
        get jcbConfiguration = jcbConfiguration(setTransitionAlpha.ThreeDS2Service);
        apiKey = (configureScheme + 89) % 128;
        return jcbConfiguration;
    }

    public get setOnScrollChangeListener() {
        int i = apiKey + 105;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setOnDragListener setondraglistener = setOnDragListener.get;
            throw null;
        }
        setOnDragListener setondraglistener2 = setOnDragListener.get;
        apiKey = (configureScheme + 73) % 128;
        return setondraglistener2;
    }

    public get setParameter() {
        apiKey = (configureScheme + 17) % 128;
        onOptionsItemSelected onoptionsitemselected = onOptionsItemSelected.initialize;
        int i = configureScheme + 7;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return onoptionsitemselected;
        }
        throw null;
    }

    public get setPendingCredentialRequest() {
        int i = apiKey + 89;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getSchemeId(setTransitionAlpha.ThreeDS2Service);
        }
        getSchemeId(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    public get setProgressViewBackgroundColor() {
        getPublicKey getpublickey = new getPublicKey(this);
        apiKey = (configureScheme + 27) % 128;
        return getpublickey;
    }

    public get setScrollIndicators() {
        apiKey = (configureScheme + 73) % 128;
        setOnCreateContextMenuListener setoncreatecontextmenulistener = setOnCreateContextMenuListener.get;
        int i = configureScheme + 51;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setoncreatecontextmenulistener;
        }
        throw null;
    }

    public get setTextBoxCustomization() {
        getDarkModeSupported getdarkmodesupported = new getDarkModeSupported(this);
        apiKey = (configureScheme + 55) % 128;
        return getdarkmodesupported;
    }

    public get setTextColor() {
        int i = apiKey + 7;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return apiKey(setBottom.ThreeDS2ServiceInstance);
        }
        apiKey(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    public get setTextFontName() {
        int i = configureScheme + 39;
        apiKey = i % 128;
        if (i % 2 != 0) {
            restrictedParameters(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get restrictedParameters2 = restrictedParameters(setTransitionAlpha.ThreeDS2Service);
        int i2 = configureScheme + 125;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return restrictedParameters2;
        }
        throw null;
    }

    public get setTextFontSize() {
        setDarkBorderColor setdarkbordercolor = new setDarkBorderColor(this);
        int i = configureScheme + 63;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setdarkbordercolor;
        }
        throw null;
    }

    public get setToolbarCustomization() {
        configureScheme = (apiKey + 111) % 128;
        get dinersSchemeConfiguration = dinersSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return dinersSchemeConfiguration;
        }
        throw null;
    }

    public get setVerticalScrollbarPosition() {
        int i = configureScheme + 23;
        apiKey = i % 128;
        if (i % 2 != 0) {
            newSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
            throw null;
        }
        get newSchemeConfiguration = newSchemeConfiguration(setBottom.ThreeDS2ServiceInstance);
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return newSchemeConfiguration;
    }

    public get setVerticalScrollbarThumbDrawable() {
        int i = apiKey + 61;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            newSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get newSchemeConfiguration = newSchemeConfiguration(setTransitionAlpha.ThreeDS2Service);
        configureScheme = (apiKey + 113) % 128;
        return newSchemeConfiguration;
    }

    public get setVerticalScrollbarTrackDrawable() {
        int i = configureScheme + 121;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return eftposConfiguration(setBottom.ThreeDS2ServiceInstance);
        }
        eftposConfiguration(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    public get setViewCustomization() {
        int i = apiKey + 57;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return jcbConfiguration(setBottom.ThreeDS2ServiceInstance);
        }
        int i2 = 96 / 0;
        return jcbConfiguration(setBottom.ThreeDS2ServiceInstance);
    }

    public get showProgress() {
        int i = configureScheme + 63;
        apiKey = i % 128;
        if (i % 2 != 0) {
            onError(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get onError = onError(setTransitionAlpha.ThreeDS2Service);
        int i2 = apiKey + 33;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return onError;
        }
        throw null;
    }

    public get supportDarkMode() {
        getService getservice = new getService(this);
        apiKey = (configureScheme + 81) % 128;
        return getservice;
    }

    public get unregisterForContextMenu() {
        setOnClickListener setonclicklistener = new setOnClickListener(this);
        int i = configureScheme + 73;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setonclicklistener;
        }
        throw null;
    }

    public get useBridgingExtension() {
        int i = apiKey + 55;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            get(setTransitionAlpha.ThreeDS2Service);
            throw null;
        }
        get getVar = get(setTransitionAlpha.ThreeDS2Service);
        int i2 = configureScheme + 83;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            return getVar;
        }
        throw null;
    }

    public get Transaction() {
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setForceDarkAllowed.ThreeDS2Service;
        }
        setForceDarkAllowed setforcedarkallowed = setForceDarkAllowed.ThreeDS2Service;
        throw null;
    }

    public get getMessage() {
        apiKey = (configureScheme + 31) % 128;
        setRotation setrotation = setRotation.ThreeDS2Service;
        configureScheme = (apiKey + 107) % 128;
        return setrotation;
    }

    public get getSeverity() {
        setScrollY setscrolly = new setScrollY(this);
        configureScheme = (apiKey + 89) % 128;
        return setscrolly;
    }

    public get ChallengeParameters() {
        setY sety = new setY(this);
        int i = apiKey + 115;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return sety;
        }
        throw null;
    }

    public get getAcsSignedContent() {
        setOutlineSpotShadowColor setoutlinespotshadowcolor = new setOutlineSpotShadowColor(this);
        int i = apiKey + 33;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setoutlinespotshadowcolor;
        }
        throw null;
    }

    public get getId() {
        configureScheme = (apiKey + 95) % 128;
        setCameraDistance setcameradistance = setCameraDistance.getWarnings;
        apiKey = (configureScheme + 99) % 128;
        return setcameradistance;
    }

    public static /* synthetic */ ButtonCustomization getAcsTransactionID(getCornerRadius getcornerradius) {
        int i = configureScheme + 43;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setTranslationY();
        }
        getcornerradius.setTranslationY();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getIds(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        ButtonCustomization x = getcornerradius.setX();
        int i = apiKey + 73;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return x;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSDKAppID(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 15) % 128;
        ButtonCustomization isCredential = getcornerradius.setIsCredential();
        configureScheme = (apiKey + 103) % 128;
        return isCredential;
    }

    public static /* synthetic */ ButtonCustomization getSDKReferenceNumber(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 103) % 128;
        ButtonCustomization drawingCacheBackgroundColor = getcornerradius.setDrawingCacheBackgroundColor();
        configureScheme = (apiKey + 79) % 128;
        return drawingCacheBackgroundColor;
    }

    private get newSchemeConfiguration(initialize<String> initializeVar) {
        setOnContextClickListener setoncontextclicklistener = new setOnContextClickListener(this, initializeVar);
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setoncontextclicklistener;
        }
        throw null;
    }

    public get getAcsRefNumber() {
        setElevation setelevation = new setElevation(this);
        configureScheme = (apiKey + 103) % 128;
        return setelevation;
    }

    public get getThreeDSRequestorAppURL() {
        setClipToOutline setcliptooutline = new setClipToOutline(this);
        configureScheme = (apiKey + 101) % 128;
        return setcliptooutline;
    }

    public get newSchemeConfiguration() {
        setHandwritingDelegatorCallback sethandwritingdelegatorcallback = new setHandwritingDelegatorCallback(this);
        int i = apiKey + 53;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
        return sethandwritingdelegatorcallback;
    }

    public static /* synthetic */ ButtonCustomization newSchemeConfiguration(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 25) % 128;
        ButtonCustomization saveEnabled = getcornerradius.setSaveEnabled();
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return saveEnabled;
        }
        throw null;
    }

    public get getCertPrefix() {
        setClickable setclickable = new setClickable(this);
        int i = apiKey + 59;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setclickable;
        }
        throw null;
    }

    private get amexConfiguration(initialize<String> initializeVar) {
        supportDarkMode supportdarkmode = new supportDarkMode(this, initializeVar);
        int i = configureScheme + 37;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return supportdarkmode;
        }
        throw null;
    }

    private static /* synthetic */ Object createTransaction(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 83) % 128;
        return ButtonCustomization.initialize(getcornerradius.createTransaction.isVoiceCapable());
    }

    public get Severity() {
        configureScheme = (apiKey + 109) % 128;
        setTransitionVisibility settransitionvisibility = setTransitionVisibility.getWarnings;
        apiKey = (configureScheme + 51) % 128;
        return settransitionvisibility;
    }

    public get getEncryptionCertificate() {
        int i = apiKey + 23;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setTouchDelegate.initialize;
        }
        setTouchDelegate settouchdelegate = setTouchDelegate.initialize;
        throw null;
    }

    public get set3DSServerTransactionID() {
        int i = configureScheme + 119;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getWarnings(setBottom.ThreeDS2ServiceInstance);
        }
        getWarnings(setBottom.ThreeDS2ServiceInstance);
        throw null;
    }

    private get addParam(initialize<String> initializeVar) {
        getHeadingTextColor getheadingtextcolor = new getHeadingTextColor(this, initializeVar);
        apiKey = (configureScheme + 21) % 128;
        return getheadingtextcolor;
    }

    private static /* synthetic */ Object amexConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 93;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setPreferKeepClear();
        }
        getcornerradius.setPreferKeepClear();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization completed(getCornerRadius getcornerradius) {
        int i = configureScheme + 13;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization longClickable = getcornerradius.setLongClickable();
        if (i2 != 0) {
            int i3 = 29 / 0;
        }
        return longClickable;
    }

    public static /* synthetic */ ButtonCustomization amexConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        configureScheme = (apiKey + 9) % 128;
        ButtonCustomization expiryDate = getcornerradius.getExpiryDate(initializeVar);
        int i = apiKey + 103;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return expiryDate;
        }
        throw null;
    }

    private get apiKey(initialize<String> initializeVar) {
        ToolbarCustomization toolbarCustomization = new ToolbarCustomization(this, initializeVar);
        apiKey = (configureScheme + 5) % 128;
        return toolbarCustomization;
    }

    private get createTransaction(initialize<String> initializeVar) {
        setTextFontName settextfontname = new setTextFontName(this, initializeVar);
        apiKey = (configureScheme + 107) % 128;
        return settextfontname;
    }

    public get addParam() {
        openContextMenu opencontextmenu = new openContextMenu(this);
        int i = apiKey + 9;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
        }
        return opencontextmenu;
    }

    public static /* synthetic */ ButtonCustomization addParam(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 9) % 128;
        ButtonCustomization values = getcornerradius.values(initializeVar);
        apiKey = (configureScheme + 27) % 128;
        return values;
    }

    public get amexConfiguration() {
        setScrollContainer setscrollcontainer = new setScrollContainer(this);
        configureScheme = (apiKey + 15) % 128;
        return setscrollcontainer;
    }

    public get apiKey() {
        setAccessibilityDelegate setaccessibilitydelegate = new setAccessibilityDelegate(this);
        apiKey = (configureScheme + 97) % 128;
        return setaccessibilitydelegate;
    }

    public get createTransaction() {
        configureScheme = (apiKey + 5) % 128;
        setScreenReaderFocusable setscreenreaderfocusable = setScreenReaderFocusable.get;
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setscreenreaderfocusable;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization addParam(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 17) % 128;
        ButtonCustomization touchscreenBlocksFocus = getcornerradius.setTouchscreenBlocksFocus();
        apiKey = (configureScheme + 9) % 128;
        return touchscreenBlocksFocus;
    }

    public static /* synthetic */ ButtonCustomization setAcsRefNumber(getCornerRadius getcornerradius) {
        int i = apiKey + 109;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setActivated();
        }
        getcornerradius.setActivated();
        throw null;
    }

    private static /* synthetic */ ButtonCustomization ThreeDS2ServiceInitializationCallback(String str) {
        configureScheme = (apiKey + 29) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(str);
        int i = configureScheme + 73;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }

    private get cbConfiguration(initialize<Boolean> initializeVar) {
        setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = new setHorizontalScrollbarTrackDrawable(this, initializeVar);
        configureScheme = (apiKey + 113) % 128;
        return sethorizontalscrollbartrackdrawable;
    }

    public get TransactionBridgingMessageExtensionVersion() {
        setTranslationX settranslationx = new setTranslationX(this);
        apiKey = (configureScheme + 41) % 128;
        return settranslationx;
    }

    public get cancelled() {
        apiKey = (configureScheme + 49) % 128;
        get ThreeDS2ServiceInitializationCallback = ThreeDS2ServiceInitializationCallback(setTransitionAlpha.ThreeDS2Service);
        int i = apiKey + 125;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInitializationCallback;
        }
        throw null;
    }

    public get getProgressView() {
        apiKey = (configureScheme + 77) % 128;
        get ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(setTransitionAlpha.ThreeDS2Service);
        configureScheme = (apiKey + 31) % 128;
        return ThreeDS2ServiceInstance;
    }

    public get setThreeDSRequestorAppURL() {
        int i = apiKey + 109;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getSDKInfo(setTransitionAlpha.ThreeDS2Service);
        }
        int i2 = 45 / 0;
        return getSDKInfo(setTransitionAlpha.ThreeDS2Service);
    }

    public get timedout() {
        Customization customization = new Customization(this);
        configureScheme = (apiKey + 87) % 128;
        return customization;
    }

    private get ThreeDS2ServiceInitializationCallback(initialize<String> initializeVar) {
        setDarkBackgroundColor setdarkbackgroundcolor = new setDarkBackgroundColor(this, initializeVar);
        configureScheme = (apiKey + 73) % 128;
        return setdarkbackgroundcolor;
    }

    private static /* synthetic */ Object cbConfiguration(Object[] objArr) {
        String str = (String) objArr[0];
        int i = apiKey + 29;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization initialize2 = initialize(str);
        if (i2 == 0) {
            int i3 = 41 / 0;
        }
        return initialize2;
    }

    public static /* synthetic */ ButtonCustomization getSDKEphemeralPublicKey(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 85) % 128;
        ButtonCustomization clipChildren = getcornerradius.setClipChildren();
        int i = apiKey + 53;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
        return clipChildren;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInitializationCallback(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 43;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization pivotX = getcornerradius.setPivotX();
        if (i2 != 0) {
            int i3 = 49 / 0;
        }
        return pivotX;
    }

    public static /* synthetic */ ButtonCustomization cbConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 125) % 128;
        ButtonCustomization SchemeInfo = getcornerradius.SchemeInfo(initializeVar);
        configureScheme = (apiKey + 15) % 128;
        return SchemeInfo;
    }

    private get configureScheme(initialize<String> initializeVar) {
        getDarkBorderColor getdarkbordercolor = new getDarkBorderColor(this, initializeVar);
        int i = apiKey + 79;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getdarkbordercolor;
        }
        throw null;
    }

    private get removeParam(initialize<String> initializeVar) {
        setHeadingDarkTextColor setheadingdarktextcolor = new setHeadingDarkTextColor(this, initializeVar);
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setheadingdarktextcolor;
        }
        throw null;
    }

    public get get3DSServerTransactionID() {
        setOutlineProvider setoutlineprovider = new setOutlineProvider(this);
        configureScheme = (apiKey + 107) % 128;
        return setoutlineprovider;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2ServiceInitializationCallback(getCornerRadius getcornerradius, initialize initializeVar) {
        configureScheme = (apiKey + 35) % 128;
        ButtonCustomization schemeName = getcornerradius.getSchemeName(initializeVar);
        apiKey = (configureScheme + 53) % 128;
        return schemeName;
    }

    private static /* synthetic */ Object configureScheme(Object[] objArr) {
        int i = apiKey + 17;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ButtonCustomization.getWarnings(Settings.System.DEFAULT_RINGTONE_URI.getPath());
        }
        ButtonCustomization.getWarnings(Settings.System.DEFAULT_RINGTONE_URI.getPath());
        throw null;
    }

    private get getSDKInfo(initialize<String> initializeVar) {
        setTranslationZ settranslationz = new setTranslationZ(this, initializeVar);
        configureScheme = (apiKey + 117) % 128;
        return settranslationz;
    }

    private static /* synthetic */ Object removeParam(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 113;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization backgroundTintList = getcornerradius.setBackgroundTintList();
        if (i2 != 0) {
            int i3 = 52 / 0;
        }
        return backgroundTintList;
    }

    public get cbConfiguration() {
        setNextFocusForwardId setnextfocusforwardid = new setNextFocusForwardId(this);
        apiKey = (configureScheme + 111) % 128;
        return setnextfocusforwardid;
    }

    public get getSchemeConfigurations() {
        configureScheme = (apiKey + 17) % 128;
        setAccessibilityHeading setaccessibilityheading = setAccessibilityHeading.getWarnings;
        configureScheme = (apiKey + 33) % 128;
        return setaccessibilityheading;
    }

    public static /* synthetic */ ButtonCustomization configureScheme(getCornerRadius getcornerradius, initialize initializeVar) {
        configureScheme = (apiKey + 71) % 128;
        ButtonCustomization schemeLogo = getcornerradius.getSchemeLogo(initializeVar);
        int i = apiKey + 57;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
        return schemeLogo;
    }

    public static /* synthetic */ ButtonCustomization doChallenge(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 9) % 128;
        ButtonCustomization cameraDistance = getcornerradius.setCameraDistance();
        int i = configureScheme + 41;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return cameraDistance;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization useBridgingExtension(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 59) % 128;
        ButtonCustomization rotation = getcornerradius.setRotation();
        apiKey = (configureScheme + 33) % 128;
        return rotation;
    }

    public get ThreeDS2ServiceInitializationCallback() {
        setX setx = new setX(this);
        int i = apiKey + 39;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
        return setx;
    }

    public get getSDKInfo() {
        setRotationX setrotationx = new setRotationX(this);
        int i = configureScheme + 75;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setrotationx;
        }
        throw null;
    }

    public get removeParam() {
        setImportantForContentCapture setimportantforcontentcapture = new setImportantForContentCapture(this);
        apiKey = (configureScheme + 67) % 128;
        return setimportantforcontentcapture;
    }

    public static /* synthetic */ ButtonCustomization getSDKInfo(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 109;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.CertificateInfoCertificateType(initializeVar);
        }
        getcornerradius.CertificateInfoCertificateType(initializeVar);
        throw null;
    }

    public get configureScheme() {
        setContentCaptureSession setcontentcapturesession = new setContentCaptureSession(this);
        int i = configureScheme + 87;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setcontentcapturesession;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSDKInfo(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 57) % 128;
        ButtonCustomization drawingCacheEnabled = getcornerradius.setDrawingCacheEnabled();
        int i = apiKey + 37;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return drawingCacheEnabled;
        }
        throw null;
    }

    private get unionSchemeConfiguration(initialize<String> initializeVar) {
        setChallengeViewBackgroundColor setchallengeviewbackgroundcolor = new setChallengeViewBackgroundColor(this, initializeVar);
        int i = configureScheme + 7;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setchallengeviewbackgroundcolor;
        }
        throw null;
    }

    public get unionSchemeConfiguration() {
        setNextFocusUpId setnextfocusupid = new setNextFocusUpId(this);
        configureScheme = (apiKey + 17) % 128;
        return setnextfocusupid;
    }

    private get onCompleted(initialize<String> initializeVar) {
        LabelCustomization labelCustomization = new LabelCustomization(this, initializeVar);
        apiKey = (configureScheme + 89) % 128;
        return labelCustomization;
    }

    public static /* synthetic */ ButtonCustomization unionSchemeConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 33) % 128;
        ButtonCustomization schemeEncryptionPublicKeyId = getcornerradius.getSchemeEncryptionPublicKeyId(initializeVar);
        int i = configureScheme + 95;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return schemeEncryptionPublicKeyId;
        }
        throw null;
    }

    public get getAuthenticationRequestParameters() {
        setTop settop;
        int i = apiKey + 41;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            settop = setTop.initialize;
            int i2 = 66 / 0;
        } else {
            settop = setTop.initialize;
        }
        configureScheme = (apiKey + 51) % 128;
        return settop;
    }

    public get getEncryptionCertificateKid() {
        apiKey = (configureScheme + 69) % 128;
        setImportantForAccessibility setimportantforaccessibility = setImportantForAccessibility.get;
        configureScheme = (apiKey + 93) % 128;
        return setimportantforaccessibility;
    }

    public get setAcsTransactionID() {
        int i = apiKey + 59;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getWarnings(setTransitionAlpha.ThreeDS2Service);
        }
        getWarnings(setTransitionAlpha.ThreeDS2Service);
        throw null;
    }

    private get eftposConfiguration(initialize<String> initializeVar) {
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener(this, initializeVar);
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setonlongclicklistener;
        }
        throw null;
    }

    private static /* synthetic */ Object onCompleted(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 107;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setPaddingRelative();
        }
        getcornerradius.setPaddingRelative();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization unionSchemeConfiguration(getCornerRadius getcornerradius) {
        int i = apiKey + 95;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization transitionName = getcornerradius.setTransitionName();
        if (i2 == 0) {
            int i3 = 32 / 0;
        }
        return transitionName;
    }

    private static /* synthetic */ Object eftposConfiguration(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 77) % 128;
        ButtonCustomization tooltipText = getcornerradius.setTooltipText();
        int i = apiKey + 125;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return tooltipText;
        }
        throw null;
    }

    private get getParamValue(initialize<String> initializeVar) {
        getHeadingDarkTextColor getheadingdarktextcolor = new getHeadingDarkTextColor(this, initializeVar);
        apiKey = (configureScheme + 103) % 128;
        return getheadingdarktextcolor;
    }

    public static /* synthetic */ ButtonCustomization onCompleted(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 79;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization schemeLogoDark = getcornerradius.getSchemeLogoDark(initializeVar);
        if (i2 != 0) {
            int i3 = 11 / 0;
        }
        return schemeLogoDark;
    }

    public get eftposConfiguration() {
        setNextFocusLeftId setnextfocusleftid = new setNextFocusLeftId(this);
        configureScheme = (apiKey + 27) % 128;
        return setnextfocusleftid;
    }

    public get getParamValue() {
        setButtonText setbuttontext = new setButtonText(this);
        apiKey = (configureScheme + 81) % 128;
        return setbuttontext;
    }

    public get onCompleted() {
        setDarkTextColor setdarktextcolor = new setDarkTextColor(this);
        configureScheme = (apiKey + 107) % 128;
        return setdarktextcolor;
    }

    private static /* synthetic */ Object SDKNotInitializedException(Object[] objArr) {
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        int i = apiKey + 57;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
        return ThreeDS2ServiceInstance;
    }

    public get onError() {
        TextBoxCustomization textBoxCustomization = new TextBoxCustomization(this);
        configureScheme = (apiKey + 73) % 128;
        return textBoxCustomization;
    }

    private get getSchemeId(initialize<String> initializeVar) {
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(this, initializeVar);
        configureScheme = (apiKey + 103) % 128;
        return setonfocuschangelistener;
    }

    private get onError(initialize<String> initializeVar) {
        getHeadingTextFontSize getheadingtextfontsize = new getHeadingTextFontSize(this, initializeVar);
        configureScheme = (apiKey + 59) % 128;
        return getheadingtextfontsize;
    }

    private get dinersSchemeConfiguration(initialize<String> initializeVar) {
        ViewCustomization viewCustomization = new ViewCustomization(this, initializeVar);
        configureScheme = (apiKey + 29) % 128;
        return viewCustomization;
    }

    private get jcbConfiguration(initialize<String> initializeVar) {
        DsRidValues dsRidValues = new DsRidValues(this, initializeVar);
        int i = configureScheme + 33;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
        return dsRidValues;
    }

    public static /* synthetic */ ButtonCustomization onError(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 15;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.getSchemeEncryptionPublicKey(initializeVar);
            throw null;
        }
        ButtonCustomization schemeEncryptionPublicKey = getcornerradius.getSchemeEncryptionPublicKey(initializeVar);
        configureScheme = (apiKey + 95) % 128;
        return schemeEncryptionPublicKey;
    }

    private static /* synthetic */ Object restrictedParameters(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        apiKey = (configureScheme + 73) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(getcornerradius.createTransaction.getNetworkOperator());
        int i = apiKey + 1;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    public get getSchemeId() {
        setNextClusterForwardId setnextclusterforwardid = new setNextClusterForwardId(this);
        int i = apiKey + 73;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setnextclusterforwardid;
        }
        throw null;
    }

    public get getValue() {
        configureScheme = (apiKey + 111) % 128;
        get ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(setBottom.ThreeDS2ServiceInstance);
        configureScheme = (apiKey + 29) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization SDKNotInitializedException(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 51) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1329025475, 1329025479, System.identityHashCode(getcornerradius));
        apiKey = (configureScheme + 91) % 128;
        return buttonCustomization;
    }

    private static /* synthetic */ Object dinersSchemeConfiguration(Object[] objArr) {
        ButtonCustomization verticalFadingEdgeEnabled;
        int i = apiKey + 27;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            verticalFadingEdgeEnabled = setVerticalFadingEdgeEnabled();
            int i2 = 84 / 0;
        } else {
            verticalFadingEdgeEnabled = setVerticalFadingEdgeEnabled();
        }
        int i3 = configureScheme + 65;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return verticalFadingEdgeEnabled;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSchemeId(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 41) % 128;
        ButtonCustomization z = getcornerradius.setZ();
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return z;
    }

    public static /* synthetic */ ButtonCustomization onError(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 97) % 128;
        ButtonCustomization backgroundDrawable = getcornerradius.setBackgroundDrawable();
        configureScheme = (apiKey + 67) % 128;
        return backgroundDrawable;
    }

    private get restrictedParameters(initialize<String> initializeVar) {
        getButtonText getbuttontext = new getButtonText(this, initializeVar);
        int i = configureScheme + 51;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
        return getbuttontext;
    }

    public get jcbConfiguration() {
        setKeepScreenOn setkeepscreenon = new setKeepScreenOn(this);
        int i = configureScheme + 55;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setkeepscreenon;
        }
        throw null;
    }

    private get getSDKVersion(initialize<String> initializeVar) {
        setTranslationY settranslationy = new setTranslationY(this, initializeVar);
        int i = apiKey + 27;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return settranslationy;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization jcbConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 71) % 128;
        ButtonCustomization encryptionPublicKeyFromAssetCertificate = getcornerradius.encryptionPublicKeyFromAssetCertificate(initializeVar);
        apiKey = (configureScheme + 95) % 128;
        return encryptionPublicKeyFromAssetCertificate;
    }

    public get dinersSchemeConfiguration() {
        setNextFocusRightId setnextfocusrightid = new setNextFocusRightId(this);
        int i = apiKey + 121;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setnextfocusrightid;
        }
        throw null;
    }

    public get restrictedParameters() {
        setContentSensitivity setcontentsensitivity = new setContentSensitivity(this);
        int i = apiKey + 25;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setcontentsensitivity;
        }
        throw null;
    }

    private static /* synthetic */ Object ConfigurationBuilder(Object[] objArr) {
        ButtonCustomization clipToOutline;
        int i = configureScheme + 109;
        apiKey = i % 128;
        if (i % 2 != 0) {
            clipToOutline = setClipToOutline();
            int i2 = 63 / 0;
        } else {
            clipToOutline = setClipToOutline();
        }
        configureScheme = (apiKey + 7) % 128;
        return clipToOutline;
    }

    public static /* synthetic */ ButtonCustomization dinersSchemeConfiguration(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 51) % 128;
        ButtonCustomization nestedScrollingEnabled = getcornerradius.setNestedScrollingEnabled();
        apiKey = (configureScheme + 23) % 128;
        return nestedScrollingEnabled;
    }

    public static /* synthetic */ ButtonCustomization jcbConfiguration(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 57) % 128;
        ButtonCustomization backgroundTintMode = getcornerradius.setBackgroundTintMode();
        int i = apiKey + 63;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
        return backgroundTintMode;
    }

    public static /* synthetic */ ButtonCustomization restrictedParameters(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 45) % 128;
        ButtonCustomization requestedFrameRate = getcornerradius.setRequestedFrameRate();
        apiKey = (configureScheme + 97) % 128;
        return requestedFrameRate;
    }

    public get getSDKVersion() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor(this);
        int i = apiKey + 113;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getbackgroundcolor;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSDKVersion(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 79;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.getType(initializeVar);
            throw null;
        }
        ButtonCustomization type2 = getcornerradius.getType(initializeVar);
        configureScheme = (apiKey + 67) % 128;
        return type2;
    }

    public get ConfigurationBuilder() {
        setOnGenericMotionListener setongenericmotionlistener = new setOnGenericMotionListener(this);
        int i = configureScheme + 107;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
        return setongenericmotionlistener;
    }

    public get ids() {
        setSystemGestureExclusionRects setsystemgestureexclusionrects = new setSystemGestureExclusionRects(this);
        int i = apiKey + 21;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
        return setsystemgestureexclusionrects;
    }

    public static /* synthetic */ ButtonCustomization ConfigurationBuilder(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 121) % 128;
        ButtonCustomization clipBounds = getcornerradius.setClipBounds();
        apiKey = (configureScheme + 25) % 128;
        return clipBounds;
    }

    public static /* synthetic */ ButtonCustomization getSDKVersion(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 15) % 128;
        ButtonCustomization transitionAlpha = getcornerradius.setTransitionAlpha();
        int i = configureScheme + 51;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
        return transitionAlpha;
    }

    private static /* synthetic */ Object ids(Object[] objArr) {
        int i = configureScheme + 85;
        apiKey = i % 128;
        if (i % 2 != 0) {
            ButtonCustomization.getWarnings(Build.VERSION.RELEASE);
            throw null;
        }
        ButtonCustomization warnings = ButtonCustomization.getWarnings(Build.VERSION.RELEASE);
        apiKey = (configureScheme + 47) % 128;
        return warnings;
    }

    public static /* synthetic */ ButtonCustomization ids(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 125) % 128;
        ButtonCustomization motionEventSplittingEnabled = getcornerradius.setMotionEventSplittingEnabled();
        int i = configureScheme + 71;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return motionEventSplittingEnabled;
        }
        throw null;
    }

    public get getDeviceData() {
        configureScheme = (apiKey + 57) % 128;
        setPivotX setpivotx = setPivotX.ThreeDS2Service;
        configureScheme = (apiKey + 87) % 128;
        return setpivotx;
    }

    public get ConfigParameters() {
        UiCustomizationButtonType uiCustomizationButtonType = new UiCustomizationButtonType(this);
        apiKey = (configureScheme + 51) % 128;
        return uiCustomizationButtonType;
    }

    public get build() {
        setContentDescription setcontentdescription = new setContentDescription(this);
        configureScheme = (apiKey + 109) % 128;
        return setcontentdescription;
    }

    private get ConfigParameters(initialize<String> initializeVar) {
        setBorderWidth setborderwidth = new setBorderWidth(this, initializeVar);
        int i = configureScheme + 117;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setborderwidth;
        }
        throw null;
    }

    private get build(initialize<String> initializeVar) {
        getLabelCustomization getlabelcustomization = new getLabelCustomization(this, initializeVar);
        configureScheme = (apiKey + 111) % 128;
        return getlabelcustomization;
    }

    public static /* synthetic */ ButtonCustomization ConfigParameters(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 51;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.SDKInfo(initializeVar);
        }
        getcornerradius.SDKInfo(initializeVar);
        throw null;
    }

    public static /* synthetic */ ButtonCustomization build(getCornerRadius getcornerradius, initialize initializeVar) {
        configureScheme = (apiKey + 125) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius, initializeVar}, -927475853, 927475891, System.identityHashCode(getcornerradius));
        int i = apiKey + 21;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        if (getcornerradius.onCompleted.ThreeDS2ServiceInstance(setTranscriptMode.cleanup)) {
            int i = apiKey + 9;
            configureScheme = i % 128;
            if (i % 2 != 0) {
                ButtonCustomization ThreeDS2Service = ButtonCustomization.ThreeDS2Service();
                configureScheme = (apiKey + 39) % 128;
                return ThreeDS2Service;
            }
            ButtonCustomization.ThreeDS2Service();
            throw null;
        }
        return ButtonCustomization.getWarnings(getcornerradius.createTransaction.getVoiceMailAlphaTag());
    }

    public static /* synthetic */ ButtonCustomization ConfigParameters(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 99) % 128;
        ButtonCustomization fitsSystemWindows = getcornerradius.setFitsSystemWindows();
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
        return fitsSystemWindows;
    }

    private get ThreeDS2ServiceInstance(initialize<String> initializeVar) {
        setRight setright = new setRight(this, initializeVar);
        apiKey = (configureScheme + 107) % 128;
        return setright;
    }

    public get getName() {
        setLayoutDirection setlayoutdirection = new setLayoutDirection(this);
        configureScheme = (apiKey + 5) % 128;
        return setlayoutdirection;
    }

    public get getSchemeLogo() {
        setNextFocusDownId setnextfocusdownid = new setNextFocusDownId(this);
        int i = configureScheme + 31;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setnextfocusdownid;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getName(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        ButtonCustomization minimumWidth = getcornerradius.setMinimumWidth();
        apiKey = (configureScheme + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return minimumWidth;
    }

    private /* synthetic */ ButtonCustomization getSchemeLogo(initialize initializeVar) {
        apiKey = (configureScheme + 41) % 128;
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = this.addParam;
        Object[] objArr = new Object[1];
        a(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 107 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (43500 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr);
        return initializeVar.initialize(sethorizontalfadingedgeenabled.ThreeDS2Service(((String) objArr[0]).intern()));
    }

    public get ThreeDS2ServiceInstance() {
        apiKey = (configureScheme + 103) % 128;
        setHandwritingBoundsOffsets sethandwritingboundsoffsets = setHandwritingBoundsOffsets.get;
        int i = configureScheme + 105;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return sethandwritingboundsoffsets;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeEncryptionPublicKey(Object[] objArr) {
        apiKey = (configureScheme + 89) % 128;
        return ButtonCustomization.getWarnings();
    }

    public get ThreeDS2ServiceInstance(String str) {
        setOnTouchListener setontouchlistener = new setOnTouchListener(str);
        configureScheme = (apiKey + 45) % 128;
        return setontouchlistener;
    }

    public get getSchemePublicRootKeys() {
        setPreferKeepClearRects setpreferkeepclearrects = new setPreferKeepClearRects(this);
        int i = apiKey + 25;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setpreferkeepclearrects;
        }
        throw null;
    }

    public get rootPublicKey() {
        setAutofillHints setautofillhints = new setAutofillHints(this);
        int i = apiKey + 3;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 13 / 0;
        }
        return setautofillhints;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2ServiceInstance(getCornerRadius getcornerradius) {
        int i = configureScheme + 95;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1954015372, 1954015407, System.identityHashCode(getcornerradius));
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSchemeLogo(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 31;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.getSchemePublicRootKeys(initializeVar);
        }
        getcornerradius.getSchemePublicRootKeys(initializeVar);
        throw null;
    }

    private static /* synthetic */ Object getSchemePublicRootKeys(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 67) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 548730590, -548730519, System.identityHashCode(getcornerradius));
        int i = apiKey + 79;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    private static /* synthetic */ Object rootPublicKey(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 5) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -344862969, 344863036, System.identityHashCode(getcornerradius));
        int i = apiKey + 55;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public get CertificateInfo() {
        setAllowClickWhenDisabled setallowclickwhendisabled = new setAllowClickWhenDisabled(this);
        int i = apiKey + 17;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
        return setallowclickwhendisabled;
    }

    public get SchemeConfigurationBuilder() {
        setIsHandwritingDelegate setishandwritingdelegate = new setIsHandwritingDelegate(this);
        int i = configureScheme + 55;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setishandwritingdelegate;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization CertificateInfo(getCornerRadius getcornerradius) {
        int i = configureScheme + 11;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setBackgroundTintBlendMode();
            throw null;
        }
        ButtonCustomization backgroundTintBlendMode = getcornerradius.setBackgroundTintBlendMode();
        configureScheme = (apiKey + 27) % 128;
        return backgroundTintBlendMode;
    }

    private static /* synthetic */ Object SchemeConfigurationBuilder(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        setCacheColorHint.getWarnings getwarnings = (setCacheColorHint.getWarnings) objArr[1];
        int i = apiKey + 27;
        configureScheme = i % 128;
        int i2 = i % 2;
        String ThreeDS2Service = getcornerradius.get.ThreeDS2Service(getwarnings);
        if (i2 != 0) {
            return ButtonCustomization.getWarnings(ThreeDS2Service);
        }
        ButtonCustomization.getWarnings(ThreeDS2Service);
        throw null;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2ServiceInstance(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 121;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.SDKAlreadyInitializedException(initializeVar);
            throw null;
        }
        ButtonCustomization SDKAlreadyInitializedException = getcornerradius.SDKAlreadyInitializedException(initializeVar);
        configureScheme = (apiKey + 7) % 128;
        return SDKAlreadyInitializedException;
    }

    public static /* synthetic */ ButtonCustomization getSchemePublicRootKeys(getCornerRadius getcornerradius) {
        int i = apiKey + 17;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setOverScrollMode();
        }
        getcornerradius.setOverScrollMode();
        throw null;
    }

    public get getSchemeEncryptionPublicKey() {
        setPreferKeepClear setpreferkeepclear = new setPreferKeepClear(this);
        int i = configureScheme + 61;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setpreferkeepclear;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSchemeEncryptionPublicKey(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        ButtonCustomization selected = getcornerradius.setSelected();
        int i = configureScheme + 41;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return selected;
        }
        throw null;
    }

    private get getWarnings(initialize<String> initializeVar) {
        setAnimationMatrix setanimationmatrix = new setAnimationMatrix(this, initializeVar);
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setanimationmatrix;
        }
        throw null;
    }

    public get SDKInfo() {
        int i = apiKey + 105;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setKeyboardNavigationCluster.ThreeDS2Service;
        }
        setKeyboardNavigationCluster setkeyboardnavigationcluster = setKeyboardNavigationCluster.ThreeDS2Service;
        throw null;
    }

    public get SDKRuntimeException() {
        setFocusableInTouchMode setfocusableintouchmode = new setFocusableInTouchMode(this);
        int i = configureScheme + 19;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setfocusableintouchmode;
        }
        throw null;
    }

    private static /* synthetic */ Object SDKRuntimeException(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = apiKey + 65;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 1811924445, -1811924376, System.identityHashCode(getcornerradius));
        apiKey = (configureScheme + 29) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization getWarnings(Locale locale) {
        configureScheme = (apiKey + 107) % 128;
        ButtonCustomization buttonCustomization = get(locale);
        apiKey = (configureScheme + 51) % 128;
        return buttonCustomization;
    }

    public get SchemeInfo() {
        int i = apiKey + 71;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            setAccessibilityLiveRegion setaccessibilityliveregion = setAccessibilityLiveRegion.get;
            throw null;
        }
        setAccessibilityLiveRegion setaccessibilityliveregion2 = setAccessibilityLiveRegion.get;
        int i2 = apiKey + 35;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return setaccessibilityliveregion2;
        }
        throw null;
    }

    public get encryptionPublicKeyFromAssetCertificate() {
        setHandwritingDelegateFlags sethandwritingdelegateflags = new setHandwritingDelegateFlags(this);
        int i = apiKey + 65;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
        return sethandwritingdelegateflags;
    }

    public get rootPublicKeyFromAssetCertificate() {
        setSoundEffectsEnabled setsoundeffectsenabled = new setSoundEffectsEnabled(this);
        configureScheme = (apiKey + 33) % 128;
        return setsoundeffectsenabled;
    }

    public static /* synthetic */ ButtonCustomization SDKRuntimeException(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 59) % 128;
        ButtonCustomization id = getcornerradius.setId();
        configureScheme = (apiKey + 33) % 128;
        return id;
    }

    public static /* synthetic */ ButtonCustomization SchemeInfo(getCornerRadius getcornerradius) {
        int i = configureScheme + 47;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setDescendantFocusability();
        }
        getcornerradius.setDescendantFocusability();
        throw null;
    }

    private static /* synthetic */ Object encryptionPublicKeyFromAssetCertificate(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = apiKey + 37;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setTouchDelegate();
        }
        getcornerradius.setTouchDelegate();
        throw null;
    }

    private static /* synthetic */ Object rootPublicKeyFromAssetCertificate(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 15;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(getcornerradius.createTransaction.getNetworkOperatorName());
        if (i2 != 0) {
            int i3 = 84 / 0;
        }
        return warnings;
    }

    public get getWarnings() {
        int i = configureScheme + 27;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setCornerRadius.getWarnings;
        }
        setCornerRadius setcornerradius = setCornerRadius.getWarnings;
        throw null;
    }

    public static /* synthetic */ ButtonCustomization encryptionPublicKeyFromAssetCertificate(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 29) % 128;
        ButtonCustomization bottom = getcornerradius.setBottom();
        apiKey = (configureScheme + 23) % 128;
        return bottom;
    }

    public get SDKAlreadyInitializedException() {
        setFocusable setfocusable = new setFocusable(this);
        int i = configureScheme + 43;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setfocusable;
        }
        throw null;
    }

    public get getExpiryDate() {
        setSaveEnabled setsaveenabled = new setSaveEnabled(this);
        configureScheme = (apiKey + 105) % 128;
        return setsaveenabled;
    }

    private static /* synthetic */ Object SDKAlreadyInitializedException(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        configureScheme = (apiKey + 43) % 128;
        ButtonCustomization pointerIcon = getcornerradius.setPointerIcon();
        int i = apiKey + 83;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return pointerIcon;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getExpiryDate(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 77) % 128;
        ButtonCustomization scaleY = getcornerradius.setScaleY();
        int i = configureScheme + 113;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
        return scaleY;
    }

    public get values() {
        setFilterTouchesWhenObscured setfiltertoucheswhenobscured = new setFilterTouchesWhenObscured(this);
        int i = apiKey + 51;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setfiltertoucheswhenobscured;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization SDKAlreadyInitializedException(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 111) % 128;
        ButtonCustomization allowClickWhenDisabled = getcornerradius.setAllowClickWhenDisabled();
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return allowClickWhenDisabled;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization values(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 93) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -663732573, 663732581, System.identityHashCode(getcornerradius));
        configureScheme = (apiKey + 101) % 128;
        return buttonCustomization;
    }

    public get getType() {
        setContextClickable setcontextclickable = new setContextClickable(this);
        configureScheme = (apiKey + 45) % 128;
        return setcontextclickable;
    }

    public get mastercardSchemeConfiguration() {
        setAccessibilityTraversalBefore setaccessibilitytraversalbefore = new setAccessibilityTraversalBefore(this);
        int i = apiKey + 117;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setaccessibilitytraversalbefore;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getType(getCornerRadius getcornerradius) {
        int i = apiKey + 21;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization clipToPadding = getcornerradius.setClipToPadding();
        if (i2 == 0) {
            int i3 = 72 / 0;
        }
        return clipToPadding;
    }

    private get mastercardSchemeConfiguration(initialize<String> initializeVar) {
        setViewCustomization setviewcustomization = new setViewCustomization(this, initializeVar);
        apiKey = (configureScheme + 43) % 128;
        return setviewcustomization;
    }

    public static /* synthetic */ ButtonCustomization mastercardSchemeConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 93) % 128;
        ButtonCustomization logoDark = getcornerradius.logoDark(initializeVar);
        int i = apiKey + 95;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return logoDark;
        }
        throw null;
    }

    public get getSupportedProtocolVersions() {
        apiKey = (configureScheme + 63) % 128;
        setPressed setpressed = setPressed.getWarnings;
        configureScheme = (apiKey + 33) % 128;
        return setpressed;
    }

    public static /* synthetic */ ButtonCustomization getSupportedProtocolVersions(getCornerRadius getcornerradius) {
        int i = apiKey + 119;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization layoutTransition = getcornerradius.setLayoutTransition();
        if (i2 == 0) {
            int i3 = 31 / 0;
        }
        configureScheme = (apiKey + 19) % 128;
        return layoutTransition;
    }

    public static /* synthetic */ ButtonCustomization mastercardSchemeConfiguration(getCornerRadius getcornerradius) {
        int i = configureScheme + 61;
        apiKey = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -223371569, 223371630, System.identityHashCode(getcornerradius));
        apiKey = (configureScheme + 107) % 128;
        return buttonCustomization;
    }

    public get SchemeConfiguration() {
        setLabelFor setlabelfor = new setLabelFor(this);
        int i = configureScheme + 61;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setlabelfor;
        }
        throw null;
    }

    private get SchemeConfiguration(initialize<String> initializeVar) {
        getViewCustomization getviewcustomization = new getViewCustomization(this, initializeVar);
        int i = configureScheme + 75;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getviewcustomization;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization SchemeConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 119;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization supportedProtocolVersions = getcornerradius.getSupportedProtocolVersions(initializeVar);
        if (i2 != 0) {
            int i3 = 31 / 0;
        }
        return supportedProtocolVersions;
    }

    public static /* synthetic */ ButtonCustomization SchemeConfiguration(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 77) % 128;
        ButtonCustomization filterTouchesWhenObscured = getcornerradius.setFilterTouchesWhenObscured();
        int i = apiKey + 113;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return filterTouchesWhenObscured;
        }
        throw null;
    }

    private get cleanup(initialize<String> initializeVar) {
        getTextFontName gettextfontname = new getTextFontName(this, initializeVar);
        apiKey = (configureScheme + 93) % 128;
        return gettextfontname;
    }

    public get InvalidInputException() {
        configureScheme = (apiKey + 113) % 128;
        get getVar = (get) ThreeDS2Service(new Object[]{this, setHasTransientState.ThreeDS2Service}, 1222991564, -1222991530, System.identityHashCode(this));
        apiKey = (configureScheme + 79) % 128;
        return getVar;
    }

    private static /* synthetic */ Object InvalidInputException(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = apiKey + 3;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1319739345, 1319739392, System.identityHashCode(getcornerradius));
        int i2 = apiKey + 97;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public get cleanup() {
        setHovered sethovered = new setHovered(this);
        int i = configureScheme + 55;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return sethovered;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization InvalidInputException(getCornerRadius getcornerradius) {
        int i = configureScheme + 115;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setOnCapturedPointerListener();
        }
        getcornerradius.setOnCapturedPointerListener();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization cleanup(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 7;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.getErrorCode(initializeVar);
            throw null;
        }
        ButtonCustomization errorCode = getcornerradius.getErrorCode(initializeVar);
        int i2 = apiKey + 73;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return errorCode;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization cleanup(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 41) % 128;
        ButtonCustomization scaleX = getcornerradius.setScaleX();
        int i = apiKey + 71;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return scaleX;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeLogoDark(Object[] objArr) {
        UiCustomization uiCustomization = new UiCustomization((getCornerRadius) objArr[0], (initialize) objArr[1]);
        int i = apiKey + 91;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return uiCustomization;
        }
        throw null;
    }

    public get getSchemeLogoDark() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new setOnApplyWindowInsetsListener(this);
        int i = apiKey + 73;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setonapplywindowinsetslistener;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getSchemeLogoDark(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = configureScheme + 21;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.ids(initializeVar);
        }
        getcornerradius.ids(initializeVar);
        throw null;
    }

    public get CertificateInfoCertificateType() {
        configureScheme = (apiKey + 45) % 128;
        setSaveFromParentEnabled setsavefromparentenabled = setSaveFromParentEnabled.get;
        apiKey = (configureScheme + 75) % 128;
        return setsavefromparentenabled;
    }

    public static /* synthetic */ ButtonCustomization getSchemeLogoDark(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 55) % 128;
        ButtonCustomization hapticFeedbackEnabled = getcornerradius.setHapticFeedbackEnabled();
        int i = configureScheme + 85;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return hapticFeedbackEnabled;
        }
        throw null;
    }

    public get getSchemeEncryptionPublicKeyId() {
        setFitsSystemWindows setfitssystemwindows = new setFitsSystemWindows(this);
        int i = apiKey + 47;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setfitssystemwindows;
        }
        throw null;
    }

    private static /* synthetic */ Object getSchemeEncryptionPublicKeyId(Object[] objArr) {
        int i = apiKey + 97;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            ButtonCustomization.ThreeDS2ServiceInstance(Locale.getAvailableLocales().length);
            throw null;
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(Locale.getAvailableLocales().length);
        apiKey = (configureScheme + 109) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ ButtonCustomization getSchemeEncryptionPublicKeyId(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 121) % 128;
        ButtonCustomization isHandwritingDelegate = getcornerradius.setIsHandwritingDelegate();
        int i = apiKey + 45;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return isHandwritingDelegate;
        }
        throw null;
    }

    public get visaSchemeConfiguration() {
        setAccessibilityTraversalAfter setaccessibilitytraversalafter = new setAccessibilityTraversalAfter(this);
        configureScheme = (apiKey + 101) % 128;
        return setaccessibilitytraversalafter;
    }

    private get visaSchemeConfiguration(initialize<String> initializeVar) {
        setLabelCustomization setlabelcustomization = new setLabelCustomization(this, initializeVar);
        apiKey = (configureScheme + 57) % 128;
        return setlabelcustomization;
    }

    public static /* synthetic */ ButtonCustomization visaSchemeConfiguration(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 125;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.rootPublicKeyFromAssetCertificate(initializeVar);
        }
        getcornerradius.rootPublicKeyFromAssetCertificate(initializeVar);
        throw null;
    }

    public static /* synthetic */ ButtonCustomization visaSchemeConfiguration(getCornerRadius getcornerradius) {
        int i = configureScheme + 53;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization focusable = getcornerradius.setFocusable();
        if (i2 != 0) {
            int i3 = 30 / 0;
        }
        return focusable;
    }

    public get logo() {
        setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = new setAllowedHandwritingDelegatePackage(this);
        configureScheme = (apiKey + 23) % 128;
        return setallowedhandwritingdelegatepackage;
    }

    private static /* synthetic */ Object logo(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        setCacheColorHint.getWarnings getwarnings = (setCacheColorHint.getWarnings) objArr[1];
        int i = apiKey + 51;
        configureScheme = i % 128;
        Object[] objArr2 = {getcornerradius, getwarnings};
        if (i % 2 != 0) {
            return (ButtonCustomization) ThreeDS2Service(objArr2, -1376561872, 1376561928, System.identityHashCode(getcornerradius));
        }
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(objArr2, -1376561872, 1376561928, System.identityHashCode(getcornerradius));
        int i2 = 3 / 0;
        return buttonCustomization;
    }

    public get valueOf() {
        setWillNotCacheDrawing setwillnotcachedrawing = new setWillNotCacheDrawing(this);
        int i = configureScheme + 41;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setwillnotcachedrawing;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization valueOf(getCornerRadius getcornerradius) {
        int i = apiKey + 85;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return getcornerradius.setContextClickable();
        }
        getcornerradius.setContextClickable();
        throw null;
    }

    public get logoDark() {
        setVisibility setvisibility = new setVisibility(this);
        configureScheme = (apiKey + 45) % 128;
        return setvisibility;
    }

    private static /* synthetic */ Object logoDark(Object[] objArr) {
        ButtonCustomization buttonCustomization;
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = apiKey + 79;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 484492386, -484492353, System.identityHashCode(getcornerradius));
            int i2 = 72 / 0;
        } else {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 484492386, -484492353, System.identityHashCode(getcornerradius));
        }
        apiKey = (configureScheme + 119) % 128;
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization logoDark(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 41) % 128;
        ButtonCustomization buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, -1992111063, 1992111083, System.identityHashCode(getcornerradius));
        int i = apiKey + 5;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public get getErrorCode() {
        setLongClickable setlongclickable = new setLongClickable(this);
        int i = apiKey + 19;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setlongclickable;
        }
        throw null;
    }

    public static /* synthetic */ ButtonCustomization getErrorCode(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 113) % 128;
        ButtonCustomization background = getcornerradius.setBackground();
        configureScheme = (apiKey + 55) % 128;
        return background;
    }

    public get get() {
        apiKey = (configureScheme + 83) % 128;
        setStateDescription setstatedescription = setStateDescription.getWarnings;
        int i = configureScheme + 7;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return setstatedescription;
        }
        throw null;
    }

    public get get(String str) {
        setOnScrollChangeListener setonscrollchangelistener = new setOnScrollChangeListener(str);
        apiKey = (configureScheme + 5) % 128;
        return setonscrollchangelistener;
    }

    private get get(initialize<String> initializeVar) {
        setZ setz = new setZ(this, initializeVar);
        apiKey = (configureScheme + 81) % 128;
        return setz;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ButtonCustomization buttonCustomization;
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 488208277, -488208232, System.identityHashCode(getcornerradius));
            int i2 = 84 / 0;
        } else {
            buttonCustomization = (ButtonCustomization) ThreeDS2Service(new Object[]{getcornerradius}, 488208277, -488208232, System.identityHashCode(getcornerradius));
        }
        int i3 = apiKey + 77;
        configureScheme = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
        return buttonCustomization;
    }

    public static /* synthetic */ ButtonCustomization get(getCornerRadius getcornerradius) {
        int i = configureScheme + 119;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return getcornerradius.setForegroundTintList();
        }
        getcornerradius.setForegroundTintList();
        throw null;
    }

    public static /* synthetic */ ButtonCustomization get(getCornerRadius getcornerradius, initialize initializeVar) {
        apiKey = (configureScheme + 107) % 128;
        ButtonCustomization logo = getcornerradius.logo(initializeVar);
        int i = apiKey + 33;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
        return logo;
    }

    public get encryptionPublicKey() {
        setAllowedHandwritingDelegatorPackage setallowedhandwritingdelegatorpackage = new setAllowedHandwritingDelegatorPackage(this);
        configureScheme = (apiKey + 125) % 128;
        return setallowedhandwritingdelegatorpackage;
    }

    public static /* synthetic */ ButtonCustomization encryptionPublicKey(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 125) % 128;
        ButtonCustomization padding = getcornerradius.setPadding();
        configureScheme = (apiKey + 21) % 128;
        return padding;
    }

    private static /* synthetic */ Object getSchemeName(Object[] objArr) {
        List<ApplicationInfo> installedApplications;
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        if (Build.VERSION.SDK_INT < 33) {
            installedApplications = getcornerradius.initialize.getInstalledApplications(128);
            configureScheme = (apiKey + 83) % 128;
        } else {
            installedApplications = getcornerradius.initialize.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(128L));
        }
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : installedApplications) {
            configureScheme = (apiKey + 37) % 128;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(applicationInfo.packageName);
            }
        }
        ButtonCustomization ThreeDS2ServiceInstance = ButtonCustomization.ThreeDS2ServiceInstance(arrayList);
        int i = apiKey + 87;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public get getSchemeName() {
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = new setWindowInsetsAnimationCallback(this);
        configureScheme = (apiKey + 105) % 128;
        return setwindowinsetsanimationcallback;
    }

    public static /* synthetic */ ButtonCustomization getSchemeName(getCornerRadius getcornerradius) {
        apiKey = (configureScheme + 39) % 128;
        ButtonCustomization alpha = getcornerradius.setAlpha();
        int i = configureScheme + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return alpha;
        }
        throw null;
    }

    public get initialize() {
        setDrawingCacheQuality setdrawingcachequality = new setDrawingCacheQuality(this);
        int i = apiKey + 39;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return setdrawingcachequality;
        }
        throw null;
    }

    public get initialize(Locale locale) {
        setEnabled setenabled = new setEnabled(locale);
        apiKey = (configureScheme + 15) % 128;
        return setenabled;
    }

    public get initialize(setCacheColorHint.getWarnings getwarnings) {
        setParameter setparameter = new setParameter(this, getwarnings);
        configureScheme = (apiKey + 103) % 128;
        return setparameter;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        WifiInfo wifiInfo = (WifiInfo) objArr[0];
        int i = apiKey + 35;
        configureScheme = i % 128;
        int i2 = i % 2;
        int networkId = wifiInfo.getNetworkId();
        if (i2 != 0) {
            return Integer.toString(networkId);
        }
        Integer.toString(networkId);
        throw null;
    }

    private static /* synthetic */ ButtonCustomization initialize(String str) {
        configureScheme = (apiKey + 95) % 128;
        ButtonCustomization warnings = ButtonCustomization.getWarnings(str);
        int i = apiKey + 9;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
        return warnings;
    }

    public static /* synthetic */ ButtonCustomization initialize(getCornerRadius getcornerradius) {
        configureScheme = (apiKey + 9) % 128;
        ButtonCustomization transitionGroup = getcornerradius.setTransitionGroup();
        configureScheme = (apiKey + 31) % 128;
        return transitionGroup;
    }

    public get ThreeDS2Service() {
        apiKey = (configureScheme + 27) % 128;
        setBackgroundColor setbackgroundcolor = setBackgroundColor.ThreeDS2Service;
        apiKey = (configureScheme + 35) % 128;
        return setbackgroundcolor;
    }

    private get ThreeDS2Service(initialize<String> initializeVar) {
        setLeft setleft = new setLeft(this, initializeVar);
        configureScheme = (apiKey + 77) % 128;
        return setleft;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        getCornerRadius getcornerradius = (getCornerRadius) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        int i = apiKey + 63;
        configureScheme = i % 128;
        int i2 = i % 2;
        ButtonCustomization rootPublicKey = getcornerradius.rootPublicKey(initializeVar);
        if (i2 == 0) {
            int i3 = 59 / 0;
        }
        return rootPublicKey;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2Service(String str) {
        int i = configureScheme + 93;
        apiKey = i % 128;
        int i2 = i % 2;
        ButtonCustomization ThreeDS2ServiceInitializationCallback = ThreeDS2ServiceInitializationCallback(str);
        if (i2 != 0) {
            int i3 = 58 / 0;
        }
        apiKey = (configureScheme + 25) % 128;
        return ThreeDS2ServiceInitializationCallback;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2Service(getCornerRadius getcornerradius) {
        int i = configureScheme + 121;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getcornerradius.setTextAlignment();
            throw null;
        }
        ButtonCustomization textAlignment = getcornerradius.setTextAlignment();
        int i2 = configureScheme + 97;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return textAlignment;
    }

    public static /* synthetic */ ButtonCustomization ThreeDS2Service(getCornerRadius getcornerradius, initialize initializeVar) {
        int i = apiKey + 41;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            getcornerradius.getName(initializeVar);
            throw null;
        }
        ButtonCustomization name = getcornerradius.getName(initializeVar);
        int i2 = apiKey + 105;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            return name;
        }
        throw null;
    }
}
