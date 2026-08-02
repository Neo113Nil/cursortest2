package com.netcetera.threeds.sdk.infrastructure;

import android.R;
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
import com.netcetera.threeds.sdk.infrastructure.setTitle;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public final class setCollapseContentDescription extends setSubtitleTextColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static long get;
    private static int getWarnings;
    private static char[] initialize;
    private final setNavigationContentDescription ThreeDS2Service;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2ServiceInstance = 0;
        getWarnings = 1;
        char[] cArr = new char[1853];
        ByteBuffer.wrap("\u0006\u0010dlÂé!g\u008fÖêqHõ·P\u0015ÈpDÞÂ=U\u009bñ\u0006'd¡Ã)!¥\u0089Lë,M©®.\u0000¸e:Ç\u008a8\n\u009a\u0093ÿ\u0002Q\u0082²\u0018\u0014\u0093\u0089iëËLc®ì¿·ÝÊ{@\u0098Á6[SèñH\u000eí¬oÉÙgc\u0084ì\"h¿¨Ý\u001cz\u008e\u0098\u0007Ó¯±Õ\u0017KôÓZD?É\u009dkbÿÀ}¥ü\u000blèìNhÓ½±\u001f\u0016\u0098ô\u0014Y´?\b\u009c\u0092b#rÆ\u0010¶¶2U¸û%\u009e§<)Ã\u009fa\u0018\u0004³ª\u0005I\u0098ï\u0013rã\u0010]·ÿUm\u0089[ë+M¯®%\u0000¸e:Ç´8\u0002\u009a\u0085ÿ.Q\u0098²\u0005\u0014\u008e\u0089~ëÀLb®ð\u0003GeéÆvbá\u0000\u0091¦\u0015E\u009fë\u0002\u008e\u0080,\u000eÓ¸q?\u0014\u0090º(Y¯ÿ\nbÜ\u0000Z§ÒE^\u0089Wë,M¬®\b\u0000¤e/Ç\u008f87\u009a¬Æ\"¤Y\u0002Ùá}OÑ*Z\u0088ãwqÕ÷°{\u001eï\u0089\u0017ë'M«®?\u0000ûe8Çµ8\t\u009a\u0084ÿ\rQ\u009f²\u0002\u0014\u0094\u0089XëãLi®ì\u0003aeûÆj8×\u009dpÿÙPE²Ñ\u0017X\u0089#\u0089\u0017ë'M«®?\u0000ûe8Çµ8\t\u009a\u0084ÿ\rQ\u009f²\u0002\u0014\u0094\u0089XëòLd®ø\u0003veÁÆ}8Ô\u009d]ÿÉPA²Ôx\u0012\u001a\"¼®_:ñþ\u0094=6°É\fk\u0081\u000e\b \u009aC\u0007å\u0091x]\u001aô½q_ãòuGG%`\u0083ç`jÎ««b\tåöQTÅ1W\u009fÃ|\u000eÚËG8%¾\u00829`¾Í*«½\b!ö«S\u001d1\u009b\u009e\u0011|\u0094Ù\u000eGd%è\f_nnÈò+b\u0085³àsBõ½\u0003\u001fØzQÔÑ7I\u0089\u0017ë&Mº®*\u0000ûe,Ç³8\b\u009aÎÿ\u001bQ\u0084²\u001e\u0014\u008c\u0089\u0017ë0Mª®*\u0000µe-Ç¾8J\u009a²ÿ-Q»²\u001e\u0014\u008a\u0089bëÆLl®ü\u0003rÒ\u0095°²\u00165õ¸[\">¸\u009c5cÈÁ\u000e¤\u0080\n\u0016éÜO\u0012Òì°b\u0017áõhX¿>o\u009dôtw\u0016\u0007°\u0084S\ný\u0096\u0098\n\u0089\u0017ë0M·®:\u0000 e:Ç·8J\u009a\u0082ÿ\u0002Q\u0098²^\u0014\u0092\u0089bëïLx®Þ\u0003^e³Æw8Á\u009dBÿßP\u0018²Ó\u0017T\u0089(ëµL>®¸\u0003>\u0089\u0017ë0M·®:\u0000 e:Ç·8J\u009a\u0082ÿ\u0002Q\u0098²^\u0014\u0092\u0089bëïLx®Þ\u0003^e³Æi8Ö\u009d@ÿÚ\u0089\u0017ë0M·®:\u0000 e:Ç·8J\u009a\u008cÿ\u0002Q\u0094²^\u0014\u0090\u0089nëàLc®í\u0003~eëÆO8é\u009d_ÿØPZ²À\u0017\u0015\u00895ë®\u009eòüÂZN¹Ú\u0017\u001erÔÐZ/í\u008dpèéFf¥ñ\u0003j\u009e\u0096\u0089Jë,Mà®+\u0000¡e6Ç¶8\u0001\u009aÎÿ\u0003Q\u0099²\u0002\u0014\u0088\u0089Vë&M¯®:\u0000±eqÇ´8\u0000\u009a\u0094\u00059g\u001dÁ\u0092\"\b\u008c\u0099é^K\u0092´\"\u0016¢s Ý«>&\u0098¡\u0005]gÉÀN\"Õ\u0089Vë&M£®<\u0000§e9\u0089dë\u0002G±%×\u0083\u001b`ÂÎ]«Ë\tEöëTx1ä\u009f#|çÚfG\u0092%\f\u0082\u0090`\u0012Í\u008b«\u0011\b\u0097ö-S±1#\u0089_ë&M ®0¥EÇ*aª\u0082:,¬I2\u0018dz@ÜÏ?U\u0091Äô\u0003VÄ©y\u000b÷nmÀé#g\u0085ü¡ÏÃ e \u0086°(2M«ï>\u0010\u0097²\u0015\u0089\u007fë&M ®0\u0000¹e0Ç®8\f\u009a\u008fÿ\u0005©\tËimá\u008ec ÿElçð\u0089[ë+M¼®&\u0000¹e6Ç¯8\bM\u0091/÷\u0089;jâÄ}¡ë\u0003eüË^X;Ä\u0095\u0003vÎÐBMª/0\u0088µj6÷\u0085\u0095ê3jÐú~'\u001b¢¹aþE\u009c<:ºÙ6w¼\u0012,°£õ£\u0097Ú1\\ÒÐ|Z\u0019Ê»EDÆæd\u0083¯-<5^W'ñ¡\u0012-¼§Ù7{¸\u0084;&\u0099CRíÁ\u000e/¨Ë52áÝ\u0083»%wÆ®h1\r§¯)P\u0087ò\u0014\u0097\u00889OÚ\u008b|\u0004áô\u0083p$ö\u0089Kë'M¥\u0089]ë.M»®%\u0000µe+Çµ8\u00177ÅU\u008fó\u0002\u0010Õ¾:Û\u0096y\b\u0086\u00ad$5Aºï/\fíª&7ÔULò\u0091\u0010w½ÇÛPxÊ\u0086u#ö\u0089yë-Mª®;\u0000»e6Ç¾8E\u009a³ÿ/Q½²Q\u0014\u009e\u0089rëëLa®ü\u00033eøÆv8Ö\u009d\u000fÿÒP\r²\u0086\u0089yë-Mª®;\u0000»e6Ç¾8E\u009a³ÿ/Q½²Q\u0014\u009e\u0089rëëLa®ü\u00033eøÆv8Ö\u009d\u000fÿÒP\r²\u0086\u0017d\u0089pëõ\u0089Jë,Mà®!\u0000µe-Ç¾8\u0012\u009a\u0081ÿ\u0019Q\u0093\u0089_ë,M¢®-\u0000²e6Ç©8\r\u0089Në!M¡®1\u0000ìeiÕ:·R\u0011ÐòZ\\Ì9ZÖ\u0090´ö\u0012:ñã_|:ê\u0098dgÊÅY Å\u000e\u0002íÉKTÖ¼´6\u0013³\u0080Äâ¢Dn§¬\t?l£Î:1\u008e\u0093\u0002öËX\t»\u009a\u001d\u001f\u0080ü\u001a\u001dÄã¦\u0085\u0000Iã\u0093M\u0018(\u0095\u008a\u0006u¾×,Ux\u00847æQ@\u009d£V\rÜhKÊË5|\u0097³òf\\ù¿c\u0019å\u0084\u000fæ\u009cA\u0004\u0089Ùë±M%®¢\u0000\fe Çe8Ô\u0089Jë,Mà®+\u0000¡e6Ç¶8\u0001\u009aÎÿ\rQ\u009f²\u001f\u0014\u009b\u0089bëðL}®ú\u0003zeðÆm6\u0094Tíòk\u0011ç¿mÚýxr\u0087\u0081%X@ÄîV\r\u0095«P6©T'ó£\u00111¼±Ú6Gª%Ó\u0083U`ÙÎS«Ã\tLöÏTm1¦\u009f5|«ÚzG\u0096%\u001c\u0082§`\u0005ÍÞ«]\bÃö6S¿11\u009e¥|7Ù§GÐ%k\u0082Á`\u001aÍ\u0091\u0089_ë&M ®,\u0000¦e6Ç¹8J\u009a\u0087ÿ\u0004Q\u0099²\u0016\u0014\u0090\u0089bëÝL~®ì\u0003xe±Æ~8Á\u009dAÿÏPG²Ù\u0017X\u0089_ë&M ®,\u0000¦e6Ç¹8J\u009a\u0096ÿ\tQ\u0099²\t\u0014Ä\u00891ëòL\"®þ\u0003qeñÆa8\u009c\u009d\u0019ÿÚ\u0089_ë,M¡®.\u0000¸e:Çõ8\u0016\u009a\u0084ÿ\u0000Q©²\u0016\u0014\u008c\u0089oëíLc®í\u0003LeæÆ!8\u0092\u009d\u0000ÿÍPP²Þ\u0017^\u00894ë¨L/®\u0088\u0003*eåÆn\u0089Jë,Mà®+\u0000»e0Ç®8\t\u009a\u008fÿ\nQ\u0092²\u0014\u0014\u008e@Å\"£\u0084og¤É4¬¿\u000e!ñ\u0083S\u00026\u0085\u0098\u001e{\u009bÝ]@ê\"x\u0085ëgkÊø¬?\u000fðñBTÎ6B\u0099ß{MÞÄ@»\"'\u0085\u00adg,\u00182zfÜá?p\u0091ðô}Võ©\u0003\u000bÓn\u0018À\u008b»cÙ\u0005\u007fÉ\u009c\u00022\u0088W\u001fõ\u009f\n(¨çÍ&c¶\u0080+&¥»BÙÊ~]\u009c\u008f1SWÓ3ÞQ´÷/\u0014¯ºkcs\u0001\u000f§\u0085D\u001fêØ\u008f\u000e-\u008eÒ$pì\u00158»±X>þ«c\b\u0001Ð¦]DÅéA\u008fÏ\u0089Ië&M£®<\u0000úe7Ç\u00ad8K\u009a\u008dÿ\nQ\u009f²\u001f\u0014\u0097\u0089bëûL~\u0089Ië&M£®<\u0000úe,Ç¼8K\u009a\u0086ÿ\nQ\u009d²\u0014\u0014£\u0089dëãL`®í\u0003aeÿ;+YDÿÁ\u001c^²\u0098×NuÞ\u008a)(îMjãð\u0000L¦ú;\u0000Y\u008eþ\u001c\u001c\u0083±\u0005×\u0085p¡\u0012Ç´\u000bWÉùZ\u009cÆ>_Áëcg\u0006®¨|Kôísp\u009e\u0012\u0006µ\u008fW\u0007úÖ\u009c\u0004?\u0097Á\"d±\u0006%+8I^ï\u0092\fY¢ÉÇBeÜ\u009a98ã]|óé\u0010v¶ +\u0014I\u0086î\u001b\f¥¡\u000fÇ\u008dd\u0006\u009a³\u0089Jë,Mà®&\u0000°e2Çô8\u0007\u009a\u0095ÿ\u0002Q\u009a²\u0015\u0014Ò\u0089aëëLc®ï\u0003veìÆi8Ö\u009dFÿÄPA\u001aíx\u008bÞG=\u009e\u0093\u0001ö\u0097T\u0019«·\t$l¸Â\u007f!´\u0087.\u001aÉxIßÎ=\u0001\u0090ÒöPUÐ«d\u000eíl\u007fÃâ!e\u0084õ\u001a\u008fx\u0012þM\u009c+:çÙ=wª\u0012+°©O\u0007í\u008a\u0088B&\u0093Å\u0003c\u0092þl\u009cá;$Ùét}\u0012÷±yOÆêZ\u0088Ý'@ÅÞ`Rþ5'|E\u001aãÖ\u0000\f®\u009bË\u001ai\u0098\u009664»Q\u0002ÿ¥\u001c?º¾'\u001fEÖâN\u0000×\u00adIËÌh\u0001\u0096ô3pQòþd\u001cã¹\u007f'\u0000E\u0085â\u0013\u0000\u008f\u00ad\u0010\u0089Jë,Mà®?\u0000±e1Ç¾8\n\u009a\u0092ÿEQ\u0094²\u0004\u0014\u0095\u0089këæL#®î\u0003zeðÆ~8Á\u009d]ÿÚPG²Ù\u0017U\u00892\u0089Jë,Mà®?\u0000±e1Ç¾8\n\u009a\u0092ÿ4Q\u0092²\u001d\u0014\u0097\u0089jë¬Lo®ý\u0003zeòÆ}8\u008a\u009dIÿÃP[²×\u0017^\u00894ë±L>®¾\u0003<e©\u0089\u0002\u009f}ýM[Á¸U\u0016\u0091sDÑÕ.b\u008cÿé^Gì¤r\u0002æ\u009f\b6xTHòÄ\u0011P¿\u0094ÚCxÚ\u0087i%ä@aîí\r1«ñ6\tT\u009eó\u0007\u0011\u0085¼\u001dÚ\u009fy\u0012\u0087\u0094\"'@ ï4\r¦¨0yô\u001bÄ½H^Üð\u0018\u0095Ï7VÈåjh\u000fí¡aB½äxy\u0081\u001b\u000f¼\u0097^\u000f\u0089\u0017ë'M«®?\u0000ûe,Çµ8\u0006\u009a\u008bÿ\u000eQ\u0082²^\u0014\u008d\u0089bëïLx®ì\fÑnöÈq+ü\u0085=àèBy½Î\u001fSzòÔD7Å\u0091[\f¢n!\u0089\u0017ë0M·®:\u0000 e:Ç·8J\u009a\u008cÿ\u0002Q\u0094²^\u0014\u0090\u0089nëàLn®×\u0003~eÿÆu8È\u009d@ÿÉPj²Ô\u0017^\u0089$ë´L+®\u0088\u0003#e¸Æ58\u0096\u009d@ÿ\u009aP\u001bFo$_\u0082ÓaGÏ\u0083ªE\bÑ÷iUÇ0t\u009eþ}z>T\\dúè\u0019|·¸Ò~pê\u008fR-üH\\æÜ\u0005_£Ú.±L\u0081ê\r\t\u0099§]Â\u008a`\u0013\u009f =-X¨ö$\u0015ø³8.ÒLPëÍ\tA¤ÙÂ\\aÚ\u009fp:í\u0089\u0017ë0M·®:\u0000 e:Ç·8J\u009a\u008cÿ\u0002Q\u0094²^\u0014\u0090\u0089nëàLo®û\u0003geøÆv8È\u009dKÿÏPG²ï\u0017Q\u0089(ë¨Lb®¤\u0003=\u0089\u0017ë'M«®?\u0000ûe=Ç©8\u0011\u009a\u0081ÿ\bQ\u0095²\u0014rN\u0010~¶òUfû¢\u009ed<ðÃHaÞ\u0004KªÝIGËÉ©ù\u000fuìáB%'ã\u0085wzÏØS½Ð\u0013OðÁÆÞ¤î\u0002báöO2*ô\u0088`wØÕF°Ð\u001eVýÝ\u0089\u0017ë'M«®?\u0000ûe=Ç©8\u0011\u009a\u0096ÿ\u0006Q\u0085²\u0016\u0091ló\\UÐ¶D\u0018\u0080}FßÒ j\u0082ëçwIìªc\f÷\u0091\u001f\u0093\u0080ñ°W<´¨\u001al\u007fªÝ>\"\u0086\u0080(å\u0095K\f¨\u0083\u0083qáAGÉ¤[\nÓo\u0016ÍØ2l\u0090ñõc[ü¸x\u001eû\u0083\u0005á\u0097FD¤À\t\ro\u009aÌP2 \u0097:õ¸Z8Oè-Ñ\u008b_hÂÆ\u0004£×\u0001Lþô\\{9û\u0097~týÒ,Oº-\u000e\u008a\u0086h$Å\u0084£\u0000\u0000\u0094þ>[´9\u0013\u0096¥t#Ñ OÜ-L\u0089\u0017ë3M¼®&\u0000·epÇ³8\n\u009a\u0090ÿ\u0004Q\u0084²\u0005\u0014\u008f(UJxìõ\u000f4¡³\u0016·t\u0093Ò\u001c1\u0086\u009f\u0017úÐX\t§ \u0005,`\u00adÎy-¼\u008b=\u0016×tQ¶\u009fÔñro\u0091å?xZðøy\u0007\u008b¥GÀÄnZ\u008dÕ+Z¶®Ô1s¥\u0091f< Z1\u0089Të*M¬®\u000e\u0000\u0098e\u001aÇ\u00898:\u009a\u0082ÿ\u0018Q\u0082²_\u0014\u008f\u0089h\u0089\u0017ë&Mº®*\u0000ûe2Ç¿8\u0001\u009a\u0089ÿ\nQ©²\u0012\u0014\u0093\u0089cëçLn®û\u0003=eæÆt8È\u0095§÷ÒQF²Ñ\u001cZyÖÛF$û\u0086vãåx±\u001a\u0080¼\u001c_\u008cñ]\u0094\u00946\u0013É¶k(\u000e¹ #\u0092´ð\u0084V\fµ\u009e\u001b\u0016~ÓÜ\u001d#©\u00814ä¦J9©½\u000f>\u0092ÀðRW\u0081µ\u0005\u0018Ô~MÝ\u0095#f\u0086üäyKå©=\fà\u0092\u0088ð\u000e\u0089\u0017ë3M¼®&\u0000·epÇ¹8\u0015\u009a\u0095ÿ\u0002Q\u0098²\u0017\u0014\u0093÷r\u0095!3¯Ð ~¿\u001b;¹¤F\u0000a\r\u0003=¥µF'è¯\u008dj/\u00adÐ\u0016r\u0089\u0017\u0012¹ÃZ\u001bü\u0094ar\u0003þ¤~Fþël\u008d÷.,ÐÝu@\u0017Â¸\u0000Z\u009aÿ\u000ea?\u0003´¤;Fãë%\u008d®.!Ð\u008bu\u001b\u0017\u0085¸\u0007Z\u0097ÿ\u0014a±\u0002w¤ôIaëþ\u008co.ÐÓ]".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1853);
        initialize = cArr;
        get = -4092592987825312957L;
    }

    private setCollapseContentDescription(setSubtitle<setPopupTheme, nq> setsubtitle, jh jhVar, setCollapseIcon setcollapseicon, setTitleTextAppearance settitletextappearance, setNavigationContentDescription setnavigationcontentdescription) {
        super(setsubtitle, jhVar, setcollapseicon, settitletextappearance);
        this.ThreeDS2Service = setnavigationcontentdescription;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x027b, code lost:
    
        r1[r2] = (char) r25[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0281, code lost:
    
        r0 = new java.lang.Object[]{r5, r5};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(1724349229);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0291, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02c8, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0294, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getTapTimeout() >> 16) + 48, (char) (android.widget.ExpandableListView.getPackedPositionChild(0) + 27781), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2441);
        r3 = new java.lang.Object[1];
        f((byte) 0, -1, 1, r3);
        r2 = r2.getMethod((java.lang.String) r3[0], java.lang.Object.class, java.lang.Object.class);
        r1.put(1724349229, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, char c, int i2, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        Integer num = -54653524;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i6 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(initialize[i2 >>> i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(num);
                    if (obj != null) {
                        jArr = jArr2;
                        i3 = i4;
                    } else {
                        jArr = jArr2;
                        Class cls3 = (Class) removeParam.initialize((Process.myPid() >> 22) + 48, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3221);
                        Object[] objArr3 = new Object[1];
                        i3 = i4;
                        f((byte) 0, (short) -1, (short) 0, objArr3);
                        Method method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(num, method);
                        obj = method;
                    }
                    Long l = (Long) ((Method) obj).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(get), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 69, (char) (50752 - AndroidCharacter.getMirror('0')), 7789 - Color.green(0))).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(48 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 27780), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2441);
                        Object[] objArr6 = new Object[1];
                        f((byte) 0, (short) -1, (short) 1, objArr6);
                        obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    jArr2 = jArr;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                long[] jArr3 = jArr2;
                Object[] objArr7 = {Integer.valueOf(initialize[i2 + i4])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(num);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 3221 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Object[] objArr8 = new Object[1];
                    f((byte) 0, (short) -1, (short) 0, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(num, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Integer num2 = num;
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(get), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(69 - ExpandableListView.getPackedPositionGroup(0L), (char) (50752 - AndroidCharacter.getMirror('0')), Color.alpha(0) + 7789)).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr3[i4] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(48 - TextUtils.indexOf("", ""), (char) (KeyEvent.getDeadChar(0, 0) + 27780), 2489 - AndroidCharacter.getMirror('0'));
                    Object[] objArr11 = new Object[1];
                    f((byte) 0, (short) -1, (short) 1, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
                jArr2 = jArr3;
                num = num2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr4 = jArr2;
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i7 = threeDS2ServiceInitializationCallback.initialize;
            if (i7 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i8 = $10 + 43;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                break;
            }
            cArr[i7] = (char) jArr4[i7];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls7 = (Class) removeParam.initialize(47 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27780), 2441 - Color.red(0));
                Object[] objArr13 = new Object[1];
                f((byte) 0, (short) -1, (short) 1, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2 = 31 - s;
        int i3 = b2 + 84;
        byte[] bArr = $$a;
        int i4 = b + 2;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2++;
            i3 = i3 + i5 + 2;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i2];
            i2++;
            i3 = i3 + i5 + 2;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3 = b * 3;
        byte[] bArr = $$g;
        int i4 = s + 4;
        int i5 = 100 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i = i4;
            int i7 = 0;
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i];
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i = i4;
            i4 = i5;
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    public static setSubtitleTextColor get(jh jhVar) {
        setCollapseContentDescription setcollapsecontentdescription = new setCollapseContentDescription(new setOverflowIcon(), jhVar, new setCollapseIcon(), new setTitleTextAppearance(), new setNavigationContentDescription());
        getWarnings = (ThreeDS2ServiceInstance + 105) % 128;
        return setcollapsecontentdescription;
    }

    public static void init$0() {
        $$a = new byte[]{2, -29, -74, -39, 3, -3, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0, -4, 13, -35, -7, 13};
        $$b = 3;
    }

    public static void init$1() {
        $$g = new byte[]{107, 82, -52, 66};
        $$h = 69;
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x2197, code lost:
    
        if (((((int) (r11 >> 32)) & (((233795296 | r79) * 104) + (((~(r16 | 1342172906)) * (-104)) + ((((~((-1203431115) | r79)) | 95053504) * 104) - 2005432166)))) | (((int) r11) & ((((~(r16 | 1853877974)) | 67191808) * 521) + (((~(1853877974 | r79)) * 521) + 1713330660)))) != 0) goto L281;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x11e0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x129f A[Catch: all -> 0x33c7, TRY_ENTER, TryCatch #2 {all -> 0x33c7, blocks: (B:6:0x00e5, B:9:0x0143, B:18:0x0259, B:21:0x02b5, B:25:0x0273, B:29:0x034b, B:32:0x03b1, B:40:0x04ba, B:43:0x0515, B:46:0x04d6, B:47:0x052b, B:50:0x0580, B:56:0x0664, B:59:0x06bc, B:62:0x067e, B:64:0x0723, B:67:0x077d, B:76:0x0881, B:79:0x08de, B:82:0x089c, B:86:0x0997, B:89:0x09f6, B:97:0x0aea, B:100:0x0b49, B:103:0x0b07, B:105:0x0b89, B:108:0x0be3, B:115:0x0c73, B:118:0x0cce, B:121:0x0c8e, B:138:0x0dfb, B:141:0x0e5a, B:144:0x0e18, B:146:0x0e9d, B:149:0x0ef6, B:155:0x0f78, B:158:0x0fd5, B:162:0x0f93, B:178:0x122a, B:181:0x1287, B:184:0x1247, B:185:0x129f, B:188:0x12f7, B:192:0x13e4, B:195:0x143f, B:198:0x13ff, B:200:0x1458, B:203:0x14b6, B:209:0x158d, B:212:0x15e6, B:215:0x15a8, B:217:0x162b, B:220:0x1681, B:222:0x168a, B:225:0x16ef, B:231:0x2449, B:234:0x249e, B:246:0x28ad, B:249:0x290c, B:254:0x29f1, B:257:0x2a57, B:274:0x2a03, B:265:0x2b3e, B:268:0x2ba1, B:271:0x2b5c, B:277:0x28c1, B:289:0x2dc2, B:292:0x2e32, B:300:0x2f46, B:303:0x2fa5, B:306:0x2f63, B:321:0x30a5, B:324:0x3105, B:327:0x30c2, B:329:0x3146, B:332:0x319c, B:336:0x328d, B:339:0x32ec, B:341:0x32a8, B:343:0x334e, B:346:0x33b0, B:349:0x336a, B:350:0x315a, B:356:0x2de1, B:363:0x24ba, B:366:0x2524, B:368:0x24d7, B:369:0x245a, B:374:0x2032, B:377:0x2099, B:385:0x20b6, B:388:0x2113, B:391:0x20cb, B:397:0x204b, B:402:0x2237, B:405:0x2292, B:411:0x23a9, B:414:0x240b, B:416:0x23c7, B:417:0x2250, B:419:0x22ef, B:422:0x2348, B:424:0x2308, B:425:0x16a8, B:427:0x163c, B:429:0x146e, B:430:0x12b0, B:437:0x10ef, B:440:0x1145, B:445:0x1102, B:447:0x0eae, B:455:0x0b9d, B:456:0x09af, B:461:0x0739, B:463:0x053c, B:464:0x0363, B:467:0x00ff), top: B:5:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x2459  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x24a7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x28ab  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x2b5b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x2b5c A[Catch: all -> 0x33c7, TryCatch #2 {all -> 0x33c7, blocks: (B:6:0x00e5, B:9:0x0143, B:18:0x0259, B:21:0x02b5, B:25:0x0273, B:29:0x034b, B:32:0x03b1, B:40:0x04ba, B:43:0x0515, B:46:0x04d6, B:47:0x052b, B:50:0x0580, B:56:0x0664, B:59:0x06bc, B:62:0x067e, B:64:0x0723, B:67:0x077d, B:76:0x0881, B:79:0x08de, B:82:0x089c, B:86:0x0997, B:89:0x09f6, B:97:0x0aea, B:100:0x0b49, B:103:0x0b07, B:105:0x0b89, B:108:0x0be3, B:115:0x0c73, B:118:0x0cce, B:121:0x0c8e, B:138:0x0dfb, B:141:0x0e5a, B:144:0x0e18, B:146:0x0e9d, B:149:0x0ef6, B:155:0x0f78, B:158:0x0fd5, B:162:0x0f93, B:178:0x122a, B:181:0x1287, B:184:0x1247, B:185:0x129f, B:188:0x12f7, B:192:0x13e4, B:195:0x143f, B:198:0x13ff, B:200:0x1458, B:203:0x14b6, B:209:0x158d, B:212:0x15e6, B:215:0x15a8, B:217:0x162b, B:220:0x1681, B:222:0x168a, B:225:0x16ef, B:231:0x2449, B:234:0x249e, B:246:0x28ad, B:249:0x290c, B:254:0x29f1, B:257:0x2a57, B:274:0x2a03, B:265:0x2b3e, B:268:0x2ba1, B:271:0x2b5c, B:277:0x28c1, B:289:0x2dc2, B:292:0x2e32, B:300:0x2f46, B:303:0x2fa5, B:306:0x2f63, B:321:0x30a5, B:324:0x3105, B:327:0x30c2, B:329:0x3146, B:332:0x319c, B:336:0x328d, B:339:0x32ec, B:341:0x32a8, B:343:0x334e, B:346:0x33b0, B:349:0x336a, B:350:0x315a, B:356:0x2de1, B:363:0x24ba, B:366:0x2524, B:368:0x24d7, B:369:0x245a, B:374:0x2032, B:377:0x2099, B:385:0x20b6, B:388:0x2113, B:391:0x20cb, B:397:0x204b, B:402:0x2237, B:405:0x2292, B:411:0x23a9, B:414:0x240b, B:416:0x23c7, B:417:0x2250, B:419:0x22ef, B:422:0x2348, B:424:0x2308, B:425:0x16a8, B:427:0x163c, B:429:0x146e, B:430:0x12b0, B:437:0x10ef, B:440:0x1145, B:445:0x1102, B:447:0x0eae, B:455:0x0b9d, B:456:0x09af, B:461:0x0739, B:463:0x053c, B:464:0x0363, B:467:0x00ff), top: B:5:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x2af4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x2d87  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x2dbb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x2ef8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2fbc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x3067  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x311c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x2eeb A[LOOP:4: B:281:0x2d84->B:357:0x2eeb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x2ef5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x24b9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x245a A[Catch: all -> 0x33c7, TryCatch #2 {all -> 0x33c7, blocks: (B:6:0x00e5, B:9:0x0143, B:18:0x0259, B:21:0x02b5, B:25:0x0273, B:29:0x034b, B:32:0x03b1, B:40:0x04ba, B:43:0x0515, B:46:0x04d6, B:47:0x052b, B:50:0x0580, B:56:0x0664, B:59:0x06bc, B:62:0x067e, B:64:0x0723, B:67:0x077d, B:76:0x0881, B:79:0x08de, B:82:0x089c, B:86:0x0997, B:89:0x09f6, B:97:0x0aea, B:100:0x0b49, B:103:0x0b07, B:105:0x0b89, B:108:0x0be3, B:115:0x0c73, B:118:0x0cce, B:121:0x0c8e, B:138:0x0dfb, B:141:0x0e5a, B:144:0x0e18, B:146:0x0e9d, B:149:0x0ef6, B:155:0x0f78, B:158:0x0fd5, B:162:0x0f93, B:178:0x122a, B:181:0x1287, B:184:0x1247, B:185:0x129f, B:188:0x12f7, B:192:0x13e4, B:195:0x143f, B:198:0x13ff, B:200:0x1458, B:203:0x14b6, B:209:0x158d, B:212:0x15e6, B:215:0x15a8, B:217:0x162b, B:220:0x1681, B:222:0x168a, B:225:0x16ef, B:231:0x2449, B:234:0x249e, B:246:0x28ad, B:249:0x290c, B:254:0x29f1, B:257:0x2a57, B:274:0x2a03, B:265:0x2b3e, B:268:0x2ba1, B:271:0x2b5c, B:277:0x28c1, B:289:0x2dc2, B:292:0x2e32, B:300:0x2f46, B:303:0x2fa5, B:306:0x2f63, B:321:0x30a5, B:324:0x3105, B:327:0x30c2, B:329:0x3146, B:332:0x319c, B:336:0x328d, B:339:0x32ec, B:341:0x32a8, B:343:0x334e, B:346:0x33b0, B:349:0x336a, B:350:0x315a, B:356:0x2de1, B:363:0x24ba, B:366:0x2524, B:368:0x24d7, B:369:0x245a, B:374:0x2032, B:377:0x2099, B:385:0x20b6, B:388:0x2113, B:391:0x20cb, B:397:0x204b, B:402:0x2237, B:405:0x2292, B:411:0x23a9, B:414:0x240b, B:416:0x23c7, B:417:0x2250, B:419:0x22ef, B:422:0x2348, B:424:0x2308, B:425:0x16a8, B:427:0x163c, B:429:0x146e, B:430:0x12b0, B:437:0x10ef, B:440:0x1145, B:445:0x1102, B:447:0x0eae, B:455:0x0b9d, B:456:0x09af, B:461:0x0739, B:463:0x053c, B:464:0x0363, B:467:0x00ff), top: B:5:0x00e5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:335:0x2edc -> B:270:0x2da6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] initialize(Context context, int i, int i2, int i3) {
        int i4;
        char c;
        short s;
        float f;
        int i5;
        int i6;
        Class cls;
        int i7;
        int i8;
        Object[] objArr;
        Object obj;
        int i9;
        Object obj2;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        Object obj3;
        int i14;
        int i15;
        Object obj4;
        Object obj5;
        int i16;
        Object[] objArr2;
        Object obj6;
        Object obj7;
        int i17;
        Object obj8;
        Class cls2;
        char c2;
        int i18;
        Object[] objArr3;
        Object obj9;
        char c3;
        Object[] objArr4;
        Object obj10;
        Object obj11;
        String[][] strArr;
        int i19;
        int i20;
        int i21;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object invoke;
        Object obj16;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        String intern;
        File file;
        String next;
        Object obj21;
        String str;
        boolean z;
        String[] strArr2;
        int length;
        int i26;
        int i27;
        String[][] strArr3;
        int i28;
        String[] strArr4;
        String str2;
        int i29;
        Object method;
        int i30;
        int i31;
        int i32;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        String str3;
        Object obj30;
        Object obj31;
        String str4;
        Object obj32;
        Object obj33;
        String[] strArr5;
        Object obj34;
        Object obj35;
        Object obj36;
        Object obj37;
        String[] strArr6;
        Object obj38;
        Object obj39;
        Object obj40;
        int i33 = 0;
        Integer num2 = 0;
        char c4 = '0';
        int i34 = 1;
        Object[] objArr5 = new Object[1];
        d(9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), Color.rgb(0, 0, 0) + 16777827, objArr5);
        String intern2 = ((String) objArr5[0]).intern();
        short s2 = 27;
        Object[] objArr6 = new Object[1];
        d(27 - ExpandableListView.getPackedPositionType(0L), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 146 - TextUtils.getCapsMode("", 0, 0), objArr6);
        String intern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        d(24 - ImageFormat.getBitsPerPixel(0), (char) Color.blue(0), ExpandableListView.getPackedPositionType(0L) + EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        d(18 - KeyEvent.keyCodeFromString(""), (char) (61700 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, objArr8);
        String intern5 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        d(ExpandableListView.getPackedPositionChild(0L) + 29, (char) (52816 - ((Process.getThreadPriority(0) + 20) >> 6)), 216 - View.getDefaultSize(0, 0), objArr9);
        String[] strArr7 = {intern3, intern4, intern5, ((String) objArr9[0]).intern()};
        int i35 = 0;
        while (true) {
            if (i35 >= 4) {
                i4 = i33;
                c = c4;
                s = s2;
                f = 0.0f;
                i5 = 4;
                i6 = i;
                break;
            }
            i5 = 4;
            try {
                Object[] objArr10 = {strArr7[i35]};
                c = c4;
                Map map = removeParam.visaSchemeConfiguration;
                Object obj41 = map.get(-39554962);
                if (obj41 != null) {
                    i4 = i33;
                    f = 0.0f;
                    obj40 = obj41;
                } else {
                    f = 0.0f;
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2754 - (TypedValue.complexToFraction(i33, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i33, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                    Object[] objArr11 = new Object[i34];
                    i4 = i33;
                    e((byte) (-$$a[23]), (byte) 28, s2, objArr11);
                    Method method2 = cls3.getMethod((String) objArr11[i4], String.class);
                    map.put(-39554962, method2);
                    obj40 = method2;
                }
                long longValue = ((Long) ((Method) obj40).invoke(null, objArr10)).longValue();
                long j = longValue ^ (-1);
                s = s2;
                long j2 = i;
                long j3 = j2 ^ (-1);
                long m = SVG$Unit$EnumUnboxingLocalUtility.m(831L, (((-979107849) | j3) ^ (-1)) | ((979107848 | j2) ^ (-1)) | ((longValue | j2) ^ (-1)), ((-1662) * (((j | 979107848) | j2) ^ (-1))) + ((-831) * (((j | j3) ^ (-1)) | (((979107848 | longValue) | j2) ^ (-1)))) + ((832 * longValue) - 812659513840L), 61132899L);
                int i36 = ~i;
                int i37 = (((~(199920846 | i36)) | (~((-1637147258) | i36)) | 1611948593 | (~((-174722183) | i))) * (-84)) + 1905160562;
                int i38 = (~(199920846 | i)) | 1637147257;
                int i39 = ~((-199920847) | i36);
                int i40 = (((174722182 | i39) * 84) + ((i38 | i39) * (-84)) + i37) & ((int) (m >> 32));
                int i41 = ~((-1304864756) | i36);
                if ((i40 | (((int) m) & (((i41 | 1243941445) * 764) + (((~((-132361655) | i36)) | 35719172) * (-1528)) + ((((-132361655) | i41) * 764) - 1536341395)))) != 0) {
                    i6 = i ^ (i35 + EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i35++;
                s2 = s;
                c4 = c;
                i33 = i4;
                i34 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Class cls4 = Integer.TYPE;
        int i42 = 3;
        if (i6 != i) {
            Object[] objArr12 = new Object[5];
            int[] iArr = new int[1];
            objArr12[i4] = iArr;
            int[] iArr2 = new int[1];
            objArr12[1] = iArr2;
            objArr12[i5] = new int[1];
            iArr[i4] = i;
            iArr2[i4] = i6;
            objArr12[2] = null;
            objArr12[3] = null;
            int i43 = ((~(i | 314769395)) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1133386898;
            int i44 = ~i;
            Object[] objArr13 = new Object[3];
            objArr13[2] = Integer.valueOf((((~(i44 | 314769395)) | 762454075) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((-758120457) | i44) * (-216)) + i43);
            objArr13[1] = 16;
            objArr13[i4] = Integer.valueOf(i3);
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj42 = map2.get(-1544987438);
            if (obj42 != null) {
                obj39 = obj42;
            } else {
                int i45 = i4;
                Class cls5 = (Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 85, (char) (28641 - (ViewConfiguration.getScrollBarSize() >> 8)), View.MeasureSpec.makeMeasureSpec(i45, i45) + 3317);
                byte[] bArr = $$a;
                byte b = (byte) (-bArr[24]);
                byte b2 = bArr[19];
                Object[] objArr14 = new Object[1];
                e(b, b2, (byte) (b2 | 25), objArr14);
                Method method3 = cls5.getMethod((String) objArr14[0], cls4, cls4, cls4);
                map2.put(-1544987438, method3);
                obj39 = method3;
            }
            ((int[]) objArr12[i5])[0] = ((Integer) ((Method) obj39).invoke(null, objArr13)).intValue();
            return objArr12;
        }
        float f2 = f;
        short s3 = s;
        Object[] objArr15 = new Object[1];
        d(12 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.MeasureSpec.getSize(0) + 34120), (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, objArr15);
        String intern6 = ((String) objArr15[0]).intern();
        int i46 = -1;
        Object[] objArr16 = new Object[1];
        d(View.MeasureSpec.getSize(0) + 13, (char) ((-1) - Process.getGidForName("")), 256 - View.combineMeasuredStates(0, 0), objArr16);
        String intern7 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        d(TextUtils.indexOf("", "", 0, 0) + 18, (char) TextUtils.indexOf("", "", 0, 0), 268 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr17);
        String[] strArr8 = {intern6, intern7, ((String) objArr17[0]).intern()};
        int i47 = 0;
        while (true) {
            if (i47 >= i42) {
                cls = cls4;
                i7 = i42;
                i8 = i;
                break;
            }
            Object[] objArr18 = {strArr8[i47]};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj43 = map3.get(-108371147);
            if (obj43 != null) {
                strArr6 = strArr8;
                i7 = i42;
                obj38 = obj43;
            } else {
                Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2754 - TextUtils.indexOf("", ""));
                byte b3 = (byte) (-$$a[23]);
                i7 = i42;
                strArr6 = strArr8;
                Object[] objArr19 = new Object[1];
                e(b3, (byte) (b3 | 18), (byte) $$b, objArr19);
                Method method4 = cls6.getMethod((String) objArr19[0], String.class);
                map3.put(-108371147, method4);
                obj38 = method4;
            }
            long longValue2 = ((Long) ((Method) obj38).invoke(null, objArr18)).longValue();
            long j4 = longValue2 ^ (-1);
            long j5 = 1629144679 | j4;
            cls = cls4;
            long j6 = i;
            long j7 = j6 ^ (-1);
            long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(168L, ((1629144679 | j7) ^ (-1)) | ((1629144679 | longValue2) ^ (-1)) | ((j6 | (j4 | (-1629144680))) ^ (-1)), (((j5 | j6) ^ (-1)) * 168) + (((j5 ^ (-1)) | ((j4 | j7) ^ (-1))) * 168) + ((-167) * longValue2) + 272067161560L, 2128463899L);
            int i48 = ~i;
            int i49 = (((~(188064495 | i48)) | 1077940240) * (-1188)) + 327741044;
            int i50 = (~((-188064496) | i)) | 1077940240;
            int i51 = ~(1249161915 | i48);
            if (((((int) m2) & ((((~(96992116 | i)) | 96623156) * 433) + (((~(1340234293 | i)) | 96992116) * (-433)) + ((~((-1243611138) | i48)) * 433) + 1404790244)) | (((int) (m2 >> 32)) & ((((~((-188064496) | i48)) | R.attr.textAppearanceMediumInverse | i51) * 594) + ((i50 | i51) * 594) + i49))) != 0) {
                i8 = i ^ (i47 + EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
                break;
            }
            i47++;
            cls4 = cls;
            strArr8 = strArr6;
            i42 = i7;
        }
        if (i8 != i) {
            Object[] objArr20 = new Object[5];
            objArr20[0] = new int[]{i};
            objArr20[1] = new int[]{i8};
            objArr20[i5] = new int[1];
            objArr20[2] = null;
            objArr20[i7] = null;
            int i52 = ~i;
            int i53 = (((~(i | 445105148)) | (~(i52 | (-445105149))) | (~((-632118323) | i))) * 959) + (((~((-632118323) | i52)) | (~((-445105149) | i)) | (~(i52 | 445105148))) * 959) + 1292480541;
            Object[] objArr21 = new Object[i7];
            objArr21[2] = Integer.valueOf(i53);
            objArr21[1] = 16;
            objArr21[0] = Integer.valueOf(i3);
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj44 = map4.get(-1544987438);
            if (obj44 != null) {
                obj37 = obj44;
            } else {
                Class cls7 = (Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 86, (char) (TextUtils.getOffsetBefore("", 0) + 28641), Color.green(0) + 3317);
                byte[] bArr2 = $$a;
                byte b4 = (byte) (-bArr2[24]);
                byte b5 = bArr2[19];
                Object[] objArr22 = new Object[1];
                e(b4, b5, (byte) (b5 | 25), objArr22);
                Method method5 = cls7.getMethod((String) objArr22[0], cls, cls, cls);
                map4.put(-1544987438, method5);
                obj37 = method5;
            }
            ((int[]) objArr20[i5])[0] = ((Integer) ((Method) obj37).invoke(null, objArr21)).intValue();
            return objArr20;
        }
        Map map5 = removeParam.visaSchemeConfiguration;
        Object obj45 = map5.get(544603440);
        if (obj45 != null) {
            objArr = null;
            obj = obj45;
        } else {
            Class cls8 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 48, (char) ((-1) - TextUtils.indexOf("", c)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2343);
            byte b6 = (byte) (-$$a[23]);
            Object[] objArr23 = new Object[1];
            e(b6, (byte) (b6 | 18), (byte) $$b, objArr23);
            objArr = null;
            Method method6 = cls8.getMethod((String) objArr23[0], null);
            map5.put(544603440, method6);
            obj = method6;
        }
        long longValue3 = ((Long) ((Method) obj).invoke(objArr, objArr)).longValue();
        long j8 = longValue3 ^ (-1);
        long j9 = i;
        long j10 = j9 ^ (-1);
        int m3 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(502L, j8 | ((684065560 | j9) ^ (-1)), ((-502) * (((j8 | j10) | (-684065561)) ^ (-1))) + (((((j8 | j9) ^ (-1)) | (((-684065561) | longValue3) ^ (-1))) * (-502)) + ((503 * longValue3) + 342716846061L)), -1124400407L) >> 32)) & ((((-4196357) | i) * 668) + (((-877254925) | (~(1980485960 | i))) * 1336) + (((~((-877254925) | i)) | 1980485960) * (-668)) + 1038429182);
        int i54 = ~i;
        int i55 = r3 != 0 ? (r3 + EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE) ^ i : i;
        if (i55 != i) {
            ThreeDS2ServiceInstance = (getWarnings + 21) % 128;
            Object[] objArr24 = new Object[5];
            objArr24[0] = new int[]{i};
            objArr24[1] = new int[]{i55};
            objArr24[i5] = new int[1];
            objArr24[2] = null;
            objArr24[3] = null;
            int i56 = (~((-704446254) | i54)) | 700767788;
            int i57 = ~(i | (-369098753));
            Object[] objArr25 = {Integer.valueOf(i3), 16, Integer.valueOf(((~((-372777218) | i54)) * 713) + (i57 * 1426) + ((i56 | i57) * (-713)) + 1334044858)};
            Object obj46 = map5.get(-1544987438);
            if (obj46 != null) {
                obj36 = obj46;
            } else {
                Class cls9 = (Class) removeParam.initialize(86 - Color.green(0), (char) (28641 - KeyEvent.keyCodeFromString("")), 3317 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte[] bArr3 = $$a;
                byte b7 = (byte) (-bArr3[24]);
                byte b8 = bArr3[19];
                Object[] objArr26 = new Object[1];
                e(b7, b8, (byte) (b8 | 25), objArr26);
                Method method7 = cls9.getMethod((String) objArr26[0], cls, cls, cls);
                map5.put(-1544987438, method7);
                obj36 = method7;
            }
            ((int[]) objArr24[i5])[0] = ((Integer) ((Method) obj36).invoke(null, objArr25)).intValue();
            return objArr24;
        }
        Object[] objArr27 = new Object[1];
        d(20 - View.getDefaultSize(0, 0), (char) (View.getDefaultSize(0, 0) + 23426), 287 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr27);
        String intern8 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        d(5 - MotionEvent.axisFromString(""), (char) ((Process.myPid() >> 22) + 64813), (ViewConfiguration.getScrollDefaultDelay() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, objArr28);
        Object[] objArr29 = {intern8, ((String) objArr28[0]).intern()};
        Object obj47 = map5.get(-715665817);
        if (obj47 != null) {
            i9 = -715665817;
            obj2 = obj47;
        } else {
            Class cls10 = (Class) removeParam.initialize(TextUtils.indexOf("", "") + 48, (char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionType(0L) + 2610);
            byte b9 = (byte) (-$$a[23]);
            i9 = -715665817;
            Object[] objArr30 = new Object[1];
            e(b9, (byte) (b9 | 18), (byte) $$b, objArr30);
            Method method8 = cls10.getMethod((String) objArr30[0], String.class, String.class);
            map5.put(-715665817, method8);
            obj2 = method8;
        }
        long longValue4 = ((Long) ((Method) obj2).invoke(null, objArr29)).longValue();
        long j11 = longValue4 ^ (-1);
        long j12 = ((-217025254) | j11) ^ (-1);
        long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(446L, j12, (((((-217025254) | longValue4) ^ (-1)) | (((j11 | 217025253) | j9) ^ (-1))) * 446) + ((j12 | ((j11 | j10) ^ (-1))) * 446) + (((-445) * longValue4) - 96576237585L), 1368662595L);
        if (((((int) (m4 >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~((-106980204) | i54)) | (~((-1330246208) | i)) | (-1332343680), -370, (((~((-106980204) | i)) | (~((-1330246208) | i54))) * (-370)) + 635053406, 954077440)) | (((int) m4) & ((((~(399889148 | i54)) | 671088641) * 983) + ((((~(1037337261 | i54)) | 399889148) * (-983)) - 1738355678)))) != 0) {
            int i58 = ThreeDS2ServiceInstance + 25;
            getWarnings = i58 % 128;
            i11 = i58 % 2 == 0 ? i ^ 28700 : i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
            i10 = 1;
        } else {
            i10 = 1;
            getWarnings = (ThreeDS2ServiceInstance + 1) % 128;
            i11 = i;
        }
        if (i11 != i) {
            Object[] objArr31 = new Object[5];
            int[] iArr3 = new int[i10];
            objArr31[0] = iArr3;
            int[] iArr4 = new int[i10];
            objArr31[i10] = iArr4;
            objArr31[i5] = new int[i10];
            iArr3[0] = i;
            iArr4[0] = i11;
            objArr31[2] = null;
            objArr31[3] = null;
            int i59 = (((~((-268517633) | i54)) | (~(270749956 | i))) * 520) + 1673847550;
            int i60 = ~((-270749957) | i54);
            int i61 = ~(i | 806473514);
            Object[] objArr32 = {Integer.valueOf(i3), 16, Integer.valueOf(((i61 | (~((-806473515) | i54)) | 2232324) * 520) + ((i60 | i61) * (-1040)) + i59)};
            Object obj48 = map5.get(-1544987438);
            if (obj48 != null) {
                obj35 = obj48;
            } else {
                Class cls11 = (Class) removeParam.initialize(86 - Gravity.getAbsoluteGravity(0, 0), (char) (28689 - AndroidCharacter.getMirror('0')), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 3317);
                byte[] bArr4 = $$a;
                byte b10 = (byte) (-bArr4[24]);
                byte b11 = bArr4[19];
                Object[] objArr33 = new Object[1];
                e(b10, b11, (byte) (b11 | 25), objArr33);
                Method method9 = cls11.getMethod((String) objArr33[0], cls, cls, cls);
                map5.put(-1544987438, method9);
                obj35 = method9;
            }
            ((int[]) objArr31[i5])[0] = ((Integer) ((Method) obj35).invoke(null, objArr32)).intValue();
            return objArr31;
        }
        Object[] objArr34 = new Object[1];
        d(31 - ExpandableListView.getPackedPositionGroup(0L), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 312 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr34);
        String intern9 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        d(KeyEvent.keyCodeFromString("") + 23, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 344 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr35);
        String intern10 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        d(TextUtils.indexOf((CharSequence) "", '0', 0) + 29, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 367 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr36);
        String intern11 = ((String) objArr36[0]).intern();
        Object[] objArr37 = new Object[1];
        d(TextUtils.indexOf((CharSequence) "", '0') + 15, (char) (6117 - (ViewConfiguration.getFadingEdgeLength() >> 16)), KeyEvent.normalizeMetaState(0) + 395, objArr37);
        String[] strArr9 = {intern9, intern10, intern11, ((String) objArr37[0]).intern()};
        int i62 = i5;
        int i63 = 0;
        while (true) {
            if (i63 >= i62) {
                num = num2;
                i12 = i54;
                i13 = i;
                break;
            }
            Object[] objArr38 = {strArr9[i63]};
            Map map6 = removeParam.visaSchemeConfiguration;
            Object obj49 = map6.get(-108371147);
            if (obj49 != null) {
                strArr5 = strArr9;
                num = num2;
                obj34 = obj49;
            } else {
                strArr5 = strArr9;
                Class cls12 = (Class) removeParam.initialize(Color.blue(0) + 48, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 2755);
                byte b12 = (byte) (-$$a[23]);
                num = num2;
                Object[] objArr39 = new Object[1];
                e(b12, (byte) (b12 | 18), (byte) $$b, objArr39);
                Method method10 = cls12.getMethod((String) objArr39[0], String.class);
                map6.put(-108371147, method10);
                obj34 = method10;
            }
            long longValue5 = ((Long) ((Method) obj34).invoke(null, objArr38)).longValue();
            long j13 = longValue5 ^ (-1);
            long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(318L, j13 | ((1035852604 | j9) ^ (-1)), ((-318) * (((j13 | (-1035852605)) ^ (-1)) | (((-1035852605) | j9) ^ (-1)))) + (((((1035852604 | j13) | j9) ^ (-1)) | (((j10 | (-1035852605)) | longValue5) ^ (-1))) * (-318)) + (319 * longValue5) + 328365275785L, 1535171824L);
            i12 = i54;
            if (((((int) m5) & Boxes$$ExternalSyntheticOutline1.m((~((-16797702) | i12)) | 9502976, 576, (((~((-1432517806) | i)) | 1415720104) * 576) + 1771465493, -589006336)) | (((int) (m5 >> 32)) & ((((-30059013) | i) * 591) + ((((~((-30059013) | i12)) | (-1407167399)) * (-591)) - 685010772)))) != 0) {
                i13 = i ^ (i63 + EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                break;
            }
            i63++;
            i54 = i12;
            num2 = num;
            strArr9 = strArr5;
            i62 = 4;
        }
        if (i13 != i) {
            Object[] objArr40 = {new int[]{i}, new int[]{i13}, null, null, new int[1]};
            Object[] objArr41 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 243905297)) | (~((-833318174) | i)) | 824331276) * 623) + ((i12 | 234918400) * (-623)) + (((~((-824331277) | i)) * 623) - 1054778118))};
            Map map7 = removeParam.visaSchemeConfiguration;
            Object obj50 = map7.get(-1544987438);
            if (obj50 != null) {
                obj33 = obj50;
            } else {
                Class cls13 = (Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 86, (char) (28641 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 3317);
                byte[] bArr5 = $$a;
                byte b13 = (byte) (-bArr5[24]);
                byte b14 = bArr5[19];
                Object[] objArr42 = new Object[1];
                e(b13, b14, (byte) (b14 | 25), objArr42);
                Method method11 = cls13.getMethod((String) objArr42[0], cls, cls, cls);
                map7.put(-1544987438, method11);
                obj33 = method11;
            }
            ((int[]) objArr40[4])[0] = ((Integer) ((Method) obj33).invoke(null, objArr41)).intValue();
            return objArr40;
        }
        Object[] objArr43 = new Object[1];
        d((ViewConfiguration.getPressedStateDuration() >> 16) + 13, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 408 - TextUtils.indexOf((CharSequence) "", '0'), objArr43);
        Object[] objArr44 = {((String) objArr43[0]).intern()};
        Map map8 = removeParam.visaSchemeConfiguration;
        Object obj51 = map8.get(-690415720);
        if (obj51 != null) {
            obj3 = obj51;
        } else {
            Class cls14 = (Class) removeParam.initialize(Process.getGidForName("") + 48, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 2248 - KeyEvent.normalizeMetaState(0));
            byte[] bArr6 = $$a;
            byte b15 = bArr6[19];
            Object[] objArr45 = new Object[1];
            e(b15, (byte) (b15 | 37), (byte) (-bArr6[23]), objArr45);
            Method method12 = cls14.getMethod((String) objArr45[0], String.class);
            map8.put(-690415720, method12);
            obj3 = method12;
        }
        String str5 = (String) ((Method) obj3).invoke(null, objArr44);
        if (str5 != null) {
            Object[] objArr46 = new Object[1];
            d((ViewConfiguration.getEdgeSlop() >> 16) + 9, (char) (ViewConfiguration.getTouchSlop() >> 8), 422 - View.resolveSizeAndState(0, 0, 0), objArr46);
            if (str5.contains(((String) objArr46[0]).intern())) {
                i14 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE;
                if (i14 == i) {
                    Object[] objArr47 = {new int[]{i}, new int[]{i14}, null, null, new int[1]};
                    Object[] objArr48 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-479387047))) | (~((-589300233) | i12))) * 765) + (((~((-479387047) | i12)) | 8536192) * 1530) + (((((~((-8536193) | i12)) | (~((-470850855) | i))) | (~((-589300233) | i))) * 765) - 23880278))};
                    Object obj52 = map8.get(-1544987438);
                    if (obj52 != null) {
                        obj32 = obj52;
                    } else {
                        Class cls15 = (Class) removeParam.initialize(86 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (28641 - View.MeasureSpec.getMode(0)), Color.rgb(0, 0, 0) + 16780533);
                        byte[] bArr7 = $$a;
                        byte b16 = (byte) (-bArr7[24]);
                        byte b17 = bArr7[19];
                        Object[] objArr49 = new Object[1];
                        e(b16, b17, (byte) (b17 | 25), objArr49);
                        Method method13 = cls15.getMethod((String) objArr49[0], cls, cls, cls);
                        map8.put(-1544987438, method13);
                        obj32 = method13;
                    }
                    ((int[]) objArr47[4])[0] = ((Integer) ((Method) obj32).invoke(null, objArr48)).intValue();
                    return objArr47;
                }
                Object[] objArr50 = new Object[1];
                d(17 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35886), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 432, objArr50);
                String intern12 = ((String) objArr50[0]).intern();
                Object[] objArr51 = new Object[1];
                d((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 448 - (ViewConfiguration.getTapTimeout() >> 16), objArr51);
                String intern13 = ((String) objArr51[0]).intern();
                File file2 = new File(intern12);
                if (file2.exists()) {
                    int i64 = getWarnings + 105;
                    ThreeDS2ServiceInstance = i64 % 128;
                    if (i64 % 2 != 0) {
                        file2.isFile();
                        throw null;
                    }
                    if (file2.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file2));
                            Object[] objArr52 = new Object[1];
                            d(1 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 454 - Color.red(0), objArr52);
                            Scanner useDelimiter = scanner.useDelimiter(((String) objArr52[0]).intern());
                            if (useDelimiter.hasNext()) {
                                getWarnings = (ThreeDS2ServiceInstance + 71) % 128;
                                str4 = useDelimiter.next();
                            } else {
                                str4 = "";
                            }
                            useDelimiter.close();
                        } catch (IOException unused) {
                        }
                        if (str4.contains(intern13)) {
                            i15 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE;
                            if (i15 == i) {
                                Object[] objArr53 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                                Object[] objArr54 = {Integer.valueOf(i3), 16, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m((~(i | 1003919744)) | (~((-73303727) | i)) | 67634734, -69, (((~((-5668993) | i)) | (~(1071554478 | i))) * 69) + 1289227668, 159825152))};
                                Map map9 = removeParam.visaSchemeConfiguration;
                                Object obj53 = map9.get(-1544987438);
                                if (obj53 != null) {
                                    obj31 = obj53;
                                } else {
                                    Class cls16 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 87, (char) (28641 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3317);
                                    byte[] bArr8 = $$a;
                                    byte b18 = (byte) (-bArr8[24]);
                                    byte b19 = bArr8[19];
                                    Object[] objArr55 = new Object[1];
                                    e(b18, b19, (byte) (b19 | 25), objArr55);
                                    Method method14 = cls16.getMethod((String) objArr55[0], cls, cls, cls);
                                    map9.put(-1544987438, method14);
                                    obj31 = method14;
                                }
                                ((int[]) objArr53[4])[0] = ((Integer) ((Method) obj31).invoke(null, objArr54)).intValue();
                                return objArr53;
                            }
                            Object[] objArr56 = new Object[1];
                            d(23 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 52987), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 456, objArr56);
                            Object[] objArr57 = {((String) objArr56[0]).intern()};
                            Map map10 = removeParam.visaSchemeConfiguration;
                            Object obj54 = map10.get(-690415720);
                            if (obj54 != null) {
                                obj4 = obj54;
                            } else {
                                Class cls17 = (Class) removeParam.initialize(48 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2248);
                                byte[] bArr9 = $$a;
                                byte b20 = bArr9[19];
                                Object[] objArr58 = new Object[1];
                                e(b20, (byte) (b20 | 37), (byte) (-bArr9[23]), objArr58);
                                Method method15 = cls17.getMethod((String) objArr58[0], String.class);
                                map10.put(-690415720, method15);
                                obj4 = method15;
                            }
                            String lowerCase = ((String) ((Method) obj4).invoke(null, objArr57)).toLowerCase();
                            Object[] objArr59 = new Object[1];
                            d((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, (char) (Process.myTid() >> 22), 478 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr59);
                            int i65 = lowerCase.contains(((String) objArr59[0]).intern()) ? i ^ EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                            if (i65 != i) {
                                objArr4 = new Object[]{new int[]{i}, new int[]{i65}, null, null, new int[1]};
                                Object[] objArr60 = {Integer.valueOf(i3), 16, Integer.valueOf(((i | (-638064809)) * 465) + ((421971782 | (~((-655251689) | i))) * 930) + ((((~(i | 421971782)) | (-655251689)) * (-465)) - 263866758))};
                                Object obj55 = map10.get(-1544987438);
                                if (obj55 != null) {
                                    obj30 = obj55;
                                } else {
                                    Class cls18 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 87, (char) (28641 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3317);
                                    byte[] bArr10 = $$a;
                                    byte b21 = (byte) (-bArr10[24]);
                                    byte b22 = bArr10[19];
                                    Object[] objArr61 = new Object[1];
                                    e(b21, b22, (byte) (b22 | 25), objArr61);
                                    Method method16 = cls18.getMethod((String) objArr61[0], cls, cls, cls);
                                    map10.put(-1544987438, method16);
                                    obj30 = method16;
                                }
                                ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj30).invoke(null, objArr60)).intValue();
                            } else {
                                Object[] objArr62 = new Object[1];
                                d(17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (35886 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf("", "", 0, 0) + 431, objArr62);
                                String intern14 = ((String) objArr62[0]).intern();
                                Object[] objArr63 = new Object[1];
                                d(6 - (Process.myTid() >> 22), (char) (11274 - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0) + 483, objArr63);
                                String intern15 = ((String) objArr63[0]).intern();
                                File file3 = new File(intern14);
                                if (file3.exists() && file3.isFile()) {
                                    try {
                                        Scanner scanner2 = new Scanner(new FileInputStream(file3));
                                        Object[] objArr64 = new Object[1];
                                        d(View.resolveSize(0, 0) + 2, (char) Gravity.getAbsoluteGravity(0, 0), 454 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr64);
                                        Scanner useDelimiter2 = scanner2.useDelimiter(((String) objArr64[0]).intern());
                                        if (useDelimiter2.hasNext()) {
                                            int i66 = ThreeDS2ServiceInstance + 75;
                                            getWarnings = i66 % 128;
                                            if (i66 % 2 == 0) {
                                                useDelimiter2.next();
                                                throw null;
                                            }
                                            str3 = useDelimiter2.next();
                                        } else {
                                            str3 = "";
                                        }
                                        useDelimiter2.close();
                                    } catch (IOException unused2) {
                                    }
                                    if (str3.contains(intern15)) {
                                        i16 = i ^ EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        if (i16 == i) {
                                            Object[] objArr65 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                            int i67 = ~(59745063 | i12);
                                            Object[] objArr66 = {Integer.valueOf(i3), 16, Integer.valueOf(((i67 | (-1017478408)) * 712) + (((~(i | 1068498727)) | (~(i12 | (-1008753665)))) * (-712)) + ((1008753664 | i67) * (-712)) + 83564334)};
                                            Map map11 = removeParam.visaSchemeConfiguration;
                                            Object obj56 = map11.get(-1544987438);
                                            if (obj56 != null) {
                                                obj29 = obj56;
                                            } else {
                                                Class cls19 = (Class) removeParam.initialize(86 - TextUtils.getOffsetAfter("", 0), (char) (28642 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 3318);
                                                byte[] bArr11 = $$a;
                                                byte b23 = (byte) (-bArr11[24]);
                                                byte b24 = bArr11[19];
                                                Object[] objArr67 = new Object[1];
                                                e(b23, b24, (byte) (b24 | 25), objArr67);
                                                Method method17 = cls19.getMethod((String) objArr67[0], cls, cls, cls);
                                                map11.put(-1544987438, method17);
                                                obj29 = method17;
                                            }
                                            ((int[]) objArr65[4])[0] = ((Integer) ((Method) obj29).invoke(null, objArr66)).intValue();
                                            return objArr65;
                                        }
                                        Map map12 = removeParam.visaSchemeConfiguration;
                                        Object obj57 = map12.get(484934282);
                                        if (obj57 != null) {
                                            objArr2 = null;
                                            obj6 = obj57;
                                        } else {
                                            Class cls20 = (Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777263, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 7490), TextUtils.lastIndexOf("", '0', 0, 0) + 3472);
                                            byte b25 = (byte) (-$$a[23]);
                                            Object[] objArr68 = new Object[1];
                                            e(b25, (byte) (b25 | 18), (byte) $$b, objArr68);
                                            objArr2 = null;
                                            Method method18 = cls20.getMethod((String) objArr68[0], null);
                                            map12.put(484934282, method18);
                                            obj6 = method18;
                                        }
                                        long longValue6 = ((Long) ((Method) obj6).invoke(objArr2, objArr2)).longValue();
                                        long j14 = ((431765950 | j9) * (-859)) + ((-858) * longValue6) + 371318717000L;
                                        long j15 = longValue6 ^ (-1);
                                        long m6 = SVG$Unit$EnumUnboxingLocalUtility.m(859L, ((j15 | j10) ^ (-1)) | ((j15 | 431765950) ^ (-1)), ((((j10 | 431765950) ^ (-1)) | ((((-431765951) | j15) | j9) ^ (-1))) * 859) + j14, -1453192586L);
                                        if (((((int) (m6 >> 32)) & ((((~(i12 | (-1224244928))) | (~((-1633495958) | i))) * 950) + (((~((-1224244928) | i)) | (~(i12 | (-1633495958)))) * (-950)) + (((~(1224244927 | i12)) | (~(1633495957 | i))) * 1900) + 1871737038)) | (((int) m6) & ((((~((-1244064408) | i12)) | 1076134021 | (~((-25231617) | i))) * 140) + (((~((-193162003) | i12)) | 25231616) * (-280)) + ((((-193162003) | i) * 140) - 1261798403)))) == 1) {
                                            Object[] objArr69 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                            Object[] objArr70 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i | 766991200)) | (~(i12 | 310232270))) * 627) + (((~((-310232271) | i)) | 766991200) * (-627)) + ((((-763501345) | i) * (-627)) - 2108493608))};
                                            Object obj58 = map12.get(-1544987438);
                                            if (obj58 != null) {
                                                obj28 = obj58;
                                            } else {
                                                Class cls21 = (Class) removeParam.initialize(86 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28641), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3317);
                                                byte[] bArr12 = $$a;
                                                byte b26 = (byte) (-bArr12[24]);
                                                byte b27 = bArr12[19];
                                                Object[] objArr71 = new Object[1];
                                                e(b26, b27, (byte) (b27 | 25), objArr71);
                                                Method method19 = cls21.getMethod((String) objArr71[0], cls, cls, cls);
                                                map12.put(-1544987438, method19);
                                                obj28 = method19;
                                            }
                                            ((int[]) objArr69[4])[0] = ((Integer) ((Method) obj28).invoke(null, objArr70)).intValue();
                                            return objArr69;
                                        }
                                        Object[] objArr72 = {1};
                                        Object obj59 = map12.get(-924697231);
                                        if (obj59 != null) {
                                            obj7 = obj59;
                                        } else {
                                            Class cls22 = (Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 47, (char) (5586 - Gravity.getAbsoluteGravity(0, 0)), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1031);
                                            byte b28 = (byte) (-$$a[23]);
                                            Object[] objArr73 = new Object[1];
                                            e(b28, (byte) (b28 | 18), (byte) $$b, objArr73);
                                            Method method20 = cls22.getMethod((String) objArr73[0], cls);
                                            map12.put(-924697231, method20);
                                            obj7 = method20;
                                        }
                                        long longValue7 = ((Long) ((Method) obj7).invoke(null, objArr72)).longValue();
                                        long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(191L, ((860841503 | longValue7) ^ (-1)) | ((j10 | longValue7) ^ (-1)), (((-860841504) | ((longValue7 | j9) ^ (-1))) * 191) + (192 * longValue7) + 163559885951L, 1927743454L);
                                        int i68 = (~(157583983 | i12)) | 1443520528;
                                        int i69 = ~((-6294118) | i);
                                        int i70 = ((int) (m7 >> 32)) & (((i69 | (~(1601104511 | i12))) * HttpStatusCode.BAD_GATEWAY_502) + ((i68 | i69) * (-502)) + 235058442);
                                        int i71 = (~((-425069173) | i)) | 274074208;
                                        int i72 = ~((-1711300619) | i12);
                                        int i73 = ((int) ((long) (i70 | (((int) m7) & (((i72 | (~((-150994965) | i))) * 470) + (((i71 | i72) * (-470)) + (-1471367531))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                        if (i73 != i) {
                                            getWarnings = (ThreeDS2ServiceInstance + 11) % 128;
                                            Object[] objArr74 = {new int[]{i}, new int[]{i73}, null, null, new int[1]};
                                            Object[] objArr75 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-420536406))) | 16785489 | (~(i12 | 1060437981))) * 988) + (((~((-403750917) | i12)) | (~(1060437981 | i))) * 988) + 1939789034)};
                                            Object obj60 = map12.get(-1544987438);
                                            if (obj60 != null) {
                                                obj27 = obj60;
                                            } else {
                                                Class cls23 = (Class) removeParam.initialize((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 86, (char) (28641 - View.getDefaultSize(0, 0)), Process.getGidForName("") + 3318);
                                                byte[] bArr13 = $$a;
                                                byte b29 = (byte) (-bArr13[24]);
                                                byte b30 = bArr13[19];
                                                Object[] objArr76 = new Object[1];
                                                e(b29, b30, (byte) (b30 | 25), objArr76);
                                                Method method21 = cls23.getMethod((String) objArr76[0], cls, cls, cls);
                                                map12.put(-1544987438, method21);
                                                obj27 = method21;
                                            }
                                            ((int[]) objArr74[4])[0] = ((Integer) ((Method) obj27).invoke(null, objArr75)).intValue();
                                            return objArr74;
                                        }
                                        Object[] objArr77 = new Object[1];
                                        d(23 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (52987 - (ViewConfiguration.getLongPressTimeout() >> 16)), 456 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr77);
                                        Object[] objArr78 = {((String) objArr77[0]).intern()};
                                        Object obj61 = map12.get(-690415720);
                                        if (obj61 != null) {
                                            i17 = -690415720;
                                            obj8 = obj61;
                                        } else {
                                            Class cls24 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 48, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2248 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                            byte[] bArr14 = $$a;
                                            byte b31 = bArr14[19];
                                            i17 = -690415720;
                                            Object[] objArr79 = new Object[1];
                                            e(b31, (byte) (b31 | 37), (byte) (-bArr14[23]), objArr79);
                                            Method method22 = cls24.getMethod((String) objArr79[0], String.class);
                                            map12.put(-690415720, method22);
                                            obj8 = method22;
                                        }
                                        Object invoke2 = ((Method) obj8).invoke(null, objArr78);
                                        if (invoke2 != null) {
                                            Object[] objArr80 = {invoke2, 42};
                                            Object obj62 = map12.get(-146694085);
                                            if (obj62 != null) {
                                                obj26 = obj62;
                                            } else {
                                                Class cls25 = (Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + PnmConstants.PBM_TEXT_CODE, (char) (TextUtils.lastIndexOf("", '0') + 29155), Gravity.getAbsoluteGravity(0, 0) + 3756);
                                                byte b32 = (byte) (-$$a[23]);
                                                Object[] objArr81 = new Object[1];
                                                e(b32, (byte) (b32 | 18), (byte) $$b, objArr81);
                                                Method method23 = cls25.getMethod((String) objArr81[0], String.class, cls);
                                                map12.put(-146694085, method23);
                                                obj26 = method23;
                                            }
                                            long longValue8 = ((Long) ((Method) obj26).invoke(null, objArr80)).longValue();
                                            long j16 = longValue8 ^ (-1);
                                            long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(366L, ((482066145 | longValue8) ^ (-1)) | (((j16 | (-482066146)) | j9) ^ (-1)), ((-366) * ((-482066146) | ((j16 | j9) ^ (-1)))) + (((-482066146) | longValue8) * (-366)) + ((367 * longValue8) - 176918275582L), 980679495L);
                                            if (((Boxes$$ExternalSyntheticOutline1.m((~((-1095763717) | i12)) | 5244420 | (~((-341462695) | i12)), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (((~(i12 | (-336218275))) | (~((-1090519297) | i12))) * (-184)) - 1019427974, 1491681104) & ((int) (m8 >> 32))) | (((int) m8) & ((((~((-1708891604) | i12)) | (-271665194)) * 783) + ((~((-1116162) | i12)) * (-783)) + 823222987))) == 1986687685) {
                                                i18 = i12;
                                                c2 = 4;
                                                cls2 = String.class;
                                                Object[] objArr82 = new Object[1];
                                                d(16 - Color.red(0), (char) (26776 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 592, objArr82);
                                                Object[] objArr83 = {((String) objArr82[0]).intern()};
                                                Map map13 = removeParam.visaSchemeConfiguration;
                                                obj14 = map13.get(Integer.valueOf(i17));
                                                if (obj14 == null) {
                                                    obj15 = obj14;
                                                } else {
                                                    Class cls26 = (Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, (char) Gravity.getAbsoluteGravity(0, 0), 2248 - (ViewConfiguration.getScrollBarSize() >> 8));
                                                    byte[] bArr15 = $$a;
                                                    byte b33 = bArr15[19];
                                                    Object[] objArr84 = new Object[1];
                                                    e(b33, (byte) (b33 | 37), (byte) (-bArr15[23]), objArr84);
                                                    Method method24 = cls26.getMethod((String) objArr84[0], cls2);
                                                    map13.put(Integer.valueOf(i17), method24);
                                                    obj15 = method24;
                                                }
                                                invoke = ((Method) obj15).invoke(null, objArr83);
                                                if (invoke != null) {
                                                    int i74 = ThreeDS2ServiceInstance + 23;
                                                    getWarnings = i74 % 128;
                                                    i22 = i74 % 2 == 0 ? 1 : 0;
                                                } else {
                                                    Object[] objArr85 = {invoke, 42};
                                                    Object obj63 = map13.get(-146694085);
                                                    if (obj63 != null) {
                                                        obj16 = obj63;
                                                    } else {
                                                        Class cls27 = (Class) removeParam.initialize(48 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 29153), AndroidCharacter.getMirror('0') + 3708);
                                                        byte b34 = (byte) (-$$a[23]);
                                                        Object[] objArr86 = new Object[1];
                                                        e(b34, (byte) (b34 | 18), (byte) $$b, objArr86);
                                                        Method method25 = cls27.getMethod((String) objArr86[0], cls2, cls);
                                                        map13.put(-146694085, method25);
                                                        obj16 = method25;
                                                    }
                                                    long longValue9 = ((Long) ((Method) obj16).invoke(null, objArr85)).longValue();
                                                    long j17 = longValue9 ^ (-1);
                                                    long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(318L, j17 | ((1229535145 | j9) ^ (-1)), ((-318) * (((j17 | (-1229535146)) ^ (-1)) | (((-1229535146) | j9) ^ (-1)))) + (((((1229535145 | j17) | j9) ^ (-1)) | (((j10 | (-1229535146)) | longValue9) ^ (-1))) * (-318)) + (319 * longValue9) + 389762641282L, 1728148495L);
                                                }
                                                if (i22 != 1986687685 && i22 != -1514516938) {
                                                    Object[] objArr87 = new Object[1];
                                                    d(14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5738), (ViewConfiguration.getScrollBarSize() >> 8) + 1307, objArr87);
                                                    String intern16 = ((String) objArr87[0]).intern();
                                                    Object[] objArr88 = new Object[1];
                                                    d(26 - Color.green(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 49007), 1321 - ((Process.getThreadPriority(0) + 20) >> 6), objArr88);
                                                    String intern17 = ((String) objArr88[0]).intern();
                                                    Object[] objArr89 = new Object[1];
                                                    d((ViewConfiguration.getFadingEdgeLength() >> 16) + 17, (char) (61666 - TextUtils.lastIndexOf("", '0', 0, 0)), 1348 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr89);
                                                    String intern18 = ((String) objArr89[0]).intern();
                                                    Object[] objArr90 = new Object[1];
                                                    d(17 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.argb(0, 0, 0, 0) + 1364, objArr90);
                                                    String intern19 = ((String) objArr90[0]).intern();
                                                    Object[] objArr91 = new Object[1];
                                                    d(Process.getGidForName("") + 16, (char) (34245 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1380, objArr91);
                                                    String intern20 = ((String) objArr91[0]).intern();
                                                    Object[] objArr92 = new Object[1];
                                                    d(TextUtils.indexOf("", "", 0, 0) + 37, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1396 - View.MeasureSpec.getMode(0), objArr92);
                                                    String intern21 = ((String) objArr92[0]).intern();
                                                    Object[] objArr93 = new Object[1];
                                                    d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53113), AndroidCharacter.getMirror('0') + 1385, objArr93);
                                                    String intern22 = ((String) objArr93[0]).intern();
                                                    Object[] objArr94 = new Object[1];
                                                    d(12 - MotionEvent.axisFromString(""), (char) (46916 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 1445 - (ViewConfiguration.getEdgeSlop() >> 16), objArr94);
                                                    String intern23 = ((String) objArr94[0]).intern();
                                                    Object[] objArr95 = new Object[1];
                                                    d(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 42918), 1458 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr95);
                                                    String intern24 = ((String) objArr95[0]).intern();
                                                    Object[] objArr96 = new Object[1];
                                                    d(32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (Process.myTid() >> 22) + 1480, objArr96);
                                                    String intern25 = ((String) objArr96[0]).intern();
                                                    Object[] objArr97 = new Object[1];
                                                    d((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12, (char) View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1511, objArr97);
                                                    String intern26 = ((String) objArr97[0]).intern();
                                                    Object[] objArr98 = new Object[1];
                                                    d(12 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (64344 - MotionEvent.axisFromString("")), 1523 - ((Process.getThreadPriority(0) + 20) >> 6), objArr98);
                                                    String intern27 = ((String) objArr98[0]).intern();
                                                    Object[] objArr99 = new Object[1];
                                                    d(13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((Process.myPid() >> 22) + 17118), 1536 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr99);
                                                    String intern28 = ((String) objArr99[0]).intern();
                                                    Object[] objArr100 = new Object[1];
                                                    d((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11, (char) (20425 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0, 0) + 1547, objArr100);
                                                    String intern29 = ((String) objArr100[0]).intern();
                                                    Object[] objArr101 = new Object[1];
                                                    d(12 - View.getDefaultSize(0, 0), (char) Color.alpha(0), 1559 - (ViewConfiguration.getTouchSlop() >> 8), objArr101);
                                                    String intern30 = ((String) objArr101[0]).intern();
                                                    Object[] objArr102 = new Object[1];
                                                    d(14 - (Process.myPid() >> 22), (char) (6267 - View.MeasureSpec.getSize(0)), 1571 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr102);
                                                    String intern31 = ((String) objArr102[0]).intern();
                                                    Object[] objArr103 = new Object[1];
                                                    d(TextUtils.indexOf("", "", 0) + 12, (char) (6807 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), Process.getGidForName("") + 1586, objArr103);
                                                    String intern32 = ((String) objArr103[0]).intern();
                                                    Object[] objArr104 = new Object[1];
                                                    d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2662), 1598 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr104);
                                                    String intern33 = ((String) objArr104[0]).intern();
                                                    Object[] objArr105 = new Object[1];
                                                    d(28 - TextUtils.getTrimmedLength(""), (char) (50943 - TextUtils.indexOf("", "", 0, 0)), 1622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr105);
                                                    String[] strArr10 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((String) objArr105[0]).intern()};
                                                    i30 = 19;
                                                    i31 = 0;
                                                    while (true) {
                                                        if (i31 < i30) {
                                                            i31 = -1;
                                                            break;
                                                        }
                                                        String str6 = strArr10[i31];
                                                        Object[] objArr106 = {str6};
                                                        Map map14 = removeParam.visaSchemeConfiguration;
                                                        Object obj64 = map14.get(-87104105);
                                                        if (obj64 != null) {
                                                            obj24 = obj64;
                                                        } else {
                                                            Class cls28 = (Class) removeParam.initialize(View.resolveSize(0, 0) + 48, (char) ExpandableListView.getPackedPositionGroup(0L), 2754 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                            byte[] bArr16 = $$a;
                                                            Object[] objArr107 = new Object[1];
                                                            e((byte) (-bArr16[23]), (byte) (-bArr16[24]), bArr16[19], objArr107);
                                                            Method method26 = cls28.getMethod((String) objArr107[0], cls2);
                                                            map14.put(-87104105, method26);
                                                            obj24 = method26;
                                                        }
                                                        long longValue10 = ((Long) ((Method) obj24).invoke(null, objArr106)).longValue();
                                                        long j18 = (1935846584 | longValue10) ^ (-1);
                                                        long j19 = ((-1188) * (j18 | ((j10 | longValue10) ^ (-1)))) + (((-1187) * longValue10) - 1151828718075L);
                                                        long j20 = longValue10 ^ (-1);
                                                        long j21 = (j10 | (-1935846585)) ^ (-1);
                                                        long m10 = SVG$Unit$EnumUnboxingLocalUtility.m(594L, ((j20 | (-1935846585)) ^ (-1)) | ((j20 | j10) ^ (-1)) | j21, ((j18 | ((j20 | j9) ^ (-1)) | j21) * 594) + j19, -155905077L);
                                                        if (((((int) (m10 >> 32)) & ((((~((-1719267912) | i)) | (~(i18 | 1996488415))) * 765) + ((1714446915 | (~((-1719267912) | i18))) * 1530) + (((~((-1714446916) | i18)) | (~((-4820997) | i)) | (~(1996488415 | i))) * 765) + 490691197)) | (((int) m10) & ((((~((-1358241761) | i)) | (~((-1499499126) | i18)) | (~(1499499125 | i))) * 959) + ((((~(i18 | 1499499125)) | ((~((-1358241761) | i18)) | (~((-1499499126) | i)))) * 959) - 1836134284)))) != 0) {
                                                            break;
                                                        }
                                                        Object[] objArr108 = new Object[1];
                                                        d(14 - View.combineMeasuredStates(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6266), Color.green(0) + 1571, objArr108);
                                                        if (str6.equals(((String) objArr108[0]).intern())) {
                                                            Object[] objArr109 = {str6};
                                                            Object obj65 = map14.get(-87104105);
                                                            if (obj65 != null) {
                                                                obj25 = obj65;
                                                            } else {
                                                                Class cls29 = (Class) removeParam.initialize(48 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2753);
                                                                byte[] bArr17 = $$a;
                                                                Object[] objArr110 = new Object[1];
                                                                e((byte) (-bArr17[23]), (byte) (-bArr17[24]), bArr17[19], objArr110);
                                                                Method method27 = cls29.getMethod((String) objArr110[0], cls2);
                                                                map14.put(-87104105, method27);
                                                                obj25 = method27;
                                                            }
                                                            long longValue11 = ((Long) ((Method) obj25).invoke(null, objArr109)).longValue();
                                                            long j22 = longValue11 ^ (-1);
                                                            int m11 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(406L, ((1782292749 | j9) ^ (-1)) | ((j10 | longValue11) ^ (-1)), ((-406) * (((j22 | j10) | (-1782292750)) ^ (-1))) + (((((j22 | j9) ^ (-1)) | (((j10 | (-1782292750)) | longValue11) ^ (-1))) * (-406)) + ((407 * longValue11) + 721828563750L)), -309458912L) >> 32)) & ((((~((-603031032) | i18)) | (~(872009719 | i))) * 338) + ((((268978688 | r10) | (~(603031031 | i))) * (-338)) - 2137257558));
                                                            int i75 = ~(1528131381 | i18);
                                                            if ((m11 | (((int) r8) & (((i75 | (~((-1511286325) | i))) * 338) + ((((16845057 | i75) | (~((-1528131382) | i))) * (-338)) - 38564441)))) != 0) {
                                                                break;
                                                            }
                                                        }
                                                        i31++;
                                                        i30 = 19;
                                                    }
                                                    if (i31 >= 0 && (i32 = i ^ (i31 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) != i) {
                                                        Object[] objArr111 = new Object[5];
                                                        objArr111[0] = new int[]{i};
                                                        objArr111[1] = new int[]{i32};
                                                        objArr111[c2] = new int[1];
                                                        objArr111[2] = null;
                                                        objArr111[3] = null;
                                                        Object[] objArr112 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-824181313))) | 243326350) * 366) + ((((~((-829039217) | i)) | 248184254) * (-366)) - 1439750962))};
                                                        Map map15 = removeParam.visaSchemeConfiguration;
                                                        obj22 = map15.get(-1544987438);
                                                        if (obj22 == null) {
                                                            obj23 = obj22;
                                                        } else {
                                                            Class cls30 = (Class) removeParam.initialize(87 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (28641 - Color.alpha(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 3318);
                                                            byte[] bArr18 = $$a;
                                                            byte b35 = (byte) (-bArr18[24]);
                                                            byte b36 = bArr18[19];
                                                            Object[] objArr113 = new Object[1];
                                                            e(b35, b36, (byte) (b36 | 25), objArr113);
                                                            Method method28 = cls30.getMethod((String) objArr113[0], cls, cls, cls);
                                                            map15.put(-1544987438, method28);
                                                            obj23 = method28;
                                                        }
                                                        ((int[]) objArr111[c2])[0] = ((Integer) ((Method) obj23).invoke(null, objArr112)).intValue();
                                                        return objArr111;
                                                    }
                                                }
                                                Object[] objArr114 = new Object[1];
                                                d(13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1649 - (ViewConfiguration.getTouchSlop() >> 8), objArr114);
                                                String intern34 = ((String) objArr114[0]).intern();
                                                Object[] objArr115 = new Object[1];
                                                d(5 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 41309), 1662 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr115);
                                                String[] strArr11 = {intern34, ((String) objArr115[0]).intern()};
                                                Object[] objArr116 = new Object[1];
                                                d(15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40863), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1666, objArr116);
                                                String intern35 = ((String) objArr116[0]).intern();
                                                Object[] objArr117 = new Object[1];
                                                d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, (char) (16320 - TextUtils.indexOf("", "", 0, 0)), 1682 - Color.green(0), objArr117);
                                                String intern36 = ((String) objArr117[0]).intern();
                                                Object[] objArr118 = new Object[1];
                                                d((ViewConfiguration.getTouchSlop() >> 8) + 14, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1702, objArr118);
                                                String[] strArr12 = {intern35, intern36, ((String) objArr118[0]).intern()};
                                                Object[] objArr119 = new Object[1];
                                                d(21 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1715 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr119);
                                                String intern37 = ((String) objArr119[0]).intern();
                                                Object[] objArr120 = new Object[1];
                                                d(10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 7421), 1735 - TextUtils.lastIndexOf("", '0'), objArr120);
                                                String[] strArr13 = {intern37, ((String) objArr120[0]).intern()};
                                                Object[] objArr121 = new Object[1];
                                                d(Gravity.getAbsoluteGravity(0, 0) + 11, (char) (61862 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1746, objArr121);
                                                String intern38 = ((String) objArr121[0]).intern();
                                                Object[] objArr122 = new Object[1];
                                                d((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, (char) (11275 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 484, objArr122);
                                                String[] strArr14 = {intern38, ((String) objArr122[0]).intern()};
                                                Object[] objArr123 = new Object[1];
                                                d(28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.getCapsMode("", 0, 0) + 7075), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1757, objArr123);
                                                String intern39 = ((String) objArr123[0]).intern();
                                                Object[] objArr124 = new Object[1];
                                                d(10 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (7421 - (Process.myPid() >> 22)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1735, objArr124);
                                                String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new String[]{intern39, ((String) objArr124[0]).intern()}};
                                                i23 = 0;
                                                while (true) {
                                                    if (i23 < 5) {
                                                        i24 = i;
                                                        break;
                                                    }
                                                    int i76 = ThreeDS2ServiceInstance + 19;
                                                    getWarnings = i76 % 128;
                                                    if (i76 % 2 == 0) {
                                                        String[] strArr16 = strArr15[i23];
                                                        i27 = 0;
                                                        str = strArr16[0];
                                                        strArr2 = (String[]) Arrays.copyOfRange(strArr16, 0, strArr16.length);
                                                        length = strArr2.length;
                                                        i26 = i46;
                                                        z = true;
                                                        if (i27 < length) {
                                                            int i77 = i26 + 1;
                                                            boolean z2 = z;
                                                            Object[] objArr125 = new Object[2];
                                                            objArr125[z2 ? 1 : 0] = strArr2[i27];
                                                            objArr125[0] = str;
                                                            Map map16 = removeParam.visaSchemeConfiguration;
                                                            Object obj66 = map16.get(Integer.valueOf(i9));
                                                            if (obj66 != null) {
                                                                strArr3 = strArr15;
                                                                i28 = i23;
                                                                strArr4 = strArr2;
                                                                str2 = str;
                                                                i29 = length;
                                                                method = obj66;
                                                            } else {
                                                                strArr3 = strArr15;
                                                                i28 = i23;
                                                                strArr4 = strArr2;
                                                                str2 = str;
                                                                Class cls31 = (Class) removeParam.initialize(48 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), 2609 - TextUtils.lastIndexOf("", '0', 0, 0));
                                                                byte b37 = (byte) (-$$a[23]);
                                                                i29 = length;
                                                                Object[] objArr126 = new Object[1];
                                                                e(b37, (byte) (b37 | 18), (byte) $$b, objArr126);
                                                                method = cls31.getMethod((String) objArr126[0], cls2, cls2);
                                                                map16.put(Integer.valueOf(i9), method);
                                                            }
                                                            long longValue12 = ((Long) ((Method) method).invoke(null, objArr125)).longValue();
                                                            long j23 = (j10 | 992613943) ^ (-1);
                                                            long j24 = ((-992613944) | longValue12) ^ (-1);
                                                            long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(764L, (((longValue12 ^ (-1)) | 992613943) ^ (-1)) | j24 | j23, ((-1528) * (j24 | ((j10 | longValue12) ^ (-1)))) + ((longValue12 | j23) * 764) + ((-1527) * longValue12) + 759349666395L, 593073905L);
                                                            if (((((int) m12) & ((((-2139078400) | (~((-528301760) | i)) | (~(i18 | 528301759))) * 988) + (((~(i18 | (-1965528170))) | 354751529) * (-1976)) + ((i | (-2139078400)) * 988) + 2067097001)) | (((int) (m12 >> 32)) & ((((-1005390081) | i18) * 754) + (((~((-574619905) | i)) | (~(i18 | 1006456234))) * (-754)) + (((~((-1005390081) | i)) | 574619904 | (~(431836330 | i))) * (-754)) + 105057014))) != 0) {
                                                                i24 = i ^ (i26 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
                                                                break;
                                                            }
                                                            i27++;
                                                            strArr15 = strArr3;
                                                            i26 = i77;
                                                            length = i29;
                                                            i23 = i28;
                                                            strArr2 = strArr4;
                                                            str = str2;
                                                            z = true;
                                                            if (i27 < length) {
                                                                i23++;
                                                                i46 = i26;
                                                            }
                                                        }
                                                    } else {
                                                        String[] strArr17 = strArr15[i23];
                                                        str = strArr17[0];
                                                        z = true;
                                                        strArr2 = (String[]) Arrays.copyOfRange(strArr17, 1, strArr17.length);
                                                        length = strArr2.length;
                                                        i26 = i46;
                                                        i27 = 0;
                                                        if (i27 < length) {
                                                        }
                                                    }
                                                }
                                                if (i24 == i) {
                                                    Object[] objArr127 = new Object[5];
                                                    objArr127[0] = new int[]{i};
                                                    objArr127[1] = new int[]{i24};
                                                    objArr127[c2] = new int[1];
                                                    objArr127[2] = null;
                                                    objArr127[3] = null;
                                                    Object[] objArr128 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-845866613))) | (-1072365567)) * 49) + (((~((-231356859) | i18)) | (-845866613) | (~(231356858 | i))) * (-49)) + ((((~((-845866613) | i18)) | 841008708) * 98) - 1761741728))};
                                                    Map map17 = removeParam.visaSchemeConfiguration;
                                                    Object obj67 = map17.get(-1544987438);
                                                    if (obj67 != null) {
                                                        obj21 = obj67;
                                                    } else {
                                                        Class cls32 = (Class) removeParam.initialize(86 - Color.red(0), (char) ((Process.myTid() >> 22) + 28641), 3317 - TextUtils.getOffsetAfter("", 0));
                                                        byte[] bArr19 = $$a;
                                                        byte b38 = (byte) (-bArr19[24]);
                                                        byte b39 = bArr19[19];
                                                        Object[] objArr129 = new Object[1];
                                                        e(b38, b39, (byte) (b39 | 25), objArr129);
                                                        Method method29 = cls32.getMethod((String) objArr129[0], cls, cls, cls);
                                                        map17.put(-1544987438, method29);
                                                        obj21 = method29;
                                                    }
                                                    ((int[]) objArr127[c2])[0] = ((Integer) ((Method) obj21).invoke(null, objArr128)).intValue();
                                                    return objArr127;
                                                }
                                                try {
                                                    Object[] objArr130 = new Object[1];
                                                    d(13 - TextUtils.getTrimmedLength(""), (char) TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0) + 1785, objArr130);
                                                    String intern40 = ((String) objArr130[0]).intern();
                                                    Object[] objArr131 = new Object[1];
                                                    d(9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 32270), 1798 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr131);
                                                    intern = ((String) objArr131[0]).intern();
                                                    file = new File(intern40);
                                                } catch (Exception unused3) {
                                                    i25 = i ^ 151;
                                                }
                                                if (file.exists() && file.isFile()) {
                                                    try {
                                                        Scanner scanner3 = new Scanner(new FileInputStream(file));
                                                        Object[] objArr132 = new Object[1];
                                                        d(TextUtils.getOffsetAfter("", 0) + 2, (char) TextUtils.indexOf("", ""), 453 - TextUtils.lastIndexOf("", '0', 0, 0), objArr132);
                                                        Scanner useDelimiter3 = scanner3.useDelimiter(((String) objArr132[0]).intern());
                                                        next = useDelimiter3.hasNext() ? useDelimiter3.next() : "";
                                                        useDelimiter3.close();
                                                    } catch (IOException unused4) {
                                                    }
                                                    if (next.contains(intern)) {
                                                        i25 = i ^ 150;
                                                        if (i25 == i) {
                                                            Object[] objArr133 = new Object[5];
                                                            objArr133[0] = new int[]{i};
                                                            objArr133[1] = new int[]{i25};
                                                            objArr133[c2] = new int[1];
                                                            objArr133[2] = null;
                                                            objArr133[3] = null;
                                                            Object[] objArr134 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-749392279) | i18)) | 1059102478) * 398) + (((~(i | (-749392279))) | 1059102478) * 398) + 534130886)};
                                                            Map map18 = removeParam.visaSchemeConfiguration;
                                                            Object obj68 = map18.get(-1544987438);
                                                            if (obj68 != null) {
                                                                obj20 = obj68;
                                                            } else {
                                                                Class cls33 = (Class) removeParam.initialize(85 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (View.MeasureSpec.getMode(0) + 28641), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3317);
                                                                byte[] bArr20 = $$a;
                                                                byte b40 = (byte) (-bArr20[24]);
                                                                byte b41 = bArr20[19];
                                                                Object[] objArr135 = new Object[1];
                                                                e(b40, b41, (byte) (b41 | 25), objArr135);
                                                                Method method30 = cls33.getMethod((String) objArr135[0], cls, cls, cls);
                                                                map18.put(-1544987438, method30);
                                                                obj20 = method30;
                                                            }
                                                            ((int[]) objArr133[c2])[0] = ((Integer) ((Method) obj20).invoke(null, objArr134)).intValue();
                                                            return objArr133;
                                                        }
                                                        Object[] objArr136 = new Object[1];
                                                        d(KeyEvent.keyCodeFromString("") + 47, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59418), 1806 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr136);
                                                        Object[] objArr137 = {((String) objArr136[0]).intern()};
                                                        Map map19 = removeParam.visaSchemeConfiguration;
                                                        Object obj69 = map19.get(-39554962);
                                                        if (obj69 != null) {
                                                            obj17 = obj69;
                                                        } else {
                                                            Class cls34 = (Class) removeParam.initialize(48 - TextUtils.getOffsetAfter("", 0), (char) View.MeasureSpec.getSize(0), Color.alpha(0) + 2754);
                                                            Object[] objArr138 = new Object[1];
                                                            e((byte) (-$$a[23]), (byte) 28, s3, objArr138);
                                                            Method method31 = cls34.getMethod((String) objArr138[0], cls2);
                                                            map19.put(-39554962, method31);
                                                            obj17 = method31;
                                                        }
                                                        long longValue13 = ((Long) ((Method) obj17).invoke(null, objArr137)).longValue();
                                                        long j25 = (277941411 | j10) ^ (-1);
                                                        long m13 = SVG$Unit$EnumUnboxingLocalUtility.m(338L, j25 | ((((-277941412) | longValue13) | j9) ^ (-1)), (((277941411 | longValue13) ^ (-1)) * 338) + ((-338) * (j25 | (((longValue13 ^ (-1)) | (-277941412)) ^ (-1)) | (((-277941412) | j9) ^ (-1)))) + (339 * longValue13) + 93666255844L, 1318182159L);
                                                        int m14 = i ^ (((((int) m13) & ((((~((-714460423) | i18)) | (~(i18 | 2143280463))) * 614) + (((((~((-2059390288) | i18)) | 1344929865) | (~(i18 | 798350598))) * (-1228)) + (((1428820041 | i) * 614) - 252970645)))) | (((int) (m13 >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~(i18 | (-1901753953))) | (-1235305877), 381, (((-1090536449) | i) * (-381)) + 1877244654, -1117441024))) * EnumC0170g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
                                                        if (m14 == i) {
                                                            Object[] objArr139 = new Object[5];
                                                            objArr139[0] = new int[]{i};
                                                            objArr139[1] = new int[]{i};
                                                            objArr139[c2] = new int[1];
                                                            objArr139[2] = null;
                                                            objArr139[3] = null;
                                                            Object[] objArr140 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i | (-802563214))) | 5644417 | (~(i18 | 1071579053))) * 521) + ((274660257 | i) * 521) + (((~(i18 | 274660257)) | 802563213) * (-1042)) + 1236756602)};
                                                            Object obj70 = map19.get(-1544987438);
                                                            if (obj70 != null) {
                                                                obj18 = obj70;
                                                            } else {
                                                                Class cls35 = (Class) removeParam.initialize(86 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28641), 3316 - Process.getGidForName(""));
                                                                byte[] bArr21 = $$a;
                                                                byte b42 = (byte) (-bArr21[24]);
                                                                byte b43 = bArr21[19];
                                                                Object[] objArr141 = new Object[1];
                                                                e(b42, b43, (byte) (b43 | 25), objArr141);
                                                                Method method32 = cls35.getMethod((String) objArr141[0], cls, cls, cls);
                                                                map19.put(-1544987438, method32);
                                                                obj18 = method32;
                                                            }
                                                            ((int[]) objArr139[c2])[0] = ((Integer) ((Method) obj18).invoke(null, objArr140)).intValue();
                                                            return objArr139;
                                                        }
                                                        objArr4 = new Object[5];
                                                        objArr4[0] = new int[]{i};
                                                        objArr4[1] = new int[]{m14};
                                                        objArr4[c2] = new int[1];
                                                        objArr4[2] = null;
                                                        objArr4[3] = null;
                                                        Object[] objArr142 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 977996180)) | (~((-99227291) | i)) | 94377482) * 623) + ((i18 | 973146372) * (-623)) + (((~((-94377483) | i)) * 623) - 1205571948))};
                                                        Object obj71 = map19.get(-1544987438);
                                                        if (obj71 != null) {
                                                            obj19 = obj71;
                                                        } else {
                                                            Class cls36 = (Class) removeParam.initialize(86 - View.combineMeasuredStates(0, 0), (char) (28642 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3317 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                            byte[] bArr22 = $$a;
                                                            byte b44 = (byte) (-bArr22[24]);
                                                            byte b45 = bArr22[19];
                                                            Object[] objArr143 = new Object[1];
                                                            e(b44, b45, (byte) (b45 | 25), objArr143);
                                                            Method method33 = cls36.getMethod((String) objArr143[0], cls, cls, cls);
                                                            map19.put(-1544987438, method33);
                                                            obj19 = method33;
                                                        }
                                                        ((int[]) objArr4[c2])[0] = ((Integer) ((Method) obj19).invoke(null, objArr142)).intValue();
                                                    }
                                                }
                                                i25 = i;
                                                if (i25 == i) {
                                                }
                                            }
                                        }
                                        Object[] objArr144 = new Object[1];
                                        d(23 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (52987 - (Process.myPid() >> 22)), 455 - TextUtils.lastIndexOf("", '0', 0), objArr144);
                                        String intern41 = ((String) objArr144[0]).intern();
                                        Object[] objArr145 = new Object[1];
                                        d(TextUtils.indexOf((CharSequence) "", '0', 0) + 11, (char) TextUtils.getCapsMode("", 0, 0), 511 - (KeyEvent.getMaxKeyCode() >> 16), objArr145);
                                        String intern42 = ((String) objArr145[0]).intern();
                                        Object[] objArr146 = new Object[1];
                                        d(7 - View.resolveSizeAndState(0, 0, 0), (char) (8261 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 521, objArr146);
                                        String intern43 = ((String) objArr146[0]).intern();
                                        Object[] objArr147 = new Object[1];
                                        d((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (char) (ViewConfiguration.getTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 528, objArr147);
                                        String[] strArr18 = {intern41, intern42, intern43, ((String) objArr147[0]).intern()};
                                        Object[] objArr148 = new Object[1];
                                        d((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, (char) (TextUtils.getOffsetAfter("", 0) + 50395), 536 - (ViewConfiguration.getTapTimeout() >> 16), objArr148);
                                        String intern44 = ((String) objArr148[0]).intern();
                                        Object[] objArr149 = new Object[1];
                                        d(View.MeasureSpec.getSize(0) + 7, (char) (View.combineMeasuredStates(0, 0) + 32459), KeyEvent.keyCodeFromString("") + 553, objArr149);
                                        String intern45 = ((String) objArr149[0]).intern();
                                        Object[] objArr150 = new Object[1];
                                        d(6 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.getOffsetAfter("", 0) + 30490), 560 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr150);
                                        String intern46 = ((String) objArr150[0]).intern();
                                        Object[] objArr151 = new Object[1];
                                        d(11 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.myPid() >> 22) + 31996), View.MeasureSpec.getMode(0) + 567, objArr151);
                                        String intern47 = ((String) objArr151[0]).intern();
                                        Object[] objArr152 = new Object[1];
                                        d(15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 48128), 578 - TextUtils.indexOf("", ""), objArr152);
                                        String[] strArr19 = {intern44, intern45, intern46, intern47, ((String) objArr152[0]).intern()};
                                        Object[] objArr153 = new Object[1];
                                        d(15 - TextUtils.indexOf((CharSequence) "", '0'), (char) (26775 - View.MeasureSpec.getSize(0)), 592 - Color.blue(0), objArr153);
                                        String intern48 = ((String) objArr153[0]).intern();
                                        Object[] objArr154 = new Object[1];
                                        d(2 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getTrimmedLength(""), 608 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr154);
                                        String intern49 = ((String) objArr154[0]).intern();
                                        Object[] objArr155 = new Object[1];
                                        d(TextUtils.lastIndexOf("", '0', 0, 0) + 23, (char) (Color.rgb(0, 0, 0) + 16826044), 619 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr155);
                                        String intern50 = ((String) objArr155[0]).intern();
                                        Object[] objArr156 = new Object[1];
                                        d(26 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 640, objArr156);
                                        String intern51 = ((String) objArr156[0]).intern();
                                        Object[] objArr157 = new Object[1];
                                        d(TextUtils.getTrimmedLength("") + 28, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 666 - View.resolveSize(0, 0), objArr157);
                                        cls2 = String.class;
                                        c2 = 4;
                                        String[] strArr20 = {intern48, intern49, intern2, intern50, intern51, ((String) objArr157[0]).intern()};
                                        Object[] objArr158 = new Object[1];
                                        d(10 - ExpandableListView.getPackedPositionChild(0L), (char) View.MeasureSpec.getMode(0), 693 - Process.getGidForName(""), objArr158);
                                        String intern52 = ((String) objArr158[0]).intern();
                                        Object[] objArr159 = new Object[1];
                                        d(7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 705 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr159);
                                        String intern53 = ((String) objArr159[0]).intern();
                                        Object[] objArr160 = new Object[1];
                                        d(7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), 713 - (KeyEvent.getMaxKeyCode() >> 16), objArr160);
                                        String intern54 = ((String) objArr160[0]).intern();
                                        Object[] objArr161 = new Object[1];
                                        d(6 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 23664), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 719, objArr161);
                                        String[] strArr21 = {intern52, intern53, intern54, ((String) objArr161[0]).intern()};
                                        Object[] objArr162 = new Object[1];
                                        d((ViewConfiguration.getLongPressTimeout() >> 16) + 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24538), Drawable.resolveOpacity(0, 0) + 725, objArr162);
                                        String intern55 = ((String) objArr162[0]).intern();
                                        Object[] objArr163 = new Object[1];
                                        d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, (char) (30490 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTouchSlop() >> 8) + 560, objArr163);
                                        String intern56 = ((String) objArr163[0]).intern();
                                        Object[] objArr164 = new Object[1];
                                        d(9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 528 - Color.argb(0, 0, 0, 0), objArr164);
                                        String[] strArr22 = {intern55, intern56, ((String) objArr164[0]).intern()};
                                        Object[] objArr165 = new Object[1];
                                        d(13 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 2446), KeyEvent.getDeadChar(0, 0) + 741, objArr165);
                                        String intern57 = ((String) objArr165[0]).intern();
                                        Object[] objArr166 = new Object[1];
                                        d(Color.green(0) + 1, (char) (TextUtils.getOffsetBefore("", 0) + 37652), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 754, objArr166);
                                        String[] strArr23 = {intern57, ((String) objArr166[0]).intern()};
                                        Object[] objArr167 = new Object[1];
                                        d(9 - TextUtils.indexOf("", "", 0, 0), (char) (AndroidCharacter.getMirror('0') + 19833), 756 - KeyEvent.getDeadChar(0, 0), objArr167);
                                        String intern58 = ((String) objArr167[0]).intern();
                                        Object[] objArr168 = new Object[1];
                                        d(1 - View.resolveSizeAndState(0, 0, 0), (char) (56432 - TextUtils.getCapsMode("", 0, 0)), KeyEvent.getDeadChar(0, 0) + 765, objArr168);
                                        String[] strArr24 = {intern58, ((String) objArr168[0]).intern()};
                                        Object[] objArr169 = new Object[1];
                                        d(16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (3453 - Color.blue(0)), ExpandableListView.getPackedPositionGroup(0L) + 766, objArr169);
                                        String intern59 = ((String) objArr169[0]).intern();
                                        Object[] objArr170 = new Object[1];
                                        d(3 - KeyEvent.normalizeMetaState(0), (char) KeyEvent.getDeadChar(0, 0), 607 - Process.getGidForName(""), objArr170);
                                        String intern60 = ((String) objArr170[0]).intern();
                                        Object[] objArr171 = new Object[1];
                                        d(8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (32459 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.alpha(0) + 553, objArr171);
                                        String intern61 = ((String) objArr171[0]).intern();
                                        Object[] objArr172 = new Object[1];
                                        d((ViewConfiguration.getJumpTapTimeout() >> 16) + 8, (char) (135 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 782, objArr172);
                                        String intern62 = ((String) objArr172[0]).intern();
                                        Object[] objArr173 = new Object[1];
                                        d(Drawable.resolveOpacity(0, 0) + 11, (char) (Color.alpha(0) + 31996), 567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr173);
                                        String intern63 = ((String) objArr173[0]).intern();
                                        Object[] objArr174 = new Object[1];
                                        d(14 - (ViewConfiguration.getTapTimeout() >> 16), (char) (48129 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 578 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr174);
                                        String[] strArr25 = {intern59, intern60, intern61, intern62, intern63, ((String) objArr174[0]).intern()};
                                        Object[] objArr175 = new Object[1];
                                        d((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, (char) Gravity.getAbsoluteGravity(0, 0), 790 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr175);
                                        String intern64 = ((String) objArr175[0]).intern();
                                        Object[] objArr176 = new Object[1];
                                        d(18 - TextUtils.lastIndexOf("", '0'), (char) (49099 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 810 - (KeyEvent.getMaxKeyCode() >> 16), objArr176);
                                        String intern65 = ((String) objArr176[0]).intern();
                                        Object[] objArr177 = new Object[1];
                                        d(TextUtils.indexOf((CharSequence) "", '0') + 32, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 52981), MotionEvent.axisFromString("") + 830, objArr177);
                                        String intern66 = ((String) objArr177[0]).intern();
                                        Object[] objArr178 = new Object[1];
                                        d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 861, objArr178);
                                        String intern67 = ((String) objArr178[0]).intern();
                                        Object[] objArr179 = new Object[1];
                                        d((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 886, objArr179);
                                        String intern68 = ((String) objArr179[0]).intern();
                                        Object[] objArr180 = new Object[1];
                                        d(32 - ImageFormat.getBitsPerPixel(0), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 909, objArr180);
                                        String[] strArr26 = {intern64, intern65, intern66, intern67, intern68, ((String) objArr180[0]).intern(), intern2};
                                        Object[] objArr181 = new Object[1];
                                        d(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 942, objArr181);
                                        String intern69 = ((String) objArr181[0]).intern();
                                        Object[] objArr182 = new Object[1];
                                        d(7 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (8261 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 521 - ExpandableListView.getPackedPositionGroup(0L), objArr182);
                                        String[] strArr27 = {intern69, ((String) objArr182[0]).intern()};
                                        Object[] objArr183 = new Object[1];
                                        d(30 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (51599 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), 955 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr183);
                                        String intern70 = ((String) objArr183[0]).intern();
                                        Object[] objArr184 = new Object[1];
                                        d((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, (char) (37195 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 985 - TextUtils.getTrimmedLength(""), objArr184);
                                        String[] strArr28 = {intern70, ((String) objArr184[0]).intern()};
                                        Object[] objArr185 = new Object[1];
                                        d(19 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (12841 - ExpandableListView.getPackedPositionType(0L)), 996 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr185);
                                        String intern71 = ((String) objArr185[0]).intern();
                                        Object[] objArr186 = new Object[1];
                                        d(TextUtils.lastIndexOf("", '0', 0) + 6, (char) (ImageFormat.getBitsPerPixel(0) + 47763), 1015 - Gravity.getAbsoluteGravity(0, 0), objArr186);
                                        String[] strArr29 = {intern71, ((String) objArr186[0]).intern()};
                                        Object[] objArr187 = new Object[1];
                                        d(19 - (KeyEvent.getMaxKeyCode() >> 16), (char) (59938 - Color.green(0)), 1020 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr187);
                                        String[] strArr30 = {((String) objArr187[0]).intern()};
                                        Object[] objArr188 = new Object[1];
                                        d(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 1039 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr188);
                                        String[] strArr31 = {((String) objArr188[0]).intern()};
                                        Object[] objArr189 = new Object[1];
                                        d((ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1056, objArr189);
                                        String[] strArr32 = {((String) objArr189[0]).intern()};
                                        Object[] objArr190 = new Object[1];
                                        d((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, (char) (Color.green(0) + 45666), (ViewConfiguration.getPressedStateDuration() >> 16) + 1074, objArr190);
                                        String[] strArr33 = {((String) objArr190[0]).intern()};
                                        Object[] objArr191 = new Object[1];
                                        d(View.getDefaultSize(0, 0) + 23, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63978), 1093 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr191);
                                        String[] strArr34 = {((String) objArr191[0]).intern()};
                                        Object[] objArr192 = new Object[1];
                                        d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21, (char) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 41586), TextUtils.indexOf((CharSequence) "", '0', 0) + 1117, objArr192);
                                        String[] strArr35 = {((String) objArr192[0]).intern()};
                                        Object[] objArr193 = new Object[1];
                                        d(KeyEvent.keyCodeFromString("") + 24, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1137 - ((Process.getThreadPriority(0) + 20) >> 6), objArr193);
                                        String[] strArr36 = {((String) objArr193[0]).intern(), intern2};
                                        Object[] objArr194 = new Object[1];
                                        d((ViewConfiguration.getScrollBarSize() >> 8) + 28, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37799), 1160 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr194);
                                        String[] strArr37 = {((String) objArr194[0]).intern(), intern2};
                                        char c5 = 0;
                                        Object[] objArr195 = new Object[1];
                                        d((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, (char) (KeyEvent.keyCodeFromString("") + 30471), View.MeasureSpec.getMode(0) + 1189, objArr195);
                                        String[] strArr38 = {((String) objArr195[0]).intern(), intern2};
                                        Object[] objArr196 = new Object[1];
                                        d(Color.rgb(0, 0, 0) + 16777247, (char) (44598 - KeyEvent.getDeadChar(0, 0)), 1216 - TextUtils.indexOf("", "", 0, 0), objArr196);
                                        String[] strArr39 = {((String) objArr196[0]).intern(), intern2};
                                        Object[] objArr197 = new Object[1];
                                        d(27 - (Process.myTid() >> 22), (char) View.MeasureSpec.getMode(0), 1247 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr197);
                                        String[] strArr40 = {((String) objArr197[0]).intern(), intern2};
                                        Object[] objArr198 = new Object[1];
                                        d(Drawable.resolveOpacity(0, 0) + 32, (char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 1275, objArr198);
                                        String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new String[]{((String) objArr198[0]).intern(), intern2}};
                                        ArrayList arrayList = new ArrayList();
                                        int i78 = 24;
                                        int i79 = i;
                                        int i80 = 0;
                                        int i81 = 0;
                                        while (i80 < i78) {
                                            String[] strArr42 = strArr41[i80];
                                            Object[] objArr199 = {strArr42[c5]};
                                            Map map20 = removeParam.visaSchemeConfiguration;
                                            Object obj72 = map20.get(Integer.valueOf(i17));
                                            if (obj72 != null) {
                                                strArr = strArr41;
                                                i19 = i12;
                                                i20 = i80;
                                                i21 = i79;
                                                obj12 = obj72;
                                            } else {
                                                strArr = strArr41;
                                                Class cls37 = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 47, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2248);
                                                byte[] bArr23 = $$a;
                                                byte b46 = bArr23[19];
                                                i19 = i12;
                                                i20 = i80;
                                                i21 = i79;
                                                Object[] objArr200 = new Object[1];
                                                e(b46, (byte) (b46 | 37), (byte) (-bArr23[23]), objArr200);
                                                Method method34 = cls37.getMethod((String) objArr200[0], cls2);
                                                map20.put(Integer.valueOf(i17), method34);
                                                obj12 = method34;
                                            }
                                            String str7 = (String) ((Method) obj12).invoke(null, objArr199);
                                            String[] strArr43 = (String[]) Arrays.copyOfRange(strArr42, 1, strArr42.length);
                                            if (str7 != null && str7.length() != 0) {
                                                if (strArr42.length != 1) {
                                                    Object[] objArr201 = {str7, strArr43};
                                                    Object obj73 = map20.get(-140597324);
                                                    if (obj73 != null) {
                                                        obj13 = obj73;
                                                    } else {
                                                        Class cls38 = (Class) removeParam.initialize(Color.red(0) + 48, (char) ((-16777216) - Color.rgb(0, 0, 0)), Color.blue(0) + 2295);
                                                        byte b47 = (byte) (-$$a[23]);
                                                        Object[] objArr202 = new Object[1];
                                                        e(b47, (byte) (b47 | 18), (byte) $$b, objArr202);
                                                        Method method35 = cls38.getMethod((String) objArr202[0], cls2, String[].class);
                                                        map20.put(-140597324, method35);
                                                        obj13 = method35;
                                                    }
                                                    long j26 = (((-345600570) | j9) * (-859)) + (((-858) * r11) - 297216490200L);
                                                    long longValue14 = ((Long) ((Method) obj13).invoke(null, objArr201)).longValue() ^ (-1);
                                                    long m15 = SVG$Unit$EnumUnboxingLocalUtility.m(859L, ((longValue14 | j10) ^ (-1)) | ((longValue14 | (-345600570)) ^ (-1)), ((((j10 | (-345600570)) ^ (-1)) | (((345600569 | longValue14) | j9) ^ (-1))) * 859) + j26, -447013753L);
                                                }
                                                i81++;
                                                i79 = i ^ (i20 + 10);
                                                StringBuilder m16 = Boxes$$ExternalSyntheticOutline1.m(str7);
                                                Object[] objArr203 = new Object[1];
                                                d(Color.red(0) + 1, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1305, objArr203);
                                                m16.append(((String) objArr203[0]).intern());
                                                m16.append(str7);
                                                arrayList.add(m16.toString());
                                                i80 = i20 + 1;
                                                i12 = i19;
                                                strArr41 = strArr;
                                                i78 = 24;
                                                c5 = 0;
                                            }
                                            i79 = i21;
                                            i80 = i20 + 1;
                                            i12 = i19;
                                            strArr41 = strArr;
                                            i78 = 24;
                                            c5 = 0;
                                        }
                                        i18 = i12;
                                        int i82 = i79;
                                        if (i81 > 2) {
                                            ThreeDS2ServiceInstance = (getWarnings + 115) % 128;
                                            objArr3 = new Object[]{new int[]{i}, new int[]{i82}, arrayList, null, new int[1]};
                                            Object[] objArr204 = {num, num, Integer.valueOf(((835660194 | i) * 104) + ((~(i18 | 1072693166)) * (-104)) + (((~((-241563277) | i)) | 4530304) * 104) + 715132286)};
                                            Map map21 = removeParam.visaSchemeConfiguration;
                                            Object obj74 = map21.get(-1544987438);
                                            if (obj74 != null) {
                                                obj11 = obj74;
                                            } else {
                                                Class cls39 = (Class) removeParam.initialize(85 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((Process.myPid() >> 22) + 28641), 3317 - Color.blue(0));
                                                byte[] bArr24 = $$a;
                                                byte b48 = (byte) (-bArr24[24]);
                                                byte b49 = bArr24[19];
                                                Object[] objArr205 = new Object[1];
                                                e(b48, b49, (byte) (b49 | 25), objArr205);
                                                Method method36 = cls39.getMethod((String) objArr205[0], cls, cls, cls);
                                                map21.put(-1544987438, method36);
                                                obj11 = method36;
                                            }
                                            ((int[]) objArr3[4])[0] = ((Integer) ((Method) obj11).invoke(null, objArr204)).intValue();
                                            c3 = 0;
                                        } else {
                                            objArr3 = new Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                            Object[] objArr206 = {num, num, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m(~((-4194370) | i18), -948, (((~((-6362446) | i)) | (-1070861026)) * (-948)) + 1249884190, -2055336996))};
                                            Map map22 = removeParam.visaSchemeConfiguration;
                                            Object obj75 = map22.get(-1544987438);
                                            if (obj75 != null) {
                                                obj9 = obj75;
                                            } else {
                                                Class cls40 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 86, (char) (TextUtils.getCapsMode("", 0, 0) + 28641), View.MeasureSpec.getSize(0) + 3317);
                                                byte[] bArr25 = $$a;
                                                byte b50 = (byte) (-bArr25[24]);
                                                byte b51 = bArr25[19];
                                                Object[] objArr207 = new Object[1];
                                                e(b50, b51, (byte) (b51 | 25), objArr207);
                                                Method method37 = cls40.getMethod((String) objArr207[0], cls, cls, cls);
                                                map22.put(-1544987438, method37);
                                                obj9 = method37;
                                            }
                                            c3 = 0;
                                            ((int[]) objArr3[4])[0] = ((Integer) ((Method) obj9).invoke(null, objArr206)).intValue();
                                        }
                                        int i83 = ((int[]) objArr3[1])[c3];
                                        if (i83 != i) {
                                            objArr4 = new Object[5];
                                            int[] iArr5 = new int[1];
                                            objArr4[c3] = iArr5;
                                            int[] iArr6 = new int[1];
                                            objArr4[1] = iArr6;
                                            objArr4[4] = new int[1];
                                            List list = (List) objArr3[2];
                                            iArr5[c3] = i;
                                            iArr6[c3] = i83;
                                            objArr4[2] = list;
                                            objArr4[3] = null;
                                            Object[] objArr208 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-680071740))) | (~(i18 | 397151731))) * 333) + (((~((-680071740) | i18)) | (~(i | 397151731))) * 333) + 1354141651)};
                                            Map map23 = removeParam.visaSchemeConfiguration;
                                            Object obj76 = map23.get(-1544987438);
                                            if (obj76 != null) {
                                                obj10 = obj76;
                                            } else {
                                                Class cls41 = (Class) removeParam.initialize((Process.myTid() >> 22) + 86, (char) (28642 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 3316 - Process.getGidForName(""));
                                                byte[] bArr26 = $$a;
                                                byte b52 = (byte) (-bArr26[24]);
                                                byte b53 = bArr26[19];
                                                Object[] objArr209 = new Object[1];
                                                e(b52, b53, (byte) (b53 | 25), objArr209);
                                                Method method38 = cls41.getMethod((String) objArr209[0], cls, cls, cls);
                                                map23.put(-1544987438, method38);
                                                obj10 = method38;
                                            }
                                            ((int[]) objArr4[4])[0] = ((Integer) ((Method) obj10).invoke(null, objArr208)).intValue();
                                        }
                                        Object[] objArr822 = new Object[1];
                                        d(16 - Color.red(0), (char) (26776 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 592, objArr822);
                                        Object[] objArr832 = {((String) objArr822[0]).intern()};
                                        Map map132 = removeParam.visaSchemeConfiguration;
                                        obj14 = map132.get(Integer.valueOf(i17));
                                        if (obj14 == null) {
                                        }
                                        invoke = ((Method) obj15).invoke(null, objArr832);
                                        if (invoke != null) {
                                        }
                                        if (i22 != 1986687685) {
                                            Object[] objArr872 = new Object[1];
                                            d(14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5738), (ViewConfiguration.getScrollBarSize() >> 8) + 1307, objArr872);
                                            String intern162 = ((String) objArr872[0]).intern();
                                            Object[] objArr882 = new Object[1];
                                            d(26 - Color.green(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 49007), 1321 - ((Process.getThreadPriority(0) + 20) >> 6), objArr882);
                                            String intern172 = ((String) objArr882[0]).intern();
                                            Object[] objArr892 = new Object[1];
                                            d((ViewConfiguration.getFadingEdgeLength() >> 16) + 17, (char) (61666 - TextUtils.lastIndexOf("", '0', 0, 0)), 1348 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr892);
                                            String intern182 = ((String) objArr892[0]).intern();
                                            Object[] objArr902 = new Object[1];
                                            d(17 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.argb(0, 0, 0, 0) + 1364, objArr902);
                                            String intern192 = ((String) objArr902[0]).intern();
                                            Object[] objArr912 = new Object[1];
                                            d(Process.getGidForName("") + 16, (char) (34245 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1380, objArr912);
                                            String intern202 = ((String) objArr912[0]).intern();
                                            Object[] objArr922 = new Object[1];
                                            d(TextUtils.indexOf("", "", 0, 0) + 37, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1396 - View.MeasureSpec.getMode(0), objArr922);
                                            String intern212 = ((String) objArr922[0]).intern();
                                            Object[] objArr932 = new Object[1];
                                            d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53113), AndroidCharacter.getMirror('0') + 1385, objArr932);
                                            String intern222 = ((String) objArr932[0]).intern();
                                            Object[] objArr942 = new Object[1];
                                            d(12 - MotionEvent.axisFromString(""), (char) (46916 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 1445 - (ViewConfiguration.getEdgeSlop() >> 16), objArr942);
                                            String intern232 = ((String) objArr942[0]).intern();
                                            Object[] objArr952 = new Object[1];
                                            d(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 42918), 1458 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr952);
                                            String intern242 = ((String) objArr952[0]).intern();
                                            Object[] objArr962 = new Object[1];
                                            d(32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (Process.myTid() >> 22) + 1480, objArr962);
                                            String intern252 = ((String) objArr962[0]).intern();
                                            Object[] objArr972 = new Object[1];
                                            d((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12, (char) View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1511, objArr972);
                                            String intern262 = ((String) objArr972[0]).intern();
                                            Object[] objArr982 = new Object[1];
                                            d(12 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (64344 - MotionEvent.axisFromString("")), 1523 - ((Process.getThreadPriority(0) + 20) >> 6), objArr982);
                                            String intern272 = ((String) objArr982[0]).intern();
                                            Object[] objArr992 = new Object[1];
                                            d(13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((Process.myPid() >> 22) + 17118), 1536 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr992);
                                            String intern282 = ((String) objArr992[0]).intern();
                                            Object[] objArr1002 = new Object[1];
                                            d((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11, (char) (20425 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0, 0) + 1547, objArr1002);
                                            String intern292 = ((String) objArr1002[0]).intern();
                                            Object[] objArr1012 = new Object[1];
                                            d(12 - View.getDefaultSize(0, 0), (char) Color.alpha(0), 1559 - (ViewConfiguration.getTouchSlop() >> 8), objArr1012);
                                            String intern302 = ((String) objArr1012[0]).intern();
                                            Object[] objArr1022 = new Object[1];
                                            d(14 - (Process.myPid() >> 22), (char) (6267 - View.MeasureSpec.getSize(0)), 1571 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr1022);
                                            String intern312 = ((String) objArr1022[0]).intern();
                                            Object[] objArr1032 = new Object[1];
                                            d(TextUtils.indexOf("", "", 0) + 12, (char) (6807 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), Process.getGidForName("") + 1586, objArr1032);
                                            String intern322 = ((String) objArr1032[0]).intern();
                                            Object[] objArr1042 = new Object[1];
                                            d((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2662), 1598 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr1042);
                                            String intern332 = ((String) objArr1042[0]).intern();
                                            Object[] objArr1052 = new Object[1];
                                            d(28 - TextUtils.getTrimmedLength(""), (char) (50943 - TextUtils.indexOf("", "", 0, 0)), 1622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr1052);
                                            String[] strArr102 = {intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, ((String) objArr1052[0]).intern()};
                                            i30 = 19;
                                            i31 = 0;
                                            while (true) {
                                                if (i31 < i30) {
                                                }
                                                i31++;
                                                i30 = 19;
                                            }
                                            if (i31 >= 0) {
                                                Object[] objArr1112 = new Object[5];
                                                objArr1112[0] = new int[]{i};
                                                objArr1112[1] = new int[]{i32};
                                                objArr1112[c2] = new int[1];
                                                objArr1112[2] = null;
                                                objArr1112[3] = null;
                                                Object[] objArr1122 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-824181313))) | 243326350) * 366) + ((((~((-829039217) | i)) | 248184254) * (-366)) - 1439750962))};
                                                Map map152 = removeParam.visaSchemeConfiguration;
                                                obj22 = map152.get(-1544987438);
                                                if (obj22 == null) {
                                                }
                                                ((int[]) objArr1112[c2])[0] = ((Integer) ((Method) obj23).invoke(null, objArr1122)).intValue();
                                                return objArr1112;
                                            }
                                        }
                                        Object[] objArr1142 = new Object[1];
                                        d(13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1649 - (ViewConfiguration.getTouchSlop() >> 8), objArr1142);
                                        String intern342 = ((String) objArr1142[0]).intern();
                                        Object[] objArr1152 = new Object[1];
                                        d(5 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 41309), 1662 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr1152);
                                        String[] strArr112 = {intern342, ((String) objArr1152[0]).intern()};
                                        Object[] objArr1162 = new Object[1];
                                        d(15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40863), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1666, objArr1162);
                                        String intern352 = ((String) objArr1162[0]).intern();
                                        Object[] objArr1172 = new Object[1];
                                        d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, (char) (16320 - TextUtils.indexOf("", "", 0, 0)), 1682 - Color.green(0), objArr1172);
                                        String intern362 = ((String) objArr1172[0]).intern();
                                        Object[] objArr1182 = new Object[1];
                                        d((ViewConfiguration.getTouchSlop() >> 8) + 14, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1702, objArr1182);
                                        String[] strArr122 = {intern352, intern362, ((String) objArr1182[0]).intern()};
                                        Object[] objArr1192 = new Object[1];
                                        d(21 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1715 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr1192);
                                        String intern372 = ((String) objArr1192[0]).intern();
                                        Object[] objArr1202 = new Object[1];
                                        d(10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 7421), 1735 - TextUtils.lastIndexOf("", '0'), objArr1202);
                                        String[] strArr132 = {intern372, ((String) objArr1202[0]).intern()};
                                        Object[] objArr1212 = new Object[1];
                                        d(Gravity.getAbsoluteGravity(0, 0) + 11, (char) (61862 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1746, objArr1212);
                                        String intern382 = ((String) objArr1212[0]).intern();
                                        Object[] objArr1222 = new Object[1];
                                        d((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, (char) (11275 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 484, objArr1222);
                                        String[] strArr142 = {intern382, ((String) objArr1222[0]).intern()};
                                        Object[] objArr1232 = new Object[1];
                                        d(28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (TextUtils.getCapsMode("", 0, 0) + 7075), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1757, objArr1232);
                                        String intern392 = ((String) objArr1232[0]).intern();
                                        Object[] objArr1242 = new Object[1];
                                        d(10 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (7421 - (Process.myPid() >> 22)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1735, objArr1242);
                                        String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new String[]{intern392, ((String) objArr1242[0]).intern()}};
                                        i23 = 0;
                                        while (true) {
                                            if (i23 < 5) {
                                            }
                                            i23++;
                                            i46 = i26;
                                        }
                                        if (i24 == i) {
                                        }
                                    }
                                }
                                Object[] objArr210 = new Object[1];
                                d(ExpandableListView.getPackedPositionType(0L) + 13, (char) (37234 - Process.getGidForName("")), ExpandableListView.getPackedPositionType(0L) + 489, objArr210);
                                String intern72 = ((String) objArr210[0]).intern();
                                Object[] objArr211 = new Object[1];
                                d(KeyEvent.getDeadChar(0, 0) + 9, (char) (ExpandableListView.getPackedPositionType(0L) + 10369), 502 - TextUtils.indexOf("", ""), objArr211);
                                Object[] objArr212 = {intern72, ((String) objArr211[0]).intern()};
                                Map map24 = removeParam.visaSchemeConfiguration;
                                Object obj77 = map24.get(Integer.valueOf(i9));
                                if (obj77 != null) {
                                    obj5 = obj77;
                                } else {
                                    Class cls42 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 49, (char) ((-1) - MotionEvent.axisFromString("")), ((byte) KeyEvent.getModifierMetaStateMask()) + PnmConstants.PPM_TEXT_CODE);
                                    byte b54 = (byte) (-$$a[23]);
                                    Object[] objArr213 = new Object[1];
                                    e(b54, (byte) (b54 | 18), (byte) $$b, objArr213);
                                    Method method39 = cls42.getMethod((String) objArr213[0], String.class, String.class);
                                    map24.put(Integer.valueOf(i9), method39);
                                    obj5 = method39;
                                }
                                long longValue15 = ((Long) ((Method) obj5).invoke(null, objArr212)).longValue();
                                long j27 = ((((1200730652 | longValue15) | j9) ^ (-1)) * (-301)) + ((302 * longValue15) - 360219195600L);
                                long j28 = longValue15 ^ (-1);
                                long m17 = SVG$Unit$EnumUnboxingLocalUtility.m(301L, j28 | (((-1200730653) | j9) ^ (-1)), ((-301) * (((j28 | j9) ^ (-1)) | ((j10 | 1200730652) ^ (-1)))) + j27, 384957196L);
                                int i84 = ~((-883941664) | i12);
                                int i85 = ~((-553284748) | i);
                                i16 = ((int) ((long) ((((int) m17) & (((1891684679 | i) * 104) + (((~(2043992399 | i12)) * (-104)) + ((((~((-966056207) | i)) | 813748486) * 104) + 2005432269)))) | (((int) (m17 >> 32)) & ((((~((-883941664) | i)) | (~(883941663 | i12))) * 575) + (((i85 | (~(553284747 | i12))) * (-575)) + (((i84 | i85) * 1150) + (-334238508)))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                                if (i16 == i) {
                                }
                            }
                            return objArr4;
                        }
                    }
                }
                i15 = i;
                if (i15 == i) {
                }
            }
        }
        i14 = i;
        if (i14 == i) {
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public void initialize(nq nqVar, setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        getWarnings = (ThreeDS2ServiceInstance + 3) % 128;
        Object[] objArr = new Object[1];
        d(View.getDefaultSize(0, 0) + 17, (char) (Drawable.resolveOpacity(0, 0) + 36673), TextUtils.indexOf("", "", 0, 0), objArr);
        threeDS2ServiceInstance.mastercardSchemeConfiguration(nqVar.initialize(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        d(17 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, objArr2);
        threeDS2ServiceInstance.ThreeDS2Service((putAll) nqVar.ThreeDS2Service(((String) objArr2[0]).intern(), putAll.class));
        Object[] objArr3 = new Object[1];
        d((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 17, (char) (14076 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 34, objArr3);
        threeDS2ServiceInstance.build(nqVar.initialize(((String) objArr3[0]).intern()));
        Object[] objArr4 = new Object[1];
        d((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, (char) (Color.red(0) + 23283), 51 - View.resolveSizeAndState(0, 0, 0), objArr4);
        threeDS2ServiceInstance.SchemeConfiguration(nqVar.initialize(((String) objArr4[0]).intern()));
        setNavigationContentDescription setnavigationcontentdescription = this.ThreeDS2Service;
        Object[] objArr5 = new Object[1];
        d(16 - MotionEvent.axisFromString(""), (char) (64461 - AndroidCharacter.getMirror('0')), KeyEvent.normalizeMetaState(0) + 72, objArr5);
        threeDS2ServiceInstance.getWarnings(setnavigationcontentdescription.initialize(nqVar.getSDKVersion(((String) objArr5[0]).intern())));
        setNavigationContentDescription setnavigationcontentdescription2 = this.ThreeDS2Service;
        Object[] objArr6 = new Object[1];
        d(20 - TextUtils.indexOf("", "", 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 89 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
        threeDS2ServiceInstance.initialize(setnavigationcontentdescription2.initialize(nqVar.getSDKVersion(((String) objArr6[0]).intern())));
        Object[] objArr7 = new Object[1];
        d(Color.alpha(0) + 17, (char) (View.MeasureSpec.getMode(0) + 60346), 109 - TextUtils.indexOf("", "", 0, 0), objArr7);
        threeDS2ServiceInstance.cbConfiguration(nqVar.initialize(((String) objArr7[0]).intern()));
        Object[] objArr8 = new Object[1];
        d(9 - ExpandableListView.getPackedPositionGroup(0L), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, objArr8);
        threeDS2ServiceInstance.getSDKVersion(nqVar.initialize(((String) objArr8[0]).intern()));
        Object[] objArr9 = new Object[1];
        d((KeyEvent.getMaxKeyCode() >> 16) + 11, (char) (20340 - TextUtils.lastIndexOf("", '0', 0)), 135 - Color.red(0), objArr9);
        threeDS2ServiceInstance.createTransaction(nqVar.initialize(((String) objArr9[0]).intern()));
        int i = ThreeDS2ServiceInstance + 79;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public put initialize() {
        int i = getWarnings + 91;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return put.ThreeDS2Service;
        }
        put putVar = put.ThreeDS2ServiceInstance;
        throw null;
    }
}
