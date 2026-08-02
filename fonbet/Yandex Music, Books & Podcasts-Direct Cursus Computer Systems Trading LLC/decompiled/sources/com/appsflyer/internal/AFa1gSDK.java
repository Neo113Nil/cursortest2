package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import defpackage.b6e;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFa1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFKeystoreWrapper;
    private static int afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static byte afLogForce;
    private static Object d;
    public static final Map e;
    private static int force;
    private static Object i;
    private static byte[] unregisterClient;
    private static long v;
    private static byte[] w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, byte b) {
        int i3;
        int i4;
        int i5 = $13;
        $12 = (i5 + 47) % 128;
        int i6 = i2 + 4;
        int i7 = s + 33;
        int i8 = 49 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            $12 = (i5 + 19) % 128;
            int i9 = i8;
            i4 = 0;
            i7 = (i7 + (-i9)) - 3;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i6];
            i7 = (i7 + (-i9)) - 3;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i8) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:7|8|(1:10)(1:992)|11|(5:12|13|14|15|16)|(39:18|19|20|21|(35:964|965|(33:960|961|(31:956|957|28|(1:30)(1:(1:946)(27:947|948|949|32|(3:34|(3:36|37|38)|43)(6:927|928|929|930|931|932)|(4:46|47|48|49)|56|57|58|59|60|61|62|63|(1:65)(1:921)|66|(1:70)(1:920)|71|72|73|(1:75)(1:918)|76|(1:78)(1:917)|79|80|(5:84|(34:86|87|88|89|(11:91|(5:141|142|143|144|145)(1:93)|94|95|96|97|98|99|100|101|103)(1:907)|147|(11:746|747|748|749|750|751|752|753|(16:755|(1:757)(2:874|(1:876)(1:(1:878)(1:879)))|758|759|760|761|762|763|764|765|766|(2:768|(2:(6:771|772|(1:774)(1:779)|775|776|777)(2:780|781)|778)(3:782|783|784))|785|786|(5:788|789|790|791|792)(4:(4:801|802|803|804)(12:(4:815|816|817|818)(12:825|826|827|828|829|830|831|832|833|834|806|807)|891|870|113|(2:115|(2:118|119)(1:117))|123|124|(1:126)(1:137)|127|128|129|130)|805|806|807)|793)|880|881)(1:149)|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|(19:176|177|178|179|(3:181|182|183)|196|197|198|199|200|201|202|(19:204|205|206|207|208|209|210|211|212|213|214|215|216|217|218|219|220|221|222)(5:674|675|676|677|678)|223|224|(35:226|227|228|(2:230|(1:232)(3:517|518|519))(1:520)|(1:234)(1:516)|235|236|237|238|239|240|(6:242|243|244|245|246|247)(1:503)|248|249|250|251|252|253|(1:(5:255|256|257|258|(1:260)(1:261))(2:472|473))|262|263|264|265|266|267|268|269|270|271|272|273|274|275|(2:277|(11:279|280|281|282|283|284|285|286|287|288|289)(3:414|415|416))(1:417)|290)(40:524|525|526|528|529|530|531|532|533|534|535|536|537|538|539|540|541|542|(2:543|(4:545|546|547|(2:549|550)(1:551))(2:617|618))|552|553|554|555|556|557|558|559|560|561|562|563|564|565|566|567|(2:569|570)|571|572|573|(2:575|(1:577))(3:578|579|580))|291|(20:293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|(1:312)|313)(5:388|389|390|391|392)|(16:315|316|(1:318)(1:356)|319|320|321|322|323|324|325|326|327|328|329|330|331)(1:361)))(1:911)|120|121|122)|913))|31|32|(0)(0)|(4:46|47|48|49)|56|57|58|59|60|61|62|63|(0)(0)|66|(13:68|70|71|72|73|(0)(0)|76|(0)(0)|79|80|(6:82|84|(0)(0)|120|121|122)|914|915)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|23|(0)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|968|969|970|971|972|973|974|975|976|977|978|21|(0)|23|(0)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915) */
    /* JADX WARN: Can't wrap try/catch for region: R(58:6|7|8|(1:10)(1:992)|11|12|13|14|15|16|(39:18|19|20|21|(35:964|965|(33:960|961|(31:956|957|28|(1:30)(1:(1:946)(27:947|948|949|32|(3:34|(3:36|37|38)|43)(6:927|928|929|930|931|932)|(4:46|47|48|49)|56|57|58|59|60|61|62|63|(1:65)(1:921)|66|(1:70)(1:920)|71|72|73|(1:75)(1:918)|76|(1:78)(1:917)|79|80|(5:84|(34:86|87|88|89|(11:91|(5:141|142|143|144|145)(1:93)|94|95|96|97|98|99|100|101|103)(1:907)|147|(11:746|747|748|749|750|751|752|753|(16:755|(1:757)(2:874|(1:876)(1:(1:878)(1:879)))|758|759|760|761|762|763|764|765|766|(2:768|(2:(6:771|772|(1:774)(1:779)|775|776|777)(2:780|781)|778)(3:782|783|784))|785|786|(5:788|789|790|791|792)(4:(4:801|802|803|804)(12:(4:815|816|817|818)(12:825|826|827|828|829|830|831|832|833|834|806|807)|891|870|113|(2:115|(2:118|119)(1:117))|123|124|(1:126)(1:137)|127|128|129|130)|805|806|807)|793)|880|881)(1:149)|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|(19:176|177|178|179|(3:181|182|183)|196|197|198|199|200|201|202|(19:204|205|206|207|208|209|210|211|212|213|214|215|216|217|218|219|220|221|222)(5:674|675|676|677|678)|223|224|(35:226|227|228|(2:230|(1:232)(3:517|518|519))(1:520)|(1:234)(1:516)|235|236|237|238|239|240|(6:242|243|244|245|246|247)(1:503)|248|249|250|251|252|253|(1:(5:255|256|257|258|(1:260)(1:261))(2:472|473))|262|263|264|265|266|267|268|269|270|271|272|273|274|275|(2:277|(11:279|280|281|282|283|284|285|286|287|288|289)(3:414|415|416))(1:417)|290)(40:524|525|526|528|529|530|531|532|533|534|535|536|537|538|539|540|541|542|(2:543|(4:545|546|547|(2:549|550)(1:551))(2:617|618))|552|553|554|555|556|557|558|559|560|561|562|563|564|565|566|567|(2:569|570)|571|572|573|(2:575|(1:577))(3:578|579|580))|291|(20:293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|(1:312)|313)(5:388|389|390|391|392)|(16:315|316|(1:318)(1:356)|319|320|321|322|323|324|325|326|327|328|329|330|331)(1:361)))(1:911)|120|121|122)|913))|31|32|(0)(0)|(4:46|47|48|49)|56|57|58|59|60|61|62|63|(0)(0)|66|(13:68|70|71|72|73|(0)(0)|76|(0)(0)|79|80|(6:82|84|(0)(0)|120|121|122)|914|915)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|23|(0)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915)|968|969|970|971|972|973|974|975|976|977|978|21|(0)|23|(0)|25|(0)|27|28|(0)(0)|31|32|(0)(0)|(0)|56|57|58|59|60|61|62|63|(0)(0)|66|(0)|920|71|72|73|(0)(0)|76|(0)(0)|79|80|(0)|914|915) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x068e, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r7, (short) ((r7 & 144) | (r7 ^ 144)), (byte) (-r15[r32]))).getMethod($$c(r15[19], (short) 304, r15[415(0x19f, float:5.82E-43)]), null).invoke(r0, null)).booleanValue() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x1c17, code lost:
    
        r5 = r68;
        r0 = r33.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.appsflyer.internal.AFa1gSDK.i = r0.newInstance(r1, java.lang.Boolean.valueOf(!r42));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1c3b, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x1c3e, code lost:
    
        r2 = r67;
        r48 = null;
        r58 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1c48, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x0623, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x0626, code lost:
    
        r36 = 843;
        r37 = 978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x0362, code lost:
    
        r31 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:984:0x0365, code lost:
    
        r31 = 2;
        r28 = 343;
        r25 = r25;
        r26 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x1e51 A[Catch: Exception -> 0x1f9c, TryCatch #31 {Exception -> 0x1f9c, blocks: (B:8:0x026d, B:10:0x0284, B:38:0x0439, B:46:0x0510, B:52:0x0560, B:54:0x0566, B:55:0x0567, B:56:0x0568, B:59:0x05ba, B:62:0x05c4, B:72:0x05fd, B:76:0x0615, B:79:0x0620, B:84:0x0634, B:113:0x1e10, B:115:0x1e51, B:119:0x1e55, B:122:0x1f4d, B:126:0x1ed5, B:127:0x1ee6, B:133:0x1f2a, B:135:0x1f30, B:136:0x1f31, B:137:0x1eee, B:927:0x0447, B:935:0x1f82, B:937:0x1f88, B:938:0x1f89, B:941:0x1f8b, B:943:0x1f91, B:944:0x1f92, B:947:0x03d7, B:952:0x1f94, B:954:0x1f9a, B:955:0x1f9b, B:129:0x1efc, B:130:0x1f28, B:49:0x0523, B:932:0x04e9, B:929:0x04af, B:949:0x03fe), top: B:7:0x026d, inners: #4, #25, #36, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1ed5 A[Catch: Exception -> 0x1f9c, TRY_ENTER, TryCatch #31 {Exception -> 0x1f9c, blocks: (B:8:0x026d, B:10:0x0284, B:38:0x0439, B:46:0x0510, B:52:0x0560, B:54:0x0566, B:55:0x0567, B:56:0x0568, B:59:0x05ba, B:62:0x05c4, B:72:0x05fd, B:76:0x0615, B:79:0x0620, B:84:0x0634, B:113:0x1e10, B:115:0x1e51, B:119:0x1e55, B:122:0x1f4d, B:126:0x1ed5, B:127:0x1ee6, B:133:0x1f2a, B:135:0x1f30, B:136:0x1f31, B:137:0x1eee, B:927:0x0447, B:935:0x1f82, B:937:0x1f88, B:938:0x1f89, B:941:0x1f8b, B:943:0x1f91, B:944:0x1f92, B:947:0x03d7, B:952:0x1f94, B:954:0x1f9a, B:955:0x1f9b, B:129:0x1efc, B:130:0x1f28, B:49:0x0523, B:932:0x04e9, B:929:0x04af, B:949:0x03fe), top: B:7:0x026d, inners: #4, #25, #36, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1eee A[Catch: Exception -> 0x1f9c, TRY_LEAVE, TryCatch #31 {Exception -> 0x1f9c, blocks: (B:8:0x026d, B:10:0x0284, B:38:0x0439, B:46:0x0510, B:52:0x0560, B:54:0x0566, B:55:0x0567, B:56:0x0568, B:59:0x05ba, B:62:0x05c4, B:72:0x05fd, B:76:0x0615, B:79:0x0620, B:84:0x0634, B:113:0x1e10, B:115:0x1e51, B:119:0x1e55, B:122:0x1f4d, B:126:0x1ed5, B:127:0x1ee6, B:133:0x1f2a, B:135:0x1f30, B:136:0x1f31, B:137:0x1eee, B:927:0x0447, B:935:0x1f82, B:937:0x1f88, B:938:0x1f89, B:941:0x1f8b, B:943:0x1f91, B:944:0x1f92, B:947:0x03d7, B:952:0x1f94, B:954:0x1f9a, B:955:0x1f9b, B:129:0x1efc, B:130:0x1f28, B:49:0x0523, B:932:0x04e9, B:929:0x04af, B:949:0x03fe), top: B:7:0x026d, inners: #4, #25, #36, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x050e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x1f32  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:918:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:921:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x0447 A[Catch: Exception -> 0x1f9c, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x1f9c, blocks: (B:8:0x026d, B:10:0x0284, B:38:0x0439, B:46:0x0510, B:52:0x0560, B:54:0x0566, B:55:0x0567, B:56:0x0568, B:59:0x05ba, B:62:0x05c4, B:72:0x05fd, B:76:0x0615, B:79:0x0620, B:84:0x0634, B:113:0x1e10, B:115:0x1e51, B:119:0x1e55, B:122:0x1f4d, B:126:0x1ed5, B:127:0x1ee6, B:133:0x1f2a, B:135:0x1f30, B:136:0x1f31, B:137:0x1eee, B:927:0x0447, B:935:0x1f82, B:937:0x1f88, B:938:0x1f89, B:941:0x1f8b, B:943:0x1f91, B:944:0x1f92, B:947:0x03d7, B:952:0x1f94, B:954:0x1f9a, B:955:0x1f9b, B:129:0x1efc, B:130:0x1f28, B:49:0x0523, B:932:0x04e9, B:929:0x04af, B:949:0x03fe), top: B:7:0x026d, inners: #4, #25, #36, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:945:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:960:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:964:0x036f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r10v154, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v96, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r13v144, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v160 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v164 */
    /* JADX WARN: Type inference failed for: r15v165 */
    /* JADX WARN: Type inference failed for: r15v166 */
    /* JADX WARN: Type inference failed for: r15v167 */
    /* JADX WARN: Type inference failed for: r15v168 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v80, types: [int] */
    /* JADX WARN: Type inference failed for: r15v92, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r15v97, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v193, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v168, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v169 */
    /* JADX WARN: Type inference failed for: r3v174 */
    /* JADX WARN: Type inference failed for: r3v175 */
    /* JADX WARN: Type inference failed for: r3v176 */
    /* JADX WARN: Type inference failed for: r3v179, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v180 */
    /* JADX WARN: Type inference failed for: r3v183, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v187, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v202, types: [int] */
    /* JADX WARN: Type inference failed for: r3v212, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v214, types: [int] */
    /* JADX WARN: Type inference failed for: r3v220, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v221, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v222, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v224 */
    /* JADX WARN: Type inference failed for: r3v225, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v227, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v229 */
    /* JADX WARN: Type inference failed for: r3v230 */
    /* JADX WARN: Type inference failed for: r3v235 */
    /* JADX WARN: Type inference failed for: r3v236 */
    /* JADX WARN: Type inference failed for: r3v237 */
    /* JADX WARN: Type inference failed for: r3v238 */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r3v242 */
    /* JADX WARN: Type inference failed for: r3v263, types: [int] */
    /* JADX WARN: Type inference failed for: r3v271, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v273, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v282, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v291, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v292 */
    /* JADX WARN: Type inference failed for: r3v303, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v308 */
    /* JADX WARN: Type inference failed for: r3v320, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v353 */
    /* JADX WARN: Type inference failed for: r3v354 */
    /* JADX WARN: Type inference failed for: r3v355 */
    /* JADX WARN: Type inference failed for: r3v356 */
    /* JADX WARN: Type inference failed for: r3v357 */
    /* JADX WARN: Type inference failed for: r3v358 */
    /* JADX WARN: Type inference failed for: r3v363 */
    /* JADX WARN: Type inference failed for: r3v364 */
    /* JADX WARN: Type inference failed for: r3v365 */
    /* JADX WARN: Type inference failed for: r3v368 */
    /* JADX WARN: Type inference failed for: r3v369 */
    /* JADX WARN: Type inference failed for: r3v370 */
    /* JADX WARN: Type inference failed for: r3v371 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v153, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v106, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v134 */
    /* JADX WARN: Type inference failed for: r5v136 */
    /* JADX WARN: Type inference failed for: r5v137 */
    /* JADX WARN: Type inference failed for: r5v138 */
    /* JADX WARN: Type inference failed for: r5v139 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v143 */
    /* JADX WARN: Type inference failed for: r5v146 */
    /* JADX WARN: Type inference failed for: r5v152, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v161, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v163, types: [int] */
    /* JADX WARN: Type inference failed for: r5v169, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v176, types: [int, short] */
    /* JADX WARN: Type inference failed for: r5v184, types: [int, short] */
    /* JADX WARN: Type inference failed for: r5v185 */
    /* JADX WARN: Type inference failed for: r5v191, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v209 */
    /* JADX WARN: Type inference failed for: r5v221 */
    /* JADX WARN: Type inference failed for: r5v222 */
    /* JADX WARN: Type inference failed for: r5v227 */
    /* JADX WARN: Type inference failed for: r5v228 */
    /* JADX WARN: Type inference failed for: r5v229 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v230 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v50, types: [int, short] */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r60v11 */
    /* JADX WARN: Type inference failed for: r6v105, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v106 */
    /* JADX WARN: Type inference failed for: r6v108 */
    /* JADX WARN: Type inference failed for: r6v115, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v116, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v119, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r6v122 */
    /* JADX WARN: Type inference failed for: r6v123 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v125 */
    /* JADX WARN: Type inference failed for: r6v132 */
    /* JADX WARN: Type inference failed for: r6v136 */
    /* JADX WARN: Type inference failed for: r6v137 */
    /* JADX WARN: Type inference failed for: r6v138 */
    /* JADX WARN: Type inference failed for: r6v147, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v150, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v152 */
    /* JADX WARN: Type inference failed for: r6v153 */
    /* JADX WARN: Type inference failed for: r6v161, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v167, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v168 */
    /* JADX WARN: Type inference failed for: r6v169, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v178 */
    /* JADX WARN: Type inference failed for: r6v197 */
    /* JADX WARN: Type inference failed for: r6v198 */
    /* JADX WARN: Type inference failed for: r6v264 */
    /* JADX WARN: Type inference failed for: r6v273 */
    /* JADX WARN: Type inference failed for: r6v274 */
    /* JADX WARN: Type inference failed for: r6v275 */
    /* JADX WARN: Type inference failed for: r6v276 */
    /* JADX WARN: Type inference failed for: r6v277 */
    /* JADX WARN: Type inference failed for: r6v278 */
    /* JADX WARN: Type inference failed for: r6v279 */
    /* JADX WARN: Type inference failed for: r6v280 */
    /* JADX WARN: Type inference failed for: r6v281 */
    /* JADX WARN: Type inference failed for: r6v282 */
    /* JADX WARN: Type inference failed for: r6v284 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r8v119 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v125, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v140 */
    /* JADX WARN: Type inference failed for: r8v141 */
    /* JADX WARN: Type inference failed for: r8v142 */
    /* JADX WARN: Type inference failed for: r8v144, types: [int] */
    /* JADX WARN: Type inference failed for: r8v145 */
    /* JADX WARN: Type inference failed for: r8v151, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v154, types: [int, short] */
    /* JADX WARN: Type inference failed for: r8v160, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v170, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v178 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v180, types: [int] */
    /* JADX WARN: Type inference failed for: r8v185 */
    /* JADX WARN: Type inference failed for: r8v193 */
    /* JADX WARN: Type inference failed for: r8v198, types: [int, short] */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v234 */
    /* JADX WARN: Type inference failed for: r8v241 */
    /* JADX WARN: Type inference failed for: r8v242 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v300 */
    /* JADX WARN: Type inference failed for: r8v301 */
    /* JADX WARN: Type inference failed for: r8v302 */
    /* JADX WARN: Type inference failed for: r8v303 */
    /* JADX WARN: Type inference failed for: r8v304 */
    /* JADX WARN: Type inference failed for: r8v305 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v307 */
    /* JADX WARN: Type inference failed for: r8v308 */
    /* JADX WARN: Type inference failed for: r8v309 */
    /* JADX WARN: Type inference failed for: r8v310 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v34 */
    static {
        String str;
        char c;
        char c2;
        Object obj;
        char c3;
        int i2;
        char c4;
        int i3;
        Object invoke;
        Object invoke2;
        Object invoke3;
        char c5;
        char c6;
        char c7;
        int i4;
        Object obj2;
        char c8;
        int i5;
        Object[] objArr;
        int i6;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i7;
        int i8;
        int i9;
        boolean z;
        ?? r5;
        boolean[] zArr4;
        String str2;
        Object[] objArr2;
        boolean z2;
        ?? r6;
        boolean[] zArr5;
        Object obj3;
        int i10;
        boolean[] zArr6;
        ?? r15;
        ?? r3;
        ?? r8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b;
        short s;
        byte b2;
        boolean z3;
        Object obj4;
        boolean z4;
        Random random;
        Object[] objArr3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean[] zArr7;
        Object obj9;
        Object obj10;
        Object obj11;
        int i17;
        Object obj12;
        ?? r60;
        String sb;
        Random random2;
        Object newInstance;
        int i18;
        Class<Class> cls;
        Object obj13;
        Object obj14;
        Class<String> cls2;
        boolean[] zArr8;
        Throwable th;
        ZipFile zipFile;
        long j;
        int i19;
        byte[] bArr;
        int i20;
        Object obj15;
        Class cls3;
        Class<byte[]> cls4;
        ZipFile zipFile2;
        String str3;
        char c9;
        short s2;
        Class<String> cls5;
        Method method;
        Object obj16;
        Object newInstance2;
        ZipFile zipFile3;
        Object obj17;
        Class<String> cls6;
        Class<byte[]> cls7;
        boolean z5;
        Object obj18;
        Object obj19;
        boolean z6;
        Object obj20;
        Class<String> cls8;
        ?? r32;
        Class<byte[]> cls9;
        Object obj21;
        Class<Class> cls10;
        Class<Class> cls11;
        ?? r33;
        Object obj22;
        Object obj23;
        Class<Class> cls12;
        Object obj24;
        Class<Class> cls13;
        Object obj25;
        ZipFile zipFile4;
        Class<String> cls14;
        Class<Class> cls15;
        StringBuilder sb2;
        byte[] bArr2;
        byte b3;
        int i21;
        boolean z7;
        Class<Class> cls16 = Class.class;
        Class<byte[]> cls17 = byte[].class;
        init$0();
        try {
            byte[] bArr3 = $$a;
            Class<?> cls18 = Class.forName($$c(bArr3[62], bArr3[7], bArr3[1161]));
            byte b4 = bArr3[1152];
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i22 = (b4 * (-317)) + 319;
            int i23 = ~b4;
            int i24 = ~(((-2) ^ currentTimeMillis) | ((-2) & currentTimeMillis));
            int i25 = ((i23 ^ i24) | (i24 & i23)) * (-318);
            int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
            int i27 = ~((i23 & currentTimeMillis) | (i23 ^ currentTimeMillis));
            int i28 = (~currentTimeMillis) | 1;
            int i29 = (i26 - (~((i27 | (~((i28 & b4) | (i28 ^ b4)))) * 318))) - 1;
            int i30 = (~b4) | (~currentTimeMillis);
            int i31 = (b4 ^ 1) | (b4 & 1);
            int i32 = ((~((i30 & 1) | (i30 ^ 1))) | (~((i31 & currentTimeMillis) | (i31 ^ currentTimeMillis)))) * 318;
            String $$c = $$c((byte) (((i29 | i32) << 1) - (i29 ^ i32)), bArr3[262], bArr3[778]);
            Class cls19 = Integer.TYPE;
            Method method2 = cls18.getMethod($$c, cls19, cls19);
            Object obj26 = null;
            int intValue = ((Integer) method2.invoke(null, 22, 7)).intValue();
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i33 = ~(((-1910590762) & currentTimeMillis2) | ((-1910590762) ^ currentTimeMillis2));
            int i34 = (817907969 ^ i33) | (i33 & 817907969);
            int i35 = ~(((-986381272) ^ currentTimeMillis2) | ((-986381272) & currentTimeMillis2));
            int i36 = ((i34 ^ i35) | (i34 & i35)) * (-880);
            int i37 = (1021786368 & i36) + (i36 | 1021786368);
            int i38 = ~currentTimeMillis2;
            int i39 = ~(((-1910590762) ^ i38) | (i38 & (-1910590762)));
            int i40 = (986381271 ^ i39) | (i39 & 986381271);
            int i41 = ~(currentTimeMillis2 | 1910590761);
            int i42 = (((i40 & i41) | (i40 ^ i41)) * (-880)) + i37;
            int i43 = i41 * 880;
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            int i45 = ((-2095017712) & intValue) | (intValue ^ (-2095017712)) | 5655178;
            int i46 = i45 * 614;
            Class<byte[]> cls20 = 0;
            int currentTimeMillis3 = (int) System.currentTimeMillis();
            int i47 = (i44 * (-756)) + (i45 * 465412);
            int i48 = ~currentTimeMillis3;
            int i49 = -(-(((i46 ^ i48) | (i46 & i48)) * (-757)));
            int i50 = (i47 & i49) + (i47 | i49);
            int i51 = ~i44;
            int i52 = (i51 & i46) | (i51 ^ i46);
            int i53 = ((~((i52 & currentTimeMillis3) | (i52 ^ currentTimeMillis3))) * 1514) + i50;
            int i54 = ~i46;
            int i55 = 1;
            int i56 = ~i44;
            int i57 = ~(i54 | i56);
            int i58 = ~((i56 ^ i48) | (i56 & i48));
            int i59 = (i58 & i57) | (i57 ^ i58);
            int i60 = (i46 ^ i44) | (i46 & i44);
            int i61 = ~((currentTimeMillis3 & i60) | (i60 ^ currentTimeMillis3));
            int i62 = (((i61 & i59) | (i59 ^ i61)) * 757) + i53;
            int i63 = ~intValue;
            int i64 = ~(1087851246 | i63);
            int i65 = (i64 & (-2095017712)) | (i64 ^ (-2095017712)) | (~(i63 | 1012821643));
            int i66 = i65 * (-1228);
            int currentTimeMillis4 = (int) System.currentTimeMillis();
            int i67 = i65 * 642244;
            int i68 = i62 * 263;
            int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
            int i70 = ~i66;
            int i71 = ~((i70 & i62) | (i70 ^ i62));
            int i72 = ~i62;
            int i73 = i71 | (~(i72 | i66));
            int i74 = ~((i72 ^ currentTimeMillis4) | (i72 & currentTimeMillis4));
            int i75 = (i69 - (~(-(-(((i73 ^ i74) | (i73 & i74)) * 262))))) - 1;
            int i76 = -(-((~((i72 ^ i66) | (i72 & i66))) * (-786)));
            int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
            int i78 = ~i62;
            int i79 = ~currentTimeMillis4;
            int i80 = ~((i79 & i78) | (i78 ^ i79));
            int i81 = ~(i62 | (~i66));
            int i82 = (i81 & i80) | (i80 ^ i81);
            int i83 = ~((i78 & i66) | (i78 ^ i66));
            int i84 = -(-(((i82 & i83) | (i82 ^ i83)) * 262));
            int i85 = (i77 & i84) + (i84 | i77);
            int i86 = ~(((-1007166466) & i63) | ((-1007166466) ^ i63));
            int i87 = ~intValue;
            int i88 = ~((i87 & (-1087851247)) | (i87 ^ (-1087851247)) | 1012821643);
            int i89 = (i88 & i86) | (i86 ^ i88);
            int i90 = i89 * 614;
            int currentTimeMillis5 = (int) System.currentTimeMillis();
            int i91 = i89 * 607246;
            int i92 = -(-(i85 * (-987)));
            int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
            int i94 = ~i85;
            int i95 = ~currentTimeMillis5;
            int i96 = i94 | i95;
            int i97 = ~((i96 & i90) | (i96 ^ i90));
            int i98 = i90 | i85;
            int i99 = ~((i98 ^ currentTimeMillis5) | (i98 & currentTimeMillis5));
            int i100 = ((i97 ^ i99) | (i97 & i99)) * 988;
            int i101 = ((i93 | i100) << 1) - (i93 ^ i100);
            int i102 = ((i94 & i90) | (i90 ^ i94)) * (-988);
            int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
            int i104 = ~i90;
            int i105 = ~i85;
            int i106 = (~((i104 & i105) | (i104 ^ i105))) | (~((currentTimeMillis5 & i105) | (i105 ^ currentTimeMillis5)));
            int i107 = (i90 & i95) | (i95 ^ i90);
            int i108 = ~((i107 & i85) | (i107 ^ i85));
            if ((((i106 & i108) | (i106 ^ i108)) * 988) + i103 == 0) {
                return;
            }
            afErrorLog = 3800951577373773706L;
            afLogForce = (byte) 15;
            AFKeystoreWrapper = new HashMap();
            e = new HashMap();
            try {
                String $$c2 = $$c(bArr3[19], bArr3[189], bArr3[214]);
                if (i == null) {
                    byte b5 = bArr3[19];
                    str = $$c(b5, (short) (b5 | 12), bArr3[743]);
                } else {
                    str = null;
                }
                try {
                    byte b6 = bArr3[62];
                    c = 743;
                    c2 = 262;
                    try {
                        Class<?> cls21 = Class.forName($$c(b6, (short) ((b6 ^ 26) | (b6 & 26)), (byte) (-bArr3[114])));
                        byte b7 = bArr3[19];
                        obj = cls21.getMethod($$c(b7, (short) ((b7 ^ 49) | (b7 & 49)), bArr3[193]), null).invoke(null, null);
                        c2 = 262;
                        c = 743;
                    } catch (Exception unused) {
                        obj = null;
                        c2 = c2;
                        c = c;
                        byte[] bArr4 = $$a;
                        c3 = 528;
                        Class<?> cls22 = Class.forName($$c(bArr4[62], (short) 132, bArr4[528]));
                        byte b8 = (byte) 70;
                        short s3 = (short) 153;
                        byte b9 = bArr4[343];
                        c4 = 343;
                        i3 = -1;
                        int currentTimeMillis6 = (int) System.currentTimeMillis();
                        int i109 = -(-(b9 * 253));
                        int i110 = ((-253) ^ i109) + (((-253) & i109) << 1);
                        int i111 = ~b9;
                        int i112 = ~i111;
                        i2 = 2;
                        int i113 = ~currentTimeMillis6;
                        int i114 = ~((i111 ^ i113) | (i113 & i111));
                        int i115 = (i114 & i112) | (i112 ^ i114);
                        int i116 = ((-1) ^ b9) | b9;
                        int i117 = ~(i116 | currentTimeMillis6);
                        int i118 = ((i115 & i117) | (i115 ^ i117)) * (-252);
                        int i119 = (i110 ^ i118) + ((i110 & i118) << 1);
                        int i120 = (i119 & 252) + (i119 | 252);
                        int i121 = -(-((~((i116 & currentTimeMillis6) | (i116 ^ currentTimeMillis6))) * 252));
                        obj = cls22.getMethod($$c(b8, s3, (byte) (((i120 | i121) << 1) - (i120 ^ i121))), null).invoke(null, null);
                        if (obj != null) {
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        Class<String> cls23 = String.class;
                        if (invoke == null) {
                        }
                        c6 = 'j';
                        c5 = c7;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr5 = $$a;
                        byte b10 = (byte) (-bArr5[c8]);
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(b10, (short) ((b10 ^ 144) | (b10 & 144)), (byte) (-bArr5[c6]))), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = obj2;
                        objArr[i5] = invoke3;
                        i6 = 4;
                        objArr[4] = invoke2;
                        objArr[i4] = obj2;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[i5] = true;
                        zArr3[4] = false;
                        zArr3[i4] = true;
                        zArr3[6] = true;
                        char c10 = 843;
                        i7 = 978;
                        Class<?> cls24 = Class.forName($$c(bArr5[62], (short) 275, bArr5[978]));
                        i21 = cls24.getDeclaredField($$c(bArr5[889], (short) 298, bArr5[843])).getInt(cls24);
                        if (i21 >= 34) {
                        }
                        zArr3[0] = i21 != 29 && i21 >= 26;
                        if (i21 < 21) {
                        }
                        zArr3[1] = z7;
                        zArr3[4] = i21 < 21;
                        i8 = 0;
                        i9 = 0;
                        r5 = AFa1gSDK.class;
                        z = r8;
                        while (i8 == 0) {
                        }
                    }
                } catch (Exception unused2) {
                    c = 743;
                    c2 = 262;
                }
                if (obj != null) {
                    int i122 = $11;
                    $10 = ((i122 & 89) + (i122 | 89)) % 128;
                    i2 = 2;
                    c4 = 343;
                    c3 = 528;
                    c2 = c2;
                    c = c;
                    i3 = -1;
                    if (obj != null) {
                        try {
                            invoke = obj.getClass().getMethod($$c((byte) 70, (short) 173, $$a[150]), null).invoke(obj, null);
                        } catch (Exception unused3) {
                        }
                        if (obj != null) {
                            try {
                                invoke2 = obj.getClass().getMethod($$c((byte) 70, (short) 183, $$a[113]), null).invoke(obj, null);
                            } catch (Exception unused4) {
                            }
                            if (obj != null) {
                                try {
                                    invoke3 = obj.getClass().getMethod($$c((byte) 70, (short) 197, $$a[150]), null).invoke(obj, null);
                                } catch (Exception unused5) {
                                }
                                Class<String> cls232 = String.class;
                                if (invoke == null) {
                                    c7 = 150;
                                } else {
                                    if (str != null) {
                                        StringBuilder sb3 = new StringBuilder();
                                        byte[] bArr6 = $$a;
                                        byte b11 = bArr6[13];
                                        c5 = 150;
                                        c6 = 'j';
                                        sb3.append($$c(b11, (short) ((b11 ^ 193) | (b11 & 193)), bArr6[150]));
                                        sb3.append(str);
                                        try {
                                            Object[] objArr4 = {sb3.toString()};
                                            byte b12 = (byte) (-bArr6[239]);
                                            invoke = Class.forName($$c(b12, (short) ((b12 ^ 144) | (b12 & 144)), (byte) (-bArr6[106]))).getDeclaredConstructor(cls232).newInstance(objArr4);
                                            if (invoke3 != null) {
                                                int i123 = $11;
                                                int i124 = ((i123 | 5) << 1) - (i123 ^ 5);
                                                $10 = i124 % 128;
                                                if (i124 % 2 != 0) {
                                                    int i125 = 5 / 0;
                                                }
                                                i4 = 5;
                                                obj2 = invoke;
                                                i5 = 3;
                                                c8 = 239;
                                            } else {
                                                byte[] bArr7 = $$a;
                                                byte b13 = (byte) (-bArr7[239]);
                                                int i126 = $$b;
                                                i4 = 5;
                                                obj2 = invoke;
                                                int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                int i127 = i126 * 603;
                                                int i128 = (((-1208) | i127) << 1) - ((-1208) ^ i127);
                                                int i129 = ~currentTimeMillis7;
                                                c8 = 239;
                                                int i130 = ((~(3 | i129)) | i126) * (-602);
                                                int i131 = (i128 & i130) + (i128 | i130);
                                                int i132 = ~i126;
                                                int i133 = ~((3 ^ i132) | (i132 & 3));
                                                i5 = 3;
                                                int i134 = ~((3 ^ currentTimeMillis7) | (3 & currentTimeMillis7));
                                                int i135 = (i133 ^ i134) | (i134 & i133);
                                                int i136 = ~currentTimeMillis7;
                                                int i137 = ~((i136 & (-4)) | (i136 ^ (-4)) | i126);
                                                int i138 = -(-(((i137 & i135) | (i135 ^ i137)) * (-301)));
                                                int i139 = (i131 & i138) + (i131 | i138);
                                                int i140 = (~((i129 ^ i126) | (i129 & i126))) * 301;
                                                try {
                                                    Object invoke4 = Class.forName($$c((byte) (-bArr7[239]), (short) 241, bArr7[c2])).getMethod($$c((byte) 70, (short) 256, bArr7[c5]), cls232).invoke(null, $$c(b13, (short) ((i139 & i140) + (i140 | i139)), bArr7[778]));
                                                    int i141 = $11;
                                                    $10 = (((i141 | 63) << 1) - (i141 ^ 63)) % 128;
                                                    try {
                                                        byte b14 = (byte) (-bArr7[239]);
                                                        invoke3 = Class.forName($$c(b14, (short) (b14 | 144), (byte) (-bArr7[c6]))).getDeclaredConstructor(cls232).newInstance(invoke4);
                                                    } catch (Throwable th2) {
                                                        Throwable cause = th2.getCause();
                                                        if (cause == null) {
                                                            throw th2;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause2 = th3.getCause();
                                                    if (cause2 == null) {
                                                        throw th3;
                                                    }
                                                    throw cause2;
                                                }
                                            }
                                            if (invoke2 == null && obj2 != null) {
                                                byte[] bArr8 = $$a;
                                                try {
                                                    Object[] objArr5 = new Object[i2];
                                                    objArr5[1] = $$c(bArr8[19], (short) 266, bArr8[417]);
                                                    objArr5[0] = obj2;
                                                    byte b15 = (byte) (-bArr8[c8]);
                                                    Class<?> cls25 = Class.forName($$c(b15, (short) ((b15 ^ 144) | (b15 & 144)), (byte) (-bArr8[c6])));
                                                    byte b16 = (byte) (-bArr8[c8]);
                                                    invoke2 = cls25.getDeclaredConstructor(Class.forName($$c(b16, (short) (b16 | 144), (byte) (-bArr8[c6]))), cls232).newInstance(objArr5);
                                                } catch (Throwable th4) {
                                                    Throwable cause3 = th4.getCause();
                                                    if (cause3 == null) {
                                                        throw th4;
                                                    }
                                                    throw cause3;
                                                }
                                            }
                                            byte[] bArr52 = $$a;
                                            byte b102 = (byte) (-bArr52[c8]);
                                            objArr = (Object[]) Array.newInstance(Class.forName($$c(b102, (short) ((b102 ^ 144) | (b102 & 144)), (byte) (-bArr52[c6]))), 7);
                                            objArr[0] = null;
                                            objArr[1] = invoke2;
                                            objArr[2] = obj2;
                                            objArr[i5] = invoke3;
                                            i6 = 4;
                                            objArr[4] = invoke2;
                                            objArr[i4] = obj2;
                                            objArr[6] = invoke3;
                                            zArr = new boolean[]{false, true, true, true, true, true, true};
                                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                            zArr3 = new boolean[7];
                                            zArr3[0] = false;
                                            zArr3[1] = false;
                                            zArr3[2] = true;
                                            zArr3[i5] = true;
                                            zArr3[4] = false;
                                            zArr3[i4] = true;
                                            zArr3[6] = true;
                                            char c102 = 843;
                                            i7 = 978;
                                            Class<?> cls242 = Class.forName($$c(bArr52[62], (short) 275, bArr52[978]));
                                            i21 = cls242.getDeclaredField($$c(bArr52[889], (short) 298, bArr52[843])).getInt(cls242);
                                            boolean z8 = i21 >= 34;
                                            zArr3[0] = i21 != 29 && i21 >= 26;
                                            if (i21 < 21) {
                                                z7 = true;
                                            } else {
                                                int i142 = $10;
                                                $11 = ((i142 ^ 99) + ((i142 & 99) << 1)) % 128;
                                                z7 = false;
                                            }
                                            zArr3[1] = z7;
                                            zArr3[4] = i21 < 21;
                                            i8 = 0;
                                            i9 = 0;
                                            r5 = AFa1gSDK.class;
                                            z = z8;
                                            while (i8 == 0 && i9 < 9) {
                                                if (zArr3[i9]) {
                                                    zArr4 = zArr;
                                                    str2 = $$c2;
                                                    objArr2 = objArr;
                                                    z2 = z ? 1 : 0;
                                                    r6 = cls232;
                                                    zArr5 = zArr2;
                                                    obj3 = obj26;
                                                    i10 = i8;
                                                    zArr6 = zArr3;
                                                    r15 = cls20;
                                                    r3 = cls16;
                                                    cls20 = cls17;
                                                    r8 = r5;
                                                    i11 = i9;
                                                } else {
                                                    int i143 = i6;
                                                    try {
                                                        z3 = zArr[i9];
                                                        obj4 = objArr[i9];
                                                        z4 = zArr2[i9];
                                                        if (z3) {
                                                            $11 = ($10 + 1) % 128;
                                                            if (obj4 != null) {
                                                                try {
                                                                    byte[] bArr9 = $$a;
                                                                    byte b17 = (byte) (-bArr9[c8]);
                                                                    zArr4 = zArr;
                                                                    try {
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        try {
                                                                            Throwable cause4 = th.getCause();
                                                                            if (cause4 == null) {
                                                                                throw th;
                                                                            }
                                                                            throw cause4;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            cls15 = cls16;
                                                                            str2 = $$c2;
                                                                            objArr2 = objArr;
                                                                            z2 = z ? 1 : 0;
                                                                            r6 = cls232;
                                                                            zArr5 = zArr2;
                                                                            i10 = i8;
                                                                            zArr6 = zArr3;
                                                                            i12 = i9;
                                                                            r15 = cls20;
                                                                            r3 = cls15;
                                                                            cls20 = cls17;
                                                                            r8 = r5;
                                                                            int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                            i11 = i12;
                                                                            int i144 = (i11 * 984) - 1965;
                                                                            int i145 = ~i11;
                                                                            int i146 = ((i145 & 1) | (i145 ^ 1)) * 983;
                                                                            int i147 = (i144 & i146) + (i146 | i144);
                                                                            int i148 = ~i11;
                                                                            int i149 = ~currentTimeMillis8;
                                                                            int i150 = ((-2) | (~((i148 & i149) | (i148 ^ i149)))) * (-983);
                                                                            while (i13 < 7) {
                                                                            }
                                                                            int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                            int i151 = ~currentTimeMillis9;
                                                                            int i152 = ((((-727204297) ^ currentTimeMillis9) | ((-727204297) & currentTimeMillis9)) * (-979)) + ((~(((-1655334471) ^ i151) | ((-1655334471) & i151))) * 979) + 589919008;
                                                                            int i153 = ~((currentTimeMillis9 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis9));
                                                                            int i154 = ~((i151 & (-727204297)) | (i151 ^ (-727204297)));
                                                                            int i155 = -(-(((i153 & i154) | (i153 ^ i154)) * 979));
                                                                            i14 = (i152 & i155) + (i155 | i152);
                                                                            int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                            int i156 = -(-((~(((-936656879) ^ currentTimeMillis10) | ((-936656879) & currentTimeMillis10))) * 420));
                                                                            i15 = (((1982889564 | i156) << 1) - (i156 ^ 1982889564)) - (-1951265516);
                                                                            int i157 = ~currentTimeMillis10;
                                                                            int i158 = ~((i157 & (-936656879)) | (i157 ^ (-936656879)));
                                                                            i16 = -(-(((i158 & (-939425775)) | ((-939425775) ^ i158)) * 420));
                                                                            if (i14 <= ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                            }
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c((byte) (-$$a[c8]), (short) 315, r0[198])).getDeclaredConstructor(r6, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                                            } catch (Throwable th7) {
                                                                                Throwable cause5 = th7.getCause();
                                                                                if (cause5 == null) {
                                                                                    throw th7;
                                                                                }
                                                                                throw cause5;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    zArr4 = zArr;
                                                                }
                                                            } else {
                                                                zArr4 = zArr;
                                                            }
                                                            try {
                                                                sb2 = new StringBuilder();
                                                                bArr2 = $$a;
                                                                b3 = bArr2[c];
                                                                str2 = $$c2;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                str2 = $$c2;
                                                            }
                                                            try {
                                                                sb2.append($$c(b3, (short) ((b3 & 275) | (b3 ^ 275)), bArr2[184]));
                                                                sb2.append(obj4);
                                                                byte b18 = bArr2[108];
                                                                sb2.append($$c(b18, (short) ((b18 ^ 307) | (b18 & 307)), bArr2[125]));
                                                                try {
                                                                    throw ((Throwable) Class.forName($$c((byte) (-bArr2[c8]), (short) 315, bArr2[198])).getDeclaredConstructor(cls232).newInstance(sb2.toString()));
                                                                } catch (Throwable th10) {
                                                                    Throwable cause6 = th10.getCause();
                                                                    if (cause6 == null) {
                                                                        throw th10;
                                                                    }
                                                                    throw cause6;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                cls15 = cls16;
                                                                objArr2 = objArr;
                                                                z2 = z ? 1 : 0;
                                                                r6 = cls232;
                                                                zArr5 = zArr2;
                                                                i10 = i8;
                                                                zArr6 = zArr3;
                                                                i12 = i9;
                                                                r15 = cls20;
                                                                r3 = cls15;
                                                                cls20 = cls17;
                                                                r8 = r5;
                                                                int currentTimeMillis82 = (int) System.currentTimeMillis();
                                                                i11 = i12;
                                                                int i1442 = (i11 * 984) - 1965;
                                                                int i1452 = ~i11;
                                                                int i1462 = ((i1452 & 1) | (i1452 ^ 1)) * 983;
                                                                int i1472 = (i1442 & i1462) + (i1462 | i1442);
                                                                int i1482 = ~i11;
                                                                int i1492 = ~currentTimeMillis82;
                                                                int i1502 = ((-2) | (~((i1482 & i1492) | (i1482 ^ i1492)))) * (-983);
                                                                while (i13 < 7) {
                                                                }
                                                                int currentTimeMillis92 = (int) System.currentTimeMillis();
                                                                int i1512 = ~currentTimeMillis92;
                                                                int i1522 = ((((-727204297) ^ currentTimeMillis92) | ((-727204297) & currentTimeMillis92)) * (-979)) + ((~(((-1655334471) ^ i1512) | ((-1655334471) & i1512))) * 979) + 589919008;
                                                                int i1532 = ~((currentTimeMillis92 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis92));
                                                                int i1542 = ~((i1512 & (-727204297)) | (i1512 ^ (-727204297)));
                                                                int i1552 = -(-(((i1532 & i1542) | (i1532 ^ i1542)) * 979));
                                                                i14 = (i1522 & i1552) + (i1552 | i1522);
                                                                int currentTimeMillis102 = (int) System.currentTimeMillis();
                                                                int i1562 = -(-((~(((-936656879) ^ currentTimeMillis102) | ((-936656879) & currentTimeMillis102))) * 420));
                                                                i15 = (((1982889564 | i1562) << 1) - (i1562 ^ 1982889564)) - (-1951265516);
                                                                int i1572 = ~currentTimeMillis102;
                                                                int i1582 = ~((i1572 & (-936656879)) | (i1572 ^ (-936656879)));
                                                                i16 = -(-(((i1582 & (-939425775)) | ((-939425775) ^ i1582)) * 420));
                                                                if (i14 <= ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                }
                                                                throw ((Throwable) Class.forName($$c((byte) (-$$a[c8]), (short) 315, r0[198])).getDeclaredConstructor(r6, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                            }
                                                        }
                                                        zArr4 = zArr;
                                                        str2 = $$c2;
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        zArr4 = zArr;
                                                        str2 = $$c2;
                                                        objArr2 = objArr;
                                                        z2 = z ? 1 : 0;
                                                        r6 = cls232;
                                                        zArr5 = zArr2;
                                                        i10 = i8;
                                                        zArr6 = zArr3;
                                                        i12 = i9;
                                                        r15 = cls20;
                                                        r3 = cls16;
                                                    }
                                                    if (z3) {
                                                        try {
                                                            random = new Random();
                                                            try {
                                                                objArr3 = objArr;
                                                                try {
                                                                    random.setSeed(((Long) Class.forName($$c((byte) (-$$a[c8]), (short) 241, r7[c2])).getMethod($$c(r7[19], (short) 333, r7[915]), null).invoke(null, null)).longValue() ^ (-1617582197));
                                                                    obj5 = null;
                                                                    obj6 = null;
                                                                    obj7 = null;
                                                                    obj8 = null;
                                                                    z = z;
                                                                    zArr7 = zArr6;
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    objArr2 = objArr3;
                                                                }
                                                            } catch (Throwable th14) {
                                                                boolean z9 = z ? 1 : 0;
                                                                Throwable cause7 = th14.getCause();
                                                                if (cause7 == null) {
                                                                    throw th14;
                                                                }
                                                                throw cause7;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            objArr2 = objArr;
                                                        }
                                                        while (obj5 == null) {
                                                            objArr2 = objArr3;
                                                            $11 = ($10 + 5) % 128;
                                                            if (obj6 == null) {
                                                                obj11 = obj5;
                                                                i17 = 6;
                                                            } else {
                                                                obj11 = obj5;
                                                                i17 = obj7 == null ? i4 : obj8 == null ? i143 : i5;
                                                            }
                                                            try {
                                                                obj12 = obj6;
                                                                z2 = z ? 1 : 0;
                                                                try {
                                                                    int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                    int i159 = (i17 * 569) + 569;
                                                                    int i160 = ~i17;
                                                                    int i161 = ((-2) ^ i160) | ((-2) & i160);
                                                                    zArr5 = zArr2;
                                                                    int i162 = ~i161;
                                                                    int i163 = ~currentTimeMillis11;
                                                                    int i164 = ~((-2) | i163);
                                                                    int i165 = (i162 ^ i164) | (i164 & i162);
                                                                    int i166 = ~currentTimeMillis11;
                                                                    int i167 = ~((i160 ^ i166) | (i160 & i166));
                                                                    int i168 = ((i165 ^ i167) | (i167 & i165)) * (-1136);
                                                                    int i169 = (i159 ^ i168) + ((i159 & i168) << 1);
                                                                    int i170 = ~(((-2) ^ currentTimeMillis11) | ((-2) & currentTimeMillis11));
                                                                    int i171 = ~i17;
                                                                    int i172 = (i163 ^ 1) | (i163 & 1);
                                                                    i10 = i172 ^ i17;
                                                                    r60 = i170 | (~((i171 ^ currentTimeMillis11) | (i171 & currentTimeMillis11)));
                                                                    int i173 = ~(i10 | (i172 & i17));
                                                                    int i174 = ((r60 ^ i173) | (r60 & i173)) * (-568);
                                                                    int i175 = (i169 ^ i174) + ((i174 & i169) << 1);
                                                                    int i176 = ~((i163 ^ 1) | (i163 & 1));
                                                                    int i177 = ~((i166 ^ i17) | (i166 & i17));
                                                                    int i178 = (i176 & i177) | (i176 ^ i177);
                                                                    int i179 = ~((i161 ^ currentTimeMillis11) | (i161 & currentTimeMillis11));
                                                                    int i180 = ((i178 & i179) | (i178 ^ i179)) * 568;
                                                                    try {
                                                                        StringBuilder sb4 = new StringBuilder((i175 ^ i180) + ((i175 & i180) << 1));
                                                                        sb4.append('.');
                                                                        int i181 = 0;
                                                                        while (i181 < i17) {
                                                                            int i182 = $11;
                                                                            int i183 = (i182 ^ 35) + ((i182 & 35) << 1);
                                                                            $10 = i183 % 128;
                                                                            if (i183 % 2 != 0) {
                                                                                throw null;
                                                                            }
                                                                            if (z4) {
                                                                                int nextInt = random.nextInt(26);
                                                                                if (random.nextBoolean()) {
                                                                                    int i184 = $11;
                                                                                    $10 = (((i184 | 101) << 1) - (i184 ^ 101)) % 128;
                                                                                    i18 = ((nextInt | 65) << 1) - (nextInt ^ 65);
                                                                                } else {
                                                                                    i18 = 95 - (~nextInt);
                                                                                }
                                                                                sb4.append((char) i18);
                                                                            } else {
                                                                                sb4.append((char) (8191 - (~(-(-random.nextInt(12))))));
                                                                            }
                                                                            int i185 = ((i181 | (-80)) << 1) - (i181 ^ (-80));
                                                                            i181 = (i185 ^ 81) + ((i185 & 81) << 1);
                                                                        }
                                                                        sb = sb4.toString();
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    zArr5 = zArr2;
                                                                    r3 = cls16;
                                                                    r8 = r5;
                                                                    r6 = cls232;
                                                                    i10 = i8;
                                                                    zArr6 = zArr3;
                                                                    i12 = i9;
                                                                    r15 = cls20;
                                                                    cls20 = cls17;
                                                                    int currentTimeMillis822 = (int) System.currentTimeMillis();
                                                                    i11 = i12;
                                                                    int i14422 = (i11 * 984) - 1965;
                                                                    int i14522 = ~i11;
                                                                    int i14622 = ((i14522 & 1) | (i14522 ^ 1)) * 983;
                                                                    int i14722 = (i14422 & i14622) + (i14622 | i14422);
                                                                    int i14822 = ~i11;
                                                                    int i14922 = ~currentTimeMillis822;
                                                                    int i15022 = ((-2) | (~((i14822 & i14922) | (i14822 ^ i14922)))) * (-983);
                                                                    while (i13 < 7) {
                                                                    }
                                                                    int currentTimeMillis922 = (int) System.currentTimeMillis();
                                                                    int i15122 = ~currentTimeMillis922;
                                                                    int i15222 = ((((-727204297) ^ currentTimeMillis922) | ((-727204297) & currentTimeMillis922)) * (-979)) + ((~(((-1655334471) ^ i15122) | ((-1655334471) & i15122))) * 979) + 589919008;
                                                                    int i15322 = ~((currentTimeMillis922 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis922));
                                                                    int i15422 = ~((i15122 & (-727204297)) | (i15122 ^ (-727204297)));
                                                                    int i15522 = -(-(((i15322 & i15422) | (i15322 ^ i15422)) * 979));
                                                                    i14 = (i15222 & i15522) + (i15522 | i15222);
                                                                    int currentTimeMillis1022 = (int) System.currentTimeMillis();
                                                                    int i15622 = -(-((~(((-936656879) ^ currentTimeMillis1022) | ((-936656879) & currentTimeMillis1022))) * 420));
                                                                    i15 = (((1982889564 | i15622) << 1) - (i15622 ^ 1982889564)) - (-1951265516);
                                                                    int i15722 = ~currentTimeMillis1022;
                                                                    int i15822 = ~((i15722 & (-936656879)) | (i15722 ^ (-936656879)));
                                                                    i16 = -(-(((i15822 & (-939425775)) | ((-939425775) ^ i15822)) * 420));
                                                                    if (i14 <= ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                    }
                                                                    throw ((Throwable) Class.forName($$c((byte) (-$$a[c8]), (short) 315, r0[198])).getDeclaredConstructor(r6, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                z2 = z;
                                                                zArr5 = zArr2;
                                                                r3 = cls16;
                                                                r8 = r5;
                                                                r6 = cls232;
                                                                i10 = i8;
                                                                zArr6 = zArr3;
                                                                i12 = i9;
                                                                r15 = cls20;
                                                                cls20 = cls17;
                                                                int currentTimeMillis8222 = (int) System.currentTimeMillis();
                                                                i11 = i12;
                                                                int i144222 = (i11 * 984) - 1965;
                                                                int i145222 = ~i11;
                                                                int i146222 = ((i145222 & 1) | (i145222 ^ 1)) * 983;
                                                                int i147222 = (i144222 & i146222) + (i146222 | i144222);
                                                                int i148222 = ~i11;
                                                                int i149222 = ~currentTimeMillis8222;
                                                                int i150222 = ((-2) | (~((i148222 & i149222) | (i148222 ^ i149222)))) * (-983);
                                                                while (i13 < 7) {
                                                                }
                                                                int currentTimeMillis9222 = (int) System.currentTimeMillis();
                                                                int i151222 = ~currentTimeMillis9222;
                                                                int i152222 = ((((-727204297) ^ currentTimeMillis9222) | ((-727204297) & currentTimeMillis9222)) * (-979)) + ((~(((-1655334471) ^ i151222) | ((-1655334471) & i151222))) * 979) + 589919008;
                                                                int i153222 = ~((currentTimeMillis9222 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis9222));
                                                                int i154222 = ~((i151222 & (-727204297)) | (i151222 ^ (-727204297)));
                                                                int i155222 = -(-(((i153222 & i154222) | (i153222 ^ i154222)) * 979));
                                                                i14 = (i152222 & i155222) + (i155222 | i152222);
                                                                int currentTimeMillis10222 = (int) System.currentTimeMillis();
                                                                int i156222 = -(-((~(((-936656879) ^ currentTimeMillis10222) | ((-936656879) & currentTimeMillis10222))) * 420));
                                                                i15 = (((1982889564 | i156222) << 1) - (i156222 ^ 1982889564)) - (-1951265516);
                                                                int i157222 = ~currentTimeMillis10222;
                                                                int i158222 = ~((i157222 & (-936656879)) | (i157222 ^ (-936656879)));
                                                                i16 = -(-(((i158222 & (-939425775)) | ((-939425775) ^ i158222)) * 420));
                                                                if (i14 <= ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                }
                                                                throw ((Throwable) Class.forName($$c((byte) (-$$a[c8]), (short) 315, r0[198])).getDeclaredConstructor(r6, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                            }
                                                            if (obj12 == null) {
                                                                try {
                                                                    Object[] objArr6 = new Object[2];
                                                                    objArr6[i55] = sb;
                                                                    objArr6[0] = obj4;
                                                                    byte[] bArr10 = $$a;
                                                                    byte b19 = (byte) (-bArr10[c8]);
                                                                    Class<?> cls26 = Class.forName($$c(b19, (short) ((b19 ^ 144) | (b19 & 144)), (byte) (-bArr10[c6])));
                                                                    byte b20 = (byte) (-bArr10[c8]);
                                                                    obj6 = cls26.getDeclaredConstructor(Class.forName($$c(b20, (short) (b20 | 144), (byte) (-bArr10[c6]))), cls232).newInstance(objArr6);
                                                                    random2 = random;
                                                                    obj5 = obj11;
                                                                } catch (Throwable th19) {
                                                                    Throwable cause8 = th19.getCause();
                                                                    if (cause8 == null) {
                                                                        throw th19;
                                                                    }
                                                                    throw cause8;
                                                                }
                                                            } else {
                                                                if (obj7 != null) {
                                                                    if (obj8 == null) {
                                                                        try {
                                                                            Object[] objArr7 = new Object[2];
                                                                            objArr7[i55] = sb;
                                                                            objArr7[0] = obj4;
                                                                            byte[] bArr11 = $$a;
                                                                            byte b21 = (byte) (-bArr11[c8]);
                                                                            Class<?> cls27 = Class.forName($$c(b21, (short) ((b21 ^ 144) | (b21 & 144)), (byte) (-bArr11[c6])));
                                                                            byte b22 = (byte) (-bArr11[c8]);
                                                                            newInstance = cls27.getDeclaredConstructor(Class.forName($$c(b22, (short) ((b22 ^ 144) | (b22 & 144)), (byte) (-bArr11[c6]))), cls232).newInstance(objArr7);
                                                                        } catch (Throwable th20) {
                                                                            Throwable cause9 = th20.getCause();
                                                                            if (cause9 == null) {
                                                                                throw th20;
                                                                            }
                                                                            throw cause9;
                                                                        }
                                                                    } else {
                                                                        $11 = ($10 + 61) % 128;
                                                                        try {
                                                                            Object[] objArr8 = new Object[2];
                                                                            objArr8[i55] = sb;
                                                                            objArr8[0] = obj4;
                                                                            byte[] bArr12 = $$a;
                                                                            byte b23 = (byte) (-bArr12[c8]);
                                                                            Class<?> cls28 = Class.forName($$c(b23, (short) ((b23 ^ 144) | (b23 & 144)), (byte) (-bArr12[c6])));
                                                                            byte b24 = (byte) (-bArr12[c8]);
                                                                            Object newInstance3 = cls28.getDeclaredConstructor(Class.forName($$c(b24, (short) ((b24 & 144) | (b24 ^ 144)), (byte) (-bArr12[c6]))), cls232).newInstance(objArr8);
                                                                            $10 = ($11 + 123) % 128;
                                                                            try {
                                                                                try {
                                                                                    byte b25 = (byte) (-bArr12[c8]);
                                                                                    Class<?> cls29 = Class.forName($$c(b25, (short) ((b25 ^ 276) | (b25 & 276)), bArr12[i7]));
                                                                                    byte b26 = (byte) (-bArr12[c8]);
                                                                                    random2 = random;
                                                                                    Object newInstance4 = cls29.getDeclaredConstructor(Class.forName($$c(b26, (short) ((b26 & 144) | (b26 ^ 144)), (byte) (-bArr12[c6])))).newInstance(newInstance3);
                                                                                    try {
                                                                                        byte b27 = (byte) (-bArr12[c8]);
                                                                                        Class.forName($$c(b27, (short) ((b27 ^ 276) | (b27 & 276)), bArr12[i7])).getMethod($$c(bArr12[19], (short) 372, bArr12[184]), null).invoke(newInstance4, null);
                                                                                        obj5 = newInstance3;
                                                                                        obj8 = obj8;
                                                                                        obj6 = obj12;
                                                                                    } catch (Throwable th21) {
                                                                                        Throwable cause10 = th21.getCause();
                                                                                        if (cause10 == null) {
                                                                                            throw th21;
                                                                                        }
                                                                                        throw cause10;
                                                                                    }
                                                                                } catch (Throwable th22) {
                                                                                    Throwable cause11 = th22.getCause();
                                                                                    if (cause11 == null) {
                                                                                        throw th22;
                                                                                    }
                                                                                    throw cause11;
                                                                                }
                                                                            } catch (Exception e2) {
                                                                                StringBuilder sb5 = new StringBuilder();
                                                                                byte[] bArr13 = $$a;
                                                                                sb5.append($$c(bArr13[c], (short) 376, bArr13[184]));
                                                                                sb5.append(newInstance3);
                                                                                byte b28 = bArr13[108];
                                                                                sb5.append($$c(b28, (short) (b28 | 307), bArr13[125]));
                                                                                String sb6 = sb5.toString();
                                                                                try {
                                                                                    Object[] objArr9 = new Object[2];
                                                                                    objArr9[i55] = e2;
                                                                                    objArr9[0] = sb6;
                                                                                    throw ((Throwable) Class.forName($$c((byte) (-bArr13[c8]), (short) 315, bArr13[198])).getDeclaredConstructor(cls232, Throwable.class).newInstance(objArr9));
                                                                                } catch (Throwable th23) {
                                                                                    Throwable cause12 = th23.getCause();
                                                                                    if (cause12 == null) {
                                                                                        throw th23;
                                                                                    }
                                                                                    throw cause12;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th24) {
                                                                            Throwable cause13 = th24.getCause();
                                                                            if (cause13 == null) {
                                                                                throw th24;
                                                                            }
                                                                            throw cause13;
                                                                        }
                                                                    }
                                                                    th = th16;
                                                                    r3 = cls16;
                                                                    r8 = r5;
                                                                    r6 = cls232;
                                                                    i10 = i8;
                                                                    zArr6 = zArr3;
                                                                    i12 = i9;
                                                                    r15 = cls20;
                                                                    cls20 = cls17;
                                                                    int currentTimeMillis82222 = (int) System.currentTimeMillis();
                                                                    i11 = i12;
                                                                    int i1442222 = (i11 * 984) - 1965;
                                                                    int i1452222 = ~i11;
                                                                    int i1462222 = ((i1452222 & 1) | (i1452222 ^ 1)) * 983;
                                                                    int i1472222 = (i1442222 & i1462222) + (i1462222 | i1442222);
                                                                    int i1482222 = ~i11;
                                                                    int i1492222 = ~currentTimeMillis82222;
                                                                    int i1502222 = ((-2) | (~((i1482222 & i1492222) | (i1482222 ^ i1492222)))) * (-983);
                                                                    for (i13 = (((i1472222 ^ i1502222) + ((i1502222 & i1472222) << 1)) - (~(-(-(((~((-2) | (~currentTimeMillis82222))) | (~((-2) | i11))) * 983))))) - 1; i13 < 7; i13++) {
                                                                        if (zArr6[i13]) {
                                                                            obj3 = null;
                                                                            i = null;
                                                                            d = null;
                                                                            r3 = r3;
                                                                            r6 = r6;
                                                                            r8 = r8;
                                                                            r15 = r15;
                                                                            z2 = z2;
                                                                            zArr6 = zArr6;
                                                                        }
                                                                    }
                                                                    int currentTimeMillis92222 = (int) System.currentTimeMillis();
                                                                    int i1512222 = ~currentTimeMillis92222;
                                                                    int i1522222 = ((((-727204297) ^ currentTimeMillis92222) | ((-727204297) & currentTimeMillis92222)) * (-979)) + ((~(((-1655334471) ^ i1512222) | ((-1655334471) & i1512222))) * 979) + 589919008;
                                                                    int i1532222 = ~((currentTimeMillis92222 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis92222));
                                                                    int i1542222 = ~((i1512222 & (-727204297)) | (i1512222 ^ (-727204297)));
                                                                    int i1552222 = -(-(((i1532222 & i1542222) | (i1532222 ^ i1542222)) * 979));
                                                                    i14 = (i1522222 & i1552222) + (i1552222 | i1522222);
                                                                    int currentTimeMillis102222 = (int) System.currentTimeMillis();
                                                                    int i1562222 = -(-((~(((-936656879) ^ currentTimeMillis102222) | ((-936656879) & currentTimeMillis102222))) * 420));
                                                                    i15 = (((1982889564 | i1562222) << 1) - (i1562222 ^ 1982889564)) - (-1951265516);
                                                                    int i1572222 = ~currentTimeMillis102222;
                                                                    int i1582222 = ~((i1572222 & (-936656879)) | (i1572222 ^ (-936656879)));
                                                                    i16 = -(-(((i1582222 & (-939425775)) | ((-939425775) ^ i1582222)) * 420));
                                                                    if (i14 <= ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                        byte[] bArr14 = $$a;
                                                                        b = bArr14[28497];
                                                                        s = (short) ((b ^ 24457) | (b & 24457));
                                                                        b2 = bArr14[20842];
                                                                    } else {
                                                                        byte[] bArr15 = $$a;
                                                                        b = bArr15[c];
                                                                        s = (short) ((b ^ 1096) | (b & 1096));
                                                                        b2 = bArr15[779];
                                                                    }
                                                                    throw ((Throwable) Class.forName($$c((byte) (-$$a[c8]), (short) 315, r0[198])).getDeclaredConstructor(r6, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                                }
                                                                try {
                                                                    Object[] objArr10 = new Object[2];
                                                                    objArr10[i55] = sb;
                                                                    objArr10[0] = obj4;
                                                                    byte[] bArr16 = $$a;
                                                                    byte b29 = (byte) (-bArr16[c8]);
                                                                    Class<?> cls30 = Class.forName($$c(b29, (short) ((b29 ^ 144) | (b29 & 144)), (byte) (-bArr16[c6])));
                                                                    byte b30 = (byte) (-bArr16[c8]);
                                                                    obj7 = cls30.getDeclaredConstructor(Class.forName($$c(b30, (short) (b30 | 144), (byte) (-bArr16[c6]))), cls232).newInstance(objArr10);
                                                                    newInstance = obj8;
                                                                } catch (Throwable th25) {
                                                                    Throwable cause14 = th25.getCause();
                                                                    if (cause14 == null) {
                                                                        throw th25;
                                                                    }
                                                                    throw cause14;
                                                                }
                                                                random2 = random;
                                                                obj5 = obj11;
                                                                obj8 = newInstance;
                                                                obj6 = obj12;
                                                            }
                                                            objArr3 = objArr2;
                                                            z = z2 ? 1 : 0;
                                                            random = random2;
                                                            zArr2 = zArr5;
                                                            obj8 = obj8;
                                                            zArr7 = r60;
                                                        }
                                                        objArr2 = objArr3;
                                                        obj9 = obj5;
                                                        obj10 = obj6;
                                                        r8 = z;
                                                        r15 = obj8;
                                                        zArr6 = zArr7;
                                                    } else {
                                                        objArr2 = objArr;
                                                        obj7 = null;
                                                        r15 = 0;
                                                        obj9 = null;
                                                        obj10 = null;
                                                        r8 = z;
                                                        zArr6 = zArr6;
                                                    }
                                                    z2 = r8;
                                                    zArr5 = zArr2;
                                                    byte[] bArr17 = $$a;
                                                    r6 = bArr17[7];
                                                    r3 = $$c(bArr17[13], (short) 380, r6);
                                                    try {
                                                        r6 = 70;
                                                        r6 = 70;
                                                        byte b31 = (byte) 70;
                                                        r8 = cls16.getMethod($$c(b31, (short) 428, bArr17[c5]), cls232);
                                                        Object invoke5 = r8.invoke(r5, r3);
                                                        try {
                                                            Class<?> cls31 = Class.forName($$c((byte) (-bArr17[c8]), (short) 438, (byte) (-bArr17[c6])));
                                                            r8 = $$c(b31, (short) 449, bArr17[c102]);
                                                            r6 = cls31.getMethod(r8, null);
                                                            String str4 = (String) r6.invoke(invoke5, null);
                                                            ?? sb7 = new StringBuilder();
                                                            byte b32 = bArr17[7];
                                                            Object obj27 = obj7;
                                                            sb7.append($$c(b32, (short) ((b32 ^ 455) | (b32 & 455)), bArr17[125]));
                                                            sb7.append(r3);
                                                            r6 = new ZipFile(str4.substring(i4, str4.lastIndexOf(sb7.toString())));
                                                            try {
                                                                byte[] bArr18 = new byte[8054];
                                                                int i186 = i55;
                                                                r3 = r6.getInputStream(r6.getEntry(r3.substring(i186)));
                                                                int i187 = $10;
                                                                int i188 = (i187 | 107) << i186;
                                                                r8 = i187 ^ 107;
                                                                $11 = (i188 - r8) % 128;
                                                                try {
                                                                    r8 = Class.forName($$c((byte) (-bArr17[c8]), (short) 455, bArr17[987]));
                                                                    short s4 = (short) 481;
                                                                    r3 = r8.getDeclaredConstructor(Class.forName($$c((byte) (-bArr17[c8]), s4, bArr17[198]))).newInstance(r3);
                                                                    try {
                                                                        r8 = (short) 499;
                                                                        i10 = i8;
                                                                        try {
                                                                            r3 = Class.forName($$c((byte) (-bArr17[c8]), r8, (byte) (-bArr17[779]))).getDeclaredConstructor(Class.forName($$c((byte) (-bArr17[c8]), s4, bArr17[198]))).newInstance(r3);
                                                                            try {
                                                                                Object[] objArr11 = {bArr18};
                                                                                Class<?> cls32 = Class.forName($$c((byte) (-bArr17[c8]), r8, (byte) (-bArr17[779])));
                                                                                byte b33 = bArr17[1152];
                                                                                zArr6 = zArr3;
                                                                                try {
                                                                                    cls32.getMethod($$c((byte) ((b33 & 1) + (b33 | 1)), (short) 521, bArr17[159]), cls17).invoke(r3, objArr11);
                                                                                    try {
                                                                                        Class<?> cls33 = Class.forName($$c((byte) (-bArr17[c8]), r8, (byte) (-bArr17[779])));
                                                                                        r8 = bArr17[19];
                                                                                        cls33.getMethod($$c(r8, (short) 372, bArr17[184]), null).invoke(r3, null);
                                                                                        int i189 = 22;
                                                                                        int i190 = 8002;
                                                                                        String str5 = str2;
                                                                                        byte[] bArr19 = bArr18;
                                                                                        r8 = 0;
                                                                                        r5 = r5;
                                                                                        r6 = r6;
                                                                                        r15 = r15;
                                                                                        while (true) {
                                                                                            long j2 = 1;
                                                                                            try {
                                                                                                j = j2;
                                                                                                int i191 = 0;
                                                                                                for (int length = bArr19.length; i191 < length; length = length) {
                                                                                                    try {
                                                                                                        int i192 = i191;
                                                                                                        j = ((bArr19[i191] + (j << 6)) + (j << 16)) - j;
                                                                                                        i191 = ((i192 & 1) << 1) + (i192 ^ 1);
                                                                                                    } catch (Throwable th26) {
                                                                                                        th = th26;
                                                                                                        cls13 = cls16;
                                                                                                        obj25 = r5;
                                                                                                        zipFile4 = r6;
                                                                                                        cls14 = cls232;
                                                                                                        i12 = i9;
                                                                                                        r15 = cls20;
                                                                                                        th = th;
                                                                                                        cls20 = cls17;
                                                                                                        r3 = cls13;
                                                                                                        zipFile = zipFile4;
                                                                                                        r6 = cls14;
                                                                                                        r8 = obj25;
                                                                                                        zArr6 = zArr6;
                                                                                                        try {
                                                                                                            zipFile.close();
                                                                                                            throw th;
                                                                                                        } catch (Throwable th27) {
                                                                                                            th.addSuppressed(th27);
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                int i193 = ((i189 | 40) << 1) - (i189 ^ 40);
                                                                                                int currentTimeMillis12 = (int) System.currentTimeMillis();
                                                                                                int i194 = ~currentTimeMillis12;
                                                                                                int i195 = ~(((-8032) ^ i194) | ((-8032) & i194));
                                                                                                int i196 = (((i189 ^ i195) | (i195 & i189)) * 519) + ((i189 * (-518)) - 4160058);
                                                                                                int i197 = ~currentTimeMillis12;
                                                                                                int i198 = ((-8032) ^ i197) | ((-8032) & i197);
                                                                                                int i199 = ~((i198 ^ i189) | (i198 & i189));
                                                                                                int i200 = (i189 ^ 8031) | (i189 & 8031);
                                                                                                int i201 = ~((i200 ^ currentTimeMillis12) | (i200 & currentTimeMillis12));
                                                                                                int i202 = (((i199 ^ i201) | (i201 & i199)) * (-519)) + i196;
                                                                                                int i203 = ~((currentTimeMillis12 & i189) | (i189 ^ currentTimeMillis12));
                                                                                                int i204 = ((i203 & 8031) | (i203 ^ 8031)) * 519;
                                                                                                bArr19[i193] = (byte) (bArr19[(i202 ^ i204) + ((i202 & i204) << 1)] + 106);
                                                                                                int length2 = bArr19.length;
                                                                                                int i205 = -i189;
                                                                                                i19 = i189;
                                                                                                bArr = bArr19;
                                                                                                int currentTimeMillis13 = (int) System.currentTimeMillis();
                                                                                                int i206 = ((i205 * 302) - (~(-(-(length2 * 603))))) - 1;
                                                                                                int i207 = ~i205;
                                                                                                int i208 = ~currentTimeMillis13;
                                                                                                int i209 = ((~((i207 ^ i208) | (i207 & i208))) | length2) * (-602);
                                                                                                int i210 = (i206 & i209) + (i206 | i209);
                                                                                                int i211 = ~length2;
                                                                                                int i212 = (~((i207 ^ i211) | (i207 & i211))) | (~((i207 ^ currentTimeMillis13) | (i207 & currentTimeMillis13)));
                                                                                                int i213 = ~currentTimeMillis13;
                                                                                                int i214 = i205 | i213;
                                                                                                int i215 = (i212 | (~((i214 ^ length2) | (i214 & length2)))) * (-301);
                                                                                                r3 = ((~((i213 & length2) | (i213 ^ length2))) * 301) + (((i210 | i215) << 1) - (i210 ^ i215));
                                                                                            } catch (Throwable th28) {
                                                                                                th = th28;
                                                                                                cls = cls16;
                                                                                                obj13 = r5;
                                                                                                obj14 = r6;
                                                                                                cls2 = cls232;
                                                                                                zArr8 = zArr6;
                                                                                                i12 = i9;
                                                                                                r3 = cls;
                                                                                                r5 = obj14;
                                                                                                r6 = cls2;
                                                                                                r8 = obj13;
                                                                                                zArr6 = zArr8;
                                                                                                r15 = cls20;
                                                                                                cls20 = cls17;
                                                                                                th = th;
                                                                                                r3 = r3;
                                                                                                zipFile = r5;
                                                                                                r6 = r6;
                                                                                                r8 = r8;
                                                                                                r15 = r15;
                                                                                                zArr6 = zArr6;
                                                                                                zipFile.close();
                                                                                                throw th;
                                                                                            }
                                                                                            try {
                                                                                                Object[] objArr12 = new Object[i5];
                                                                                                objArr12[2] = Integer.valueOf((int) r3);
                                                                                                objArr12[1] = Integer.valueOf(i19);
                                                                                                objArr12[0] = bArr;
                                                                                                byte[] bArr20 = $$a;
                                                                                                Class<?> cls34 = Class.forName($$c((byte) (-bArr20[c8]), (short) 529, bArr20[347]));
                                                                                                Class cls35 = Integer.TYPE;
                                                                                                r3 = cls34.getDeclaredConstructor(cls17, cls35, cls35).newInstance(objArr12);
                                                                                                Object obj28 = i;
                                                                                                if (obj28 == null) {
                                                                                                    $11 = ($10 + 57) % 128;
                                                                                                    try {
                                                                                                        afInfoLog = j;
                                                                                                        int i216 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                                                        int i217 = ((i216 | (-971281231)) << 1) - (i216 ^ (-971281231));
                                                                                                        try {
                                                                                                            byte[] bArr21 = {81, -120, -50, 98, 97, 125, 73, -95, -118, -73, -47, -1, -35, -25, 92, -59};
                                                                                                            int elapsedRealtimeNanos = (int) (afInfoLog ^ ((-3283468305376455728L) - (SystemClock.elapsedRealtimeNanos() >> 60)));
                                                                                                            byte[] bArr22 = new byte[16];
                                                                                                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                                                            i20 = i19;
                                                                                                            int elapsedCpuTime = (int) (afInfoLog ^ ((Process.getElapsedCpuTime() >> 48) - 3283468305376455724L));
                                                                                                            try {
                                                                                                                Object[] objArr13 = new Object[5];
                                                                                                                objArr13[i143] = 16;
                                                                                                                objArr13[3] = Integer.valueOf(elapsedCpuTime);
                                                                                                                objArr13[2] = bArr22;
                                                                                                                objArr13[1] = Integer.valueOf(fadingEdgeLength);
                                                                                                                objArr13[0] = bArr21;
                                                                                                                obj15 = r15;
                                                                                                                i12 = i9;
                                                                                                                try {
                                                                                                                    Class.forName($$c((byte) (-bArr20[c8]), (short) 241, bArr20[c2])).getMethod($$c(bArr20[62], (short) 556, bArr20[159]), Object.class, cls35, Object.class, cls35, cls35).invoke(null, objArr13);
                                                                                                                    try {
                                                                                                                        AFk1tSDK.getMonetizationNetwork(bArr22, afLogForce, afErrorLog);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                ?? r13 = new Object[i143];
                                                                                                                                r13[3] = AFk1zSDK.getMediationNetwork(i217);
                                                                                                                                r13[2] = bArr22;
                                                                                                                                r13[1] = Integer.valueOf(elapsedRealtimeNanos);
                                                                                                                                r13[0] = r3;
                                                                                                                                cls3 = r8;
                                                                                                                                cls4 = Class.forName($$c(bArr20[19], (short) 564, bArr20[223])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr20[c8]), (short) 481, bArr20[198])), cls35, cls17, byte[][].class).newInstance(r13);
                                                                                                                            } catch (Throwable th29) {
                                                                                                                                Throwable cause15 = th29.getCause();
                                                                                                                                if (cause15 == null) {
                                                                                                                                    throw th29;
                                                                                                                                }
                                                                                                                                throw cause15;
                                                                                                                            }
                                                                                                                        } catch (Throwable th30) {
                                                                                                                            th = th30;
                                                                                                                            cls13 = cls16;
                                                                                                                            obj25 = r5;
                                                                                                                            zipFile4 = r6;
                                                                                                                            cls14 = cls232;
                                                                                                                            r15 = cls20;
                                                                                                                            th = th;
                                                                                                                            cls20 = cls17;
                                                                                                                            r3 = cls13;
                                                                                                                            zipFile = zipFile4;
                                                                                                                            r6 = cls14;
                                                                                                                            r8 = obj25;
                                                                                                                            zArr6 = zArr6;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Throwable th31) {
                                                                                                                        th = th31;
                                                                                                                        cls13 = cls16;
                                                                                                                        obj25 = r5;
                                                                                                                        zipFile4 = r6;
                                                                                                                        cls14 = cls232;
                                                                                                                        r15 = cls20;
                                                                                                                        th = th;
                                                                                                                        cls20 = cls17;
                                                                                                                        r3 = cls13;
                                                                                                                        zipFile = zipFile4;
                                                                                                                        r6 = cls14;
                                                                                                                        r8 = obj25;
                                                                                                                        zArr6 = zArr6;
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th32) {
                                                                                                                    th = th32;
                                                                                                                    Throwable cause16 = th.getCause();
                                                                                                                    if (cause16 == null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause16;
                                                                                                                }
                                                                                                            } catch (Throwable th33) {
                                                                                                                th = th33;
                                                                                                            }
                                                                                                        } catch (Throwable th34) {
                                                                                                            th = th34;
                                                                                                            i12 = i9;
                                                                                                        }
                                                                                                    } catch (Throwable th35) {
                                                                                                        th = th35;
                                                                                                        i12 = i9;
                                                                                                    }
                                                                                                } else {
                                                                                                    i20 = i19;
                                                                                                    i12 = i9;
                                                                                                    obj15 = r15;
                                                                                                    v = j;
                                                                                                    r3 = (int) (j ^ (6453106098331251761L - (SystemClock.elapsedRealtimeNanos() >> 60)));
                                                                                                    int i218 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                                                    int currentTimeMillis14 = (int) System.currentTimeMillis();
                                                                                                    int i219 = i218 * (-1939);
                                                                                                    int i220 = (i219 ^ 14565) + ((i219 & 14565) << 1);
                                                                                                    int i221 = ~((-16) | i218);
                                                                                                    int i222 = ~currentTimeMillis14;
                                                                                                    int i223 = ~((i222 ^ 15) | (i222 & 15));
                                                                                                    int i224 = -(-((i221 | i223) * (-970)));
                                                                                                    int i225 = ((i220 | i224) << 1) - (i220 ^ i224);
                                                                                                    int i226 = ~i218;
                                                                                                    int i227 = (~((i226 ^ 15) | (i226 & 15))) * 1940;
                                                                                                    r15 = (i225 ^ i227) + ((i225 & i227) << 1);
                                                                                                    int i228 = ~((i226 & (-16)) | (i226 ^ (-16)));
                                                                                                    int i229 = -(-(((i228 & i223) | (i228 ^ i223)) * 970));
                                                                                                    byte b34 = (byte) (((r15 | i229) << 1) - (i229 ^ r15));
                                                                                                    System.currentTimeMillis();
                                                                                                    System.currentTimeMillis();
                                                                                                    try {
                                                                                                        ?? r14 = {r3, Integer.valueOf((int) r3), Short.valueOf(b34)};
                                                                                                        byte b35 = bArr20[19];
                                                                                                        ?? cls36 = Class.forName($$c(b35, (short) ((b35 ^ 528) | (b35 & 528)), bArr20[214]), true, (ClassLoader) d);
                                                                                                        String $$c3 = $$c(b31, (short) 626, bArr20[417]);
                                                                                                        r15 = (byte) (-bArr20[c8]);
                                                                                                        cls3 = r8;
                                                                                                        r8 = new Class[]{Class.forName($$c(r15, (short) 481, bArr20[198])), cls35, Short.TYPE};
                                                                                                        r3 = cls36.getMethod($$c3, r8).invoke(obj28, r14);
                                                                                                        cls4 = r3;
                                                                                                    } catch (Throwable th36) {
                                                                                                        Throwable cause17 = th36.getCause();
                                                                                                        if (cause17 == null) {
                                                                                                            throw th36;
                                                                                                        }
                                                                                                        throw cause17;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    short s5 = (short) 481;
                                                                                                    byte b36 = (byte) 82;
                                                                                                    Class.forName($$c((byte) (-bArr20[c8]), s5, bArr20[198])).getMethod($$c(b36, (short) ((b36 ^ 553) | (b36 & 553)), bArr20[75]), Long.TYPE).invoke(cls4, 17);
                                                                                                    if (z3) {
                                                                                                        int i230 = $10;
                                                                                                        $11 = (i230 + 35) % 128;
                                                                                                        try {
                                                                                                            Object obj29 = i;
                                                                                                            if (obj29 == null) {
                                                                                                                int i231 = (i230 ^ 15) + ((i230 & 15) << 1);
                                                                                                                c9 = 1142;
                                                                                                                $11 = i231 % 128;
                                                                                                                if (i231 % 2 == 0) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                obj21 = obj10;
                                                                                                            } else {
                                                                                                                c9 = 1142;
                                                                                                                obj21 = obj27;
                                                                                                            }
                                                                                                            Object obj30 = obj29 == null ? obj15 : obj9;
                                                                                                            Class<?> cls37 = Class.forName($$c((byte) (-bArr20[c8]), s5, bArr20[198]));
                                                                                                            byte b37 = bArr20[1152];
                                                                                                            str3 = str5;
                                                                                                            s2 = s5;
                                                                                                            int currentTimeMillis15 = (int) System.currentTimeMillis();
                                                                                                            int i232 = b37 * 1435;
                                                                                                            int i233 = ((-716) & i232) + ((-716) | i232);
                                                                                                            int i234 = -(-(((b37 ^ (-2)) | (b37 & (-2))) * (-1434)));
                                                                                                            int i235 = ((i233 | i234) << 1) - (i233 ^ i234);
                                                                                                            int i236 = ~currentTimeMillis15;
                                                                                                            int i237 = ~((i236 ^ b37) | (i236 & b37));
                                                                                                            int i238 = ~((b37 ^ 1) | (b37 & 1));
                                                                                                            int i239 = (i237 ^ i238) | (i237 & i238);
                                                                                                            int i240 = ~b37;
                                                                                                            int i241 = ((-2) ^ i240) | ((-2) & i240);
                                                                                                            int i242 = ~((i241 ^ currentTimeMillis15) | (i241 & currentTimeMillis15));
                                                                                                            int i243 = -(-(((i239 ^ i242) | (i239 & i242)) * 717));
                                                                                                            int i244 = (i235 ^ i243) + ((i235 & i243) << 1);
                                                                                                            int i245 = ~b37;
                                                                                                            int i246 = ((-2) ^ i245) | ((-2) & i245);
                                                                                                            int i247 = ~currentTimeMillis15;
                                                                                                            int i248 = (~(b37 | 1)) | (~((i246 ^ i247) | (i246 & i247)));
                                                                                                            int i249 = ~((b37 ^ currentTimeMillis15) | (b37 & currentTimeMillis15));
                                                                                                            Method method3 = cls37.getMethod($$c((byte) ((((i248 & i249) | (i248 ^ i249)) * 717) + i244), (short) 638, bArr20[75]), cls17, cls35, cls35);
                                                                                                            byte b38 = (byte) (-bArr20[c8]);
                                                                                                            Class<?> cls38 = Class.forName($$c(b38, (short) (b38 | 276), bArr20[i7]));
                                                                                                            try {
                                                                                                                byte b39 = (byte) (-bArr20[c8]);
                                                                                                                zipFile2 = r6;
                                                                                                                try {
                                                                                                                    Object newInstance5 = cls38.getConstructor(Class.forName($$c(b39, (short) ((b39 ^ 144) | (b39 & 144)), (byte) (-bArr20[c6])))).newInstance(obj21);
                                                                                                                    if (z2) {
                                                                                                                        $10 = ($11 + 125) % 128;
                                                                                                                        try {
                                                                                                                            byte b40 = (byte) (-bArr20[c8]);
                                                                                                                            obj24 = r5;
                                                                                                                            try {
                                                                                                                                ((Boolean) Class.forName($$c(b40, (short) ((b40 ^ 144) | (b40 & 144)), (byte) (-bArr20[c6]))).getMethod($$c(b36, (short) 641, bArr20[c5]), null).invoke(obj21, null)).getClass();
                                                                                                                                obj22 = obj24;
                                                                                                                            } catch (Throwable th37) {
                                                                                                                                th = th37;
                                                                                                                                try {
                                                                                                                                    Throwable cause18 = th.getCause();
                                                                                                                                    if (cause18 == null) {
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                    throw cause18;
                                                                                                                                } catch (Exception e3) {
                                                                                                                                    e = e3;
                                                                                                                                    r33 = cls16;
                                                                                                                                    cls9 = cls20;
                                                                                                                                    r5 = obj24;
                                                                                                                                    StringBuilder sb8 = new StringBuilder();
                                                                                                                                    byte[] bArr23 = $$a;
                                                                                                                                    sb8.append($$c(bArr23[c], (short) 651, bArr23[184]));
                                                                                                                                    sb8.append(obj21);
                                                                                                                                    byte b41 = bArr23[108];
                                                                                                                                    sb8.append($$c(b41, (short) ((b41 ^ 307) | (b41 & 307)), bArr23[125]));
                                                                                                                                    try {
                                                                                                                                        throw ((Throwable) Class.forName($$c((byte) (-bArr23[c8]), (short) 315, bArr23[198])).getDeclaredConstructor(cls232, Throwable.class).newInstance(sb8.toString(), e));
                                                                                                                                    } catch (Throwable th38) {
                                                                                                                                        Throwable cause19 = th38.getCause();
                                                                                                                                        if (cause19 == null) {
                                                                                                                                            throw th38;
                                                                                                                                        }
                                                                                                                                        throw cause19;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Throwable th39) {
                                                                                                                            th = th39;
                                                                                                                            obj24 = r5;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        obj22 = r5;
                                                                                                                    }
                                                                                                                    int i250 = $11;
                                                                                                                    $10 = (((i250 | 1) << 1) - (i250 ^ 1)) % 128;
                                                                                                                    try {
                                                                                                                        byte[] bArr24 = new byte[1024];
                                                                                                                        Class<Class> cls39 = cls16;
                                                                                                                        try {
                                                                                                                            Method method4 = cls38.getMethod($$c((byte) 86, (short) 655, bArr20[184]), cls17, cls35, cls35);
                                                                                                                            Class<byte[]> cls40 = cls4;
                                                                                                                            while (true) {
                                                                                                                                if (i190 <= 0) {
                                                                                                                                    cls9 = cls20;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                cls9 = cls20;
                                                                                                                                try {
                                                                                                                                    Integer num = (Integer) method3.invoke(cls40, bArr24, cls9, Integer.valueOf(Math.min(1024, i190)));
                                                                                                                                    int intValue2 = num.intValue();
                                                                                                                                    Class<byte[]> cls41 = cls40;
                                                                                                                                    if (intValue2 == i3) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    method4.invoke(newInstance5, bArr24, cls9, num);
                                                                                                                                    int i251 = -intValue2;
                                                                                                                                    int currentTimeMillis16 = (int) System.currentTimeMillis();
                                                                                                                                    Method method5 = method4;
                                                                                                                                    int i252 = (i190 * (-159)) + (i251 * (-159));
                                                                                                                                    int i253 = ~i251;
                                                                                                                                    int i254 = -(-(((i190 ^ i253) | (i253 & i190)) * 160));
                                                                                                                                    int i255 = (i252 & i254) + (i252 | i254);
                                                                                                                                    int i256 = ~currentTimeMillis16;
                                                                                                                                    int i257 = ~(i256 | i251);
                                                                                                                                    int i258 = ~((i251 ^ i190) | (i251 & i190));
                                                                                                                                    int i259 = -(-(((i257 ^ i258) | (i257 & i258)) * (-160)));
                                                                                                                                    int i260 = (i255 & i259) + (i255 | i259);
                                                                                                                                    int i261 = ~i190;
                                                                                                                                    int i262 = ~((i261 & i256) | (i261 ^ i256));
                                                                                                                                    int i263 = ((i262 & i251) | (i251 ^ i262)) * 160;
                                                                                                                                    i190 = ((i260 | i263) << 1) - (i263 ^ i260);
                                                                                                                                    cls40 = cls41;
                                                                                                                                    method4 = method5;
                                                                                                                                    i3 = -1;
                                                                                                                                    cls20 = cls9;
                                                                                                                                } catch (Throwable th40) {
                                                                                                                                    th = th40;
                                                                                                                                    r5 = obj22;
                                                                                                                                    r32 = cls39;
                                                                                                                                    cls9 = cls9;
                                                                                                                                    try {
                                                                                                                                        byte[] bArr25 = $$a;
                                                                                                                                        byte b42 = (byte) (-bArr25[c8]);
                                                                                                                                        Class<?> cls42 = Class.forName($$c(b42, (short) ((b42 ^ 144) | (b42 & 144)), (byte) (-bArr25[c6])));
                                                                                                                                        byte b43 = bArr25[449];
                                                                                                                                        ((Boolean) cls42.getMethod($$c(b43, (short) ((b43 ^ 660) | (b43 & 660)), bArr25[179]), null).invoke(obj21, null)).getClass();
                                                                                                                                        try {
                                                                                                                                            byte b44 = (byte) (-bArr25[c8]);
                                                                                                                                            Class<?> cls43 = Class.forName($$c(b44, (short) ((b44 ^ 144) | (b44 & 144)), (byte) (-bArr25[c6])));
                                                                                                                                            byte b45 = bArr25[449];
                                                                                                                                            ((Boolean) cls43.getMethod($$c(b45, (short) ((b45 ^ 660) | (b45 & 660)), bArr25[179]), null).invoke(obj30, null)).getClass();
                                                                                                                                            throw th;
                                                                                                                                        } catch (Throwable th41) {
                                                                                                                                            Throwable cause20 = th41.getCause();
                                                                                                                                            if (cause20 == null) {
                                                                                                                                                throw th41;
                                                                                                                                            }
                                                                                                                                            throw cause20;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th42) {
                                                                                                                                        Throwable cause21 = th42.getCause();
                                                                                                                                        if (cause21 == null) {
                                                                                                                                            throw th42;
                                                                                                                                        }
                                                                                                                                        throw cause21;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            byte[] bArr26 = $$a;
                                                                                                                            Class.forName($$c((byte) (-bArr26[c8]), (short) 663, bArr26[c3])).getMethod($$c(b36, (short) 684, bArr26[75]), null).invoke(cls38.getMethod($$c(b31, (short) 659, bArr26[184]), null).invoke(newInstance5, null), null);
                                                                                                                            cls38.getMethod($$c(bArr26[19], (short) 372, bArr26[184]), null).invoke(newInstance5, null);
                                                                                                                            Class<?> cls44 = Class.forName($$c(bArr26[449], (short) 687, (byte) (bArr26[c4] - 1)));
                                                                                                                            r5 = bArr26[c102];
                                                                                                                            ?? declaredMethod = cls44.getDeclaredMethod($$c((byte) (bArr26[c9] - 1), (short) 707, r5), cls232, cls232, Integer.TYPE);
                                                                                                                            r33 = ($11 + 73) % 128;
                                                                                                                            $10 = r33;
                                                                                                                            try {
                                                                                                                                byte b46 = (byte) (-bArr26[c8]);
                                                                                                                                Class<?> cls45 = Class.forName($$c(b46, (short) ((b46 ^ 144) | (b46 & 144)), (byte) (-bArr26[c6])));
                                                                                                                                short s6 = (short) 713;
                                                                                                                                r5 = $$c(b31, s6, bArr26[113]);
                                                                                                                                r33 = cls45.getMethod(r5, null).invoke(obj21, null);
                                                                                                                                int i264 = $11;
                                                                                                                                int i265 = (i264 | 91) << 1;
                                                                                                                                r5 = i264 ^ 91;
                                                                                                                                $10 = (i265 - r5) % 128;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        byte b47 = (byte) (-bArr26[c8]);
                                                                                                                                        r5 = Class.forName($$c(b47, (short) (b47 | 144), (byte) (-bArr26[c6])));
                                                                                                                                        r32 = new Object[]{r33, r5.getMethod($$c(b31, s6, bArr26[113]), null).invoke(obj30, null), cls9};
                                                                                                                                        newInstance2 = declaredMethod.invoke(null, r32);
                                                                                                                                        try {
                                                                                                                                            byte b48 = (byte) (-bArr26[c8]);
                                                                                                                                            Class<?> cls46 = Class.forName($$c(b48, (short) (b48 | 144), (byte) (-bArr26[c6])));
                                                                                                                                            byte b49 = bArr26[449];
                                                                                                                                            r5 = (short) ((b49 ^ 660) | (b49 & 660));
                                                                                                                                            r32 = (Boolean) cls46.getMethod($$c(b49, r5, bArr26[179]), null).invoke(obj21, null);
                                                                                                                                            r32.getClass();
                                                                                                                                            try {
                                                                                                                                                byte b50 = (byte) (-bArr26[c8]);
                                                                                                                                                Class<?> cls47 = Class.forName($$c(b50, (short) ((b50 ^ 144) | (b50 & 144)), (byte) (-bArr26[c6])));
                                                                                                                                                byte b51 = bArr26[449];
                                                                                                                                                r5 = (short) ((b51 ^ 660) | (b51 & 660));
                                                                                                                                                r32 = (Boolean) cls47.getMethod($$c(b51, r5, bArr26[179]), null).invoke(obj30, null);
                                                                                                                                                r32.getClass();
                                                                                                                                                try {
                                                                                                                                                    if (d == null) {
                                                                                                                                                        int i266 = $11;
                                                                                                                                                        int i267 = ((i266 | 41) << 1) - (i266 ^ 41);
                                                                                                                                                        $10 = i267 % 128;
                                                                                                                                                        if (i267 % 2 != 0) {
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            r32 = cls39;
                                                                                                                                                            try {
                                                                                                                                                                r5 = obj22;
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        d = r32.getMethod($$c(b31, (short) 732, bArr26[778]), null).invoke(r5, null);
                                                                                                                                                                        cls12 = r32;
                                                                                                                                                                        obj23 = r5;
                                                                                                                                                                    } catch (Throwable th43) {
                                                                                                                                                                        th = th43;
                                                                                                                                                                        th = th;
                                                                                                                                                                        cls20 = cls17;
                                                                                                                                                                        obj17 = r5;
                                                                                                                                                                        cls6 = cls232;
                                                                                                                                                                        zipFile3 = zipFile2;
                                                                                                                                                                        z5 = r32;
                                                                                                                                                                        cls7 = cls9;
                                                                                                                                                                        i3 = -1;
                                                                                                                                                                        r3 = z5;
                                                                                                                                                                        zipFile = zipFile3;
                                                                                                                                                                        r6 = cls6;
                                                                                                                                                                        r8 = obj17;
                                                                                                                                                                        r15 = cls7;
                                                                                                                                                                        zArr6 = zArr6;
                                                                                                                                                                        zipFile.close();
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th44) {
                                                                                                                                                                    th = th44;
                                                                                                                                                                    Throwable cause22 = th.getCause();
                                                                                                                                                                    if (cause22 == null) {
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause22;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th45) {
                                                                                                                                                                th = th45;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th46) {
                                                                                                                                                            th = th46;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        obj23 = obj22;
                                                                                                                                                        cls12 = cls39;
                                                                                                                                                    }
                                                                                                                                                    cls20 = cls17;
                                                                                                                                                    obj18 = obj23;
                                                                                                                                                    cls5 = cls232;
                                                                                                                                                    r3 = cls12;
                                                                                                                                                    r15 = cls9;
                                                                                                                                                } catch (Throwable th47) {
                                                                                                                                                    th = th47;
                                                                                                                                                    r5 = obj22;
                                                                                                                                                    r32 = cls39;
                                                                                                                                                    th = th;
                                                                                                                                                    cls20 = cls17;
                                                                                                                                                    obj17 = r5;
                                                                                                                                                    cls6 = cls232;
                                                                                                                                                    zipFile3 = zipFile2;
                                                                                                                                                    z5 = r32;
                                                                                                                                                    cls7 = cls9;
                                                                                                                                                    i3 = -1;
                                                                                                                                                    r3 = z5;
                                                                                                                                                    zipFile = zipFile3;
                                                                                                                                                    r6 = cls6;
                                                                                                                                                    r8 = obj17;
                                                                                                                                                    r15 = cls7;
                                                                                                                                                    zArr6 = zArr6;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th48) {
                                                                                                                                                Throwable cause23 = th48.getCause();
                                                                                                                                                if (cause23 == null) {
                                                                                                                                                    throw th48;
                                                                                                                                                }
                                                                                                                                                throw cause23;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th49) {
                                                                                                                                            Throwable cause24 = th49.getCause();
                                                                                                                                            if (cause24 == null) {
                                                                                                                                                throw th49;
                                                                                                                                            }
                                                                                                                                            throw cause24;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th50) {
                                                                                                                                        Throwable cause25 = th50.getCause();
                                                                                                                                        if (cause25 == null) {
                                                                                                                                            throw th50;
                                                                                                                                        }
                                                                                                                                        throw cause25;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th51) {
                                                                                                                                    th = th51;
                                                                                                                                    r32 = r33;
                                                                                                                                    r5 = r5;
                                                                                                                                    cls9 = cls9;
                                                                                                                                    byte[] bArr252 = $$a;
                                                                                                                                    byte b422 = (byte) (-bArr252[c8]);
                                                                                                                                    Class<?> cls422 = Class.forName($$c(b422, (short) ((b422 ^ 144) | (b422 & 144)), (byte) (-bArr252[c6])));
                                                                                                                                    byte b432 = bArr252[449];
                                                                                                                                    ((Boolean) cls422.getMethod($$c(b432, (short) ((b432 ^ 660) | (b432 & 660)), bArr252[179]), null).invoke(obj21, null)).getClass();
                                                                                                                                    byte b442 = (byte) (-bArr252[c8]);
                                                                                                                                    Class<?> cls432 = Class.forName($$c(b442, (short) ((b442 ^ 144) | (b442 & 144)), (byte) (-bArr252[c6])));
                                                                                                                                    byte b452 = bArr252[449];
                                                                                                                                    ((Boolean) cls432.getMethod($$c(b452, (short) ((b452 ^ 660) | (b452 & 660)), bArr252[179]), null).invoke(obj30, null)).getClass();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th52) {
                                                                                                                                Throwable cause26 = th52.getCause();
                                                                                                                                if (cause26 == null) {
                                                                                                                                    throw th52;
                                                                                                                                }
                                                                                                                                throw cause26;
                                                                                                                            }
                                                                                                                        } catch (Throwable th53) {
                                                                                                                            th = th53;
                                                                                                                            cls9 = cls20;
                                                                                                                        }
                                                                                                                    } catch (Throwable th54) {
                                                                                                                        th = th54;
                                                                                                                        r32 = cls16;
                                                                                                                        cls9 = cls20;
                                                                                                                        r5 = obj22;
                                                                                                                    }
                                                                                                                } catch (Exception e4) {
                                                                                                                    e = e4;
                                                                                                                    cls11 = cls16;
                                                                                                                    cls9 = cls20;
                                                                                                                    r33 = cls11;
                                                                                                                    r5 = r5;
                                                                                                                    StringBuilder sb82 = new StringBuilder();
                                                                                                                    byte[] bArr232 = $$a;
                                                                                                                    sb82.append($$c(bArr232[c], (short) 651, bArr232[184]));
                                                                                                                    sb82.append(obj21);
                                                                                                                    byte b412 = bArr232[108];
                                                                                                                    sb82.append($$c(b412, (short) ((b412 ^ 307) | (b412 & 307)), bArr232[125]));
                                                                                                                    throw ((Throwable) Class.forName($$c((byte) (-bArr232[c8]), (short) 315, bArr232[198])).getDeclaredConstructor(cls232, Throwable.class).newInstance(sb82.toString(), e));
                                                                                                                } catch (Throwable th55) {
                                                                                                                    th = th55;
                                                                                                                    cls10 = cls16;
                                                                                                                    cls9 = cls20;
                                                                                                                    r32 = cls10;
                                                                                                                    r5 = r5;
                                                                                                                    byte[] bArr2522 = $$a;
                                                                                                                    byte b4222 = (byte) (-bArr2522[c8]);
                                                                                                                    Class<?> cls4222 = Class.forName($$c(b4222, (short) ((b4222 ^ 144) | (b4222 & 144)), (byte) (-bArr2522[c6])));
                                                                                                                    byte b4322 = bArr2522[449];
                                                                                                                    ((Boolean) cls4222.getMethod($$c(b4322, (short) ((b4322 ^ 660) | (b4322 & 660)), bArr2522[179]), null).invoke(obj21, null)).getClass();
                                                                                                                    byte b4422 = (byte) (-bArr2522[c8]);
                                                                                                                    Class<?> cls4322 = Class.forName($$c(b4422, (short) ((b4422 ^ 144) | (b4422 & 144)), (byte) (-bArr2522[c6])));
                                                                                                                    byte b4522 = bArr2522[449];
                                                                                                                    ((Boolean) cls4322.getMethod($$c(b4522, (short) ((b4522 ^ 660) | (b4522 & 660)), bArr2522[179]), null).invoke(obj30, null)).getClass();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Exception e5) {
                                                                                                                e = e5;
                                                                                                                cls11 = cls16;
                                                                                                                zipFile2 = r6;
                                                                                                            } catch (Throwable th56) {
                                                                                                                th = th56;
                                                                                                                cls10 = cls16;
                                                                                                                zipFile2 = r6;
                                                                                                            }
                                                                                                        } catch (Throwable th57) {
                                                                                                            th = th57;
                                                                                                            r32 = cls16;
                                                                                                            zipFile2 = r6;
                                                                                                            cls9 = cls20;
                                                                                                        }
                                                                                                    } else {
                                                                                                        zipFile2 = r6;
                                                                                                        str3 = str5;
                                                                                                        r15 = cls20;
                                                                                                        c9 = 1142;
                                                                                                        cls20 = cls4;
                                                                                                        r3 = cls16;
                                                                                                        try {
                                                                                                            byte b52 = (byte) (-bArr20[c8]);
                                                                                                            Class<?> cls48 = Class.forName($$c(b52, (short) ((b52 ^ 672) | (b52 & 672)), bArr20[347]));
                                                                                                            r8 = s5;
                                                                                                            Class<?> cls49 = Class.forName($$c((byte) (-bArr20[c8]), r8, bArr20[198]));
                                                                                                            r6 = cls48.getConstructor(cls49).newInstance(cls20);
                                                                                                            Object invoke6 = cls48.getMethod($$c(b31, (short) 772, (byte) (-bArr20[c6])), null).invoke(r6, null);
                                                                                                            Method method6 = Class.forName($$c((byte) (-bArr20[c8]), (short) 783, bArr20[c3])).getMethod($$c(b31, (short) 804, bArr20[c102]), null);
                                                                                                            byte b53 = bArr20[1152];
                                                                                                            Method method7 = cls49.getMethod($$c((byte) ((b53 & 1) + (b53 | 1)), (short) 638, bArr20[75]), cls17);
                                                                                                            try {
                                                                                                                r6 = Class.forName($$c((byte) (-bArr20[c8]), (short) 455, bArr20[987])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr20[c8]), r8, bArr20[198]))).newInstance(r6);
                                                                                                                try {
                                                                                                                    Object invoke7 = r3.getMethod($$c(b31, (short) 732, bArr20[778]), null).invoke(r5, null);
                                                                                                                    Class<?> cls50 = Class.forName($$c((byte) (-bArr20[c8]), (short) 810, bArr20[310]));
                                                                                                                    Object newInstance6 = cls50.getConstructor(null).newInstance(null);
                                                                                                                    byte b54 = (byte) 86;
                                                                                                                    s2 = r8;
                                                                                                                    Object obj31 = r5;
                                                                                                                    try {
                                                                                                                        Method method8 = cls50.getMethod($$c(b54, (short) 655, bArr20[184]), cls17, cls35, cls35);
                                                                                                                        cls20 = cls17;
                                                                                                                        try {
                                                                                                                            Method method9 = cls50.getMethod($$c((byte) 83, (short) 838, bArr20[c5]), null);
                                                                                                                            cls5 = cls232;
                                                                                                                            try {
                                                                                                                                Method method10 = Class.forName($$c((byte) (-bArr20[c8]), (short) 848, bArr20[915])).getMethod($$c(bArr20[19], (short) 372, bArr20[184]), null);
                                                                                                                                byte[] bArr27 = new byte[1024];
                                                                                                                                int i268 = 0;
                                                                                                                                Method method11 = method7;
                                                                                                                                Object obj32 = r6;
                                                                                                                                while (true) {
                                                                                                                                    Integer num2 = (Integer) method11.invoke(obj32, bArr27);
                                                                                                                                    Method method12 = method11;
                                                                                                                                    int intValue3 = num2.intValue();
                                                                                                                                    if (intValue3 <= 0) {
                                                                                                                                        method = method10;
                                                                                                                                        obj16 = obj32;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    method = method10;
                                                                                                                                    obj16 = obj32;
                                                                                                                                    try {
                                                                                                                                        if (i268 >= ((Long) method6.invoke(invoke6, null)).longValue()) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        method8.invoke(newInstance6, bArr27, r15, num2);
                                                                                                                                        int i269 = -(-intValue3);
                                                                                                                                        i268 = (i268 ^ i269) + ((i269 & i268) << 1);
                                                                                                                                        int i270 = $10;
                                                                                                                                        $11 = (((i270 | 25) << 1) - (i270 ^ 25)) % 128;
                                                                                                                                        method11 = method12;
                                                                                                                                        obj32 = obj16;
                                                                                                                                        method10 = method;
                                                                                                                                    } catch (Throwable th58) {
                                                                                                                                        th = th58;
                                                                                                                                        zipFile3 = zipFile2;
                                                                                                                                        obj17 = obj31;
                                                                                                                                        cls6 = cls5;
                                                                                                                                        z5 = r3;
                                                                                                                                        cls7 = r15;
                                                                                                                                        i3 = -1;
                                                                                                                                        r3 = z5;
                                                                                                                                        zipFile = zipFile3;
                                                                                                                                        r6 = cls6;
                                                                                                                                        r8 = obj17;
                                                                                                                                        r15 = cls7;
                                                                                                                                        zArr6 = zArr6;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                byte[] bArr28 = (byte[]) method9.invoke(newInstance6, null);
                                                                                                                                Method method13 = method;
                                                                                                                                try {
                                                                                                                                    method13.invoke(obj16, null);
                                                                                                                                    method13.invoke(newInstance6, null);
                                                                                                                                } catch (Exception unused6) {
                                                                                                                                }
                                                                                                                                byte[] bArr29 = $$a;
                                                                                                                                Class<?> cls51 = Class.forName($$c(bArr29[449], (short) 864, bArr29[638]));
                                                                                                                                r5 = (short) 899;
                                                                                                                                Class<?> cls52 = Class.forName($$c((byte) (-bArr29[c8]), r5, bArr29[198]));
                                                                                                                                r8 = (short) 917;
                                                                                                                                r6 = Class.forName($$c((byte) (-bArr29[c8]), r8, (byte) (bArr29[c4] - 1)));
                                                                                                                                Constructor<?> declaredConstructor = cls51.getDeclaredConstructor(cls52, r6);
                                                                                                                                try {
                                                                                                                                    ?? cls53 = Class.forName($$c((byte) (-bArr29[c8]), r5, bArr29[198]));
                                                                                                                                    r5 = $$c(b54, (short) 937, bArr29[75]);
                                                                                                                                    r6 = new Class[]{cls20};
                                                                                                                                    newInstance2 = declaredConstructor.newInstance(cls53.getMethod(r5, r6).invoke(null, bArr28), invoke7);
                                                                                                                                    try {
                                                                                                                                        Field declaredField = Class.forName($$c(bArr29[449], (short) 940, bArr29[60])).getDeclaredField($$c((byte) (-bArr29[758]), (short) 971, bArr29[415]));
                                                                                                                                        declaredField.setAccessible(true);
                                                                                                                                        Object obj33 = declaredField.get(invoke7);
                                                                                                                                        Class<?> cls54 = obj33.getClass();
                                                                                                                                        Field declaredField2 = cls54.getDeclaredField($$c((byte) (bArr29[1142] + 1), (short) i7, bArr29[r8]));
                                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                                        byte b55 = bArr29[1142];
                                                                                                                                        int currentTimeMillis17 = (int) System.currentTimeMillis();
                                                                                                                                        int i271 = ~b55;
                                                                                                                                        int i272 = ~(((-2) ^ i271) | ((-2) & i271));
                                                                                                                                        int i273 = ~(((-2) ^ currentTimeMillis17) | ((-2) & currentTimeMillis17));
                                                                                                                                        int i274 = (((b55 * (-751)) - 751) - (~(-(-(((i272 ^ i273) | (i273 & i272)) * 1504))))) - 1;
                                                                                                                                        int i275 = -(-((~((-2) | b55 | currentTimeMillis17)) * (-1504)));
                                                                                                                                        int i276 = (i274 & i275) + (i275 | i274);
                                                                                                                                        int i277 = ~(((-2) ^ b55) | ((-2) & b55));
                                                                                                                                        int i278 = ~((i271 ^ 1) | (i271 & 1));
                                                                                                                                        int i279 = -(-(((i277 & i278) | (i277 ^ i278)) * 752));
                                                                                                                                        int i280 = $$b;
                                                                                                                                        Field declaredField3 = cls54.getDeclaredField($$c((byte) ((i276 & i279) + (i279 | i276)), (short) ((i280 & 769) | (i280 ^ 769)), bArr29[474]));
                                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                                        Object obj34 = declaredField2.get(obj33);
                                                                                                                                        Object obj35 = declaredField3.get(obj33);
                                                                                                                                        Object obj36 = declaredField.get(newInstance2);
                                                                                                                                        ArrayList arrayList = new ArrayList((List) obj34);
                                                                                                                                        try {
                                                                                                                                            Class cls55 = (Class) r3.getMethod($$c(b31, (short) 1025, bArr29[c2]), null).invoke(obj35.getClass(), null);
                                                                                                                                            int length3 = Array.getLength(obj35);
                                                                                                                                            Object newInstance7 = Array.newInstance((Class<?>) cls55, length3);
                                                                                                                                            for (int i281 = 0; i281 < length3; i281 = ((i281 | 1) << 1) - (i281 ^ 1)) {
                                                                                                                                                Array.set(newInstance7, i281, Array.get(obj35, i281));
                                                                                                                                            }
                                                                                                                                            declaredField2.set(obj36, arrayList);
                                                                                                                                            declaredField3.set(obj36, newInstance7);
                                                                                                                                            int currentTimeMillis18 = (int) System.currentTimeMillis();
                                                                                                                                            int i282 = ~currentTimeMillis18;
                                                                                                                                            int i283 = ((((i282 & (-1062203072)) | (i282 ^ (-1062203072))) | 134407169) * 1444) - 532442014;
                                                                                                                                            int i284 = ~(((-420144258) & currentTimeMillis18) | ((-420144258) ^ currentTimeMillis18));
                                                                                                                                            int i285 = (i284 & 134407169) | (134407169 ^ i284);
                                                                                                                                            int i286 = ~((currentTimeMillis18 & (-776465984)) | ((-776465984) ^ currentTimeMillis18));
                                                                                                                                            int i287 = ((i286 & i285) | (i285 ^ i286)) * (-1444);
                                                                                                                                            int i288 = ((i283 | i287) << 1) - (i287 ^ i283);
                                                                                                                                            int i289 = ((i288 | (-146256932)) << 1) - ((-146256932) ^ i288);
                                                                                                                                            int currentTimeMillis19 = (int) System.currentTimeMillis();
                                                                                                                                            int i290 = ~currentTimeMillis19;
                                                                                                                                            int i291 = ~((i290 & (-120898215)) | (i290 ^ (-120898215)));
                                                                                                                                            int i292 = -(-((1677192328 | i291) * 764));
                                                                                                                                            int i293 = (729969597 & i292) + (i292 | 729969597);
                                                                                                                                            int i294 = ~currentTimeMillis19;
                                                                                                                                            int i295 = ~((i294 & 1677192328) | (i294 ^ 1677192328));
                                                                                                                                            int i296 = -(-(((i295 & (-1744301743)) | ((-1744301743) ^ i295)) * (-1528)));
                                                                                                                                            int i297 = (i293 ^ i296) + ((i296 & i293) << 1);
                                                                                                                                            int i298 = (((-1690512943) & i291) | ((-1690512943) ^ i291)) * 764;
                                                                                                                                            if (i289 > (i297 & i298) + (i298 | i297)) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            r3 = r3;
                                                                                                                                            r15 = r15;
                                                                                                                                            obj18 = obj31;
                                                                                                                                            if (d == null) {
                                                                                                                                                d = newInstance2;
                                                                                                                                                r3 = r3;
                                                                                                                                                r15 = r15;
                                                                                                                                                obj18 = obj31;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th59) {
                                                                                                                                            r5 = zipFile2;
                                                                                                                                            r8 = obj31;
                                                                                                                                            r6 = cls5;
                                                                                                                                            i3 = -1;
                                                                                                                                            try {
                                                                                                                                                Throwable cause27 = th59.getCause();
                                                                                                                                                if (cause27 == null) {
                                                                                                                                                    throw th59;
                                                                                                                                                }
                                                                                                                                                throw cause27;
                                                                                                                                            } catch (Exception e6) {
                                                                                                                                                e = e6;
                                                                                                                                                StringBuilder sb9 = new StringBuilder();
                                                                                                                                                byte[] bArr30 = $$a;
                                                                                                                                                sb9.append($$c(bArr30[c], (short) 1040, bArr30[184]));
                                                                                                                                                sb9.append(invoke7);
                                                                                                                                                byte b56 = bArr30[108];
                                                                                                                                                sb9.append($$c(b56, (short) (b56 | 307), bArr30[125]));
                                                                                                                                                try {
                                                                                                                                                    throw ((Throwable) Class.forName($$c((byte) (-bArr30[c8]), (short) 315, bArr30[198])).getDeclaredConstructor(r6, Throwable.class).newInstance(sb9.toString(), e));
                                                                                                                                                } catch (Throwable th60) {
                                                                                                                                                    Throwable cause28 = th60.getCause();
                                                                                                                                                    if (cause28 == null) {
                                                                                                                                                        throw th60;
                                                                                                                                                    }
                                                                                                                                                    throw cause28;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Exception e7) {
                                                                                                                                        e = e7;
                                                                                                                                        r5 = zipFile2;
                                                                                                                                        r8 = obj31;
                                                                                                                                        r6 = cls5;
                                                                                                                                        i3 = -1;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th61) {
                                                                                                                                    Throwable cause29 = th61.getCause();
                                                                                                                                    if (cause29 == null) {
                                                                                                                                        throw th61;
                                                                                                                                    }
                                                                                                                                    throw cause29;
                                                                                                                                }
                                                                                                                            } catch (Throwable th62) {
                                                                                                                                th = th62;
                                                                                                                                r5 = zipFile2;
                                                                                                                                r8 = obj31;
                                                                                                                                r6 = cls5;
                                                                                                                                i3 = -1;
                                                                                                                                th = th;
                                                                                                                                r3 = r3;
                                                                                                                                zipFile = r5;
                                                                                                                                r6 = r6;
                                                                                                                                r8 = r8;
                                                                                                                                r15 = r15;
                                                                                                                                zArr6 = zArr6;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th63) {
                                                                                                                            th = th63;
                                                                                                                            r6 = cls232;
                                                                                                                            r5 = zipFile2;
                                                                                                                            r8 = obj31;
                                                                                                                            i3 = -1;
                                                                                                                            th = th;
                                                                                                                            r3 = r3;
                                                                                                                            zipFile = r5;
                                                                                                                            r6 = r6;
                                                                                                                            r8 = r8;
                                                                                                                            r15 = r15;
                                                                                                                            zArr6 = zArr6;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Throwable th64) {
                                                                                                                        th = th64;
                                                                                                                        cls20 = cls17;
                                                                                                                    }
                                                                                                                } catch (Throwable th65) {
                                                                                                                    Throwable cause30 = th65.getCause();
                                                                                                                    if (cause30 == null) {
                                                                                                                        throw th65;
                                                                                                                    }
                                                                                                                    throw cause30;
                                                                                                                }
                                                                                                            } catch (Throwable th66) {
                                                                                                                Throwable cause31 = th66.getCause();
                                                                                                                if (cause31 == null) {
                                                                                                                    throw th66;
                                                                                                                }
                                                                                                                throw cause31;
                                                                                                            }
                                                                                                        } catch (Throwable th67) {
                                                                                                            th = th67;
                                                                                                            cls20 = cls17;
                                                                                                            r8 = r5;
                                                                                                            r6 = cls232;
                                                                                                            r5 = zipFile2;
                                                                                                        }
                                                                                                    }
                                                                                                    Object obj37 = newInstance2;
                                                                                                    if (z3) {
                                                                                                        $11 = ($10 + 117) % 128;
                                                                                                        try {
                                                                                                            byte[] bArr31 = $$a;
                                                                                                            i3 = -1;
                                                                                                            try {
                                                                                                                Class<?> cls56 = Class.forName($$c(bArr31[449], (short) 687, (byte) ((-2) - (bArr31[c4] ^ (-1)))));
                                                                                                                byte b57 = bArr31[c9];
                                                                                                                int currentTimeMillis20 = (int) System.currentTimeMillis();
                                                                                                                int i299 = (b57 * (-282)) - 284;
                                                                                                                int i300 = ~b57;
                                                                                                                int i301 = ~currentTimeMillis20;
                                                                                                                int i302 = -(-(((i300 & i301) | (i300 ^ i301)) * (-283)));
                                                                                                                int i303 = (i299 ^ i302) + ((i299 & i302) << 1);
                                                                                                                int i304 = ~b57;
                                                                                                                int i305 = (~((i304 ^ (-1)) | i304)) * 283;
                                                                                                                String $$c4 = $$c((byte) (((((i303 | i305) << 1) - (i305 ^ i303)) - (~(-(-((~((i304 & currentTimeMillis20) | (i304 ^ currentTimeMillis20))) * 283))))) - 1), (short) 1044, bArr31[159]);
                                                                                                                cls8 = cls5;
                                                                                                                try {
                                                                                                                    Method declaredMethod2 = cls56.getDeclaredMethod($$c4, cls8, Class.forName($$c((byte) (-bArr31[c8]), (short) 917, (byte) (bArr31[c4] - 1))));
                                                                                                                    declaredMethod2.setAccessible(true);
                                                                                                                    try {
                                                                                                                        obj20 = obj18;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                Object invoke8 = declaredMethod2.invoke(obj37, str3, r3.getMethod($$c(b31, (short) 732, bArr31[778]), null).invoke(obj20, null));
                                                                                                                                if (invoke8 != null) {
                                                                                                                                    cls56.getDeclaredMethod($$c(bArr31[19], (short) 372, bArr31[184]), null).invoke(obj37, null);
                                                                                                                                }
                                                                                                                                obj19 = invoke8;
                                                                                                                                r6 = cls8;
                                                                                                                                r8 = obj20;
                                                                                                                            } catch (Throwable th68) {
                                                                                                                                th = th68;
                                                                                                                                th = th;
                                                                                                                                zipFile = zipFile2;
                                                                                                                                r3 = r3;
                                                                                                                                r6 = cls8;
                                                                                                                                r8 = obj20;
                                                                                                                                r15 = r15;
                                                                                                                                zArr6 = zArr6;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th69) {
                                                                                                                            th = th69;
                                                                                                                            Throwable cause32 = th.getCause();
                                                                                                                            if (cause32 == null) {
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                            throw cause32;
                                                                                                                        }
                                                                                                                    } catch (Throwable th70) {
                                                                                                                        th = th70;
                                                                                                                    }
                                                                                                                } catch (Throwable th71) {
                                                                                                                    th = th71;
                                                                                                                    obj20 = obj18;
                                                                                                                }
                                                                                                            } catch (Throwable th72) {
                                                                                                                th = th72;
                                                                                                                obj20 = obj18;
                                                                                                                cls8 = cls5;
                                                                                                            }
                                                                                                        } catch (Throwable th73) {
                                                                                                            th = th73;
                                                                                                            obj20 = obj18;
                                                                                                            cls8 = cls5;
                                                                                                            i3 = -1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        String str6 = str3;
                                                                                                        Object obj38 = obj18;
                                                                                                        Class<String> cls57 = cls5;
                                                                                                        i3 = -1;
                                                                                                        byte[] bArr32 = $$a;
                                                                                                        Class<?> cls58 = Class.forName($$c((byte) (-bArr32[c8]), (short) 917, (byte) (bArr32[c4] - 1)));
                                                                                                        byte b58 = bArr32[c9];
                                                                                                        int currentTimeMillis21 = (int) System.currentTimeMillis();
                                                                                                        int i306 = -(-(b58 * (-279)));
                                                                                                        int i307 = (((-141) | i306) << 1) - (i306 ^ (-141));
                                                                                                        int i308 = ((b58 ^ currentTimeMillis21) | (b58 & currentTimeMillis21)) * 140;
                                                                                                        int i309 = ((i307 | i308) << 1) - (i308 ^ i307);
                                                                                                        int i310 = ~b58;
                                                                                                        int i311 = ~currentTimeMillis21;
                                                                                                        int i312 = ~((i311 & b58) | (i311 ^ b58));
                                                                                                        int i313 = (((i310 & i312) | (i310 ^ i312)) * (-280)) + i309;
                                                                                                        int i314 = ~b58;
                                                                                                        int i315 = ~(i314 | (i314 ^ (-1)));
                                                                                                        int i316 = ~currentTimeMillis21;
                                                                                                        int i317 = ~(i316 | (i316 ^ (-1)));
                                                                                                        int i318 = (i315 & i317) | (i315 ^ i317);
                                                                                                        int i319 = ~((b58 & currentTimeMillis21) | (b58 ^ currentTimeMillis21));
                                                                                                        Method declaredMethod3 = cls58.getDeclaredMethod($$c((byte) ((i313 - (~(((i319 & i318) | (i318 ^ i319)) * 140))) - 1), (short) 1044, bArr32[159]), cls57);
                                                                                                        try {
                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                            obj19 = declaredMethod3.invoke(obj37, str6);
                                                                                                            r6 = cls57;
                                                                                                            r8 = obj38;
                                                                                                        } catch (InvocationTargetException e8) {
                                                                                                            try {
                                                                                                                throw ((Exception) e8.getCause());
                                                                                                            } catch (ClassNotFoundException unused7) {
                                                                                                                obj19 = null;
                                                                                                                r6 = cls57;
                                                                                                                r8 = obj38;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (obj19 == null) {
                                                                                                        break;
                                                                                                    }
                                                                                                    try {
                                                                                                        Class cls59 = (Class) obj19;
                                                                                                        byte[] bArr33 = $$a;
                                                                                                        str5 = $$c(bArr33[19], (short) 1052, bArr33[214]);
                                                                                                        Constructor declaredConstructor2 = cls59.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                        declaredConstructor2.setAccessible(true);
                                                                                                        if (z3) {
                                                                                                            z6 = false;
                                                                                                        } else {
                                                                                                            int i320 = $10;
                                                                                                            $11 = (((i320 | 119) << 1) - (i320 ^ 119)) % 128;
                                                                                                            z6 = true;
                                                                                                        }
                                                                                                        i = declaredConstructor2.newInstance(obj37, Boolean.valueOf(z6));
                                                                                                        bArr19 = new byte[12790];
                                                                                                        r5 = zipFile2;
                                                                                                        try {
                                                                                                            try {
                                                                                                                short s7 = s2;
                                                                                                                try {
                                                                                                                    short s8 = (short) 499;
                                                                                                                    Object newInstance8 = Class.forName($$c((byte) (-bArr33[c8]), s8, (byte) (-bArr33[779]))).getDeclaredConstructor(Class.forName($$c((byte) (-bArr33[c8]), s7, bArr33[198]))).newInstance(Class.forName($$c((byte) (-bArr33[c8]), (short) 455, bArr33[987])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr33[c8]), s7, bArr33[198]))).newInstance(r5.getInputStream(r5.getEntry($$c(bArr33[13], (short) 1084, bArr33[7]).substring(1)))));
                                                                                                                    try {
                                                                                                                        Class.forName($$c((byte) (-bArr33[c8]), s8, (byte) (-bArr33[779]))).getMethod($$c((byte) (bArr33[1152] + 1), (short) 521, bArr33[159]), cls20).invoke(newInstance8, bArr19);
                                                                                                                        try {
                                                                                                                            Class.forName($$c((byte) (-bArr33[c8]), s8, (byte) (-bArr33[779]))).getMethod($$c(bArr33[19], (short) 372, bArr33[184]), null).invoke(newInstance8, null);
                                                                                                                            Class<Class> cls60 = r3;
                                                                                                                            i189 = Math.abs(i20);
                                                                                                                            cls16 = cls60;
                                                                                                                            cls232 = r6;
                                                                                                                            i9 = i12;
                                                                                                                            i7 = 978;
                                                                                                                            i5 = 3;
                                                                                                                            i143 = 4;
                                                                                                                            r6 = r5;
                                                                                                                            r5 = r8;
                                                                                                                            r8 = cls59;
                                                                                                                            i190 = 12748;
                                                                                                                            cls17 = cls20;
                                                                                                                            cls20 = r15;
                                                                                                                            r15 = obj15;
                                                                                                                        } catch (Throwable th74) {
                                                                                                                            Throwable cause33 = th74.getCause();
                                                                                                                            if (cause33 == null) {
                                                                                                                                throw th74;
                                                                                                                            }
                                                                                                                            throw cause33;
                                                                                                                        }
                                                                                                                    } catch (Throwable th75) {
                                                                                                                        Throwable cause34 = th75.getCause();
                                                                                                                        if (cause34 == null) {
                                                                                                                            throw th75;
                                                                                                                        }
                                                                                                                        throw cause34;
                                                                                                                    }
                                                                                                                } catch (Throwable th76) {
                                                                                                                    Throwable cause35 = th76.getCause();
                                                                                                                    if (cause35 == null) {
                                                                                                                        throw th76;
                                                                                                                    }
                                                                                                                    throw cause35;
                                                                                                                }
                                                                                                            } catch (Throwable th77) {
                                                                                                                Throwable cause36 = th77.getCause();
                                                                                                                if (cause36 == null) {
                                                                                                                    throw th77;
                                                                                                                }
                                                                                                                throw cause36;
                                                                                                            }
                                                                                                        } catch (Throwable th78) {
                                                                                                            th = th78;
                                                                                                            th = th;
                                                                                                            r3 = r3;
                                                                                                            zipFile = r5;
                                                                                                            r6 = r6;
                                                                                                            r8 = r8;
                                                                                                            r15 = r15;
                                                                                                            zArr6 = zArr6;
                                                                                                            zipFile.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th79) {
                                                                                                        th = th79;
                                                                                                        r5 = zipFile2;
                                                                                                        th = th;
                                                                                                        r3 = r3;
                                                                                                        zipFile = r5;
                                                                                                        r6 = r6;
                                                                                                        r8 = r8;
                                                                                                        r15 = r15;
                                                                                                        zArr6 = zArr6;
                                                                                                        zipFile.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th80) {
                                                                                                    th = th80;
                                                                                                    r3 = cls16;
                                                                                                    r8 = r5;
                                                                                                    r5 = r6;
                                                                                                    r6 = cls232;
                                                                                                    zArr6 = zArr6;
                                                                                                    r15 = cls20;
                                                                                                    cls20 = cls17;
                                                                                                    th = th;
                                                                                                    r3 = r3;
                                                                                                    zipFile = r5;
                                                                                                    r6 = r6;
                                                                                                    r8 = r8;
                                                                                                    r15 = r15;
                                                                                                    zArr6 = zArr6;
                                                                                                    zipFile.close();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Throwable th81) {
                                                                                                Throwable cause37 = th81.getCause();
                                                                                                if (cause37 == null) {
                                                                                                    throw th81;
                                                                                                }
                                                                                                throw cause37;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th82) {
                                                                                        Throwable cause38 = th82.getCause();
                                                                                        if (cause38 == null) {
                                                                                            throw th82;
                                                                                        }
                                                                                        throw cause38;
                                                                                    }
                                                                                } catch (Throwable th83) {
                                                                                    th = th83;
                                                                                    Throwable cause39 = th.getCause();
                                                                                    if (cause39 == null) {
                                                                                        throw th;
                                                                                    }
                                                                                    throw cause39;
                                                                                }
                                                                            } catch (Throwable th84) {
                                                                                th = th84;
                                                                            }
                                                                        } catch (Throwable th85) {
                                                                            th = th85;
                                                                            Throwable cause40 = th.getCause();
                                                                            if (cause40 == null) {
                                                                                throw th;
                                                                            }
                                                                            throw cause40;
                                                                        }
                                                                    } catch (Throwable th86) {
                                                                        th = th86;
                                                                    }
                                                                } catch (Throwable th87) {
                                                                    Throwable cause41 = th87.getCause();
                                                                    if (cause41 == null) {
                                                                        throw th87;
                                                                    }
                                                                    throw cause41;
                                                                }
                                                            } catch (Throwable th88) {
                                                                th = th88;
                                                                cls = cls16;
                                                                obj13 = r5;
                                                                obj14 = r6;
                                                                cls2 = cls232;
                                                                i10 = i8;
                                                                zArr8 = zArr3;
                                                            }
                                                        } catch (Throwable th89) {
                                                            Throwable cause42 = th89.getCause();
                                                            if (cause42 == null) {
                                                                throw th89;
                                                            }
                                                            throw cause42;
                                                        }
                                                    } catch (Throwable th90) {
                                                        Throwable cause43 = th90.getCause();
                                                        if (cause43 == null) {
                                                            throw th90;
                                                        }
                                                        throw cause43;
                                                    }
                                                }
                                                i55 = 1;
                                                int i321 = ((i11 | (-109)) << 1) - (i11 ^ (-109));
                                                i9 = (i321 ^ 110) + ((i321 & 110) << 1);
                                                cls16 = r3;
                                                cls232 = r6;
                                                r5 = r8;
                                                cls17 = cls20;
                                                obj26 = obj3;
                                                zArr = zArr4;
                                                $$c2 = str2;
                                                objArr = objArr2;
                                                z = z2 ? 1 : 0;
                                                zArr2 = zArr5;
                                                i8 = i10;
                                                zArr3 = zArr6;
                                                i6 = 4;
                                                i4 = 5;
                                                i7 = 978;
                                                i5 = 3;
                                                cls20 = r15;
                                            }
                                            return;
                                        } catch (Throwable th91) {
                                            Throwable cause44 = th91.getCause();
                                            if (cause44 == null) {
                                                throw th91;
                                            }
                                            throw cause44;
                                        }
                                    }
                                    c7 = 150;
                                    invoke = null;
                                }
                                c6 = 'j';
                                c5 = c7;
                                if (invoke3 != null) {
                                }
                                if (invoke2 == null) {
                                    byte[] bArr82 = $$a;
                                    Object[] objArr52 = new Object[i2];
                                    objArr52[1] = $$c(bArr82[19], (short) 266, bArr82[417]);
                                    objArr52[0] = obj2;
                                    byte b152 = (byte) (-bArr82[c8]);
                                    Class<?> cls252 = Class.forName($$c(b152, (short) ((b152 ^ 144) | (b152 & 144)), (byte) (-bArr82[c6])));
                                    byte b162 = (byte) (-bArr82[c8]);
                                    invoke2 = cls252.getDeclaredConstructor(Class.forName($$c(b162, (short) (b162 | 144), (byte) (-bArr82[c6]))), cls232).newInstance(objArr52);
                                }
                                byte[] bArr522 = $$a;
                                byte b1022 = (byte) (-bArr522[c8]);
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(b1022, (short) ((b1022 ^ 144) | (b1022 & 144)), (byte) (-bArr522[c6]))), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = obj2;
                                objArr[i5] = invoke3;
                                i6 = 4;
                                objArr[4] = invoke2;
                                objArr[i4] = obj2;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[i5] = true;
                                zArr3[4] = false;
                                zArr3[i4] = true;
                                zArr3[6] = true;
                                char c1022 = 843;
                                i7 = 978;
                                Class<?> cls2422 = Class.forName($$c(bArr522[62], (short) 275, bArr522[978]));
                                i21 = cls2422.getDeclaredField($$c(bArr522[889], (short) 298, bArr522[843])).getInt(cls2422);
                                if (i21 >= 34) {
                                }
                                if (i21 != 29) {
                                    zArr3[0] = i21 != 29 && i21 >= 26;
                                    if (i21 < 21) {
                                    }
                                    zArr3[1] = z7;
                                    zArr3[4] = i21 < 21;
                                    i8 = 0;
                                    i9 = 0;
                                    r5 = AFa1gSDK.class;
                                    z = z8;
                                    while (i8 == 0) {
                                        if (zArr3[i9]) {
                                        }
                                        i55 = 1;
                                        int i3212 = ((i11 | (-109)) << 1) - (i11 ^ (-109));
                                        i9 = (i3212 ^ 110) + ((i3212 & 110) << 1);
                                        cls16 = r3;
                                        cls232 = r6;
                                        r5 = r8;
                                        cls17 = cls20;
                                        obj26 = obj3;
                                        zArr = zArr4;
                                        $$c2 = str2;
                                        objArr = objArr2;
                                        z = z2 ? 1 : 0;
                                        zArr2 = zArr5;
                                        i8 = i10;
                                        zArr3 = zArr6;
                                        i6 = 4;
                                        i4 = 5;
                                        i7 = 978;
                                        i5 = 3;
                                        cls20 = r15;
                                    }
                                }
                                zArr3[0] = i21 != 29 && i21 >= 26;
                                if (i21 < 21) {
                                }
                                zArr3[1] = z7;
                                zArr3[4] = i21 < 21;
                                i8 = 0;
                                i9 = 0;
                                r5 = AFa1gSDK.class;
                                z = z8;
                                while (i8 == 0) {
                                }
                            }
                            invoke3 = null;
                            Class<String> cls2322 = String.class;
                            if (invoke == null) {
                            }
                            c6 = 'j';
                            c5 = c7;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr5222 = $$a;
                            byte b10222 = (byte) (-bArr5222[c8]);
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(b10222, (short) ((b10222 ^ 144) | (b10222 & 144)), (byte) (-bArr5222[c6]))), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = obj2;
                            objArr[i5] = invoke3;
                            i6 = 4;
                            objArr[4] = invoke2;
                            objArr[i4] = obj2;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[i5] = true;
                            zArr3[4] = false;
                            zArr3[i4] = true;
                            zArr3[6] = true;
                            char c10222 = 843;
                            i7 = 978;
                            Class<?> cls24222 = Class.forName($$c(bArr5222[62], (short) 275, bArr5222[978]));
                            i21 = cls24222.getDeclaredField($$c(bArr5222[889], (short) 298, bArr5222[843])).getInt(cls24222);
                            if (i21 >= 34) {
                            }
                            zArr3[0] = i21 != 29 && i21 >= 26;
                            if (i21 < 21) {
                            }
                            zArr3[1] = z7;
                            zArr3[4] = i21 < 21;
                            i8 = 0;
                            i9 = 0;
                            r5 = AFa1gSDK.class;
                            z = z8;
                            while (i8 == 0) {
                            }
                        }
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        Class<String> cls23222 = String.class;
                        if (invoke == null) {
                        }
                        c6 = 'j';
                        c5 = c7;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr52222 = $$a;
                        byte b102222 = (byte) (-bArr52222[c8]);
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(b102222, (short) ((b102222 ^ 144) | (b102222 & 144)), (byte) (-bArr52222[c6]))), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = obj2;
                        objArr[i5] = invoke3;
                        i6 = 4;
                        objArr[4] = invoke2;
                        objArr[i4] = obj2;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[i5] = true;
                        zArr3[4] = false;
                        zArr3[i4] = true;
                        zArr3[6] = true;
                        char c102222 = 843;
                        i7 = 978;
                        Class<?> cls242222 = Class.forName($$c(bArr52222[62], (short) 275, bArr52222[978]));
                        i21 = cls242222.getDeclaredField($$c(bArr52222[889], (short) 298, bArr52222[843])).getInt(cls242222);
                        if (i21 >= 34) {
                        }
                        zArr3[0] = i21 != 29 && i21 >= 26;
                        if (i21 < 21) {
                        }
                        zArr3[1] = z7;
                        zArr3[4] = i21 < 21;
                        i8 = 0;
                        i9 = 0;
                        r5 = AFa1gSDK.class;
                        z = z8;
                        while (i8 == 0) {
                        }
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    Class<String> cls232222 = String.class;
                    if (invoke == null) {
                    }
                    c6 = 'j';
                    c5 = c7;
                    if (invoke3 != null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr522222 = $$a;
                    byte b1022222 = (byte) (-bArr522222[c8]);
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(b1022222, (short) ((b1022222 ^ 144) | (b1022222 & 144)), (byte) (-bArr522222[c6]))), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = obj2;
                    objArr[i5] = invoke3;
                    i6 = 4;
                    objArr[4] = invoke2;
                    objArr[i4] = obj2;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[i5] = true;
                    zArr3[4] = false;
                    zArr3[i4] = true;
                    zArr3[6] = true;
                    char c1022222 = 843;
                    i7 = 978;
                    Class<?> cls2422222 = Class.forName($$c(bArr522222[62], (short) 275, bArr522222[978]));
                    i21 = cls2422222.getDeclaredField($$c(bArr522222[889], (short) 298, bArr522222[843])).getInt(cls2422222);
                    if (i21 >= 34) {
                    }
                    zArr3[0] = i21 != 29 && i21 >= 26;
                    if (i21 < 21) {
                    }
                    zArr3[1] = z7;
                    zArr3[4] = i21 < 21;
                    i8 = 0;
                    i9 = 0;
                    r5 = AFa1gSDK.class;
                    z = z8;
                    while (i8 == 0) {
                    }
                }
                byte[] bArr42 = $$a;
                c3 = 528;
                Class<?> cls222 = Class.forName($$c(bArr42[62], (short) 132, bArr42[528]));
                byte b82 = (byte) 70;
                short s32 = (short) 153;
                byte b92 = bArr42[343];
                c4 = 343;
                i3 = -1;
                int currentTimeMillis62 = (int) System.currentTimeMillis();
                int i1092 = -(-(b92 * 253));
                int i1102 = ((-253) ^ i1092) + (((-253) & i1092) << 1);
                int i1112 = ~b92;
                int i1122 = ~i1112;
                i2 = 2;
                int i1132 = ~currentTimeMillis62;
                int i1142 = ~((i1112 ^ i1132) | (i1132 & i1112));
                int i1152 = (i1142 & i1122) | (i1122 ^ i1142);
                int i1162 = ((-1) ^ b92) | b92;
                int i1172 = ~(i1162 | currentTimeMillis62);
                int i1182 = ((i1152 & i1172) | (i1152 ^ i1172)) * (-252);
                int i1192 = (i1102 ^ i1182) + ((i1102 & i1182) << 1);
                int i1202 = (i1192 & 252) + (i1192 | 252);
                int i1212 = -(-((~((i1162 & currentTimeMillis62) | (i1162 ^ currentTimeMillis62))) * 252));
                obj = cls222.getMethod($$c(b82, s32, (byte) (((i1202 | i1212) << 1) - (i1202 ^ i1212))), null).invoke(null, null);
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                invoke2 = null;
                if (obj != null) {
                }
                invoke3 = null;
                Class<String> cls2322222 = String.class;
                if (invoke == null) {
                }
                c6 = 'j';
                c5 = c7;
                if (invoke3 != null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr5222222 = $$a;
                byte b10222222 = (byte) (-bArr5222222[c8]);
                objArr = (Object[]) Array.newInstance(Class.forName($$c(b10222222, (short) ((b10222222 ^ 144) | (b10222222 & 144)), (byte) (-bArr5222222[c6]))), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = obj2;
                objArr[i5] = invoke3;
                i6 = 4;
                objArr[4] = invoke2;
                objArr[i4] = obj2;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[1] = false;
                zArr3[2] = true;
                zArr3[i5] = true;
                zArr3[4] = false;
                zArr3[i4] = true;
                zArr3[6] = true;
                char c10222222 = 843;
                i7 = 978;
                Class<?> cls24222222 = Class.forName($$c(bArr5222222[62], (short) 275, bArr5222222[978]));
                i21 = cls24222222.getDeclaredField($$c(bArr5222222[889], (short) 298, bArr5222222[843])).getInt(cls24222222);
                if (i21 >= 34) {
                }
                zArr3[0] = i21 != 29 && i21 >= 26;
                if (i21 < 21) {
                }
                zArr3[1] = z7;
                zArr3[4] = i21 < 21;
                i8 = 0;
                i9 = 0;
                r5 = AFa1gSDK.class;
                z = z8;
                while (i8 == 0) {
                }
            } catch (Exception e9) {
                b6e.q(e9);
            }
        } catch (Throwable th92) {
            Throwable cause45 = th92.getCause();
            if (cause45 == null) {
                throw th92;
            }
            throw cause45;
        }
    }

    private AFa1gSDK() {
    }

    public static int AFAdRevenueData(Object obj) {
        Object obj2;
        int i2 = $11;
        int i3 = (i2 & 25) + (i2 | 25);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            obj2 = i;
            int i5 = 27 / 0;
        } else {
            obj2 = i;
        }
        $11 = ((i4 ^ 83) + ((i4 & 83) << 1)) % 128;
        try {
            byte b = $$a[19];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 528) | (b & 528)), r0[214]), true, (ClassLoader) d).getMethod($$c((byte) 70, (short) 626, r0[417]), Object.class).invoke(obj2, obj)).intValue();
            $10 = ($11 + 19) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getCurrencyIso4217Code(int i2) {
        Object obj;
        int i3 = $10 + 13;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            obj = i;
            int i5 = 44 / 0;
        } else {
            obj = i;
        }
        int i6 = ((i4 & 119) + (i4 | 119)) % 128;
        $10 = i6;
        $11 = (i6 + 25) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte b = $$a[19];
            return ((Integer) Class.forName($$c(b, (short) ((b ^ 528) | (b & 528)), r1[214]), true, (ClassLoader) d).getMethod($$c(r1[915], (short) 1154, r1[113]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getMediationNetwork(int i2, int i3) {
        int i4 = $11;
        int i5 = (i4 & 77) + (i4 | 77);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static Object getMonetizationNetwork(int i2, int i3, char c) {
        int i4 = ($11 + 123) % 128;
        $10 = i4;
        Object obj = i;
        $11 = ((i4 & 35) + (i4 | 35)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte b = $$a[19];
            Class<?> cls = Class.forName($$c(b, (short) ((b ^ 528) | (b & 528)), r7[214]), true, (ClassLoader) d);
            String $$c = $$c((byte) 70, (short) 626, r7[417]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i5 = $10;
            int i6 = (i5 ^ 109) + ((i5 & 109) << 1);
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
            }
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2 = $11;
        $10 = (((i2 | 29) << 1) - (i2 ^ 29)) % 128;
        byte[] bArr = new byte[1172];
        System.arraycopy("oØ\u0098\u0013ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òøñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ì\f\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê)Ð'\u0004ýÉ\u0000ýý+\u0000ûýÐ+Ï1ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7¹\u001f\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-Ì\f\föõýÿî\u001fêì\u000eôö\r\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ç\u0011\fö$¸Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öúÕû(\u0001ý\u0000Ë,üýþ\u0001úË\u00002\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 232;
        int i3 = $11;
        int i4 = ((i3 | 81) << 1) - (i3 ^ 81);
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
