package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowCacheRuntime {
    public static WinterFlowSerializerAgent WinterFlowBandwidthObject;
    public static Boolean WinterFlowHookDataSource;
    public static Context WinterFlowRouterStructure;
    public static final float[][] WinterFlowCacheManagerAgent = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] WinterFlowArrayNetwork = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WinterFlowVariableVersionControl = {95.047f, 100.0f, 108.883f};
    public static final double[][] WinterFlowTransactionManagerStrategy = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] WinterFlowUnitTestResponse = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final WinterFlowUnitTestStructure WinterFlowRouterRouter = new WinterFlowUnitTestStructure(new WinterFlowObjectBackend());
    public static final float[] WinterFlowSyntax = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] WinterFlowResponseEngine = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final WinterFlowProcessorSessionManager WinterFlowTransactionAgent = new WinterFlowProcessorSessionManager(2);
    public static final WinterFlowMicroserviceMechanism WinterFlowServerProtocol = new WinterFlowMicroserviceMechanism(WinterFlowObjectService.WinterFlowTransactionManagerStrategy, 1.0f);
    public static final WinterFlowMicroserviceMechanism WinterFlowThreadListener = new WinterFlowMicroserviceMechanism(WinterFlowObjectService.WinterFlowUnitTestResponse, 1.0f);
    public static final Object WinterFlowServiceUtility = new Object();

    public static final WinterFlowMapperManager WinterFlowArrayHelper(float f) {
        return new WinterFlowFunctionInterface(0.0f, f, 0.0f, f, 5);
    }

    public static final long WinterFlowArrayNetwork(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static Set WinterFlowBackendCacheManager() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final WinterFlowProtocolManager WinterFlowBandwidthObject(Context context) {
        context.getClass();
        WinterFlowProtocolManager winterFlowProtocolManager = new WinterFlowProtocolManager(context);
        WinterFlowProcessorProtocol winterFlowProcessorProtocol = winterFlowProtocolManager.WinterFlowHookDataSource;
        WinterFlowRouterTesting winterFlowRouterTesting = winterFlowProcessorProtocol.WinterFlowVariableBandwidth;
        winterFlowRouterTesting.WinterFlowRouterStructure(new WinterFlowStrategyAgent(winterFlowRouterTesting));
        WinterFlowRouterTesting winterFlowRouterTesting2 = winterFlowProcessorProtocol.WinterFlowVariableBandwidth;
        winterFlowRouterTesting2.WinterFlowRouterStructure(new WinterFlowCacheException());
        winterFlowRouterTesting2.WinterFlowRouterStructure(new WinterFlowJavaSubsystem());
        return winterFlowProtocolManager;
    }

    public static long WinterFlowBatchUI(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    WinterFlowServiceOrchestration.WinterFlowResponseEngine(i6);
                    throw new WinterFlowServerSystem();
                }
                i5 = 8190;
            }
        }
        return WinterFlowServiceOrchestration.WinterFlowRouterStructure(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    public static WinterFlowXMLPlatform WinterFlowCacheManagerAgent() {
        WinterFlowXMLPlatform winterFlowXMLPlatform = new WinterFlowXMLPlatform(true);
        winterFlowXMLPlatform.WinterFlowCloudMicroservice(null);
        return winterFlowXMLPlatform;
    }

    public static final WinterFlowMapperManager WinterFlowCacheManagerListener(WinterFlowControllerScript winterFlowControllerScript) {
        return new WinterFlowDeserializationStack(winterFlowControllerScript);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean WinterFlowCacheTool(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowDeploymentWidget winterFlowDeploymentWidget2, int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        WinterFlowUserManagerController winterFlowUserManagerController;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (winterFlowDeploymentWidget.WinterFlowEncryptionAdapter() != WinterFlowProtocolCache.WinterFlowTransactionManagerStrategy) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used within a parent that has focus.");
            return false;
        }
        WinterFlowDeploymentWidget[] winterFlowDeploymentWidgetArr = new WinterFlowDeploymentWidget[16];
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowUserManagerController2.WinterFlowResponseEngine;
        if (winterFlowUserManagerController3 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController2);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
        }
        int i2 = 0;
        while (true) {
            int i3 = winterFlowJSON.WinterFlowUnitTestResponse;
            winterFlowUserManagerController = null;
            if (i3 == 0) {
                break;
            }
            WinterFlowUserManagerController winterFlowUserManagerController4 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i3 - 1);
            if ((winterFlowUserManagerController4.WinterFlowRouterRouter & 1024) == 0) {
                WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController4);
            } else {
                while (true) {
                    if (winterFlowUserManagerController4 == null) {
                        break;
                    }
                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowJSON winterFlowJSON2 = null;
                        while (winterFlowUserManagerController4 != null) {
                            if (winterFlowUserManagerController4 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = (WinterFlowDeploymentWidget) winterFlowUserManagerController4;
                                int i4 = i2 + 1;
                                if (winterFlowDeploymentWidgetArr.length < i4) {
                                    int length = winterFlowDeploymentWidgetArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(winterFlowDeploymentWidgetArr, 0, r11, 0, length);
                                    winterFlowDeploymentWidgetArr = r11;
                                }
                                winterFlowDeploymentWidgetArr[i2] = winterFlowDeploymentWidget3;
                                i2 = i4;
                            } else if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController4 instanceof WinterFlowTestingEntity)) {
                                int i5 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController5 = ((WinterFlowTestingEntity) winterFlowUserManagerController4).WinterFlowBatchUI; winterFlowUserManagerController5 != null; winterFlowUserManagerController5 = winterFlowUserManagerController5.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            winterFlowUserManagerController4 = winterFlowUserManagerController5;
                                        } else {
                                            if (winterFlowJSON2 == null) {
                                                winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController4 != null) {
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                                winterFlowUserManagerController4 = null;
                                            }
                                            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            winterFlowUserManagerController4 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                        }
                    } else {
                        winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine;
                    }
                }
            }
        }
        Arrays.sort(winterFlowDeploymentWidgetArr, 0, i2, WinterFlowClassSystem.WinterFlowHookDataSource);
        if (i != 1) {
            if (i != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This function should only be used for 1-D focus search");
                return false;
            }
            WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i2);
            int i6 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
            int i7 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        WinterFlowDeploymentWidget winterFlowDeploymentWidget4 = winterFlowDeploymentWidgetArr[i7];
                        if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget4) && WinterFlowUnitTestResponse(winterFlowDeploymentWidget4, winterFlowBandwidthTransaction)) {
                            break;
                        }
                    }
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDeploymentWidgetArr[i7], winterFlowDeploymentWidget2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                }
                WinterFlowUserManagerController winterFlowUserManagerController6 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSyntax;
                WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
                loop5: while (true) {
                    if (WinterFlowSyntaxSubsystem == null) {
                    }
                }
                if (winterFlowUserManagerController != null) {
                }
            }
            return false;
        }
        WinterFlowCacheManagerListener WinterFlowArrayHelper2 = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i2);
        int i8 = WinterFlowArrayHelper2.WinterFlowVariableVersionControl;
        int i9 = WinterFlowArrayHelper2.WinterFlowTransactionManagerStrategy;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    WinterFlowDeploymentWidget winterFlowDeploymentWidget5 = winterFlowDeploymentWidgetArr[i8];
                    if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget5) && WinterFlowSerializerStructure(winterFlowDeploymentWidget5, winterFlowBandwidthTransaction)) {
                        break;
                    }
                }
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDeploymentWidgetArr[i8], winterFlowDeploymentWidget2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure) {
            if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
            }
            WinterFlowUserManagerController winterFlowUserManagerController62 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSyntax;
            WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
            loop5: while (true) {
                if (WinterFlowSyntaxSubsystem == null) {
                    break;
                }
                if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 1024) != 0) {
                    while (winterFlowUserManagerController62 != null) {
                        if ((winterFlowUserManagerController62.WinterFlowUnitTestResponse & 1024) != 0) {
                            WinterFlowUserManagerController winterFlowUserManagerController7 = winterFlowUserManagerController62;
                            WinterFlowJSON winterFlowJSON3 = null;
                            while (winterFlowUserManagerController7 != null) {
                                if (winterFlowUserManagerController7 instanceof WinterFlowDeploymentWidget) {
                                    winterFlowUserManagerController = winterFlowUserManagerController7;
                                    break loop5;
                                }
                                if ((winterFlowUserManagerController7.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController7 instanceof WinterFlowTestingEntity)) {
                                    int i10 = 0;
                                    for (WinterFlowUserManagerController winterFlowUserManagerController8 = ((WinterFlowTestingEntity) winterFlowUserManagerController7).WinterFlowBatchUI; winterFlowUserManagerController8 != null; winterFlowUserManagerController8 = winterFlowUserManagerController8.WinterFlowResponseEngine) {
                                        if ((winterFlowUserManagerController8.WinterFlowUnitTestResponse & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                winterFlowUserManagerController7 = winterFlowUserManagerController8;
                                            } else {
                                                if (winterFlowJSON3 == null) {
                                                    winterFlowJSON3 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowUserManagerController7 != null) {
                                                    winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController7);
                                                    winterFlowUserManagerController7 = null;
                                                }
                                                winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                winterFlowUserManagerController7 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON3);
                            }
                        }
                        winterFlowUserManagerController62 = winterFlowUserManagerController62.WinterFlowSyntax;
                    }
                }
                WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                winterFlowUserManagerController62 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
            }
            if (winterFlowUserManagerController != null) {
                return ((Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(winterFlowDeploymentWidget)).booleanValue();
            }
        }
        return false;
    }

    public static final long WinterFlowCloudMicroservice(WinterFlowObjectSystem winterFlowObjectSystem, boolean z) {
        long WinterFlowArrayNetwork2 = WinterFlowHandlerResolver.WinterFlowArrayNetwork(winterFlowObjectSystem.WinterFlowCacheManagerAgent, winterFlowObjectSystem.WinterFlowUnitTestResponse);
        if (z || !winterFlowObjectSystem.WinterFlowHookDataSource()) {
            return WinterFlowArrayNetwork2;
        }
        return 0L;
    }

    public static ComponentName WinterFlowCompilerDataSource(Context context, Intent intent) {
        synchronized (WinterFlowServiceUtility) {
            try {
                WinterFlowTransactionAgent(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    WinterFlowBandwidthObject.WinterFlowRouterStructure();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean WinterFlowCompilerHandler(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        WinterFlowDeploymentWidget[] winterFlowDeploymentWidgetArr = new WinterFlowDeploymentWidget[16];
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
        if (winterFlowUserManagerController2 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
        }
        int i = 0;
        while (true) {
            int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
            if (i2 == 0) {
                break;
            }
            WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i2 - 1);
            if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) == 0) {
                WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController3);
            } else {
                while (true) {
                    if (winterFlowUserManagerController3 == null) {
                        break;
                    }
                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowJSON winterFlowJSON2 = null;
                        while (winterFlowUserManagerController3 != null) {
                            if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                                int i3 = i + 1;
                                if (winterFlowDeploymentWidgetArr.length < i3) {
                                    int length = winterFlowDeploymentWidgetArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(winterFlowDeploymentWidgetArr, 0, r10, 0, length);
                                    winterFlowDeploymentWidgetArr = r10;
                                }
                                winterFlowDeploymentWidgetArr[i] = winterFlowDeploymentWidget2;
                                i = i3;
                            } else if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                int i4 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                        } else {
                                            if (winterFlowJSON2 == null) {
                                                winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController3 != null) {
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                winterFlowUserManagerController3 = null;
                                            }
                                            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                        }
                    } else {
                        winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                    }
                }
            }
        }
        Arrays.sort(winterFlowDeploymentWidgetArr, 0, i, WinterFlowClassSystem.WinterFlowHookDataSource);
        int i5 = i - 1;
        if (i5 < winterFlowDeploymentWidgetArr.length) {
            while (i5 >= 0) {
                WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = winterFlowDeploymentWidgetArr[i5];
                if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget3) && WinterFlowUnitTestResponse(winterFlowDeploymentWidget3, winterFlowBandwidthTransaction)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static int WinterFlowCompilerVariable(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WinterFlowVariableVersionControl;
        return WinterFlowFrameworkProtocol.WinterFlowRouterStructure(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final void WinterFlowConcurrencyThread(WinterFlowParserUserManager winterFlowParserUserManager, WinterFlowObjectMicroservice winterFlowObjectMicroservice) {
        boolean z;
        WinterFlowJavaLayer WinterFlowTransactionAgent2 = winterFlowParserUserManager.WinterFlowSerializerStructure().WinterFlowTransactionAgent();
        WinterFlowObjectMicroservice winterFlowObjectMicroservice2 = (WinterFlowObjectMicroservice) winterFlowParserUserManager.WinterFlowSerializerStructure().WinterFlowUnitTestResponse;
        WinterFlowProtocolVersion winterFlowProtocolVersion = winterFlowObjectMicroservice.WinterFlowRouterStructure;
        if (winterFlowObjectMicroservice.WinterFlowVariableBandwidth) {
            return;
        }
        winterFlowObjectMicroservice.WinterFlowRouterStructure();
        if (!winterFlowProtocolVersion.WinterFlowUserManagerUserManager()) {
            try {
                winterFlowObjectMicroservice.WinterFlowRouterStructure.WinterFlowUnitTestResponse(winterFlowObjectMicroservice.WinterFlowHookDataSource, winterFlowObjectMicroservice.WinterFlowCacheManagerAgent, winterFlowObjectMicroservice, winterFlowObjectMicroservice.WinterFlowVariableVersionControl);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = false;
        boolean z3 = winterFlowProtocolVersion.WinterFlowSoftwareProtocol() > 0.0f;
        if (z3) {
            WinterFlowTransactionAgent2.WinterFlowServiceUtility();
        }
        Canvas WinterFlowRouterStructure2 = WinterFlowBandwidthListener.WinterFlowRouterStructure(WinterFlowTransactionAgent2);
        boolean isHardwareAccelerated = WinterFlowRouterStructure2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j = winterFlowObjectMicroservice.WinterFlowBatchUI;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long j2 = winterFlowObjectMicroservice.WinterFlowRouterAdapter;
            float f3 = ((int) (j2 >> 32)) + f;
            float f4 = f2 + ((int) (j2 & 4294967295L));
            float WinterFlowHookDataSource2 = winterFlowProtocolVersion.WinterFlowHookDataSource();
            WinterFlowProxyValidator WinterFlowConsumerUserManager = winterFlowProtocolVersion.WinterFlowConsumerUserManager();
            int WinterFlowTestingNode = winterFlowProtocolVersion.WinterFlowTestingNode();
            if (WinterFlowHookDataSource2 < 1.0f || WinterFlowTestingNode != 3 || WinterFlowConsumerUserManager != null || winterFlowProtocolVersion.WinterFlowMapperProtocol() == 1) {
                WinterFlowProtocolPlatform winterFlowProtocolPlatform = winterFlowObjectMicroservice.WinterFlowOrchestrationSubsystem;
                if (winterFlowProtocolPlatform == null) {
                    winterFlowProtocolPlatform = WinterFlowServerManager.WinterFlowUnitTestResponse();
                    winterFlowObjectMicroservice.WinterFlowOrchestrationSubsystem = winterFlowProtocolPlatform;
                }
                winterFlowProtocolPlatform.WinterFlowCacheManagerAgent(WinterFlowHookDataSource2);
                winterFlowProtocolPlatform.WinterFlowArrayNetwork(WinterFlowTestingNode);
                winterFlowProtocolPlatform.WinterFlowTransactionManagerStrategy(WinterFlowConsumerUserManager);
                WinterFlowRouterStructure2.saveLayer(f, f2, f3, f4, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
            } else {
                WinterFlowRouterStructure2.save();
            }
            WinterFlowRouterStructure2.translate(f, f2);
            WinterFlowRouterStructure2.concat(winterFlowProtocolVersion.WinterFlowConfigurationSubsystem());
        }
        boolean z4 = !isHardwareAccelerated && winterFlowObjectMicroservice.WinterFlowMapperProtocol;
        if (z4) {
            WinterFlowTransactionAgent2.WinterFlowTransactionAgent();
            WinterFlowTestingCloud WinterFlowArrayNetwork2 = winterFlowObjectMicroservice.WinterFlowArrayNetwork();
            if (WinterFlowArrayNetwork2 instanceof WinterFlowSchedulerStack) {
                WinterFlowVersionParser winterFlowVersionParser = ((WinterFlowSchedulerStack) WinterFlowArrayNetwork2).WinterFlowThreadListener;
                WinterFlowTransactionAgent2.WinterFlowUnitTestResponse(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork, 1);
            } else if (WinterFlowArrayNetwork2 instanceof WinterFlowSessionCompiler) {
                WinterFlowManagerCloud winterFlowManagerCloud = winterFlowObjectMicroservice.WinterFlowThreadListener;
                if (winterFlowManagerCloud != null) {
                    winterFlowManagerCloud.WinterFlowRouterStructure.rewind();
                } else {
                    winterFlowManagerCloud = WinterFlowProviderAgent.WinterFlowRouterStructure();
                    winterFlowObjectMicroservice.WinterFlowThreadListener = winterFlowManagerCloud;
                }
                WinterFlowManagerCloud.WinterFlowHookDataSource(winterFlowManagerCloud, ((WinterFlowSessionCompiler) WinterFlowArrayNetwork2).WinterFlowThreadListener);
                WinterFlowTransactionAgent2.WinterFlowHookDataSource(winterFlowManagerCloud);
            } else {
                if (!(WinterFlowArrayNetwork2 instanceof WinterFlowServiceProviderJava)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return;
                }
                WinterFlowTransactionAgent2.WinterFlowHookDataSource(((WinterFlowServiceProviderJava) WinterFlowArrayNetwork2).WinterFlowThreadListener);
            }
        }
        if (winterFlowObjectMicroservice2 != null) {
            WinterFlowRepositoryFramework winterFlowRepositoryFramework = winterFlowObjectMicroservice2.WinterFlowSingletonPlatform;
            if (!winterFlowRepositoryFramework.WinterFlowRouterStructure) {
                WinterFlowThreadSessionManager.WinterFlowRouterStructure("Only add dependencies during a tracking");
            }
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) winterFlowRepositoryFramework.WinterFlowArrayNetwork;
            if (winterFlowCacheManagerTransactionManager != null) {
                winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure(winterFlowObjectMicroservice);
            } else if (((WinterFlowObjectMicroservice) winterFlowRepositoryFramework.WinterFlowHookDataSource) != null) {
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = new WinterFlowCacheManagerTransactionManager();
                WinterFlowObjectMicroservice winterFlowObjectMicroservice3 = (WinterFlowObjectMicroservice) winterFlowRepositoryFramework.WinterFlowHookDataSource;
                winterFlowObjectMicroservice3.getClass();
                winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure(winterFlowObjectMicroservice3);
                winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure(winterFlowObjectMicroservice);
                winterFlowRepositoryFramework.WinterFlowArrayNetwork = winterFlowCacheManagerTransactionManager3;
                winterFlowRepositoryFramework.WinterFlowHookDataSource = null;
            } else {
                winterFlowRepositoryFramework.WinterFlowHookDataSource = winterFlowObjectMicroservice;
            }
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager4 = (WinterFlowCacheManagerTransactionManager) winterFlowRepositoryFramework.WinterFlowVariableVersionControl;
            if (winterFlowCacheManagerTransactionManager4 != null) {
                z2 = !winterFlowCacheManagerTransactionManager4.WinterFlowServerProtocol(winterFlowObjectMicroservice);
            } else if (((WinterFlowObjectMicroservice) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent) != winterFlowObjectMicroservice) {
                z2 = true;
            } else {
                winterFlowRepositoryFramework.WinterFlowCacheManagerAgent = null;
            }
            if (z2) {
                winterFlowObjectMicroservice.WinterFlowConcurrencyThread++;
            }
        }
        if (((WinterFlowHookInterface) WinterFlowTransactionAgent2).WinterFlowRouterStructure.isHardwareAccelerated()) {
            z = z3;
            winterFlowProtocolVersion.WinterFlowOrchestrationSubsystem(WinterFlowTransactionAgent2);
        } else {
            WinterFlowCacheThread winterFlowCacheThread = winterFlowObjectMicroservice.WinterFlowBandwidthObject;
            if (winterFlowCacheThread == null) {
                winterFlowCacheThread = new WinterFlowCacheThread();
                winterFlowObjectMicroservice.WinterFlowBandwidthObject = winterFlowCacheThread;
            }
            WinterFlowObjectPackage winterFlowObjectPackage = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
            WinterFlowConcurrencyParser winterFlowConcurrencyParser = winterFlowObjectMicroservice.WinterFlowHookDataSource;
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = winterFlowObjectMicroservice.WinterFlowCacheManagerAgent;
            long WinterFlowUserManagerUserManager = WinterFlowServerManager.WinterFlowUserManagerUserManager(winterFlowObjectMicroservice.WinterFlowRouterAdapter);
            WinterFlowSessionQueue winterFlowSessionQueue = ((WinterFlowCacheThread) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowVariableVersionControl;
            WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = winterFlowSessionQueue.WinterFlowRouterStructure;
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = winterFlowSessionQueue.WinterFlowHookDataSource;
            WinterFlowJavaLayer WinterFlowTransactionAgent3 = winterFlowObjectPackage.WinterFlowTransactionAgent();
            long WinterFlowThreadListener2 = winterFlowObjectPackage.WinterFlowThreadListener();
            z = z3;
            WinterFlowObjectMicroservice winterFlowObjectMicroservice4 = (WinterFlowObjectMicroservice) winterFlowObjectPackage.WinterFlowUnitTestResponse;
            winterFlowObjectPackage.WinterFlowBackendCacheManager(winterFlowConcurrencyParser);
            winterFlowObjectPackage.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration);
            winterFlowObjectPackage.WinterFlowConsumerUserManager(WinterFlowTransactionAgent2);
            winterFlowObjectPackage.WinterFlowArrayHelper(WinterFlowUserManagerUserManager);
            winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowObjectMicroservice;
            WinterFlowTransactionAgent2.WinterFlowTransactionAgent();
            try {
                winterFlowObjectMicroservice.WinterFlowCacheManagerAgent(winterFlowCacheThread);
            } finally {
                WinterFlowTransactionAgent2.WinterFlowResponseEngine();
                winterFlowObjectPackage.WinterFlowBackendCacheManager(winterFlowConcurrencyParser2);
                winterFlowObjectPackage.WinterFlowEventEmitterController(winterFlowCacheManagerConfiguration2);
                winterFlowObjectPackage.WinterFlowConsumerUserManager(WinterFlowTransactionAgent3);
                winterFlowObjectPackage.WinterFlowArrayHelper(WinterFlowThreadListener2);
                winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowObjectMicroservice4;
            }
        }
        if (z4) {
            WinterFlowTransactionAgent2.WinterFlowResponseEngine();
        }
        if (z) {
            WinterFlowTransactionAgent2.WinterFlowServerProtocol();
        }
        if (isHardwareAccelerated) {
            return;
        }
        WinterFlowRouterStructure2.restore();
    }

    public static final WinterFlowMapperManager WinterFlowConfiguration(WinterFlowMapperManager winterFlowMapperManager, float f) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowFunctionInterface(f, f, f, f));
    }

    public static final WinterFlowPipelineObject WinterFlowConfigurationSubsystem(WinterFlowAdapterResponse winterFlowAdapterResponse, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowModuleProxy winterFlowModuleProxy, WinterFlowEventEvent winterFlowEventEvent) {
        WinterFlowEncryptionMicroservice WinterFlowRouterAdapter = WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(winterFlowAdapterResponse.WinterFlowRouterRouter(), winterFlowEncryptionMicroservice, true);
        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
        if (WinterFlowRouterAdapter != winterFlowCacheDecorator && WinterFlowRouterAdapter.WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol) == null) {
            WinterFlowRouterAdapter = WinterFlowRouterAdapter.WinterFlowOrchestrationSubsystem(winterFlowCacheDecorator);
        }
        winterFlowModuleProxy.getClass();
        WinterFlowPipelineObject winterFlowServiceProvider = winterFlowModuleProxy == WinterFlowModuleProxy.WinterFlowTransactionManagerStrategy ? new WinterFlowServiceProvider(WinterFlowRouterAdapter, winterFlowEventEvent) : new WinterFlowPipelineObject(WinterFlowRouterAdapter, true);
        winterFlowServiceProvider.WinterFlowStrategyHook(winterFlowModuleProxy, winterFlowServiceProvider, winterFlowEventEvent);
        return winterFlowServiceProvider;
    }

    public static WinterFlowRuntimeException WinterFlowConsumerUserManager() {
        WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowVariableQuery.WinterFlowRouterStructure;
        winterFlowObjectPackage.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((WinterFlowAlgorithmDebug) winterFlowObjectPackage.WinterFlowRouterRouter)) {
            try {
                WinterFlowRuntimeException winterFlowRuntimeException = (WinterFlowRuntimeException) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                if (winterFlowRuntimeException != null && localeList == ((LocaleList) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy)) {
                    return winterFlowRuntimeException;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new WinterFlowGatewayEngine(localeList.get(i)));
                }
                WinterFlowRuntimeException winterFlowRuntimeException2 = new WinterFlowRuntimeException(arrayList);
                winterFlowObjectPackage.WinterFlowTransactionManagerStrategy = localeList;
                winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowRuntimeException2;
                return winterFlowRuntimeException2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final int WinterFlowEventEmitterController(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final WinterFlowIDEFramework WinterFlowFrameworkTransaction(WinterFlowUserManagerQuery winterFlowUserManagerQuery, WinterFlowEventEmitterFramework winterFlowEventEmitterFramework, WinterFlowLibraryAdapter winterFlowLibraryAdapter, Float f) {
        WinterFlowFrameworkAgent.WinterFlowHookDataSource.getClass();
        WinterFlowResponseNetwork winterFlowResponseNetwork = WinterFlowResponseNetwork.WinterFlowRouterStructure;
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(2, winterFlowUserManagerQuery, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl);
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent2 = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(f);
        WinterFlowConfigurationSubsystem(winterFlowEventEmitterFramework, (WinterFlowEncryptionMicroservice) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse, winterFlowLibraryAdapter.equals(WinterFlowDeserializationEntity.WinterFlowRouterStructure) ? WinterFlowModuleProxy.WinterFlowVariableVersionControl : WinterFlowModuleProxy.WinterFlowRouterRouter, new WinterFlowMiddlewareVariable(winterFlowLibraryAdapter, (WinterFlowEventProvider) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy, WinterFlowCacheManagerAgent2, f, null, 2));
        return new WinterFlowIDEFramework(WinterFlowCacheManagerAgent2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean WinterFlowFrontendBackend(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        WinterFlowDeploymentWidget[] winterFlowDeploymentWidgetArr = new WinterFlowDeploymentWidget[16];
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
        if (winterFlowUserManagerController2 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
        }
        int i = 0;
        while (true) {
            int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
            if (i2 == 0) {
                break;
            }
            WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i2 - 1);
            if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) == 0) {
                WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController3);
            } else {
                while (true) {
                    if (winterFlowUserManagerController3 == null) {
                        break;
                    }
                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowJSON winterFlowJSON2 = null;
                        while (winterFlowUserManagerController3 != null) {
                            if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                                int i3 = i + 1;
                                if (winterFlowDeploymentWidgetArr.length < i3) {
                                    int length = winterFlowDeploymentWidgetArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(winterFlowDeploymentWidgetArr, 0, r10, 0, length);
                                    winterFlowDeploymentWidgetArr = r10;
                                }
                                winterFlowDeploymentWidgetArr[i] = winterFlowDeploymentWidget2;
                                i = i3;
                            } else if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                int i4 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                        } else {
                                            if (winterFlowJSON2 == null) {
                                                winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController3 != null) {
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                winterFlowUserManagerController3 = null;
                                            }
                                            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                        }
                    } else {
                        winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                    }
                }
            }
        }
        Arrays.sort(winterFlowDeploymentWidgetArr, 0, i, WinterFlowClassSystem.WinterFlowHookDataSource);
        for (int i5 = 0; i5 < i; i5++) {
            WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = winterFlowDeploymentWidgetArr[i5];
            if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget3) && WinterFlowSerializerStructure(winterFlowDeploymentWidget3, winterFlowBandwidthTransaction)) {
                return true;
            }
        }
        return false;
    }

    public static final void WinterFlowHookDataSource(WinterFlowObjectSession winterFlowObjectSession, WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowObjectSession winterFlowObjectSession3;
        WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowServiceProviderBatch.WinterFlowBandwidthObject;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-1783766393);
        int i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 4 : 2) | i | 384;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            WinterFlowRouterStructure((i2 & 14) | 27696, winterFlowObjectSession, winterFlowResolverLibrary, winterFlowMapperManager);
            winterFlowObjectSession3 = winterFlowServiceProviderBatch;
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
            winterFlowObjectSession3 = winterFlowObjectSession2;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowFrontend(winterFlowObjectSession, winterFlowMapperManager, winterFlowObjectSession3, i, 1);
        }
    }

    public static WinterFlowVersionBandwidth WinterFlowMapperProtocol(WinterFlowVersionBandwidth winterFlowVersionBandwidth, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowEncryptionServer winterFlowEncryptionServer, WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowDatabaseGateway winterFlowDatabaseGateway) {
        if (winterFlowVersionBandwidth != null && winterFlowCacheManagerConfiguration == winterFlowVersionBandwidth.WinterFlowRouterStructure && WinterFlowFrameworkMechanism.WinterFlowTransactionAgent(winterFlowEncryptionServer, winterFlowCacheManagerConfiguration).equals(winterFlowVersionBandwidth.WinterFlowHookDataSource) && winterFlowConcurrencyParser.WinterFlowHookDataSource() == winterFlowVersionBandwidth.WinterFlowCacheManagerAgent.WinterFlowVariableVersionControl && winterFlowDatabaseGateway == winterFlowVersionBandwidth.WinterFlowArrayNetwork) {
            return winterFlowVersionBandwidth;
        }
        WinterFlowVersionBandwidth winterFlowVersionBandwidth2 = WinterFlowVersionBandwidth.WinterFlowRouterRouter;
        if (winterFlowVersionBandwidth2 != null && winterFlowCacheManagerConfiguration == winterFlowVersionBandwidth2.WinterFlowRouterStructure && WinterFlowFrameworkMechanism.WinterFlowTransactionAgent(winterFlowEncryptionServer, winterFlowCacheManagerConfiguration).equals(winterFlowVersionBandwidth2.WinterFlowHookDataSource) && winterFlowConcurrencyParser.WinterFlowHookDataSource() == winterFlowVersionBandwidth2.WinterFlowCacheManagerAgent.WinterFlowVariableVersionControl && winterFlowDatabaseGateway == winterFlowVersionBandwidth2.WinterFlowArrayNetwork) {
            return winterFlowVersionBandwidth2;
        }
        WinterFlowVersionBandwidth winterFlowVersionBandwidth3 = new WinterFlowVersionBandwidth(winterFlowCacheManagerConfiguration, WinterFlowFrameworkMechanism.WinterFlowTransactionAgent(winterFlowEncryptionServer, winterFlowCacheManagerConfiguration), new WinterFlowResolverNetwork(winterFlowConcurrencyParser.WinterFlowHookDataSource(), winterFlowConcurrencyParser.WinterFlowRouterRouter()), winterFlowDatabaseGateway);
        WinterFlowVersionBandwidth.WinterFlowRouterRouter = winterFlowVersionBandwidth3;
        return winterFlowVersionBandwidth3;
    }

    public static final Object WinterFlowModuleAgent(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Unsafe unsafe;
        long j;
        WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer.getContext();
        WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem = !((Boolean) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(new WinterFlowHandlerTool(9), Boolean.FALSE)).booleanValue() ? context.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice) : WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(context, winterFlowEncryptionMicroservice, false);
        WinterFlowInvokerComponent.WinterFlowRouterAdapter(WinterFlowOrchestrationSubsystem);
        if (WinterFlowOrchestrationSubsystem == context) {
            WinterFlowVersionControlServer winterFlowVersionControlServer = new WinterFlowVersionControlServer(winterFlowTransactionManagerLayer, WinterFlowOrchestrationSubsystem);
            return WinterFlowConfigurationException.WinterFlowRouterRouter(winterFlowVersionControlServer, winterFlowVersionControlServer, winterFlowEventEvent);
        }
        WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowMapperProtocol;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowOrchestrationSubsystem.WinterFlowConsumerUserManager(winterFlowCacheUtility), context.WinterFlowConsumerUserManager(winterFlowCacheUtility))) {
            WinterFlowResolverCloud winterFlowResolverCloud = new WinterFlowResolverCloud(winterFlowTransactionManagerLayer, WinterFlowOrchestrationSubsystem);
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowResolverCloud.WinterFlowUnitTestResponse;
            Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(winterFlowEncryptionMicroservice2, null);
            try {
                return WinterFlowConfigurationException.WinterFlowRouterRouter(winterFlowResolverCloud, winterFlowResolverCloud, winterFlowEventEvent);
            } finally {
                WinterFlowInvokerComponent.WinterFlowCacheTool(winterFlowEncryptionMicroservice2, WinterFlowFrameworkTransaction);
            }
        }
        WinterFlowIDECompiler winterFlowIDECompiler = new WinterFlowIDECompiler(winterFlowTransactionManagerLayer, WinterFlowOrchestrationSubsystem);
        try {
            WinterFlowCloudStack.WinterFlowCompilerHandler(WinterFlowCloudStack.WinterFlowCompilerVariable(WinterFlowCloudStack.WinterFlowServiceUtility(winterFlowIDECompiler, winterFlowIDECompiler, winterFlowEventEvent)), WinterFlowAlgorithmSession.WinterFlowRouterStructure);
            do {
                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                j = WinterFlowIDECompiler.WinterFlowSyntax;
                int intVolatile = unsafe.getIntVolatile(winterFlowIDECompiler, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already suspended");
                        return null;
                    }
                    Object WinterFlowFrontendBackend = WinterFlowHandlerWebsocket.WinterFlowFrontendBackend(winterFlowIDECompiler.WinterFlowTestingNode());
                    if (WinterFlowFrontendBackend instanceof WinterFlowSessionManagerSessionManager) {
                        throw ((WinterFlowSessionManagerSessionManager) WinterFlowFrontendBackend).WinterFlowRouterStructure;
                    }
                    return WinterFlowFrontendBackend;
                }
            } while (!unsafe.compareAndSwapInt(winterFlowIDECompiler, j, 0, 1));
            return WinterFlowListenerJava.WinterFlowVariableVersionControl;
        } catch (Throwable th) {
            winterFlowIDECompiler.WinterFlowSyntax(new WinterFlowDecoratorTool(th));
            throw th;
        }
    }

    public static final WinterFlowMapperManager WinterFlowOrchestrationConfiguration(WinterFlowMapperManager winterFlowMapperManager, float f) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowFunctionInterface(f, 0.0f, f, 0.0f, 10));
    }

    public static int WinterFlowOrchestrationSubsystem(double d) {
        double d2 = d / 100.0d;
        int round = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static float WinterFlowPackageIDE(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void WinterFlowProxyStructure(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final WinterFlowLibraryInterface WinterFlowQueueService(WinterFlowVersionParser winterFlowVersionParser) {
        return new WinterFlowLibraryInterface(Math.round(winterFlowVersionParser.WinterFlowRouterStructure), Math.round(winterFlowVersionParser.WinterFlowHookDataSource), Math.round(winterFlowVersionParser.WinterFlowCacheManagerAgent), Math.round(winterFlowVersionParser.WinterFlowArrayNetwork));
    }

    public static final boolean WinterFlowResolverController(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowDeploymentWidget winterFlowDeploymentWidget2, int i, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        if (WinterFlowCacheTool(winterFlowDeploymentWidget, winterFlowDeploymentWidget2, i, winterFlowBandwidthTransaction)) {
            return true;
        }
        Boolean bool = (Boolean) WinterFlowTestingCloud.WinterFlowPackageIDE(winterFlowDeploymentWidget, i, new WinterFlowController(((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy(), winterFlowDeploymentWidget, winterFlowDeploymentWidget2, i, winterFlowBandwidthTransaction, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean WinterFlowResponseEngine(WinterFlowObjectSystem winterFlowObjectSystem) {
        return winterFlowObjectSystem.WinterFlowRouterRouter && !winterFlowObjectSystem.WinterFlowArrayNetwork;
    }

    public static long WinterFlowRouterAdapter(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    WinterFlowServiceOrchestration.WinterFlowResponseEngine(i6);
                    throw new WinterFlowServerSystem();
                }
                i5 = 8190;
            }
        }
        return WinterFlowServiceOrchestration.WinterFlowRouterStructure(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final boolean WinterFlowRouterRouter(WinterFlowObjectSystem winterFlowObjectSystem) {
        return !winterFlowObjectSystem.WinterFlowRouterRouter && winterFlowObjectSystem.WinterFlowArrayNetwork;
    }

    public static final void WinterFlowRouterStructure(int i, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager) {
        int i2;
        WinterFlowDecoratorVersion winterFlowDecoratorVersion;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration;
        WinterFlowExceptionProxy winterFlowExceptionProxy;
        WinterFlowConfigurationProcess winterFlowConfigurationProcess;
        Object obj = WinterFlowServiceProviderBatch.WinterFlowBandwidthObject;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-180024211);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) ? 16384 : 8192;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 9363) != 9362)) {
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowMapperManager.WinterFlowCacheManagerAgent(WinterFlowVersionControlLibrary.WinterFlowRouterStructure).WinterFlowCacheManagerAgent(WinterFlowPipelineEntity.WinterFlowRouterStructure).WinterFlowCacheManagerAgent(WinterFlowStackParser.WinterFlowRouterStructure).WinterFlowCacheManagerAgent(WinterFlowProcessorRuntime.WinterFlowRouterStructure));
            WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter);
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = (WinterFlowCacheManagerConfiguration) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowServiceUtility);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = (WinterFlowDecoratorVersion) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowAlgorithmDeployment.WinterFlowRouterStructure);
            WinterFlowExceptionProxy winterFlowExceptionProxy2 = (WinterFlowExceptionProxy) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowDatabaseLayer.WinterFlowRouterStructure);
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1314774735);
            int i4 = i3 & 14;
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            Context context = (Context) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowHookDataSource);
            WinterFlowDatabaseSchemaLayer WinterFlowSoftwareProtocol = WinterFlowCloudStack.WinterFlowSoftwareProtocol(winterFlowResolverLibrary);
            WinterFlowEncryptionComponent winterFlowEncryptionComponent = (WinterFlowEncryptionComponent) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowModuleEngine.WinterFlowRouterStructure);
            View view = (View) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowTransactionManagerStrategy);
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(context) | ((((i4 & 14) ^ 6) > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowObjectSession)) || (i4 & 6) == 4) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(WinterFlowSoftwareProtocol) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEncryptionComponent) | winterFlowResolverLibrary.WinterFlowCacheManagerAgent(hashCode2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(view);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                winterFlowCacheManagerConfiguration = winterFlowCacheManagerConfiguration2;
                winterFlowExceptionProxy = winterFlowExceptionProxy2;
                winterFlowConfigurationProcess = WinterFlowTransactionAgent2;
                Object winterFlowObjectDataSource = new WinterFlowObjectDataSource(context, winterFlowObjectSession, WinterFlowSoftwareProtocol, winterFlowEncryptionComponent, hashCode2, view);
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowObjectDataSource);
                WinterFlowSyntaxSubsystem = winterFlowObjectDataSource;
            } else {
                winterFlowExceptionProxy = winterFlowExceptionProxy2;
                winterFlowCacheManagerConfiguration = winterFlowCacheManagerConfiguration2;
                winterFlowConfigurationProcess = WinterFlowTransactionAgent2;
                winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
            }
            WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem;
            winterFlowResolverLibrary.WinterFlowCacheTool(125, 1, null, null);
            winterFlowResolverLibrary.WinterFlowSingletonPlatform = true;
            WinterFlowDecoratorVersion winterFlowDecoratorVersion3 = winterFlowDecoratorVersion;
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowObjectUI);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, winterFlowConfigurationProcess);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowSyntax, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowResponseEngine, winterFlowResolverLibrary, winterFlowConcurrencyParser);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowTransactionAgent, winterFlowResolverLibrary, winterFlowDecoratorVersion3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowServerProtocol, winterFlowResolverLibrary, winterFlowExceptionProxy);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowThreadListener, winterFlowResolverLibrary, winterFlowCacheManagerConfiguration);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowUnitTestResponse, winterFlowResolverLibrary, obj);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowExceptionBackend.WinterFlowRouterRouter, winterFlowResolverLibrary, obj);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowConcurrencyAgent(winterFlowObjectSession, winterFlowMapperManager, i);
        }
    }

    public static final boolean WinterFlowSerializerStructure(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (WinterFlowMapperProtocol != null) {
                    return WinterFlowSerializerStructure(WinterFlowMapperProtocol, winterFlowBandwidthTransaction) || WinterFlowResolverController(winterFlowDeploymentWidget, WinterFlowMapperProtocol, 1, winterFlowBandwidthTransaction);
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure ? ((Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(winterFlowDeploymentWidget)).booleanValue() : WinterFlowFrontendBackend(winterFlowDeploymentWidget, winterFlowBandwidthTransaction);
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return false;
            }
        }
        return WinterFlowFrontendBackend(winterFlowDeploymentWidget, winterFlowBandwidthTransaction);
    }

    public static final void WinterFlowServerProtocol(long j, WinterFlowBackendBatch winterFlowBackendBatch) {
        if (winterFlowBackendBatch == WinterFlowBackendBatch.WinterFlowVariableVersionControl) {
            if (WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j) != Integer.MAX_VALUE) {
                return;
            }
            WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (WinterFlowHandlerConsumer.WinterFlowRouterRouter(j) != Integer.MAX_VALUE) {
                return;
            }
            WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static void WinterFlowServiceUtility(Intent intent) {
        synchronized (WinterFlowServiceUtility) {
            try {
                if (WinterFlowBandwidthObject != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    WinterFlowBandwidthObject.WinterFlowCacheManagerAgent();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final WinterFlowMapperManager WinterFlowSingletonPlatform(float f) {
        return f == 1.0f ? WinterFlowServerProtocol : new WinterFlowMicroserviceMechanism(WinterFlowObjectService.WinterFlowTransactionManagerStrategy, f);
    }

    public static final WinterFlowMapperManager WinterFlowSoftwareEngine(WinterFlowMapperManager winterFlowMapperManager, float f) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowDatabaseRouter(f, f, f, f));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long WinterFlowSoftwareProtocol(String str, int i, int i2) {
        char c;
        int i3;
        long j;
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        long j2;
        char c4;
        int i9;
        int i10;
        int i11;
        long j3 = 4294967295L;
        if (i == i2) {
            return (i << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
        }
        char charAt = str.charAt(i);
        boolean z2 = charAt == '-';
        if (z2) {
            i3 = i + 1;
            if (i3 == i2) {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
            c = str.charAt(i3);
            if (((char) (c - '0')) >= '\n' && c != '.') {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
        } else {
            c = charAt;
            i3 = i;
        }
        int length = str.length();
        int i12 = i3;
        long j4 = 0;
        while (true) {
            if (i12 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i13 = c - '0';
            if (((char) i13) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + i13;
            i12++;
            c = i12 < length ? str.charAt(i12) : (char) 0;
            j3 = j;
        }
        int i14 = i12 - i3;
        char c5 = '0';
        if (i12 == i2 || c != '.') {
            c2 = ' ';
            c3 = 1;
            i4 = i12;
            i5 = i4;
            i6 = 0;
        } else {
            int i15 = i12 + 1;
            c2 = ' ';
            i4 = i15;
            while (true) {
                c3 = 1;
                if (i2 - i4 < 4) {
                    i11 = i15;
                    break;
                }
                i11 = i15;
                long charAt2 = str.charAt(i4) | (str.charAt(i4 + 1) << 16) | (str.charAt(i4 + 2) << 32) | (str.charAt(i4 + 3) << 48);
                long j5 = charAt2 - 13511005043687472L;
                int i16 = (((charAt2 + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i16 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + i16;
                i4 += 4;
                i15 = i11;
            }
            char charAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                c = charAt3;
                while (i4 != i2) {
                    int i17 = c - '0';
                    if (((char) i17) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + i17;
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    c = 0;
                }
                charAt3 = str.charAt(i4);
            }
            i6 = i11 - i4;
            i14 -= i6;
            i5 = i11;
        }
        if (i14 == 0) {
            return (i4 << c2) | (Float.floatToRawIntBits(Float.NaN) & j);
        }
        if ((c | ' ') == 101) {
            i7 = i4 + 1;
            char charAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c6 = charAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || charAt4 == '+') {
                i7 = i4 + 2;
            }
            char charAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i10 = i6;
                    break;
                }
                int i18 = charAt5 - c5;
                i10 = i6;
                if (((char) i18) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i18;
                }
                i7++;
                charAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i10;
                c5 = '0';
            }
            if (c6 != 0) {
                i8 = -i8;
            }
            i6 = i10 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i19 = 19;
        if (i14 > 19) {
            char charAt6 = str.charAt(i3);
            int i20 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i19;
                    break;
                }
                if (charAt6 != '0' && charAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (charAt6 == '0') {
                    i14--;
                }
                i20++;
                charAt6 = i20 < length ? str.charAt(i20) : (char) 0;
                i19 = 19;
            }
            if (i14 > i9) {
                char charAt7 = str.charAt(i3);
                z = z2;
                j2 = 0;
                while (i3 != i12 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                    j2 = (j2 * 10) + (charAt7 - '0');
                    i3++;
                    charAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compareUnsigned(j2, 1000000000000000000L) >= 0) {
                    i6 = (i12 - i3) + i8;
                } else {
                    char charAt8 = str.charAt(i5);
                    int i21 = i5;
                    while (i21 != i4 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                        j2 = (j2 * 10) + (charAt8 - '0');
                        i21++;
                        charAt8 = i21 < length ? str.charAt(i21) : (char) 0;
                    }
                    i6 = (i5 - i21) + i8;
                }
                c4 = c3;
                if (-10 > i6 && i6 < 11 && c4 == 0 && Long.compareUnsigned(j2, 16777216L) <= 0) {
                    float f = j2;
                    float[] fArr = WinterFlowSyntax;
                    float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
                    if (z) {
                        f2 = -f2;
                    }
                    return (i7 << c2) | (Float.floatToRawIntBits(f2) & j);
                }
                if (j2 != 0) {
                    return (i7 << c2) | (Float.floatToRawIntBits(z ? -0.0f : 0.0f) & j);
                }
                if (-126 > i6 || i6 >= 128) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                long j6 = WinterFlowResponseEngine[i6 + 325];
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                long j7 = j2 << numberOfLeadingZeros;
                long j8 = j7 & j;
                long j9 = j7 >>> c2;
                long j10 = j6 & j;
                long j11 = j6 >>> c2;
                long j12 = j9 * j11;
                long j13 = j11 * j8;
                long j14 = j12 + ((((j9 * j10) + ((j8 * j10) >>> c2)) + (j13 & j)) >>> c2) + (j13 >>> c2);
                int i22 = (int) (j14 >>> 63);
                long j15 = j14 >>> (i22 + 9);
                int i23 = numberOfLeadingZeros + (i22 ^ 1);
                long j16 = j14 & 511;
                if (j16 == 511 || (j16 == 0 && (j15 & 3) == 1)) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                long j17 = (j15 + 1) >>> c3;
                if (j17 >= 9007199254740992L) {
                    i23--;
                    j17 = 4503599627370496L;
                }
                long j18 = j17 & (-4503599627370497L);
                long j19 = (((i6 * 217706) >> 16) + 1087) - i23;
                if (j19 < 1 || j19 > 2046) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                return (i7 << c2) | (Float.floatToRawIntBits((float) Double.longBitsToDouble((j19 << 52) | j18 | (z ? Long.MIN_VALUE : 0L))) & j);
            }
        }
        z = z2;
        j2 = j4;
        c4 = 0;
        if (-10 > i6) {
        }
        if (j2 != 0) {
        }
    }

    public static WinterFlowPipelineObject WinterFlowStrategyTool(WinterFlowAdapterResponse winterFlowAdapterResponse, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent, int i) {
        if ((i & 1) != 0) {
            winterFlowEncryptionMicroservice = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        }
        return WinterFlowConfigurationSubsystem(winterFlowAdapterResponse, winterFlowEncryptionMicroservice, (i & 2) != 0 ? WinterFlowModuleProxy.WinterFlowVariableVersionControl : WinterFlowModuleProxy.WinterFlowRouterRouter, winterFlowEventEvent);
    }

    public static final boolean WinterFlowSyntax(WinterFlowObjectSystem winterFlowObjectSystem) {
        return (winterFlowObjectSystem.WinterFlowHookDataSource() || !winterFlowObjectSystem.WinterFlowRouterRouter || winterFlowObjectSystem.WinterFlowArrayNetwork) ? false : true;
    }

    public static final WinterFlowMapperManager WinterFlowSyntaxSubsystem(WinterFlowMapperManager winterFlowMapperManager, float f, float f2) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowDatabaseRouter(f, f2, f, f2));
    }

    public static WinterFlowMapperManager WinterFlowTestingNode(WinterFlowMapperManager winterFlowMapperManager, float f, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return WinterFlowSyntaxSubsystem(winterFlowMapperManager, f, (i & 2) == 0 ? 10.0f : 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void WinterFlowThreadListener(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer, Throwable th) {
        boolean isTerminated;
        if (winterFlowConcurrencyLayer != 0) {
            if (th != null) {
                try {
                    WinterFlowResolverBackend.WinterFlowVariableBandwidth(winterFlowConcurrencyLayer);
                    return;
                } catch (Throwable th2) {
                    WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, th2);
                    return;
                }
            }
            if (winterFlowConcurrencyLayer instanceof AutoCloseable) {
                winterFlowConcurrencyLayer.close();
                return;
            }
            if (!(winterFlowConcurrencyLayer instanceof ExecutorService)) {
                if (winterFlowConcurrencyLayer instanceof TypedArray) {
                    ((TypedArray) winterFlowConcurrencyLayer).recycle();
                    return;
                } else if (winterFlowConcurrencyLayer instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) winterFlowConcurrencyLayer).release();
                    return;
                } else {
                    if (!(winterFlowConcurrencyLayer instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) winterFlowConcurrencyLayer).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) winterFlowConcurrencyLayer;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void WinterFlowTransactionAgent(Context context) {
        if (WinterFlowBandwidthObject == null) {
            WinterFlowSerializerAgent winterFlowSerializerAgent = new WinterFlowSerializerAgent(context);
            WinterFlowBandwidthObject = winterFlowSerializerAgent;
            synchronized (winterFlowSerializerAgent.WinterFlowRouterStructure) {
                winterFlowSerializerAgent.WinterFlowUnitTestResponse = true;
            }
        }
    }

    public static int WinterFlowTransactionManagerStrategy(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d > 8.0d ? d2 * d2 * d2 : d / 903.2962962962963d;
        double d4 = d2 * d2 * d2;
        boolean z = d4 > 0.008856451679035631d;
        double d5 = z ? d4 : d / 903.2962962962963d;
        if (!z) {
            d4 = d / 903.2962962962963d;
        }
        float[] fArr = WinterFlowVariableVersionControl;
        double d6 = d5 * fArr[0];
        double d7 = d3 * fArr[1];
        double d8 = d4 * fArr[2];
        double[][] dArr = WinterFlowUnitTestResponse;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d8) + (dArr2[1] * d7) + (dArr2[0] * d6);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d8) + (dArr3[1] * d7) + (dArr3[0] * d6);
        double[] dArr4 = dArr[2];
        return ((WinterFlowOrchestrationSubsystem(d9) & 255) << 16) | (-16777216) | ((WinterFlowOrchestrationSubsystem(d10) & 255) << 8) | (WinterFlowOrchestrationSubsystem((dArr4[2] * d8) + (dArr4[1] * d7) + (dArr4[0] * d6)) & 255);
    }

    public static final WinterFlowServiceProviderController WinterFlowUIMiddleware(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowServiceProviderController winterFlowServiceProviderController = winterFlowSchedulerStructure.WinterFlowVariableBandwidth;
        if (winterFlowServiceProviderController != null) {
            return winterFlowServiceProviderController;
        }
        throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean WinterFlowUnitTestResponse(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowBandwidthTransaction winterFlowBandwidthTransaction) {
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (WinterFlowMapperProtocol == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = WinterFlowMapperProtocol.WinterFlowEncryptionAdapter().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                                return false;
                            }
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (WinterFlowUnitTestResponse(WinterFlowMapperProtocol, winterFlowBandwidthTransaction) || WinterFlowResolverController(winterFlowDeploymentWidget, WinterFlowMapperProtocol, 2, winterFlowBandwidthTransaction) || (WinterFlowMapperProtocol.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure && ((Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(WinterFlowMapperProtocol)).booleanValue())) {
                        return true;
                    }
                }
                return WinterFlowResolverController(winterFlowDeploymentWidget, WinterFlowMapperProtocol, 2, winterFlowBandwidthTransaction);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return false;
                }
                if (!WinterFlowCompilerHandler(winterFlowDeploymentWidget, winterFlowBandwidthTransaction)) {
                    if (!(winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure ? ((Boolean) winterFlowBandwidthTransaction.WinterFlowUnitTestResponse(winterFlowDeploymentWidget)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return WinterFlowCompilerHandler(winterFlowDeploymentWidget, winterFlowBandwidthTransaction);
    }

    public static final WinterFlowMapperManager WinterFlowUserManagerUserManager(WinterFlowMapperManager winterFlowMapperManager, WinterFlowRefactoringManager winterFlowRefactoringManager) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowModuleProtocol(winterFlowRefactoringManager));
    }

    public static final WinterFlowMapperManager WinterFlowValidatorHandler(WinterFlowMapperManager winterFlowMapperManager) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowFunctionInterface(240.0f, 4.0f, 240.0f, 4.0f));
    }

    public static final int WinterFlowVariableBandwidth(int i, WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, Object obj) {
        int WinterFlowHookDataSource2;
        return (obj == null || winterFlowScriptDatabaseSchema.WinterFlowCacheManagerAgent() == 0 || (i < winterFlowScriptDatabaseSchema.WinterFlowCacheManagerAgent() && obj.equals(winterFlowScriptDatabaseSchema.WinterFlowArrayNetwork(i))) || (WinterFlowHookDataSource2 = winterFlowScriptDatabaseSchema.WinterFlowArrayNetwork.WinterFlowHookDataSource(obj)) == -1) ? i : WinterFlowHookDataSource2;
    }

    public static WinterFlowExceptionXML WinterFlowVariableVersionControl(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new WinterFlowExceptionXML(0.0f, f, 0.0f, f);
    }
}
