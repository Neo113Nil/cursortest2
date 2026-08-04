package com.gamericefishpro.space.i2;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.d5;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.vb.c {
    public final /* synthetic */ int v;
    public final /* synthetic */ com.gamericefishpro.space.d4.b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.gamericefishpro.space.d4.b bVar, int i) {
        super(9);
        this.v = i;
        this.w = bVar;
    }

    @Override // com.gamericefishpro.space.vb.c
    public void h(int i, com.gamericefishpro.space.e4.h hVar, String str, Bundle bundle) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((z) this.w).j(i, hVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:110:0x0221  */
    /* JADX WARN: Code duplicated, block: B:113:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x0239  */
    /* JADX WARN: Code duplicated, block: B:119:0x0243  */
    /* JADX WARN: Code duplicated, block: B:122:0x0252  */
    /* JADX WARN: Code duplicated, block: B:124:0x026c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0275  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0307  */
    /* JADX WARN: Code duplicated, block: B:148:0x030a  */
    /* JADX WARN: Code duplicated, block: B:150:0x030e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0310  */
    /* JADX WARN: Code duplicated, block: B:153:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0319  */
    /* JADX WARN: Code duplicated, block: B:157:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x031d  */
    /* JADX WARN: Code duplicated, block: B:159:0x031f  */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0330  */
    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x0357  */
    /* JADX WARN: Code duplicated, block: B:175:0x038c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0395  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e3 A[LOOP:3: B:188:0x03cf->B:191:0x03e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x0402  */
    /* JADX WARN: Code duplicated, block: B:198:0x0412  */
    /* JADX WARN: Code duplicated, block: B:204:0x0430  */
    /* JADX WARN: Code duplicated, block: B:207:0x043e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0456  */
    /* JADX WARN: Code duplicated, block: B:213:0x0470  */
    /* JADX WARN: Code duplicated, block: B:215:0x0480  */
    /* JADX WARN: Code duplicated, block: B:221:0x049e  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:228:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:236:0x0503  */
    /* JADX WARN: Code duplicated, block: B:239:0x0511  */
    /* JADX WARN: Code duplicated, block: B:242:0x0531  */
    /* JADX WARN: Code duplicated, block: B:244:0x053d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0549  */
    /* JADX WARN: Code duplicated, block: B:250:0x0558  */
    /* JADX WARN: Code duplicated, block: B:251:0x055c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0574  */
    /* JADX WARN: Code duplicated, block: B:257:0x057a  */
    /* JADX WARN: Code duplicated, block: B:259:0x057e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0583  */
    /* JADX WARN: Code duplicated, block: B:262:0x0587  */
    /* JADX WARN: Code duplicated, block: B:266:0x0595  */
    /* JADX WARN: Code duplicated, block: B:269:0x059b  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:272:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:274:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:285:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:288:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:289:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:296:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:298:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:301:0x0606 A[LOOP:8: B:297:0x05ed->B:301:0x0606, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x060e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0619  */
    /* JADX WARN: Code duplicated, block: B:310:0x0621  */
    /* JADX WARN: Code duplicated, block: B:312:0x0625  */
    /* JADX WARN: Code duplicated, block: B:313:0x062a  */
    /* JADX WARN: Code duplicated, block: B:317:0x0636  */
    /* JADX WARN: Code duplicated, block: B:319:0x0640  */
    /* JADX WARN: Code duplicated, block: B:320:0x0646  */
    /* JADX WARN: Code duplicated, block: B:323:0x0667  */
    /* JADX WARN: Code duplicated, block: B:326:0x066d  */
    /* JADX WARN: Code duplicated, block: B:327:0x0672  */
    /* JADX WARN: Code duplicated, block: B:330:0x068c  */
    /* JADX WARN: Code duplicated, block: B:332:0x069f  */
    /* JADX WARN: Code duplicated, block: B:334:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:335:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:338:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:340:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:341:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:345:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:346:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:347:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:352:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:353:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:355:0x06fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:359:0x0705  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:362:0x070f  */
    /* JADX WARN: Code duplicated, block: B:368:0x072f  */
    /* JADX WARN: Code duplicated, block: B:370:0x0739  */
    /* JADX WARN: Code duplicated, block: B:374:0x0751  */
    /* JADX WARN: Code duplicated, block: B:377:0x0765  */
    /* JADX WARN: Code duplicated, block: B:379:0x076f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:382:0x0787  */
    /* JADX WARN: Code duplicated, block: B:385:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:388:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:390:0x07be  */
    /* JADX WARN: Code duplicated, block: B:392:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:393:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:395:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:399:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:403:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:405:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:407:0x080c  */
    /* JADX WARN: Code duplicated, block: B:408:0x080f  */
    /* JADX WARN: Code duplicated, block: B:411:0x0832  */
    /* JADX WARN: Code duplicated, block: B:415:0x083b  */
    /* JADX WARN: Code duplicated, block: B:417:0x083e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:421:0x0852  */
    /* JADX WARN: Code duplicated, block: B:423:0x085e  */
    /* JADX WARN: Code duplicated, block: B:427:0x0869  */
    /* JADX WARN: Code duplicated, block: B:429:0x0871  */
    /* JADX WARN: Code duplicated, block: B:431:0x0877  */
    /* JADX WARN: Code duplicated, block: B:439:0x0890  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:441:0x0896  */
    /* JADX WARN: Code duplicated, block: B:443:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:445:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:447:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:450:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:453:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:457:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:459:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:464:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:467:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:470:0x0919  */
    /* JADX WARN: Code duplicated, block: B:472:0x0921  */
    /* JADX WARN: Code duplicated, block: B:473:0x0927  */
    /* JADX WARN: Code duplicated, block: B:476:0x0930  */
    /* JADX WARN: Code duplicated, block: B:479:0x094e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0960  */
    /* JADX WARN: Code duplicated, block: B:486:0x0967  */
    /* JADX WARN: Code duplicated, block: B:489:0x0978  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:492:0x097f  */
    /* JADX WARN: Code duplicated, block: B:495:0x098c  */
    /* JADX WARN: Code duplicated, block: B:497:0x0998  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:500:0x099e  */
    /* JADX WARN: Code duplicated, block: B:503:0x09cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:506:0x09db  */
    /* JADX WARN: Code duplicated, block: B:508:0x09df  */
    /* JADX WARN: Code duplicated, block: B:510:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:513:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:514:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:516:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a67 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:548:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:561:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:564:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:566:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:569:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:576:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:579:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:597:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:602:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:604:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:605:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:609:0x0bde  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:612:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:616:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:620:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:623:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:625:0x0c1f  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:630:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:636:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:638:0x0c72  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:641:0x0c7f  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c9f  */
    /* JADX WARN: Code duplicated, block: B:657:0x0cb6  */
    /* JADX WARN: Code duplicated, block: B:659:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:671:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:690:0x088c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0887 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:77:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    /* JADX WARN: Instruction removed from duplicated block: B:625:0x0c1f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:657:0x0cb6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v54, types: [com.gamericefishpro.space.ph.g0] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v56, types: [com.gamericefishpro.space.ph.g0] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v58, types: [com.gamericefishpro.space.ph.g0] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.ArrayList] */
    @Override // com.gamericefishpro.space.vb.c
    public final com.gamericefishpro.space.e4.h j(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        com.gamericefishpro.space.e4.h hVar;
        int i2;
        com.gamericefishpro.space.o2.o oVarL;
        Integer numValueOf;
        int iIntValue;
        com.gamericefishpro.space.t.u uVar;
        com.gamericefishpro.space.t.s0 s0Var;
        Resources resources;
        com.gamericefishpro.space.o2.l lVar;
        com.gamericefishpro.space.t.h0 h0Var;
        Object objG;
        com.gamericefishpro.space.o2.h hVar2;
        com.gamericefishpro.space.t.s0 s0Var2;
        boolean zH;
        List listJ;
        int size;
        boolean z;
        int i3;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo;
        com.gamericefishpro.space.r2.e eVarI;
        com.gamericefishpro.space.o2.l lVar2;
        com.gamericefishpro.space.t.u uVar2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        Resources resources2;
        com.gamericefishpro.space.t.h0 h0Var2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        com.gamericefishpro.space.e4.h hVar3;
        SpannableString spannableString;
        com.gamericefishpro.space.o2.v vVar;
        com.gamericefishpro.space.t.h0 h0Var3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        String strH;
        Object objG2;
        com.gamericefishpro.space.q2.a aVar;
        Object objG3;
        Boolean bool;
        int i5;
        com.gamericefishpro.space.o2.l lVar3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        int i6;
        Object objG7;
        Integer num;
        int iIntValue2;
        com.gamericefishpro.space.o2.v vVar2;
        z zVar;
        boolean z2;
        com.gamericefishpro.space.o2.a aVar2;
        com.gamericefishpro.space.o2.a aVar3;
        com.gamericefishpro.space.o2.a aVar4;
        String strT;
        boolean z3;
        ArrayList arrayList;
        CharSequence charSequenceG;
        boolean z4;
        com.gamericefishpro.space.o2.g gVar;
        int i7;
        com.gamericefishpro.space.o2.i iVar;
        com.gamericefishpro.space.o2.i iVar2;
        CharSequence charSequence;
        boolean zC;
        int iD;
        Bundle bundle;
        t tVar;
        int iD2;
        String str3;
        com.gamericefishpro.space.e4.h hVar4;
        com.gamericefishpro.space.f3.j jVarP;
        com.gamericefishpro.space.f3.j jVarP2;
        com.gamericefishpro.space.o2.a aVar5;
        com.gamericefishpro.space.o2.a aVar6;
        com.gamericefishpro.space.o2.a aVar7;
        com.gamericefishpro.space.o2.l lVarM;
        com.gamericefishpro.space.o2.v vVar3;
        List list2;
        int size2;
        com.gamericefishpro.space.t.v vVar4;
        com.gamericefishpro.space.t.s0 s0Var3;
        boolean z5;
        com.gamericefishpro.space.t.c0 c0Var;
        int[] iArr;
        int i8;
        int[] iArrCopyOf;
        int i9;
        int i10;
        ArrayList arrayList2;
        int i11;
        Object objG8;
        boolean z6;
        Object objG9;
        Object objG10;
        boolean z7;
        com.gamericefishpro.space.h2.f0 f0Var;
        boolean z8;
        com.gamericefishpro.space.e4.d dVar;
        boolean z9;
        com.gamericefishpro.space.e4.d dVar2;
        Object objG11;
        Object objG12;
        com.gamericefishpro.space.o2.a aVar8;
        com.gamericefishpro.space.o2.v vVar5;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        com.gamericefishpro.space.o2.a aVar9;
        String str4;
        List list3;
        boolean z10;
        com.gamericefishpro.space.h2.f0 f0VarV;
        com.gamericefishpro.space.o2.l lVarX;
        boolean zA;
        Object objG13;
        com.gamericefishpro.space.o2.l lVarX2;
        boolean z11;
        Object objG14;
        com.gamericefishpro.space.o2.a aVar10;
        com.gamericefishpro.space.o2.a aVar11;
        com.gamericefishpro.space.o2.a aVar12;
        com.gamericefishpro.space.o2.a aVar13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int iD3;
        com.gamericefishpro.space.o2.o oVarL2;
        boolean zBooleanValue;
        com.gamericefishpro.space.o2.l lVar4;
        com.gamericefishpro.space.o2.v vVar6;
        boolean zBooleanValue2;
        Object objG15;
        com.gamericefishpro.space.c3.c density;
        com.gamericefishpro.space.r5.b bVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString3;
        ?? arrayList4;
        int size3;
        int i12;
        ?? arrayList5;
        int size4;
        int i13;
        ?? arrayList6;
        int size5;
        int i14;
        com.gamericefishpro.space.r2.c cVar;
        int i15;
        Object obj;
        int i16;
        com.gamericefishpro.space.r2.k kVar;
        WeakHashMap weakHashMap;
        Object fVar;
        com.gamericefishpro.space.r2.c cVar2;
        com.gamericefishpro.space.r2.j jVar;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size6;
        int i17;
        com.gamericefishpro.space.r2.c cVar3;
        com.gamericefishpro.space.r2.j0 j0Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size7;
        int i18;
        com.gamericefishpro.space.r2.c cVar4;
        com.gamericefishpro.space.r2.k0 k0Var;
        int i19;
        int i20;
        int size8;
        int i21;
        com.gamericefishpro.space.r2.c cVar5;
        int size9;
        int i22;
        int i23;
        int i24;
        long jB;
        com.gamericefishpro.space.u2.k kVar2;
        com.gamericefishpro.space.u2.i iVar3;
        com.gamericefishpro.space.b3.p pVar;
        long j;
        com.gamericefishpro.space.b3.l lVar5;
        com.gamericefishpro.space.b3.o cVar6;
        SpannableString spannableString4;
        com.gamericefishpro.space.u2.k kVar3;
        int i25;
        boolean z16;
        boolean z17;
        int i26;
        int i27;
        int i28;
        com.gamericefishpro.space.o2.o oVar;
        com.gamericefishpro.space.t.l lVarS;
        int i29;
        com.gamericefishpro.space.f3.j jVar2;
        com.gamericefishpro.space.o2.p pVar2;
        boolean zA2;
        com.gamericefishpro.space.o2.o oVar2;
        int i30;
        int i31;
        String strR;
        Object parentForAccessibility;
        View view;
        com.gamericefishpro.space.z4.w wVarG;
        int i32 = this.v;
        com.gamericefishpro.space.d4.b bVar2 = this.w;
        switch (i32) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Float fValueOf = Float.valueOf(0.0f);
                z zVar2 = (z) bVar2;
                AccessibilityManager accessibilityManager = zVar2.z;
                t tVar2 = zVar2.v;
                l viewTreeOwners = tVar2.getViewTreeOwners();
                if (((viewTreeOwners == null || (wVarG = viewTreeOwners.a.g()) == null) ? null : wVarG.c) == com.gamericefishpro.space.z4.p.d) {
                    if (accessibilityManager.isEnabled()) {
                        hVar4 = null;
                    } else {
                        hVar4 = new com.gamericefishpro.space.e4.h(AccessibilityNodeInfo.obtain());
                    }
                    i6 = i;
                    zVar = zVar2;
                } else {
                    com.gamericefishpro.space.o2.p pVar3 = (com.gamericefishpro.space.o2.p) zVar2.s().b(i);
                    if (pVar3 == null) {
                        if (accessibilityManager.isEnabled()) {
                            hVar4 = null;
                        } else {
                            hVar4 = new com.gamericefishpro.space.e4.h(AccessibilityNodeInfo.obtain());
                        }
                        i6 = i;
                        zVar = zVar2;
                    } else {
                        com.gamericefishpro.space.o2.o oVar3 = pVar3.a;
                        com.gamericefishpro.space.o2.l lVarK = oVar3.k();
                        com.gamericefishpro.space.h2.f0 f0Var2 = oVar3.c;
                        Object objG16 = lVarK.d.g(com.gamericefishpro.space.o2.s.n);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        boolean zA3 = Intrinsics.a(objG16, Boolean.TRUE);
                        if (!zA3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            hVar = new com.gamericefishpro.space.e4.h(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                com.gamericefishpro.space.d4.v.j(accessibilityNodeInfoObtain, zA3);
                            } else {
                                hVar.h(64, zA3);
                            }
                            if (i == -1) {
                                parentForAccessibility = tVar2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                hVar.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                oVarL = oVar3.l();
                                if (oVarL != null) {
                                    numValueOf = Integer.valueOf(oVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    com.gamericefishpro.space.e2.a.c("semanticsNode " + i + " has null parent");
                                    throw new com.gamericefishpro.space.oh.e();
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == tVar2.getSemanticsOwner().a().g) {
                                    iIntValue = -1;
                                }
                                hVar.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(tVar2, iIntValue);
                            }
                            hVar.c = i;
                            accessibilityNodeInfoObtain.setSource(tVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(zVar2.k(pVar3));
                            uVar = zVar2.d0;
                            s0Var = zVar2.M;
                            resources = tVar2.getContext().getResources();
                            hVar.i("android.view.View");
                            lVar = oVar3.d;
                            h0Var = lVar.d;
                            if (h0Var.c(com.gamericefishpro.space.o2.s.E)) {
                                hVar.i("android.widget.EditText");
                            }
                            if (h0Var.c(com.gamericefishpro.space.o2.s.A)) {
                                hVar.i("android.widget.TextView");
                            }
                            objG = h0Var.g(com.gamericefishpro.space.o2.s.x);
                            if (objG == null) {
                                objG = null;
                            }
                            hVar2 = (com.gamericefishpro.space.o2.h) objG;
                            if (hVar2 != null) {
                                i30 = hVar2.a;
                                if (oVar3.e) {
                                    i31 = 4;
                                    s0Var2 = s0Var;
                                    if (com.gamericefishpro.space.o2.o.j(4, oVar3).isEmpty()) {
                                    }
                                    Unit unit = Unit.a;
                                } else {
                                    i31 = 4;
                                    s0Var2 = s0Var;
                                }
                                if (i30 == i31) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i30 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = f0.r(i30);
                                    if (i30 == 5 || oVar3.o() || lVar.i) {
                                        hVar.i(strR);
                                    }
                                }
                                Unit unit2 = Unit.a;
                            } else {
                                s0Var2 = s0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(tVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(com.gamericefishpro.space.o2.r.f(oVar3));
                            if (i2 >= 34) {
                                zH = com.gamericefishpro.space.d4.v.h(accessibilityManager);
                            } else {
                                zH = true;
                            }
                            listJ = com.gamericefishpro.space.o2.o.j(4, oVar3);
                            size = listJ.size();
                            z = zH;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = hVar.a;
                                if (i4 < size) {
                                    int i33 = size;
                                    oVar = (com.gamericefishpro.space.o2.o) listJ.get(i4);
                                    List list5 = listJ;
                                    lVarS = zVar2.s();
                                    int i34 = i4;
                                    i29 = oVar.g;
                                    if (lVarS.a(i29)) {
                                        jVar2 = tVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(oVar.c);
                                        if (i29 != -1) {
                                            if (jVar2 != null) {
                                                accessibilityNodeInfoObtain.addChild(jVar2);
                                            } else {
                                                pVar2 = (com.gamericefishpro.space.o2.p) zVar2.s().b(i29);
                                                if (pVar2 != null || (oVar2 = pVar2.a) == null) {
                                                    zA2 = false;
                                                } else {
                                                    Object objG17 = oVar2.k().d.g(com.gamericefishpro.space.o2.s.n);
                                                    if (objG17 == null) {
                                                        objG17 = null;
                                                    }
                                                    zA2 = Intrinsics.a(objG17, Boolean.TRUE);
                                                }
                                                if (z || !zA2) {
                                                    accessibilityNodeInfo.addChild(tVar2, i29);
                                                }
                                            }
                                            uVar.f(i29, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i34 + 1;
                                    listJ = list5;
                                    size = i33;
                                } else {
                                    if (i == zVar2.E) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        hVar.b(com.gamericefishpro.space.e4.d.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        hVar.b(com.gamericefishpro.space.e4.d.f);
                                    }
                                    eVarI = f0.i(oVar3);
                                    if (eVarI != null) {
                                        tVar2.getFontFamilyResolver();
                                        density = tVar2.getDensity();
                                        bVar = zVar2.Z;
                                        String str5 = eVarI.e;
                                        list4 = eVarI.d;
                                        spannableString2 = new SpannableString(str5);
                                        arrayList3 = eVarI.i;
                                        if (arrayList3 != null) {
                                            size9 = arrayList3.size();
                                            i22 = 0;
                                            while (i22 < size9) {
                                                int i35 = i22;
                                                com.gamericefishpro.space.r2.c cVar7 = (com.gamericefishpro.space.r2.c) arrayList3.get(i22);
                                                ArrayList arrayList7 = arrayList3;
                                                com.gamericefishpro.space.r2.b0 b0Var = (com.gamericefishpro.space.r2.b0) cVar7.a;
                                                int i36 = size9;
                                                i23 = cVar7.b;
                                                i24 = cVar7.c;
                                                com.gamericefishpro.space.t.u uVar3 = uVar;
                                                com.gamericefishpro.space.o2.l lVar6 = lVar;
                                                jB = b0Var.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                                Resources resources3 = resources;
                                                long j2 = b0Var.b;
                                                kVar2 = b0Var.c;
                                                iVar3 = b0Var.d;
                                                pVar = b0Var.j;
                                                com.gamericefishpro.space.x2.b bVar3 = b0Var.k;
                                                com.gamericefishpro.space.t.h0 h0Var4 = h0Var;
                                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                                j = b0Var.l;
                                                lVar5 = b0Var.m;
                                                cVar6 = b0Var.a;
                                                com.gamericefishpro.space.e4.h hVar5 = hVar;
                                                if (!com.gamericefishpro.space.o1.s.d(jB, cVar6.b())) {
                                                    if (jB != 16) {
                                                        cVar6 = new com.gamericefishpro.space.b3.c(jB);
                                                    } else {
                                                        cVar6 = com.gamericefishpro.space.b3.n.a;
                                                    }
                                                }
                                                d5.V(spannableString2, cVar6.b(), i23, i24);
                                                spannableString4 = spannableString2;
                                                d5.W(spannableString4, j2, density, i23, i24);
                                                if (kVar2 == null || iVar3 != null) {
                                                    if (kVar2 == null) {
                                                        kVar3 = com.gamericefishpro.space.u2.k.i;
                                                    } else {
                                                        kVar3 = kVar2;
                                                    }
                                                    if (iVar3 != null) {
                                                        i25 = iVar3.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    if (Intrinsics.d(kVar3.d, com.gamericefishpro.space.u2.k.e.d) >= 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (i25 == 1) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (!z17 && z16) {
                                                        i26 = 3;
                                                    } else if (z16) {
                                                        i26 = 1;
                                                    } else if (z17) {
                                                        i26 = 2;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(i26);
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan, i23, i24, 33);
                                                } else {
                                                    i27 = 33;
                                                }
                                                if (lVar5 != null) {
                                                    i28 = lVar5.a;
                                                    if ((i28 | 1) == i28) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i23, i24, i27);
                                                    }
                                                    if ((i28 | 2) == i28) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i23, i24, i27);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(pVar.a), i23, i24, i27);
                                                }
                                                d5.Y(spannableString4, bVar3, i23, i24);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(com.gamericefishpro.space.o1.o.y(j)), i23, i24, i27);
                                                }
                                                i22 = i35 + 1;
                                                spannableString2 = spannableString4;
                                                arrayList3 = arrayList7;
                                                size9 = i36;
                                                uVar = uVar3;
                                                lVar = lVar6;
                                                accessibilityNodeInfo = accessibilityNodeInfo6;
                                                resources = resources3;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                                h0Var = h0Var4;
                                                hVar = hVar5;
                                            }
                                        }
                                        lVar2 = lVar;
                                        uVar2 = uVar;
                                        spannableString3 = spannableString2;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        resources2 = resources;
                                        h0Var2 = h0Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        com.gamericefishpro.space.e4.h hVar6 = hVar;
                                        int length = str5.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i21 < size8) {
                                                Object obj2 = list4.get(i21);
                                                cVar5 = (com.gamericefishpro.space.r2.c) obj2;
                                                if (!(cVar5.a instanceof com.gamericefishpro.space.r2.k0) && com.gamericefishpro.space.r2.f.a(0, length, cVar5.b, cVar5.c)) {
                                                    arrayList4.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList4 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
                                        size3 = arrayList4.size();
                                        while (i12 < size3) {
                                            com.gamericefishpro.space.r2.c cVar8 = (com.gamericefishpro.space.r2.c) arrayList4.get(i12);
                                            k0Var = (com.gamericefishpro.space.r2.k0) cVar8.a;
                                            i19 = cVar8.b;
                                            i20 = cVar8.c;
                                            if (k0Var instanceof com.gamericefishpro.space.r2.k0) {
                                                throw new com.gamericefishpro.space.oh.k();
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(k0Var.a).build(), i19, i20, 33);
                                        }
                                        int length2 = str5.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i18 < size7) {
                                                Object obj3 = list4.get(i18);
                                                cVar4 = (com.gamericefishpro.space.r2.c) obj3;
                                                if (!(cVar4.a instanceof com.gamericefishpro.space.r2.j0) && com.gamericefishpro.space.r2.f.a(0, length2, cVar4.b, cVar4.c)) {
                                                    arrayList5.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList5 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList5, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
                                        size4 = arrayList5.size();
                                        while (i13 < size4) {
                                            com.gamericefishpro.space.r2.c cVar9 = (com.gamericefishpro.space.r2.c) arrayList5.get(i13);
                                            j0Var = (com.gamericefishpro.space.r2.j0) cVar9.a;
                                            int i37 = cVar9.b;
                                            int i38 = cVar9.c;
                                            weakHashMap3 = (WeakHashMap) bVar.e;
                                            uRLSpan2 = weakHashMap3.get(j0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(j0Var.a);
                                                weakHashMap3.put(j0Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i37, i38, 33);
                                        }
                                        int length3 = str5.length();
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size6 = list4.size();
                                            while (i17 < size6) {
                                                Object obj4 = list4.get(i17);
                                                cVar3 = (com.gamericefishpro.space.r2.c) obj4;
                                                if (!(cVar3.a instanceof com.gamericefishpro.space.r2.k) && com.gamericefishpro.space.r2.f.a(0, length3, cVar3.b, cVar3.c)) {
                                                    arrayList6.add(obj4);
                                                }
                                            }
                                        } else {
                                            arrayList6 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList6, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
                                        size5 = arrayList6.size();
                                        while (i14 < size5) {
                                            cVar = (com.gamericefishpro.space.r2.c) arrayList6.get(i14);
                                            i15 = cVar.b;
                                            obj = cVar.a;
                                            i16 = cVar.c;
                                            if (i15 != i16) {
                                                kVar = (com.gamericefishpro.space.r2.k) obj;
                                                if (kVar instanceof com.gamericefishpro.space.r2.j) {
                                                    Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                    jVar = (com.gamericefishpro.space.r2.j) obj;
                                                    cVar2 = new com.gamericefishpro.space.r2.c(i15, i16, jVar);
                                                    weakHashMap2 = (WeakHashMap) bVar.i;
                                                    uRLSpan = weakHashMap2.get(cVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(jVar.a);
                                                        weakHashMap2.put(cVar2, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) bVar.v;
                                                    fVar = weakHashMap.get(cVar);
                                                    if (fVar == null) {
                                                        fVar = new com.gamericefishpro.space.y2.f(kVar);
                                                        weakHashMap.put(cVar, fVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) fVar, i15, i16, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) z.P(spannableString3);
                                        hVar3 = hVar6;
                                    } else {
                                        lVar2 = lVar;
                                        zVar2 = zVar2;
                                        uVar2 = uVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        resources2 = resources;
                                        h0Var2 = h0Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        hVar3 = hVar;
                                        spannableString = null;
                                    }
                                    hVar3.k(spannableString);
                                    vVar = com.gamericefishpro.space.o2.s.J;
                                    h0Var3 = h0Var2;
                                    if (h0Var3.c(vVar)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG15 = h0Var3.g(vVar);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG15);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    Resources resources4 = resources2;
                                    strH = f0.h(oVar3, resources4);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        com.gamericefishpro.space.d4.i.h(accessibilityNodeInfo4, strH);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    accessibilityNodeInfo4.setCheckable(f0.g(oVar3));
                                    objG2 = h0Var3.g(com.gamericefishpro.space.o2.s.H);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    aVar = (com.gamericefishpro.space.q2.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == com.gamericefishpro.space.q2.a.d) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (aVar == com.gamericefishpro.space.q2.a.e) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                        Unit unit3 = Unit.a;
                                    }
                                    objG3 = h0Var3.g(com.gamericefishpro.space.o2.s.G);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (hVar2 == null) {
                                            i5 = 4;
                                        } else {
                                            i5 = 4;
                                            if (hVar2.a == 4) {
                                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                                            }
                                            Unit unit4 = Unit.a;
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                        Unit unit5 = Unit.a;
                                    } else {
                                        i5 = 4;
                                    }
                                    lVar3 = lVar2;
                                    if (lVar3.i || com.gamericefishpro.space.o2.o.j(i5, oVar3).isEmpty()) {
                                        objG4 = h0Var3.g(com.gamericefishpro.space.o2.s.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    }
                                    objG5 = h0Var3.g(com.gamericefishpro.space.o2.s.y);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        oVarL2 = oVar3;
                                        while (true) {
                                            if (oVarL2 != null) {
                                                lVar4 = oVarL2.d;
                                                vVar6 = com.gamericefishpro.space.o2.t.a;
                                                if (lVar4.d.c(vVar6)) {
                                                    zBooleanValue = ((Boolean) lVar4.d(vVar6)).booleanValue();
                                                } else {
                                                    oVarL2 = oVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = h0Var3.g(com.gamericefishpro.space.o2.s.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((Unit) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setHeading(true);
                                        } else {
                                            hVar3.h(2, true);
                                        }
                                        Unit unit6 = Unit.a;
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = uVar2.d(oVar3.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                            Unit unit7 = Unit.a;
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(h0Var3.c(com.gamericefishpro.space.o2.s.I));
                                    accessibilityNodeInfo5.setEditable(h0Var3.c(com.gamericefishpro.space.o2.s.L));
                                    objG7 = h0Var3.g(com.gamericefishpro.space.o2.s.M);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(f0.b(oVar3));
                                    vVar2 = com.gamericefishpro.space.o2.s.k;
                                    accessibilityNodeInfo4.setFocusable(h0Var3.c(vVar2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) lVar3.d(vVar2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            hVar3.a(2);
                                            zVar = zVar2;
                                            zVar.F = i6;
                                        } else {
                                            zVar = zVar2;
                                            z2 = true;
                                            hVar3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(com.gamericefishpro.space.o2.r.e(oVar3) ^ z2);
                                        com.gamericefishpro.space.m5.a.s(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.j));
                                        accessibilityNodeInfo4.setClickable(false);
                                        aVar2 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.b);
                                        if (aVar2 != null) {
                                            boolean zA4 = Intrinsics.a(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.G), Boolean.TRUE);
                                            if (hVar2 == null && hVar2.a == 4) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                z13 = true;
                                            } else {
                                                if (hVar2 == null && hVar2.a == 3) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (z15) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                            }
                                            if (z13 || (z13 && !zA4)) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            accessibilityNodeInfo4.setClickable(z14);
                                            if (f0.b(oVar3) && accessibilityNodeInfo5.isClickable()) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(16, aVar2.a));
                                            }
                                            Unit unit8 = Unit.a;
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        aVar3 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.c);
                                        if (aVar3 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (f0.b(oVar3)) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(32, aVar3.a));
                                            }
                                            Unit unit9 = Unit.a;
                                        }
                                        aVar4 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.p);
                                        if (aVar4 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(16384, aVar4.a));
                                            Unit unit10 = Unit.a;
                                        }
                                        if (f0.b(oVar3)) {
                                            aVar10 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.k);
                                            if (aVar10 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(2097152, aVar10.a));
                                                Unit unit11 = Unit.a;
                                            }
                                            aVar11 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.o);
                                            if (aVar11 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                                Unit unit12 = Unit.a;
                                            }
                                            aVar12 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.q);
                                            if (aVar12 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(65536, aVar12.a));
                                                Unit unit13 = Unit.a;
                                            }
                                            aVar13 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.r);
                                            if (aVar13 != null) {
                                                if (accessibilityNodeInfo5.isFocused()) {
                                                    primaryClipDescription = tVar2.m7getClipboardManager().a.getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        hVar3.b(new com.gamericefishpro.space.e4.d(32768, aVar13.a));
                                                    }
                                                }
                                                Unit unit14 = Unit.a;
                                            }
                                        }
                                        strT = z.t(oVar3);
                                        if (strT != null || strT.length() == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo5.setTextSelection(zVar.r(oVar3), zVar.q(oVar3));
                                            aVar9 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.j);
                                            if (aVar9 != null) {
                                                str4 = aVar9.a;
                                            } else {
                                                str4 = null;
                                            }
                                            hVar3.b(new com.gamericefishpro.space.e4.d(131072, str4));
                                            hVar3.a(256);
                                            hVar3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.a);
                                            if (list3 != null || list3.isEmpty()) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10 && h0Var3.c(com.gamericefishpro.space.o2.k.a)) {
                                                if (oVar3.d.d.c(com.gamericefishpro.space.o2.s.E)) {
                                                    objG14 = oVar3.d.d.g(com.gamericefishpro.space.o2.s.k);
                                                    if (objG14 == null) {
                                                        objG14 = null;
                                                    }
                                                    if (!Intrinsics.a(objG14, Boolean.TRUE)) {
                                                        f0VarV = oVar3.c.v();
                                                        while (true) {
                                                            if (f0VarV == null) {
                                                                f0VarV = null;
                                                            } else {
                                                                lVarX2 = f0VarV.x();
                                                                if (lVarX2 == null && lVarX2.i) {
                                                                    if (lVarX2.d.c(com.gamericefishpro.space.o2.s.E)) {
                                                                    }
                                                                }
                                                                f0VarV = f0VarV.v();
                                                            }
                                                        }
                                                        if (f0VarV != null) {
                                                            lVarX = f0VarV.x();
                                                            if (lVarX != null) {
                                                                objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                                if (objG13 == null) {
                                                                    objG13 = null;
                                                                }
                                                                zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            z11 = zA ? false : true;
                                                        }
                                                    }
                                                } else {
                                                    f0VarV = oVar3.c.v();
                                                    while (true) {
                                                        if (f0VarV == null) {
                                                            f0VarV = null;
                                                        } else {
                                                            lVarX2 = f0VarV.x();
                                                            if (lVarX2 == null) {
                                                            }
                                                            f0VarV = f0VarV.v();
                                                        }
                                                    }
                                                    if (f0VarV != null) {
                                                        lVarX = f0VarV.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                            if (objG13 == null) {
                                                                objG13 = null;
                                                            }
                                                            zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z11) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = hVar3.g();
                                        if (charSequenceG != null || charSequenceG.length() == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z4 && h0Var3.c(com.gamericefishpro.space.o2.k.a)) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (h0Var3.c(com.gamericefishpro.space.o2.s.y)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (h0Var3.c(com.gamericefishpro.space.o2.s.N)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                        gVar = (com.gamericefishpro.space.o2.g) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.c);
                                        if (gVar != null) {
                                            vVar5 = com.gamericefishpro.space.o2.k.i;
                                            if (h0Var3.c(vVar5)) {
                                                hVar3.i("android.widget.SeekBar");
                                            } else {
                                                hVar3.i("android.widget.ProgressBar");
                                            }
                                            if (gVar != com.gamericefishpro.space.o2.g.b) {
                                                accessibilityNodeInfo4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new com.gamericefishpro.space.e4.g(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f)).d);
                                            }
                                            if (oVar3.m().d.c(vVar5) && f0.b(oVar3)) {
                                                fFloatValue = fValueOf.floatValue();
                                                fFloatValue2 = fValueOf.floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (0.0f < fFloatValue) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                }
                                                fFloatValue3 = fValueOf.floatValue();
                                                fFloatValue4 = fValueOf.floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (0.0f > fFloatValue3) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                }
                                            }
                                        }
                                        i7 = Build.VERSION.SDK_INT;
                                        if (f0.b(oVar3)) {
                                            objG12 = oVar3.d.d.g(com.gamericefishpro.space.o2.k.i);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            aVar8 = (com.gamericefishpro.space.o2.a) objG12;
                                            if (aVar8 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                            }
                                        }
                                        com.gamericefishpro.space.hj.c.T(hVar3, oVar3);
                                        com.gamericefishpro.space.hj.c.U(hVar3, oVar3);
                                        iVar = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.u);
                                        com.gamericefishpro.space.o2.a aVar14 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.d);
                                        if (iVar != null && aVar14 != null) {
                                            objG10 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                            if (objG10 == null) {
                                                objG10 = null;
                                            }
                                            if (objG10 == null) {
                                                objG11 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                                if (objG11 == null) {
                                                    objG11 = null;
                                                }
                                                if (objG11 != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                            } else {
                                                z7 = true;
                                            }
                                            if (!z7) {
                                                hVar3.i("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) iVar.b.invoke()).floatValue() > 0.0f) {
                                                hVar3.j(true);
                                            }
                                            if (f0.b(oVar3)) {
                                                if (z.z(iVar)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                    f0Var = f0Var2;
                                                    if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        dVar2 = com.gamericefishpro.space.e4.d.p;
                                                    } else {
                                                        dVar2 = com.gamericefishpro.space.e4.d.n;
                                                    }
                                                    hVar3.b(dVar2);
                                                } else {
                                                    f0Var = f0Var2;
                                                }
                                                if (z.y(iVar)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                    if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        dVar = com.gamericefishpro.space.e4.d.n;
                                                    } else {
                                                        dVar = com.gamericefishpro.space.e4.d.p;
                                                    }
                                                    hVar3.b(dVar);
                                                }
                                            }
                                        }
                                        iVar2 = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.v);
                                        if (iVar2 != null && aVar14 != null) {
                                            objG8 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                            if (objG8 == null) {
                                                objG8 = null;
                                            }
                                            if (objG8 == null) {
                                                objG9 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                                if (objG9 == null) {
                                                    objG9 = null;
                                                }
                                                if (objG9 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                hVar3.i("android.widget.ScrollView");
                                            }
                                            if (((Number) iVar2.b.invoke()).floatValue() > 0.0f) {
                                                hVar3.j(true);
                                            }
                                            if (f0.b(oVar3)) {
                                                if (z.z(iVar2)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                    hVar3.b(com.gamericefishpro.space.e4.d.o);
                                                }
                                                if (z.y(iVar2)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                    hVar3.b(com.gamericefishpro.space.e4.d.m);
                                                }
                                            }
                                        }
                                        if (i7 >= 29) {
                                            f0.d(hVar3, oVar3);
                                        }
                                        charSequence = (CharSequence) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.d);
                                        if (i7 >= 28) {
                                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (f0.b(oVar3)) {
                                            aVar5 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.s);
                                            if (aVar5 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(262144, aVar5.a));
                                                Unit unit15 = Unit.a;
                                            }
                                            aVar6 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.t);
                                            if (aVar6 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(524288, aVar6.a));
                                                Unit unit16 = Unit.a;
                                            }
                                            aVar7 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.u);
                                            if (aVar7 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(1048576, aVar7.a));
                                                Unit unit17 = Unit.a;
                                            }
                                            lVarM = oVar3.m();
                                            vVar3 = com.gamericefishpro.space.o2.k.w;
                                            if (lVarM.d.c(vVar3)) {
                                                list2 = (List) oVar3.m().d(vVar3);
                                                size2 = list2.size();
                                                vVar4 = z.h0;
                                                if (size2 < vVar4.b) {
                                                    throw new IllegalStateException("Can't have more than " + vVar4.b + " custom actions for one widget");
                                                }
                                                com.gamericefishpro.space.t.s0 s0Var4 = new com.gamericefishpro.space.t.s0(0);
                                                com.gamericefishpro.space.t.c0 c0VarA = com.gamericefishpro.space.t.m0.a();
                                                s0Var3 = s0Var2;
                                                if (s0Var3.d) {
                                                    com.gamericefishpro.space.t.r.a(s0Var3);
                                                }
                                                if (com.gamericefishpro.space.u.a.a(s0Var3.v, i6, s0Var3.e) >= 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    c0Var = (com.gamericefishpro.space.t.c0) s0Var3.c(i6);
                                                    iArr = vVar4.a;
                                                    i8 = vVar4.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i39 = iArr[i9];
                                                        int i40 = i8;
                                                        i11 = i10 + 1;
                                                        int i41 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                                                        }
                                                        iArrCopyOf[i10] = i39;
                                                        i9 = i41 + 1;
                                                        i10 = i11;
                                                        i8 = i40;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                        Intrinsics.b(c0Var);
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        com.gamericefishpro.space.m5.a.s(arrayList2.get(0));
                                                        if (i10 > 0) {
                                                            int i42 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
                                                        throw null;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                    vVar4.b(0);
                                                    throw null;
                                                }
                                                zVar.L.e(i6, s0Var4);
                                                s0Var3.e(i6, c0VarA);
                                            }
                                        }
                                        zC = f0.c(oVar3, resources4);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setScreenReaderFocusable(zC);
                                        } else {
                                            hVar3.h(1, zC);
                                        }
                                        iD = zVar.V.d(i6);
                                        if (iD != -1) {
                                            jVarP2 = f0.p(tVar2.getAndroidViewsHandler$ui(), iD);
                                            if (jVarP2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(jVarP2);
                                                tVar = tVar2;
                                            } else {
                                                tVar = tVar2;
                                                accessibilityNodeInfo4.setTraversalBefore(tVar, iD);
                                            }
                                            bundle = null;
                                            zVar.j(i6, hVar3, zVar.X, null);
                                        } else {
                                            bundle = null;
                                            tVar = tVar2;
                                        }
                                        iD2 = zVar.W.d(i6);
                                        if (iD2 != -1 && (jVarP = f0.p(tVar.getAndroidViewsHandler$ui(), iD2)) != null) {
                                            accessibilityNodeInfo4.setTraversalAfter(jVarP);
                                            zVar.j(i6, hVar3, zVar.Y, bundle);
                                        }
                                        str3 = (String) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.t.b);
                                        if (str3 != null) {
                                            hVar3.i(str3);
                                            Unit unit18 = Unit.a;
                                        }
                                        hVar4 = hVar3;
                                    } else {
                                        zVar = zVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(com.gamericefishpro.space.o2.r.e(oVar3) ^ z2);
                                    com.gamericefishpro.space.m5.a.s(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.j));
                                    accessibilityNodeInfo4.setClickable(false);
                                    aVar2 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.b);
                                    if (aVar2 != null) {
                                        boolean zA5 = Intrinsics.a(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.G), Boolean.TRUE);
                                        if (hVar2 == null) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (z12) {
                                            z13 = true;
                                        } else {
                                            if (hVar2 == null) {
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z14);
                                        if (f0.b(oVar3)) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(16, aVar2.a));
                                        }
                                        Unit unit19 = Unit.a;
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    aVar3 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.c);
                                    if (aVar3 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (f0.b(oVar3)) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(32, aVar3.a));
                                        }
                                        Unit unit20 = Unit.a;
                                    }
                                    aVar4 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.p);
                                    if (aVar4 != null) {
                                        hVar3.b(new com.gamericefishpro.space.e4.d(16384, aVar4.a));
                                        Unit unit110 = Unit.a;
                                    }
                                    if (f0.b(oVar3)) {
                                        aVar10 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.k);
                                        if (aVar10 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(2097152, aVar10.a));
                                            Unit unit111 = Unit.a;
                                        }
                                        aVar11 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.o);
                                        if (aVar11 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            Unit unit112 = Unit.a;
                                        }
                                        aVar12 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.q);
                                        if (aVar12 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(65536, aVar12.a));
                                            Unit unit113 = Unit.a;
                                        }
                                        aVar13 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.r);
                                        if (aVar13 != null) {
                                            if (accessibilityNodeInfo5.isFocused()) {
                                                primaryClipDescription = tVar2.m7getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    hVar3.b(new com.gamericefishpro.space.e4.d(32768, aVar13.a));
                                                }
                                            }
                                            Unit unit114 = Unit.a;
                                        }
                                    }
                                    strT = z.t(oVar3);
                                    if (strT != null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        accessibilityNodeInfo5.setTextSelection(zVar.r(oVar3), zVar.q(oVar3));
                                        aVar9 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.j);
                                        if (aVar9 != null) {
                                            str4 = aVar9.a;
                                        } else {
                                            str4 = null;
                                        }
                                        hVar3.b(new com.gamericefishpro.space.e4.d(131072, str4));
                                        hVar3.a(256);
                                        hVar3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.a);
                                        if (list3 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            if (oVar3.d.d.c(com.gamericefishpro.space.o2.s.E)) {
                                                objG14 = oVar3.d.d.g(com.gamericefishpro.space.o2.s.k);
                                                if (objG14 == null) {
                                                    objG14 = null;
                                                }
                                                if (!Intrinsics.a(objG14, Boolean.TRUE)) {
                                                    f0VarV = oVar3.c.v();
                                                    while (true) {
                                                        if (f0VarV == null) {
                                                            f0VarV = null;
                                                        } else {
                                                            lVarX2 = f0VarV.x();
                                                            if (lVarX2 == null) {
                                                            }
                                                            f0VarV = f0VarV.v();
                                                        }
                                                    }
                                                    if (f0VarV != null) {
                                                        lVarX = f0VarV.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                            if (objG13 == null) {
                                                                objG13 = null;
                                                            }
                                                            zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                f0VarV = oVar3.c.v();
                                                while (true) {
                                                    if (f0VarV == null) {
                                                        f0VarV = null;
                                                    } else {
                                                        lVarX2 = f0VarV.x();
                                                        if (lVarX2 == null) {
                                                        }
                                                        f0VarV = f0VarV.v();
                                                    }
                                                }
                                                if (f0VarV != null) {
                                                    lVarX = f0VarV.x();
                                                    if (lVarX != null) {
                                                        objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                        if (objG13 == null) {
                                                            objG13 = null;
                                                        }
                                                        zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z11) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceG = hVar3.g();
                                    if (charSequenceG != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (h0Var3.c(com.gamericefishpro.space.o2.s.y)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (h0Var3.c(com.gamericefishpro.space.o2.s.N)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                    gVar = (com.gamericefishpro.space.o2.g) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.c);
                                    if (gVar != null) {
                                        vVar5 = com.gamericefishpro.space.o2.k.i;
                                        if (h0Var3.c(vVar5)) {
                                            hVar3.i("android.widget.SeekBar");
                                        } else {
                                            hVar3.i("android.widget.ProgressBar");
                                        }
                                        if (gVar != com.gamericefishpro.space.o2.g.b) {
                                            accessibilityNodeInfo4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new com.gamericefishpro.space.e4.g(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f)).d);
                                        }
                                        if (oVar3.m().d.c(vVar5)) {
                                            fFloatValue = fValueOf.floatValue();
                                            fFloatValue2 = fValueOf.floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (0.0f < fFloatValue) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                            }
                                            fFloatValue3 = fValueOf.floatValue();
                                            fFloatValue4 = fValueOf.floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (0.0f > fFloatValue3) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                            }
                                        }
                                    }
                                    i7 = Build.VERSION.SDK_INT;
                                    if (f0.b(oVar3)) {
                                        objG12 = oVar3.d.d.g(com.gamericefishpro.space.o2.k.i);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        aVar8 = (com.gamericefishpro.space.o2.a) objG12;
                                        if (aVar8 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                    }
                                    com.gamericefishpro.space.hj.c.T(hVar3, oVar3);
                                    com.gamericefishpro.space.hj.c.U(hVar3, oVar3);
                                    iVar = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.u);
                                    com.gamericefishpro.space.o2.a aVar15 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.d);
                                    if (iVar != null) {
                                        objG10 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        if (objG10 == null) {
                                            objG11 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                        } else {
                                            z7 = true;
                                        }
                                        if (!z7) {
                                            hVar3.i("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) iVar.b.invoke()).floatValue() > 0.0f) {
                                            hVar3.j(true);
                                        }
                                        if (f0.b(oVar3)) {
                                            if (z.z(iVar)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                f0Var = f0Var2;
                                                if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    dVar2 = com.gamericefishpro.space.e4.d.p;
                                                } else {
                                                    dVar2 = com.gamericefishpro.space.e4.d.n;
                                                }
                                                hVar3.b(dVar2);
                                            } else {
                                                f0Var = f0Var2;
                                            }
                                            if (z.y(iVar)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    dVar = com.gamericefishpro.space.e4.d.n;
                                                } else {
                                                    dVar = com.gamericefishpro.space.e4.d.p;
                                                }
                                                hVar3.b(dVar);
                                            }
                                        }
                                    }
                                    iVar2 = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.v);
                                    if (iVar2 != null) {
                                        objG8 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        if (objG8 == null) {
                                            objG9 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                            if (objG9 == null) {
                                                objG9 = null;
                                            }
                                            if (objG9 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                        } else {
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            hVar3.i("android.widget.ScrollView");
                                        }
                                        if (((Number) iVar2.b.invoke()).floatValue() > 0.0f) {
                                            hVar3.j(true);
                                        }
                                        if (f0.b(oVar3)) {
                                            if (z.z(iVar2)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                hVar3.b(com.gamericefishpro.space.e4.d.o);
                                            }
                                            if (z.y(iVar2)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                hVar3.b(com.gamericefishpro.space.e4.d.m);
                                            }
                                        }
                                    }
                                    if (i7 >= 29) {
                                        f0.d(hVar3, oVar3);
                                    }
                                    charSequence = (CharSequence) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.d);
                                    if (i7 >= 28) {
                                        accessibilityNodeInfo4.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (f0.b(oVar3)) {
                                        aVar5 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.s);
                                        if (aVar5 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(262144, aVar5.a));
                                            Unit unit115 = Unit.a;
                                        }
                                        aVar6 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.t);
                                        if (aVar6 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(524288, aVar6.a));
                                            Unit unit116 = Unit.a;
                                        }
                                        aVar7 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.u);
                                        if (aVar7 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(1048576, aVar7.a));
                                            Unit unit117 = Unit.a;
                                        }
                                        lVarM = oVar3.m();
                                        vVar3 = com.gamericefishpro.space.o2.k.w;
                                        if (lVarM.d.c(vVar3)) {
                                            list2 = (List) oVar3.m().d(vVar3);
                                            size2 = list2.size();
                                            vVar4 = z.h0;
                                            if (size2 < vVar4.b) {
                                                throw new IllegalStateException("Can't have more than " + vVar4.b + " custom actions for one widget");
                                            }
                                            com.gamericefishpro.space.t.s0 s0Var5 = new com.gamericefishpro.space.t.s0(0);
                                            com.gamericefishpro.space.t.c0 c0VarA2 = com.gamericefishpro.space.t.m0.a();
                                            s0Var3 = s0Var2;
                                            if (s0Var3.d) {
                                                com.gamericefishpro.space.t.r.a(s0Var3);
                                            }
                                            if (com.gamericefishpro.space.u.a.a(s0Var3.v, i6, s0Var3.e) >= 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                c0Var = (com.gamericefishpro.space.t.c0) s0Var3.c(i6);
                                                iArr = vVar4.a;
                                                i8 = vVar4.b;
                                                iArrCopyOf = new int[16];
                                                i9 = 0;
                                                i10 = 0;
                                                while (i9 < i8) {
                                                    int i310 = iArr[i9];
                                                    int i43 = i8;
                                                    i11 = i10 + 1;
                                                    int i44 = i9;
                                                    if (iArrCopyOf.length < i11) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                                                    }
                                                    iArrCopyOf[i10] = i310;
                                                    i9 = i44 + 1;
                                                    i10 = i11;
                                                    i8 = i43;
                                                }
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                    Intrinsics.b(c0Var);
                                                    throw null;
                                                }
                                                if (arrayList2.size() > 0) {
                                                    com.gamericefishpro.space.m5.a.s(arrayList2.get(0));
                                                    if (i10 > 0) {
                                                        int i45 = iArrCopyOf[0];
                                                        throw null;
                                                    }
                                                    com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
                                                    throw null;
                                                }
                                            } else if (list2.size() > 0) {
                                                com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                vVar4.b(0);
                                                throw null;
                                            }
                                            zVar.L.e(i6, s0Var5);
                                            s0Var3.e(i6, c0VarA2);
                                        }
                                    }
                                    zC = f0.c(oVar3, resources4);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo4.setScreenReaderFocusable(zC);
                                    } else {
                                        hVar3.h(1, zC);
                                    }
                                    iD = zVar.V.d(i6);
                                    if (iD != -1) {
                                        jVarP2 = f0.p(tVar2.getAndroidViewsHandler$ui(), iD);
                                        if (jVarP2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(jVarP2);
                                            tVar = tVar2;
                                        } else {
                                            tVar = tVar2;
                                            accessibilityNodeInfo4.setTraversalBefore(tVar, iD);
                                        }
                                        bundle = null;
                                        zVar.j(i6, hVar3, zVar.X, null);
                                    } else {
                                        bundle = null;
                                        tVar = tVar2;
                                    }
                                    iD2 = zVar.W.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(jVarP);
                                        zVar.j(i6, hVar3, zVar.Y, bundle);
                                    }
                                    str3 = (String) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.t.b);
                                    if (str3 != null) {
                                        hVar3.i(str3);
                                        Unit unit118 = Unit.a;
                                    }
                                    hVar4 = hVar3;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? com.gamericefishpro.space.d4.v.h(accessibilityManager) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            hVar = new com.gamericefishpro.space.e4.h(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                com.gamericefishpro.space.d4.v.j(accessibilityNodeInfoObtain, zA3);
                            } else {
                                hVar.h(64, zA3);
                            }
                            if (i == -1) {
                                parentForAccessibility = tVar2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                hVar.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                oVarL = oVar3.l();
                                if (oVarL != null) {
                                    numValueOf = Integer.valueOf(oVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    com.gamericefishpro.space.e2.a.c("semanticsNode " + i + " has null parent");
                                    throw new com.gamericefishpro.space.oh.e();
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == tVar2.getSemanticsOwner().a().g) {
                                    iIntValue = -1;
                                }
                                hVar.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(tVar2, iIntValue);
                            }
                            hVar.c = i;
                            accessibilityNodeInfoObtain.setSource(tVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(zVar2.k(pVar3));
                            uVar = zVar2.d0;
                            s0Var = zVar2.M;
                            resources = tVar2.getContext().getResources();
                            hVar.i("android.view.View");
                            lVar = oVar3.d;
                            h0Var = lVar.d;
                            if (h0Var.c(com.gamericefishpro.space.o2.s.E)) {
                                hVar.i("android.widget.EditText");
                            }
                            if (h0Var.c(com.gamericefishpro.space.o2.s.A)) {
                                hVar.i("android.widget.TextView");
                            }
                            objG = h0Var.g(com.gamericefishpro.space.o2.s.x);
                            if (objG == null) {
                                objG = null;
                            }
                            hVar2 = (com.gamericefishpro.space.o2.h) objG;
                            if (hVar2 != null) {
                                i30 = hVar2.a;
                                if (oVar3.e) {
                                    i31 = 4;
                                    s0Var2 = s0Var;
                                } else {
                                    i31 = 4;
                                    s0Var2 = s0Var;
                                    if (com.gamericefishpro.space.o2.o.j(4, oVar3).isEmpty()) {
                                    }
                                    Unit unit21 = Unit.a;
                                }
                                if (i30 == i31) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i30 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = f0.r(i30);
                                    if (i30 == 5) {
                                        hVar.i(strR);
                                    } else {
                                        hVar.i(strR);
                                    }
                                }
                                Unit unit22 = Unit.a;
                            } else {
                                s0Var2 = s0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(tVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(com.gamericefishpro.space.o2.r.f(oVar3));
                            if (i2 >= 34) {
                                zH = com.gamericefishpro.space.d4.v.h(accessibilityManager);
                            } else {
                                zH = true;
                            }
                            listJ = com.gamericefishpro.space.o2.o.j(4, oVar3);
                            size = listJ.size();
                            z = zH;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = hVar.a;
                                if (i4 < size) {
                                    int i311 = size;
                                    oVar = (com.gamericefishpro.space.o2.o) listJ.get(i4);
                                    List list6 = listJ;
                                    lVarS = zVar2.s();
                                    int i312 = i4;
                                    i29 = oVar.g;
                                    if (lVarS.a(i29)) {
                                        jVar2 = tVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(oVar.c);
                                        if (i29 != -1) {
                                            if (jVar2 != null) {
                                                accessibilityNodeInfoObtain.addChild(jVar2);
                                            } else {
                                                pVar2 = (com.gamericefishpro.space.o2.p) zVar2.s().b(i29);
                                                if (pVar2 != null) {
                                                    zA2 = false;
                                                } else {
                                                    zA2 = false;
                                                }
                                                if (z) {
                                                    accessibilityNodeInfo.addChild(tVar2, i29);
                                                } else {
                                                    accessibilityNodeInfo.addChild(tVar2, i29);
                                                }
                                            }
                                            uVar.f(i29, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i312 + 1;
                                    listJ = list6;
                                    size = i311;
                                } else {
                                    if (i == zVar2.E) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        hVar.b(com.gamericefishpro.space.e4.d.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        hVar.b(com.gamericefishpro.space.e4.d.f);
                                    }
                                    eVarI = f0.i(oVar3);
                                    if (eVarI != null) {
                                        tVar2.getFontFamilyResolver();
                                        density = tVar2.getDensity();
                                        bVar = zVar2.Z;
                                        String str6 = eVarI.e;
                                        list4 = eVarI.d;
                                        spannableString2 = new SpannableString(str6);
                                        arrayList3 = eVarI.i;
                                        if (arrayList3 != null) {
                                            size9 = arrayList3.size();
                                            i22 = 0;
                                            while (i22 < size9) {
                                                int i313 = i22;
                                                com.gamericefishpro.space.r2.c cVar10 = (com.gamericefishpro.space.r2.c) arrayList3.get(i22);
                                                ArrayList arrayList8 = arrayList3;
                                                com.gamericefishpro.space.r2.b0 b0Var2 = (com.gamericefishpro.space.r2.b0) cVar10.a;
                                                int i314 = size9;
                                                i23 = cVar10.b;
                                                i24 = cVar10.c;
                                                com.gamericefishpro.space.t.u uVar4 = uVar;
                                                com.gamericefishpro.space.o2.l lVar7 = lVar;
                                                jB = b0Var2.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                                Resources resources5 = resources;
                                                long j3 = b0Var2.b;
                                                kVar2 = b0Var2.c;
                                                iVar3 = b0Var2.d;
                                                pVar = b0Var2.j;
                                                com.gamericefishpro.space.x2.b bVar4 = b0Var2.k;
                                                com.gamericefishpro.space.t.h0 h0Var5 = h0Var;
                                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfoObtain;
                                                j = b0Var2.l;
                                                lVar5 = b0Var2.m;
                                                cVar6 = b0Var2.a;
                                                com.gamericefishpro.space.e4.h hVar7 = hVar;
                                                if (!com.gamericefishpro.space.o1.s.d(jB, cVar6.b())) {
                                                    if (jB != 16) {
                                                        cVar6 = new com.gamericefishpro.space.b3.c(jB);
                                                    } else {
                                                        cVar6 = com.gamericefishpro.space.b3.n.a;
                                                    }
                                                }
                                                d5.V(spannableString2, cVar6.b(), i23, i24);
                                                spannableString4 = spannableString2;
                                                d5.W(spannableString4, j3, density, i23, i24);
                                                if (kVar2 == null) {
                                                    if (kVar2 == null) {
                                                        kVar3 = com.gamericefishpro.space.u2.k.i;
                                                    } else {
                                                        kVar3 = kVar2;
                                                    }
                                                    if (iVar3 != null) {
                                                        i25 = iVar3.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    if (Intrinsics.d(kVar3.d, com.gamericefishpro.space.u2.k.e.d) >= 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (i25 == 1) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (!z17) {
                                                        if (z16) {
                                                            i26 = 1;
                                                        } else if (z17) {
                                                            i26 = 2;
                                                        } else {
                                                            i26 = 0;
                                                        }
                                                    } else if (z16) {
                                                        i26 = 1;
                                                    } else if (z17) {
                                                        i26 = 2;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(i26);
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan2, i23, i24, 33);
                                                } else {
                                                    if (kVar2 == null) {
                                                        kVar3 = com.gamericefishpro.space.u2.k.i;
                                                    } else {
                                                        kVar3 = kVar2;
                                                    }
                                                    if (iVar3 != null) {
                                                        i25 = iVar3.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    if (Intrinsics.d(kVar3.d, com.gamericefishpro.space.u2.k.e.d) >= 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (i25 == 1) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (!z17) {
                                                        if (z16) {
                                                            i26 = 1;
                                                        } else if (z17) {
                                                            i26 = 2;
                                                        } else {
                                                            i26 = 0;
                                                        }
                                                    } else if (z16) {
                                                        i26 = 1;
                                                    } else if (z17) {
                                                        i26 = 2;
                                                    } else {
                                                        i26 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(i26);
                                                    i27 = 33;
                                                    spannableString4.setSpan(styleSpan3, i23, i24, 33);
                                                }
                                                if (lVar5 != null) {
                                                    i28 = lVar5.a;
                                                    if ((i28 | 1) == i28) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i23, i24, i27);
                                                    }
                                                    if ((i28 | 2) == i28) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i23, i24, i27);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(pVar.a), i23, i24, i27);
                                                }
                                                d5.Y(spannableString4, bVar4, i23, i24);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(com.gamericefishpro.space.o1.o.y(j)), i23, i24, i27);
                                                }
                                                i22 = i313 + 1;
                                                spannableString2 = spannableString4;
                                                arrayList3 = arrayList8;
                                                size9 = i314;
                                                uVar = uVar4;
                                                lVar = lVar7;
                                                accessibilityNodeInfo = accessibilityNodeInfo8;
                                                resources = resources5;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo9;
                                                h0Var = h0Var5;
                                                hVar = hVar7;
                                            }
                                        }
                                        lVar2 = lVar;
                                        uVar2 = uVar;
                                        spannableString3 = spannableString2;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        resources2 = resources;
                                        h0Var2 = h0Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        com.gamericefishpro.space.e4.h hVar8 = hVar;
                                        int length4 = str6.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i21 = 0; i21 < size8; i21++) {
                                                Object obj5 = list4.get(i21);
                                                cVar5 = (com.gamericefishpro.space.r2.c) obj5;
                                                if (!(cVar5.a instanceof com.gamericefishpro.space.r2.k0)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
                                        size3 = arrayList4.size();
                                        for (i12 = 0; i12 < size3; i12++) {
                                            com.gamericefishpro.space.r2.c cVar11 = (com.gamericefishpro.space.r2.c) arrayList4.get(i12);
                                            k0Var = (com.gamericefishpro.space.r2.k0) cVar11.a;
                                            i19 = cVar11.b;
                                            i20 = cVar11.c;
                                            if (k0Var instanceof com.gamericefishpro.space.r2.k0) {
                                                throw new com.gamericefishpro.space.oh.k();
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(k0Var.a).build(), i19, i20, 33);
                                        }
                                        int length5 = str6.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            for (i18 = 0; i18 < size7; i18++) {
                                                Object obj6 = list4.get(i18);
                                                cVar4 = (com.gamericefishpro.space.r2.c) obj6;
                                                if (!(cVar4.a instanceof com.gamericefishpro.space.r2.j0)) {
                                                }
                                            }
                                        } else {
                                            arrayList5 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList5, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
                                        size4 = arrayList5.size();
                                        for (i13 = 0; i13 < size4; i13++) {
                                            com.gamericefishpro.space.r2.c cVar12 = (com.gamericefishpro.space.r2.c) arrayList5.get(i13);
                                            j0Var = (com.gamericefishpro.space.r2.j0) cVar12.a;
                                            int i315 = cVar12.b;
                                            int i316 = cVar12.c;
                                            weakHashMap3 = (WeakHashMap) bVar.e;
                                            uRLSpan2 = weakHashMap3.get(j0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(j0Var.a);
                                                weakHashMap3.put(j0Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i315, i316, 33);
                                        }
                                        int length6 = str6.length();
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size6 = list4.size();
                                            for (i17 = 0; i17 < size6; i17++) {
                                                Object obj7 = list4.get(i17);
                                                cVar3 = (com.gamericefishpro.space.r2.c) obj7;
                                                if (!(cVar3.a instanceof com.gamericefishpro.space.r2.k)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = com.gamericefishpro.space.ph.g0.d;
                                        }
                                        Intrinsics.c(arrayList6, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
                                        size5 = arrayList6.size();
                                        for (i14 = 0; i14 < size5; i14++) {
                                            cVar = (com.gamericefishpro.space.r2.c) arrayList6.get(i14);
                                            i15 = cVar.b;
                                            obj = cVar.a;
                                            i16 = cVar.c;
                                            if (i15 != i16) {
                                                kVar = (com.gamericefishpro.space.r2.k) obj;
                                                if (kVar instanceof com.gamericefishpro.space.r2.j) {
                                                    Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                    jVar = (com.gamericefishpro.space.r2.j) obj;
                                                    cVar2 = new com.gamericefishpro.space.r2.c(i15, i16, jVar);
                                                    weakHashMap2 = (WeakHashMap) bVar.i;
                                                    uRLSpan = weakHashMap2.get(cVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(jVar.a);
                                                        weakHashMap2.put(cVar2, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) bVar.v;
                                                    fVar = weakHashMap.get(cVar);
                                                    if (fVar == null) {
                                                        fVar = new com.gamericefishpro.space.y2.f(kVar);
                                                        weakHashMap.put(cVar, fVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) fVar, i15, i16, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) z.P(spannableString3);
                                        hVar3 = hVar8;
                                    } else {
                                        lVar2 = lVar;
                                        zVar2 = zVar2;
                                        uVar2 = uVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        resources2 = resources;
                                        h0Var2 = h0Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        hVar3 = hVar;
                                        spannableString = null;
                                    }
                                    hVar3.k(spannableString);
                                    vVar = com.gamericefishpro.space.o2.s.J;
                                    h0Var3 = h0Var2;
                                    if (h0Var3.c(vVar)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG15 = h0Var3.g(vVar);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG15);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    Resources resources6 = resources2;
                                    strH = f0.h(oVar3, resources6);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        com.gamericefishpro.space.d4.i.h(accessibilityNodeInfo4, strH);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    accessibilityNodeInfo4.setCheckable(f0.g(oVar3));
                                    objG2 = h0Var3.g(com.gamericefishpro.space.o2.s.H);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    aVar = (com.gamericefishpro.space.q2.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == com.gamericefishpro.space.q2.a.d) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (aVar == com.gamericefishpro.space.q2.a.e) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                        Unit unit23 = Unit.a;
                                    }
                                    objG3 = h0Var3.g(com.gamericefishpro.space.o2.s.G);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (hVar2 == null) {
                                            i5 = 4;
                                        } else {
                                            i5 = 4;
                                            if (hVar2.a == 4) {
                                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                                            }
                                            Unit unit24 = Unit.a;
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                        Unit unit25 = Unit.a;
                                    } else {
                                        i5 = 4;
                                    }
                                    lVar3 = lVar2;
                                    if (lVar3.i) {
                                        objG4 = h0Var3.g(com.gamericefishpro.space.o2.s.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    } else {
                                        objG4 = h0Var3.g(com.gamericefishpro.space.o2.s.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) CollectionsKt.firstOrNull(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    }
                                    objG5 = h0Var3.g(com.gamericefishpro.space.o2.s.y);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        oVarL2 = oVar3;
                                        while (true) {
                                            if (oVarL2 != null) {
                                                lVar4 = oVarL2.d;
                                                vVar6 = com.gamericefishpro.space.o2.t.a;
                                                if (lVar4.d.c(vVar6)) {
                                                    zBooleanValue = ((Boolean) lVar4.d(vVar6)).booleanValue();
                                                } else {
                                                    oVarL2 = oVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = h0Var3.g(com.gamericefishpro.space.o2.s.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((Unit) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setHeading(true);
                                        } else {
                                            hVar3.h(2, true);
                                        }
                                        Unit unit26 = Unit.a;
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = uVar2.d(oVar3.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                            Unit unit27 = Unit.a;
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(h0Var3.c(com.gamericefishpro.space.o2.s.I));
                                    accessibilityNodeInfo5.setEditable(h0Var3.c(com.gamericefishpro.space.o2.s.L));
                                    objG7 = h0Var3.g(com.gamericefishpro.space.o2.s.M);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(f0.b(oVar3));
                                    vVar2 = com.gamericefishpro.space.o2.s.k;
                                    accessibilityNodeInfo4.setFocusable(h0Var3.c(vVar2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) lVar3.d(vVar2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            hVar3.a(2);
                                            zVar = zVar2;
                                            zVar.F = i6;
                                        } else {
                                            zVar = zVar2;
                                            z2 = true;
                                            hVar3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(com.gamericefishpro.space.o2.r.e(oVar3) ^ z2);
                                        com.gamericefishpro.space.m5.a.s(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.j));
                                        accessibilityNodeInfo4.setClickable(false);
                                        aVar2 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.b);
                                        if (aVar2 != null) {
                                            boolean zA6 = Intrinsics.a(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.G), Boolean.TRUE);
                                            if (hVar2 == null) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            if (z12) {
                                                z13 = true;
                                            } else {
                                                if (hVar2 == null) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                if (z15) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                            }
                                            if (z13) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                            }
                                            accessibilityNodeInfo4.setClickable(z14);
                                            if (f0.b(oVar3)) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(16, aVar2.a));
                                            }
                                            Unit unit119 = Unit.a;
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        aVar3 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.c);
                                        if (aVar3 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (f0.b(oVar3)) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(32, aVar3.a));
                                            }
                                            Unit unit28 = Unit.a;
                                        }
                                        aVar4 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.p);
                                        if (aVar4 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(16384, aVar4.a));
                                            Unit unit1110 = Unit.a;
                                        }
                                        if (f0.b(oVar3)) {
                                            aVar10 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.k);
                                            if (aVar10 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(2097152, aVar10.a));
                                                Unit unit1111 = Unit.a;
                                            }
                                            aVar11 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.o);
                                            if (aVar11 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                                Unit unit1112 = Unit.a;
                                            }
                                            aVar12 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.q);
                                            if (aVar12 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(65536, aVar12.a));
                                                Unit unit1113 = Unit.a;
                                            }
                                            aVar13 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.r);
                                            if (aVar13 != null) {
                                                if (accessibilityNodeInfo5.isFocused()) {
                                                    primaryClipDescription = tVar2.m7getClipboardManager().a.getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        hVar3.b(new com.gamericefishpro.space.e4.d(32768, aVar13.a));
                                                    }
                                                }
                                                Unit unit1114 = Unit.a;
                                            }
                                        }
                                        strT = z.t(oVar3);
                                        if (strT != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo5.setTextSelection(zVar.r(oVar3), zVar.q(oVar3));
                                            aVar9 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.j);
                                            if (aVar9 != null) {
                                                str4 = aVar9.a;
                                            } else {
                                                str4 = null;
                                            }
                                            hVar3.b(new com.gamericefishpro.space.e4.d(131072, str4));
                                            hVar3.a(256);
                                            hVar3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.a);
                                            if (list3 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                if (oVar3.d.d.c(com.gamericefishpro.space.o2.s.E)) {
                                                    objG14 = oVar3.d.d.g(com.gamericefishpro.space.o2.s.k);
                                                    if (objG14 == null) {
                                                        objG14 = null;
                                                    }
                                                    if (!Intrinsics.a(objG14, Boolean.TRUE)) {
                                                        f0VarV = oVar3.c.v();
                                                        while (true) {
                                                            if (f0VarV == null) {
                                                                f0VarV = null;
                                                            } else {
                                                                lVarX2 = f0VarV.x();
                                                                if (lVarX2 == null) {
                                                                }
                                                                f0VarV = f0VarV.v();
                                                            }
                                                        }
                                                        if (f0VarV != null) {
                                                            lVarX = f0VarV.x();
                                                            if (lVarX != null) {
                                                                objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                                if (objG13 == null) {
                                                                    objG13 = null;
                                                                }
                                                                zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    f0VarV = oVar3.c.v();
                                                    while (true) {
                                                        if (f0VarV == null) {
                                                            f0VarV = null;
                                                        } else {
                                                            lVarX2 = f0VarV.x();
                                                            if (lVarX2 == null) {
                                                            }
                                                            f0VarV = f0VarV.v();
                                                        }
                                                    }
                                                    if (f0VarV != null) {
                                                        lVarX = f0VarV.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                            if (objG13 == null) {
                                                                objG13 = null;
                                                            }
                                                            zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z11) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = hVar3.g();
                                        if (charSequenceG != null) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (h0Var3.c(com.gamericefishpro.space.o2.s.y)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (h0Var3.c(com.gamericefishpro.space.o2.s.N)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                        gVar = (com.gamericefishpro.space.o2.g) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.c);
                                        if (gVar != null) {
                                            vVar5 = com.gamericefishpro.space.o2.k.i;
                                            if (h0Var3.c(vVar5)) {
                                                hVar3.i("android.widget.SeekBar");
                                            } else {
                                                hVar3.i("android.widget.ProgressBar");
                                            }
                                            if (gVar != com.gamericefishpro.space.o2.g.b) {
                                                accessibilityNodeInfo4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new com.gamericefishpro.space.e4.g(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f)).d);
                                            }
                                            if (oVar3.m().d.c(vVar5)) {
                                                fFloatValue = fValueOf.floatValue();
                                                fFloatValue2 = fValueOf.floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (0.0f < fFloatValue) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                }
                                                fFloatValue3 = fValueOf.floatValue();
                                                fFloatValue4 = fValueOf.floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (0.0f > fFloatValue3) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                }
                                            }
                                        }
                                        i7 = Build.VERSION.SDK_INT;
                                        if (f0.b(oVar3)) {
                                            objG12 = oVar3.d.d.g(com.gamericefishpro.space.o2.k.i);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            aVar8 = (com.gamericefishpro.space.o2.a) objG12;
                                            if (aVar8 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                            }
                                        }
                                        com.gamericefishpro.space.hj.c.T(hVar3, oVar3);
                                        com.gamericefishpro.space.hj.c.U(hVar3, oVar3);
                                        iVar = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.u);
                                        com.gamericefishpro.space.o2.a aVar16 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.d);
                                        if (iVar != null) {
                                            objG10 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                            if (objG10 == null) {
                                                objG10 = null;
                                            }
                                            if (objG10 == null) {
                                                objG11 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                                if (objG11 == null) {
                                                    objG11 = null;
                                                }
                                                if (objG11 != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                            } else {
                                                z7 = true;
                                            }
                                            if (!z7) {
                                                hVar3.i("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) iVar.b.invoke()).floatValue() > 0.0f) {
                                                hVar3.j(true);
                                            }
                                            if (f0.b(oVar3)) {
                                                if (z.z(iVar)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                    f0Var = f0Var2;
                                                    if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        dVar2 = com.gamericefishpro.space.e4.d.n;
                                                    } else {
                                                        dVar2 = com.gamericefishpro.space.e4.d.p;
                                                    }
                                                    hVar3.b(dVar2);
                                                } else {
                                                    f0Var = f0Var2;
                                                }
                                                if (z.y(iVar)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                    if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        dVar = com.gamericefishpro.space.e4.d.p;
                                                    } else {
                                                        dVar = com.gamericefishpro.space.e4.d.n;
                                                    }
                                                    hVar3.b(dVar);
                                                }
                                            }
                                        }
                                        iVar2 = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.v);
                                        if (iVar2 != null) {
                                            objG8 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                            if (objG8 == null) {
                                                objG8 = null;
                                            }
                                            if (objG8 == null) {
                                                objG9 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                                if (objG9 == null) {
                                                    objG9 = null;
                                                }
                                                if (objG9 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                hVar3.i("android.widget.ScrollView");
                                            }
                                            if (((Number) iVar2.b.invoke()).floatValue() > 0.0f) {
                                                hVar3.j(true);
                                            }
                                            if (f0.b(oVar3)) {
                                                if (z.z(iVar2)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                    hVar3.b(com.gamericefishpro.space.e4.d.o);
                                                }
                                                if (z.y(iVar2)) {
                                                    hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                    hVar3.b(com.gamericefishpro.space.e4.d.m);
                                                }
                                            }
                                        }
                                        if (i7 >= 29) {
                                            f0.d(hVar3, oVar3);
                                        }
                                        charSequence = (CharSequence) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.d);
                                        if (i7 >= 28) {
                                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (f0.b(oVar3)) {
                                            aVar5 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.s);
                                            if (aVar5 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(262144, aVar5.a));
                                                Unit unit1115 = Unit.a;
                                            }
                                            aVar6 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.t);
                                            if (aVar6 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(524288, aVar6.a));
                                                Unit unit1116 = Unit.a;
                                            }
                                            aVar7 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.u);
                                            if (aVar7 != null) {
                                                hVar3.b(new com.gamericefishpro.space.e4.d(1048576, aVar7.a));
                                                Unit unit1117 = Unit.a;
                                            }
                                            lVarM = oVar3.m();
                                            vVar3 = com.gamericefishpro.space.o2.k.w;
                                            if (lVarM.d.c(vVar3)) {
                                                list2 = (List) oVar3.m().d(vVar3);
                                                size2 = list2.size();
                                                vVar4 = z.h0;
                                                if (size2 < vVar4.b) {
                                                    throw new IllegalStateException("Can't have more than " + vVar4.b + " custom actions for one widget");
                                                }
                                                com.gamericefishpro.space.t.s0 s0Var6 = new com.gamericefishpro.space.t.s0(0);
                                                com.gamericefishpro.space.t.c0 c0VarA3 = com.gamericefishpro.space.t.m0.a();
                                                s0Var3 = s0Var2;
                                                if (s0Var3.d) {
                                                    com.gamericefishpro.space.t.r.a(s0Var3);
                                                }
                                                if (com.gamericefishpro.space.u.a.a(s0Var3.v, i6, s0Var3.e) >= 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    c0Var = (com.gamericefishpro.space.t.c0) s0Var3.c(i6);
                                                    iArr = vVar4.a;
                                                    i8 = vVar4.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i317 = iArr[i9];
                                                        int i46 = i8;
                                                        i11 = i10 + 1;
                                                        int i47 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                                                        }
                                                        iArrCopyOf[i10] = i317;
                                                        i9 = i47 + 1;
                                                        i10 = i11;
                                                        i8 = i46;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                        Intrinsics.b(c0Var);
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        com.gamericefishpro.space.m5.a.s(arrayList2.get(0));
                                                        if (i10 > 0) {
                                                            int i48 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
                                                        throw null;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                    vVar4.b(0);
                                                    throw null;
                                                }
                                                zVar.L.e(i6, s0Var6);
                                                s0Var3.e(i6, c0VarA3);
                                            }
                                        }
                                        zC = f0.c(oVar3, resources6);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setScreenReaderFocusable(zC);
                                        } else {
                                            hVar3.h(1, zC);
                                        }
                                        iD = zVar.V.d(i6);
                                        if (iD != -1) {
                                            jVarP2 = f0.p(tVar2.getAndroidViewsHandler$ui(), iD);
                                            if (jVarP2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(jVarP2);
                                                tVar = tVar2;
                                            } else {
                                                tVar = tVar2;
                                                accessibilityNodeInfo4.setTraversalBefore(tVar, iD);
                                            }
                                            bundle = null;
                                            zVar.j(i6, hVar3, zVar.X, null);
                                        } else {
                                            bundle = null;
                                            tVar = tVar2;
                                        }
                                        iD2 = zVar.W.d(i6);
                                        if (iD2 != -1) {
                                            accessibilityNodeInfo4.setTraversalAfter(jVarP);
                                            zVar.j(i6, hVar3, zVar.Y, bundle);
                                        }
                                        str3 = (String) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.t.b);
                                        if (str3 != null) {
                                            hVar3.i(str3);
                                            Unit unit1118 = Unit.a;
                                        }
                                        hVar4 = hVar3;
                                    } else {
                                        zVar = zVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(com.gamericefishpro.space.o2.r.e(oVar3) ^ z2);
                                    com.gamericefishpro.space.m5.a.s(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.j));
                                    accessibilityNodeInfo4.setClickable(false);
                                    aVar2 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.b);
                                    if (aVar2 != null) {
                                        boolean zA7 = Intrinsics.a(com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.G), Boolean.TRUE);
                                        if (hVar2 == null) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (z12) {
                                            z13 = true;
                                        } else {
                                            if (hVar2 == null) {
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z14);
                                        if (f0.b(oVar3)) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(16, aVar2.a));
                                        }
                                        Unit unit1119 = Unit.a;
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    aVar3 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.c);
                                    if (aVar3 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (f0.b(oVar3)) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(32, aVar3.a));
                                        }
                                        Unit unit29 = Unit.a;
                                    }
                                    aVar4 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.p);
                                    if (aVar4 != null) {
                                        hVar3.b(new com.gamericefishpro.space.e4.d(16384, aVar4.a));
                                        Unit unit11110 = Unit.a;
                                    }
                                    if (f0.b(oVar3)) {
                                        aVar10 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.k);
                                        if (aVar10 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(2097152, aVar10.a));
                                            Unit unit11111 = Unit.a;
                                        }
                                        aVar11 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.o);
                                        if (aVar11 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            Unit unit11112 = Unit.a;
                                        }
                                        aVar12 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.q);
                                        if (aVar12 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(65536, aVar12.a));
                                            Unit unit11113 = Unit.a;
                                        }
                                        aVar13 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.r);
                                        if (aVar13 != null) {
                                            if (accessibilityNodeInfo5.isFocused()) {
                                                primaryClipDescription = tVar2.m7getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    hVar3.b(new com.gamericefishpro.space.e4.d(32768, aVar13.a));
                                                }
                                            }
                                            Unit unit11114 = Unit.a;
                                        }
                                    }
                                    strT = z.t(oVar3);
                                    if (strT != null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        accessibilityNodeInfo5.setTextSelection(zVar.r(oVar3), zVar.q(oVar3));
                                        aVar9 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.k.j);
                                        if (aVar9 != null) {
                                            str4 = aVar9.a;
                                        } else {
                                            str4 = null;
                                        }
                                        hVar3.b(new com.gamericefishpro.space.e4.d(131072, str4));
                                        hVar3.a(256);
                                        hVar3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.a);
                                        if (list3 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            if (oVar3.d.d.c(com.gamericefishpro.space.o2.s.E)) {
                                                objG14 = oVar3.d.d.g(com.gamericefishpro.space.o2.s.k);
                                                if (objG14 == null) {
                                                    objG14 = null;
                                                }
                                                if (!Intrinsics.a(objG14, Boolean.TRUE)) {
                                                    f0VarV = oVar3.c.v();
                                                    while (true) {
                                                        if (f0VarV == null) {
                                                            f0VarV = null;
                                                        } else {
                                                            lVarX2 = f0VarV.x();
                                                            if (lVarX2 == null) {
                                                            }
                                                            f0VarV = f0VarV.v();
                                                        }
                                                    }
                                                    if (f0VarV != null) {
                                                        lVarX = f0VarV.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                            if (objG13 == null) {
                                                                objG13 = null;
                                                            }
                                                            zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                f0VarV = oVar3.c.v();
                                                while (true) {
                                                    if (f0VarV == null) {
                                                        f0VarV = null;
                                                    } else {
                                                        lVarX2 = f0VarV.x();
                                                        if (lVarX2 == null) {
                                                        }
                                                        f0VarV = f0VarV.v();
                                                    }
                                                }
                                                if (f0VarV != null) {
                                                    lVarX = f0VarV.x();
                                                    if (lVarX != null) {
                                                        objG13 = lVarX.d.g(com.gamericefishpro.space.o2.s.k);
                                                        if (objG13 == null) {
                                                            objG13 = null;
                                                        }
                                                        zA = Intrinsics.a(objG13, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z11) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceG = hVar3.g();
                                    if (charSequenceG != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (h0Var3.c(com.gamericefishpro.space.o2.s.y)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (h0Var3.c(com.gamericefishpro.space.o2.s.N)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                    gVar = (com.gamericefishpro.space.o2.g) com.gamericefishpro.space.o2.r.d(lVar3, com.gamericefishpro.space.o2.s.c);
                                    if (gVar != null) {
                                        vVar5 = com.gamericefishpro.space.o2.k.i;
                                        if (h0Var3.c(vVar5)) {
                                            hVar3.i("android.widget.SeekBar");
                                        } else {
                                            hVar3.i("android.widget.ProgressBar");
                                        }
                                        if (gVar != com.gamericefishpro.space.o2.g.b) {
                                            accessibilityNodeInfo4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new com.gamericefishpro.space.e4.g(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f)).d);
                                        }
                                        if (oVar3.m().d.c(vVar5)) {
                                            fFloatValue = fValueOf.floatValue();
                                            fFloatValue2 = fValueOf.floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (0.0f < fFloatValue) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                            }
                                            fFloatValue3 = fValueOf.floatValue();
                                            fFloatValue4 = fValueOf.floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (0.0f > fFloatValue3) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                            }
                                        }
                                    }
                                    i7 = Build.VERSION.SDK_INT;
                                    if (f0.b(oVar3)) {
                                        objG12 = oVar3.d.d.g(com.gamericefishpro.space.o2.k.i);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        aVar8 = (com.gamericefishpro.space.o2.a) objG12;
                                        if (aVar8 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                    }
                                    com.gamericefishpro.space.hj.c.T(hVar3, oVar3);
                                    com.gamericefishpro.space.hj.c.U(hVar3, oVar3);
                                    iVar = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.u);
                                    com.gamericefishpro.space.o2.a aVar17 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.d);
                                    if (iVar != null) {
                                        objG10 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        if (objG10 == null) {
                                            objG11 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                        } else {
                                            z7 = true;
                                        }
                                        if (!z7) {
                                            hVar3.i("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) iVar.b.invoke()).floatValue() > 0.0f) {
                                            hVar3.j(true);
                                        }
                                        if (f0.b(oVar3)) {
                                            if (z.z(iVar)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                f0Var = f0Var2;
                                                if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    dVar2 = com.gamericefishpro.space.e4.d.p;
                                                } else {
                                                    dVar2 = com.gamericefishpro.space.e4.d.n;
                                                }
                                                hVar3.b(dVar2);
                                            } else {
                                                f0Var = f0Var2;
                                            }
                                            if (z.y(iVar)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    dVar = com.gamericefishpro.space.e4.d.n;
                                                } else {
                                                    dVar = com.gamericefishpro.space.e4.d.p;
                                                }
                                                hVar3.b(dVar);
                                            }
                                        }
                                    }
                                    iVar2 = (com.gamericefishpro.space.o2.i) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.v);
                                    if (iVar2 != null) {
                                        objG8 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.f);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        if (objG8 == null) {
                                            objG9 = oVar3.k().d.g(com.gamericefishpro.space.o2.s.e);
                                            if (objG9 == null) {
                                                objG9 = null;
                                            }
                                            if (objG9 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                        } else {
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            hVar3.i("android.widget.ScrollView");
                                        }
                                        if (((Number) iVar2.b.invoke()).floatValue() > 0.0f) {
                                            hVar3.j(true);
                                        }
                                        if (f0.b(oVar3)) {
                                            if (z.z(iVar2)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.h);
                                                hVar3.b(com.gamericefishpro.space.e4.d.o);
                                            }
                                            if (z.y(iVar2)) {
                                                hVar3.b(com.gamericefishpro.space.e4.d.i);
                                                hVar3.b(com.gamericefishpro.space.e4.d.m);
                                            }
                                        }
                                    }
                                    if (i7 >= 29) {
                                        f0.d(hVar3, oVar3);
                                    }
                                    charSequence = (CharSequence) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.s.d);
                                    if (i7 >= 28) {
                                        accessibilityNodeInfo4.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (f0.b(oVar3)) {
                                        aVar5 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.s);
                                        if (aVar5 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(262144, aVar5.a));
                                            Unit unit11115 = Unit.a;
                                        }
                                        aVar6 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.t);
                                        if (aVar6 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(524288, aVar6.a));
                                            Unit unit11116 = Unit.a;
                                        }
                                        aVar7 = (com.gamericefishpro.space.o2.a) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.k.u);
                                        if (aVar7 != null) {
                                            hVar3.b(new com.gamericefishpro.space.e4.d(1048576, aVar7.a));
                                            Unit unit11117 = Unit.a;
                                        }
                                        lVarM = oVar3.m();
                                        vVar3 = com.gamericefishpro.space.o2.k.w;
                                        if (lVarM.d.c(vVar3)) {
                                            list2 = (List) oVar3.m().d(vVar3);
                                            size2 = list2.size();
                                            vVar4 = z.h0;
                                            if (size2 < vVar4.b) {
                                                throw new IllegalStateException("Can't have more than " + vVar4.b + " custom actions for one widget");
                                            }
                                            com.gamericefishpro.space.t.s0 s0Var7 = new com.gamericefishpro.space.t.s0(0);
                                            com.gamericefishpro.space.t.c0 c0VarA4 = com.gamericefishpro.space.t.m0.a();
                                            s0Var3 = s0Var2;
                                            if (s0Var3.d) {
                                                com.gamericefishpro.space.t.r.a(s0Var3);
                                            }
                                            if (com.gamericefishpro.space.u.a.a(s0Var3.v, i6, s0Var3.e) >= 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                c0Var = (com.gamericefishpro.space.t.c0) s0Var3.c(i6);
                                                iArr = vVar4.a;
                                                i8 = vVar4.b;
                                                iArrCopyOf = new int[16];
                                                i9 = 0;
                                                i10 = 0;
                                                while (i9 < i8) {
                                                    int i318 = iArr[i9];
                                                    int i49 = i8;
                                                    i11 = i10 + 1;
                                                    int i410 = i9;
                                                    if (iArrCopyOf.length < i11) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                                                    }
                                                    iArrCopyOf[i10] = i318;
                                                    i9 = i410 + 1;
                                                    i10 = i11;
                                                    i8 = i49;
                                                }
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                    Intrinsics.b(c0Var);
                                                    throw null;
                                                }
                                                if (arrayList2.size() > 0) {
                                                    com.gamericefishpro.space.m5.a.s(arrayList2.get(0));
                                                    if (i10 > 0) {
                                                        int i411 = iArrCopyOf[0];
                                                        throw null;
                                                    }
                                                    com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
                                                    throw null;
                                                }
                                            } else if (list2.size() > 0) {
                                                com.gamericefishpro.space.m5.a.s(list2.get(0));
                                                vVar4.b(0);
                                                throw null;
                                            }
                                            zVar.L.e(i6, s0Var7);
                                            s0Var3.e(i6, c0VarA4);
                                        }
                                    }
                                    zC = f0.c(oVar3, resources6);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo4.setScreenReaderFocusable(zC);
                                    } else {
                                        hVar3.h(1, zC);
                                    }
                                    iD = zVar.V.d(i6);
                                    if (iD != -1) {
                                        jVarP2 = f0.p(tVar2.getAndroidViewsHandler$ui(), iD);
                                        if (jVarP2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(jVarP2);
                                            tVar = tVar2;
                                        } else {
                                            tVar = tVar2;
                                            accessibilityNodeInfo4.setTraversalBefore(tVar, iD);
                                        }
                                        bundle = null;
                                        zVar.j(i6, hVar3, zVar.X, null);
                                    } else {
                                        bundle = null;
                                        tVar = tVar2;
                                    }
                                    iD2 = zVar.W.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(jVarP);
                                        zVar.j(i6, hVar3, zVar.Y, bundle);
                                    }
                                    str3 = (String) com.gamericefishpro.space.o2.r.d(oVar3.m(), com.gamericefishpro.space.o2.t.b);
                                    if (str3 != null) {
                                        hVar3.i(str3);
                                        Unit unit11118 = Unit.a;
                                    }
                                    hVar4 = hVar3;
                                }
                            }
                        } else {
                            i6 = i;
                            zVar = zVar2;
                            hVar4 = null;
                        }
                    }
                }
                if (zVar.I) {
                    if (i6 == zVar.E) {
                        zVar.G = hVar4;
                    }
                    if (i6 == zVar.F) {
                        zVar.H = hVar4;
                    }
                }
                return hVar4;
            default:
                return new com.gamericefishpro.space.e4.h(AccessibilityNodeInfo.obtain(((com.gamericefishpro.space.k4.a) bVar2).n(i).a));
        }
    }

    @Override // com.gamericefishpro.space.vb.c
    public final com.gamericefishpro.space.e4.h l(int i) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = (z) this.w;
                if (i != 1) {
                    if (i == 2) {
                        return j(zVar.E);
                    }
                    throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Unknown focus type: "));
                }
                int i2 = zVar.F;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return j(i2);
            default:
                com.gamericefishpro.space.k4.a aVar = (com.gamericefishpro.space.k4.a) this.w;
                int i3 = i == 2 ? aVar.D : aVar.E;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return j(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:181:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:277:0x044a  */
    /* JADX WARN: Code duplicated, block: B:279:0x044e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0450  */
    /* JADX WARN: Code duplicated, block: B:283:0x0455  */
    /* JADX WARN: Code duplicated, block: B:284:0x0457  */
    /* JADX WARN: Code duplicated, block: B:287:0x045d  */
    /* JADX WARN: Code duplicated, block: B:288:0x045f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0465  */
    /* JADX WARN: Code duplicated, block: B:292:0x0467  */
    /* JADX WARN: Code duplicated, block: B:295:0x046d  */
    /* JADX WARN: Code duplicated, block: B:296:0x046f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0475  */
    /* JADX WARN: Code duplicated, block: B:300:0x0477  */
    /* JADX WARN: Code duplicated, block: B:307:0x0483  */
    /* JADX WARN: Code duplicated, block: B:314:0x048f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0494  */
    /* JADX WARN: Code duplicated, block: B:319:0x049c  */
    /* JADX WARN: Code duplicated, block: B:322:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:325:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:332:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:337:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:342:0x0506  */
    /* JADX WARN: Code duplicated, block: B:345:0x050f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0516  */
    /* JADX WARN: Code duplicated, block: B:351:0x0520  */
    /* JADX WARN: Code duplicated, block: B:354:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:398:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:401:0x05bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:403:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:404:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:406:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:407:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:410:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:412:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:418:0x0601  */
    /* JADX WARN: Code duplicated, block: B:420:0x0605  */
    /* JADX WARN: Code duplicated, block: B:422:0x060d  */
    /* JADX WARN: Code duplicated, block: B:423:0x060f  */
    /* JADX WARN: Code duplicated, block: B:425:0x0613  */
    /* JADX WARN: Code duplicated, block: B:427:0x0619  */
    /* JADX WARN: Code duplicated, block: B:428:0x061b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0620  */
    /* JADX WARN: Code duplicated, block: B:493:0x0712 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:494:0x0714  */
    /* JADX WARN: Code duplicated, block: B:496:0x0722  */
    /* JADX WARN: Code duplicated, block: B:497:0x0724  */
    /* JADX WARN: Code duplicated, block: B:500:0x0729  */
    /* JADX WARN: Code duplicated, block: B:501:0x072b  */
    /* JADX WARN: Code duplicated, block: B:507:0x0740  */
    /* JADX WARN: Code duplicated, block: B:512:0x074e  */
    /* JADX WARN: Code duplicated, block: B:525:0x0766  */
    /* JADX WARN: Code duplicated, block: B:530:0x077f  */
    /* JADX WARN: Code duplicated, block: B:537:0x0791  */
    /* JADX WARN: Code duplicated, block: B:539:0x0795  */
    /* JADX WARN: Code duplicated, block: B:542:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:544:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:556:0x0820  */
    /* JADX WARN: Code duplicated, block: B:558:0x0827 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:559:0x0829  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:560:0x082b  */
    /* JADX WARN: Code duplicated, block: B:563:0x0832  */
    /* JADX WARN: Code duplicated, block: B:564:0x0837  */
    /* JADX WARN: Code duplicated, block: B:567:0x083f  */
    /* JADX WARN: Code duplicated, block: B:569:0x0849  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:581:0x086f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:582:0x0871  */
    /* JADX WARN: Code duplicated, block: B:583:0x0874  */
    /* JADX WARN: Code duplicated, block: B:586:0x0879  */
    /* JADX WARN: Code duplicated, block: B:587:0x087c  */
    /* JADX WARN: Code duplicated, block: B:590:0x0897  */
    /* JADX WARN: Code duplicated, block: B:592:0x089e  */
    /* JADX WARN: Code duplicated, block: B:593:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:595:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:596:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:604:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:606:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:607:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:609:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:611:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:612:0x08df  */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x036c, code lost:
    
        if (((java.lang.Boolean) r1.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r16))).booleanValue() == true) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x023b, code lost:
    
        r2 = null;
     */
    @Override // com.gamericefishpro.space.vb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(int i, int i2, Bundle bundle) {
        boolean z;
        com.gamericefishpro.space.o2.o oVar;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        Integer num;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        Integer num2;
        String strT;
        String strT2;
        com.gamericefishpro.space.f.b bVar;
        int iQ;
        int[] iArrX;
        int i5;
        int i6;
        int iR;
        int i7;
        int i8;
        int length;
        com.gamericefishpro.space.r2.f0 f0VarK;
        com.gamericefishpro.space.f.b bVar2;
        Function0 function0;
        int i9;
        int i10;
        Function0 function1;
        Function0 function2;
        Function0 function3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objG;
        com.gamericefishpro.space.o2.g gVar;
        Object objG2;
        long jB;
        Object objG3;
        com.gamericefishpro.space.o2.a aVar;
        Float f;
        Object objG4;
        com.gamericefishpro.space.o2.a aVar2;
        Object objG5;
        com.gamericefishpro.space.o2.i iVar;
        Object objG6;
        com.gamericefishpro.space.o2.i iVar2;
        float fIntBitsToFloat;
        com.gamericefishpro.space.o2.v vVar;
        Object objG7;
        Object obj;
        com.gamericefishpro.space.o2.a aVar3;
        Function0 function4;
        Object objG8;
        Object obj2;
        com.gamericefishpro.space.o2.a aVar4;
        Function0 function5;
        Function1 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        Function0 function10;
        Function0 function11;
        Function1 function12;
        com.gamericefishpro.space.o2.a aVar5;
        long jH;
        Function1 function13;
        Function0 function14;
        Function0 function15;
        Function0 function16;
        Function0 function17;
        Function0 function18;
        int i11;
        int i12 = this.v;
        com.gamericefishpro.space.d4.b bVar3 = this.w;
        boolean z16 = false;
        switch (i12) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = (z) bVar3;
                AccessibilityManager accessibilityManager = zVar.z;
                Float fValueOf = Float.valueOf(0.0f);
                t tVar = zVar.v;
                com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) zVar.s().b(i);
                if (pVar == null || (oVar = pVar.a) == null) {
                    z = false;
                } else {
                    com.gamericefishpro.space.h2.f0 f0Var = oVar.c;
                    int i13 = oVar.g;
                    com.gamericefishpro.space.o2.l lVar = oVar.d;
                    com.gamericefishpro.space.t.h0 h0Var = lVar.d;
                    Object objG9 = h0Var.g(com.gamericefishpro.space.o2.s.n);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.a(objG9, bool)) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                if (i2 != 256 || i2 == 512) {
                                    if (bundle != null) {
                                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                        z6 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                        if (i2 == 256) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        num2 = zVar.O;
                                        if (num2 != null || i13 != num2.intValue()) {
                                            zVar.N = -1;
                                            zVar.O = Integer.valueOf(i13);
                                        }
                                        strT = z.t(oVar);
                                        if (strT != null && strT.length() != 0) {
                                            strT2 = z.t(oVar);
                                            if (strT2 != null || strT2.length() == 0) {
                                                bVar = null;
                                            } else if (i4 == 1) {
                                                Locale locale = tVar.getContext().getResources().getConfiguration().locale;
                                                if (b.e == null) {
                                                    b bVar4 = new b(0);
                                                    bVar4.d = BreakIterator.getCharacterInstance(locale);
                                                    b.e = bVar4;
                                                }
                                                b bVar5 = b.e;
                                                Intrinsics.c(bVar5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                                bVar5.y(strT2);
                                                bVar = bVar5;
                                            } else if (i4 == 2) {
                                                Locale locale2 = tVar.getContext().getResources().getConfiguration().locale;
                                                if (b.f == null) {
                                                    b bVar6 = new b(1);
                                                    bVar6.d = BreakIterator.getWordInstance(locale2);
                                                    b.f = bVar6;
                                                }
                                                b bVar7 = b.f;
                                                Intrinsics.c(bVar7, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                                bVar7.y(strT2);
                                                bVar = bVar7;
                                            } else if (i4 == 4) {
                                                if (h0Var.c(com.gamericefishpro.space.o2.k.a) || (f0VarK = f0.k(lVar)) == null) {
                                                    bVar = null;
                                                } else {
                                                    if (i4 == 4) {
                                                        if (c.d == null) {
                                                            c.d = new c();
                                                        }
                                                        c cVar = c.d;
                                                        Intrinsics.c(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                        cVar.a = strT2;
                                                        cVar.c = f0VarK;
                                                        bVar2 = cVar;
                                                    } else {
                                                        if (d.e == null) {
                                                            d dVar = new d();
                                                            new Rect();
                                                            d.e = dVar;
                                                        }
                                                        d dVar2 = d.e;
                                                        Intrinsics.c(dVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                        dVar2.a = strT2;
                                                        dVar2.c = f0VarK;
                                                        dVar2.d = oVar;
                                                        bVar2 = dVar2;
                                                    }
                                                    bVar = bVar2;
                                                }
                                            } else if (i4 == 8) {
                                                if (e.c == null) {
                                                    e.c = new e();
                                                }
                                                e eVar = e.c;
                                                Intrinsics.c(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                eVar.a = strT2;
                                                bVar = eVar;
                                            } else if (i4 != 16) {
                                                bVar = null;
                                            } else if (h0Var.c(com.gamericefishpro.space.o2.k.a)) {
                                                bVar = null;
                                            } else {
                                                if (i4 == 4) {
                                                    if (c.d == null) {
                                                        c.d = new c();
                                                    }
                                                    c cVar2 = c.d;
                                                    Intrinsics.c(cVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                    cVar2.a = strT2;
                                                    cVar2.c = f0VarK;
                                                    bVar2 = cVar2;
                                                } else {
                                                    if (d.e == null) {
                                                        d dVar3 = new d();
                                                        new Rect();
                                                        d.e = dVar3;
                                                    }
                                                    d dVar4 = d.e;
                                                    Intrinsics.c(dVar4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                    dVar4.a = strT2;
                                                    dVar4.c = f0VarK;
                                                    dVar4.d = oVar;
                                                    bVar2 = dVar4;
                                                }
                                                bVar = bVar2;
                                            }
                                            if (bVar != null) {
                                                iQ = zVar.q(oVar);
                                                if (iQ == -1) {
                                                    if (z7) {
                                                        length = 0;
                                                    } else {
                                                        length = strT.length();
                                                    }
                                                    iQ = length;
                                                }
                                                if (z7) {
                                                    iArrX = bVar.b(iQ);
                                                } else {
                                                    iArrX = bVar.x(iQ);
                                                }
                                                if (iArrX != null) {
                                                    i5 = iArrX[0];
                                                    i6 = iArrX[1];
                                                    if (z6 || h0Var.c(com.gamericefishpro.space.o2.s.a) || !h0Var.c(com.gamericefishpro.space.o2.s.E)) {
                                                        if (z7) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    } else {
                                                        iR = zVar.r(oVar);
                                                        if (iR == -1) {
                                                            iR = z7 ? i5 : i6;
                                                        }
                                                        i7 = z7 ? i6 : i5;
                                                    }
                                                    if (z7) {
                                                        i8 = 256;
                                                    } else {
                                                        i8 = 512;
                                                    }
                                                    zVar.S = new v(oVar, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                    z2 = true;
                                                    zVar.K(oVar, iR, i7, true);
                                                }
                                            }
                                        }
                                    }
                                } else if (i2 == 16384) {
                                    Object objG10 = h0Var.g(com.gamericefishpro.space.o2.k.p);
                                    com.gamericefishpro.space.o2.a aVar6 = (com.gamericefishpro.space.o2.a) (objG10 == null ? null : objG10);
                                    if (aVar6 != null && (function0 = (Function0) aVar6.b) != null) {
                                        return ((Boolean) function0.invoke()).booleanValue();
                                    }
                                } else {
                                    if (i2 == 131072) {
                                        if (bundle != null) {
                                            i9 = -1;
                                            i10 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                        } else {
                                            i9 = -1;
                                            i10 = -1;
                                        }
                                        boolean zK = zVar.K(oVar, i10, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i9) : -1, false);
                                        if (!zK) {
                                            return zK;
                                        }
                                        z.E(zVar, zVar.A(i13), 0, null, 12);
                                        return zK;
                                    }
                                    if (f0.b(oVar)) {
                                        if (i2 == 1) {
                                            if (tVar.isInTouchMode()) {
                                                tVar.requestFocusFromTouch();
                                            }
                                            Object objG11 = h0Var.g(com.gamericefishpro.space.o2.k.v);
                                            com.gamericefishpro.space.o2.a aVar7 = (com.gamericefishpro.space.o2.a) (objG11 == null ? null : objG11);
                                            if (aVar7 != null && (function1 = (Function0) aVar7.b) != null) {
                                                return ((Boolean) function1.invoke()).booleanValue();
                                            }
                                        } else if (i2 != 2) {
                                            switch (i2) {
                                                case 16:
                                                    Object objG12 = h0Var.g(com.gamericefishpro.space.o2.k.b);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    com.gamericefishpro.space.o2.a aVar8 = (com.gamericefishpro.space.o2.a) objG12;
                                                    Boolean bool2 = (aVar8 == null || (function2 = (Function0) aVar8.b) == null) ? null : (Boolean) function2.invoke();
                                                    z.E(zVar, i, 1, null, 12);
                                                    if (bool2 != null) {
                                                        return bool2.booleanValue();
                                                    }
                                                    break;
                                                case 32:
                                                    Object objG13 = h0Var.g(com.gamericefishpro.space.o2.k.c);
                                                    com.gamericefishpro.space.o2.a aVar9 = (com.gamericefishpro.space.o2.a) (objG13 == null ? null : objG13);
                                                    if (aVar9 != null && (function3 = (Function0) aVar9.b) != null) {
                                                        return ((Boolean) function3.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 4096:
                                                case 8192:
                                                    if (i2 == 4096) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (i2 == 8192) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (i2 == 16908345) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (i2 == 16908347) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (i2 == 16908344) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (i2 == 16908346) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (!z10 || z11 || z8 || z9) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (!z12 || z13 || z8 || z9) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (!z8 || z9) {
                                                        objG = h0Var.g(com.gamericefishpro.space.o2.s.c);
                                                        if (objG == null) {
                                                            objG = null;
                                                        }
                                                        gVar = (com.gamericefishpro.space.o2.g) objG;
                                                        objG2 = h0Var.g(com.gamericefishpro.space.o2.k.i);
                                                        if (objG2 == null) {
                                                            objG2 = null;
                                                        }
                                                        com.gamericefishpro.space.o2.a aVar10 = (com.gamericefishpro.space.o2.a) objG2;
                                                        if (gVar != null || aVar10 == null) {
                                                            jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                            ArrayList arrayList = new ArrayList();
                                                            objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                            if (objG3 == null) {
                                                                objG3 = null;
                                                            }
                                                            aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                            if (aVar == null && (function6 = (Function1) aVar.b) != null && ((Boolean) function6.invoke(arrayList)).booleanValue()) {
                                                                f = (Float) arrayList.get(0);
                                                            } else {
                                                                f = null;
                                                            }
                                                            objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                            if (objG4 == null) {
                                                                objG4 = null;
                                                            }
                                                            aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                            if (aVar2 != null) {
                                                                com.gamericefishpro.space.oh.d dVar5 = aVar2.b;
                                                                objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                                if (objG5 == null) {
                                                                    objG5 = null;
                                                                }
                                                                iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                                if (iVar == null && z14) {
                                                                    float fFloatValue = f != null ? f.floatValue() : Float.intBitsToFloat((int) (jB >> 32));
                                                                    if (z10 || z9) {
                                                                        fFloatValue = -fFloatValue;
                                                                    }
                                                                    if ((f0Var.T == com.gamericefishpro.space.c3.l.e) && (z10 || z11)) {
                                                                        fFloatValue = -fFloatValue;
                                                                    }
                                                                    if (z.x(iVar, fFloatValue)) {
                                                                        com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.k.y;
                                                                        if (h0Var.c(vVar2) || h0Var.c(com.gamericefishpro.space.o2.k.A)) {
                                                                            if (fFloatValue > 0.0f) {
                                                                                Object objG14 = h0Var.g(com.gamericefishpro.space.o2.k.A);
                                                                                aVar4 = (com.gamericefishpro.space.o2.a) (objG14 == null ? null : objG14);
                                                                            } else {
                                                                                Object objG15 = h0Var.g(vVar2);
                                                                                aVar4 = (com.gamericefishpro.space.o2.a) (objG15 == null ? null : objG15);
                                                                            }
                                                                            if (aVar4 != null && (function5 = (Function0) aVar4.b) != null) {
                                                                                return ((Boolean) function5.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            Function2 function19 = (Function2) dVar5;
                                                                            if (function19 != null) {
                                                                                return ((Boolean) function19.invoke(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    f = f;
                                                                }
                                                                objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                if (iVar2 != null && z15) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                    }
                                                                    if (z12 || z9) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (z.x(iVar2, fIntBitsToFloat)) {
                                                                        vVar = com.gamericefishpro.space.o2.k.x;
                                                                        if (!h0Var.c(vVar) || h0Var.c(com.gamericefishpro.space.o2.k.z)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                            } else {
                                                                                objG7 = h0Var.g(vVar);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                            }
                                                                            if (aVar3 != null && (function4 = (Function0) aVar3.b) != null) {
                                                                                return ((Boolean) function4.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            Function2 function20 = (Function2) dVar5;
                                                                            if (function20 != null) {
                                                                                return ((Boolean) function20.invoke(fValueOf, Float.valueOf(fIntBitsToFloat))).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            float f2 = 0.0f / 20;
                                                            if (z9) {
                                                                f2 = -f2;
                                                            }
                                                            Function1 function21 = (Function1) aVar10.b;
                                                            if (function21 != null) {
                                                                return ((Boolean) function21.invoke(Float.valueOf(0.0f + f2))).booleanValue();
                                                            }
                                                        }
                                                    } else {
                                                        jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                        ArrayList arrayList2 = new ArrayList();
                                                        objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                        if (objG3 == null) {
                                                            objG3 = null;
                                                        }
                                                        aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                        if (aVar == null) {
                                                            f = null;
                                                        } else {
                                                            f = null;
                                                        }
                                                        objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                        if (objG4 == null) {
                                                            objG4 = null;
                                                        }
                                                        aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                        if (aVar2 != null) {
                                                            com.gamericefishpro.space.oh.d dVar6 = aVar2.b;
                                                            objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                            if (objG5 == null) {
                                                                objG5 = null;
                                                            }
                                                            iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                            if (iVar == null) {
                                                                f = f;
                                                                objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                if (iVar2 != null) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                    }
                                                                    if (z12) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (z.x(iVar2, fIntBitsToFloat)) {
                                                                        vVar = com.gamericefishpro.space.o2.k.x;
                                                                        if (h0Var.c(vVar)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                            } else {
                                                                                objG7 = h0Var.g(vVar);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                            }
                                                                            if (aVar3 != null) {
                                                                                return ((Boolean) function4.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                            } else {
                                                                                objG7 = h0Var.g(vVar);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                            }
                                                                            if (aVar3 != null) {
                                                                                return ((Boolean) function4.invoke()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                f = f;
                                                                objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                if (iVar2 != null) {
                                                                    if (f != null) {
                                                                        fIntBitsToFloat = f.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                    }
                                                                    if (z12) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (z.x(iVar2, fIntBitsToFloat)) {
                                                                        vVar = com.gamericefishpro.space.o2.k.x;
                                                                        if (h0Var.c(vVar)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                            } else {
                                                                                objG7 = h0Var.g(vVar);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                            }
                                                                            if (aVar3 != null) {
                                                                                return ((Boolean) function4.invoke()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                if (objG8 == null) {
                                                                                    obj2 = null;
                                                                                } else {
                                                                                    obj2 = objG8;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                            } else {
                                                                                objG7 = h0Var.g(vVar);
                                                                                if (objG7 == null) {
                                                                                    obj = null;
                                                                                } else {
                                                                                    obj = objG7;
                                                                                }
                                                                                aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                            }
                                                                            if (aVar3 != null) {
                                                                                return ((Boolean) function4.invoke()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 32768:
                                                    Object objG16 = h0Var.g(com.gamericefishpro.space.o2.k.r);
                                                    com.gamericefishpro.space.o2.a aVar11 = (com.gamericefishpro.space.o2.a) (objG16 == null ? null : objG16);
                                                    if (aVar11 != null && (function7 = (Function0) aVar11.b) != null) {
                                                        return ((Boolean) function7.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 65536:
                                                    Object objG17 = h0Var.g(com.gamericefishpro.space.o2.k.q);
                                                    com.gamericefishpro.space.o2.a aVar12 = (com.gamericefishpro.space.o2.a) (objG17 == null ? null : objG17);
                                                    if (aVar12 != null && (function8 = (Function0) aVar12.b) != null) {
                                                        return ((Boolean) function8.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 262144:
                                                    Object objG18 = h0Var.g(com.gamericefishpro.space.o2.k.s);
                                                    com.gamericefishpro.space.o2.a aVar13 = (com.gamericefishpro.space.o2.a) (objG18 == null ? null : objG18);
                                                    if (aVar13 != null && (function9 = (Function0) aVar13.b) != null) {
                                                        return ((Boolean) function9.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 524288:
                                                    Object objG19 = h0Var.g(com.gamericefishpro.space.o2.k.t);
                                                    com.gamericefishpro.space.o2.a aVar14 = (com.gamericefishpro.space.o2.a) (objG19 == null ? null : objG19);
                                                    if (aVar14 != null && (function10 = (Function0) aVar14.b) != null) {
                                                        return ((Boolean) function10.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 1048576:
                                                    Object objG20 = h0Var.g(com.gamericefishpro.space.o2.k.u);
                                                    com.gamericefishpro.space.o2.a aVar15 = (com.gamericefishpro.space.o2.a) (objG20 == null ? null : objG20);
                                                    if (aVar15 != null && (function11 = (Function0) aVar15.b) != null) {
                                                        return ((Boolean) function11.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case 2097152:
                                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                                    Object objG21 = h0Var.g(com.gamericefishpro.space.o2.k.k);
                                                    com.gamericefishpro.space.o2.a aVar16 = (com.gamericefishpro.space.o2.a) (objG21 == null ? null : objG21);
                                                    if (aVar16 != null && (function12 = (Function1) aVar16.b) != null) {
                                                        if (string == null) {
                                                            string = "";
                                                        }
                                                        return ((Boolean) function12.invoke(new com.gamericefishpro.space.r2.e(string))).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionShowOnScreen:
                                                    com.gamericefishpro.space.o2.o oVarL = oVar.l();
                                                    if (oVarL != null) {
                                                        Object objG22 = oVarL.d.d.g(com.gamericefishpro.space.o2.k.d);
                                                        if (objG22 == null) {
                                                            objG22 = null;
                                                        }
                                                        aVar5 = (com.gamericefishpro.space.o2.a) objG22;
                                                        while (oVarL != null && aVar5 == null) {
                                                            oVarL = oVarL.l();
                                                            if (oVarL != null) {
                                                                Object objG23 = oVarL.d.d.g(com.gamericefishpro.space.o2.k.d);
                                                                if (objG23 == null) {
                                                                    objG23 = null;
                                                                }
                                                                aVar5 = (com.gamericefishpro.space.o2.a) objG23;
                                                            } else {
                                                                aVar5 = null;
                                                            }
                                                        }
                                                        if (oVarL == null) {
                                                            com.gamericefishpro.space.n1.c cVarG = oVar.g();
                                                            return tVar.requestRectangleOnScreen(new Rect((int) Math.floor(cVarG.a), (int) Math.floor(cVarG.b), com.gamericefishpro.space.gi.c.a((float) Math.ceil(cVarG.c)), com.gamericefishpro.space.gi.c.a((float) Math.ceil(cVarG.d))));
                                                        }
                                                        com.gamericefishpro.space.t.h0 h0Var2 = oVarL.d.d;
                                                        com.gamericefishpro.space.h2.f0 f0Var2 = oVarL.c;
                                                        com.gamericefishpro.space.n1.c cVarE = com.gamericefishpro.space.f2.x.e(f0Var2.Z.c);
                                                        com.gamericefishpro.space.f2.u uVarL = f0Var2.Z.c.l();
                                                        com.gamericefishpro.space.n1.c cVarE2 = cVarE.e(uVarL != null ? ((com.gamericefishpro.space.h2.f1) uVarL).H(0L) : 0L);
                                                        com.gamericefishpro.space.h2.f1 f1VarD = oVar.d();
                                                        if (f1VarD == null) {
                                                            jH = 0;
                                                        } else {
                                                            if (!f1VarD.K0().G) {
                                                                f1VarD = null;
                                                            }
                                                            if (f1VarD != null) {
                                                                jH = f1VarD.H(0L);
                                                            } else {
                                                                jH = 0;
                                                            }
                                                        }
                                                        com.gamericefishpro.space.h2.f1 f1VarD2 = oVar.d();
                                                        com.gamericefishpro.space.n1.c cVarH = d5.h(jH, com.gamericefishpro.space.d9.h.Q(f1VarD2 != null ? f1VarD2.i : 0L));
                                                        Object objG24 = h0Var2.g(com.gamericefishpro.space.o2.s.u);
                                                        if (objG24 == null) {
                                                            objG24 = null;
                                                        }
                                                        Object objG25 = h0Var2.g(com.gamericefishpro.space.o2.s.v);
                                                        float f3 = cVarH.a - cVarE2.a;
                                                        float f4 = cVarH.c - cVarE2.c;
                                                        if (Math.signum(f3) != Math.signum(f4)) {
                                                            f3 = 0.0f;
                                                        } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                            f3 = f4;
                                                        }
                                                        if (f0Var.T == com.gamericefishpro.space.c3.l.e) {
                                                            f3 = -f3;
                                                        }
                                                        float f5 = cVarH.b - cVarE2.b;
                                                        float f6 = cVarH.d - cVarE2.d;
                                                        float f7 = Math.signum(f5) == Math.signum(f6) ? Math.abs(f5) < Math.abs(f6) ? f5 : f6 : 0.0f;
                                                        if (aVar5 != null) {
                                                            Function2 function22 = (Function2) aVar5.b;
                                                            if (function22 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        aVar5 = null;
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionSetProgress:
                                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                        Object objG26 = h0Var.g(com.gamericefishpro.space.o2.k.i);
                                                        com.gamericefishpro.space.o2.a aVar17 = (com.gamericefishpro.space.o2.a) (objG26 == null ? null : objG26);
                                                        if (aVar17 != null && (function13 = (Function1) aVar17.b) != null) {
                                                            return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                        }
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionImeEnter:
                                                    Object objG27 = h0Var.g(com.gamericefishpro.space.o2.k.o);
                                                    com.gamericefishpro.space.o2.a aVar18 = (com.gamericefishpro.space.o2.a) (objG27 == null ? null : objG27);
                                                    if (aVar18 != null && (function14 = (Function0) aVar18.b) != null) {
                                                        return ((Boolean) function14.invoke()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case android.R.id.accessibilityActionScrollUp:
                                                        case android.R.id.accessibilityActionScrollLeft:
                                                        case android.R.id.accessibilityActionScrollDown:
                                                        case android.R.id.accessibilityActionScrollRight:
                                                            if (i2 == 4096) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (i2 == 8192) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            if (i2 == 16908345) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (i2 == 16908347) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            if (i2 == 16908344) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (i2 == 16908346) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (z10) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = true;
                                                            }
                                                            if (z12) {
                                                                z15 = true;
                                                            } else {
                                                                z15 = true;
                                                            }
                                                            if (z8) {
                                                                objG = h0Var.g(com.gamericefishpro.space.o2.s.c);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                gVar = (com.gamericefishpro.space.o2.g) objG;
                                                                objG2 = h0Var.g(com.gamericefishpro.space.o2.k.i);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                com.gamericefishpro.space.o2.a aVar19 = (com.gamericefishpro.space.o2.a) objG2;
                                                                if (gVar != null) {
                                                                    jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                                    ArrayList arrayList3 = new ArrayList();
                                                                    objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                                    if (aVar == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                                    if (aVar2 != null) {
                                                                        com.gamericefishpro.space.oh.d dVar7 = aVar2.b;
                                                                        objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                                        if (iVar == null) {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                                    ArrayList arrayList4 = new ArrayList();
                                                                    objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                                    if (aVar == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                                    if (aVar2 != null) {
                                                                        com.gamericefishpro.space.oh.d dVar8 = aVar2.b;
                                                                        objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                                        if (iVar == null) {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                objG = h0Var.g(com.gamericefishpro.space.o2.s.c);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                gVar = (com.gamericefishpro.space.o2.g) objG;
                                                                objG2 = h0Var.g(com.gamericefishpro.space.o2.k.i);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                com.gamericefishpro.space.o2.a aVar110 = (com.gamericefishpro.space.o2.a) objG2;
                                                                if (gVar != null) {
                                                                    jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                                    ArrayList arrayList5 = new ArrayList();
                                                                    objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                                    if (aVar == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                                    if (aVar2 != null) {
                                                                        com.gamericefishpro.space.oh.d dVar9 = aVar2.b;
                                                                        objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                                        if (iVar == null) {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    jB = com.gamericefishpro.space.f2.x.e(f0Var.Z.c).b();
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    objG3 = h0Var.g(com.gamericefishpro.space.o2.k.B);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    aVar = (com.gamericefishpro.space.o2.a) objG3;
                                                                    if (aVar == null) {
                                                                        f = null;
                                                                    } else {
                                                                        f = null;
                                                                    }
                                                                    objG4 = h0Var.g(com.gamericefishpro.space.o2.k.d);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    aVar2 = (com.gamericefishpro.space.o2.a) objG4;
                                                                    if (aVar2 != null) {
                                                                        com.gamericefishpro.space.oh.d dVar10 = aVar2.b;
                                                                        objG5 = h0Var.g(com.gamericefishpro.space.o2.s.u);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        iVar = (com.gamericefishpro.space.o2.i) objG5;
                                                                        if (iVar == null) {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            f = f;
                                                                            objG6 = h0Var.g(com.gamericefishpro.space.o2.s.v);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            iVar2 = (com.gamericefishpro.space.o2.i) objG6;
                                                                            if (iVar2 != null) {
                                                                                if (f != null) {
                                                                                    fIntBitsToFloat = f.floatValue();
                                                                                } else {
                                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jB));
                                                                                }
                                                                                if (z12) {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                } else {
                                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                                }
                                                                                if (z.x(iVar2, fIntBitsToFloat)) {
                                                                                    vVar = com.gamericefishpro.space.o2.k.x;
                                                                                    if (h0Var.c(vVar)) {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    } else {
                                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                                            objG8 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                                            if (objG8 == null) {
                                                                                                obj2 = null;
                                                                                            } else {
                                                                                                obj2 = objG8;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj2;
                                                                                        } else {
                                                                                            objG7 = h0Var.g(vVar);
                                                                                            if (objG7 == null) {
                                                                                                obj = null;
                                                                                            } else {
                                                                                                obj = objG7;
                                                                                            }
                                                                                            aVar3 = (com.gamericefishpro.space.o2.a) obj;
                                                                                        }
                                                                                        if (aVar3 != null) {
                                                                                            return ((Boolean) function4.invoke()).booleanValue();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case android.R.id.accessibilityActionPageUp:
                                                                    Object objG28 = h0Var.g(com.gamericefishpro.space.o2.k.x);
                                                                    com.gamericefishpro.space.o2.a aVar20 = (com.gamericefishpro.space.o2.a) (objG28 == null ? null : objG28);
                                                                    if (aVar20 != null && (function15 = (Function0) aVar20.b) != null) {
                                                                        return ((Boolean) function15.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case android.R.id.accessibilityActionPageDown:
                                                                    Object objG29 = h0Var.g(com.gamericefishpro.space.o2.k.z);
                                                                    com.gamericefishpro.space.o2.a aVar21 = (com.gamericefishpro.space.o2.a) (objG29 == null ? null : objG29);
                                                                    if (aVar21 != null && (function16 = (Function0) aVar21.b) != null) {
                                                                        return ((Boolean) function16.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case android.R.id.accessibilityActionPageLeft:
                                                                    Object objG30 = h0Var.g(com.gamericefishpro.space.o2.k.y);
                                                                    com.gamericefishpro.space.o2.a aVar22 = (com.gamericefishpro.space.o2.a) (objG30 == null ? null : objG30);
                                                                    if (aVar22 != null && (function17 = (Function0) aVar22.b) != null) {
                                                                        return ((Boolean) function17.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                case android.R.id.accessibilityActionPageRight:
                                                                    Object objG31 = h0Var.g(com.gamericefishpro.space.o2.k.A);
                                                                    com.gamericefishpro.space.o2.a aVar23 = (com.gamericefishpro.space.o2.a) (objG31 == null ? null : objG31);
                                                                    if (aVar23 != null && (function18 = (Function0) aVar23.b) != null) {
                                                                        return ((Boolean) function18.invoke()).booleanValue();
                                                                    }
                                                                    break;
                                                                default:
                                                                    com.gamericefishpro.space.t.s0 s0Var = (com.gamericefishpro.space.t.s0) zVar.L.c(i);
                                                                    if (s0Var != null && ((CharSequence) s0Var.c(i2)) != null) {
                                                                        Object objG32 = h0Var.g(com.gamericefishpro.space.o2.k.w);
                                                                        List list = (List) (objG32 == null ? null : objG32);
                                                                        if (list != null && list.size() > 0) {
                                                                            list.get(0).getClass();
                                                                            throw new ClassCastException();
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            Object objG33 = h0Var.g(com.gamericefishpro.space.o2.s.k);
                                            if (objG33 == null) {
                                                objG33 = null;
                                            }
                                            if (Intrinsics.a(objG33, bool)) {
                                                ((com.gamericefishpro.space.m1.k) tVar.getFocusOwner()).b(8, false, true);
                                                return true;
                                            }
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                z2 = true;
                                z = false;
                                if (zVar.E == i) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    zVar.E = Integer.MIN_VALUE;
                                    zVar.G = null;
                                    tVar.invalidate();
                                    z.E(zVar, i, 65536, null, 12);
                                }
                            }
                            return z2;
                        }
                        z2 = true;
                        z = false;
                        if (accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            i3 = zVar.E;
                            if (i3 == i) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                if (i3 != Integer.MIN_VALUE) {
                                    num = null;
                                    z.E(zVar, i3, 65536, null, 12);
                                } else {
                                    num = null;
                                }
                                zVar.E = i;
                                tVar.invalidate();
                                z.E(zVar, i, 32768, num, 12);
                                return z2;
                            }
                        }
                    } else if (!(Build.VERSION.SDK_INT >= 34 ? com.gamericefishpro.space.d4.v.h(accessibilityManager) : true)) {
                        z = false;
                    } else {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                if (i2 != 256) {
                                    if (bundle != null) {
                                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                        z6 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                        if (i2 == 256) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        num2 = zVar.O;
                                        if (num2 != null) {
                                            zVar.N = -1;
                                            zVar.O = Integer.valueOf(i13);
                                        } else {
                                            zVar.N = -1;
                                            zVar.O = Integer.valueOf(i13);
                                        }
                                        strT = z.t(oVar);
                                        if (strT != null) {
                                            strT2 = z.t(oVar);
                                            if (strT2 != null) {
                                                bVar = null;
                                            } else {
                                                bVar = null;
                                            }
                                            if (bVar != null) {
                                                iQ = zVar.q(oVar);
                                                if (iQ == -1) {
                                                    if (z7) {
                                                        length = 0;
                                                    } else {
                                                        length = strT.length();
                                                    }
                                                    iQ = length;
                                                }
                                                if (z7) {
                                                    iArrX = bVar.b(iQ);
                                                } else {
                                                    iArrX = bVar.x(iQ);
                                                }
                                                if (iArrX != null) {
                                                    i5 = iArrX[0];
                                                    i6 = iArrX[1];
                                                    if (z6) {
                                                        if (z7) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    } else {
                                                        if (z7) {
                                                            iR = i6;
                                                        } else {
                                                            iR = i5;
                                                        }
                                                        i7 = iR;
                                                    }
                                                    if (z7) {
                                                        i8 = 256;
                                                    } else {
                                                        i8 = 512;
                                                    }
                                                    zVar.S = new v(oVar, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                    z2 = true;
                                                    zVar.K(oVar, iR, i7, true);
                                                }
                                            }
                                        }
                                    }
                                } else if (bundle != null) {
                                    i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                    z6 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                    if (i2 == 256) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    num2 = zVar.O;
                                    if (num2 != null) {
                                        zVar.N = -1;
                                        zVar.O = Integer.valueOf(i13);
                                    } else {
                                        zVar.N = -1;
                                        zVar.O = Integer.valueOf(i13);
                                    }
                                    strT = z.t(oVar);
                                    if (strT != null) {
                                        strT2 = z.t(oVar);
                                        if (strT2 != null) {
                                            bVar = null;
                                        } else {
                                            bVar = null;
                                        }
                                        if (bVar != null) {
                                            iQ = zVar.q(oVar);
                                            if (iQ == -1) {
                                                if (z7) {
                                                    length = 0;
                                                } else {
                                                    length = strT.length();
                                                }
                                                iQ = length;
                                            }
                                            if (z7) {
                                                iArrX = bVar.b(iQ);
                                            } else {
                                                iArrX = bVar.x(iQ);
                                            }
                                            if (iArrX != null) {
                                                i5 = iArrX[0];
                                                i6 = iArrX[1];
                                                if (z6) {
                                                    if (z7) {
                                                        iR = i6;
                                                    } else {
                                                        iR = i5;
                                                    }
                                                    i7 = iR;
                                                } else {
                                                    if (z7) {
                                                        iR = i6;
                                                    } else {
                                                        iR = i5;
                                                    }
                                                    i7 = iR;
                                                }
                                                if (z7) {
                                                    i8 = 256;
                                                } else {
                                                    i8 = 512;
                                                }
                                                zVar.S = new v(oVar, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                                z2 = true;
                                                zVar.K(oVar, iR, i7, true);
                                            }
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                z2 = true;
                                z = false;
                                if (zVar.E == i) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    zVar.E = Integer.MIN_VALUE;
                                    zVar.G = null;
                                    tVar.invalidate();
                                    z.E(zVar, i, 65536, null, 12);
                                }
                            }
                            return z2;
                        }
                        z2 = true;
                        z = false;
                        if (accessibilityManager.isEnabled()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i3 = zVar.E;
                            if (i3 == i) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                if (i3 != Integer.MIN_VALUE) {
                                    num = null;
                                    z.E(zVar, i3, 65536, null, 12);
                                } else {
                                    num = null;
                                }
                                zVar.E = i;
                                tVar.invalidate();
                                z.E(zVar, i, 32768, num, 12);
                                return z2;
                            }
                        }
                    }
                }
                return z;
            default:
                com.gamericefishpro.space.k4.a aVar24 = (com.gamericefishpro.space.k4.a) bVar3;
                Chip chip = aVar24.B;
                if (i == -1) {
                    Field field = com.gamericefishpro.space.d4.l0.a;
                    return chip.performAccessibilityAction(i2, bundle);
                }
                if (i2 == 1) {
                    return aVar24.q(i);
                }
                if (i2 == 2) {
                    return aVar24.j(i);
                }
                if (i2 == 64) {
                    AccessibilityManager accessibilityManager2 = aVar24.A;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i11 = aVar24.D) != i) {
                        if (i11 != Integer.MIN_VALUE) {
                            aVar24.D = Integer.MIN_VALUE;
                            chip.invalidate();
                            aVar24.r(i11, 65536);
                        }
                        aVar24.D = i;
                        chip.invalidate();
                        aVar24.r(i, 32768);
                        return true;
                    }
                } else if (i2 != 128) {
                    Chip chip2 = ((com.gamericefishpro.space.aa.d) aVar24).J;
                    if (i2 == 16) {
                        if (i == 0) {
                            return chip2.performClick();
                        }
                        if (i == 1) {
                            chip2.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip2.A;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip2);
                                z16 = true;
                            }
                            if (chip2.L) {
                                chip2.K.r(1, 1);
                            }
                        }
                    }
                } else if (aVar24.D == i) {
                    aVar24.D = Integer.MIN_VALUE;
                    chip.invalidate();
                    aVar24.r(i, 65536);
                    return true;
                }
                return z16;
        }
    }
}
