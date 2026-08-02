package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.TransactionTooLargeException;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ContentRestrictionsDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.playlist.CoverInfoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.CoverInfo$CoverType;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class ltg implements n6b {
    public static gtg b;
    public static final wn5 c = new wn5(new t83(22), -932580052, false);
    public static final wn5 d = new wn5(new t83(24), 1452759474, false);
    public static final wn5 e = new wn5(new h3(12), 92172714, false);
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final float[] n;
    public static final long[] o;
    public static final o4f p;
    public final /* synthetic */ int a;

    static {
        int i2 = 13;
        f = new wn5(new h3(i2), -25464055, false);
        new wn5(new t83(25), 644388456, false);
        g = new wn5(new h3(14), 1659608988, false);
        h = new wn5(new h3(15), -1464149637, false);
        new wn5(new t83(26), 77149530, false);
        new wn5(new t83(23), 1819848288, false);
        int i3 = 2;
        i = new wn5(new jo5(i3), 1006506577, false);
        new wn5(new io5(7), 1078778564, false);
        j = new wn5(new po5(i2), -1197051097, false);
        k = new wn5(new dp5(16), 2105478022, false);
        l = new wn5(new dp5(17), -1145701305, false);
        m = new wn5(new dp5(18), -101913336, false);
        n = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        o = new long[]{-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
        p = new o4f(i3);
    }

    public /* synthetic */ ltg(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        if (r4.e() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final apv A(hq5 hq5Var) {
        nfq nfqVar;
        ipc ipcVar = ipc.d;
        ipc ipcVar2 = ipc.c;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-2003129230);
        oq5Var.a0(692419572);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        oq5Var.a0(-1153163183);
        oq5Var.j(AndroidCompositionLocals_androidKt.a);
        yqv.a.getClass();
        zqv zqvVar = zqv.b;
        ozm ozmVar = AndroidCompositionLocals_androidKt.b;
        Rect a = zqvVar.b((Context) oq5Var.j(ozmVar)).a.a();
        long p2 = nt0.p(a.width(), a.height());
        oq5Var.p(false);
        long m2 = jx7Var.m(nt0.Q(p2));
        oq5Var.p(false);
        float c2 = fma.c(m2);
        float b2 = fma.b(m2);
        Continuation continuation = null;
        if (c2 < 0.0f) {
            td0.f("Width must be positive, received ", c2);
            return null;
        }
        jrv jrvVar = c2 < 600.0f ? jrv.b : c2 < 840.0f ? jrv.c : jrv.d;
        if (b2 < 0.0f) {
            td0.f("Height must be positive, received ", b2);
            return null;
        }
        grv grvVar = new grv(jrvVar, b2 < 480.0f ? jpv.b : b2 < 900.0f ? jpv.c : jpv.d);
        oq5Var.a0(-883534959);
        Context context = (Context) oq5Var.j(ozmVar);
        oq5Var.a0(793564314);
        boolean f2 = oq5Var.f(context);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            npv.q0.getClass();
            context.getClass();
            bpv bpvVar = (bpv) mpv.b.getValue();
            if (bpvVar == null) {
                pfq pfqVar = pfq.c;
                if (pfq.c == null) {
                    ReentrantLock reentrantLock = pfq.d;
                    reentrantLock.lock();
                    try {
                        if (pfq.c == null) {
                            try {
                                s0u b3 = mfq.b();
                                if (b3 != null) {
                                    s0u s0uVar = s0u.f;
                                    s0uVar.getClass();
                                    Object value = b3.e.getValue();
                                    value.getClass();
                                    Object value2 = s0uVar.e.getValue();
                                    value2.getClass();
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        nfqVar = new nfq(context);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            nfqVar = null;
                            pfq.c = new pfq(nfqVar);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                bpvVar = pfq.c;
                bpvVar.getClass();
            }
            zqv zqvVar2 = zqv.b;
            vtm vtmVar = new vtm(bpvVar);
            mpv.c.getClass();
            ss3 I = zsd.I(new h0t(vtmVar, context, continuation, 25));
            dq7 dq7Var = ca8.a;
            K = new ez(zsd.k0(I, j5h.a), 4);
            oq5Var.k0(K);
        }
        oq5Var.p(false);
        aqi P = szf.P((pjc) K, c5b.a, null, oq5Var, 48, 2);
        oq5Var.p(false);
        List<qsd> list = (List) P.getValue();
        hpc hpcVar = hpc.d;
        jpc jpcVar = jpc.d;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (qsd qsdVar : list) {
            mg3 mg3Var = qsdVar.a;
            ipc ipcVar3 = mg3Var.c - mg3Var.a > mg3Var.d - mg3Var.b ? ipcVar : ipcVar2;
            jpc jpcVar2 = qsdVar.c;
            if (ipcVar3.equals(ipcVar) && jpcVar2.equals(jpcVar)) {
                z = true;
            }
            ynn F = uwf.F(mg3Var.a());
            boolean equals = jpcVar2.equals(jpc.c);
            mg3 mg3Var2 = qsdVar.a;
            boolean equals2 = (mg3Var2.c - mg3Var2.a > mg3Var2.d - mg3Var2.b ? ipcVar : ipcVar2).equals(ipcVar2);
            psd psdVar = qsdVar.b;
            arrayList.add(new eyd(F, equals, equals2, psdVar.equals(psd.d) || (psdVar.equals(psd.c) && jpcVar2.equals(jpcVar)), ((mg3Var.c - mg3Var.a == 0 || mg3Var.d - mg3Var.b == 0) ? hpc.c : hpcVar).equals(hpcVar)));
        }
        apv apvVar = new apv(grvVar, new oim(arrayList, z));
        oq5Var.p(false);
        return apvVar;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean C(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ltg.C(java.lang.String, java.lang.String):boolean");
    }

    public static final wof D(wof wofVar) {
        wof wofVar2;
        wof Q = wofVar.Q();
        while (true) {
            wof wofVar3 = Q;
            wofVar2 = wofVar;
            wofVar = wofVar3;
            if (wofVar == null) {
                break;
            }
            Q = wofVar.Q();
        }
        f8j f8jVar = wofVar2 instanceof f8j ? (f8j) wofVar2 : null;
        if (f8jVar == null) {
            return wofVar2;
        }
        f8j f8jVar2 = f8jVar.n;
        while (true) {
            f8j f8jVar3 = f8jVar2;
            f8j f8jVar4 = f8jVar;
            f8jVar = f8jVar3;
            if (f8jVar == null) {
                return f8jVar4;
            }
            f8jVar2 = f8jVar.n;
        }
    }

    public static final String E(String str) {
        str.getClass();
        String r = c.r(str, "%%", "800x800", false);
        return c.v(r, "https://", false) ? r : "https://".concat(r);
    }

    public static float F(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y0b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final yye G(Certificate certificate, Certificate certificate2) {
        p0c p0cVar;
        certificate2.getClass();
        i0 i0Var = new i0(certificate.getEncoded());
        try {
            da4 t = da4.t(i0Var.z());
            l1c l1cVar = t.b.l;
            if (l1cVar != null) {
                p0cVar = (p0c) l1cVar.a.get(new n0("2.5.29.35"));
            } else {
                p0cVar = null;
            }
            q6w q6wVar = t.b.e;
            PublicKey publicKey = certificate2.getPublicKey();
            publicKey.getClass();
            byte[] encoded = publicKey.getEncoded();
            int length = publicKey.getEncoded().length;
            pn3 pn3Var = pn3.d;
            yye yyeVar = new yye(q6wVar, ovn.L(length, encoded).c("SHA-256").t(), p0cVar, true);
            i0Var.close();
            return yyeVar;
        } finally {
        }
    }

    public static float H(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y0b.c(edgeEffect, f2, f3);
        }
        x0b.a(edgeEffect, f2, f3);
        return f2;
    }

    public static int I(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int J(Object obj) {
        return I(obj == null ? 0 : obj.hashCode());
    }

    public static final u51 K(ArtistDomainItemDto artistDomainItemDto) {
        String name;
        String id = artistDomainItemDto.getId();
        if (id == null || (name = artistDomainItemDto.getName()) == null) {
            return null;
        }
        EntityCoverDto cover = artistDomainItemDto.getCover();
        u9b V = cover != null ? c3x.V(cover) : null;
        ContentRestrictionsDto contentRestrictions = artistDomainItemDto.getContentRestrictions();
        return new u51(id, name, V, null, contentRestrictions != null ? lxe.F(contentRestrictions) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r1 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tn6 L(CoverInfoDto coverInfoDto) {
        CoverInfo$CoverType coverInfo$CoverType;
        CoverPath coverPath;
        tn6 tn6Var = new tn6();
        if (coverInfoDto.getUri() != null) {
            String uri = coverInfoDto.getUri();
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            uri.getClass();
            webPath$Storage.getClass();
            tn6Var.a(t75.c(etn.B(uri, webPath$Storage)));
        }
        List itemsUri = coverInfoDto.getItemsUri();
        if (itemsUri != null && !itemsUri.isEmpty()) {
            List<String> itemsUri2 = coverInfoDto.getItemsUri();
            ArrayList arrayList = new ArrayList(v75.o(itemsUri2, 10));
            for (String str : itemsUri2) {
                if (str != null) {
                    WebPath$Storage webPath$Storage2 = WebPath$Storage.AVATARS;
                    webPath$Storage2.getClass();
                    coverPath = etn.B(str, webPath$Storage2);
                } else {
                    coverPath = null;
                }
                arrayList.add(coverPath);
            }
            tn6Var.a(arrayList);
        }
        String type = coverInfoDto.getType();
        if (type != null) {
            try {
                int length = type.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.e(type.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                String obj = type.subSequence(i2, length + 1).toString();
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                String upperCase = obj.toUpperCase(locale);
                upperCase.getClass();
                coverInfo$CoverType = CoverInfo$CoverType.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                coverInfo$CoverType = CoverInfo$CoverType.UNDEFINED;
            }
        }
        coverInfo$CoverType = CoverInfo$CoverType.UNDEFINED;
        tn6Var.a = coverInfo$CoverType;
        if (coverInfoDto.getCustom() != null) {
            tn6Var.c = coverInfoDto.getCustom().booleanValue();
        }
        return tn6Var;
    }

    public static String M(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String N(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void c(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1499666251);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            int i4 = i3 & 14;
            yci q = a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.i(i4, oq5Var, null, z);
            z2 = z;
            ghh.b(z2, null, null, oq5Var, i4, 6);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z2, yciVar, i2, 0);
        }
    }

    public static final void d(zji zjiVar, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        zjiVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-341646553);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(zjiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci q = a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.h(R.string.listening_history_context_album, 0, 2, oq5Var, null);
            ru ruVar = zjiVar.a;
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new hb(6, function1, zjiVar);
                oq5Var.k0(K);
            }
            ghh.a(ruVar, (Function0) K, null, null, null, null, null, oq5Var, 0, 124);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(zjiVar, function1, yciVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final qo6 qo6Var, final String str, final yci yciVar, jd6 jd6Var, g40 g40Var, Function2 function2, Function2 function22, pyc pycVar, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        final jd6 jd6Var2;
        int i5;
        g40 g40Var2;
        int i6;
        Function2 function23;
        int i7;
        Function2 function24;
        int i8;
        pyc pycVar2;
        final g40 g40Var3;
        qo6 qo6Var2;
        Function2 function25;
        final Function2 function26;
        final Function2 function27;
        final pyc pycVar3;
        xmn r;
        Function2 function28;
        qo6Var.getClass();
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-649572399);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            jd6Var2 = jd6Var;
            i4 |= oq5Var.f(jd6Var2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                g40Var2 = g40Var;
                i4 |= oq5Var.f(g40Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= oq5Var.h(function23) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i2) == 0) {
                        function24 = function22;
                        i4 |= oq5Var.h(function24) ? 1048576 : 524288;
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                        } else if ((12582912 & i2) == 0) {
                            pycVar2 = pycVar;
                            i4 |= oq5Var.h(pycVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                            if ((i4 & 4793491) == 4793490 || !oq5Var.z()) {
                                if (i9 != 0) {
                                    jd6Var2 = hd6.a;
                                }
                                g40Var3 = i5 == 0 ? b2c.f : g40Var2;
                                final Function2 function29 = i6 == 0 ? u2x.a : function23;
                                if (i7 == 0) {
                                    qo6Var2 = qo6Var;
                                    function25 = ild.C(-1881071912, new qp(qo6Var2, 2), oq5Var);
                                } else {
                                    qo6Var2 = qo6Var;
                                    function25 = function24;
                                }
                                final pyc C = i8 == 0 ? ild.C(1058700303, new ar(13, g40Var3, jd6Var2), oq5Var) : pycVar2;
                                if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                                    oq5Var.Z(1712051151);
                                    gce gceVar = gce.d;
                                    Object K = oq5Var.K();
                                    if (K == gq5.a) {
                                        K = new mz2(2);
                                        oq5Var.k0(K);
                                    }
                                    swf.d(qo6Var2, gceVar, androidx.compose.ui.draw.a.c(yciVar, (Function1) K), null, 0L, 0L, false, oq5Var, (i4 & 14) | 48, 120);
                                    oq5Var.p(false);
                                    r = oq5Var.r();
                                    if (r != null) {
                                        final int i10 = 0;
                                        final Function2 function210 = function25;
                                        function28 = new Function2() { // from class: v43
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                switch (i10) {
                                                    case 0:
                                                        ((Integer) obj2).getClass();
                                                        ltg.e(qo6Var, str, yciVar, jd6Var2, g40Var3, function29, function210, C, (hq5) obj, rvf.R(i2 | 1), i3);
                                                        break;
                                                    default:
                                                        ((Integer) obj2).getClass();
                                                        ltg.e(qo6Var, str, yciVar, jd6Var2, g40Var3, function29, function210, C, (hq5) obj, rvf.R(i2 | 1), i3);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        r.d = function28;
                                        return;
                                    }
                                    return;
                                }
                                Function2 function211 = function25;
                                Function2 function212 = function29;
                                jd6 jd6Var3 = jd6Var2;
                                oq5Var.Z(1710509521);
                                oq5Var.p(false);
                                w1g.j(str, null, yciVar, null, null, g40Var3, jd6Var3, 0.0f, null, 0, ild.C(964995249, new xk(14, C, function212, function211), oq5Var), oq5Var, ((i4 >> 3) & 14) | 48 | (i4 & 896) | (458752 & (i4 << 3)) | ((i4 << 9) & 3670016), 920);
                                jd6Var2 = jd6Var3;
                                function26 = function212;
                                function27 = function211;
                                pycVar3 = C;
                            } else {
                                oq5Var.S();
                                g40Var3 = g40Var2;
                                function26 = function23;
                                function27 = function24;
                                pycVar3 = pycVar2;
                            }
                            r = oq5Var.r();
                            if (r != null) {
                                final int i11 = 1;
                                function28 = new Function2() { // from class: v43
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i11) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                ltg.e(qo6Var, str, yciVar, jd6Var2, g40Var3, function26, function27, pycVar3, (hq5) obj, rvf.R(i2 | 1), i3);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                ltg.e(qo6Var, str, yciVar, jd6Var2, g40Var3, function26, function27, pycVar3, (hq5) obj, rvf.R(i2 | 1), i3);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                r.d = function28;
                                return;
                            }
                            return;
                        }
                        pycVar2 = pycVar;
                        if ((i4 & 4793491) == 4793490) {
                        }
                        if (i9 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                        }
                    }
                    function24 = function22;
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    pycVar2 = pycVar;
                    if ((i4 & 4793491) == 4793490) {
                    }
                    if (i9 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    }
                }
                function23 = function2;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                function24 = function22;
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                pycVar2 = pycVar;
                if ((i4 & 4793491) == 4793490) {
                }
                if (i9 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                }
            }
            g40Var2 = g40Var;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            function24 = function22;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            pycVar2 = pycVar;
            if ((i4 & 4793491) == 4793490) {
            }
            if (i9 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            }
        }
        jd6Var2 = jd6Var;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        g40Var2 = g40Var;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        function24 = function22;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        pycVar2 = pycVar;
        if ((i4 & 4793491) == 4793490) {
        }
        if (i9 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
        }
    }

    public static void f(n9b n9bVar, ubb ubbVar, int i2) {
        yci q = a.q(vci.a, 0.0f, 24, 0.0f, 0.0f, 13);
        boolean z = (i2 & 4) == 0;
        n9bVar.getClass();
        ubbVar.getClass();
        q.getClass();
        n9bVar.a.a(new wn5(new xl3(q, ubbVar, z), 569371678, true));
    }

    public static final void g(d53 d53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        int i3;
        int i4;
        oq5 oq5Var2;
        boolean z;
        eqpVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(1635090573);
        int i5 = i2 | (oq5Var3.f(d53Var) ? 4 : 2) | (oq5Var3.f(eqpVar) ? 32 : 16) | (oq5Var3.f(yciVar) ? 256 : 128);
        if (oq5Var3.P(i5 & 1, (i5 & 147) != 146)) {
            yci a = androidx.compose.ui.platform.a.a(a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), "collection_settings_block");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
            int i6 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, wp5.f);
            g0g.U(oq5Var3, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var3, i6, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            a0g.v(0, oq5Var3, null, rvf.M(R.string.setting_collection_title, oq5Var3));
            String M = rvf.M(R.string.import_media_library_description, oq5Var3);
            int i7 = i5 & 112;
            boolean z2 = i7 == 32;
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                i3 = 0;
                i4 = i5;
                ub4 ub4Var = new ub4(0, eqpVar, eqp.class, "onImportMediaLibraryClick", "onImportMediaLibraryClick()V", 0, 18);
                oq5Var3.k0(ub4Var);
                K = ub4Var;
            } else {
                i4 = i5;
                i3 = 0;
            }
            vci vciVar = vci.a;
            a0g.b(M, null, (Function0) ((h9f) K), androidx.compose.ui.platform.a.a(vciVar, "import_media_library_button"), Integer.valueOf(R.drawable.ic_link_default_24), oq5Var3, 3120, 0);
            fk0 N = u1g.N(eqpVar, lsp.i, oq5Var3, ((i4 >> 3) & 14) | 48);
            String M2 = rvf.M(R.string.setting_collection_is_add_tracks_to_start_playlist, oq5Var3);
            boolean z3 = d53Var.a;
            int i8 = i7 != 32 ? i3 : 1;
            Object K2 = oq5Var3.K();
            if (i8 != 0 || K2 == kjnVar) {
                oq5Var2 = oq5Var3;
                z = z3;
                mt4 mt4Var = new mt4(1, eqpVar, eqp.class, "onAddTracksToEndOfPlaylistClick", "onAddTracksToEndOfPlaylistClick(Z)V", 0, 3);
                oq5Var2.k0(mt4Var);
                K2 = mt4Var;
            } else {
                oq5Var2 = oq5Var3;
                z = z3;
            }
            Function1 function1 = (Function1) ((h9f) K2);
            boolean h2 = oq5Var2.h(N);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                K3 = new kw4(N, i3);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            a0g.s(M2, null, z, function1, b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K3), "settings_playlist_edit_switcher"), "playlist_edit_state", Boolean.valueOf(d53Var.a)), oq5Var, 48);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(d53Var, eqpVar, yciVar, i2, 19);
        }
    }

    public static final void h(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1792865444);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            pm0.a(lm0.h, ild.C(1309299429, new u71(yciVar, 14), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(yci yciVar, boolean z, long j2, Function0 function0, Function0 function02, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        long j3;
        int i5;
        Function0 function03;
        wn5 wn5Var2;
        boolean z3;
        long j4;
        long j5;
        Function0 function04;
        oq5 oq5Var;
        long j6;
        Function0 function05;
        int i6;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1926750357);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z2 = z;
            i4 |= oq5Var2.g(z2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j2;
                    if (oq5Var2.e(j3)) {
                        i6 = 256;
                        i4 |= i6;
                    }
                } else {
                    j3 = j2;
                }
                i6 = 128;
                i4 |= i6;
            } else {
                j3 = j2;
            }
            if ((i2 & 3072) == 0) {
                i4 |= oq5Var2.h(function0) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function03 = function02;
                i4 |= oq5Var2.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((196608 & i2) == 0) {
                    wn5Var2 = wn5Var;
                    i4 |= oq5Var2.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                } else {
                    wn5Var2 = wn5Var;
                }
                if ((74899 & i4) == 74898 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i2 & 1) != 0 || oq5Var2.y()) {
                        z3 = i7 != 0 ? true : z2;
                        if ((i3 & 4) != 0) {
                            j4 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                            i4 &= -897;
                        } else {
                            j4 = j3;
                        }
                        if (i5 != 0) {
                            j5 = j4;
                            function04 = null;
                            oq5Var2.q();
                            oq5Var = oq5Var2;
                            sk3.c(z3, ((dq0) oq5Var2.j(eq0.a)).c.c, j5, function0, yciVar, wn5Var2, function04, oq5Var, ((i4 >> 3) & 14) | (i4 & 896) | (i4 & 7168) | ((i4 << 12) & 57344) | (458752 & i4) | ((i4 << 6) & 3670016));
                            j6 = j5;
                            function05 = function04;
                        } else {
                            j5 = j4;
                        }
                    } else {
                        oq5Var2.S();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        z3 = z2;
                        j5 = j3;
                    }
                    function04 = function03;
                    oq5Var2.q();
                    oq5Var = oq5Var2;
                    sk3.c(z3, ((dq0) oq5Var2.j(eq0.a)).c.c, j5, function0, yciVar, wn5Var2, function04, oq5Var, ((i4 >> 3) & 14) | (i4 & 896) | (i4 & 7168) | ((i4 << 12) & 57344) | (458752 & i4) | ((i4 << 6) & 3670016));
                    j6 = j5;
                    function05 = function04;
                } else {
                    oq5Var2.S();
                    oq5Var = oq5Var2;
                    z3 = z2;
                    j6 = j3;
                    function05 = function03;
                }
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new td6(yciVar, z3, j6, function0, function05, wn5Var, i2, i3);
                    return;
                }
                return;
            }
            function03 = function02;
            if ((196608 & i2) == 0) {
            }
            if ((74899 & i4) == 74898) {
            }
            oq5Var2.U();
            if ((i2 & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
        }
        z2 = z;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function03 = function02;
        if ((196608 & i2) == 0) {
        }
        if ((74899 & i4) == 74898) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
    }

    public static final void k(a8a a8aVar, yci yciVar, hq5 hq5Var, int i2) {
        a8aVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1196697984);
        int i3 = (oq5Var.f(a8aVar) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            vci vciVar = vci.a;
            bg3.a(d.d(vciVar, 1.0f), null, false, ild.C(-283535402, new tt5(a8aVar), oq5Var), oq5Var, 3078, 6);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(a8aVar, yciVar, i2, 16);
        }
    }

    public static final void l(ubb ubbVar, boolean z, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1318141240);
        if ((((oq5Var.f(ubbVar) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zj3(4);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            p9b.a(ild.C(1790926379, new wl3(ubbVar, z, 0), oq5Var), nfp.b(vciVar, false, (Function1) K), false, oq5Var, 390, 0);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xl3(ubbVar, z, yciVar, i2);
        }
    }

    public static gtg o(Context context) {
        synchronized (ltg.class) {
            if (context == null) {
                try {
                    context = j3c.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (context == null) {
                return null;
            }
            if (b == null) {
                b = new gtg(context, j3c.c());
            }
            return b;
        }
    }

    public static final String p(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }

    public static final vm0 q(float f2, float f3, osa osaVar, Integer num, hq5 hq5Var, int i2, int i3) {
        Object obj = num;
        if ((i3 & 8) != 0) {
            obj = Unit.a;
        }
        oq5 oq5Var = (oq5) hq5Var;
        boolean f4 = oq5Var.f(obj);
        Object K = oq5Var.K();
        Object obj2 = gq5.a;
        if (f4 || K == obj2) {
            K = vq2.a(f2);
            oq5Var.k0(K);
        }
        fk0 fk0Var = (fk0) K;
        boolean h2 = oq5Var.h(fk0Var) | oq5Var.h(osaVar);
        Object K2 = oq5Var.K();
        if (h2 || K2 == obj2) {
            Object zp5Var = new zp5(fk0Var, f3, osaVar, null, 0);
            oq5Var.k0(zp5Var);
            K2 = zp5Var;
        }
        gld.w(oq5Var, obj, (Function2) K2);
        return fk0Var.c;
    }

    public static final s4f r(eg7 eg7Var) {
        eg7Var.getClass();
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar != null) {
            return s4fVar;
        }
        b6e.w(ern.a(eg7Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final b5f s(l6b l6bVar) {
        l6bVar.getClass();
        b5f b5fVar = l6bVar instanceof b5f ? (b5f) l6bVar : null;
        if (b5fVar != null) {
            return b5fVar;
        }
        b6e.w(ern.a(l6bVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        return null;
    }

    public static final n0s t(l98 l98Var) {
        List h2;
        l98Var.getClass();
        if (l98Var.equals(i98.a)) {
            h2 = c5b.a;
        } else if (l98Var.equals(j98.a)) {
            h2 = u75.h(new x1s(R.string.tracks, -1), new x1s(R.string.artists, -1));
        } else {
            if (!(l98Var instanceof k98)) {
                b6e.s();
                return null;
            }
            k98 k98Var = (k98) l98Var;
            List list = k98Var.b;
            h2 = u75.h(new x1s(R.string.tracks, list != null ? list.size() : 0), new x1s(R.string.artists, k98Var.a.size()));
        }
        return new n0s(h2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(nyf nyfVar, cg6 cg6Var) {
        f fVar;
        int i2;
        nyf nyfVar2;
        xqn xqnVar;
        Throwable th;
        czf czfVar;
        czf czfVar2;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i3 = fVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.m = i3 - Integer.MIN_VALUE;
                Object obj = fVar.l;
                nm6 nm6Var = nm6.a;
                i2 = fVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (nyfVar.b().compareTo(lyf.d) >= 0) {
                        return Unit.a;
                    }
                    xqn xqnVar2 = new xqn();
                    try {
                        fVar.j = nyfVar;
                        fVar.k = xqnVar2;
                        fVar.m = 1;
                        zt3 zt3Var = new zt3(1, qxe.b(fVar));
                        zt3Var.s();
                        g gVar = new g(0, zt3Var);
                        xqnVar2.a = gVar;
                        nyfVar.a(gVar);
                        if (zt3Var.q() == nm6Var) {
                            return nm6Var;
                        }
                        nyfVar2 = nyfVar;
                        xqnVar = xqnVar2;
                    } catch (Throwable th2) {
                        nyfVar2 = nyfVar;
                        xqnVar = xqnVar2;
                        th = th2;
                        czfVar = (czf) xqnVar.a;
                        if (czfVar != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = fVar.k;
                    nyfVar2 = fVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        czfVar = (czf) xqnVar.a;
                        if (czfVar != null) {
                            nyfVar2.d(czfVar);
                        }
                        throw th;
                    }
                }
                czfVar2 = (czf) xqnVar.a;
                if (czfVar2 != null) {
                    nyfVar2.d(czfVar2);
                }
                return Unit.a;
            }
        }
        fVar = new f(cg6Var);
        Object obj2 = fVar.l;
        nm6 nm6Var2 = nm6.a;
        i2 = fVar.m;
        if (i2 != 0) {
        }
        czfVar2 = (czf) xqnVar.a;
        if (czfVar2 != null) {
        }
        return Unit.a;
    }

    public static final ynn v(wof wofVar) {
        wof Q = wofVar.Q();
        return Q != null ? Q.y(wofVar, true) : new ynn(0.0f, 0.0f, (int) (wofVar.j() >> 32), (int) (wofVar.j() & 4294967295L));
    }

    public static final ynn w(wof wofVar) {
        wof D = D(wofVar);
        float j2 = (int) (D.j() >> 32);
        float j3 = (int) (D.j() & 4294967295L);
        ynn y = D.y(wofVar, true);
        float f2 = y.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > j2) {
            f2 = j2;
        }
        float f3 = y.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > j3) {
            f3 = j3;
        }
        float f4 = y.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= j2) {
            j2 = f4;
        }
        float f5 = y.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= j3) {
            j3 = f6;
        }
        if (f2 == j2 || f3 == j3) {
            return ynn.e;
        }
        long A = D.A((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long A2 = D.A((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32));
        long A3 = D.A((Float.floatToRawIntBits(j2) << 32) | (Float.floatToRawIntBits(j3) & 4294967295L));
        long A4 = D.A((Float.floatToRawIntBits(j3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (A >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (A2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (A4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (A3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (A & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (A2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (A4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (A3 & 4294967295L));
        return new ynn(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean x(Throwable th) {
        Throwable cause;
        return (th instanceof TransactionTooLargeException) || ((cause = th.getCause()) != null && x(cause));
    }

    public static final c9c y(c9c c9cVar, boolean z) {
        y8c y8cVar = y8c.d;
        y8c y8cVar2 = y8c.c;
        if (c9cVar == null || c9cVar.equals(y8cVar2) || c9cVar.equals(y8cVar)) {
            return z ? y8cVar : y8cVar2;
        }
        if (c9cVar instanceof a9c) {
            return new a9c(((a9c) c9cVar).c, z);
        }
        if (c9cVar instanceof z8c) {
            return new z8c(z, ((z8c) c9cVar).c);
        }
        xq0.q("Unknown field type");
        return null;
    }

    public static EdgeEffect z(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? y0b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public abstract Object B();

    public String toString() {
        switch (this.a) {
            case 25:
                return B().toString();
            default:
                return super.toString();
        }
    }
}
