package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.ULong;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class PathParserKt {
    public static final float[] PowersOfTen = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] Mantissa64 = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    public static final void createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        List list = vectorGroup.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VectorNode vectorNode = (VectorNode) list.get(i);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.pathData = vectorPath.pathData;
                pathComponent.isPathDirty = true;
                pathComponent.invalidate();
                pathComponent.renderPath.m666setFillTypeoQ8Xj4U(vectorPath.pathFillType);
                pathComponent.invalidate();
                pathComponent.invalidate();
                pathComponent.fill = vectorPath.fill;
                pathComponent.invalidate();
                pathComponent.fillAlpha = vectorPath.fillAlpha;
                pathComponent.invalidate();
                pathComponent.stroke = vectorPath.stroke;
                pathComponent.invalidate();
                pathComponent.strokeAlpha = vectorPath.strokeAlpha;
                pathComponent.invalidate();
                pathComponent.strokeLineWidth = vectorPath.strokeLineWidth;
                pathComponent.isStrokeDirty = true;
                pathComponent.invalidate();
                pathComponent.strokeLineCap = vectorPath.strokeLineCap;
                pathComponent.isStrokeDirty = true;
                pathComponent.invalidate();
                pathComponent.strokeLineJoin = vectorPath.strokeLineJoin;
                pathComponent.isStrokeDirty = true;
                pathComponent.invalidate();
                pathComponent.strokeLineMiter = vectorPath.strokeLineMiter;
                pathComponent.isStrokeDirty = true;
                pathComponent.invalidate();
                pathComponent.trimPathStart = vectorPath.trimPathStart;
                pathComponent.isTrimPathDirty = true;
                pathComponent.invalidate();
                pathComponent.trimPathEnd = vectorPath.trimPathEnd;
                pathComponent.isTrimPathDirty = true;
                pathComponent.invalidate();
                pathComponent.trimPathOffset = vectorPath.trimPathOffset;
                pathComponent.isTrimPathDirty = true;
                pathComponent.invalidate();
                groupComponent.insertAt(i, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.name = vectorGroup2.name;
                groupComponent2.invalidate();
                groupComponent2.rotation = vectorGroup2.rotation;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.scaleX = vectorGroup2.scaleX;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.scaleY = vectorGroup2.scaleY;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.translationX = vectorGroup2.translationX;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.translationY = vectorGroup2.translationY;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.pivotX = vectorGroup2.pivotX;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.pivotY = vectorGroup2.pivotY;
                groupComponent2.isMatrixDirty = true;
                groupComponent2.invalidate();
                groupComponent2.clipPathData = vectorGroup2.clipPathData;
                groupComponent2.isClipPathDirty = true;
                groupComponent2.invalidate();
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i, groupComponent2);
            }
        }
    }

    public static final void drawArc(AndroidPath androidPath, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            drawArc(androidPath, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            androidPath.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            sin2 = sin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long nextFloat(int i, int i2, String str) {
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
        long j3 = BodyPartID.bodyIdMax;
        if (i == i2) {
            return (i << 32) | (Float.floatToRawIntBits(Float.NaN) & BodyPartID.bodyIdMax);
        }
        char charAt = str.charAt(i);
        boolean z2 = charAt == '-';
        if (z2) {
            i3 = i + 1;
            if (i3 == i2) {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & BodyPartID.bodyIdMax);
            }
            c = str.charAt(i3);
            if (((char) (c - '0')) >= '\n' && c != '.') {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & BodyPartID.bodyIdMax);
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
                while (i3 != i12) {
                    ULong.Companion companion = ULong.Companion;
                    if (Long.compareUnsigned(j2, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j2 = (j2 * 10) + (charAt7 - '0');
                    i3++;
                    charAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                ULong.Companion companion2 = ULong.Companion;
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
                if (-10 <= i6 && i6 < 11 && c4 == 0) {
                    ULong.Companion companion3 = ULong.Companion;
                    if (Long.compareUnsigned(j2, 16777216L) <= 0) {
                        float f = j2;
                        float[] fArr = PowersOfTen;
                        float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
                        if (z) {
                            f2 = -f2;
                        }
                        return (i7 << c2) | (Float.floatToRawIntBits(f2) & j);
                    }
                }
                if (j2 != 0) {
                    return (i7 << c2) | (Float.floatToRawIntBits(z ? -0.0f : RecyclerView.DECELERATION_RATE) & j);
                }
                if (-126 > i6 || i6 >= 128) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                long j6 = Mantissa64[i6 + EnumC0170g.SDK_ASSET_ICON_REPORT_VALUE];
                ULong.Companion companion4 = ULong.Companion;
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
                if (j16 == 511 || (j16 == 0 && (3 & j15) == 1)) {
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
        if (-10 <= i6) {
            ULong.Companion companion32 = ULong.Companion;
            if (Long.compareUnsigned(j2, 16777216L) <= 0) {
            }
        }
        if (j2 != 0) {
        }
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        float f = imageVector.genId;
        boolean changed = gapComposer.changed((Float.floatToRawIntBits(density.getDensity()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.root);
            float f2 = imageVector.defaultWidth;
            float f3 = imageVector.defaultHeight;
            long floatToRawIntBits = (Float.floatToRawIntBits(density.mo236toPx0680j_4(f2)) << 32) | (Float.floatToRawIntBits(density.mo236toPx0680j_4(f3)) & BodyPartID.bodyIdMax);
            float f4 = imageVector.viewportWidth;
            float f5 = imageVector.viewportHeight;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(f5));
            VectorPainter vectorPainter = new VectorPainter(groupComponent);
            String str = imageVector.name;
            long j = imageVector.tintColor;
            int i = imageVector.tintBlendMode;
            BlendModeColorFilter blendModeColorFilter = j != 16 ? new BlendModeColorFilter(j, i, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(i))) : null;
            boolean z = imageVector.autoMirror;
            vectorPainter.size$delegate.setValue(new Size(floatToRawIntBits));
            vectorPainter.autoMirror$delegate.setValue(Boolean.valueOf(z));
            VectorComponent vectorComponent = vectorPainter.vector;
            vectorComponent.intrinsicColorFilter$delegate.setValue(blendModeColorFilter);
            vectorComponent.viewportSize$delegate.setValue(new Size(floatToRawIntBits2));
            vectorComponent.name = str;
            gapComposer.updateRememberedValue(vectorPainter);
            rememberedValue = vectorPainter;
        }
        return (VectorPainter) rememberedValue;
    }

    public static final AndroidPath toPath(List list, AndroidPath androidPath) {
        Path path;
        int i;
        int i2;
        float f;
        PathNode pathNode;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        AndroidPath androidPath2 = androidPath;
        Path path2 = androidPath2.internalPath;
        Path path3 = androidPath2.internalPath;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        androidPath2.rewind();
        androidPath2.m666setFillTypeoQ8Xj4U(i3);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : (PathNode) list2.get(0);
        int size = list2.size();
        float f10 = RecyclerView.DECELERATION_RATE;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            PathNode pathNode3 = (PathNode) list2.get(i4);
            if (pathNode3 instanceof PathNode.Close) {
                androidPath2.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i4;
                pathNode = pathNode3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    float f17 = relativeMoveTo.dx;
                    f11 += f17;
                    float f18 = relativeMoveTo.dy;
                    f12 += f18;
                    path3.rMoveTo(f17, f18);
                    f15 = f11;
                    f16 = f12;
                } else if (pathNode3 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                    f11 = moveTo.x;
                    float f19 = moveTo.y;
                    androidPath2.moveTo(f11, f19);
                    f12 = f19;
                    f16 = f12;
                    f15 = f11;
                } else if (pathNode3 instanceof PathNode.RelativeLineTo) {
                    PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                    float f20 = relativeLineTo.dy;
                    float f21 = relativeLineTo.dx;
                    path3.rLineTo(f21, f20);
                    f11 += f21;
                    f12 += f20;
                } else if (pathNode3 instanceof PathNode.LineTo) {
                    PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                    float f22 = lineTo.y;
                    float f23 = lineTo.x;
                    androidPath2.lineTo(f23, f22);
                    f12 = f22;
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i4;
                    pathNode = pathNode3;
                    f11 = f23;
                } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                    float f24 = ((PathNode.RelativeHorizontalTo) pathNode3).dx;
                    path3.rLineTo(f24, f10);
                    f11 += f24;
                } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                    float f25 = ((PathNode.HorizontalTo) pathNode3).x;
                    androidPath2.lineTo(f25, f12);
                    f11 = f25;
                } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                    float f26 = ((PathNode.RelativeVerticalTo) pathNode3).dy;
                    path3.rLineTo(f10, f26);
                    f12 += f26;
                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                    float f27 = ((PathNode.VerticalTo) pathNode3).y;
                    androidPath2.lineTo(f11, f27);
                    f12 = f27;
                } else {
                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                        androidPath2.internalPath.rCubicTo(relativeCurveTo.dx1, relativeCurveTo.dy1, relativeCurveTo.dx2, relativeCurveTo.dy2, relativeCurveTo.dx3, relativeCurveTo.dy3);
                        f13 = relativeCurveTo.dx2 + f11;
                        f14 = relativeCurveTo.dy2 + f12;
                        f11 += relativeCurveTo.dx3;
                        f9 = relativeCurveTo.dy3;
                    } else if (pathNode3 instanceof PathNode.CurveTo) {
                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                        androidPath2.cubicTo(curveTo.x1, curveTo.y1, curveTo.x2, curveTo.y2, curveTo.x3, curveTo.y3);
                        float f28 = curveTo.x2;
                        f14 = curveTo.y2;
                        f11 = curveTo.x3;
                        f12 = curveTo.y3;
                        path = path3;
                        i = size;
                        i2 = i4;
                        pathNode = pathNode3;
                        f = RecyclerView.DECELERATION_RATE;
                        f13 = f28;
                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                        if (pathNode2.isCurve) {
                            f7 = f11 - f13;
                            f8 = f12 - f14;
                        } else {
                            f7 = RecyclerView.DECELERATION_RATE;
                            f8 = RecyclerView.DECELERATION_RATE;
                        }
                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                        androidPath2.internalPath.rCubicTo(f7, f8, relativeReflectiveCurveTo.dx1, relativeReflectiveCurveTo.dy1, relativeReflectiveCurveTo.dx2, relativeReflectiveCurveTo.dy2);
                        f13 = relativeReflectiveCurveTo.dx1 + f11;
                        f14 = relativeReflectiveCurveTo.dy1 + f12;
                        f11 += relativeReflectiveCurveTo.dx2;
                        f9 = relativeReflectiveCurveTo.dy2;
                    } else {
                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                            if (pathNode2.isCurve) {
                                f11 = (f11 * 2.0f) - f13;
                                f12 = (2.0f * f12) - f14;
                            }
                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                            androidPath2.cubicTo(f11, f12, reflectiveCurveTo.x1, reflectiveCurveTo.y1, reflectiveCurveTo.x2, reflectiveCurveTo.y2);
                            f5 = reflectiveCurveTo.x1;
                            f6 = reflectiveCurveTo.y1;
                            f11 = reflectiveCurveTo.x2;
                            f12 = reflectiveCurveTo.y2;
                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                            float f29 = relativeQuadTo.dy2;
                            float f30 = relativeQuadTo.dx2;
                            float f31 = relativeQuadTo.dy1;
                            float f32 = relativeQuadTo.dx1;
                            path3.rQuadTo(f32, f31, f30, f29);
                            float f33 = f32 + f11;
                            f14 = f31 + f12;
                            f11 += f30;
                            f12 += f29;
                            f13 = f33;
                            path = path3;
                            i = size;
                            i2 = i4;
                            pathNode = pathNode3;
                            f = RecyclerView.DECELERATION_RATE;
                        } else {
                            if (pathNode3 instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                f2 = quadTo.y2;
                                f11 = quadTo.x2;
                                float f34 = quadTo.y1;
                                float f35 = quadTo.x1;
                                path3.quadTo(f35, f34, f11, f2);
                                f13 = f35;
                                f14 = f34;
                                path = path3;
                                i = size;
                                i2 = i4;
                                pathNode = pathNode3;
                                f = RecyclerView.DECELERATION_RATE;
                            } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode2.isQuad) {
                                    f3 = f11 - f13;
                                    f4 = f12 - f14;
                                } else {
                                    f3 = RecyclerView.DECELERATION_RATE;
                                    f4 = RecyclerView.DECELERATION_RATE;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                float f36 = relativeReflectiveQuadTo.dy;
                                float f37 = relativeReflectiveQuadTo.dx;
                                path3.rQuadTo(f3, f4, f37, f36);
                                f5 = f3 + f11;
                                f6 = f4 + f12;
                                f11 += f37;
                                f12 += f36;
                            } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                if (pathNode2.isQuad) {
                                    f11 = (f11 * 2.0f) - f13;
                                    f12 = (2.0f * f12) - f14;
                                }
                                PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                f2 = reflectiveQuadTo.y;
                                float f38 = reflectiveQuadTo.x;
                                path3.quadTo(f11, f12, f38, f2);
                                f13 = f11;
                                f14 = f12;
                                path = path3;
                                i = size;
                                i2 = i4;
                                pathNode = pathNode3;
                                f = RecyclerView.DECELERATION_RATE;
                                f11 = f38;
                            } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                float f39 = relativeArcTo.arcStartDx + f11;
                                float f40 = relativeArcTo.arcStartDy + f12;
                                double d = relativeArcTo.horizontalEllipseRadius;
                                double d2 = relativeArcTo.verticalEllipseRadius;
                                double d3 = relativeArcTo.theta;
                                boolean z = relativeArcTo.isMoreThanHalf;
                                boolean z2 = relativeArcTo.isPositiveArc;
                                f = RecyclerView.DECELERATION_RATE;
                                i2 = i4;
                                i = size;
                                path = path3;
                                drawArc(androidPath, f11, f12, f39, f40, d, d2, d3, z, z2);
                                f11 = f39;
                                f13 = f11;
                                f12 = f40;
                                f14 = f12;
                                pathNode = pathNode3;
                            } else {
                                path = path3;
                                i = size;
                                i2 = i4;
                                f = RecyclerView.DECELERATION_RATE;
                                if (!(pathNode3 instanceof PathNode.ArcTo)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode3;
                                float f41 = arcTo.arcStartY;
                                float f42 = arcTo.arcStartX;
                                pathNode = pathNode3;
                                drawArc(androidPath, f11, f12, f42, f41, arcTo.horizontalEllipseRadius, arcTo.verticalEllipseRadius, arcTo.theta, arcTo.isMoreThanHalf, arcTo.isPositiveArc);
                                f12 = f41;
                                f14 = f12;
                                f11 = f42;
                                f13 = f11;
                            }
                            f12 = f2;
                        }
                        f13 = f5;
                        f14 = f6;
                        path = path3;
                        i = size;
                        i2 = i4;
                        pathNode = pathNode3;
                        f = RecyclerView.DECELERATION_RATE;
                    }
                    f12 += f9;
                    path = path3;
                    i = size;
                    i2 = i4;
                    pathNode = pathNode3;
                    f = RecyclerView.DECELERATION_RATE;
                }
                path = path3;
                i = size;
                f = f10;
                i2 = i4;
                pathNode = pathNode3;
            }
            i4 = i2 + 1;
            list2 = list;
            androidPath2 = androidPath;
            size = i;
            path3 = path;
            pathNode2 = pathNode;
            f10 = f;
        }
        return androidPath;
    }
}
