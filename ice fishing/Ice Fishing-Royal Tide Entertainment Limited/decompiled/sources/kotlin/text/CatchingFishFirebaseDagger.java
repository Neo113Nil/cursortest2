package kotlin.text;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class CatchingFishFirebaseDagger {
    public static Boolean CatchingFish;
    public static final CatchingFishFluxWorkManager CatchingFishAnimationMockk;
    public static CatchingFishGlideJUnitFAB CatchingFishFragmentHandler;
    public static Boolean CatchingFishJetpackCompose;
    public static Boolean CatchingFishNavigation;
    public static Boolean CatchingFishRoomDatabase;
    public static final CatchingFishFluxWorkManager CatchingFishStateLiveData;
    public static final int[] CatchingFishParcelableFAB = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] CatchingFishSnackbar = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] CatchingFishCoroutine = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] CatchingFishReduxKtor = {R.attr.name, R.attr.pathData};
    public static final Object CatchingFishDaggerWebsocket = new Object();
    public static final Class[] CatchingFishWorkManager = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final float[] CatchingFishViewModelScope = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] CatchingFishViewModelFAB = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final CatchingFishGlideJUnitFAB CatchingFishLayout = new CatchingFishGlideJUnitFAB(null, null, null);
    public static final CatchingFishWidgetContext CatchingFishCloudMessaging = new CatchingFishWidgetContext();
    public static final CatchingFishMVPExoPlayer CatchingFishEspressoTesting = new CatchingFishMVPExoPlayer(26);
    public static final CatchingFishWidgetContext CatchingFishOkHttp = new CatchingFishWidgetContext();
    public static final CatchingFishGradleMVVM CatchingFishUnitTesting = new CatchingFishGradleMVVM(27);

    static {
        int i = 1;
        CatchingFishAnimationMockk = new CatchingFishFluxWorkManager("NONE", i);
        CatchingFishStateLiveData = new CatchingFishFluxWorkManager("PENDING", i);
    }

    public static final void CatchingFish(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final boolean CatchingFishAnimation(Throwable th, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        Collection asList;
        Object invoke;
        CatchingFishNavigation(th, "<this>");
        Integer num = CatchingFishKtorKtor.CatchingFishParcelableFAB;
        CatchingFishIntentMVVM catchingFishIntentMVVM = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            CatchingFishRoomDatabase(suppressed, "getSuppressed(...)");
            asList = Arrays.asList(suppressed);
            CatchingFishRoomDatabase(asList, "asList(...)");
        } else {
            Method method = CatchingFishRealmDataStore.CatchingFishSnackbar;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                CatchingFishRoomDatabase(asList, "asList(...)");
            }
        }
        boolean z = false;
        if (!asList.isEmpty()) {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof CatchingFishIntentMVVM) {
                    return false;
                }
            }
        }
        try {
            List list = (List) catchingFishJUnitGlide.CatchingFishParcelableFAB();
            boolean isEmpty = list.isEmpty();
            z = !isEmpty;
            if (!isEmpty) {
                catchingFishIntentMVVM = new CatchingFishIntentMVVM(list);
            }
        } catch (Throwable th2) {
            catchingFishIntentMVVM = th2;
        }
        if (catchingFishIntentMVVM != null) {
            CatchingFishAdMobFAB.CatchingFishViewModelFAB(th, catchingFishIntentMVVM);
        }
        return z;
    }

    public static void CatchingFishAnimationMockk(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        CatchingFishMotionLayout(nullPointerException, CatchingFishFirebaseDagger.class.getName());
        throw nullPointerException;
    }

    public static void CatchingFishCameraXIntent(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishCardViewRealm(CatchingFishFAB catchingFishFAB, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        CatchingFishMoshiKtor catchingFishMoshiKtor;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        CatchingFishServiceHandler catchingFishServiceHandler;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse CatchingFishNavigation2 = CatchingFishHiltMoshi.CatchingFishNavigation(longSparseArray.get(keyAt));
            if (CatchingFishNavigation2 != null && value != null && text != null && (catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishFAB.CatchingFishViewModelScope().CatchingFishSnackbar((int) keyAt)) != null && (catchingFishMVIGraphQLHilt = catchingFishMoshiKtor.CatchingFishParcelableFAB) != null) {
                Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishFragmentHandler);
                if (CatchingFishViewModelScope2 == null) {
                    CatchingFishViewModelScope2 = null;
                }
                CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope2;
                if (catchingFishSnackbarToast != null && (catchingFishServiceHandler = (CatchingFishServiceHandler) catchingFishSnackbarToast.CatchingFishSnackbar) != null) {
                }
            }
        }
    }

    public static final boolean CatchingFishCardViewView(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object CatchingFishCloudMessaging(CatchingFishPicassoMVP catchingFishPicassoMVP, CatchingFishHandlerDagger catchingFishHandlerDagger, Throwable th, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishViewPagerGlide catchingFishViewPagerGlide;
        int i;
        try {
            if (catchingFishStateFlowGson instanceof CatchingFishViewPagerGlide) {
                catchingFishViewPagerGlide = (CatchingFishViewPagerGlide) catchingFishStateFlowGson;
                int i2 = catchingFishViewPagerGlide.CatchingFishLayout;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    catchingFishViewPagerGlide.CatchingFishLayout = i2 - Integer.MIN_VALUE;
                    Object obj = catchingFishViewPagerGlide.CatchingFishViewModelFAB;
                    i = catchingFishViewPagerGlide.CatchingFishLayout;
                    if (i != 0) {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        catchingFishViewPagerGlide.CatchingFishViewModelScope = th;
                        catchingFishViewPagerGlide.CatchingFishLayout = 1;
                        Object CatchingFishReduxKtor2 = catchingFishHandlerDagger.CatchingFishReduxKtor(catchingFishPicassoMVP, th, catchingFishViewPagerGlide);
                        Object obj2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (CatchingFishReduxKtor2 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = catchingFishViewPagerGlide.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    }
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
            }
            if (i != 0) {
            }
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                CatchingFishAdMobFAB.CatchingFishViewModelFAB(th2, th);
            }
            throw th2;
        }
        catchingFishViewPagerGlide = new CatchingFishViewPagerGlide(catchingFishStateFlowGson);
        Object obj3 = catchingFishViewPagerGlide.CatchingFishViewModelFAB;
        i = catchingFishViewPagerGlide.CatchingFishLayout;
    }

    public static final long CatchingFishCoroutine(long j) {
        long j2 = j << 32;
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return j2;
    }

    public static int CatchingFishCoroutineFlow(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final Object CatchingFishCustomView(CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI, CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, Serializable serializable) {
        CatchingFishNavigation(catchingFishDaggerHiltMVI, "<this>");
        CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
        Object obj = catchingFishDaggerHiltMVI.CatchingFishParcelableFAB.get(catchingFishXMLLayoutRedux);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
            CatchingFishRoomDatabase(obj, "copyOf(this, size)");
        }
        return obj == null ? serializable : obj;
    }

    public static final long CatchingFishDagger(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final CatchingFishReduxAdMob CatchingFishDaggerHiltFAB(Context context) {
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = new CatchingFishMoshiFluxMoshi(12);
        context.getApplicationContext();
        return new CatchingFishReduxAdMob(catchingFishMoshiFluxMoshi, new CatchingFishFluxPayPal(Build.VERSION.SDK_INT >= 31 ? CatchingFishUnitTestingMVP.CatchingFishParcelableFAB.CatchingFishParcelableFAB(context) : 0));
    }

    public static long CatchingFishDaggerWebsocket(float f) {
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    public static void CatchingFishDataStoreIntent(String str) {
        CatchingFishBiometricView catchingFishBiometricView = new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("lateinit property ", str, " has not been initialized"));
        CatchingFishMotionLayout(catchingFishBiometricView, CatchingFishFirebaseDagger.class.getName());
        throw catchingFishBiometricView;
    }

    public static boolean CatchingFishEspressoMockk(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (CatchingFishRoomDatabase == null) {
            CatchingFishRoomDatabase = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        CatchingFishRoomDatabase.booleanValue();
        if (CatchingFishNavigation == null) {
            CatchingFishNavigation = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (CatchingFishNavigation.booleanValue()) {
            return !CatchingFishHiltMVPToast.CatchingFishSpannableWidget() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x028c, code lost:
    
        if (r8.CatchingFishReduxKtor == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.CatchingFishReduxKtor == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishEspressoTesting(CatchingFishGsonAppCompat catchingFishGsonAppCompat, CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, ArrayList arrayList, int i) {
        int i2;
        CatchingFishMoshiGlide[] catchingFishMoshiGlideArr;
        int i3;
        int i4;
        float f;
        float f2;
        boolean z;
        boolean z2;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit;
        boolean z3;
        boolean z4;
        int i5;
        CatchingFishMoshiGlide[] catchingFishMoshiGlideArr2;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2;
        CatchingFishHandlerOkHttp catchingFishHandlerOkHttp2;
        CatchingFishHandlerGson catchingFishHandlerGson;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit;
        CatchingFishHandlerGson catchingFishHandlerGson2;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3;
        int i6;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2;
        CatchingFishHandlerGson catchingFishHandlerGson3;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit4;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit5;
        int i7;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3;
        CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr;
        int i8;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4;
        CatchingFishHandlerGson catchingFishHandlerGson4;
        CatchingFishHandlerGson catchingFishHandlerGson5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit6;
        float f3;
        CatchingFishMoshiGlide[] catchingFishMoshiGlideArr3;
        int i11;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit7;
        int i12;
        int i13;
        int i14;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit8;
        CatchingFishGsonAppCompat catchingFishGsonAppCompat2 = catchingFishGsonAppCompat;
        CatchingFishHandlerOkHttp catchingFishHandlerOkHttp3 = catchingFishHandlerOkHttp;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i2 = catchingFishGsonAppCompat2.CatchingFishPayPalHandler;
            catchingFishMoshiGlideArr = catchingFishGsonAppCompat2.CatchingFishLifecycle;
            i3 = 0;
        } else {
            i2 = catchingFishGsonAppCompat2.CatchingFishSharedFlow;
            catchingFishMoshiGlideArr = catchingFishGsonAppCompat2.CatchingFishCameraX;
            i3 = 2;
        }
        int i15 = i2;
        CatchingFishMoshiGlide[] catchingFishMoshiGlideArr4 = catchingFishMoshiGlideArr;
        int i16 = 0;
        while (i16 < i15) {
            CatchingFishMoshiGlide catchingFishMoshiGlide = catchingFishMoshiGlideArr4[i16];
            boolean z5 = catchingFishMoshiGlide.CatchingFishRoomDatabase;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit9 = catchingFishMoshiGlide.CatchingFishParcelableFAB;
            int i17 = 3;
            int i18 = 8;
            if (z5) {
                i4 = i16;
                f = 0.0f;
            } else {
                int i19 = catchingFishMoshiGlide.CatchingFishEspressoTesting;
                int i20 = i19 * 2;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit10 = catchingFishDaggerRetrofit9;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit11 = catchingFishDaggerRetrofit10;
                boolean z6 = false;
                f = 0.0f;
                while (!z6) {
                    catchingFishMoshiGlide.CatchingFishLayout++;
                    CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr = catchingFishDaggerRetrofit10.CatchingFishRetrofit;
                    CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr2 = catchingFishDaggerRetrofit10.CatchingFishLayoutInflater;
                    catchingFishDaggerRetrofitArr[i19] = null;
                    catchingFishDaggerRetrofit10.CatchingFishGradleLiveData[i19] = null;
                    if (catchingFishDaggerRetrofit10.CatchingFishMockkOkHttp != i18) {
                        catchingFishDaggerRetrofit10.CatchingFishFragmentHandler(i19);
                        catchingFishStripeAPIJUnitArr2[i20].CatchingFishDaggerWebsocket();
                        int i21 = i20 + 1;
                        catchingFishStripeAPIJUnitArr2[i21].CatchingFishDaggerWebsocket();
                        catchingFishStripeAPIJUnitArr2[i20].CatchingFishDaggerWebsocket();
                        catchingFishStripeAPIJUnitArr2[i21].CatchingFishDaggerWebsocket();
                        if (catchingFishMoshiGlide.CatchingFishSnackbar == null) {
                            catchingFishMoshiGlide.CatchingFishSnackbar = catchingFishDaggerRetrofit10;
                        }
                        catchingFishMoshiGlide.CatchingFishReduxKtor = catchingFishDaggerRetrofit10;
                        int i22 = catchingFishDaggerRetrofit10.CatchingFishGlideWidgetKtor[i19];
                        if (i22 == i17) {
                            int i23 = catchingFishDaggerRetrofit10.CatchingFishJetpackCompose[i19];
                            if (i23 == 0 || i23 == i17 || i23 == 2) {
                                catchingFishMoshiGlide.CatchingFishFragmentHandler++;
                                float f4 = catchingFishDaggerRetrofit10.CatchingFishRetrofitMVI[i19];
                                if (f4 > 0.0f) {
                                    i13 = i16;
                                    catchingFishMoshiGlide.CatchingFishCloudMessaging += f4;
                                } else {
                                    i13 = i16;
                                }
                                i14 = i19;
                                if (catchingFishDaggerRetrofit10.CatchingFishMockkOkHttp != 8 && i22 == 3 && (i23 == 0 || i23 == 3)) {
                                    if (f4 < 0.0f) {
                                        catchingFishMoshiGlide.CatchingFishUnitTesting = true;
                                    } else {
                                        catchingFishMoshiGlide.CatchingFishAnimationMockk = true;
                                    }
                                    if (catchingFishMoshiGlide.CatchingFishViewModelFAB == null) {
                                        catchingFishMoshiGlide.CatchingFishViewModelFAB = new ArrayList();
                                    }
                                    catchingFishMoshiGlide.CatchingFishViewModelFAB.add(catchingFishDaggerRetrofit10);
                                }
                                if (catchingFishMoshiGlide.CatchingFishWorkManager == null) {
                                    catchingFishMoshiGlide.CatchingFishWorkManager = catchingFishDaggerRetrofit10;
                                }
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit12 = catchingFishMoshiGlide.CatchingFishViewModelScope;
                                if (catchingFishDaggerRetrofit12 != null) {
                                    catchingFishDaggerRetrofit12.CatchingFishGradleLiveData[i14] = catchingFishDaggerRetrofit10;
                                }
                                catchingFishMoshiGlide.CatchingFishViewModelScope = catchingFishDaggerRetrofit10;
                            } else {
                                i13 = i16;
                                i14 = i19;
                            }
                            if (i14 == 0) {
                                if (catchingFishDaggerRetrofit10.CatchingFishNavigation == 0 && catchingFishDaggerRetrofit10.CatchingFishCoroutineFlow == 0) {
                                    int i24 = catchingFishDaggerRetrofit10.CatchingFishDaggerHiltFAB;
                                }
                            } else if (catchingFishDaggerRetrofit10.CatchingFish == 0 && catchingFishDaggerRetrofit10.CatchingFishParcelableFlux == 0) {
                                int i25 = catchingFishDaggerRetrofit10.CatchingFishGsonAppCompat;
                            }
                            if (catchingFishDaggerRetrofit11 != catchingFishDaggerRetrofit10) {
                                catchingFishDaggerRetrofit11.CatchingFishRetrofit[i14] = catchingFishDaggerRetrofit10;
                            }
                            catchingFishStripeAPIJUnit5 = catchingFishStripeAPIJUnitArr2[i20 + 1].CatchingFishWorkManager;
                            if (catchingFishStripeAPIJUnit5 != null) {
                                catchingFishDaggerRetrofit8 = catchingFishStripeAPIJUnit5.CatchingFishReduxKtor;
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit6 = catchingFishDaggerRetrofit8.CatchingFishLayoutInflater[i20].CatchingFishWorkManager;
                                if (catchingFishStripeAPIJUnit6 != null) {
                                }
                            }
                            catchingFishDaggerRetrofit8 = null;
                            if (catchingFishDaggerRetrofit8 != null) {
                                catchingFishDaggerRetrofit8 = catchingFishDaggerRetrofit10;
                                z6 = true;
                            }
                            catchingFishDaggerRetrofit11 = catchingFishDaggerRetrofit10;
                            i19 = i14;
                            i17 = 3;
                            i18 = 8;
                            catchingFishDaggerRetrofit10 = catchingFishDaggerRetrofit8;
                            i16 = i13;
                        }
                    }
                    i13 = i16;
                    i14 = i19;
                    if (catchingFishDaggerRetrofit11 != catchingFishDaggerRetrofit10) {
                    }
                    catchingFishStripeAPIJUnit5 = catchingFishStripeAPIJUnitArr2[i20 + 1].CatchingFishWorkManager;
                    if (catchingFishStripeAPIJUnit5 != null) {
                    }
                    catchingFishDaggerRetrofit8 = null;
                    if (catchingFishDaggerRetrofit8 != null) {
                    }
                    catchingFishDaggerRetrofit11 = catchingFishDaggerRetrofit10;
                    i19 = i14;
                    i17 = 3;
                    i18 = 8;
                    catchingFishDaggerRetrofit10 = catchingFishDaggerRetrofit8;
                    i16 = i13;
                }
                i4 = i16;
                int i26 = i19;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit13 = catchingFishMoshiGlide.CatchingFishSnackbar;
                if (catchingFishDaggerRetrofit13 != null) {
                    catchingFishDaggerRetrofit13.CatchingFishLayoutInflater[i20].CatchingFishDaggerWebsocket();
                }
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit14 = catchingFishMoshiGlide.CatchingFishReduxKtor;
                if (catchingFishDaggerRetrofit14 != null) {
                    catchingFishDaggerRetrofit14.CatchingFishLayoutInflater[i20 + 1].CatchingFishDaggerWebsocket();
                }
                catchingFishMoshiGlide.CatchingFishCoroutine = catchingFishDaggerRetrofit10;
                if (i26 == 0 && catchingFishMoshiGlide.CatchingFishOkHttp) {
                    catchingFishMoshiGlide.CatchingFishDaggerWebsocket = catchingFishDaggerRetrofit10;
                } else {
                    catchingFishMoshiGlide.CatchingFishDaggerWebsocket = catchingFishDaggerRetrofit9;
                }
                catchingFishMoshiGlide.CatchingFishStateLiveData = catchingFishMoshiGlide.CatchingFishAnimationMockk && catchingFishMoshiGlide.CatchingFishUnitTesting;
            }
            catchingFishMoshiGlide.CatchingFishRoomDatabase = true;
            if (arrayList3 == null || arrayList3.contains(catchingFishDaggerRetrofit9)) {
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit15 = catchingFishMoshiGlide.CatchingFishCoroutine;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit16 = catchingFishMoshiGlide.CatchingFishSnackbar;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit17 = catchingFishMoshiGlide.CatchingFishReduxKtor;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit18 = catchingFishMoshiGlide.CatchingFishDaggerWebsocket;
                float f5 = catchingFishMoshiGlide.CatchingFishCloudMessaging;
                int[] iArr = catchingFishGsonAppCompat2.CatchingFishGlideWidgetKtor;
                CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr3 = catchingFishGsonAppCompat2.CatchingFishLayoutInflater;
                boolean z7 = iArr[i] == 2;
                if (i == 0) {
                    int i27 = catchingFishDaggerRetrofit18.CatchingFishPicasso;
                    boolean z8 = i27 == 0;
                    f2 = f5;
                    z = i27 == 1;
                    z2 = i27 == 2;
                    catchingFishDaggerRetrofit = catchingFishDaggerRetrofit9;
                    z3 = z7;
                    z4 = z8;
                } else {
                    f2 = f5;
                    int i28 = catchingFishDaggerRetrofit18.CatchingFishFirebase;
                    boolean z9 = i28 == 0;
                    z = i28 == 1;
                    z2 = i28 == 2;
                    catchingFishDaggerRetrofit = catchingFishDaggerRetrofit9;
                    z3 = z7;
                    z4 = z9;
                }
                boolean z10 = false;
                while (!z10) {
                    CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr4 = catchingFishDaggerRetrofit.CatchingFishLayoutInflater;
                    int[] iArr2 = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit7 = catchingFishStripeAPIJUnitArr4[i3];
                    int i29 = z2 ? 1 : 4;
                    int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit7.CatchingFishDaggerWebsocket();
                    CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr5 = catchingFishStripeAPIJUnitArr3;
                    boolean z11 = z2;
                    boolean z12 = iArr2[i] == 3 && catchingFishDaggerRetrofit.CatchingFishJetpackCompose[i] == 0;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit8 = catchingFishStripeAPIJUnit7.CatchingFishWorkManager;
                    if (catchingFishStripeAPIJUnit8 != null && catchingFishDaggerRetrofit != catchingFishDaggerRetrofit9) {
                        CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit8.CatchingFishDaggerWebsocket() + CatchingFishDaggerWebsocket2;
                    }
                    int i30 = CatchingFishDaggerWebsocket2;
                    if (z11 && catchingFishDaggerRetrofit != catchingFishDaggerRetrofit9 && catchingFishDaggerRetrofit != catchingFishDaggerRetrofit16) {
                        i29 = 8;
                    }
                    boolean z13 = z12;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit9 = catchingFishStripeAPIJUnit7.CatchingFishWorkManager;
                    if (catchingFishStripeAPIJUnit9 != null) {
                        if (catchingFishDaggerRetrofit == catchingFishDaggerRetrofit16) {
                            i11 = i15;
                            catchingFishHandlerOkHttp3.CatchingFishWorkManager(catchingFishStripeAPIJUnit7.CatchingFishLayout, catchingFishStripeAPIJUnit9.CatchingFishLayout, i30, 6);
                        } else {
                            i11 = i15;
                            catchingFishHandlerOkHttp3.CatchingFishWorkManager(catchingFishStripeAPIJUnit7.CatchingFishLayout, catchingFishStripeAPIJUnit9.CatchingFishLayout, i30, 8);
                        }
                        if (z13 && !z11) {
                            i29 = 5;
                        }
                        catchingFishHandlerOkHttp3.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit7.CatchingFishLayout, catchingFishStripeAPIJUnit7.CatchingFishWorkManager.CatchingFishLayout, i30, (catchingFishDaggerRetrofit == catchingFishDaggerRetrofit16 && z11 && catchingFishDaggerRetrofit.CatchingFishRecyclerView[i]) ? 5 : i29);
                    } else {
                        i11 = i15;
                    }
                    if (z3) {
                        if (catchingFishDaggerRetrofit.CatchingFishMockkOkHttp == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            catchingFishHandlerOkHttp3.CatchingFishWorkManager(catchingFishStripeAPIJUnitArr4[i3 + 1].CatchingFishLayout, catchingFishStripeAPIJUnitArr4[i3].CatchingFishLayout, 0, 5);
                        }
                        catchingFishHandlerOkHttp3.CatchingFishWorkManager(catchingFishStripeAPIJUnitArr4[i3].CatchingFishLayout, catchingFishStripeAPIJUnitArr5[i3].CatchingFishLayout, i12, 8);
                    }
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit10 = catchingFishStripeAPIJUnitArr4[i3 + 1].CatchingFishWorkManager;
                    if (catchingFishStripeAPIJUnit10 != null) {
                        catchingFishDaggerRetrofit7 = catchingFishStripeAPIJUnit10.CatchingFishReduxKtor;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit11 = catchingFishDaggerRetrofit7.CatchingFishLayoutInflater[i3].CatchingFishWorkManager;
                        if (catchingFishStripeAPIJUnit11 != null) {
                        }
                    }
                    catchingFishDaggerRetrofit7 = null;
                    if (catchingFishDaggerRetrofit7 != null) {
                        catchingFishDaggerRetrofit = catchingFishDaggerRetrofit7;
                    } else {
                        z10 = true;
                    }
                    catchingFishStripeAPIJUnitArr3 = catchingFishStripeAPIJUnitArr5;
                    z2 = z11;
                    i15 = i11;
                }
                CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr6 = catchingFishStripeAPIJUnitArr3;
                boolean z14 = z2;
                i5 = i15;
                if (catchingFishDaggerRetrofit17 != null) {
                    int i31 = i3 + 1;
                    if (catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i31].CatchingFishWorkManager != null) {
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit12 = catchingFishDaggerRetrofit17.CatchingFishLayoutInflater[i31];
                        if (catchingFishDaggerRetrofit17.CatchingFishGlideWidgetKtor[i] == 3 && catchingFishDaggerRetrofit17.CatchingFishJetpackCompose[i] == 0 && !z14) {
                            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit13 = catchingFishStripeAPIJUnit12.CatchingFishWorkManager;
                            if (catchingFishStripeAPIJUnit13.CatchingFishReduxKtor == catchingFishGsonAppCompat2) {
                                catchingFishHandlerOkHttp3.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit12.CatchingFishLayout, catchingFishStripeAPIJUnit13.CatchingFishLayout, -catchingFishStripeAPIJUnit12.CatchingFishDaggerWebsocket(), 5);
                                catchingFishHandlerOkHttp3.CatchingFishViewModelScope(catchingFishStripeAPIJUnit12.CatchingFishLayout, catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i31].CatchingFishWorkManager.CatchingFishLayout, -catchingFishStripeAPIJUnit12.CatchingFishDaggerWebsocket(), 6);
                            }
                        }
                        if (z14) {
                            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit14 = catchingFishStripeAPIJUnit12.CatchingFishWorkManager;
                            if (catchingFishStripeAPIJUnit14.CatchingFishReduxKtor == catchingFishGsonAppCompat2) {
                                catchingFishHandlerOkHttp3.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit12.CatchingFishLayout, catchingFishStripeAPIJUnit14.CatchingFishLayout, -catchingFishStripeAPIJUnit12.CatchingFishDaggerWebsocket(), 4);
                            }
                        }
                        catchingFishHandlerOkHttp3.CatchingFishViewModelScope(catchingFishStripeAPIJUnit12.CatchingFishLayout, catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i31].CatchingFishWorkManager.CatchingFishLayout, -catchingFishStripeAPIJUnit12.CatchingFishDaggerWebsocket(), 6);
                    }
                }
                if (z3) {
                    int i32 = i3 + 1;
                    CatchingFishHandlerGson catchingFishHandlerGson6 = catchingFishStripeAPIJUnitArr6[i32].CatchingFishLayout;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit15 = catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i32];
                    catchingFishHandlerOkHttp3.CatchingFishWorkManager(catchingFishHandlerGson6, catchingFishStripeAPIJUnit15.CatchingFishLayout, catchingFishStripeAPIJUnit15.CatchingFishDaggerWebsocket(), 8);
                }
                ArrayList arrayList4 = catchingFishMoshiGlide.CatchingFishViewModelFAB;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (catchingFishMoshiGlide.CatchingFishUnitTesting && !catchingFishMoshiGlide.CatchingFishStateLiveData) {
                        f2 = catchingFishMoshiGlide.CatchingFishFragmentHandler;
                    }
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit19 = null;
                    float f6 = f;
                    int i33 = 0;
                    while (i33 < size) {
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit20 = (CatchingFishDaggerRetrofit) arrayList4.get(i33);
                        float[] fArr = catchingFishDaggerRetrofit20.CatchingFishRetrofitMVI;
                        CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr7 = catchingFishDaggerRetrofit20.CatchingFishLayoutInflater;
                        float f7 = fArr[i];
                        if (f7 < f) {
                            if (catchingFishMoshiGlide.CatchingFishStateLiveData) {
                                arrayList2 = arrayList4;
                                i9 = size;
                                catchingFishHandlerOkHttp3.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnitArr7[i3 + 1].CatchingFishLayout, catchingFishStripeAPIJUnitArr7[i3].CatchingFishLayout, 0, 4);
                                i10 = i33;
                                f3 = f;
                                catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                                i33 = i10 + 1;
                                catchingFishMoshiGlideArr4 = catchingFishMoshiGlideArr3;
                                arrayList4 = arrayList2;
                                size = i9;
                                f = f3;
                            } else {
                                f7 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i9 = size;
                        if (f7 == f) {
                            i10 = i33;
                            catchingFishHandlerOkHttp3.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnitArr7[i3 + 1].CatchingFishLayout, catchingFishStripeAPIJUnitArr7[i3].CatchingFishLayout, 0, 8);
                            f3 = f;
                            catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                            i33 = i10 + 1;
                            catchingFishMoshiGlideArr4 = catchingFishMoshiGlideArr3;
                            arrayList4 = arrayList2;
                            size = i9;
                            f = f3;
                        } else {
                            i10 = i33;
                            if (catchingFishDaggerRetrofit19 != null) {
                                CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr8 = catchingFishDaggerRetrofit19.CatchingFishLayoutInflater;
                                CatchingFishHandlerGson catchingFishHandlerGson7 = catchingFishStripeAPIJUnitArr8[i3].CatchingFishLayout;
                                int i34 = i3 + 1;
                                CatchingFishHandlerGson catchingFishHandlerGson8 = catchingFishStripeAPIJUnitArr8[i34].CatchingFishLayout;
                                CatchingFishHandlerGson catchingFishHandlerGson9 = catchingFishStripeAPIJUnitArr7[i3].CatchingFishLayout;
                                CatchingFishHandlerGson catchingFishHandlerGson10 = catchingFishStripeAPIJUnitArr7[i34].CatchingFishLayout;
                                CatchingFishLayoutExoPlayer CatchingFishEspressoTesting2 = catchingFishHandlerOkHttp3.CatchingFishEspressoTesting();
                                catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofit20;
                                float f8 = f;
                                CatchingFishEspressoTesting2.CatchingFishSnackbar = f8;
                                f3 = f8;
                                if (f2 == f8 || f6 == f7) {
                                    catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                                    CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson7, 1.0f);
                                    CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson8, -1.0f);
                                    CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson10, 1.0f);
                                    CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson9, -1.0f);
                                } else {
                                    if (f6 == f3) {
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson7, 1.0f);
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson8, -1.0f);
                                    } else if (f7 == f) {
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson9, 1.0f);
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson10, -1.0f);
                                    } else {
                                        float f9 = (f6 / f2) / (f7 / f2);
                                        catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson7, 1.0f);
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson8, -1.0f);
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson10, f9);
                                        CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson9, -f9);
                                    }
                                    catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                                }
                                catchingFishHandlerOkHttp3.CatchingFishCoroutine(CatchingFishEspressoTesting2);
                            } else {
                                catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofit20;
                                f3 = f;
                                catchingFishMoshiGlideArr3 = catchingFishMoshiGlideArr4;
                            }
                            f6 = f7;
                            catchingFishDaggerRetrofit19 = catchingFishDaggerRetrofit6;
                            i33 = i10 + 1;
                            catchingFishMoshiGlideArr4 = catchingFishMoshiGlideArr3;
                            arrayList4 = arrayList2;
                            size = i9;
                            f = f3;
                        }
                    }
                }
                catchingFishMoshiGlideArr2 = catchingFishMoshiGlideArr4;
                if (catchingFishDaggerRetrofit16 == null || !(catchingFishDaggerRetrofit16 == catchingFishDaggerRetrofit17 || z14)) {
                    catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit17;
                    if (z4 && catchingFishDaggerRetrofit16 != null) {
                        int i35 = catchingFishMoshiGlide.CatchingFishFragmentHandler;
                        boolean z15 = i35 > 0 && catchingFishMoshiGlide.CatchingFishLayout == i35;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit21 = catchingFishDaggerRetrofit16;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit22 = catchingFishDaggerRetrofit21;
                        while (catchingFishDaggerRetrofit21 != null) {
                            CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr9 = catchingFishDaggerRetrofit21.CatchingFishLayoutInflater;
                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit23 = catchingFishDaggerRetrofit21.CatchingFishRetrofit[i];
                            while (true) {
                                if (catchingFishDaggerRetrofit23 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (catchingFishDaggerRetrofit23.CatchingFishMockkOkHttp != 8) {
                                    break;
                                } else {
                                    catchingFishDaggerRetrofit23 = catchingFishDaggerRetrofit23.CatchingFishRetrofit[i];
                                }
                            }
                            if (catchingFishDaggerRetrofit23 != null || catchingFishDaggerRetrofit21 == catchingFishDaggerRetrofit2) {
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit16 = catchingFishStripeAPIJUnitArr9[i3];
                                CatchingFishHandlerGson catchingFishHandlerGson11 = catchingFishStripeAPIJUnit16.CatchingFishLayout;
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit17 = catchingFishStripeAPIJUnit16.CatchingFishWorkManager;
                                CatchingFishHandlerGson catchingFishHandlerGson12 = catchingFishStripeAPIJUnit17 != null ? catchingFishStripeAPIJUnit17.CatchingFishLayout : null;
                                if (catchingFishDaggerRetrofit22 != catchingFishDaggerRetrofit21) {
                                    catchingFishHandlerGson12 = catchingFishDaggerRetrofit22.CatchingFishLayoutInflater[i3 + 1].CatchingFishLayout;
                                } else if (catchingFishDaggerRetrofit21 == catchingFishDaggerRetrofit16) {
                                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit18 = catchingFishDaggerRetrofit9.CatchingFishLayoutInflater[i3].CatchingFishWorkManager;
                                    catchingFishHandlerGson12 = catchingFishStripeAPIJUnit18 != null ? catchingFishStripeAPIJUnit18.CatchingFishLayout : null;
                                }
                                int CatchingFishDaggerWebsocket3 = catchingFishStripeAPIJUnit16.CatchingFishDaggerWebsocket();
                                int i36 = i3 + 1;
                                int CatchingFishDaggerWebsocket4 = catchingFishStripeAPIJUnitArr9[i36].CatchingFishDaggerWebsocket();
                                if (catchingFishDaggerRetrofit23 != null) {
                                    catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit23.CatchingFishLayoutInflater[i3];
                                    catchingFishHandlerGson3 = catchingFishStripeAPIJUnit2.CatchingFishLayout;
                                } else {
                                    catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i36].CatchingFishWorkManager;
                                    catchingFishHandlerGson3 = catchingFishStripeAPIJUnit2 != null ? catchingFishStripeAPIJUnit2.CatchingFishLayout : null;
                                }
                                CatchingFishHandlerGson catchingFishHandlerGson13 = catchingFishStripeAPIJUnitArr9[i36].CatchingFishLayout;
                                if (catchingFishStripeAPIJUnit2 != null) {
                                    CatchingFishDaggerWebsocket4 += catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
                                }
                                int CatchingFishDaggerWebsocket5 = catchingFishDaggerRetrofit22.CatchingFishLayoutInflater[i36].CatchingFishDaggerWebsocket() + CatchingFishDaggerWebsocket3;
                                if (catchingFishHandlerGson11 == null || catchingFishHandlerGson12 == null || catchingFishHandlerGson3 == null || catchingFishHandlerGson13 == null) {
                                    catchingFishDaggerRetrofit4 = catchingFishDaggerRetrofit9;
                                    catchingFishDaggerRetrofit5 = catchingFishDaggerRetrofit22;
                                    i7 = 8;
                                } else {
                                    if (catchingFishDaggerRetrofit21 == catchingFishDaggerRetrofit16) {
                                        CatchingFishDaggerWebsocket5 = catchingFishDaggerRetrofit16.CatchingFishLayoutInflater[i3].CatchingFishDaggerWebsocket();
                                    }
                                    if (catchingFishDaggerRetrofit21 == catchingFishDaggerRetrofit2) {
                                        CatchingFishDaggerWebsocket4 = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater[i36].CatchingFishDaggerWebsocket();
                                    }
                                    catchingFishDaggerRetrofit4 = catchingFishDaggerRetrofit9;
                                    catchingFishDaggerRetrofit5 = catchingFishDaggerRetrofit22;
                                    i7 = 8;
                                    catchingFishHandlerOkHttp.CatchingFishSnackbar(catchingFishHandlerGson11, catchingFishHandlerGson12, CatchingFishDaggerWebsocket5, 0.5f, catchingFishHandlerGson3, catchingFishHandlerGson13, CatchingFishDaggerWebsocket4, z15 ? 8 : 5);
                                }
                            } else {
                                catchingFishDaggerRetrofit4 = catchingFishDaggerRetrofit9;
                                catchingFishDaggerRetrofit5 = catchingFishDaggerRetrofit22;
                                i7 = i6;
                            }
                            if (catchingFishDaggerRetrofit21.CatchingFishMockkOkHttp != i7) {
                                catchingFishDaggerRetrofit5 = catchingFishDaggerRetrofit21;
                            }
                            catchingFishDaggerRetrofit21 = catchingFishDaggerRetrofit23;
                            catchingFishDaggerRetrofit22 = catchingFishDaggerRetrofit5;
                            catchingFishDaggerRetrofit9 = catchingFishDaggerRetrofit4;
                        }
                    } else if (z && catchingFishDaggerRetrofit16 != null) {
                        int i37 = catchingFishMoshiGlide.CatchingFishFragmentHandler;
                        boolean z16 = i37 > 0 && catchingFishMoshiGlide.CatchingFishLayout == i37;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit24 = catchingFishDaggerRetrofit16;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit25 = catchingFishDaggerRetrofit24;
                        while (catchingFishDaggerRetrofit24 != null) {
                            CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr10 = catchingFishDaggerRetrofit24.CatchingFishLayoutInflater;
                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit26 = catchingFishDaggerRetrofit24.CatchingFishRetrofit[i];
                            while (catchingFishDaggerRetrofit26 != null && catchingFishDaggerRetrofit26.CatchingFishMockkOkHttp == 8) {
                                catchingFishDaggerRetrofit26 = catchingFishDaggerRetrofit26.CatchingFishRetrofit[i];
                            }
                            if (catchingFishDaggerRetrofit24 != catchingFishDaggerRetrofit16 && catchingFishDaggerRetrofit24 != catchingFishDaggerRetrofit2 && catchingFishDaggerRetrofit26 != null) {
                                if (catchingFishDaggerRetrofit26 == catchingFishDaggerRetrofit2) {
                                    catchingFishDaggerRetrofit26 = null;
                                }
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit19 = catchingFishStripeAPIJUnitArr10[i3];
                                CatchingFishHandlerGson catchingFishHandlerGson14 = catchingFishStripeAPIJUnit19.CatchingFishLayout;
                                int i38 = i3 + 1;
                                CatchingFishHandlerGson catchingFishHandlerGson15 = catchingFishDaggerRetrofit25.CatchingFishLayoutInflater[i38].CatchingFishLayout;
                                int CatchingFishDaggerWebsocket6 = catchingFishStripeAPIJUnit19.CatchingFishDaggerWebsocket();
                                int CatchingFishDaggerWebsocket7 = catchingFishStripeAPIJUnitArr10[i38].CatchingFishDaggerWebsocket();
                                if (catchingFishDaggerRetrofit26 != null) {
                                    catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit26.CatchingFishLayoutInflater[i3];
                                    catchingFishHandlerGson2 = catchingFishStripeAPIJUnit.CatchingFishLayout;
                                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit20 = catchingFishStripeAPIJUnit.CatchingFishWorkManager;
                                    catchingFishHandlerGson = catchingFishStripeAPIJUnit20 != null ? catchingFishStripeAPIJUnit20.CatchingFishLayout : null;
                                } else {
                                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit21 = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater[i3];
                                    CatchingFishHandlerGson catchingFishHandlerGson16 = catchingFishStripeAPIJUnit21 != null ? catchingFishStripeAPIJUnit21.CatchingFishLayout : null;
                                    catchingFishHandlerGson = catchingFishStripeAPIJUnitArr10[i38].CatchingFishLayout;
                                    catchingFishStripeAPIJUnit = catchingFishStripeAPIJUnit21;
                                    catchingFishHandlerGson2 = catchingFishHandlerGson16;
                                }
                                if (catchingFishStripeAPIJUnit != null) {
                                    CatchingFishDaggerWebsocket7 += catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket();
                                }
                                int CatchingFishDaggerWebsocket8 = catchingFishDaggerRetrofit25.CatchingFishLayoutInflater[i38].CatchingFishDaggerWebsocket() + CatchingFishDaggerWebsocket6;
                                CatchingFishHandlerGson catchingFishHandlerGson17 = catchingFishHandlerGson2;
                                int i39 = CatchingFishDaggerWebsocket7;
                                CatchingFishHandlerGson catchingFishHandlerGson18 = catchingFishHandlerGson;
                                int i40 = z16 ? 8 : 4;
                                if (catchingFishHandlerGson14 == null || catchingFishHandlerGson15 == null || catchingFishHandlerGson17 == null || catchingFishHandlerGson18 == null) {
                                    catchingFishDaggerRetrofit3 = catchingFishDaggerRetrofit26;
                                } else {
                                    catchingFishDaggerRetrofit3 = catchingFishDaggerRetrofit26;
                                    catchingFishHandlerOkHttp.CatchingFishSnackbar(catchingFishHandlerGson14, catchingFishHandlerGson15, CatchingFishDaggerWebsocket8, 0.5f, catchingFishHandlerGson17, catchingFishHandlerGson18, i39, i40);
                                }
                                catchingFishDaggerRetrofit26 = catchingFishDaggerRetrofit3;
                            }
                            if (catchingFishDaggerRetrofit24.CatchingFishMockkOkHttp != 8) {
                                catchingFishDaggerRetrofit25 = catchingFishDaggerRetrofit24;
                            }
                            catchingFishDaggerRetrofit24 = catchingFishDaggerRetrofit26;
                        }
                        catchingFishHandlerOkHttp2 = catchingFishHandlerOkHttp;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit22 = catchingFishDaggerRetrofit16.CatchingFishLayoutInflater[i3];
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit23 = catchingFishDaggerRetrofit9.CatchingFishLayoutInflater[i3].CatchingFishWorkManager;
                        int i41 = i3 + 1;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit24 = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater[i41];
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit25 = catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i41].CatchingFishWorkManager;
                        if (catchingFishStripeAPIJUnit23 != null) {
                            if (catchingFishDaggerRetrofit16 != catchingFishDaggerRetrofit2) {
                                catchingFishHandlerOkHttp2.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit22.CatchingFishLayout, catchingFishStripeAPIJUnit23.CatchingFishLayout, catchingFishStripeAPIJUnit22.CatchingFishDaggerWebsocket(), 5);
                            } else if (catchingFishStripeAPIJUnit25 != null) {
                                catchingFishHandlerOkHttp2.CatchingFishSnackbar(catchingFishStripeAPIJUnit22.CatchingFishLayout, catchingFishStripeAPIJUnit23.CatchingFishLayout, catchingFishStripeAPIJUnit22.CatchingFishDaggerWebsocket(), 0.5f, catchingFishStripeAPIJUnit24.CatchingFishLayout, catchingFishStripeAPIJUnit25.CatchingFishLayout, catchingFishStripeAPIJUnit24.CatchingFishDaggerWebsocket(), 5);
                            }
                        }
                        if (catchingFishStripeAPIJUnit25 != null && catchingFishDaggerRetrofit16 != catchingFishDaggerRetrofit2) {
                            catchingFishHandlerOkHttp2.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit24.CatchingFishLayout, catchingFishStripeAPIJUnit25.CatchingFishLayout, -catchingFishStripeAPIJUnit24.CatchingFishDaggerWebsocket(), 5);
                        }
                        if ((!z4 || z) && catchingFishDaggerRetrofit16 != null && catchingFishDaggerRetrofit16 != catchingFishDaggerRetrofit2) {
                            CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr11 = catchingFishDaggerRetrofit16.CatchingFishLayoutInflater;
                            catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnitArr11[i3];
                            if (catchingFishDaggerRetrofit2 == null) {
                                catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit16;
                            }
                            catchingFishStripeAPIJUnitArr = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater;
                            i8 = i3 + 1;
                            catchingFishStripeAPIJUnit4 = catchingFishStripeAPIJUnitArr[i8];
                            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit26 = catchingFishStripeAPIJUnit3.CatchingFishWorkManager;
                            catchingFishHandlerGson4 = catchingFishStripeAPIJUnit26 == null ? catchingFishStripeAPIJUnit26.CatchingFishLayout : null;
                            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit27 = catchingFishStripeAPIJUnit4.CatchingFishWorkManager;
                            catchingFishHandlerGson5 = catchingFishStripeAPIJUnit27 == null ? catchingFishStripeAPIJUnit27.CatchingFishLayout : null;
                            if (catchingFishDaggerRetrofit15 != catchingFishDaggerRetrofit2) {
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit28 = catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i8].CatchingFishWorkManager;
                                catchingFishHandlerGson5 = catchingFishStripeAPIJUnit28 != null ? catchingFishStripeAPIJUnit28.CatchingFishLayout : null;
                            }
                            if (catchingFishDaggerRetrofit16 == catchingFishDaggerRetrofit2) {
                                catchingFishStripeAPIJUnit4 = catchingFishStripeAPIJUnitArr11[i8];
                            }
                            if (catchingFishHandlerGson4 != null && catchingFishHandlerGson5 != null) {
                                catchingFishHandlerOkHttp2.CatchingFishSnackbar(catchingFishStripeAPIJUnit3.CatchingFishLayout, catchingFishHandlerGson4, catchingFishStripeAPIJUnit3.CatchingFishDaggerWebsocket(), 0.5f, catchingFishHandlerGson5, catchingFishStripeAPIJUnit4.CatchingFishLayout, catchingFishStripeAPIJUnitArr[i8].CatchingFishDaggerWebsocket(), 5);
                            }
                        }
                    }
                } else {
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit29 = catchingFishDaggerRetrofit9.CatchingFishLayoutInflater[i3];
                    int i42 = i3 + 1;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit30 = catchingFishDaggerRetrofit15.CatchingFishLayoutInflater[i42];
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit31 = catchingFishStripeAPIJUnit29.CatchingFishWorkManager;
                    CatchingFishHandlerGson catchingFishHandlerGson19 = catchingFishStripeAPIJUnit31 != null ? catchingFishStripeAPIJUnit31.CatchingFishLayout : null;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit32 = catchingFishStripeAPIJUnit30.CatchingFishWorkManager;
                    CatchingFishHandlerGson catchingFishHandlerGson20 = catchingFishStripeAPIJUnit32 != null ? catchingFishStripeAPIJUnit32.CatchingFishLayout : null;
                    CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit33 = catchingFishDaggerRetrofit16.CatchingFishLayoutInflater[i3];
                    if (catchingFishDaggerRetrofit17 != null) {
                        catchingFishStripeAPIJUnit30 = catchingFishDaggerRetrofit17.CatchingFishLayoutInflater[i42];
                    }
                    if (catchingFishHandlerGson19 == null || catchingFishHandlerGson20 == null) {
                        catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit17;
                    } else {
                        float f10 = i == 0 ? catchingFishDaggerRetrofit18.CatchingFishRedux : catchingFishDaggerRetrofit18.CatchingFishCustomViewJUnit;
                        int CatchingFishDaggerWebsocket9 = catchingFishStripeAPIJUnit33.CatchingFishDaggerWebsocket();
                        int CatchingFishDaggerWebsocket10 = catchingFishStripeAPIJUnit30.CatchingFishDaggerWebsocket();
                        CatchingFishHandlerGson catchingFishHandlerGson21 = catchingFishStripeAPIJUnit33.CatchingFishLayout;
                        CatchingFishHandlerGson catchingFishHandlerGson22 = catchingFishStripeAPIJUnit30.CatchingFishLayout;
                        CatchingFishHandlerGson catchingFishHandlerGson23 = catchingFishHandlerGson19;
                        catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit17;
                        catchingFishHandlerOkHttp3.CatchingFishSnackbar(catchingFishHandlerGson21, catchingFishHandlerGson23, CatchingFishDaggerWebsocket9, f10, catchingFishHandlerGson20, catchingFishHandlerGson22, CatchingFishDaggerWebsocket10, 7);
                    }
                }
                catchingFishHandlerOkHttp2 = catchingFishHandlerOkHttp;
                if (!z4) {
                }
                CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr112 = catchingFishDaggerRetrofit16.CatchingFishLayoutInflater;
                catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnitArr112[i3];
                if (catchingFishDaggerRetrofit2 == null) {
                }
                catchingFishStripeAPIJUnitArr = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater;
                i8 = i3 + 1;
                catchingFishStripeAPIJUnit4 = catchingFishStripeAPIJUnitArr[i8];
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit262 = catchingFishStripeAPIJUnit3.CatchingFishWorkManager;
                if (catchingFishStripeAPIJUnit262 == null) {
                }
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit272 = catchingFishStripeAPIJUnit4.CatchingFishWorkManager;
                if (catchingFishStripeAPIJUnit272 == null) {
                }
                if (catchingFishDaggerRetrofit15 != catchingFishDaggerRetrofit2) {
                }
                if (catchingFishDaggerRetrofit16 == catchingFishDaggerRetrofit2) {
                }
                if (catchingFishHandlerGson4 != null) {
                    catchingFishHandlerOkHttp2.CatchingFishSnackbar(catchingFishStripeAPIJUnit3.CatchingFishLayout, catchingFishHandlerGson4, catchingFishStripeAPIJUnit3.CatchingFishDaggerWebsocket(), 0.5f, catchingFishHandlerGson5, catchingFishStripeAPIJUnit4.CatchingFishLayout, catchingFishStripeAPIJUnitArr[i8].CatchingFishDaggerWebsocket(), 5);
                }
            } else {
                i5 = i15;
                catchingFishMoshiGlideArr2 = catchingFishMoshiGlideArr4;
            }
            i16 = i4 + 1;
            catchingFishGsonAppCompat2 = catchingFishGsonAppCompat;
            catchingFishHandlerOkHttp3 = catchingFishHandlerOkHttp;
            arrayList3 = arrayList;
            catchingFishMoshiGlideArr4 = catchingFishMoshiGlideArr2;
            i15 = i5;
        }
    }

    public static final CatchingFishLayoutCameraX CatchingFishFragmentFactory(CatchingFishDataStoreFlux catchingFishDataStoreFlux) {
        CatchingFishRoomSharedFlow catchingFishRoomSharedFlow = new CatchingFishRoomSharedFlow();
        CatchingFishMVVMCameraX CatchingFishCoroutine2 = catchingFishDataStoreFlux instanceof CatchingFishHandlerMVPRealm ? ((CatchingFishHandlerMVPRealm) catchingFishDataStoreFlux).CatchingFishCoroutine() : CatchingFishMoshiStateFlow.CatchingFishSnackbar;
        CatchingFishNavigation(CatchingFishCoroutine2, "extras");
        CatchingFishManifestService CatchingFishReduxKtor2 = catchingFishDataStoreFlux.CatchingFishReduxKtor();
        CatchingFishNavigation(CatchingFishReduxKtor2, "store");
        return (CatchingFishLayoutCameraX) new CatchingFishFluxFluxBundle(CatchingFishReduxKtor2, catchingFishRoomSharedFlow, CatchingFishCoroutine2).CatchingFishNavigation(CatchingFishContextFlux.CatchingFishParcelableFAB(CatchingFishLayoutCameraX.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void CatchingFishFragmentHandler(final boolean z, CatchingFishMockkView catchingFishMockkView, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        int i2;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(1340106664);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (catchingFishSharedFlowMVI.CatchingFishWorkManager(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishMockkView) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        } else {
            int i4 = 3;
            CatchingFishBundleAnimation CatchingFishCoroutine2 = androidx.compose.foundation.layout.CatchingFishViewPagerToast.CatchingFishSnackbar.CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishAdMobWidgetRoom(i4, i4))).CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishAdMobWidgetRoom(i4, i3))).CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishAdMobWidgetRoom(i4, 1)));
            WeakHashMap weakHashMap = CatchingFishServiceMockk.CatchingFishDaggerHiltFAB;
            CatchingFishMVPSnackbar catchingFishMVPSnackbar = CatchingFishExoPlayerMVP.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI).CatchingFishSnackbar;
            CatchingFishMVIJobScheduler catchingFishMVIJobScheduler = CatchingFishAndroidXAdMob.CatchingFishParcelableFAB;
            CatchingFishBundleAnimation CatchingFishCoroutine3 = CatchingFishCoroutine2.CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishManifestGraphQL(catchingFishMVPSnackbar)));
            catchingFishSharedFlowMVI.CatchingFishParcelable(-1009615302);
            boolean z2 = (i2 & 112) == 32;
            Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
            if (z2 || CatchingFishPayPalService == catchingFishGradleMVVM) {
                CatchingFishPayPalService = new CatchingFishFragmentFactory(6, catchingFishMockkView);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
            }
            CatchingFishServiceHandler catchingFishServiceHandler = (CatchingFishServiceHandler) CatchingFishPayPalService;
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            catchingFishSharedFlowMVI.CatchingFishParcelable(-1009601087);
            int i5 = (i2 & 14) != 4 ? 0 : 1;
            Object CatchingFishPayPalService2 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (i5 != 0 || CatchingFishPayPalService2 == catchingFishGradleMVVM) {
                CatchingFishPayPalService2 = new CatchingFishServiceHandler() { // from class: kotlin.text.CatchingFishMoshiManifest
                    @Override // kotlin.text.CatchingFishServiceHandler
                    public final Object CatchingFishFragmentHandler(Object obj) {
                        FrameLayout frameLayout = (FrameLayout) obj;
                        CatchingFishFirebaseDagger.CatchingFishNavigation(frameLayout, "container");
                        int i6 = z ? 0 : 4;
                        View childAt = frameLayout.getChildAt(0);
                        WebView webView = childAt instanceof WebView ? (WebView) childAt : null;
                        if (webView != null) {
                            webView.setVisibility(i6);
                        }
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                };
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService2);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            androidx.compose.ui.viewinterop.CatchingFishPagingLibrary.CatchingFishParcelableFAB(catchingFishServiceHandler, CatchingFishCoroutine3, (CatchingFishServiceHandler) CatchingFishPayPalService2, catchingFishSharedFlowMVI, 0);
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 != null) {
            CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishXMLLayoutMVP(i, catchingFishMockkView, z);
        }
    }

    public static final long CatchingFishGradleManifest(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static void CatchingFishGsonAppCompat(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) obj;
            CatchingFishCameraXFAB catchingFishCameraXFAB = new CatchingFishCameraXFAB(catchingFishToastKtor);
            for (CatchingFishFABDagger catchingFishFABDagger : catchingFishToastKtor.CatchingFishSnackbar) {
                boolean z = catchingFishToastKtor.CatchingFishDaggerWebsocket == 0;
                CatchingFishMotionLayoutMVI catchingFishMotionLayoutMVI = new CatchingFishMotionLayoutMVI(catchingFishFABDagger, !z);
                if (!hashMap.containsKey(catchingFishMotionLayoutMVI)) {
                    hashMap.put(catchingFishMotionLayoutMVI, new HashSet());
                }
                Set set = (Set) hashMap.get(catchingFishMotionLayoutMVI);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + catchingFishFABDagger + ".");
                }
                set.add(catchingFishCameraXFAB);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (CatchingFishCameraXFAB catchingFishCameraXFAB2 : (Set) it.next()) {
                for (CatchingFishGlideDaggerHilt catchingFishGlideDaggerHilt : catchingFishCameraXFAB2.CatchingFishParcelableFAB.CatchingFishCoroutine) {
                    if (catchingFishGlideDaggerHilt.CatchingFishCoroutine == 0) {
                        Set<CatchingFishCameraXFAB> set2 = (Set) hashMap.get(new CatchingFishMotionLayoutMVI(catchingFishGlideDaggerHilt.CatchingFishParcelableFAB, catchingFishGlideDaggerHilt.CatchingFishSnackbar == 2));
                        if (set2 != null) {
                            for (CatchingFishCameraXFAB catchingFishCameraXFAB3 : set2) {
                                catchingFishCameraXFAB2.CatchingFishSnackbar.add(catchingFishCameraXFAB3);
                                catchingFishCameraXFAB3.CatchingFishCoroutine.add(catchingFishCameraXFAB2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            CatchingFishCameraXFAB catchingFishCameraXFAB4 = (CatchingFishCameraXFAB) it3.next();
            if (catchingFishCameraXFAB4.CatchingFishCoroutine.isEmpty()) {
                hashSet2.add(catchingFishCameraXFAB4);
            }
        }
        while (!hashSet2.isEmpty()) {
            CatchingFishCameraXFAB catchingFishCameraXFAB5 = (CatchingFishCameraXFAB) hashSet2.iterator().next();
            hashSet2.remove(catchingFishCameraXFAB5);
            i++;
            Iterator it4 = catchingFishCameraXFAB5.CatchingFishSnackbar.iterator();
            while (it4.hasNext()) {
                CatchingFishCameraXFAB catchingFishCameraXFAB6 = (CatchingFishCameraXFAB) it4.next();
                catchingFishCameraXFAB6.CatchingFishCoroutine.remove(catchingFishCameraXFAB5);
                if (catchingFishCameraXFAB6.CatchingFishCoroutine.isEmpty()) {
                    hashSet2.add(catchingFishCameraXFAB6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            CatchingFishCameraXFAB catchingFishCameraXFAB7 = (CatchingFishCameraXFAB) it5.next();
            if (!catchingFishCameraXFAB7.CatchingFishCoroutine.isEmpty() && !catchingFishCameraXFAB7.CatchingFishSnackbar.isEmpty()) {
                arrayList2.add(catchingFishCameraXFAB7.CatchingFishParcelableFAB);
            }
        }
        throw new CatchingFishGraphQLRealm("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static void CatchingFishHandler(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static String CatchingFishJUnitRealm(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, (int) (j & 4294967295L), ')');
    }

    public static int CatchingFishJetpackCompose(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final CatchingFishHandlerAndroidX CatchingFishLayout(Object obj) {
        if (obj == null) {
            obj = CatchingFishAdMobFAB.CatchingFishViewModelScope;
        }
        return new CatchingFishHandlerAndroidX(obj);
    }

    public static final void CatchingFishLayoutInflater(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishViewModelFAB;
        CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
        loop0: while (true) {
            catchingFishFABStripeAPIFAB = null;
            if (CatchingFishJobScheduler == null) {
                break;
            }
            if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                while (catchingFishFABStripeAPIFAB2 != null) {
                    if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 1024) != 0) {
                        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2; catchingFishFABStripeAPIFAB3 != null; catchingFishFABStripeAPIFAB3 = null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB3;
                                break loop0;
                            }
                        }
                    }
                    catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                }
            }
            CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
            catchingFishFABStripeAPIFAB2 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
        }
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB;
        if (catchingFishAppCompatWidget2 == null) {
            if (catchingFishAppCompatWidget.CatchingFishParcelableFAB(CatchingFishAppCompatView.CatchingFishParcelableFAB) != null) {
                throw new ClassCastException();
            }
            return;
        }
        CatchingFishMVIJobScheduler catchingFishMVIJobScheduler = CatchingFishAppCompatView.CatchingFishParcelableFAB;
        if (catchingFishAppCompatWidget2.CatchingFishParcelableFAB(catchingFishMVIJobScheduler) != null) {
            throw new ClassCastException();
        }
        if (catchingFishAppCompatWidget.CatchingFishParcelableFAB(catchingFishMVIJobScheduler) != null) {
            throw new ClassCastException();
        }
    }

    public static void CatchingFishMotionLayout(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void CatchingFishNavigation(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = CatchingFishFirebaseDagger.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            CatchingFishMotionLayout(nullPointerException, CatchingFishFirebaseDagger.class.getName());
            throw nullPointerException;
        }
    }

    public static boolean CatchingFishOkHttp(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final int CatchingFishParcelable(CatchingFishKtorAnimation catchingFishKtorAnimation, int i) {
        int i2;
        int[] iArr = catchingFishKtorAnimation.CatchingFishLayout;
        int i3 = i + 1;
        int length = catchingFishKtorAnimation.CatchingFishViewModelFAB.length;
        CatchingFishNavigation(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long CatchingFishParcelableFAB(float f, float f2, float f3, float f4, CatchingFishEspressoHilt catchingFishEspressoHilt) {
        int i;
        int i2;
        int i3;
        float CatchingFishSnackbar2;
        float CatchingFishParcelableFAB2;
        int i4;
        int i5;
        int i6;
        int i7;
        float CatchingFishSnackbar3;
        float CatchingFishParcelableFAB3;
        int i8;
        int i9;
        int i10;
        if (catchingFishEspressoHilt.CatchingFishCoroutine()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = CatchingFishToastFragment.CatchingFishViewModelScope;
            return j;
        }
        long j2 = catchingFishEspressoHilt.CatchingFishSnackbar;
        int i15 = CatchingFishMockkSharedFlow.CatchingFishDaggerWebsocket;
        if (((int) (j2 >> 32)) != 3) {
            CatchingFishHiltFirebase.CatchingFishParcelableFAB("Color only works with ColorSpaces with 3 components");
        }
        int i16 = catchingFishEspressoHilt.CatchingFishCoroutine;
        if (i16 == -1) {
            CatchingFishHiltFirebase.CatchingFishParcelableFAB("Unknown color space, please use a color space in ColorSpaces");
        }
        float CatchingFishSnackbar4 = catchingFishEspressoHilt.CatchingFishSnackbar(0);
        float CatchingFishParcelableFAB4 = catchingFishEspressoHilt.CatchingFishParcelableFAB(0);
        if (f >= CatchingFishSnackbar4) {
            CatchingFishSnackbar4 = f;
        }
        if (CatchingFishSnackbar4 <= CatchingFishParcelableFAB4) {
            CatchingFishParcelableFAB4 = CatchingFishSnackbar4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(CatchingFishParcelableFAB4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i2 = i19 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i18 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i3;
                    CatchingFishSnackbar2 = catchingFishEspressoHilt.CatchingFishSnackbar(1);
                    CatchingFishParcelableFAB2 = catchingFishEspressoHilt.CatchingFishParcelableFAB(1);
                    if (f2 >= CatchingFishSnackbar2) {
                        CatchingFishSnackbar2 = f2;
                    }
                    if (CatchingFishSnackbar2 <= CatchingFishParcelableFAB2) {
                        CatchingFishParcelableFAB2 = CatchingFishSnackbar2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(CatchingFishParcelableFAB2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i22 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i7;
                                CatchingFishSnackbar3 = catchingFishEspressoHilt.CatchingFishSnackbar(2);
                                CatchingFishParcelableFAB3 = catchingFishEspressoHilt.CatchingFishParcelableFAB(2);
                                if (f3 >= CatchingFishSnackbar3) {
                                    CatchingFishSnackbar3 = f3;
                                }
                                if (CatchingFishSnackbar3 <= CatchingFishParcelableFAB3) {
                                    CatchingFishParcelableFAB3 = CatchingFishSnackbar3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(CatchingFishParcelableFAB3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i8 - 112;
                                    if (i26 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            long j3 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i28 = CatchingFishToastFragment.CatchingFishViewModelScope;
                                            return j3;
                                        }
                                        i9 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i9 = i29 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i24 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j32 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i282 = CatchingFishToastFragment.CatchingFishViewModelScope;
                                return j32;
                            }
                            i6 = i23;
                        } else if (i5 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i5);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i6 = i30 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i21 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    CatchingFishSnackbar3 = catchingFishEspressoHilt.CatchingFishSnackbar(2);
                    CatchingFishParcelableFAB3 = catchingFishEspressoHilt.CatchingFishParcelableFAB(2);
                    if (f3 >= CatchingFishSnackbar3) {
                    }
                    if (CatchingFishSnackbar3 <= CatchingFishParcelableFAB3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(CatchingFishParcelableFAB3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i242 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j322 = (i16 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2822 = CatchingFishToastFragment.CatchingFishViewModelScope;
                    return j322;
                }
                i2 = i20;
            } else if (i >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i2 = i31 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i17 << 15) | (i << 10);
        short s3 = (short) i3;
        CatchingFishSnackbar2 = catchingFishEspressoHilt.CatchingFishSnackbar(1);
        CatchingFishParcelableFAB2 = catchingFishEspressoHilt.CatchingFishParcelableFAB(1);
        if (f2 >= CatchingFishSnackbar2) {
        }
        if (CatchingFishSnackbar2 <= CatchingFishParcelableFAB2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(CatchingFishParcelableFAB2);
        int i212 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i212 << 15) | (i5 << 10);
        short s222 = (short) i7;
        CatchingFishSnackbar3 = catchingFishEspressoHilt.CatchingFishSnackbar(2);
        CatchingFishParcelableFAB3 = catchingFishEspressoHilt.CatchingFishParcelableFAB(2);
        if (f3 >= CatchingFishSnackbar3) {
        }
        if (CatchingFishSnackbar3 <= CatchingFishParcelableFAB3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(CatchingFishParcelableFAB3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2422 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j3222 = (i16 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i28222 = CatchingFishToastFragment.CatchingFishViewModelScope;
        return j3222;
    }

    public static final CatchingFishSnackbarRedux CatchingFishParcelableFlux(CatchingFishViewParcelable catchingFishViewParcelable) {
        LinkedHashMap linkedHashMap = catchingFishViewParcelable.CatchingFishParcelableFAB;
        CatchingFishJUnitLiveData catchingFishJUnitLiveData = (CatchingFishJUnitLiveData) linkedHashMap.get(CatchingFishEspressoTesting);
        if (catchingFishJUnitLiveData == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        CatchingFishDataStoreFlux catchingFishDataStoreFlux = (CatchingFishDataStoreFlux) linkedHashMap.get(CatchingFishOkHttp);
        if (catchingFishDataStoreFlux == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(CatchingFishUnitTesting);
        String str = (String) linkedHashMap.get(CatchingFishServiceHilt.CatchingFishFragmentHandler);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        CatchingFishFluxContext CatchingFishEspressoTesting2 = catchingFishJUnitLiveData.CatchingFishParcelableFAB().CatchingFishEspressoTesting();
        Bundle bundle2 = null;
        CatchingFishMockkRoom catchingFishMockkRoom = CatchingFishEspressoTesting2 instanceof CatchingFishMockkRoom ? (CatchingFishMockkRoom) CatchingFishEspressoTesting2 : null;
        if (catchingFishMockkRoom == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = CatchingFishFragmentFactory(catchingFishDataStoreFlux).CatchingFishSnackbar;
        CatchingFishSnackbarRedux catchingFishSnackbarRedux = (CatchingFishSnackbarRedux) linkedHashMap2.get(str);
        if (catchingFishSnackbarRedux != null) {
            return catchingFishSnackbarRedux;
        }
        catchingFishMockkRoom.CatchingFishSnackbar();
        Bundle bundle3 = catchingFishMockkRoom.CatchingFishCoroutine;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(new CatchingFishGsonWorkManager[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                catchingFishMockkRoom.CatchingFishCoroutine = null;
            }
            bundle2 = bundle4;
        }
        CatchingFishSnackbarRedux CatchingFishOkHttp2 = CatchingFishDaggerBiometric.CatchingFishOkHttp(bundle2, bundle);
        linkedHashMap2.put(str, CatchingFishOkHttp2);
        return CatchingFishOkHttp2;
    }

    public static final void CatchingFishPayPal(CatchingFishJUnitLiveData catchingFishJUnitLiveData) {
        CatchingFishMockkFirebase catchingFishMockkFirebase = catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishReduxKtor;
        if (catchingFishMockkFirebase != CatchingFishMockkFirebase.CatchingFishDaggerWebsocket && catchingFishMockkFirebase != CatchingFishMockkFirebase.CatchingFishWorkManager) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (catchingFishJUnitLiveData.CatchingFishParcelableFAB().CatchingFishEspressoTesting() == null) {
            CatchingFishMockkRoom catchingFishMockkRoom = new CatchingFishMockkRoom(catchingFishJUnitLiveData.CatchingFishParcelableFAB(), (CatchingFishDataStoreFlux) catchingFishJUnitLiveData);
            catchingFishJUnitLiveData.CatchingFishParcelableFAB().CatchingFishCardViewRealm("androidx.lifecycle.internal.SavedStateHandlesProvider", catchingFishMockkRoom);
            catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishParcelableFAB(new CatchingFishMoshiMVI(4, catchingFishMockkRoom));
        }
    }

    public static long CatchingFishReduxKtor(int i, int i2, int i3) {
        return CatchingFishSnackbar(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static void CatchingFishRoomDatabase(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        CatchingFishMotionLayout(nullPointerException, CatchingFishFirebaseDagger.class.getName());
        throw nullPointerException;
    }

    public static final long CatchingFishSnackbar(int i) {
        long j = i << 32;
        int i2 = CatchingFishToastFragment.CatchingFishViewModelScope;
        return j;
    }

    public static final int CatchingFishStateFlow(long j) {
        float[] fArr = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
        return (int) (CatchingFishToastFragment.CatchingFishParcelableFAB(j, CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket) >>> 32);
    }

    public static void CatchingFishStateLiveData(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        CatchingFishMotionLayout(nullPointerException, CatchingFishFirebaseDagger.class.getName());
        throw nullPointerException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishStripeAPI(Context context, Executor executor, CatchingFishEspressoToast catchingFishEspressoToast, boolean z) {
        boolean z2;
        ?? r7;
        CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr;
        CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr2;
        CatchingFishGlideGraphQL[] catchingFishGlideGraphQLArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        CatchingFishAndroidXMVVM catchingFishAndroidXMVVM;
        String str;
        String str2;
        FileInputStream CatchingFishParcelableFAB2;
        boolean z8;
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z9 = readLong == packageInfo.lastUpdateTime;
                            if (z9) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z9) {
                        context.getPackageName();
                        CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, false);
                        return;
                    }
                }
                z9 = false;
                if (z9) {
                }
            }
            context.getPackageName();
            byte[] bArr2 = CatchingFishLayoutRoomFAB.CatchingFishWorkManager;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            CatchingFishAndroidXMVVM catchingFishAndroidXMVVM2 = new CatchingFishAndroidXMVVM(assets, executor, catchingFishEspressoToast, name, file2);
            byte[] bArr3 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        catchingFishAndroidXMVVM2.CatchingFishSnackbar(4, null);
                    }
                    catchingFishAndroidXMVVM2.CatchingFishWorkManager = true;
                    try {
                        try {
                            r7 = catchingFishAndroidXMVVM2.CatchingFishParcelableFAB(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            catchingFishEspressoToast.CatchingFishReduxKtor(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                            if (catchingFishGlideGraphQLArr2 != null) {
                            }
                            CatchingFishEspressoToast catchingFishEspressoToast2 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                            catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                            byte[] bArr4 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                            boolean z10 = r7;
                            z10 = r7;
                            if (catchingFishGlideGraphQLArr3 != null) {
                            }
                            bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                        } catch (IOException e2) {
                            catchingFishEspressoToast.CatchingFishReduxKtor(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                            if (catchingFishGlideGraphQLArr2 != null) {
                            }
                            CatchingFishEspressoToast catchingFishEspressoToast22 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                            catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                            byte[] bArr42 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                            boolean z102 = r7;
                            z102 = r7;
                            if (catchingFishGlideGraphQLArr3 != null) {
                            }
                            bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                        }
                        if (r7 != 0) {
                            try {
                            } catch (IOException e3) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(7, e3);
                                try {
                                    r7.close();
                                } catch (IOException e4) {
                                    catchingFishEspressoToast.CatchingFishReduxKtor(7, e4);
                                }
                                catchingFishGlideGraphQLArr = null;
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = catchingFishGlideGraphQLArr;
                                catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                                if (catchingFishGlideGraphQLArr2 != null) {
                                }
                                CatchingFishEspressoToast catchingFishEspressoToast222 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                                catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                                byte[] bArr422 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                                boolean z1022 = r7;
                                z1022 = r7;
                                if (catchingFishGlideGraphQLArr3 != null) {
                                }
                                bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                            } catch (IllegalStateException e5) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(8, e5);
                                r7.close();
                                catchingFishGlideGraphQLArr = null;
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = catchingFishGlideGraphQLArr;
                                catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                                if (catchingFishGlideGraphQLArr2 != null) {
                                }
                                CatchingFishEspressoToast catchingFishEspressoToast2222 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                                catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                                byte[] bArr4222 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                                boolean z10222 = r7;
                                z10222 = r7;
                                if (catchingFishGlideGraphQLArr3 != null) {
                                }
                                bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                            }
                            if (!Arrays.equals(bArr2, CatchingFishLayoutRoomFAB.CatchingFishPayPalLiveData(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            catchingFishGlideGraphQLArr = CatchingFishLayoutRoomFAB.CatchingFishDataStoreIntent(r7, CatchingFishLayoutRoomFAB.CatchingFishPayPalLiveData(r7, 4), catchingFishAndroidXMVVM2.CatchingFishDaggerWebsocket);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(7, e6);
                            }
                            catchingFishAndroidXMVVM2.CatchingFishViewModelScope = catchingFishGlideGraphQLArr;
                        }
                        catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                        if (catchingFishGlideGraphQLArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                CatchingFishParcelableFAB2 = catchingFishAndroidXMVVM2.CatchingFishParcelableFAB(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                catchingFishEspressoToast.CatchingFishReduxKtor(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = null;
                                catchingFishEspressoToast.CatchingFishReduxKtor(8, e9);
                                str = r7;
                            }
                            if (CatchingFishParcelableFAB2 == null) {
                                try {
                                    if (!Arrays.equals(CatchingFishLayoutRoomFAB.CatchingFishViewModelScope, CatchingFishLayoutRoomFAB.CatchingFishPayPalLiveData(CatchingFishParcelableFAB2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] CatchingFishPayPalLiveData = CatchingFishLayoutRoomFAB.CatchingFishPayPalLiveData(CatchingFishParcelableFAB2, 4);
                                    catchingFishAndroidXMVVM2.CatchingFishViewModelScope = CatchingFishLayoutRoomFAB.CatchingFishParcelable(CatchingFishParcelableFAB2, CatchingFishPayPalLiveData, bArr3, catchingFishGlideGraphQLArr2);
                                    CatchingFishParcelableFAB2.close();
                                    catchingFishAndroidXMVVM = catchingFishAndroidXMVVM2;
                                    r7 = CatchingFishPayPalLiveData;
                                    if (catchingFishAndroidXMVVM != null) {
                                        catchingFishAndroidXMVVM2 = catchingFishAndroidXMVVM;
                                    }
                                } finally {
                                }
                            } else {
                                if (CatchingFishParcelableFAB2 != null) {
                                    CatchingFishParcelableFAB2.close();
                                    str = str2;
                                }
                                catchingFishAndroidXMVVM = null;
                                r7 = str;
                                if (catchingFishAndroidXMVVM != null) {
                                }
                            }
                        }
                        CatchingFishEspressoToast catchingFishEspressoToast22222 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                        catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                        byte[] bArr42222 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                        boolean z102222 = r7;
                        z102222 = r7;
                        if (catchingFishGlideGraphQLArr3 != null && bArr42222 != null) {
                            r72 = catchingFishAndroidXMVVM2.CatchingFishWorkManager;
                            if (r72 != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                catchingFishEspressoToast22222.CatchingFishReduxKtor(7, e10);
                                z7 = r72;
                            } catch (IllegalStateException e11) {
                                catchingFishEspressoToast22222.CatchingFishReduxKtor(8, e11);
                                z7 = r72;
                            }
                            if (CatchingFishLayoutRoomFAB.CatchingFishRedux(r72, bArr42222, catchingFishGlideGraphQLArr3)) {
                                catchingFishAndroidXMVVM2.CatchingFishViewModelFAB = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = null;
                                z102222 = z7;
                            } else {
                                catchingFishEspressoToast22222.CatchingFishReduxKtor(5, null);
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = null;
                                r72.close();
                                z102222 = r72;
                            }
                        }
                        bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!catchingFishAndroidXMVVM2.CatchingFishWorkManager) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(catchingFishAndroidXMVVM2.CatchingFishReduxKtor);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                catchingFishAndroidXMVVM2.CatchingFishSnackbar(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                catchingFishAndroidXMVVM2.CatchingFishViewModelFAB = null;
                                                                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        catchingFishAndroidXMVVM2.CatchingFishSnackbar(6, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                                    } catch (IOException e13) {
                                        e = e13;
                                        catchingFishAndroidXMVVM2.CatchingFishSnackbar(7, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    z102222 = true;
                                    catchingFishAndroidXMVVM2.CatchingFishSnackbar(6, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                                } catch (IOException e15) {
                                    e = e15;
                                    z102222 = true;
                                    catchingFishAndroidXMVVM2.CatchingFishSnackbar(7, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
                                }
                            } finally {
                                catchingFishAndroidXMVVM2.CatchingFishViewModelFAB = null;
                                catchingFishAndroidXMVVM2.CatchingFishViewModelScope = null;
                            }
                        }
                        if (z4) {
                            CatchingFishCameraXIntent(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z8 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            catchingFishAndroidXMVVM2.CatchingFishSnackbar(4, null);
                        }
                        catchingFishAndroidXMVVM2.CatchingFishWorkManager = true;
                        r7 = catchingFishAndroidXMVVM2.CatchingFishParcelableFAB(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        catchingFishGlideGraphQLArr2 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                        if (catchingFishGlideGraphQLArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            CatchingFishParcelableFAB2 = catchingFishAndroidXMVVM2.CatchingFishParcelableFAB(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (CatchingFishParcelableFAB2 == null) {
                            }
                        }
                        CatchingFishEspressoToast catchingFishEspressoToast222222 = catchingFishAndroidXMVVM2.CatchingFishSnackbar;
                        catchingFishGlideGraphQLArr3 = catchingFishAndroidXMVVM2.CatchingFishViewModelScope;
                        byte[] bArr422222 = catchingFishAndroidXMVVM2.CatchingFishCoroutine;
                        boolean z1022222 = r7;
                        z1022222 = r7;
                        if (catchingFishGlideGraphQLArr3 != null) {
                            r72 = catchingFishAndroidXMVVM2.CatchingFishWorkManager;
                            if (r72 != 0) {
                            }
                        }
                        bArr = catchingFishAndroidXMVVM2.CatchingFishViewModelFAB;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z8 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        catchingFishAndroidXMVVM2.CatchingFishSnackbar(4, null);
                    }
                }
                CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
            }
            catchingFishAndroidXMVVM2.CatchingFishSnackbar(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z8 = z2;
            CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, (z6 || !z) ? false : z8);
        } catch (PackageManager.NameNotFoundException e16) {
            catchingFishEspressoToast.CatchingFishReduxKtor(7, e16);
            CatchingFishCameraXSnackbar.CatchingFishCoroutine(context, false);
        }
    }

    public static final boolean CatchingFishUnitTesting(Object obj) {
        if (obj instanceof CatchingFishMVVMRedux) {
            CatchingFishMVVMRedux catchingFishMVVMRedux = (CatchingFishMVVMRedux) obj;
            if (catchingFishMVVMRedux.CatchingFishReduxKtor() == CatchingFishMVPExoPlayer.CatchingFishFragmentHandler || catchingFishMVVMRedux.CatchingFishReduxKtor() == CatchingFishGradleMVVM.CatchingFishJetpackCompose || catchingFishMVVMRedux.CatchingFishReduxKtor() == CatchingFishMVPExoPlayer.CatchingFishCloudMessaging) {
                Object value = catchingFishMVVMRedux.getValue();
                if (value == null) {
                    return true;
                }
                return CatchingFishUnitTesting(value);
            }
        } else {
            if ((obj instanceof CatchingFishIntentAnimation) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (CatchingFishWorkManager[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void CatchingFishViewModelFAB(final int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, final int i2) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(1830435431);
        int i3 = (catchingFishSharedFlowMVI.CatchingFishCoroutine(i) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        } else {
            catchingFishSharedFlowMVI.CatchingFishParcelable(985209080);
            boolean z = (i3 & 14) == 4;
            Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (z || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
                CatchingFishPayPalService = new CatchingFishJUnitGlide() { // from class: kotlin.text.CatchingFishGlideCardView
                    @Override // kotlin.text.CatchingFishJUnitGlide
                    public final Object CatchingFishParcelableFAB() {
                        return Float.valueOf(i / 100.0f);
                    }
                };
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            CatchingFishToolbarJUnit.CatchingFishParcelableFAB((CatchingFishJUnitGlide) CatchingFishPayPalService, androidx.compose.foundation.layout.CatchingFishViewPagerToast.CatchingFishParcelableFAB.CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishAdMobWidgetRoom(3, 3))), 0L, 0L, 0, 0.0f, null, catchingFishSharedFlowMVI, 0);
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 != null) {
            CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishMockkView(i, i2) { // from class: kotlin.text.CatchingFishDaggerPayPal
                public final /* synthetic */ int CatchingFishReduxKtor;

                @Override // kotlin.text.CatchingFishMockkView
                public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int CatchingFishRecyclerView = CatchingFishDaggerBiometric.CatchingFishRecyclerView(1);
                    CatchingFishFirebaseDagger.CatchingFishViewModelFAB(this.CatchingFishReduxKtor, (CatchingFishSharedFlowMVI) obj, CatchingFishRecyclerView);
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
            };
        }
    }

    public static final void CatchingFishViewModelScope(int i, boolean z, CatchingFishMockkView catchingFishMockkView, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i2) {
        CatchingFishNavigation(catchingFishMockkView, "onWebContainerCreated");
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-587138709);
        int i3 = (catchingFishSharedFlowMVI.CatchingFishCoroutine(i) ? 4 : 2) | i2 | (catchingFishSharedFlowMVI.CatchingFishWorkManager(z) ? 32 : 16) | (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishMockkView) ? 256 : 128);
        if ((i3 & 147) == 146 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        } else {
            CatchingFishBundleAnimation CatchingFishParcelableFAB2 = androidx.compose.foundation.CatchingFishPagingLibrary.CatchingFishParcelableFAB(androidx.compose.foundation.layout.CatchingFishViewPagerToast.CatchingFishSnackbar, ((CatchingFishLiveDataKtor) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishGradleContext.CatchingFishParcelableFAB)).CatchingFishUnitTesting);
            CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishDaggerWebsocket;
            Object obj = (CatchingFishManifestJUnit) CatchingFishParcelableAdMob.CatchingFishParcelableFAB.get(catchingFishReduxAndroidX);
            if (obj == null) {
                obj = new CatchingFishJUnitMoshi(catchingFishReduxAndroidX, false);
            }
            int hashCode = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
            CatchingFishBundleAnimation CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishSensorManager(catchingFishSharedFlowMVI, CatchingFishParcelableFAB2);
            CatchingFishFABMVP.CatchingFishSnackbar.getClass();
            CatchingFishLayoutAnimation catchingFishLayoutAnimation = CatchingFishWidgetSnackbar.CatchingFishSnackbar;
            catchingFishSharedFlowMVI.CatchingFishAppCompat();
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                catchingFishSharedFlowMVI.CatchingFishFragmentHandler(catchingFishLayoutAnimation);
            } else {
                catchingFishSharedFlowMVI.CatchingFishRedux();
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(obj, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishDaggerWebsocket);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishCloudMessaging2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishReduxKtor);
            CatchingFishLiveDataRoom catchingFishLiveDataRoom = CatchingFishWidgetSnackbar.CatchingFishWorkManager;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), Integer.valueOf(hashCode))) {
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(Integer.valueOf(hashCode));
                catchingFishSharedFlowMVI.CatchingFishSnackbar(Integer.valueOf(hashCode), catchingFishLiveDataRoom);
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishSensorManager, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishCoroutine);
            CatchingFishFragmentHandler(z, catchingFishMockkView, catchingFishSharedFlowMVI, (i3 >> 3) & 126);
            catchingFishSharedFlowMVI.CatchingFishParcelable(774435727);
            if (i < 100) {
                CatchingFishViewModelFAB(i, catchingFishSharedFlowMVI, i3 & 14);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            catchingFishSharedFlowMVI.CatchingFishParcelable(774437449);
            if (!z) {
                CatchingFishWorkManager(0, catchingFishSharedFlowMVI);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(true);
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 != null) {
            CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishXMLLayoutMVP(i, z, catchingFishMockkView, i2);
        }
    }

    public static final void CatchingFishWorkManager(int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-1158292780);
        if (i == 0 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        } else {
            Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            Object obj = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
            if (CatchingFishPayPalService == obj) {
                CatchingFishPayPalService = new CatchingFishMVPWidget();
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
            }
            CatchingFishMVPWidget catchingFishMVPWidget = (CatchingFishMVPWidget) CatchingFishPayPalService;
            catchingFishMVPWidget.CatchingFishParcelableFAB(0, catchingFishSharedFlowMVI);
            CatchingFishPayPalWidget catchingFishPayPalWidget = new CatchingFishPayPalWidget(new CatchingFishSnackbarAdMob(CatchingFishViewNavigation.CatchingFishParcelableFAB), 1, 0);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(360.0f);
            Object CatchingFishPayPalService2 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService2 == obj) {
                CatchingFishPayPalService2 = new CatchingFishHiltFlux(catchingFishMVPWidget, valueOf, valueOf2, catchingFishPayPalWidget);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService2);
            }
            CatchingFishHiltFlux catchingFishHiltFlux = (CatchingFishHiltFlux) CatchingFishPayPalService2;
            boolean CatchingFishViewModelScope2 = catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishPayPalWidget);
            Object CatchingFishPayPalService3 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope2 || CatchingFishPayPalService3 == obj) {
                CatchingFishPayPalService3 = new CatchingFishToastAppCompat(valueOf, catchingFishHiltFlux, valueOf2, catchingFishPayPalWidget);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService3);
            }
            CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB = catchingFishSharedFlowMVI.CatchingFishCameraXIntent.CatchingFishSnackbar.CatchingFishParcelableFAB;
            catchingFishSpannableMVIFAB.CatchingFishStripeAPI(CatchingFishDaggerAndroidX.CatchingFishCoroutine);
            CatchingFishLayoutRoom.CatchingFishCustomView(catchingFishSpannableMVIFAB, 0, (CatchingFishJUnitGlide) CatchingFishPayPalService3);
            boolean CatchingFishViewModelScope3 = catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishMVPWidget);
            Object CatchingFishPayPalService4 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope3 || CatchingFishPayPalService4 == obj) {
                CatchingFishPayPalService4 = new CatchingFishOkHttpRedux(6, catchingFishMVPWidget, catchingFishHiltFlux);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService4);
            }
            CatchingFishXMLLayoutGlide.CatchingFishSnackbar(catchingFishHiltFlux, (CatchingFishServiceHandler) CatchingFishPayPalService4, catchingFishSharedFlowMVI);
            WeakHashMap weakHashMap = CatchingFishServiceMockk.CatchingFishDaggerHiltFAB;
            CatchingFishRealmAdMobHilt catchingFishRealmAdMobHilt = CatchingFishExoPlayerMVP.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI).CatchingFishCloudMessaging;
            CatchingFishMVIJobScheduler catchingFishMVIJobScheduler = CatchingFishAndroidXAdMob.CatchingFishParcelableFAB;
            CatchingFishBundleAnimation CatchingFishCoroutine2 = androidx.compose.foundation.layout.CatchingFishViewPagerToast.CatchingFishSnackbar.CatchingFishCoroutine(new CatchingFishStripeAPIFAB(new CatchingFishManifestGraphQL(catchingFishRealmAdMobHilt)));
            CatchingFishReduxAndroidX catchingFishReduxAndroidX = CatchingFishGradleMVVM.CatchingFishDaggerWebsocket;
            Object obj2 = (CatchingFishManifestJUnit) CatchingFishParcelableAdMob.CatchingFishParcelableFAB.get(catchingFishReduxAndroidX);
            if (obj2 == null) {
                obj2 = new CatchingFishJUnitMoshi(catchingFishReduxAndroidX, false);
            }
            int hashCode = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
            CatchingFishBundleAnimation CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishSensorManager(catchingFishSharedFlowMVI, CatchingFishCoroutine2);
            CatchingFishFABMVP.CatchingFishSnackbar.getClass();
            CatchingFishJUnitGlide catchingFishJUnitGlide = CatchingFishWidgetSnackbar.CatchingFishSnackbar;
            catchingFishSharedFlowMVI.CatchingFishAppCompat();
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                catchingFishSharedFlowMVI.CatchingFishFragmentHandler(catchingFishJUnitGlide);
            } else {
                catchingFishSharedFlowMVI.CatchingFishRedux();
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(obj2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishDaggerWebsocket);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishCloudMessaging2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishReduxKtor);
            CatchingFishMockkView catchingFishMockkView = CatchingFishWidgetSnackbar.CatchingFishWorkManager;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), Integer.valueOf(hashCode))) {
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(Integer.valueOf(hashCode));
                catchingFishSharedFlowMVI.CatchingFishSnackbar(Integer.valueOf(hashCode), catchingFishMockkView);
            }
            CatchingFishOkHttpFAB.CatchingFishAppCompat(CatchingFishSensorManager, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishCoroutine);
            CatchingFishCameraXContext CatchingFishDagger = CatchingFishDaggerBiometric.CatchingFishDagger(com.catchingfish.fishcatcherpro.R.drawable.loading, catchingFishSharedFlowMVI);
            androidx.compose.foundation.layout.CatchingFishPagingLibrary catchingFishPagingLibrary = androidx.compose.foundation.layout.CatchingFishPagingLibrary.CatchingFishParcelableFAB;
            CatchingFishXMLLayoutGlide.CatchingFishCoroutine(CatchingFishDagger, catchingFishPagingLibrary.CatchingFishSnackbar(), null, CatchingFishWebsocketJUnit.CatchingFishSnackbar, 0.0f, catchingFishSharedFlowMVI, 24624, 104);
            CatchingFishCameraXContext CatchingFishDagger2 = CatchingFishDaggerBiometric.CatchingFishDagger(com.catchingfish.fishcatcherpro.R.drawable.load2, catchingFishSharedFlowMVI);
            CatchingFishBundleAnimation CatchingFishParcelableFAB2 = catchingFishPagingLibrary.CatchingFishParcelableFAB(androidx.compose.foundation.layout.CatchingFishViewPagerToast.CatchingFishSnackbar(210));
            float floatValue = ((Number) catchingFishHiltFlux.CatchingFishWorkManager.getValue()).floatValue();
            if (floatValue != 0.0f) {
                CatchingFishParcelableFAB2 = androidx.compose.ui.graphics.CatchingFishPagingLibrary.CatchingFishParcelableFAB(CatchingFishParcelableFAB2, floatValue, 524031);
            }
            CatchingFishXMLLayoutGlide.CatchingFishCoroutine(CatchingFishDagger2, CatchingFishParcelableFAB2, null, null, 0.0f, catchingFishSharedFlowMVI, 48, 120);
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(true);
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 != null) {
            CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishRealmCustomView(i);
        }
    }

    public abstract void CatchingFishAppCompat(boolean z);

    public CatchingFishServiceHilt CatchingFishJobScheduler(Context context, Object obj) {
        return null;
    }

    public abstract InputFilter[] CatchingFishMVPRobolectric(InputFilter[] inputFilterArr);

    public abstract void CatchingFishMVVMAppCompat(byte[] bArr, int i, int i2);

    public abstract int CatchingFishMutableLiveData(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract Object CatchingFishPayPalLiveData(Intent intent, int i);

    public abstract int CatchingFishPayPalService();

    public abstract void CatchingFishRecyclerView(boolean z);

    public abstract ViewPropertyAnimator CatchingFishSensorManager(View view, int i);

    public abstract Intent CatchingFishSpannableWidget(Context context, Object obj);
}
