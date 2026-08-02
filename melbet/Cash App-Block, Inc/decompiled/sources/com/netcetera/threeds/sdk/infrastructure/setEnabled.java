package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setEnabled implements getCornerRadius.get {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static char[] get;
    private static long initialize;
    private final Locale getWarnings;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2Service = 0;
        ThreeDS2ServiceInstance = 1;
        char[] cArr = new char[1707];
        ByteBuffer.wrap("\u0089\u0017Å;\u0011\u0093l{¸\u008b÷\\C=\u009f\u0085êd&ÁuWÁ&\u001d\u0084h\\¤ûóUO,\u009b\u009dÖc\"îqGÍ\u0014\u0019\u0091T\t ñÿTK+\u000eùBÕ\u0096}ë\u0095?ep²ÄÓ\u0018km\u008a¡/ò¹FÈ\u009ajï²#\u0004t¶ÈÖ\u001cdQ·¥\u0017öªJ×\u009eoÓã'\u001a\u0085ÝÉñ\u001dY`±´Aû\u0096O÷\u0093Oæ®*\u000by\u009dÍì\u0011Nd\u0096¨#ÿ\u0082Cì\u0097F)Úeá±BÌ³\u0018FW\u009bãð?@J¸\u0086\u0006Õ\u0096a·½FÈ¡\u0004;S\u0098ïã;Kv¸\u00828Ñ¦mä¹NôÀ\u0000)_\u009fëñ'Q\u0089\u0017Å:\u0011\u0082ln¸\u008b÷_C5\u009fÇêp&ÕuQÁ%\u0089\u0017Å:\u0011\u0082ln¸\u008b÷HC;\u009f\u0084ê.&×uLÁ:\u001d\u009c\u0089\u0017Å,\u0011\u0092ln¸Å÷IC6\u009fÆêR&áusÁ:\u001d\u009ahf¤ÞóPO<\u009b\u008e\u0089\u0017Å,\u0011\u008fl~¸Ð÷^C?\u009fÆêl&Îu\\Áz\u001d\u0080hj¤øó_O*\u009bÁÖu\"ò^O\u0012#Æ\u0084»voÞ V\u0089dÅ\u001e\u0089\u0017Å,\u0011\u008fl~¸Ð÷^C?\u009fÆêb&ÎuPÁz\u001d\u0082hf¤÷óDO\u001e\u009b¢Ö+\"óqQÍ&\u0019\u0097TT óÿXK \u0087\u0091Ò\u000e.ü}F\u0016¬Z\u0097\u008e4óÅ'khåÜ\u0084\u0000}uÙ¹uêë^Á\u00829÷Ý;LlÿÐ¥\u0004\u0019I\u0090½VîýR\u009f\u0086)4©x\u0092¬1ÑÀ\u0005nJàþ\u0081\"xWÒ\u009bpÈâ|Ä >ÕÔ\u0019FNáò\u0093&<kÍ\u009fuÌÇp\u0085¤.é¨\u001d^B§ö\u0083:4\u0089\u0017Å;\u0011\u0093l{¸\u008b÷UC7\u009f\u0084êu&ÀuKÁ0\u001d\u009fhw\u0089JÅ0\u0011Ølo¸Ñ÷RC>\u009f\u008dê.&ÏuQÁ&\u001d\u0098\u0089VÅ:\u0011\u0097l~¸Á÷\u0015C<\u009f\u008cêt\u0089\u0017Å/\u0011\u0084lb¸Ç÷\u0014C4\u009f\u0080êl&ÂuMÁ,\u001d\u009fhw¤ÿó\\O;\u0089VÅ:\u0011\u009blx¸×÷]\u0089JÅ0\u0011Øl}¸Ö÷TC6\u009f\u009cêc&Óu\u0010Á8\u001d\u008dhm¤ïóWO)\u009b\u008cÖr\"èqFÍ.\u0019\u0090\u0089_Å:\u0011\u0098lt\u008aaÆ\u0012\u0012¶oZ»øôru\t91í\u009a\u0090|DÙ\u000b\n¿!c\u0098\u0016zÚÌ\u0089L=.á\u0081¢\u009bîè:LG \u0093\u0016Ü\u009bhâ´OÁ¡\u0089\u007fÅ:\u0011\u0098lt¸É÷TC&\u009f\u0080êo&É1 }Ü©pÔ\u008e\u0000&O¡ûÑ\u0089[Å7\u0011\u0084lb¸É÷RC'\u009f\u0084È\\\u0084&PÎ-kùÀ¶B\u0002 Þ\u008a«ugÅ4\u0006\u0080'\\\u009f)cåå²D\u000e;\u0089NÅ=\u0011\u0099lu¸\u009c÷\rC\"\u008cÓÀ¶\u0014\u0014iä½ZòÞF½\u0089_Å:\u0011\u0098lh¸Ö÷RC1\u009f¶êx&\u009fu\b\u0089_Å:\u0011\u0098lh¸Ö÷RC1\u009f¶êx&\u009fu\bÁ\n\u001dÚh7×4\u009bNO¦2\u0003æ¨©*\u001dHÁâ´\u001dx\u00ad+n\u009fFCý6\u0019ú\u0081\u00ad#\u0089KÅ;\u0011\u009d\u0089]Å2\u0011\u0083la¸Å÷OC=\u009f\u009b\u0085\u0083ÉÕ\u001d|`×´\fû´OÆ\u0093gæ\u0093*0y¡Í\u008f\u0011pd\u0096¨\u0012ÿëCñ\u0097}Ú\u008e.\b}£ÁÔ\u0089yÅ1\u0011\u0092l\u007f¸Ë÷RC6\u009fÉêS&ãuuÁu\u001d\u008ehv¤óó]O<\u009bÏÖ`\"òqFÍk\u0019\u009aTA ¦\u0089yÅ1\u0011\u0092l\u007f¸Ë÷RC6\u009fÉêS&ãuuÁu\u001d\u008ehv¤óó]O<\u009bÏÖ`\"òqFÍk\u0019\u009aTA ¦ÿhKx\u0087Ñ\u0089JÅ0\u0011Øle¸Å÷IC6\u009f\u009eêa&Õu[\u0089_Å0\u0011\u009ali¸Â÷RC!\u009f\u0081\u0089NÅ=\u0011\u0099lu¸\u009c÷\r\u0089JÅ>\u0011\u0098ln¸Ì÷N\u0089JÅ0\u0011Øl}¸Ö÷TC6\u009f\u009cêc&Óu\u0010Á7\u001d\u009ehb¤ôóU\u0080¡ÌÛ\u00183e\u008d±*þ¢J×\u0096gã\u0087/b|¤ÈÛ\u0014ja\u009d\u0089\tÖ\u007f\u009a\u0005Ní3Kçô¨m\u001c\u0012À®µP\u0007)©»åÁ1)L\u009e\u0098 ×£cÏ¿|Êß\u0006&U½áË=yH\u0087\u0084\bÓ´\u0089^Å*\u0011\u009ala¸û÷CCj\u009fß\u0089JÅ0\u0011Ølo¸Ñ÷RC>\u009f\u008dê.&ÁuWÁ;\u001d\u008bhf¤èóAO:\u009b\u0086Öh\"é\"\u008anïºMÇ½\u0013\u0003\\\u0087èä4\u0013A¦\u008d\u0016Þ\u0080j¯¶^Ã³\u000f!X\u0081äï0S}°\u0089÷Å\u0092\u00110lÀ¸~÷úC\u0099\u009f\u001eêÐ&7u ÁÒ\u001d7hÏ¤YóÆO\u0098\u009b\u007fÖ\u0098\"\u001aqûÍ\u0086\u0019$T´ JÿöK\u0085\u0087\u0012Ò¬.\u0003}´\u0089_Å:\u0011\u0098lh¸Ö÷RC1\u009fÆêg&ÈuQÁ2\u001d\u0080hf¤ÅóBO,\u009b\u0084Ö)\"úqQÍ%\u0019\u0087T\u000b ùÿT\u0089_Å:\u0011\u0098lh¸Ö÷RC1\u009fÆêv&ÅuQÁ-\u001dÔh5¤êó\u001eO>\u009b\u008dÖi\"åq\fÍ}\u0019\u0092\u0089_Å0\u0011\u0099lj¸È÷^C}\u009f\u009aêd&ÌuaÁ2\u001d\u009chk¤õó_O-\u009b°Ö~\"¥q\u0002Íd\u0019\u0085T\u001c þÿRK<\u0087\u008cÒ\u001f.Ì}RÉy\u0005îÐ{\u009c\u0001Hé5^áú®e\u001a\u0017Æ´³^\u007f÷,k\u0098\u0001D¯\u0085^É$\u001dÌ`{´ßû@O2\u0093\u0094æy*ÒyMÍ$\u0011Ödu¨ûÿLC0\u0097\u009fÚ<.ï}IÁ1\u0015\u0091X\b¬öóSG(\u008b\u0098Þ\u0006\"óÙ\u0098\u0095ÐAs<\u009eè*§³\u0013×Ï%º\u0099v~%é°çü\u009d(uUÂ\u0081|Îÿz\u0093¦ Ó\u0083\u001fnLúø\u008b$1QÂ\u009dVÊåvË¢+ïÏø^´(`\u0097\u001dkÉ\u009bhC$#ð\u008d\u008dkY\u0098\u0016Z¢6~\u0098\u000b<ÇÄ\u0094I *ü\u008b\u0089<Eø\u0012Q®5z\u008d7g\u0089IÅ:\u0011\u009blx¸\u008a÷SC%\u009fÇêm&ÆuWÁ;\u001d\u0087hf¤ãóBÁ\u0003\u008dpYÑ$2ðÀ¿\u0002\u000b~×\u008d¢,n\u008c=\u001f\u0089zUù *ì±»\u0016\u0007gÓ×\u009e--$aWµöÈ\u0015\u001cçS%çY;ªN\u0001\u0082©Ñ7eg¹åÌ\u000b\u0000\u0099W/ëL?ör\u0012s\u0086?üë\u0014\u0096ªB\r\r\u0085¹ðe@\u0010 ÜE\u008f\u0093;÷çD\u0092½^9\t\u0094µàa\r,»Ø4\u008b\u00957òãJ\u00155YO\u008d§ð\u0010$´k+ßY\u0003¸v\u000eº½é,]_\u0081½ô\u001d8\u0093o*Óh\u0007þJ\u0018¾\u008fí.\u0089JÅ0\u0011Ølb¸À÷VC|\u009f\u008bêu&ÎuRÁ1\u001dÂhe¤óó_O/\u009b\u008aÖt\"íqFÍ\"\u0019\u008cT\ré!¥[q³\f\u0016Ø½\u0097?#]ÿ÷\u008a\bF¸\u0015{¡\\}ò\b\u0001Ä\u009d\u0093>/\rûâ¶\u0004B\u0098\u00118\u00adEyû4bÀ\u0089\u009f5+Kçú\u0089JÅ0\u0011Øl~¸Ý÷HC&\u009f\u008cêm&\u0089u\\Á \u001d\u0085ho¤þó\u001fO.\u009b\u0086Öh\"úqQÍ9\u0019\u0092T\u000b ùÿYK:\u0089JÅ0\u0011Øl~¸Ý÷HC&\u009f\u008cêm&øu[Á-\u001d\u0098h-¤øóDO!\u009b\u0083Öb\"³qRÍ\"\u0019\u008cT\u001e õÿEK>\u0087\u0097Ò\u0015.ý}^\u0089JÅ0\u0011Øl{¸Á÷UC6\u009f\u0086êr&\u0089u\\Á \u001d\u0085ho¤þó\u001fO.\u009b\u0086Öh\"úqQÍ9\u0019\u0092T\u000b ùÿYK:\u0089JÅ0\u0011Øl{¸Á÷UC6\u009f\u0086êr&øuZÁ9\u001d\u0087hn¤´óSO=\u009b\u0086Öj\"ùq\u001aÍ-\u0019\u008bT\u0017 ÷ÿRK<\u0087\u0095Ò\u000e.ú}DÉ5µ\u000fh\u0000$,ð\u0084\u008dlY\u009c\u0016]¢ ~\u0093\u000bbÇï\u0094Y +ü\u008b\u0089q\u0089\u0017Å;\u0011\u0093l{¸\u008b÷HC=\u009f\u008aêk&ÂuJÁz\u001d\u008ehb¤éóTO*\u009b\u008eÖh\"ùqkÍ,\u0019\u0087T\u0017 éÿS;Rw~£ÖÞ>\nÎE\rñx-ÏX.\u0094\u0087Ç\u000fs?¯ÎÚ#\u0016±A\rýi\u0089\u0017Å;\u0011\u0093l{¸\u008b÷HC=\u009f\u008aêk&ÂuJÁz\u001d\u009dhf¤÷óDO,\u0098±Ô\u008a\u0000)}Ø©-æìR\u0091\u008e\"ûÓ7^dìÐ\u0081\f+yÆµY\u0082ñÎÊ\u001aig\u0098³6ü¸HÙ\u0094 á\u008a-(~ºÊ\u009c\u0016fc\u008c¯\u001eø´Dñ\u0090dÝ\u0081)\u0017z¾ÆÂ\u0012g_À«\u0012ô´@Ê\u008cvÙý%*v½ÂÂ\u000eS[ì§^ð¸<Í\u0089\u0017Å;\u0011\u0093l{¸\u008b÷YC!\u009f\u009dê_&ÀuNÁ&\u0089\u0017Å;\u0011\u0093l{¸\u008b÷YC!\u009f\u009dê_&ÓuWÁ8\u001d\u0089\u0089\u0017Å;\u0011\u0093l{¸\u008b÷HC=\u009f\u008aêk&ÂuJÁz\u001d\u008ehp¤îóWO'\u009b\u0083Öb\"øqFÍ/\u0089\u0017Å,\u0011\u008fl~¸Ð÷^C?\u009fÆêl&Îu\\Áz\u001d\u0080hj¤øóSO;\u009b\u009bÖ`\"òqXÍ/\u0019\u0087T\u000b Ïÿ]K \u0087\u008cÒR.à}E\u000fgCK\u0097ãê\u000b>ûq)ÅQ\u0019íl\u0011 ´ó-G@\u0089\u0017Å;\u0011\u0093l{¸\u008b÷YC!\u009f\u009dêg&ÞuLÁ:\u0015\u0014Y8\u008d\u0090ðx$\u0088kZß\"\u0003\u009evnºÁéZ]8Õ\u0014\u00998M\u00900xä\u0088«Z\u001f\"Ã\u009e¶lzÖ)T\u009d3uª9\u0086í.\u0090ÆD6\u000bä¿\u009cc \u0016ËÚw\u0089ð=\u008f\u008cÉÀå\u0014Mi¥½Uò\u0087Fÿ\u009aCï®#\u001ep\u0081Äâ\u0018Bm¾\u0094IØe\fÍq%¥Õê\u0007^\u007f\u0082Ã÷\u0001;\u0090h\rÜn\u0089\u0017Å;\u0011\u0097ly¸Å÷\u0014C6\u009f\u0086êw&ÉuRÁ:\u001d\u008dhg¤éó\u001eOf\u009b\u0097Öd\"²qVÍ8\u0019\u0096T\u0012\u000b½G\u0098\u00932îÓ:!uæÁ\u0091\u001d-hÎ¤b÷ãC\u008c\u009fiêë&CqïÍ±\u0019-TÍ EóûO\u0085\u009b\u000eÖ¼\"V}ùÉ\u0081\u0005=\u0089\u0017Å/\u0011\u0084lb¸Ç÷\u0014C;\u009f\u0086êp&ÈuLÁ!\u001d\u009f\u0089\bÅ9\u0011\u0090l-¸\u009e\u0089\u0017Å/\u0011\u0084lb¸Ç÷\u0014C!\u009f\u008cêl&Áu\u0011Á8\u001d\u008dhs¤é\u0089_Å-\u0011\u0097la¸È÷TC1\u009fÇêg&ÈuRÁ1\u001d\u008ahj¤éóYOf\u009b\u009cÖiRe\u001e\u0007Ê¥·{cÙ,O\u00980D\u00871Sýå®{\u001aJÆ®³]q#=\u000eé¶\u0094Z@¿\u000fb»\u0003g¹\u0012]Þò\u008dU9\u0002å·\u0090S\\Ë\u000bf·\u000fcõ.JÚÄ\u0089l\u0089ZÅ3\u0011\u0083lh¸×÷OC3\u009f\u008aêk&Ô`8,\u0015ø\u00ad\u0085AQ¤\u001eyª\u0012v³\u0003AÏü\u009cb[¸\u0017\u0094Ã8¾Öjj%»\u0091\u0099M)8Øôf§ý\u0013\u0095Ï\"ºÈvF!±\u009dÉI$\u0004Ùð\u001d£ú\u001f\u0094Ë=\u0086¥r\u0011-à\u0099\u008cU&\u0089\u0017Å/\u0011\u0084lb¸Ç÷\u0014C1\u009f\u0099êu&ÎuPÁ3\u001d\u0083Ü\u0016\u0090YDó9\u0000í«¢;\u0016HÊè\u0006\u0088J¤\u009e\bãæ7Zx\u008bÌ \u0010\u001feì©[ú\u008eNº\u0092\u0001çó+c|ÇÀ»\u0014\u0015Yê\u00ad-þÈB¡\u0096\u000fÛÉ/?p\u0087Ä²\b\u0015]\u008e¡\"òØF·\u008a$ß\u0092#ftÄ¸²\f6Q\u0099¥8öÒ:½\u008e,Ó\u009f'zhÑ¼@".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        get = cArr;
        initialize = 9023973778996315487L;
    }

    public setEnabled(Locale locale) {
        this.getWarnings = locale;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        r1[r2] = (char) r5[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0175, code lost:
    
        r0 = new java.lang.Object[]{r4, r4};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(1724349229);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0185, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bc, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.util.TypedValue.complexToFloat(0) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFloat(0) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 27780), 2441 - android.text.TextUtils.indexOf("", ""));
        r4 = new java.lang.Object[1];
        c((byte) 0, 0, (byte) 0, r4);
        r2 = r2.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r1.put(1724349229, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        char c2;
        Object method;
        Throwable cause;
        int i3;
        Object method2;
        int i4;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        byte b = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        $11 = ($10 + 125) % 128;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                break;
            }
            $11 = ($10 + 1) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(get[i2 + i5])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    method2 = obj;
                    i3 = 2;
                } else {
                    i3 = 2;
                    byte b2 = b;
                    Class cls2 = (Class) removeParam.initialize(49 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) Color.blue((int) b), ImageFormat.getBitsPerPixel(b2) + 3222);
                    Object[] objArr3 = new Object[1];
                    c(b2, (short) 1, b2, objArr3);
                    method2 = cls2.getMethod((String) objArr3[b2], cls);
                    map.put(-54653524, method2);
                }
                Long l = (Long) ((Method) method2).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = initialize;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 != null) {
                    i4 = 1;
                } else {
                    i4 = 1;
                    Class cls3 = (Class) removeParam.initialize(69 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (50704 - (ViewConfiguration.getScrollBarSize() >> 8)), 7789 - View.resolveSize(0, 0));
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i5] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[i4] = threeDS2ServiceInitializationCallback;
                objArr5[0] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 48, (char) (TextUtils.getTrimmedLength("") + 27780), 2441 - (ViewConfiguration.getEdgeSlop() >> 16));
                    Object[] objArr6 = new Object[i4];
                    c((byte) 0, (short) 0, (byte) 0, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 19) % 128;
                b = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char c3 = '0';
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i6 = threeDS2ServiceInitializationCallback.initialize;
            if (i6 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i7 = $10 + 111;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                break;
            }
            cArr[i6] = (char) jArr[i6];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 != null) {
                method = obj4;
                c2 = c3;
            } else {
                c2 = c3;
                Class cls6 = (Class) removeParam.initialize(47 - TextUtils.indexOf("", c2), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27780), 2440 - Process.getGidForName(""));
                Object[] objArr8 = new Object[1];
                c((byte) 0, (short) 0, (byte) 0, objArr8);
                method = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, method);
            }
            ((Method) method).invoke(null, objArr7);
            c3 = c2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 31 - (s2 * 2);
        int i4 = s + 84;
        byte[] bArr2 = new byte[i + 2];
        int i5 = i + 1;
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 = i4 + (-i6) + 2;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i4 = i4 + (-i6) + 2;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
            }
        }
    }

    private static void c(byte b, short s, byte b2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = (s * 3) + 97;
        int i2 = b * 3;
        int i3 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i += i3;
            i3 = i3;
            bArr = bArr;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            int i7 = i3 + 1;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i += bArr[i7];
            i3 = i7;
            bArr = bArr3;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x241d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x2467  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x2561  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x2ce5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x2da1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2e76  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x2d9e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x246a A[Catch: all -> 0x331d, TryCatch #6 {all -> 0x331d, blocks: (B:6:0x00e4, B:9:0x0142, B:20:0x0257, B:23:0x02af, B:27:0x0272, B:31:0x0343, B:34:0x03a1, B:42:0x0493, B:45:0x04ea, B:48:0x04af, B:49:0x0500, B:52:0x0554, B:58:0x0647, B:61:0x06a3, B:64:0x0662, B:81:0x07be, B:84:0x081a, B:87:0x07db, B:91:0x08d9, B:94:0x0933, B:102:0x0a33, B:105:0x0a8e, B:108:0x0a4f, B:110:0x0acc, B:113:0x0b26, B:120:0x0ba6, B:123:0x0c02, B:127:0x0bc1, B:129:0x0c68, B:132:0x0cc4, B:138:0x0da9, B:141:0x0e07, B:143:0x0dc6, B:145:0x0e45, B:148:0x0e8f, B:157:0x0f36, B:160:0x0f96, B:163:0x0f53, B:165:0x1000, B:168:0x1054, B:174:0x11f2, B:177:0x1255, B:180:0x1210, B:181:0x126e, B:184:0x12c3, B:188:0x13bc, B:191:0x141d, B:194:0x13d8, B:196:0x1438, B:199:0x1494, B:205:0x1583, B:208:0x15de, B:210:0x159f, B:212:0x161b, B:215:0x166e, B:217:0x1677, B:220:0x16da, B:225:0x240d, B:228:0x245e, B:239:0x2841, B:242:0x2898, B:247:0x2950, B:250:0x29a2, B:267:0x295f, B:258:0x2aa0, B:261:0x2b08, B:264:0x2abf, B:270:0x2855, B:300:0x2dfa, B:303:0x2e5d, B:306:0x2e19, B:321:0x2ffb, B:324:0x305e, B:327:0x301a, B:329:0x309f, B:332:0x30fb, B:336:0x31ec, B:339:0x324e, B:341:0x3209, B:343:0x32a5, B:346:0x3304, B:349:0x32c1, B:350:0x30b3, B:380:0x246a, B:383:0x24cd, B:385:0x2488, B:386:0x241e, B:387:0x1696, B:391:0x1fe3, B:394:0x2042, B:402:0x205f, B:405:0x20bc, B:410:0x2075, B:415:0x1ff8, B:420:0x21dd, B:423:0x2238, B:429:0x236b, B:432:0x23cd, B:434:0x238a, B:435:0x21f7, B:437:0x2298, B:440:0x22f9, B:442:0x22b3, B:443:0x162a, B:445:0x144e, B:446:0x127f, B:462:0x1011, B:465:0x0e54, B:467:0x0c7e, B:469:0x0ae4, B:470:0x08f1, B:481:0x0513, B:482:0x035a, B:486:0x00ff), top: B:5:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x241e A[Catch: all -> 0x331d, TryCatch #6 {all -> 0x331d, blocks: (B:6:0x00e4, B:9:0x0142, B:20:0x0257, B:23:0x02af, B:27:0x0272, B:31:0x0343, B:34:0x03a1, B:42:0x0493, B:45:0x04ea, B:48:0x04af, B:49:0x0500, B:52:0x0554, B:58:0x0647, B:61:0x06a3, B:64:0x0662, B:81:0x07be, B:84:0x081a, B:87:0x07db, B:91:0x08d9, B:94:0x0933, B:102:0x0a33, B:105:0x0a8e, B:108:0x0a4f, B:110:0x0acc, B:113:0x0b26, B:120:0x0ba6, B:123:0x0c02, B:127:0x0bc1, B:129:0x0c68, B:132:0x0cc4, B:138:0x0da9, B:141:0x0e07, B:143:0x0dc6, B:145:0x0e45, B:148:0x0e8f, B:157:0x0f36, B:160:0x0f96, B:163:0x0f53, B:165:0x1000, B:168:0x1054, B:174:0x11f2, B:177:0x1255, B:180:0x1210, B:181:0x126e, B:184:0x12c3, B:188:0x13bc, B:191:0x141d, B:194:0x13d8, B:196:0x1438, B:199:0x1494, B:205:0x1583, B:208:0x15de, B:210:0x159f, B:212:0x161b, B:215:0x166e, B:217:0x1677, B:220:0x16da, B:225:0x240d, B:228:0x245e, B:239:0x2841, B:242:0x2898, B:247:0x2950, B:250:0x29a2, B:267:0x295f, B:258:0x2aa0, B:261:0x2b08, B:264:0x2abf, B:270:0x2855, B:300:0x2dfa, B:303:0x2e5d, B:306:0x2e19, B:321:0x2ffb, B:324:0x305e, B:327:0x301a, B:329:0x309f, B:332:0x30fb, B:336:0x31ec, B:339:0x324e, B:341:0x3209, B:343:0x32a5, B:346:0x3304, B:349:0x32c1, B:350:0x30b3, B:380:0x246a, B:383:0x24cd, B:385:0x2488, B:386:0x241e, B:387:0x1696, B:391:0x1fe3, B:394:0x2042, B:402:0x205f, B:405:0x20bc, B:410:0x2075, B:415:0x1ff8, B:420:0x21dd, B:423:0x2238, B:429:0x236b, B:432:0x23cd, B:434:0x238a, B:435:0x21f7, B:437:0x2298, B:440:0x22f9, B:442:0x22b3, B:443:0x162a, B:445:0x144e, B:446:0x127f, B:462:0x1011, B:465:0x0e54, B:467:0x0c7e, B:469:0x0ae4, B:470:0x08f1, B:481:0x0513, B:482:0x035a, B:486:0x00ff), top: B:5:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0831  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] getWarnings(Context context, int i, int i2, int i3) {
        int i4;
        int i5;
        short s;
        int i6;
        int i7;
        Class cls;
        int i8;
        Integer num;
        int i9;
        int i10;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object[] objArr2;
        Class cls2;
        long j;
        Object[] objArr3;
        char c;
        Object[] objArr4;
        String[][] strArr;
        int i19;
        Object obj;
        Object invoke;
        int i20;
        int i21;
        int i22;
        int i23;
        String[][] strArr2;
        int i24;
        String[] strArr3;
        String str;
        String str2;
        int i25;
        String[] strArr4;
        String next;
        String[] strArr5;
        String[] strArr6;
        int i26 = 0;
        Integer num2 = 0;
        int i27 = 1;
        Object[] objArr5 = new Object[1];
        a(8 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 465, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
        String intern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27, Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
        String intern2 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(25 - TextUtils.getOffsetAfter("", 0), 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (34798 - Color.blue(0)), objArr7);
        String intern3 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.green(0) + 52, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3274), objArr8);
        String intern4 = ((String) objArr8[0]).intern();
        short s2 = 28;
        Object[] objArr9 = new Object[1];
        a(28 - View.MeasureSpec.makeMeasureSpec(0, 0), 69 - ImageFormat.getBitsPerPixel(0), (char) (KeyEvent.keyCodeFromString("") + 41165), objArr9);
        String[] strArr7 = {intern2, intern3, intern4, ((String) objArr9[0]).intern()};
        int i28 = 0;
        while (true) {
            if (i28 >= 4) {
                i4 = i26;
                i5 = 4;
                s = s2;
                i6 = 24;
                i7 = 2;
                cls = String.class;
                i8 = i;
                break;
            }
            i6 = 24;
            try {
                Object[] objArr10 = {strArr7[i28]};
                i7 = 2;
                Map map = removeParam.visaSchemeConfiguration;
                s = s2;
                Object obj2 = map.get(-87104105);
                if (obj2 != null) {
                    strArr6 = strArr7;
                    i4 = i26;
                    i5 = 4;
                } else {
                    i5 = 4;
                    i4 = i26;
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, (char) TextUtils.indexOf("", "", i26, i26), 2754 - Color.red(i4));
                    strArr6 = strArr7;
                    Object[] objArr11 = new Object[i27];
                    b(r9[24], r9[23], (byte) ($$a[8] - i27), objArr11);
                    obj2 = cls3.getMethod((String) objArr11[i4], String.class);
                    map.put(-87104105, obj2);
                }
                long longValue = ((Long) ((Method) obj2).invoke(null, objArr10)).longValue();
                long j2 = longValue ^ (-1);
                cls = String.class;
                long j3 = i ^ (-1);
                long m = SVG$Unit$EnumUnboxingLocalUtility.m(184L, ((787183773 | j2) ^ (-1)) | ((j3 | (-787183774)) ^ (-1)) | (((-787183774) | longValue) ^ (-1)), (((-787183774) | j2 | j3) * 184) + ((-368) * (longValue | 787183773)) + (185 * longValue) + 144054630642L, -1304567888L);
                int i29 = ~i;
                if (((((int) (m >> 32)) & ((((~((-1431907555) | i29)) | 1426588706) * 859) + (((~(5318856 | i29)) | (~((-5318849) | i))) * 859) + ((5318856 | i) * (-859)) + 63214188)) | (((int) m) & Boxes$$ExternalSyntheticOutline1.m((~((-843734740) | i)) | 37753937, 490, (((-805980803) | i29) * (-490)) + 765112651, 979466050))) != 0) {
                    int i30 = ThreeDS2Service + 73;
                    ThreeDS2ServiceInstance = i30 % 128;
                    i8 = i30 % 2 == 0 ? (i28 >> 13) ^ i : i ^ (i28 + EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                } else {
                    i28++;
                    s2 = s;
                    strArr7 = strArr6;
                    i26 = i4;
                    i27 = 1;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Class cls4 = Integer.TYPE;
        int i31 = 3;
        if (i8 != i) {
            Object[] objArr12 = new Object[5];
            int[] iArr = new int[1];
            objArr12[i4] = iArr;
            int[] iArr2 = new int[1];
            objArr12[1] = iArr2;
            objArr12[i5] = new int[1];
            iArr[i4] = i;
            iArr2[i4] = i8;
            objArr12[i7] = null;
            objArr12[3] = null;
            int i32 = ~((-689623890) | i);
            int i33 = ((i32 | (~((-387599582) | i))) * 140) + ((671126272 | i32) * (-280)) + 410953630;
            int i34 = ~((-18497618) | i);
            int i35 = ~i;
            int i36 = (((~(i35 | (-369101965))) | i34 | (~((-671126273) | i35))) * 140) + i33;
            Object[] objArr13 = new Object[3];
            objArr13[i7] = Integer.valueOf(i36);
            objArr13[1] = 16;
            objArr13[i4] = Integer.valueOf(i3);
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1544987438);
            if (obj3 == null) {
                Class cls5 = (Class) removeParam.initialize(86 - Color.alpha(i4), (char) (28641 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3318 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                byte[] bArr = $$a;
                byte b = bArr[19];
                byte b2 = bArr[i6];
                byte b3 = bArr[26];
                Object[] objArr14 = new Object[1];
                b(b, b2, b3, objArr14);
                obj3 = cls5.getMethod((String) objArr14[i4], cls4, cls4, cls4);
                map2.put(-1544987438, obj3);
            }
            ((int[]) objArr12[i5])[i4] = ((Integer) ((Method) obj3).invoke(null, objArr13)).intValue();
            return objArr12;
        }
        Object[] objArr15 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, AndroidCharacter.getMirror('0') + '2', (char) (ViewConfiguration.getTapTimeout() >> 16), objArr15);
        String intern5 = ((String) objArr15[i4]).intern();
        int i37 = i4;
        Object[] objArr16 = new Object[1];
        a(TextUtils.indexOf("", "", i37) + 13, TextUtils.indexOf("", "", i37, i37) + 110, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr16);
        String intern6 = ((String) objArr16[i4]).intern();
        Object[] objArr17 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 123 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
        String[] strArr8 = {intern5, intern6, ((String) objArr17[0]).intern()};
        int i38 = 0;
        while (true) {
            if (i38 >= i31) {
                num = num2;
                i9 = i31;
                i10 = i;
                break;
            }
            Object[] objArr18 = {strArr8[i38]};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj4 = map3.get(-87104105);
            if (obj4 != null) {
                strArr5 = strArr8;
                num = num2;
                i9 = i31;
            } else {
                Class cls6 = (Class) removeParam.initialize(TextUtils.indexOf("", "") + 48, (char) View.combineMeasuredStates(0, 0), 2754 - Color.alpha(0));
                i9 = i31;
                num = num2;
                strArr5 = strArr8;
                Object[] objArr19 = new Object[1];
                b(r12[i6], r12[23], (byte) ($$a[8] - 1), objArr19);
                obj4 = cls6.getMethod((String) objArr19[0], cls);
                map3.put(-87104105, obj4);
            }
            long longValue2 = ((Long) ((Method) obj4).invoke(null, objArr18)).longValue();
            long j4 = (971 * longValue2) + 3066243711314L;
            long j5 = longValue2 ^ (-1);
            long j6 = ((i ^ (-1)) | longValue2) ^ (-1);
            int m2 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(970L, ((1581353125 | j5) ^ (-1)) | j6, (1940 * ((1581353125 | longValue2) ^ (-1))) + (((-970) * (((j5 | (-1581353126)) ^ (-1)) | j6)) + j4), -510398536L) >> 32)) & Boxes$$ExternalSyntheticOutline1.m(~((-69865857) | i), -1504, (((~((-74068876) | i)) | 4203019) * 1504) - 1320242614, 731095744);
            int i39 = ~i;
            if ((m2 | (((int) r5) & ((((~(i39 | (-631963725))) | (~(665785436 | i)) | (-805262686)) * 988) + (((~((-139477250) | i39)) | (~((-631963725) | i))) * 988) + 1913854961))) != 0) {
                i10 = i ^ (i38 + EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
                break;
            }
            i38++;
            strArr8 = strArr5;
            i31 = i9;
            num2 = num;
        }
        if (i10 != i) {
            Object[] objArr20 = new Object[5];
            objArr20[0] = new int[]{i};
            objArr20[1] = new int[]{i10};
            objArr20[i5] = new int[1];
            objArr20[i7] = null;
            objArr20[i9] = null;
            Object[] objArr21 = new Object[i9];
            objArr21[i7] = Integer.valueOf((((~(1063124759 | i)) | 1066065408) * 70) + ((~(1071644439 | i)) * 70) + (((~(14098711 | i)) | 1057545728) * (-140)) + 1494602798);
            objArr21[1] = 16;
            objArr21[0] = Integer.valueOf(i3);
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj5 = map4.get(-1544987438);
            if (obj5 == null) {
                Class cls7 = (Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 86, (char) (ImageFormat.getBitsPerPixel(0) + 28642), View.combineMeasuredStates(0, 0) + 3317);
                byte[] bArr2 = $$a;
                Object[] objArr22 = new Object[1];
                b(bArr2[19], bArr2[i6], bArr2[26], objArr22);
                obj5 = cls7.getMethod((String) objArr22[0], cls4, cls4, cls4);
                map4.put(-1544987438, obj5);
            }
            ((int[]) objArr20[i5])[0] = ((Integer) ((Method) obj5).invoke(null, objArr21)).intValue();
            return objArr20;
        }
        Map map5 = removeParam.visaSchemeConfiguration;
        Object obj6 = map5.get(544603440);
        if (obj6 != null) {
            objArr = null;
        } else {
            Class cls8 = (Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 48, (char) (MotionEvent.axisFromString("") + 1), MotionEvent.axisFromString("") + 2344);
            byte[] bArr3 = $$a;
            Object[] objArr23 = new Object[1];
            b((short) 19, bArr3[23], bArr3[9], objArr23);
            objArr = null;
            obj6 = cls8.getMethod((String) objArr23[0], null);
            map5.put(544603440, obj6);
        }
        long longValue3 = ((Long) ((Method) obj6).invoke(objArr, objArr)).longValue();
        long j7 = i;
        long j8 = j7 ^ (-1);
        long m3 = SVG$Unit$EnumUnboxingLocalUtility.m(627L, ((j8 | longValue3) ^ (-1)) | (((-1293791710) | j7) ^ (-1)), ((-627) * ((-1293791710) | (((longValue3 ^ (-1)) | j7) ^ (-1)))) + ((longValue3 | j7 | 1293791709) * (-627)) + ((628 * longValue3) - 812501193880L), -514674258L);
        int i40 = ~i;
        int i41 = r4 != 0 ? (r4 + EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE) ^ i : i;
        if (i41 != i) {
            ThreeDS2ServiceInstance = (ThreeDS2Service + 13) % 128;
            Object[] objArr24 = new Object[5];
            objArr24[0] = new int[]{i};
            objArr24[1] = new int[]{i41};
            objArr24[i5] = new int[1];
            objArr24[i7] = null;
            objArr24[3] = null;
            Object[] objArr25 = new Object[3];
            objArr25[i7] = Integer.valueOf((((~(i | (-373053483))) | 3688448 | (~(i40 | 1073535022))) * 521) + ((704169988 | i) * 521) + (((~(i40 | 704169988)) | 373053482) * (-1042)) + 364215684);
            objArr25[1] = 16;
            objArr25[0] = Integer.valueOf(i3);
            Object obj7 = map5.get(-1544987438);
            if (obj7 == null) {
                Class cls9 = (Class) removeParam.initialize(Color.alpha(0) + 86, (char) ((Process.myPid() >> 22) + 28641), 3317 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                byte[] bArr4 = $$a;
                Object[] objArr26 = new Object[1];
                b(bArr4[19], bArr4[i6], bArr4[26], objArr26);
                obj7 = cls9.getMethod((String) objArr26[0], cls4, cls4, cls4);
                map5.put(-1544987438, obj7);
            }
            ((int[]) objArr24[i5])[0] = ((Integer) ((Method) obj7).invoke(null, objArr25)).intValue();
            return objArr24;
        }
        Object[] objArr27 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 140, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr27);
        String intern7 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 6, (ViewConfiguration.getWindowTouchSlop() >> 8) + EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 55060), objArr28);
        String intern8 = ((String) objArr28[0]).intern();
        File file = new File(intern7);
        if (file.exists() && file.isFile()) {
            try {
                Scanner scanner = new Scanner(new FileInputStream(file));
                i11 = i40;
                try {
                    Object[] objArr29 = new Object[1];
                    a(2 - Gravity.getAbsoluteGravity(0, 0), View.resolveSizeAndState(0, 0, 0) + 167, (char) (Process.myTid() >> 22), objArr29);
                    Scanner useDelimiter = scanner.useDelimiter(((String) objArr29[0]).intern());
                    next = useDelimiter.hasNext() ? useDelimiter.next() : "";
                    useDelimiter.close();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
            }
            if (next.contains(intern8)) {
                i12 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                if (i12 != i) {
                    Object[] objArr30 = new Object[5];
                    objArr30[0] = new int[]{i};
                    objArr30[1] = new int[]{i12};
                    objArr30[i5] = new int[1];
                    objArr30[i7] = null;
                    objArr30[3] = null;
                    Object[] objArr31 = new Object[3];
                    objArr31[i7] = Integer.valueOf((((-933340339) | i11) * 754) + (((~(i | (-924877955))) | (~(i11 | 1068761086))) * (-754)) + (((((~((-933340339) | i)) | 924877954) | (~(143883132 | i))) * (-754)) - 672497350));
                    objArr31[1] = 16;
                    objArr31[0] = Integer.valueOf(i3);
                    Map map6 = removeParam.visaSchemeConfiguration;
                    Object obj8 = map6.get(-1544987438);
                    if (obj8 == null) {
                        Class cls10 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 86, (char) (28641 - View.MeasureSpec.getSize(0)), 3318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        byte[] bArr5 = $$a;
                        Object[] objArr32 = new Object[1];
                        b(bArr5[19], bArr5[i6], bArr5[26], objArr32);
                        obj8 = cls10.getMethod((String) objArr32[0], cls4, cls4, cls4);
                        map6.put(-1544987438, obj8);
                    }
                    ((int[]) objArr30[i5])[0] = ((Integer) ((Method) obj8).invoke(null, objArr31)).intValue();
                    return objArr30;
                }
                Object[] objArr33 = new Object[1];
                a(KeyEvent.getDeadChar(0, 0) + 31, 169 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr33);
                String intern9 = ((String) objArr33[0]).intern();
                Object[] objArr34 = new Object[1];
                a(23 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 199 - ExpandableListView.getPackedPositionChild(0L), (char) (ImageFormat.getBitsPerPixel(0) + 40892), objArr34);
                String intern10 = ((String) objArr34[0]).intern();
                Object[] objArr35 = new Object[1];
                a(View.combineMeasuredStates(0, 0) + 28, (ViewConfiguration.getWindowTouchSlop() >> 8) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, (char) (Color.alpha(0) + 48574), objArr35);
                String intern11 = ((String) objArr35[0]).intern();
                Object[] objArr36 = new Object[1];
                a(15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 251 - View.resolveSize(0, 0), (char) Color.blue(0), objArr36);
                String[] strArr9 = {intern9, intern10, intern11, ((String) objArr36[0]).intern()};
                int i42 = i5;
                int i43 = 0;
                while (true) {
                    if (i43 >= i42) {
                        i13 = i;
                        break;
                    }
                    ThreeDS2Service = (ThreeDS2ServiceInstance + 3) % 128;
                    Object[] objArr37 = {strArr9[i43]};
                    Map map7 = removeParam.visaSchemeConfiguration;
                    Object obj9 = map7.get(-39554962);
                    if (obj9 != null) {
                        strArr4 = strArr9;
                    } else {
                        Class cls11 = (Class) removeParam.initialize(Color.red(0) + 48, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 2754 - View.combineMeasuredStates(0, 0));
                        byte b4 = $$a[23];
                        strArr4 = strArr9;
                        Object[] objArr38 = new Object[1];
                        b(s, b4, b4, objArr38);
                        obj9 = cls11.getMethod((String) objArr38[0], cls);
                        map7.put(-39554962, obj9);
                    }
                    long longValue4 = ((Long) ((Method) obj9).invoke(null, objArr37)).longValue();
                    long j9 = longValue4 ^ (-1);
                    long j10 = (-1052049761) | longValue4;
                    long j11 = ((((1052049760 | j9) ^ (-1)) | ((1052049760 | j8) ^ (-1)) | ((j9 | j8) ^ (-1)) | ((j10 | j7) ^ (-1))) * (-84)) + ((85 * longValue4) - 89424229685L);
                    long j12 = (j8 | longValue4) ^ (-1);
                    long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(84L, j12 | (j10 ^ (-1)), ((-84) * ((-1052049761) | ((j9 | j7) ^ (-1)) | j12)) + j11, 2092290508L);
                    if (((((int) (m4 >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~(2130941638 | i)) | (~((-693715228) | i)), -1324, ((i11 | 1443010244) * 1324) - 818884594, -1323972628)) | (((int) m4) & (((~(i11 | (-335807753))) * 501) + ((((~((-335807753) | i)) | (-2128601055)) * 501) - 895946472)))) != 0) {
                        i13 = i ^ (i43 + EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        break;
                    }
                    i43++;
                    strArr9 = strArr4;
                    i42 = 4;
                    s = 28;
                }
                if (i13 != i) {
                    Object[] objArr39 = new Object[5];
                    objArr39[0] = new int[]{i};
                    objArr39[1] = new int[]{i13};
                    objArr39[4] = new int[1];
                    objArr39[i7] = null;
                    objArr39[3] = null;
                    int i44 = (((~((-3489921) | i11)) | (~(125290408 | i))) * 520) + 719772990;
                    int i45 = ~((-125290409) | i11);
                    int i46 = ~(i | 951933062);
                    int i47 = (((~((-951933063) | i11)) | 121800488 | i46) * 520) + ((i45 | i46) * (-1040)) + i44;
                    Object[] objArr40 = new Object[3];
                    objArr40[i7] = Integer.valueOf(i47);
                    objArr40[1] = 16;
                    objArr40[0] = Integer.valueOf(i3);
                    Map map8 = removeParam.visaSchemeConfiguration;
                    Object obj10 = map8.get(-1544987438);
                    if (obj10 == null) {
                        Class cls12 = (Class) removeParam.initialize(86 - TextUtils.getOffsetBefore("", 0), (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28641), View.resolveSizeAndState(0, 0, 0) + 3317);
                        byte[] bArr6 = $$a;
                        Object[] objArr41 = new Object[1];
                        b(bArr6[19], bArr6[i6], bArr6[26], objArr41);
                        obj10 = cls12.getMethod((String) objArr41[0], cls4, cls4, cls4);
                        map8.put(-1544987438, obj10);
                    }
                    ((int[]) objArr39[4])[0] = ((Integer) ((Method) obj10).invoke(null, objArr40)).intValue();
                    return objArr39;
                }
                Object[] objArr42 = new Object[1];
                a(13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE, (char) View.MeasureSpec.getMode(0), objArr42);
                Object[] objArr43 = {((String) objArr42[0]).intern()};
                Map map9 = removeParam.visaSchemeConfiguration;
                Object obj11 = map9.get(-690415720);
                if (obj11 != null) {
                    i14 = -690415720;
                } else {
                    Class cls13 = (Class) removeParam.initialize(47 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2248);
                    byte b5 = $$a[19];
                    i14 = -690415720;
                    Object[] objArr44 = new Object[1];
                    b((short) 37, b5, b5, objArr44);
                    obj11 = cls13.getMethod((String) objArr44[0], cls);
                    map9.put(-690415720, obj11);
                }
                String str3 = (String) ((Method) obj11).invoke(null, objArr43);
                if (str3 != null) {
                    ThreeDS2ServiceInstance = (ThreeDS2Service + 13) % 128;
                    Object[] objArr45 = new Object[1];
                    a(9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 278 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr45);
                    if (str3.contains(((String) objArr45[0]).intern())) {
                        i15 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE;
                        if (i15 == i) {
                            objArr4 = new Object[5];
                            objArr4[0] = new int[]{i};
                            objArr4[1] = new int[]{i15};
                            objArr4[4] = new int[1];
                            objArr4[i7] = null;
                            objArr4[3] = null;
                            Object[] objArr46 = new Object[3];
                            objArr46[i7] = Integer.valueOf((((~(i11 | 216037354)) | 4202560) * 495) + ((r0 * 495) - 1003043235));
                            objArr46[1] = 16;
                            objArr46[0] = Integer.valueOf(i3);
                            Object obj12 = map9.get(-1544987438);
                            if (obj12 == null) {
                                Class cls14 = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 86, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28641), 3318 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                byte[] bArr7 = $$a;
                                Object[] objArr47 = new Object[1];
                                b(bArr7[19], bArr7[i6], bArr7[26], objArr47);
                                obj12 = cls14.getMethod((String) objArr47[0], cls4, cls4, cls4);
                                map9.put(-1544987438, obj12);
                            }
                            ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj12).invoke(null, objArr46)).intValue();
                        } else {
                            Object[] objArr48 = new Object[1];
                            a(Color.blue(0) + 17, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (Process.myTid() >> 22), objArr48);
                            String intern12 = ((String) objArr48[0]).intern();
                            Object[] objArr49 = new Object[1];
                            a(Color.alpha(0) + 6, 305 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), objArr49);
                            Object[] objArr50 = new Object[i7];
                            objArr50[1] = ((String) objArr49[0]).intern();
                            objArr50[0] = intern12;
                            Object obj13 = map9.get(-715665817);
                            if (obj13 != null) {
                                i16 = -715665817;
                            } else {
                                i16 = -715665817;
                                Class cls15 = (Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (ViewConfiguration.getEdgeSlop() >> 16), 2609 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                byte[] bArr8 = $$a;
                                Object[] objArr51 = new Object[1];
                                b((short) 19, bArr8[23], bArr8[9], objArr51);
                                obj13 = cls15.getMethod((String) objArr51[0], cls, cls);
                                map9.put(-715665817, obj13);
                            }
                            long longValue5 = ((Long) ((Method) obj13).invoke(null, objArr50)).longValue();
                            long j13 = longValue5 ^ (-1);
                            long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(591L, j7 | (-523347465) | j13, ((-591) * (((((-523347465) | j13) | j8) ^ (-1)) | ((523347464 | longValue5) ^ (-1)))) + ((-1182) * (((-523347465) | longValue5) ^ (-1))) + ((-590) * longValue5) + 309821698688L, 1062340384L);
                            int i48 = ((int) ((long) ((((int) (m5 >> 32)) & (((((~(1774034508 | i11)) | 1083706376) | (~((-1085804109) | i))) * 717) + ((((~(1774034508 | i)) | ((~(i11 | (-1085804109))) | 1083706376)) * 717) + 1348793871))) | (((int) m5) & (((((~(2021665074 | i11)) | (~((-584438665) | i))) | (~((-2021665075) | i))) * 959) + ((((~(i11 | (-2021665075))) | ((~((-584438665) | i11)) | (~(2021665074 | i)))) * 959) + (-355073380))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE : i;
                            if (i48 != i) {
                                objArr4 = new Object[]{new int[]{i}, new int[]{i48}, null, null, new int[1]};
                                Object[] objArr52 = {Integer.valueOf(i3), 16, Integer.valueOf(((~(i | (-4726834))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE) + (((~((-459845302) | i)) | 455118468) * (-283)) + 1026731034)};
                                Object obj14 = map9.get(-1544987438);
                                if (obj14 == null) {
                                    Class cls16 = (Class) removeParam.initialize(86 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 28641), (Process.myPid() >> 22) + 3317);
                                    byte[] bArr9 = $$a;
                                    Object[] objArr53 = new Object[1];
                                    b(bArr9[19], bArr9[i6], bArr9[26], objArr53);
                                    obj14 = cls16.getMethod((String) objArr53[0], cls4, cls4, cls4);
                                    map9.put(-1544987438, obj14);
                                }
                                ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj14).invoke(null, objArr52)).intValue();
                            } else {
                                Object[] objArr54 = new Object[1];
                                a(23 - Color.blue(0), 310 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr54);
                                Object[] objArr55 = {((String) objArr54[0]).intern()};
                                Object obj15 = map9.get(Integer.valueOf(i14));
                                if (obj15 == null) {
                                    Class cls17 = (Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 47, (char) Color.red(0), TextUtils.getOffsetAfter("", 0) + 2248);
                                    byte b6 = $$a[19];
                                    Object[] objArr56 = new Object[1];
                                    b((short) 37, b6, b6, objArr56);
                                    obj15 = cls17.getMethod((String) objArr56[0], cls);
                                    map9.put(Integer.valueOf(i14), obj15);
                                }
                                String lowerCase = ((String) ((Method) obj15).invoke(null, objArr55)).toLowerCase();
                                Object[] objArr57 = new Object[1];
                                a((ViewConfiguration.getFadingEdgeLength() >> 16) + 4, TextUtils.indexOf((CharSequence) "", '0', 0) + 334, (char) KeyEvent.normalizeMetaState(0), objArr57);
                                if (lowerCase.contains(((String) objArr57[0]).intern())) {
                                    int i49 = ThreeDS2Service + 121;
                                    ThreeDS2ServiceInstance = i49 % 128;
                                    i17 = i49 % 2 == 0 ? i ^ 12214 : i ^ EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE;
                                } else {
                                    i17 = i;
                                }
                                if (i17 != i) {
                                    Object[] objArr58 = {new int[]{i}, new int[]{i17}, null, null, new int[1]};
                                    Object[] objArr59 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 328619685)) | (~((-748603786) | i)) | 738756872) * 407) + (((~(748603785 | i)) | (~((-328619686) | i11)) | 738756872) * 407) + (((318772772 | r0) * (-814)) - 2091643165))};
                                    Object obj16 = map9.get(-1544987438);
                                    if (obj16 == null) {
                                        Class cls18 = (Class) removeParam.initialize((ViewConfiguration.getScrollBarSize() >> 8) + 86, (char) (28641 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 3317 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        byte[] bArr10 = $$a;
                                        Object[] objArr60 = new Object[1];
                                        b(bArr10[19], bArr10[i6], bArr10[26], objArr60);
                                        obj16 = cls18.getMethod((String) objArr60[0], cls4, cls4, cls4);
                                        map9.put(-1544987438, obj16);
                                    }
                                    ((int[]) objArr58[4])[0] = ((Integer) ((Method) obj16).invoke(null, objArr59)).intValue();
                                    return objArr58;
                                }
                                Object[] objArr61 = new Object[1];
                                a(17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 287 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.indexOf("", ""), objArr61);
                                String intern13 = ((String) objArr61[0]).intern();
                                Object[] objArr62 = new Object[1];
                                a((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 5, 337 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (View.resolveSize(0, 0) + 815), objArr62);
                                Object[] objArr63 = {intern13, ((String) objArr62[0]).intern()};
                                Object obj17 = map9.get(Integer.valueOf(i16));
                                if (obj17 == null) {
                                    Class cls19 = (Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 48, (char) View.combineMeasuredStates(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2610);
                                    byte[] bArr11 = $$a;
                                    Object[] objArr64 = new Object[1];
                                    b((short) 19, bArr11[23], bArr11[9], objArr64);
                                    obj17 = cls19.getMethod((String) objArr64[0], cls, cls);
                                    map9.put(Integer.valueOf(i16), obj17);
                                }
                                long longValue6 = ((Long) ((Method) obj17).invoke(null, objArr63)).longValue();
                                long j14 = longValue6 ^ (-1);
                                long j15 = (898968319 | j7) ^ (-1);
                                int m6 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(880L, j15, ((-880) * ((longValue6 | (((-898968320) | j8) ^ (-1))) | j15)) + (((((((-898968320) | j14) ^ (-1)) | (((-898968320) | j7) ^ (-1))) | ((j14 | j7) ^ (-1))) * (-880)) + ((881 * longValue6) + 791991089039L)), 686719529L) >> 32)) & ((((~((-1611833521) | i11)) | 174607109 | (~(1687594162 | i))) * 717) + ((((~((-1611833521) | i)) | ((~(i11 | 1687594162)) | 174607109)) * 717) - 716212976));
                                int i50 = ~(1847121623 | i);
                                if ((m6 | (((int) r4) & ((((~((-275120425) | i)) | (~(i11 | 2122242047)) | (~(i11 | (-134774790)))) * 140) + ((i50 | (~((-409895214) | i))) * 140) + (((-2122242048) | i50) * (-280)) + 407996313))) != 0) {
                                    i18 = i ^ EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                } else {
                                    Object[] objArr65 = new Object[1];
                                    a(12 - TextUtils.indexOf((CharSequence) "", '0', 0), AndroidCharacter.getMirror('0') + 295, (char) (View.resolveSizeAndState(0, 0, 0) + 64542), objArr65);
                                    String intern14 = ((String) objArr65[0]).intern();
                                    Object[] objArr66 = new Object[1];
                                    a(View.MeasureSpec.getSize(0) + 9, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 357, (char) (11221 - Gravity.getAbsoluteGravity(0, 0)), objArr66);
                                    String intern15 = ((String) objArr66[0]).intern();
                                    File file2 = new File(intern14);
                                    if (file2.exists() && file2.isFile()) {
                                        try {
                                            Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                            Object[] objArr67 = new Object[1];
                                            a(3 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), objArr67);
                                            Scanner useDelimiter2 = scanner2.useDelimiter(((String) objArr67[0]).intern());
                                            String next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                                            useDelimiter2.close();
                                            if (next2.contains(intern15)) {
                                                i18 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                            }
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    i18 = i;
                                }
                                if (i18 != i) {
                                    Object[] objArr68 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                    Object[] objArr69 = {Integer.valueOf(i3), 16, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m((~(i11 | 863226842)) | (-1068670863), 381, (((-209720325) | i) * (-381)) - 674168164, -1700935180))};
                                    Map map10 = removeParam.visaSchemeConfiguration;
                                    Object obj18 = map10.get(-1544987438);
                                    if (obj18 == null) {
                                        Class cls20 = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 86, (char) (28642 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3318);
                                        byte[] bArr12 = $$a;
                                        Object[] objArr70 = new Object[1];
                                        b(bArr12[19], bArr12[i6], bArr12[26], objArr70);
                                        obj18 = cls20.getMethod((String) objArr70[0], cls4, cls4, cls4);
                                        map10.put(-1544987438, obj18);
                                    }
                                    ((int[]) objArr68[4])[0] = ((Integer) ((Method) obj18).invoke(null, objArr69)).intValue();
                                    return objArr68;
                                }
                                Map map11 = removeParam.visaSchemeConfiguration;
                                Object obj19 = map11.get(484934282);
                                if (obj19 != null) {
                                    objArr2 = null;
                                } else {
                                    Class cls21 = (Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7490), View.MeasureSpec.getMode(0) + 3471);
                                    byte[] bArr13 = $$a;
                                    Object[] objArr71 = new Object[1];
                                    b((short) 19, bArr13[23], bArr13[9], objArr71);
                                    objArr2 = null;
                                    obj19 = cls21.getMethod((String) objArr71[0], null);
                                    map11.put(484934282, obj19);
                                }
                                long longValue7 = ((Long) ((Method) obj19).invoke(objArr2, objArr2)).longValue();
                                long j16 = longValue7 ^ (-1);
                                long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(45L, ((125056452 | j7) ^ (-1)) | j16 | ((j8 | (-125056453)) ^ (-1)), ((-45) * (((j16 | j7) ^ (-1)) | (((-125056453) | longValue7) ^ (-1)))) + ((-90) * ((-125056453) | ((j16 | j8) ^ (-1)))) + ((46 * longValue7) - 5752596838L), -896370183L);
                                if (((((int) m7) & ((((~((-1439988076) | i11)) | (~(1439988075 | i)) | (~(1417752810 | i))) * 831) + ((~((-65665) | i)) * (-1662)) + (((~((-1417752811) | i11)) | (~(1440053739 | i))) * (-831)) + 1560104854)) | (((int) (m7 >> 32)) & (((27273472 | (~(301525354 | i)) | (~(i11 | (-301525355)))) * 988) + (((-2013003648) | (~(i11 | 1738751765))) * (-1976)) + ((i | 27273472) * 988) + 83268254))) == 1) {
                                    ThreeDS2ServiceInstance = (ThreeDS2Service + 121) % 128;
                                    Object[] objArr72 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    Object[] objArr73 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i11 | 540991565)) | (-536231906)) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) + ((((~(i | 540991565)) | (-1073676270)) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) - 1082099362))};
                                    Object obj20 = map11.get(-1544987438);
                                    if (obj20 == null) {
                                        Class cls22 = (Class) removeParam.initialize(85 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (28641 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3317 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                                        byte[] bArr14 = $$a;
                                        Object[] objArr74 = new Object[1];
                                        b(bArr14[19], bArr14[i6], bArr14[26], objArr74);
                                        obj20 = cls22.getMethod((String) objArr74[0], cls4, cls4, cls4);
                                        map11.put(-1544987438, obj20);
                                    }
                                    ((int[]) objArr72[4])[0] = ((Integer) ((Method) obj20).invoke(null, objArr73)).intValue();
                                    return objArr72;
                                }
                                Object[] objArr75 = {1};
                                Object obj21 = map11.get(-924697231);
                                if (obj21 == null) {
                                    Class cls23 = (Class) removeParam.initialize(47 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (5585 - TextUtils.indexOf((CharSequence) "", '0')), 1032 - TextUtils.getCapsMode("", 0, 0));
                                    byte[] bArr15 = $$a;
                                    Object[] objArr76 = new Object[1];
                                    b((short) 19, bArr15[23], bArr15[9], objArr76);
                                    obj21 = cls23.getMethod((String) objArr76[0], cls4);
                                    map11.put(-924697231, obj21);
                                }
                                long longValue8 = ((Long) ((Method) obj21).invoke(null, objArr75)).longValue();
                                long j17 = ((-667) * longValue8) - 149643364680L;
                                long j18 = longValue8 ^ (-1);
                                long j19 = 112092408 | j7;
                                long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(668L, j19 | j18, (1336 * (112092408 | ((j18 | j7) ^ (-1)))) + ((-668) * (j18 | (j19 ^ (-1)))) + j17, 954809542L);
                                int i51 = ((int) ((long) ((((int) m8) & ((((~(1274539767 | i11)) | (~(i11 | (-162686643)))) * 614) + (((((~(162688694 | i11)) | 1111851073) | (~(i11 | (-1274537716)))) * (-1228)) + (((1111853125 | i) * 614) + (-1661727581))))) | (((int) (m8 >> 32)) & ((((~((-1664087142) | i11)) | 209717914) * 564) + (((~((-17142817) | i)) * 1128) + (((((~(226860730 | i11)) | (-1664087142)) | (~((-226860731) | i))) * (-564)) + 94516010))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                if (i51 != i) {
                                    objArr4 = new Object[]{new int[]{i}, new int[]{i51}, null, null, new int[1]};
                                    Object[] objArr77 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-460140743) | i11)) | (~(i11 | 617082728))) * 865) + ((~(i | 617082728)) * 865) + ((((~((-617082729) | i11)) | (-460140743)) * (-865)) - 606912112))};
                                    Object obj22 = map11.get(-1544987438);
                                    if (obj22 == null) {
                                        Class cls24 = (Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 86, (char) (28641 - Gravity.getAbsoluteGravity(0, 0)), 3317 - TextUtils.getOffsetBefore("", 0));
                                        byte[] bArr16 = $$a;
                                        Object[] objArr78 = new Object[1];
                                        b(bArr16[19], bArr16[i6], bArr16[26], objArr78);
                                        obj22 = cls24.getMethod((String) objArr78[0], cls4, cls4, cls4);
                                        map11.put(-1544987438, obj22);
                                    }
                                    ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj22).invoke(null, objArr77)).intValue();
                                } else {
                                    Object[] objArr79 = new Object[1];
                                    a(ImageFormat.getBitsPerPixel(0) + 24, View.getDefaultSize(0, 0) + EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr79);
                                    Object[] objArr80 = {((String) objArr79[0]).intern()};
                                    Object obj23 = map11.get(Integer.valueOf(i14));
                                    if (obj23 == null) {
                                        Class cls25 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), 2248 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        byte b7 = $$a[19];
                                        Object[] objArr81 = new Object[1];
                                        b((short) 37, b7, b7, objArr81);
                                        obj23 = cls25.getMethod((String) objArr81[0], cls);
                                        map11.put(Integer.valueOf(i14), obj23);
                                    }
                                    Object invoke2 = ((Method) obj23).invoke(null, objArr80);
                                    if (invoke2 != null) {
                                        Object[] objArr82 = {invoke2, 42};
                                        Object obj24 = map11.get(-146694085);
                                        if (obj24 == null) {
                                            Class cls26 = (Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29154), 3756 - ExpandableListView.getPackedPositionType(0L));
                                            byte[] bArr17 = $$a;
                                            Object[] objArr83 = new Object[1];
                                            b((short) 19, bArr17[23], bArr17[9], objArr83);
                                            obj24 = cls26.getMethod((String) objArr83[0], cls, cls4);
                                            map11.put(-146694085, obj24);
                                        }
                                        long longValue9 = ((Long) ((Method) obj24).invoke(null, objArr82)).longValue();
                                        long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(305L, (longValue9 ^ (-1)) | ((j8 | (-1127672263)) ^ (-1)), (((((-1127672263) | longValue9) ^ (-1)) | (((-1127672263) | j7) ^ (-1))) * 305) + ((306 * longValue9) - 345067711868L), 1626285612L);
                                        int i52 = (~(1673829404 | i)) | (-1742052925);
                                        int i53 = ~(i11 | (-1115687961));
                                        if (((((int) (m9 >> 32)) & (((i53 | (~((-68223521) | i))) * 470) + (((i52 | i53) * (-470)) - 1283862100))) | (((int) m9) & (((~((-210283171) | i)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE) + (((~((-231534516) | i)) | 21251345) * (-283)) + 281936928))) == 1986687685) {
                                            j = j7;
                                            cls2 = cls;
                                            Object[] objArr84 = new Object[1];
                                            a((ViewConfiguration.getEdgeSlop() >> 16) + 16, ExpandableListView.getPackedPositionGroup(0L) + 446, (char) (24190 - (ViewConfiguration.getTapTimeout() >> 16)), objArr84);
                                            Object[] objArr85 = {((String) objArr84[0]).intern()};
                                            Map map12 = removeParam.visaSchemeConfiguration;
                                            obj = map12.get(Integer.valueOf(i14));
                                            if (obj != null) {
                                                Class cls27 = (Class) removeParam.initialize(47 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2248 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                                byte b8 = $$a[19];
                                                Object[] objArr86 = new Object[1];
                                                b((short) 37, b8, b8, objArr86);
                                                obj = cls27.getMethod((String) objArr86[0], cls2);
                                                map12.put(Integer.valueOf(i14), obj);
                                            }
                                            invoke = ((Method) obj).invoke(null, objArr85);
                                            if (invoke != null) {
                                                i20 = 0;
                                            } else {
                                                Object[] objArr87 = {invoke, 42};
                                                Object obj25 = map12.get(-146694085);
                                                if (obj25 == null) {
                                                    Class cls28 = (Class) removeParam.initialize(TextUtils.getCapsMode("", 0, 0) + 48, (char) (29154 - View.getDefaultSize(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3756);
                                                    byte[] bArr18 = $$a;
                                                    Object[] objArr88 = new Object[1];
                                                    b((short) 19, bArr18[23], bArr18[9], objArr88);
                                                    obj25 = cls28.getMethod((String) objArr88[0], cls2, cls4);
                                                    map12.put(-146694085, obj25);
                                                }
                                                long longValue10 = ((Long) ((Method) obj25).invoke(null, objArr87)).longValue();
                                                long m10 = SVG$Unit$EnumUnboxingLocalUtility.m(783L, 286582310 | ((j8 | longValue10) ^ (-1)), ((-783) * (((286582310 | j8) | longValue10) ^ (-1))) + ((longValue10 ^ (-1)) * (-783)) + (((-782) * longValue10) - 224680531824L), 785195660L);
                                            }
                                            if (i20 != 1986687685) {
                                                ThreeDS2Service = (ThreeDS2ServiceInstance + 89) % 128;
                                                if (i20 != -1514516938) {
                                                    Object[] objArr89 = new Object[1];
                                                    a(View.MeasureSpec.getSize(0) + 14, 1161 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 57623), objArr89);
                                                    String intern16 = ((String) objArr89[0]).intern();
                                                    Object[] objArr90 = new Object[1];
                                                    a((ViewConfiguration.getWindowTouchSlop() >> 8) + 26, View.MeasureSpec.getMode(0) + 1175, (char) Drawable.resolveOpacity(0, 0), objArr90);
                                                    String intern17 = ((String) objArr90[0]).intern();
                                                    Object[] objArr91 = new Object[1];
                                                    a(MotionEvent.axisFromString("") + 18, 1201 - Color.green(0), (char) (45637 - View.MeasureSpec.getMode(0)), objArr91);
                                                    String intern18 = ((String) objArr91[0]).intern();
                                                    Object[] objArr92 = new Object[1];
                                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, (ViewConfiguration.getLongPressTimeout() >> 16) + 1218, (char) View.resolveSize(0, 0), objArr92);
                                                    String intern19 = ((String) objArr92[0]).intern();
                                                    Object[] objArr93 = new Object[1];
                                                    a(((byte) KeyEvent.getModifierMetaStateMask()) + 16, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1234, (char) (4518 - Color.alpha(0)), objArr93);
                                                    String intern20 = ((String) objArr93[0]).intern();
                                                    Object[] objArr94 = new Object[1];
                                                    a(37 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1249, (char) (3047 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr94);
                                                    String intern21 = ((String) objArr94[0]).intern();
                                                    Object[] objArr95 = new Object[1];
                                                    a(View.resolveSizeAndState(0, 0, 0) + 12, 1287 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr95);
                                                    String intern22 = ((String) objArr95[0]).intern();
                                                    Object[] objArr96 = new Object[1];
                                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, 1299 - ExpandableListView.getPackedPositionType(0L), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr96);
                                                    String intern23 = ((String) objArr96[0]).intern();
                                                    Object[] objArr97 = new Object[1];
                                                    a(22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 1313, (char) View.MeasureSpec.getSize(0), objArr97);
                                                    String intern24 = ((String) objArr97[0]).intern();
                                                    Object[] objArr98 = new Object[1];
                                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 31, ExpandableListView.getPackedPositionType(0L) + 1334, (char) TextUtils.indexOf("", "", 0), objArr98);
                                                    String intern25 = ((String) objArr98[0]).intern();
                                                    Object[] objArr99 = new Object[1];
                                                    a((ViewConfiguration.getPressedStateDuration() >> 16) + 12, 1365 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 34416), objArr99);
                                                    String intern26 = ((String) objArr99[0]).intern();
                                                    Object[] objArr100 = new Object[1];
                                                    a(12 - View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 1378, (char) (AndroidCharacter.getMirror('0') - '0'), objArr100);
                                                    String intern27 = ((String) objArr100[0]).intern();
                                                    Object[] objArr101 = new Object[1];
                                                    a(12 - KeyEvent.keyCodeFromString(""), TextUtils.getTrimmedLength("") + 1389, (char) (TextUtils.getTrimmedLength("") + 39939), objArr101);
                                                    String intern28 = ((String) objArr101[0]).intern();
                                                    Object[] objArr102 = new Object[1];
                                                    a(TextUtils.getTrimmedLength("") + 12, Color.alpha(0) + 1401, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 23555), objArr102);
                                                    String intern29 = ((String) objArr102[0]).intern();
                                                    Object[] objArr103 = new Object[1];
                                                    a(ExpandableListView.getPackedPositionGroup(0L) + 12, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1413, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 64701), objArr103);
                                                    String intern30 = ((String) objArr103[0]).intern();
                                                    Object[] objArr104 = new Object[1];
                                                    a(14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1426 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1503), objArr104);
                                                    String intern31 = ((String) objArr104[0]).intern();
                                                    Object[] objArr105 = new Object[1];
                                                    a((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12, ImageFormat.getBitsPerPixel(0) + 1440, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7518), objArr105);
                                                    String intern32 = ((String) objArr105[0]).intern();
                                                    Object[] objArr106 = new Object[1];
                                                    a(KeyEvent.getDeadChar(0, 0) + 24, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr106);
                                                    String intern33 = ((String) objArr106[0]).intern();
                                                    Object[] objArr107 = new Object[1];
                                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, Color.rgb(0, 0, 0) + 16778691, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 33450), objArr107);
                                                    String[] strArr10 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((String) objArr107[0]).intern()};
                                                    int i54 = 0;
                                                    while (true) {
                                                        if (i54 >= 19) {
                                                            i54 = -1;
                                                            break;
                                                        }
                                                        String str4 = strArr10[i54];
                                                        Object[] objArr108 = {str4};
                                                        Map map13 = removeParam.visaSchemeConfiguration;
                                                        Object obj26 = map13.get(-108371147);
                                                        if (obj26 == null) {
                                                            Class cls29 = (Class) removeParam.initialize(49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 2754 - Color.alpha(0));
                                                            byte[] bArr19 = $$a;
                                                            Object[] objArr109 = new Object[1];
                                                            b((short) 19, bArr19[23], bArr19[9], objArr109);
                                                            obj26 = cls29.getMethod((String) objArr109[0], cls2);
                                                            map13.put(-108371147, obj26);
                                                        }
                                                        long longValue11 = ((Long) ((Method) obj26).invoke(null, objArr108)).longValue();
                                                        long j20 = (860667101 | (longValue11 ^ (-1))) ^ (-1);
                                                        long j21 = (1512 * j20) + ((-755) * longValue11) + 649803662010L;
                                                        long j22 = longValue11 | (-860667102);
                                                        long m11 = SVG$Unit$EnumUnboxingLocalUtility.m(756L, j22 | j8, ((-756) * (j20 | ((j22 | j) ^ (-1)))) + j21, 1359986321L);
                                                        if (((((int) (m11 >> 32)) & (((~(1130961027 | i)) * 113) + (((~(1726779857 | i)) | 16844802 | (~(i11 | (-612663633)))) * (-113)) + ((((~(1130961027 | i11)) | (-1726779858)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) - 2055567968))) | (((int) m11) & ((((-574988322) | i) * 668) + ((1141376542 | (~((-1716364344) | i))) * 1336) + ((((~(1141376542 | i)) | (-1716364344)) * (-668)) - 1378009535)))) != 0) {
                                                            break;
                                                        }
                                                        Object[] objArr110 = new Object[1];
                                                        a(TextUtils.indexOf("", "", 0) + 14, TextUtils.getOffsetAfter("", 0) + 1425, (char) (TextUtils.getOffsetBefore("", 0) + 1502), objArr110);
                                                        if (str4.equals(((String) objArr110[0]).intern())) {
                                                            Object[] objArr111 = {str4};
                                                            Object obj27 = map13.get(-87104105);
                                                            if (obj27 == null) {
                                                                Class cls30 = (Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47, (char) View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 2754);
                                                                Object[] objArr112 = new Object[1];
                                                                b(r10[24], r10[23], (byte) ($$a[8] - 1), objArr112);
                                                                obj27 = cls30.getMethod((String) objArr112[0], cls2);
                                                                map13.put(-87104105, obj27);
                                                            }
                                                            long longValue12 = ((Long) ((Method) obj27).invoke(null, objArr111)).longValue();
                                                            long j23 = longValue12 ^ (-1);
                                                            long j24 = 1262238666 | j23;
                                                            long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(920L, (((longValue12 | 1262238666) | j) ^ (-1)) | ((j24 | j8) ^ (-1)) | (((j23 | (-1262238667)) | j) ^ (-1)), (((j24 ^ (-1)) | ((1262238666 | j8) ^ (-1))) * 920) + ((((j24 | j) ^ (-1)) | (((j23 | j8) | (-1262238667)) ^ (-1))) * 920) + ((-919) * longValue12) + 1159997334973L, -829512995L);
                                                            if (((((int) (m12 >> 32)) & ((((~(1385735369 | i)) | 86311170 | (~((-1472005516) | i))) * 623) + ((i11 | 41024) * (-623)) + (((~((-86311171) | i)) * 623) - 769466996))) | (((int) m12) & ((((~((-899794030) | i)) | 883016808 | (~(i11 | 1974724077))) * 521) + ((1957946856 | i) * 521) + (((~(i11 | 1957946856)) | 899794029) * (-1042)) + 1315931906))) != 0) {
                                                                break;
                                                            }
                                                        }
                                                        i54++;
                                                    }
                                                    if (i54 >= 0 && (i25 = i ^ (i54 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) != i) {
                                                        Object[] objArr113 = {new int[]{i}, new int[]{i25}, null, null, new int[1]};
                                                        Object[] objArr114 = {Integer.valueOf(i3), 16, Integer.valueOf(((570442001 | (~((-506781470) | i11))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + (((~(i11 | 570442001)) | (-1043652382)) * (-160)) + 520159950)};
                                                        Map map14 = removeParam.visaSchemeConfiguration;
                                                        Object obj28 = map14.get(-1544987438);
                                                        if (obj28 == null) {
                                                            Class cls31 = (Class) removeParam.initialize(85 - TextUtils.lastIndexOf("", '0'), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 28641), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3316);
                                                            byte[] bArr20 = $$a;
                                                            Object[] objArr115 = new Object[1];
                                                            b(bArr20[19], bArr20[24], bArr20[26], objArr115);
                                                            obj28 = cls31.getMethod((String) objArr115[0], cls4, cls4, cls4);
                                                            map14.put(-1544987438, obj28);
                                                        }
                                                        ((int[]) objArr113[4])[0] = ((Integer) ((Method) obj28).invoke(null, objArr114)).intValue();
                                                        return objArr113;
                                                    }
                                                }
                                            }
                                            Object[] objArr116 = new Object[1];
                                            a(13 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1503 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), objArr116);
                                            String intern34 = ((String) objArr116[0]).intern();
                                            Object[] objArr117 = new Object[1];
                                            a(5 - ExpandableListView.getPackedPositionType(0L), 1516 - Gravity.getAbsoluteGravity(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr117);
                                            String[] strArr11 = {intern34, ((String) objArr117[0]).intern()};
                                            Object[] objArr118 = new Object[1];
                                            a(14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1521 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr118);
                                            String intern35 = ((String) objArr118[0]).intern();
                                            Object[] objArr119 = new Object[1];
                                            a(19 - View.MeasureSpec.getMode(0), 1536 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), objArr119);
                                            String intern36 = ((String) objArr119[0]).intern();
                                            Object[] objArr120 = new Object[1];
                                            a(14 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1555, (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 56113), objArr120);
                                            String[] strArr12 = {intern35, intern36, ((String) objArr120[0]).intern()};
                                            Object[] objArr121 = new Object[1];
                                            a(21 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1569, (char) (63540 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr121);
                                            String intern37 = ((String) objArr121[0]).intern();
                                            Object[] objArr122 = new Object[1];
                                            a(11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 1590, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr122);
                                            String[] strArr13 = {intern37, ((String) objArr122[0]).intern()};
                                            Object[] objArr123 = new Object[1];
                                            a(11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 1600, (char) (Color.rgb(0, 0, 0) + 16836911), objArr123);
                                            String intern38 = ((String) objArr123[0]).intern();
                                            Object[] objArr124 = new Object[1];
                                            a(5 - TextUtils.lastIndexOf("", '0', 0), AndroidCharacter.getMirror('0') + 289, (char) (Color.red(0) + 815), objArr124);
                                            String[] strArr14 = {intern38, ((String) objArr124[0]).intern()};
                                            Object[] objArr125 = new Object[1];
                                            a(28 - View.resolveSize(0, 0), KeyEvent.keyCodeFromString("") + 1611, (char) (53935 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr125);
                                            String intern39 = ((String) objArr125[0]).intern();
                                            Object[] objArr126 = new Object[1];
                                            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, 1590 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr126);
                                            String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new String[]{intern39, ((String) objArr126[0]).intern()}};
                                            int i55 = -1;
                                            i21 = 0;
                                            loop4: while (true) {
                                                if (i21 < 5) {
                                                    i22 = i;
                                                    break;
                                                }
                                                ThreeDS2Service = (ThreeDS2ServiceInstance + 67) % 128;
                                                String[] strArr16 = strArr15[i21];
                                                String str5 = strArr16[0];
                                                String[] strArr17 = (String[]) Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                                int length = strArr17.length;
                                                int i56 = 0;
                                                while (i56 < length) {
                                                    String str6 = strArr17[i56];
                                                    int i57 = i55 + 1;
                                                    File file3 = new File(str5);
                                                    if (file3.exists() && file3.isFile()) {
                                                        try {
                                                            strArr2 = strArr15;
                                                            try {
                                                                Scanner scanner3 = new Scanner(new FileInputStream(file3));
                                                                i24 = i21;
                                                                strArr3 = strArr17;
                                                                str = str5;
                                                                try {
                                                                    Object[] objArr127 = new Object[1];
                                                                    a(2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 167 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr127);
                                                                    Scanner useDelimiter3 = scanner3.useDelimiter(((String) objArr127[0]).intern());
                                                                    if (useDelimiter3.hasNext()) {
                                                                        int i58 = ThreeDS2Service + 49;
                                                                        ThreeDS2ServiceInstance = i58 % 128;
                                                                        if (i58 % 2 == 0) {
                                                                            useDelimiter3.next();
                                                                            throw null;
                                                                        }
                                                                        str2 = useDelimiter3.next();
                                                                    } else {
                                                                        str2 = "";
                                                                    }
                                                                    useDelimiter3.close();
                                                                } catch (IOException unused4) {
                                                                    continue;
                                                                }
                                                            } catch (IOException unused5) {
                                                            }
                                                        } catch (IOException unused6) {
                                                        }
                                                        if (str2.contains(str6)) {
                                                            i22 = i ^ (i55 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
                                                            break loop4;
                                                        }
                                                        i56++;
                                                        i55 = i57;
                                                        strArr15 = strArr2;
                                                        strArr17 = strArr3;
                                                        str5 = str;
                                                        i21 = i24;
                                                    }
                                                    strArr2 = strArr15;
                                                    i24 = i21;
                                                    strArr3 = strArr17;
                                                    str = str5;
                                                    i56++;
                                                    i55 = i57;
                                                    strArr15 = strArr2;
                                                    strArr17 = strArr3;
                                                    str5 = str;
                                                    i21 = i24;
                                                }
                                                i21++;
                                            }
                                            if (i22 == i) {
                                                Object[] objArr128 = {new int[]{i}, new int[]{i22}, null, null, new int[1]};
                                                Object[] objArr129 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-786732005) | i)) | (~(i11 | (-286264331)))) * 765) + (((~((-786732005) | i11)) | 4227136) * 1530) + (((~((-4227137) | i11)) | (~((-782504869) | i)) | (~((-286264331) | i))) * 765) + 1080428132)};
                                                Map map15 = removeParam.visaSchemeConfiguration;
                                                Object obj29 = map15.get(-1544987438);
                                                if (obj29 == null) {
                                                    Class cls32 = (Class) removeParam.initialize(86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.indexOf("", "", 0) + 28641), 3317 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                                    byte[] bArr21 = $$a;
                                                    Object[] objArr130 = new Object[1];
                                                    b(bArr21[19], bArr21[24], bArr21[26], objArr130);
                                                    obj29 = cls32.getMethod((String) objArr130[0], cls4, cls4, cls4);
                                                    map15.put(-1544987438, obj29);
                                                }
                                                ((int[]) objArr128[4])[0] = ((Integer) ((Method) obj29).invoke(null, objArr129)).intValue();
                                                return objArr128;
                                            }
                                            try {
                                                Object[] objArr131 = new Object[1];
                                                a(13 - Color.argb(0, 0, 0, 0), 1639 - Color.red(0), (char) KeyEvent.normalizeMetaState(0), objArr131);
                                                String intern40 = ((String) objArr131[0]).intern();
                                                Object[] objArr132 = new Object[1];
                                                a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, 1652 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (Color.blue(0) + 21865), objArr132);
                                                try {
                                                    Object[] objArr133 = {intern40, ((String) objArr132[0]).intern()};
                                                    Map map16 = removeParam.visaSchemeConfiguration;
                                                    Object obj30 = map16.get(Integer.valueOf(i16));
                                                    if (obj30 == null) {
                                                        Class cls33 = (Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 48, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2610 - (ViewConfiguration.getTouchSlop() >> 8));
                                                        byte[] bArr22 = $$a;
                                                        Object[] objArr134 = new Object[1];
                                                        b((short) 19, bArr22[23], bArr22[9], objArr134);
                                                        obj30 = cls33.getMethod((String) objArr134[0], cls2, cls2);
                                                        map16.put(Integer.valueOf(i16), obj30);
                                                    }
                                                    long longValue13 = ((Long) ((Method) obj30).invoke(null, objArr133)).longValue();
                                                    long j25 = ((-566) * ((((-1116939679) | longValue13) ^ (-1)) | (((-1116939679) | j) ^ (-1)))) + ((-565) * longValue13) + 633304797426L;
                                                    long j26 = longValue13 ^ (-1);
                                                    long m13 = SVG$Unit$EnumUnboxingLocalUtility.m(566L, ((j26 | (-1116939679)) | j) ^ (-1), (((1116939678 | j26) ^ (-1)) * 566) + j25, 468748170L);
                                                    int i59 = ~(1885551589 | i);
                                                    if (((((int) (m13 >> 32)) & Boxes$$ExternalSyntheticOutline1.m(i59 | 177783834, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, ((448325178 | i59) * (-220)) + 465633130, 361146816)) | (((int) m13) & ((((~((-819738909) | i11)) | 8652804) * (-964)) + (((~((-819738909) | i)) | (-2038001978)) * (-964)) + 978213213))) != 0) {
                                                        i23 = i ^ 150;
                                                    } else {
                                                        ThreeDS2ServiceInstance = (ThreeDS2Service + 95) % 128;
                                                        i23 = i;
                                                    }
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Exception unused7) {
                                                i23 = i ^ 151;
                                            }
                                            if (i23 != i) {
                                                Object[] objArr135 = {new int[]{i}, new int[]{i23}, null, null, new int[1]};
                                                Object[] objArr136 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-731976961))) | (~((-341052072) | i11)) | 336857632) * 497) + (((~((-4194440) | i)) | (~(i11 | (-731976961)))) * 497) + 357739767)};
                                                Map map17 = removeParam.visaSchemeConfiguration;
                                                Object obj31 = map17.get(-1544987438);
                                                if (obj31 == null) {
                                                    Class cls34 = (Class) removeParam.initialize(86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28642), Color.green(0) + 3317);
                                                    byte[] bArr23 = $$a;
                                                    Object[] objArr137 = new Object[1];
                                                    b(bArr23[19], bArr23[24], bArr23[26], objArr137);
                                                    obj31 = cls34.getMethod((String) objArr137[0], cls4, cls4, cls4);
                                                    map17.put(-1544987438, obj31);
                                                }
                                                ((int[]) objArr135[4])[0] = ((Integer) ((Method) obj31).invoke(null, objArr136)).intValue();
                                                return objArr135;
                                            }
                                            Object[] objArr138 = new Object[1];
                                            a(KeyEvent.normalizeMetaState(0) + 47, TextUtils.lastIndexOf("", '0', 0) + 1661, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36767), objArr138);
                                            Object[] objArr139 = {((String) objArr138[0]).intern()};
                                            Map map18 = removeParam.visaSchemeConfiguration;
                                            Object obj32 = map18.get(-108371147);
                                            if (obj32 == null) {
                                                Class cls35 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0) + 48, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 2754);
                                                byte[] bArr24 = $$a;
                                                Object[] objArr140 = new Object[1];
                                                b((short) 19, bArr24[23], bArr24[9], objArr140);
                                                obj32 = cls35.getMethod((String) objArr140[0], cls2);
                                                map18.put(-108371147, obj32);
                                            }
                                            long longValue14 = ((Long) ((Method) obj32).invoke(null, objArr139)).longValue();
                                            long j27 = longValue14 ^ (-1);
                                            long j28 = ((-335910766) | longValue14) ^ (-1);
                                            long m14 = SVG$Unit$EnumUnboxingLocalUtility.m(722L, ((longValue14 | 335910765) ^ (-1)) | ((j27 | (-335910766)) ^ (-1)), ((-1444) * (j28 | (((-335910766) | j) ^ (-1)) | ((longValue14 | j) ^ (-1)))) + (1444 * (j8 | ((335910765 | j27) ^ (-1)) | j28)) + ((-721) * longValue14) + 242191662286L, 835229985L);
                                            int i60 = ~((-1495103442) | i);
                                            int m15 = (((((int) (m14 >> 32)) & Boxes$$ExternalSyntheticOutline1.m(i60 | 1360540289, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, ((1362637443 | i60) * (-220)) - 249131482, -2147235524)) | (((int) m14) & (((((~(589076951 | i)) | (-865975256)) | (~(i11 | (-571251155)))) * 521) + ((((-848149459) | i) * 521) + ((((~(i11 | (-848149459))) | (-589076952)) * (-1042)) + 395563560))))) * EnumC0170g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE) ^ i;
                                            if (m15 == i) {
                                                Object[] objArr141 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                Object[] objArr142 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i | (-405981825))) | 637539664) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) + (((~(i11 | (-405981825))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) - 1436583794))};
                                                Object obj33 = map18.get(-1544987438);
                                                if (obj33 == null) {
                                                    Class cls36 = (Class) removeParam.initialize(87 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 28641), 3317 - Color.blue(0));
                                                    byte[] bArr25 = $$a;
                                                    Object[] objArr143 = new Object[1];
                                                    b(bArr25[19], bArr25[24], bArr25[26], objArr143);
                                                    obj33 = cls36.getMethod((String) objArr143[0], cls4, cls4, cls4);
                                                    map18.put(-1544987438, obj33);
                                                }
                                                ((int[]) objArr141[4])[0] = ((Integer) ((Method) obj33).invoke(null, objArr142)).intValue();
                                                return objArr141;
                                            }
                                            objArr4 = new Object[]{new int[]{i}, new int[]{m15}, null, null, new int[1]};
                                            Object[] objArr144 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-255272951) | i11)) | (-1073741823)) * 564) + ((~(i | (-251791303))) * 1128) + (((((~((-821950521) | i11)) | (-255272951)) | (~(821950520 | i))) * (-564)) - 1439174250))};
                                            Object obj34 = map18.get(-1544987438);
                                            if (obj34 == null) {
                                                Class cls37 = (Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 86, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28641), (ViewConfiguration.getLongPressTimeout() >> 16) + 3317);
                                                byte[] bArr26 = $$a;
                                                Object[] objArr145 = new Object[1];
                                                b(bArr26[19], bArr26[24], bArr26[26], objArr145);
                                                obj34 = cls37.getMethod((String) objArr145[0], cls4, cls4, cls4);
                                                map18.put(-1544987438, obj34);
                                            }
                                            ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj34).invoke(null, objArr144)).intValue();
                                        }
                                    }
                                    Object[] objArr146 = new Object[1];
                                    a(24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 310 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr146);
                                    String intern41 = ((String) objArr146[0]).intern();
                                    Object[] objArr147 = new Object[1];
                                    a(10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 365, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr147);
                                    String intern42 = ((String) objArr147[0]).intern();
                                    Object[] objArr148 = new Object[1];
                                    a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 374, (char) (Color.alpha(0) + 47341), objArr148);
                                    String intern43 = ((String) objArr148[0]).intern();
                                    Object[] objArr149 = new Object[1];
                                    a(9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 382, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr149);
                                    String[] strArr18 = {intern41, intern42, intern43, ((String) objArr149[0]).intern()};
                                    Object[] objArr150 = new Object[1];
                                    a(View.MeasureSpec.getMode(0) + 17, 390 - KeyEvent.getDeadChar(0, 0), (char) (16662 - KeyEvent.getDeadChar(0, 0)), objArr150);
                                    String intern44 = ((String) objArr150[0]).intern();
                                    Object[] objArr151 = new Object[1];
                                    a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, 407 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr151);
                                    String intern45 = ((String) objArr151[0]).intern();
                                    Object[] objArr152 = new Object[1];
                                    a(7 - Drawable.resolveOpacity(0, 0), 414 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (KeyEvent.getDeadChar(0, 0) + 1420), objArr152);
                                    String intern46 = ((String) objArr152[0]).intern();
                                    Object[] objArr153 = new Object[1];
                                    a(View.resolveSize(0, 0) + 11, (Process.myPid() >> 22) + 421, (char) Color.argb(0, 0, 0, 0), objArr153);
                                    String intern47 = ((String) objArr153[0]).intern();
                                    Object[] objArr154 = new Object[1];
                                    a(Color.red(0) + 14, 432 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr154);
                                    String[] strArr19 = {intern44, intern45, intern46, intern47, ((String) objArr154[0]).intern()};
                                    Object[] objArr155 = new Object[1];
                                    a(16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 446 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (24190 - (Process.myTid() >> 22)), objArr155);
                                    String intern48 = ((String) objArr155[0]).intern();
                                    Object[] objArr156 = new Object[1];
                                    a(3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 462 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr156);
                                    String intern49 = ((String) objArr156[0]).intern();
                                    Object[] objArr157 = new Object[1];
                                    a(21 - TextUtils.lastIndexOf("", '0'), TextUtils.getTrimmedLength("") + 473, (char) (3322 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr157);
                                    String intern50 = ((String) objArr157[0]).intern();
                                    Object[] objArr158 = new Object[1];
                                    a(25 - View.getDefaultSize(0, 0), 495 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), objArr158);
                                    String intern51 = ((String) objArr158[0]).intern();
                                    Object[] objArr159 = new Object[1];
                                    a(27 - ((byte) KeyEvent.getModifierMetaStateMask()), 520 - Drawable.resolveOpacity(0, 0), (char) View.resolveSize(0, 0), objArr159);
                                    cls2 = cls;
                                    String[] strArr20 = {intern48, intern49, intern, intern50, intern51, ((String) objArr159[0]).intern()};
                                    Object[] objArr160 = new Object[1];
                                    a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, 549 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr160);
                                    String intern52 = ((String) objArr160[0]).intern();
                                    Object[] objArr161 = new Object[1];
                                    a(7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 559, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr161);
                                    String intern53 = ((String) objArr161[0]).intern();
                                    Object[] objArr162 = new Object[1];
                                    a(Color.alpha(0) + 6, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 567, (char) TextUtils.getTrimmedLength(""), objArr162);
                                    String intern54 = ((String) objArr162[0]).intern();
                                    Object[] objArr163 = new Object[1];
                                    a(TextUtils.indexOf("", "", 0) + 6, (ViewConfiguration.getScrollBarSize() >> 8) + 573, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr163);
                                    String[] strArr21 = {intern52, intern53, intern54, ((String) objArr163[0]).intern()};
                                    Object[] objArr164 = new Object[1];
                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 578, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr164);
                                    String intern55 = ((String) objArr164[0]).intern();
                                    Object[] objArr165 = new Object[1];
                                    a(7 - TextUtils.indexOf("", "", 0, 0), 414 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (1420 - Color.argb(0, 0, 0, 0)), objArr165);
                                    String intern56 = ((String) objArr165[0]).intern();
                                    Object[] objArr166 = new Object[1];
                                    a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 8, 382 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.indexOf("", "", 0), objArr166);
                                    String[] strArr22 = {intern55, intern56, ((String) objArr166[0]).intern()};
                                    Object[] objArr167 = new Object[1];
                                    a(Color.rgb(0, 0, 0) + 16777230, 595 - View.getDefaultSize(0, 0), (char) (2539 - View.resolveSize(0, 0)), objArr167);
                                    String intern57 = ((String) objArr167[0]).intern();
                                    Object[] objArr168 = new Object[1];
                                    a(-MotionEvent.axisFromString(""), TextUtils.getOffsetBefore("", 0) + 609, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr168);
                                    String[] strArr23 = {intern57, ((String) objArr168[0]).intern()};
                                    Object[] objArr169 = new Object[1];
                                    a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, Drawable.resolveOpacity(0, 0) + 610, (char) (24373 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr169);
                                    String intern58 = ((String) objArr169[0]).intern();
                                    Object[] objArr170 = new Object[1];
                                    a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 619, (char) (ExpandableListView.getPackedPositionType(0L) + 36385), objArr170);
                                    String[] strArr24 = {intern58, ((String) objArr170[0]).intern()};
                                    Object[] objArr171 = new Object[1];
                                    a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, 620 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8433), objArr171);
                                    String intern59 = ((String) objArr171[0]).intern();
                                    Object[] objArr172 = new Object[1];
                                    a(3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSize(0, 0) + 462, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr172);
                                    String intern60 = ((String) objArr172[0]).intern();
                                    Object[] objArr173 = new Object[1];
                                    a((KeyEvent.getMaxKeyCode() >> 16) + 7, View.getDefaultSize(0, 0) + 407, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr173);
                                    String intern61 = ((String) objArr173[0]).intern();
                                    Object[] objArr174 = new Object[1];
                                    a(Drawable.resolveOpacity(0, 0) + 8, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 636, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr174);
                                    String intern62 = ((String) objArr174[0]).intern();
                                    j = j7;
                                    Object[] objArr175 = new Object[1];
                                    a(View.MeasureSpec.getMode(0) + 11, ((Process.getThreadPriority(0) + 20) >> 6) + 421, (char) Gravity.getAbsoluteGravity(0, 0), objArr175);
                                    String intern63 = ((String) objArr175[0]).intern();
                                    Object[] objArr176 = new Object[1];
                                    a(Color.argb(0, 0, 0, 0) + 14, (KeyEvent.getMaxKeyCode() >> 16) + 432, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr176);
                                    String[] strArr25 = {intern59, intern60, intern61, intern62, intern63, ((String) objArr176[0]).intern()};
                                    Object[] objArr177 = new Object[1];
                                    a(((Process.getThreadPriority(0) + 20) >> 6) + 20, 645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Color.red(0), objArr177);
                                    String intern64 = ((String) objArr177[0]).intern();
                                    Object[] objArr178 = new Object[1];
                                    a(20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 664 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43988), objArr178);
                                    String intern65 = ((String) objArr178[0]).intern();
                                    Object[] objArr179 = new Object[1];
                                    a(30 - TextUtils.lastIndexOf("", '0', 0, 0), 683 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (168 - TextUtils.getTrimmedLength("")), objArr179);
                                    String intern66 = ((String) objArr179[0]).intern();
                                    Object[] objArr180 = new Object[1];
                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 26, 714 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr180);
                                    String intern67 = ((String) objArr180[0]).intern();
                                    Object[] objArr181 = new Object[1];
                                    a(23 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 740 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr181);
                                    String intern68 = ((String) objArr181[0]).intern();
                                    Object[] objArr182 = new Object[1];
                                    a(33 - Color.blue(0), 763 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) Color.green(0), objArr182);
                                    String[] strArr26 = {intern64, intern65, intern66, intern67, intern68, ((String) objArr182[0]).intern(), intern};
                                    Object[] objArr183 = new Object[1];
                                    a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, 796 - TextUtils.getCapsMode("", 0, 0), (char) (22833 - Color.blue(0)), objArr183);
                                    String intern69 = ((String) objArr183[0]).intern();
                                    Object[] objArr184 = new Object[1];
                                    a(View.MeasureSpec.getSize(0) + 7, 375 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.indexOf("", "") + 47341), objArr184);
                                    String[] strArr27 = {intern69, ((String) objArr184[0]).intern()};
                                    Object[] objArr185 = new Object[1];
                                    a(29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 809, (char) (3092 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr185);
                                    String intern70 = ((String) objArr185[0]).intern();
                                    Object[] objArr186 = new Object[1];
                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 11, 839 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.normalizeMetaState(0) + 20705), objArr186);
                                    String[] strArr28 = {intern70, ((String) objArr186[0]).intern()};
                                    Object[] objArr187 = new Object[1];
                                    a(ExpandableListView.getPackedPositionChild(0L) + 20, 850 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.indexOf("", "") + 14765), objArr187);
                                    String intern71 = ((String) objArr187[0]).intern();
                                    Object[] objArr188 = new Object[1];
                                    a(Drawable.resolveOpacity(0, 0) + 5, (ViewConfiguration.getTouchSlop() >> 8) + 869, (char) (View.MeasureSpec.getSize(0) + 28946), objArr188);
                                    String[] strArr29 = {intern71, ((String) objArr188[0]).intern()};
                                    Object[] objArr189 = new Object[1];
                                    a(19 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) + 874, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 57617), objArr189);
                                    String[] strArr30 = {((String) objArr189[0]).intern()};
                                    Object[] objArr190 = new Object[1];
                                    a(ExpandableListView.getPackedPositionChild(0L) + 17, TextUtils.getTrimmedLength("") + 893, (char) View.resolveSize(0, 0), objArr190);
                                    String[] strArr31 = {((String) objArr190[0]).intern()};
                                    Object[] objArr191 = new Object[1];
                                    a((KeyEvent.getMaxKeyCode() >> 16) + 19, 908 - ExpandableListView.getPackedPositionChild(0L), (char) (AndroidCharacter.getMirror('0') + 18458), objArr191);
                                    String[] strArr32 = {((String) objArr191[0]).intern()};
                                    Object[] objArr192 = new Object[1];
                                    a(((byte) KeyEvent.getModifierMetaStateMask()) + 20, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 929, (char) (View.MeasureSpec.getMode(0) + 42093), objArr192);
                                    String[] strArr33 = {((String) objArr192[0]).intern()};
                                    Object[] objArr193 = new Object[1];
                                    a(23 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 946 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (64203 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr193);
                                    String[] strArr34 = {((String) objArr193[0]).intern()};
                                    Object[] objArr194 = new Object[1];
                                    a(View.MeasureSpec.makeMeasureSpec(0, 0) + 21, 970 - View.MeasureSpec.getSize(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 40063), objArr194);
                                    String[] strArr35 = {((String) objArr194[0]).intern()};
                                    Object[] objArr195 = new Object[1];
                                    a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, ((byte) KeyEvent.getModifierMetaStateMask()) + 992, (char) KeyEvent.normalizeMetaState(0), objArr195);
                                    String[] strArr36 = {((String) objArr195[0]).intern(), intern};
                                    Object[] objArr196 = new Object[1];
                                    a((ViewConfiguration.getPressedStateDuration() >> 16) + 28, TextUtils.indexOf("", "", 0) + IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC, (char) (24683 - Color.alpha(0)), objArr196);
                                    String[] strArr37 = {((String) objArr196[0]).intern(), intern};
                                    Object[] objArr197 = new Object[1];
                                    a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, (ViewConfiguration.getTapTimeout() >> 16) + IptcConstants.IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE, (char) Gravity.getAbsoluteGravity(0, 0), objArr197);
                                    String[] strArr38 = {((String) objArr197[0]).intern(), intern};
                                    Object[] objArr198 = new Object[1];
                                    a((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 30, (ViewConfiguration.getPressedStateDuration() >> 16) + 1070, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr198);
                                    String[] strArr39 = {((String) objArr198[0]).intern(), intern};
                                    Object[] objArr199 = new Object[1];
                                    a(26 - ((byte) KeyEvent.getModifierMetaStateMask()), 1101 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr199);
                                    char c2 = 0;
                                    String[] strArr40 = {((String) objArr199[0]).intern(), intern};
                                    Object[] objArr200 = new Object[1];
                                    a(Color.rgb(0, 0, 0) + 16777248, KeyEvent.keyCodeFromString("") + 1128, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr200);
                                    String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new String[]{((String) objArr200[0]).intern(), intern}};
                                    ArrayList arrayList = new ArrayList();
                                    int i61 = i;
                                    int i62 = 0;
                                    int i63 = 0;
                                    int i64 = i6;
                                    while (i62 < i64) {
                                        String[] strArr42 = strArr41[i62];
                                        Object[] objArr201 = {strArr42[c2]};
                                        Map map19 = removeParam.visaSchemeConfiguration;
                                        Object obj35 = map19.get(Integer.valueOf(i14));
                                        if (obj35 != null) {
                                            strArr = strArr41;
                                            i19 = i62;
                                        } else {
                                            Class cls38 = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 48, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), (KeyEvent.getMaxKeyCode() >> 16) + 2248);
                                            byte b9 = $$a[19];
                                            strArr = strArr41;
                                            i19 = i62;
                                            Object[] objArr202 = new Object[1];
                                            b((short) 37, b9, b9, objArr202);
                                            obj35 = cls38.getMethod((String) objArr202[0], cls2);
                                            map19.put(Integer.valueOf(i14), obj35);
                                        }
                                        String str7 = (String) ((Method) obj35).invoke(null, objArr201);
                                        String[] strArr43 = (String[]) Arrays.copyOfRange(strArr42, 1, strArr42.length);
                                        if (str7 != null && str7.length() != 0) {
                                            if (strArr42.length != 1) {
                                                Object[] objArr203 = {str7, strArr43};
                                                Object obj36 = map19.get(-140597324);
                                                if (obj36 == null) {
                                                    Class cls39 = (Class) removeParam.initialize(48 - TextUtils.indexOf("", ""), (char) (AndroidCharacter.getMirror('0') - '0'), View.MeasureSpec.getMode(0) + 2295);
                                                    byte[] bArr27 = $$a;
                                                    Object[] objArr204 = new Object[1];
                                                    b((short) 19, bArr27[23], bArr27[9], objArr204);
                                                    obj36 = cls39.getMethod((String) objArr204[0], cls2, String[].class);
                                                    map19.put(-140597324, obj36);
                                                }
                                                long longValue15 = ((Long) ((Method) obj36).invoke(null, objArr203)).longValue();
                                                long j29 = 959256907 | j8;
                                                int m16 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(495L, (((longValue15 ^ (-1)) | (-959256908)) ^ (-1)) | (j29 ^ (-1)), (495 * j29) + (((-495) * ((959256907 | longValue15) ^ (-1))) + (((-494) * longValue15) - 473872912058L)), -1751871230L) >> 32)) & (((i | 1207967824) * 54) + (((~((-124247727) | i)) | 1207967824 | (~(i11 | 124247726))) * 54) + ((((~(i11 | 1312978684)) | 19236866) * (-108)) - 511108082));
                                                int i65 = ~((-868983978) | i);
                                                if ((m16 | (((int) r10) & Boxes$$ExternalSyntheticOutline1.m(i65 | 566927360, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, ((568242432 | i65) * (-220)) - 159057993, -988852578))) == 0) {
                                                }
                                            }
                                            i63++;
                                            i61 = i ^ (i19 + 10);
                                            StringBuilder m17 = Boxes$$ExternalSyntheticOutline1.m(str7);
                                            Object[] objArr205 = new Object[1];
                                            a(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0) + 1160, (char) (15373 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr205);
                                            m17.append(((String) objArr205[0]).intern());
                                            m17.append(str7);
                                            arrayList.add(m17.toString());
                                        }
                                        i62 = i19 + 1;
                                        strArr41 = strArr;
                                        i64 = 24;
                                        c2 = 0;
                                    }
                                    if (i63 > 2) {
                                        objArr3 = new Object[]{new int[]{i}, new int[]{i61}, arrayList, null, new int[1]};
                                        Object[] objArr206 = {num, num, Integer.valueOf((((~(193205067 | i)) | 1060446120) * 70) + ((~(1068834795 | i)) * 70) + ((((~(884018403 | i)) | 184816392) * (-140)) - 35069794))};
                                        Map map20 = removeParam.visaSchemeConfiguration;
                                        Object obj37 = map20.get(-1544987438);
                                        if (obj37 == null) {
                                            Class cls40 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 86, (char) (28642 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3316 - Process.getGidForName(""));
                                            byte[] bArr28 = $$a;
                                            Object[] objArr207 = new Object[1];
                                            b(bArr28[19], bArr28[24], bArr28[26], objArr207);
                                            obj37 = cls40.getMethod((String) objArr207[0], cls4, cls4, cls4);
                                            map20.put(-1544987438, obj37);
                                        }
                                        ((int[]) objArr3[4])[0] = ((Integer) ((Method) obj37).invoke(null, objArr206)).intValue();
                                        c = 0;
                                    } else {
                                        objArr3 = new Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                        Object[] objArr208 = {num, num, Integer.valueOf((((~((-1073399911) | i)) | (~(i11 | 3823560))) * 979) + ((i | 3823560) * (-979)) + ((~((-1073399911) | i11)) * 979) + 1933997044)};
                                        Map map21 = removeParam.visaSchemeConfiguration;
                                        Object obj38 = map21.get(-1544987438);
                                        if (obj38 == null) {
                                            Class cls41 = (Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 86, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28642), (ViewConfiguration.getScrollBarSize() >> 8) + 3317);
                                            byte[] bArr29 = $$a;
                                            Object[] objArr209 = new Object[1];
                                            b(bArr29[19], bArr29[24], bArr29[26], objArr209);
                                            obj38 = cls41.getMethod((String) objArr209[0], cls4, cls4, cls4);
                                            map21.put(-1544987438, obj38);
                                        }
                                        c = 0;
                                        ((int[]) objArr3[4])[0] = ((Integer) ((Method) obj38).invoke(null, objArr208)).intValue();
                                    }
                                    int i66 = ((int[]) objArr3[1])[c];
                                    if (i66 != i) {
                                        objArr4 = new Object[5];
                                        int[] iArr3 = new int[1];
                                        objArr4[c] = iArr3;
                                        int[] iArr4 = new int[1];
                                        objArr4[1] = iArr4;
                                        objArr4[4] = new int[1];
                                        List list = (List) objArr3[2];
                                        iArr3[c] = i;
                                        iArr4[c] = i66;
                                        objArr4[2] = list;
                                        objArr4[3] = null;
                                        Object[] objArr210 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-384830123) | i)) | (-1073029039)) * 49) + (((~((-692393349) | i11)) | (-384830123) | (~(692393348 | i))) * (-49)) + (((~((-384830123) | i11)) | 380635690) * 98) + 1586112862)};
                                        Map map22 = removeParam.visaSchemeConfiguration;
                                        Object obj39 = map22.get(-1544987438);
                                        if (obj39 == null) {
                                            Class cls42 = (Class) removeParam.initialize(86 - (ViewConfiguration.getTapTimeout() >> 16), (char) (28640 - Process.getGidForName("")), 3317 - View.MeasureSpec.getSize(0));
                                            byte[] bArr30 = $$a;
                                            Object[] objArr211 = new Object[1];
                                            b(bArr30[19], bArr30[24], bArr30[26], objArr211);
                                            obj39 = cls42.getMethod((String) objArr211[0], cls4, cls4, cls4);
                                            map22.put(-1544987438, obj39);
                                        }
                                        ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj39).invoke(null, objArr210)).intValue();
                                    }
                                    Object[] objArr842 = new Object[1];
                                    a((ViewConfiguration.getEdgeSlop() >> 16) + 16, ExpandableListView.getPackedPositionGroup(0L) + 446, (char) (24190 - (ViewConfiguration.getTapTimeout() >> 16)), objArr842);
                                    Object[] objArr852 = {((String) objArr842[0]).intern()};
                                    Map map122 = removeParam.visaSchemeConfiguration;
                                    obj = map122.get(Integer.valueOf(i14));
                                    if (obj != null) {
                                    }
                                    invoke = ((Method) obj).invoke(null, objArr852);
                                    if (invoke != null) {
                                    }
                                    if (i20 != 1986687685) {
                                    }
                                    Object[] objArr1162 = new Object[1];
                                    a(13 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1503 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), objArr1162);
                                    String intern342 = ((String) objArr1162[0]).intern();
                                    Object[] objArr1172 = new Object[1];
                                    a(5 - ExpandableListView.getPackedPositionType(0L), 1516 - Gravity.getAbsoluteGravity(0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr1172);
                                    String[] strArr112 = {intern342, ((String) objArr1172[0]).intern()};
                                    Object[] objArr1182 = new Object[1];
                                    a(14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1521 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr1182);
                                    String intern352 = ((String) objArr1182[0]).intern();
                                    Object[] objArr1192 = new Object[1];
                                    a(19 - View.MeasureSpec.getMode(0), 1536 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), objArr1192);
                                    String intern362 = ((String) objArr1192[0]).intern();
                                    Object[] objArr1202 = new Object[1];
                                    a(14 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1555, (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 56113), objArr1202);
                                    String[] strArr122 = {intern352, intern362, ((String) objArr1202[0]).intern()};
                                    Object[] objArr1212 = new Object[1];
                                    a(21 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1569, (char) (63540 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr1212);
                                    String intern372 = ((String) objArr1212[0]).intern();
                                    Object[] objArr1222 = new Object[1];
                                    a(11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 1590, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr1222);
                                    String[] strArr132 = {intern372, ((String) objArr1222[0]).intern()};
                                    Object[] objArr1232 = new Object[1];
                                    a(11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 1600, (char) (Color.rgb(0, 0, 0) + 16836911), objArr1232);
                                    String intern382 = ((String) objArr1232[0]).intern();
                                    Object[] objArr1242 = new Object[1];
                                    a(5 - TextUtils.lastIndexOf("", '0', 0), AndroidCharacter.getMirror('0') + 289, (char) (Color.red(0) + 815), objArr1242);
                                    String[] strArr142 = {intern382, ((String) objArr1242[0]).intern()};
                                    Object[] objArr1252 = new Object[1];
                                    a(28 - View.resolveSize(0, 0), KeyEvent.keyCodeFromString("") + 1611, (char) (53935 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr1252);
                                    String intern392 = ((String) objArr1252[0]).intern();
                                    Object[] objArr1262 = new Object[1];
                                    a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, 1590 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr1262);
                                    String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new String[]{intern392, ((String) objArr1262[0]).intern()}};
                                    int i552 = -1;
                                    i21 = 0;
                                    loop4: while (true) {
                                        if (i21 < 5) {
                                        }
                                        i21++;
                                    }
                                    if (i22 == i) {
                                    }
                                }
                            }
                        }
                        return objArr4;
                    }
                }
                i15 = i;
                if (i15 == i) {
                }
                return objArr4;
            }
            i12 = i;
            if (i12 != i) {
            }
        }
        i11 = i40;
        i12 = i;
        if (i12 != i) {
        }
    }

    public static void init$0() {
        $$a = new byte[]{63, -121, PnmConstants.PNM_PREFIX_BYTE, -127, 7, -13, -18, -8, 15, 2, 35, -13, 35, -31, -16, -11, -2, 15, 8, 0, 30, -35, -3, 1, 21, -11, 13, 0, 4, -13, -3, 3, 35};
        $$b = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    public static void init$1() {
        $$d = new byte[]{4, 5, 20, -37};
        $$e = 120;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 73) % 128;
        ButtonCustomization warnings = getCornerRadius.getWarnings(this.getWarnings);
        int i = ThreeDS2ServiceInstance + 121;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return warnings;
        }
        throw null;
    }
}
